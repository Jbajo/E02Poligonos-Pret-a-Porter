package com.cice.negocio;

import com.cice.Interfaces.EnumMateriales;
import com.cice.Interfaces.IPoligono;
import com.cice.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public class Empresa {

    private ArrayList<Poligono> listaPoligonos= new ArrayList <>();

    /**
     * Método showMenu muestra el menú de la aplicación
     */
    public void showMenu() {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;

        do {
            System.out.println("Bienvenido a tu gestion de Poligonos");
            System.out.println("Esto es lo que puedo hacer por ti:");
            System.out.println("1. Crear Triangulo");
            System.out.println("2. Crear Cuadrilatero");
            System.out.println("3. Crear Pentagono");
            System.out.println("4. Crear Hexagono");
            System.out.println("5. Mostrar Poligonos");
            System.out.println("6. Colorea un Poligono");
            System.out.println("7. Elimina el color de un Poligono");
            System.out.println("8. Eliminar un Poligono");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            controles (opcion);
        }while (opcion!=0);
        sc.close();
    }

    /**
     * Método controles llama a los distintos métodos de la aplicación
     * @param opcion seleccionada
     */
    private void controles (int opcion) {
        switch (opcion){
            case 0:
                break;
            case 1:
                //crear Poligono de Carton
                crearPoligono('t');
                break;
            case 2:
                //crear Poligono de Madera
                crearPoligono('c');
                break;
            case 3:
                //crear Poligono de Plastico
                crearPoligono('p');
                break;
            case 4:
                //crear Poligono de Plastico
                crearPoligono('h');
                break;
             case 5:
                //mostrar Poligonos
                mostrarPoligonos();
                break;
            case 6:
                //colorea Poligono
                coloreaPoligono();
                break;
            case 7:
                //elimina el color de un Poligono
                eliminaColorPoligono();
                break;
            case 8:
                //elimina Poligono
                eliminaPoligono();
                break;
            default:
                System.out.println("la opcion seleccionada no es valida");
                break;
        }
    }

    /**
     * Método crearPolígono crea un Polígono de un tipo pidiendo sus Coordenadas
     * @param tipo del poligono c, t, p o h según sea triangulo, cuadrilatero, pentagono o hexagono
     */
    private void crearPoligono(char tipo){


        switch (tipo){
            case 't'://Poligono de Carton
                this.materialTriangulo();
                break;
            case 'c'://Poligono de Madera
                this.materialCuadrilatero();
                break;
            case 'p'://Poligono de Plastico
                this.materialPentagono();
                break;
            case 'h'://Poligono de Plastico
                this.materialHexagono();
                break;

            default:
                System.out.println("Opcion erronea...");
                break;

        }
    }

    /**
     * Método materialCuadrilatero solicita el material del Cuadrilatero al Usuario
     */

    private void materialCuadrilatero(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);

        crearCuadrilatero(opcion);
    }

    /**
     * Método crearCuadrilatero crea un Cuadrilatero según el tipo seleccionado
     * @param opcion tipo de Cuadrilatero seleccionado
     */
    private void crearCuadrilatero (int opcion){
        IPoligono poligono;

        poligono = new Cuadrilatero();
        switch (opcion) {
            case 1:

                ((Cuadrilatero) poligono).setMaterial(EnumMateriales.CARTON);
                ((Cuadrilatero) poligono).setPrecio(100);
                ((Cuadrilatero) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 2:

                ((Cuadrilatero) poligono).setMaterial(EnumMateriales.PLASTICO);
                ((Cuadrilatero) poligono).setPrecio(300);
                ((Cuadrilatero) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 3:

                ((Cuadrilatero) poligono).setMaterial(EnumMateriales.MADERA);
                ((Cuadrilatero) poligono).setPrecio(500);
                ((Cuadrilatero) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(poligono, 4);

        listaPoligonos.add((Poligono)poligono);

        }

    /**
     * Método materialTriangulo solicita el material del Triangulo al Usuario
     */

    private void materialTriangulo(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);

        crearTriangulo(opcion);
    }
    /**
     * Método crearTriangulo crea un Triangulo según el tipo seleccionado
     * @param opcion tipo de Triangulo seleccionado
     */

    private void crearTriangulo (int opcion){
        IPoligono poligono;
        Scanner sc = new Scanner (System.in);
        String aux="1";
        float x,y;
        poligono = new Triangulo();

        switch (opcion) {
            case 1:

                ((Triangulo) poligono).setMaterial(EnumMateriales.CARTON);
                ((Triangulo) poligono).setPrecio(100);
                ((Triangulo) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 2:

                ((Triangulo) poligono).setMaterial(EnumMateriales.PLASTICO);
                ((Triangulo) poligono).setPrecio(300);
                ((Triangulo) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 3:

                ((Triangulo) poligono).setMaterial(EnumMateriales.MADERA);
                ((Triangulo) poligono).setPrecio(500);
                ((Triangulo) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");

                break;
            default:
                break;
        }

        poligonoAniadirCoodenada(poligono, 3);
        listaPoligonos.add((Poligono)poligono);

    }

    /**
     * Método materialPentagono solicita el material del Pentagono al Usuario
     */

    private void materialPentagono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);

        crearPentagono(opcion);
    }

    /**
     * Método crearPentagono crea un Pentagono según el tipo seleccionado
     * @param opcion tipo de Pentagono seleccionado
     */
    private void crearPentagono(int opcion){
        IPoligono poligono;
        Scanner sc = new Scanner (System.in);
        String aux="1";
        float x,y;
        poligono = new Pentagono();

        switch (opcion) {
            case 1:

                ((Pentagono) poligono).setMaterial(EnumMateriales.CARTON);
                ((Pentagono) poligono).setPrecio(100);
                ((Pentagono) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 2:

                ((Pentagono) poligono).setMaterial(EnumMateriales.PLASTICO);
                ((Pentagono) poligono).setPrecio(300);
                ((Pentagono) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 3:

                ((Pentagono) poligono).setMaterial(EnumMateriales.MADERA);
                ((Pentagono) poligono).setPrecio(500);
                ((Pentagono) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");

                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(poligono,5 );
        listaPoligonos.add((Poligono)poligono);

    }

    /**
     * Método materialHexagono solicita el material del Hexagono al Usuario
     */
    private void materialHexagono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);

        crearHexagono(opcion);
    }

    /**
     * Método crearHexagono crea un Hexagono según el tipo seleccionado
     * @param opcion tipo de Hexagono seleccionado
     */

    private void crearHexagono(int opcion){
        IPoligono poligono;
        Scanner sc = new Scanner (System.in);
        String aux="1";
        float x,y;
        poligono = new Hexagono();

        switch (opcion) {
            case 1:

                (( Hexagono) poligono).setMaterial(EnumMateriales.CARTON);
                (( Hexagono) poligono).setPrecio(100);
                (( Hexagono) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 2:

                (( Hexagono) poligono).setMaterial(EnumMateriales.PLASTICO);
                (( Hexagono) poligono).setPrecio(300);
                (( Hexagono) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");
                break;
            case 3:

                (( Hexagono) poligono).setMaterial(EnumMateriales.MADERA);
                (( Hexagono) poligono).setPrecio(500);
                (( Hexagono) poligono).setColor("gris");
                ((Poligono) poligono).setTemporada("primavera-verano");

                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(poligono,6 );
        listaPoligonos.add((Poligono)poligono);

    }


    private void poligonoAniadirCoodenada(IPoligono poligono, int lados) {
        Scanner sc = new Scanner (System.in);
        String aux="1";
        float x,y;

        for (int i = 0; i < lados ; i++) {

            do {
                do {
                    if (!aux.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)"))
                        System.out.println("No es numero valido");
                    System.out.println("Introduzca la Coordenada X numero --> " + i);
                    aux = sc.nextLine();
                } while (!aux.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)"));
                x = Float.parseFloat(aux);
                do {
                    if (!aux.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)"))
                        System.out.println("No es numero valido");
                    System.out.println("Introduzca la Coordenada Y numero --> " + i);
                    aux = sc.nextLine();
                } while (!aux.matches("[+-]?([0-9]+([.][0-9]*)?|[.][0-9]+)"));
                y = Float.parseFloat(aux);
            } while (poligono.aniadirCoordenada(x, y) == false);
        }

    }

    /**
     * Método mostrarPolígonos muestra los Polígonos de la listaPoligonos
     */

    private void mostrarPoligonos(){
     int i = 0;
        for(Poligono poligono : listaPoligonos){
            System.out.println(i+1 +") " + poligono.toString());
            i++;
        }
    }

    /**
     * Méotdo coloreaPoligono colorea un Polígono seleccionado de la listaPoligonos
     */
    private void coloreaPoligono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        String aux = "gris";

        if(listaPoligonos.size()>0) {
            do {
                    System.out.println("Seleccione un Poligono");
                    this.mostrarPoligonos();
                    opcion = Integer.parseInt(sc.nextLine());
                    opcion--;
            } while (opcion < 0 || opcion > listaPoligonos.size());
            System.out.println("Introduzca un color para el Poligono...");
             if(listaPoligonos.get(opcion).devuelveVertices()==5 && listaPoligonos.get(opcion).getColor().equals("gris") ) //Caso Pentagono Coloreado
                listaPoligonos.get(opcion).setSuplemento(0.20f);
             else if (listaPoligonos.get(opcion).getSuplemento()!=0)
                 System.out.println("Este Poligono ya tiene aplicado el Suplemento");
            do {
                if (!aux.matches("[a-zA-Z]+")) {
                    System.out.println("Color erroneo");
                    System.out.println("Introduzca un color para el Poligono...");
                }
                aux = sc.nextLine();
            }while (!aux.matches("[a-zA-Z]+"));
            listaPoligonos.get(opcion).coloreaPoligono(aux);
        }
    }

    /**
     * Método eliminaColorPoligono elimina el Color de un Poligono y su suplemento
     */
    private void eliminaColorPoligono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;

        if(listaPoligonos.size()>0) {
            do {
                System.out.println("Seleccione un Poligono");
                this.mostrarPoligonos();
                opcion = Integer.parseInt(sc.nextLine());
                opcion--;
            } while (opcion < 0 || opcion > listaPoligonos.size());
            listaPoligonos.get(opcion).quitaColorPoligono();
        }
    }


    /**
     * Método eliminarPoligono elimina un Polígono seleccionado
     */
    private void eliminaPoligono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        if(listaPoligonos.size()>0) {
            do {
                System.out.println("Seleccione un Poligono");
                this.mostrarPoligonos();
                opcion = Integer.parseInt(sc.nextLine());
                opcion--;
            } while (opcion < 0 || opcion > listaPoligonos.size());
            listaPoligonos.remove(opcion);
        }

    }

}
