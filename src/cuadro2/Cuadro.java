package cuadro2;

/** Esta clase representa una pintura sencilla. Puede dibujar la pintura
 * usando el m�todo dibujar. Pero espere, siendo una pintura electr�nica,
 * se la puede cambiar. Se la puede establecer para que se vea en blanco
 * negro y luego volver a verla en colores (s�lo despu�s de haber sido
 * dibujada, por supuesto).
 *
 * Esta clase fu� escrita como un ejemplo temprano para ense�ar Java con BlueJ.
 *  
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class Cuadro
{
    private Cuadrado pared;
    private Cuadrado ventana;
    private Triangulo techo;
    private Circulo sol;

    /**
     * Constructor para objetos de la clase Cuadro
     */
    public Cuadro()
    {
        // no hace nada... las variables de instancia son autom�ticamente
        // establecidas en un valor null.
    }

    /**
     * Dibuja esta pintura.
     */
    public void dibujar()
    {
        pared = new Cuadrado();
        pared.moverVertical(80);
        pared.cambiarTamano(100);
        pared.hacerVisible();
        
        ventana = new Cuadrado();
        ventana.cambiarColor("black");
        ventana.moverHorizontal(20);
        ventana.moverVertical(100);
        ventana.hacerVisible();

        techo = new Triangulo();  
        techo.cambiarTamano(50, 140);
        techo.moverHorizontal(60);
        techo.moverVertical(70);
        techo.hacerVisible();

        sol = new Circulo();
        sol.cambiarColor("yellow");
        sol.moverHorizontal(180);
        sol.moverVertical(-10);
        sol.cambiarTamano(60);
        sol.hacerVisible();
    }

    /**
     * Cambia esta pintura para ser mostrada en blanco y negro
     */
    public void setBlancoYNegro()
    {
        if(pared != null)   // s�lo si ya estaba pintada...
        {
            pared.cambiarColor("black");
            ventana.cambiarColor("white");
            techo.cambiarColor("black");
            sol.cambiarColor("black");
        }
    }

    /**
     * Cambia esta pintura para ser mostrada en colores
     */
    public void setColor()
    {
        if(pared != null)   // s�lo si ya estaba pintada...
        {
            pared.cambiarColor("red");
            ventana.cambiarColor("black");
            techo.cambiarColor("green");
            sol.cambiarColor("yellow");
        }
    }

    private static class Circulo {

        public Circulo() {
        }
    }
}
