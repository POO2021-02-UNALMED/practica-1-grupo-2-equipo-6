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
try {
                        switch(teclado.nextInt()){
                            case 1:  uiMain.InterfazUsuario.crearJugador();salirMenu=true;break;
                            case 2:  gestorAplicacion.mecanicas.Narrador.iniciarNuevo();salirMenu=true;break; 
                            case 3:  uiMain.InterfazUsuario.inicio(); salirMenu=true;break;
                        }
                    }catch(InputMismatchException e){
			System.err.println("\uD83D\uDFE6 Elige una opción válida");
			teclado.next();
                    }
                }
                while (!salirMenu);
        }
        
        public static void crearJugador(){
            Scanner dato = new Scanner(System.in);
            System.out.println("          Nombre del personaje: ");
            System.out.print(">> ");	
            String nombre = dato.next();
            System.out.println("          Edad del personaje: ");
            System.out.print(">> ");	
            int edad = dato.nextInt();
            System.out.println("          Elige tu clase: ");            
            System.out.println("          1 - Guerrero");
            System.out.println("          2 - Arquero");
            System.out.println("          3 - Mago");
            System.out.print(">> ");	
            int clase = dato.nextInt();
            
            switch(clase){
                case 1: gestorAplicacion.pjs.Player.player = new Player(nombre, edad);
                    System.out.println("Bienvenido " + nombre);
					Player.clase = gestorAplicacion.pjs.Clase.GUERRERO;
                uiMain.InterfazUsuario.hojaPJ();
                try{
                Thread.sleep(5*1000);
                } catch(Exception e){
                    
                }
                gestorAplicacion.mecanicas.Narrador.iniciarNuevo();
                
                break;
                
                case 2: gestorAplicacion.pjs.Player.player = new Player(nombre, edad);
                    System.out.println("Bienvenido " + nombre);
					Player.clase = gestorAplicacion.pjs.Clase.ARQUERO;
                uiMain.InterfazUsuario.hojaPJ();    
                try{
                Thread.sleep(5*1000);
                } catch(Exception e){
                    
                }break;
                
                case 3: gestorAplicacion.pjs.Player.player = new Player(nombre, edad);
                    System.out.println("Bienvenido " + nombre);
					Player.clase = gestorAplicacion.pjs.Clase.MAGO;
                uiMain.InterfazUsuario.hojaPJ();    
                try{
                Thread.sleep(5*1000);
                } catch(Exception e){
                    
                }
                gestorAplicacion.mecanicas.Narrador.iniciarNuevo();
                
                break;
            }
            
            
        }
	
	public static void escenario(){

		
		
		Escena escena0 = new Escena();
		escena0.hayCombate = false;
		escena0.idEscena = 0;
		
		escena0.narrativa = ""+
		"\n \uD83D\uDF82 \uD83D\uDF82 \uD83D\uDF82 Capítulo 1 - Oculto tras las sombras"+"\n\nLa zozobra se había instalado en los habitantes del lejano poblado de Campoverde. Atrás habían quedado los días donde los párvulos retoños de Campoverde\n"+
		"jugaban a las escondidillas en los frondosos bosques limítrofes. Una invisible amenaza se arrastraba por la región, las desapariciones y asesinatos cada\n"+
		"vez eran más frecuentes y el alcalde Dientemayor había reunido cuadrillas de exploración para contrarrestar la amenaza oculta tras las sombras.\n\n"+
		"Has decidido no quedarte de brazos cruzados, pues al no haber cumplido aún la mayoría de edad, los adultos del lugar decidieron que no podrías ser parte\n"+
		"de la delegación. Has tomado prestada la espada corta y el pequeño escudo de tu abuelo Timun Haldegarth, el otrora gran guerrero del reino de Erzia.\n\n"+
		"Has esperado el anochecer para ir más allá de la amurallada aldea y ahora un cielo estrellado ilumina tenuemente tu trayecto hacia los bosques de Campoverde.\n"+ 
		"Conoces cada rincón del bosque, pues han sido incontables las idas y venidas a través de él, te es fácil reconocer un casi desapercibido camino que se proyecta\n"+
		"a un costado del camino principal, lo recorres hasta llegar al pie de una colina. Un montón de piedras se apilan en frente tuyo.\n";
		escena0.opciones = new Object[] {"Echar un vistazo al cúmulo de piedras", 1, "Rodear la colina", 2}; // El atributo impar es la narrativa de la opci�n y el que le precede es el apuntador (id de la escena correspondiente)
		allEscenas.add(escena0);
				
		Escena escena1 = new Escena();
		escena1.hayCombate = false;
		escena1.idEscena = 1;
		escena1.narrativa = "El cúmulo de rocas no parece ser una formación natural. Un olor a sopa nauseabunda y leños quemándose parece proceder de alguna caverna oculta tras\n"+
		"las piedras.";
		escena1.opciones = new Object[] {"Echar un vistazo a través de los agujeros entre las rocas", 3, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena1);

		
		Escena escena2 = new Escena();
		escena2.hayCombate = true;
		escena2.enemigo = "goblin";
		escena2.idEscena = 2;
		escena2.narrativa = "Luego de luchar contra aquella alimaña, retornas al cúmulo de piedras y decides que es mejor echar un vistazo, seguramente ese goblin tiene relación\n"+
		"con aquella misteriosa pila.\n\n El cúmulo de rocas no parece ser una formación natural. Un olor a sopa nauseabunda y leños quemándose parece proceder de alguna\n"+
		"caverna oculta tras las piedras.";
		escena2.opciones = new Object[] {"Echar un vistazo a través de los agujeros entre las rocas", 3, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena2);
		
		Escena escena3 = new Escena();
		escena3.hayCombate = false;
		escena3.idEscena = 3;
		escena3.narrativa = "Ves a un goblin haciendo guardia, aunque parece estar próximo a quedarse dormido el diligente esbirro. En ese preciso momento llega\n"+
		"un segundo guardia, mucho más fornido que el anterior y en aparente estado de embriaguez, tienta al atento guardia para abandonar su puesto de trabajo\n"+
		"para tomarse un par de hidromieles salvajes, pues al fin y al cabo: ¿quién podría descifrar el acertijo mágico que protege aquella entrada?\n"
		+"Ambas criaturas desaparecen -junto con su olor- quedando la entrada libre.";
		escena3.opciones = new Object[] {"Buscar en las rocas algo relacionado con aquel acertijo", 5, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena3);

		Escena escena4 = new Escena();
		escena4.hayCombate = true;
		escena4.enemigo = "goblin";
		escena4.idEscena = 4;
		escena4.narrativa = "Después de la ingeniosa decisión, la entrada a la caverna ha quedado despejada,\n"+
		"siendo esta iluminada solo por la pálida luna.";
		escena4.opciones = new Object[] {"Adentrarse en la caverna", 6, "Es muy peligroso seguir adelante yo solo. Volveré al pueblo y le contaré a los adultos.", 6};
		allEscenas.add(escena4);

		Escena escena5 = new Escena();
		escena5.hayCombate = false;
		escena5.idEscena = 5;
		escena5.narrativa = "Lo que a primera vista pasa desapercibido, ante tu mirada atenta se deja ver una inscripción en el lenguaje de los elfos,\n"+
		"que reconoces fácilmente, pues Windalf, el viego mago, te instruyó en esta bella lengua años atrás.";
		escena5.opciones = new Object[] {"Descifrar el acertijo", 7, "Tumbar las rocas haciendo uso de la fuerza bruta", 4};
		allEscenas.add(escena5);


		Escena escena6 = new Escena();
		escena6.escenaFinal = true;
		escena6.hayCombate = false;
		escena6.idEscena = 6;
		escena6.narrativa = "Hasta acá la demo.";
		//escena6.opciones = new Object[] {"Jugar de nuevo", 0, "salir", 0};
		allEscenas.add(escena6);
		