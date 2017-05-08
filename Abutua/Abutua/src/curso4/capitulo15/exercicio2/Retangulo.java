/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso4.capitulo15.exercicio2;

/**
 *
 * @author Marcos.Gomes
 */
public class Retangulo {

    private int altura;
    private int largura;

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        if (altura < 0) {
            altura = (altura * (-1));
        } else if (altura == 0) {
            altura = altura + 1;
        }
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        if (largura < 0) {
            largura = (largura * (-1));
        } else if (largura == 0) {
            largura = largura + 1;
        }

        this.largura = largura;
    }

}
