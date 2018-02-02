package com.cice.negocio;

import com.cice.Interfaces.Clases.*;
import com.cice.enums.EnumDisenio;
import com.cice.enums.EnumMateriales;
import com.cice.Interfaces.IPoligono;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public class Empresa {

    private ArrayList<IPoligono> listaPoligonos= new ArrayList <IPoligono>();

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
            System.out.println("6. Aplicar Porcentaje a un Polígono");
            System.out.println("7. Elimina porcentaje de un Poligono");
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
                //Aplicar Porcentaje
                aplicarPorcentaje();
                break;
            case 7:
                //Eliminar Porcentaje
                eliminaPorcentaje();
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
        int opcion3;

        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));
        do {
            System.out.println("Introduzca un diseño --> 1) Basico 2) Coloreado 3) De Autor 4) Estampado");
            opcion3 = Integer.parseInt(sc.nextLine());
        }while (opcion3<1 || opcion3 >4);
        if(opcion2=='s')
            fabricarCuadrilatero(opcion, true, opcion3);
        else
            fabricarCuadrilatero(opcion, false, opcion3);
    }

    /**
     * Método crearCuadrilatero crea un Cuadrilatero según el tipo seleccionado
     * @param opcion tipo de Cuadrilatero seleccionado
     * @param autor indica si el poligono es o no de autor
     */
    private void fabricarCuadrilatero (int opcion, boolean autor, int opcion2){

        Cuadrilatero cuadrilatero;

        switch (opcion) {
            case 1:
                if (opcion2==0)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.CARTON, EnumDisenio.BASICO, "primavera-verano",  autor);
               else if (opcion2 ==1)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.CARTON, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.CARTON, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    cuadrilatero = new Cuadrilatero(EnumMateriales.CARTON, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(cuadrilatero, 4);
                listaPoligonos.add(cuadrilatero);
                break;
            case 2:

                if (opcion2==0)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.PLASTICO, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.PLASTICO, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.PLASTICO, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    cuadrilatero = new Cuadrilatero(EnumMateriales.PLASTICO, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(cuadrilatero, 4);
                listaPoligonos.add(cuadrilatero);
                break;
            case 3:

                if (opcion2==0)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.MADERA, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.MADERA, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    cuadrilatero = new Cuadrilatero(EnumMateriales.MADERA, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    cuadrilatero = new Cuadrilatero(EnumMateriales.MADERA, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(cuadrilatero, 4);
                listaPoligonos.add(cuadrilatero);
                break;
            default:
                break;
        }

        }

    /**
     * Método materialTriangulo solicita el material del Triangulo al Usuario
     */

    private void materialTriangulo(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        char opcion2;
        int opcion3;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));
        do {
            System.out.println("Introduzca un diseño --> 1) Basico 2) Coloreado 3) De Autor 4) Estampado");
            opcion3 = Integer.parseInt(sc.nextLine());
        }while (opcion3<1 || opcion3 >4);

        if(opcion2=='s')
            fabricarTriangulo(opcion, true, opcion2);
        else
            fabricarTriangulo(opcion, false, opcion2);
    }
    /**
     * Método fabricarTriangulo crea un Triangulo según el tipo seleccionado
     * @param opcion tipo de Triangulo seleccionado
     * @param autor indica si el poligono es o no de autor
     */

    private void fabricarTriangulo (int opcion, boolean autor, int opcion2){
        Triangulo triangulo;

        switch (opcion) {
            case 1:
                if (opcion2==0)
                    triangulo = new Triangulo(EnumMateriales.CARTON, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    triangulo = new Triangulo(EnumMateriales.CARTON, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    triangulo = new Triangulo(EnumMateriales.CARTON, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    triangulo = new Triangulo(EnumMateriales.CARTON, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(triangulo, 4);
                listaPoligonos.add(triangulo);
                break;
            case 2:

                if (opcion2==0)
                    triangulo = new Triangulo(EnumMateriales.PLASTICO, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    triangulo = new Triangulo(EnumMateriales.PLASTICO, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    triangulo = new Triangulo(EnumMateriales.PLASTICO, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    triangulo = new Triangulo(EnumMateriales.PLASTICO, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(triangulo, 4);
                listaPoligonos.add(triangulo);
                break;
            case 3:

                if (opcion2==0)
                    triangulo = new Triangulo(EnumMateriales.MADERA, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    triangulo = new Triangulo(EnumMateriales.MADERA, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    triangulo = new Triangulo(EnumMateriales.MADERA, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    triangulo = new Triangulo(EnumMateriales.MADERA, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(triangulo, 4);
                listaPoligonos.add(triangulo);
                break;
            default:
                break;
        }


    }
    private void poligonoSetMaterial(int opcion2){

    }
    /**
     * Método materialPentagono solicita el material del Pentagono al Usuario
     */

    private void materialPentagono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        char opcion2;
        int opcion3;

        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));
        do {
            System.out.println("Introduzca un diseño --> 1) Basico 2) Coloreado 3) De Autor 4) Estampado");
            opcion3 = Integer.parseInt(sc.nextLine());
        }while (opcion3<1 || opcion3 >4);

        if(opcion2=='s')
            fabricarPentagono(opcion, true, opcion3);
        else
            fabricarPentagono(opcion, false, opcion3);

    }

    /**
     * Método fabricarPentagono crea un Pentagono según el tipo seleccionado
     * @param opcion tipo de Pentagono seleccionado
     * @param autor indica si el poligono es o no de autor
     */
    private void fabricarPentagono(int opcion, boolean autor, int opcion2){
        Pentagono pentagono;

        switch (opcion) {
            case 1:
                if (opcion2==0)
                    pentagono = new Pentagono(EnumMateriales.CARTON, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    pentagono = new Pentagono(EnumMateriales.CARTON, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    pentagono = new Pentagono(EnumMateriales.CARTON, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    pentagono = new Pentagono(EnumMateriales.CARTON, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(pentagono, 4);
                listaPoligonos.add(pentagono);
                break;
            case 2:

                if (opcion2==0)
                    pentagono = new Pentagono(EnumMateriales.PLASTICO, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    pentagono = new Pentagono(EnumMateriales.PLASTICO, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    pentagono = new Pentagono(EnumMateriales.PLASTICO, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    pentagono = new Pentagono(EnumMateriales.PLASTICO, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(pentagono, 4);
                listaPoligonos.add(pentagono);
                break;
            case 3:

                if (opcion2==0)
                    pentagono = new Pentagono(EnumMateriales.MADERA, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    pentagono = new Pentagono(EnumMateriales.MADERA, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    pentagono = new Pentagono(EnumMateriales.MADERA, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    pentagono = new Pentagono(EnumMateriales.MADERA, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(pentagono, 4);
                listaPoligonos.add(pentagono);
                break;
            default:
                break;
        }


    }

    /**
     * Método materialHexagono solicita el material del Hexagono al Usuario
     */
    private void materialHexagono(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        char opcion2;
        int opcion3;


        do {
            System.out.println("Introduzca un material --> 1) Carton 2) Plastico 3) Madera");
            opcion = Integer.parseInt(sc.nextLine());
        }while (opcion<1 || opcion >3);
        do {
            System.out.println("Desea que sea de Autor (s/n)");
            opcion2 = sc.nextLine().charAt(0);
        }while ((opcion2 !='s') && (opcion2 !='n'));
        do {
            System.out.println("Introduzca un diseño --> 1) Basico 2) Coloreado 3) De Autor 4) Estampado");
            opcion3 = Integer.parseInt(sc.nextLine());
        }while (opcion3<1 || opcion3 >4);

        if(opcion2=='s')
            fabricarHexagono(opcion, true, opcion3);
        else
            fabricarHexagono(opcion, false, opcion3);
    }

    /**
     * Método fabricarHexagono crea un Hexagono según el tipo seleccionado
     * @param opcion tipo de Hexagono seleccionado
     * @param autor indica si el poligono es o no de autor
     */

    private void fabricarHexagono(int opcion, boolean autor, int opcion2){
        Hexagono hexagono;

        switch (opcion) {
            case 1:
                if (opcion2==0)
                    hexagono = new Hexagono(EnumMateriales.CARTON, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    hexagono = new Hexagono(EnumMateriales.CARTON, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    hexagono = new Hexagono(EnumMateriales.CARTON, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    hexagono = new Hexagono(EnumMateriales.CARTON, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(hexagono, 4);
                listaPoligonos.add(hexagono);
                break;
            case 2:

                if (opcion2==0)
                    hexagono = new Hexagono(EnumMateriales.PLASTICO, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    hexagono = new Hexagono(EnumMateriales.PLASTICO, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    hexagono = new Hexagono(EnumMateriales.PLASTICO, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    hexagono = new Hexagono(EnumMateriales.PLASTICO, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(hexagono, 4);
                listaPoligonos.add(hexagono);
                break;
            case 3:

                if (opcion2==0)
                    hexagono = new Hexagono(EnumMateriales.MADERA, EnumDisenio.BASICO, "primavera-verano",  autor);
                else if (opcion2 ==1)
                    hexagono = new Hexagono(EnumMateriales.MADERA, EnumDisenio.COLOREADO, "primavera-verano",  autor);
                else if (opcion2 ==2)
                    hexagono = new Hexagono(EnumMateriales.MADERA, EnumDisenio.COLOREADODEAUTOR, "primavera-verano",  autor);
                else
                    hexagono = new Hexagono(EnumMateriales.MADERA, EnumDisenio.ESTAMPADO, "primavera-verano",  autor);
                poligonoAniadirCoodenada(hexagono, 4);
                listaPoligonos.add(hexagono);
                break;
            default:
                break;
        }


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
        for(IPoligono poligono : listaPoligonos){
            System.out.println(i+1 +") " + poligono.toString());
            i++;
        }
    }

    /**
     * Méotodo aplicarPorcentaje aplica su Porcentaje al Poligono y modifica el precio base
     */
    private void aplicarPorcentaje(){
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
            listaPoligonos.get(opcion).aplicarPorcantaje();
        }
    }

    /**
     * Méotodo eliminarPorcentaje elimina su Porcentaje al Poligono y modifica el precio base
     */
    private void eliminaPorcentaje(){
        Scanner sc = new Scanner (System.in);
        int opcion = 0;

        if(listaPoligonos.size()>0) {
            do {
                System.out.println("Seleccione un Poligono");
                this.mostrarPoligonos();
                opcion = Integer.parseInt(sc.nextLine());
                opcion--;
            } while (opcion < 0 || opcion > listaPoligonos.size());
            listaPoligonos.get(opcion).eliminarPorcentaje();
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
