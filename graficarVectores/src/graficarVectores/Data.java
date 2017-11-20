package graficarVectores;

import java.text.DecimalFormat;

public class Data {

    public Data() {
    }

    public float calcularDistancia(Punto p) {
        float distancia = 0;

        // rescato los puntos
        double x1 = p.getX1();
        System.out.println("X1 : " + x1);
        double y1 = p.getY1();
        System.out.println("Y1 : " + y1);
        double x2 = p.getX2();
        System.out.println("X2 : " + x2);
        double y2 = p.getY2();
        System.out.println("Y2 : " + y2);

        // hago la parte de restar el x2 con x1 
        double res1 = x2 - x1;
        // elevo al cuadrado
        res1 = Math.pow(res1, 2);
        // hago la parte de restar el y2 con y1
        double res2 = y2 - y1;
        // elevo al cuadrado
        res2 = Math.pow(res2, 2);
        // sumo los resultados anteriores
        double suma = res1 + res2;
        // si la suma es negativa la multiplico por -1 para que no arroje error
        if (suma < 0) {
            suma = suma * -1;
        }
        // calculo la raiz cuandrada
        distancia = (float) Math.sqrt(suma);

        //redondeo a 2 decimales
        distancia = (float) Redondear(distancia, 2);

        // retorno la distancia
        return distancia;
    }

    public static double Redondear(double numero, int digitos) {
        int cifras = (int) Math.pow(10, digitos);
        return Math.rint(numero * cifras) / cifras;
    }

    public String identificarTipoTriangulo(float lado1, float lado2, float lado3) {
        String tipo = "";

        System.out.println("TRAZO AB EN ID TT : " + lado1);
        System.out.println("TRAZO BC EN ID TT : " + lado2);
        System.out.println("TRAZO CA EN ID TT : " + lado3);

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            return "Triangulo Equilatero";
        }

        if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            return "Triangulo Escaleno";
        }

        if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Triangulo Isoseles";
        }
        return tipo;
    }

    public int getPerimetroTriangulo(float lado1, float lado2, float lado3) {
        int perimetro;

        perimetro = (int) ((int) lado1 + lado2 + lado3);
        return (int) Redondear(perimetro, 2);
    }

    public float getAreaTringulo(String tipo, float perimetro, float lado1, float lado2, float lado3) {
        float area = 0;

        float semiperimetro = perimetro / 2;
        System.out.println("semiperimetro = " + semiperimetro);

        float a = (semiperimetro - lado1);
        System.out.println("semiperimetro - lado1 = " + a);
        float b = (semiperimetro - lado2);
        System.out.println("semiperimetro - lado2 = " + b);
        float c = (semiperimetro - lado3);
        System.out.println("semiperimetro - lado3 = " + c);

        float mult = semiperimetro * (a * (b * c));
        System.out.println("Multiplicacion = " + mult);

        area = (int) Math.sqrt(mult);
        System.out.println("AREA TRIANGULO = " + area);

        return (float) Redondear(area, 2);
    }

    // metodo que retornara el tipo de poligono
    // le entrego las distancias entre los puntos y los puntos que estoy graficando
    public String identificarTipoPoligono(float distAB, float distBC, float distCD, float distAD,
            Coordenada coo1, Coordenada coo2, Coordenada coo3, Coordenada coo4) {

        int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
        int y1 = 0, y2 = 0, y3 = 0, y4 = 0;
        int pendienteUno = 0;
        int pendienteDos = 0;

        x1 = coo1.getX();
        y1 = coo1.getY();

        x2 = coo2.getX();
        y2 = coo2.getY();

        x3 = coo3.getX();
        y3 = coo3.getY();

        x4 = coo4.getX();
        y4 = coo4.getY();

        // cuadrado o rombo
        if (distAB == distBC && distAB == distCD && distAB == distAD && distBC == distCD && distBC == distAD && distCD == distAD) {

            if (x1 == x2 && x3 == x4 && y1 == y4 && y2 == y3) {
                return "Cuadrado";
            } else if (x2 == x4 && y1 == y3) {
                return "Rombo";
            }
        }

        //if para rectangulo o romboide
        if (distAB == distCD && distBC == distAD) {
            if (x1 == x2 && x3 == x4 && y1 == y4 && y2 == y3) {
                return "Rectangulo";
            } else {
                return "Romboide";
            }
        }

        if (distAB == distCD && distBC == distAD) {
            if (x1 == x2 && x3 == x4 && y1 == y4 && y2 == y3) {
                return "Rectangulo";
            } else {
                return "Romboide";
            }
        }

        // trapecio
        pendienteUno = (y3 - y2) / (x3 - x2);
        pendienteDos = (y4 - y1) / (x4 - x1);

        if (distAB == distCD && pendienteUno == pendienteDos) {
            return "Trapecio";
        }

        if (distAB != distBC && distAB != distCD && distAB != distAD
                && distBC != distCD && distBC != distAD && distCD != distAD) {

            return "Trapezoide";
        }

        return "No Identificada";
    }

    public float getPerimetroPoligono(float distAB, float distBC, float distCD, float distAD) {
        float perimetro = 0;

        perimetro = distAB + distBC + distCD + distAD;

        perimetro = (float) Redondear(perimetro, 2);

        return perimetro;
    }

    public float getAreaPoligono(String tipo, float distAB, float distBC, float distCD, float distAD,
            Coordenada coo1, Coordenada coo2, Coordenada coo3, Coordenada coo4) {
        float area = 0;

        if (tipo.equalsIgnoreCase("Cuadrado")) {
            // area = a * a
            return distAB * distBC;
        }

        if (tipo.equalsIgnoreCase("Rectangulo")) {
            // area = a * b
            return distAB * distBC;
        }

        if (tipo.equalsIgnoreCase("Rombo")) {
            // area = a * a
            return distAB * distBC;
        }

        if (tipo.equalsIgnoreCase("Romboide")) {
            /* 
            calculo la base, b = trazoArriba - trazoAbajo / 2
            h(altura) = b * lado
            teorema de pitagoras
            c^2 = a^2 + b^2
            c = lado, a =  base, b = altura que falta
            lado^2 - base^2 = altura^2 
             */

            float base = distBC - distAD / 2;
            base = (float) Math.pow(base, 2);
            float lado = (float) Math.pow(distAB, 2);
            float altura = lado - base;
            altura = (float) Math.sqrt(altura);

            // area = lado arria * h;
            area = distBC * altura;
            return (float) Redondear(area, 2);
        }

        if (tipo.equalsIgnoreCase("Trapecio")) {
            /*
            http://www.universoformulas.com/matematicas/geometria/area-trapecio/
            
            formar primero un tringulo calculando la base
            base(M) = lado abajo - lado arriba;
            
            semiperimetro(S) = base(M) + lado izq + lado der / 2
            
            areaT =  √s*(s-m)*(s-ladoA)*(s-ladoC)
            area = (Base * h)/2
            altura = (areaT * 2) / base
            areaFinal = altura * ((ladoD + lado B)/2)
             */
            float ladoAbajo = distAD;
            float ladoArriba = distBC;
            float ladoC = distCD;
            float ladoD = distAB;

            float base = ladoAbajo - ladoArriba;
            float semiperimetro = (base + ladoC + ladoD) / 2;

            float a = semiperimetro - base;
            float b = semiperimetro - ladoC;
            float c = semiperimetro - ladoD;

            float areaT = semiperimetro * (a * (b * c));
            areaT = (float) Math.sqrt(areaT);

            float h = (areaT * 2) / base;

            area = h * ((ladoC + ladoD) / 2);

            return (float) Redondear(area, 2);

        }

        if (tipo.equalsIgnoreCase("Trapezoide")) {
            // https://www.youtube.com/watch?v=dgxbTA9tLPc

            int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
            int y1 = 0, y2 = 0, y3 = 0, y4 = 0;

            x1 = coo1.getX();
            y1 = coo1.getY();

            x2 = coo2.getX();
            y2 = coo2.getY();

            x3 = coo3.getX();
            y3 = coo3.getY();

            x4 = coo4.getX();
            y4 = coo4.getY();

            float interior = 0;

            interior = ((x1 * y2) + (x2 * y3) + (x3 * y4) + (x4 * y1) + ((y1 * x2) * -1) + ((y2 * x3) * -1) + ((y3 * x4) * -1) + ((y4 * x1) * -1));
            
            area = (float) (0.5 * interior);
            return (float) Redondear(area,2);
        }

        return area;
    }

}
