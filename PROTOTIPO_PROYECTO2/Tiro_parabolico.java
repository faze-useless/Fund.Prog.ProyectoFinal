package tiro_parabolico;

import java.util.*;

public class Tiro_parabolico {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int funcion;
        double vi, sen, viy, cos, vix, g=9.81, taire, gra, hmax, dh, vf, t, ttota, tsu, h;
        int caso1, caso2, caso3, caso4, caso5, caso6, caso7, caso8, caso9;
        System.out.println("Cuál función de TIRO PARABÓLICO desea llevar a cabo:");
        System.out.println("1.- Velocidad vértical.");
        System.out.println("2.- Velocidad horizontal.");
        System.out.println("3.- Tiempo al aire.");
        System.out.println("4.- Altura máxima.");
        System.out.println("5.- Distancia horizontal alcance/distancia total.");
        System.out.println("6.- Velocidad final.");
        System.out.println("7.- Tiempo de vuelo/tiempo total.");
        System.out.println("8.- Tiempo en subir.");
        System.out.println("9.- Altura.");
        funcion = input.nextInt();
        switch (funcion) {
            case 1:
                System.out.println("La función que seleccionaste es Velocidad vértical");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- La velocidad vértical.");
                System.out.println("2.- La velocidad inicial.");
                System.out.println("3.- El seno del ángulo.");
                caso1 = input.nextInt();
                switch (caso1) {
                    case 1:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad inicial:");
                        vi = input.nextDouble();
                        System.out.println("Ingresa el seno del ángulo:");
                        sen = input.nextDouble();
                        viy = vi * sen;
                        System.out.println("La velocidad vertical es: " +viy);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad inicial.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa el seno del ángulo:");
                        sen = input.nextDouble();
                        vi = viy / sen;
                        System.out.println("La velocidad inicial es: " +vi);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción del Seno del ángulo.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa la velocidad inicial:");
                        vi = input.nextDouble();
                        sen = viy / vi;
                        System.out.println("El Seno del ángulo: " +sen+ "º");
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 2:
                System.out.println("La función que seleccionaste es Velocidad horizontal");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- La velocidad horizontal.");
                System.out.println("2.- La velocidad inicial.");
                System.out.println("3.- El seno del ángulo.");
                caso2 = input.nextInt();
                switch (caso2) {
                    case 1:
                        System.out.println("Seleccionaste la opción de velocidad horizontal.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad inicial:");
                        vi = input.nextDouble();
                        System.out.println("Ingresa el coseno del ángulo:");
                        cos = input.nextDouble();
                        vix = vi * cos;
                        System.out.println("La velocidad vertical es: " +vix);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad inicial.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad horizontal:");
                        vix = input.nextDouble();
                        System.out.println("Ingresa el coseno del ángulo:");
                        cos = input.nextDouble();
                        vi = vix / cos;
                        System.out.println("La velocidad inicial es: " +vi);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción del Coseno del ángulo.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad horizontal:");
                        vix = input.nextDouble();
                        System.out.println("Ingresa la velocidad inicial:");
                        vi = input.nextDouble();
                        cos = vix / vi;
                        System.out.println("El Seno de la funcion es: " +cos+ "º");
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 3:
                System.out.println("La función que seleccionaste es Tiempo en el aire");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- El tiempo en el aire.");
                System.out.println("2.- velocidad vértical.");
                System.out.println("3.- Gravedad.");
                caso3 = input.nextInt();
                switch (caso3) {
                    case 1:
                        System.out.println("Seleccionaste la opción de tiempo en el aire.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        taire = -((2*viy)/g);
                        System.out.println("El timepo en el aire es de: " +taire);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("La gravedad es igual a: " +g);
                        System.out.println("Ingresa el tiempo en el aire:");
                        taire = input.nextDouble();
                        viy = (g*taire)/(-2);
                        System.out.println("La velocidad vértical es: " +viy);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción de gravedad.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa el tiempo en el aire:");
                        taire = input.nextDouble();
                        gra = (viy *(-2))/taire;
                        System.out.println("La gravedad es: " +gra);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                break;
                case 4:
                System.out.println("La función que seleccionaste es altura máxima");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- La altura máxima.");
                System.out.println("2.- Velocidad vértical.");
                System.out.println("3.- Gravedad.");
                caso4 = input.nextInt();
                switch (caso4) {
                    case 1:
                        System.out.println("Seleccionaste la opción de altura máxima.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        hmax = -((Math.pow(viy, 2))/(2 * g));
                        System.out.println("La altura máxima es de: " +hmax);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("La gravedad es igual a: " +g);
                        System.out.println("Ingresa la altura máxima:");
                        hmax = input.nextDouble();
                        viy = -(Math.sqrt((2*g)*hmax));
                        System.out.println("La velocidad vértical es: " +viy);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción de gravedad.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa la altura máxima:");
                        hmax = input.nextDouble();
                        gra = (Math.sqrt(viy * 2 *hmax));
                        System.out.println("La gravedad es: " +gra);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 5:
                System.out.println("La función que seleccionaste es Distancia horizontal alcance/distancia total");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- La velocidad horizontal.");
                System.out.println("2.- La distancia horizontal alcance/distancia total.");
                System.out.println("3.- El tiempo en el aire.");
                caso5 = input.nextInt();
                switch (caso5) {
                    case 1:
                        System.out.println("Seleccionaste la opción de velocidad horizontal.");
                        System.out.println("");
                        System.out.println("La distancia horizontal alcance/distancia total:");
                        dh = input.nextDouble();
                        System.out.println("Ingresa el tiempo en el aire:");
                        taire = input.nextDouble();
                        vix = dh / taire;
                        System.out.println("La velocidad horizontal es: " +vix);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de distancia horizontal alcance/distancia total.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad horizontal:");
                        vix = input.nextDouble();
                        System.out.println("Ingresa el tiempo en el aire:");
                        taire = input.nextDouble();
                        dh = vix * taire;
                        System.out.println("La distancia horizontal alcance/distancia total: " +dh);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción de tiempo en el aire.");
                        System.out.println("");
                        System.out.println("Ingresa la distancia horizontal alcance/distancia total.:");
                        dh = input.nextDouble();
                        System.out.println("Ingresa la velocidad horizontal");
                        vix = input.nextDouble();
                        taire = dh / vix;
                        System.out.println("El tiempo en el aire es de: " +taire);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 6:
                System.out.println("La función que seleccionaste es Velocidad final.");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- La velocidad final.");
                System.out.println("2.- La velocidad vértical.");
                System.out.println("3.- La gravedad.");
                System.out.println("4.- El tiempo en subir.");
                caso6 = input.nextInt();
                switch (caso6) {
                    case 1:
                        System.out.println("Seleccionaste la opción de velocidad final.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        System.out.println("El tiempo en subir es:");
                        tsu= input.nextDouble();
                        vf= viy + (g*tsu);
                        System.out.println("La velocidad final es: " +vf);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad final:");
                        vf = input.nextDouble();
                        System.out.println("Ingresa el tiempo en subir:");
                        t = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        viy = (vf/t)-g;
                        System.out.println("La velocidad vértical es: " +viy);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción de gravedad.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa la velocidad final:");
                        vf = input.nextDouble();
                        System.out.println("Ingresa el tiempo en subir:");
                        t = input.nextDouble();
                        gra = (vf/g) - viy;
                        System.out.println("La gravedad es: " +gra);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 7:
                System.out.println("La función que seleccionaste el tiempo de vuelta/tiempo total.");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- tiempo de vuelta/tiempo total.");
                System.out.println("2.- La velocidad vértical.");
                System.out.println("3.- La gravedad.");
                caso7 = input.nextInt();
                switch (caso7) {
                    case 1:
                        System.out.println("Seleccionaste la opción de tiempo de vuelta/tiempo total.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        ttota = -((2*viy)/g);
                        System.out.println("El tiempo de vuelta/tiempo total es de: " +ttota);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("La gravedad es igual a: " +g);
                        System.out.println("Ingresa el tiempo de vuelta/tiempo total:");
                        ttota = input.nextDouble();
                        viy = (g*ttota)/(-2);
                        System.out.println("La velocidad vértical es: " +viy);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción de gravedad.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa el tiempo de vuelta/tiempo total:");
                        ttota = input.nextDouble();
                        gra = (viy *(-2))/ttota;
                        System.out.println("La gravedad es: " +gra);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 8:
                System.out.println("La función que seleccionaste es tiempo en subir");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- El tiempo en subir.");
                System.out.println("2.- La velocidad vértical.");
                System.out.println("3.- La gravedad.");
                caso8 = input.nextInt();
                switch (caso8) {
                    case 1:
                        System.out.println("Seleccionaste la opción de tiempo en subir.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vertical:");
                        viy = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        tsu = - (viy / g);
                        System.out.println("El tiempo en subir es: " +tsu);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("Ingresa el tiempo en subir:");
                        tsu = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        viy = - (tsu / g );
                        System.out.println("La velocidad vértical es: " +viy);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción es gravedad.");
                        System.out.println("");
                        System.out.println("Ingresa el tiempo en subir:");
                        tsu = input.nextDouble();
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        gra = - (tsu / viy);
                        System.out.println("La gravedad es de: " +gra);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                case 9:
                System.out.println("La función que seleccionaste es altura");
                System.out.println("");
                System.out.println("Deseas calcular:");
                System.out.println("1.- La altura.");
                System.out.println("2.- La velocidad vértical.");
                System.out.println("3.- tiempo en subir.");
                System.out.println("4.- La gravedad.");
                caso9 = input.nextInt();
                switch (caso9) {
                    case 1:
                        System.out.println("Seleccionaste la opción de la altura.");
                        System.out.println("");
                        System.out.println("Ingresa la velocidad vertical:");
                        viy = input.nextDouble();
                        System.out.println("El tiempo en subir es de: ");
                        tsu = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        h = (viy * tsu) + ((g*(Math.pow(tsu,2)))/2);
                        System.out.println("La altura es de: " +h);
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción de velocidad vértical.");
                        System.out.println("");
                        System.out.println("Ingresa el tiempo en subir:");
                        tsu = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        System.out.println("La altura es de:");
                        h = input.nextDouble();
                        viy = (h - ((g*(Math.pow(tsu, 2)))/2))/tsu;
                        System.out.println("La velocidad vértical es: " +viy);
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción de tiempo en subir.");
                        System.out.println("");
                        System.out.println("Ingresa la altura:");
                        h = input.nextDouble();
                        System.out.println("La gravedad es igual a: " +g);
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        tsu = - (viy + Math.sqrt((Math.pow(viy,2))+ (2 * h * g)))/g;
                        System.out.println("El tiempo en subir es de: " +tsu);
                        break;
                    case 4:
                        System.out.println("Seleccionaste la opción es gravedad.");
                        System.out.println("");
                        System.out.println("Ingresa el tiempo en subir:");
                        tsu = input.nextDouble();
                        System.out.println("Ingresa la velocidad vértical:");
                        viy = input.nextDouble();
                        System.out.println("Ingresa la altura");
                        h = input.nextDouble();
                        gra = Math.sqrt((h - (viy * tsu)* 2)/ tsu);
                        System.out.println("La gravedad es de: " +gra);
                        break;
                    default:
                        System.out.println("La opción que seleccionaste NO existe.");
                }
                break;
            default:
                System.out.println("La opción que seleccionaste NO existe.");
        }
    }
    
}
