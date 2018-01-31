package com.cice.negocio;

import com.cice.Interfaces.Clases.*;
import com.cice.Interfaces.EnumMateriales;
import com.cice.Interfaces.IPoligono;

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
        char opcion2;

        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));

        if(opcion2=='s')
            fabricarCuadrilatero(opcion, true);
        else
            fabricarCuadrilatero(opcion, false);
    }

    /**
     * Método crearCuadrilatero crea un Cuadrilatero según el tipo seleccionado
     * @param opcion tipo de Cuadrilatero seleccionado
     */
    private void fabricarCuadrilatero (int opcion, boolean autor){
        Cuadrilatero cuadrilatero = new Cuadrilatero();


        switch (opcion) {
            case 1:

                cuadrilatero.setMaterial(EnumMateriales.CARTON);
                cuadrilatero.setPrecio(100);
                cuadrilatero.setColor("gris");
                cuadrilatero.setTemporada("primavera-verano");
                cuadrilatero.setAutor(autor);
                break;
            case 2:

                cuadrilatero.setMaterial(EnumMateriales.PLASTICO);
                cuadrilatero.setPrecio(300);
                cuadrilatero.setColor("gris");
                cuadrilatero.setTemporada("primavera-verano");
                cuadrilatero.setAutor(autor);
                break;
            case 3:

                cuadrilatero.setMaterial(EnumMateriales.MADERA);
                cuadrilatero.setPrecio(500);
                cuadrilatero.setColor("gris");
                cuadrilatero.setTemporada("primavera-verano");
                cuadrilatero.setAutor(autor);
                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(cuadrilatero, 4);

        listaPoligonos.add(cuadrilatero);

        }

    /**
     * Método materialTriangulo solicita el material del Triangulo al Usuario
     */

    private void materialTriangulo(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        char opcion2;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));

        if(opcion2=='s')
            fabricarTriangulo(opcion, true);
        else
            fabricarTriangulo(opcion, false);
    }
    /**
     * Método fabricarTriangulo crea un Triangulo según el tipo seleccionado
     * @param opcion tipo de Triangulo seleccionado
     */

    private void fabricarTriangulo (int opcion, boolean autor){
        Triangulo triangulo = new Triangulo();


        switch (opcion) {
            case 1:

                triangulo.setMaterial(EnumMateriales.CARTON);
                triangulo.setPrecio(100);
                triangulo.setColor("gris");
                triangulo.setTemporada("primavera-verano");
                triangulo.setAutor(autor);
                break;
            case 2:

                triangulo.setMaterial(EnumMateriales.PLASTICO);
                triangulo.setPrecio(300);
                triangulo.setColor("gris");
                triangulo.setTemporada("primavera-verano");
                triangulo.setAutor(autor);
                break;
            case 3:

                triangulo.setMaterial(EnumMateriales.MADERA);
                triangulo.setPrecio(500);
                triangulo.setColor("gris");
                triangulo.setTemporada("primavera-verano");
                triangulo.setAutor(autor);
                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(triangulo, 4);

        listaPoligonos.add(triangulo);


    }

    /**
     * Método materialPentagono solicita el material del Pentagono al Usuario
     */

    private void materialPentagono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        char opcion2;

        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));

        if(opcion2=='s')
            fabricarPentagono(opcion, true);
        else
            fabricarPentagono(opcion, false);

    }

    /**
     * Método fabricarPentagono crea un Pentagono según el tipo seleccionado
     * @param opcion tipo de Pentagono seleccionado
     */
    private void fabricarPentagono(int opcion, boolean autor){
        Pentagono pentagono = new Pentagono();


        switch (opcion) {
            case 1:

                pentagono.setMaterial(EnumMateriales.CARTON);
                pentagono.setPrecio(100);
                pentagono.setColor("gris");
                pentagono.setTemporada("primavera-verano");
                pentagono.setAutor(autor);
                break;
            case 2:

                pentagono.setMaterial(EnumMateriales.PLASTICO);
                pentagono.setPrecio(300);
                pentagono.setColor("gris");
                pentagono.setTemporada("primavera-verano");
                pentagono.setAutor(autor);
                break;
            case 3:

                pentagono.setMaterial(EnumMateriales.MADERA);
                pentagono.setPrecio(500);
                pentagono.setColor("gris");
                pentagono.setTemporada("primavera-verano");
                pentagono.setAutor(autor);
                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(pentagono, 4);

        listaPoligonos.add(pentagono);


    }

    /**
     * Método materialHexagono solicita el material del Hexagono al Usuario
     */
    private void materialHexagono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        char opcion2;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));

        if(opcion2=='s')
            fabricarHexagono(opcion, true);
        else
            fabricarHexagono(opcion, false);
    }

    /**
     * Método fabricarHexagono crea un Hexagono según el tipo seleccionado
     * @param opcion tipo de Hexagono seleccionado
     */

    private void fabricarHexagono(int opcion, boolean autor){
        Hexagono hexagono = new Hexagono();


        switch (opcion) {
            case 1:

                hexagono.setMaterial(EnumMateriales.CARTON);
                hexagono.setPrecio(100);
                hexagono.setColor("gris");
                hexagono.setTemporada("primavera-verano");
                hexagono.setAutor(autor);
                break;
            case 2:

                hexagono.setMaterial(EnumMateriales.PLASTICO);
                hexagono.setPrecio(300);
                hexagono.setColor("gris");
                hexagono.setTemporada("primavera-verano");
                hexagono.setAutor(autor);
                break;
            case 3:

                hexagono.setMaterial(EnumMateriales.MADERA);
                hexagono.setPrecio(500);
                hexagono.setColor("gris");
                hexagono.setTemporada("primavera-verano");
                hexagono.setAutor(autor);
                break;
            default:
                break;
        }
        poligonoAniadirCoodenada(hexagono, 4);

        listaPoligonos.add(hexagono);


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
