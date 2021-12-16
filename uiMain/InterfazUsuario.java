package uiMain;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import java.lang.*;

import gestorAplicacion.pjs.Clase;
import gestorAplicacion.pjs.Player;
import gestorAplicacion.Loadout.Arma;
import gestorAplicacion.Loadout.Armadura;
import gestorAplicacion.Loadout.Inventario;
import gestorAplicacion.Loadout.Pocion;
import gestorAplicacion.Loadout.Tienda;





public class InterfazUsuario {
	public static List<Escena> allEscenas = new ArrayList<Escena>();
	public static class Escena{
		public int idEscena;
		public String[] narracion;
		public String narrativa;
		public Object[] opciones;
		public boolean hayCombate = false;
		public boolean escenaFinal = false;
		public String enemigo;
		
	}
	
	public static void inicio() {
	gestorAplicacion.pjs.Player.player.arquetipo();
	
	System.err.println("   ___|         |         |                                                   |              \\  |               |            \r\n"
			+ "  |       _` |  |   _` |  __ \\    _ \\ _  /   _ \\    __|       _ \\  __ \\       |   _` |        \\ |   _` |   __|  __ \\    _ \\  \r\n"
			+ "  |      (   |  |  (   |  |   |  (   |  /   (   | \\__ \\       __/  |   |      |  (   |      |\\  |  (   |  (     | | |  (   | \r\n"
			+ " \\____| \\__,_| _| \\__,_| _.__/  \\___/ ___| \\___/  ____/     \\___| _|  _|     _| \\__,_|     _| \\_| \\__,_| \\___| _| |_| \\___/\n");
	System.err.println("                                                        Creado por John Mesa, Eider Pena, Santiago Rivera, Brayan Caballero\n");
	
	String[] tutorial = new String[] {"\u250C\u2500\u2500\u2500 ¿CÓMO JUGAR? \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510",
	"\u2502 Este relato contiene muchas elecciones: las hay sencillas, sensatas, temerarias... e incluso muy peligrosas.               \u2502\n"+ 
	"\u2502 Estas elecciones las encontrarás siempre al final de cada narración.                                                       \u2502\n"+
	"\u2502 Decide entre uno u otro camino escribiendo '1' o '2', según corresponda y presionando a continuación la tecla 'Enter'.     \u2502\n"+
	"\u2502 Puedes realizar otras acciones usando comandos especiales. Puedes ver una lista de comandos escribiendo: help              \u2502",
	"\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518"
	};
	
	
	for (String s: tutorial){
		System.out.println(s);
	}
	


	String swordArt = "                                            /\\ \r\n"+
	"                                /vvvvvvvvvvvv \\--------------------------------------,\r\n"+
	"                                `^^^^^^^^^^^^ /=====================================\"\r\n"+
	"                                	    \\/";
	
	Scanner teclado = new Scanner(System.in);
	boolean salirMenu = false;
	
	do{
		System.out.println(swordArt);
		System.out.println("                                                   1 - Nuevo juego");
		System.out.println("                                                   2 - Cargar juego");
		System.out.println("                                                   3 - Comandos");
		System.out.println("                                                   4 - Salir");
		System.out.print(">> ");	
				
                try {
                    switch(teclado.nextInt()){
                                case 1: gestorAplicacion.mecanicas.Narrador.crearNuevo();salirMenu=true;break;                    
				case 2: gestorAplicacion.mecanicas.Narrador.cargarJuego();salirMenu=true;break;
				case 3: comandoHelp();salirMenu=false;break;
				case 4: comandoExit();System.exit(0);
				default:System.err.println("\uD83D\uDFE6 Elige una opción válida");
			}		
		}catch(InputMismatchException e){
			System.err.println("\uD83D\uDFE6 Elige una opción válida");
			teclado.next();
		}
	}
	while (!salirMenu);	
        
}       
        
        public static void menuCrear(){
            Scanner teclado = new Scanner(System.in);
            boolean salirMenu = false;
	
                do{
		
                    System.out.println("                                                   1 - Crear Personaje");
                    System.out.println("                                                   2 - Partida rapida");
                    System.out.println("                                                   3 - Atras");
                    System.out.print(">> ");	