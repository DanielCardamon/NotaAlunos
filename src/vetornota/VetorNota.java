/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetornota;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel

 */
public class VetorNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tot = Integer.parseUnsignedInt(JOptionPane.showInputDialog("Quantidade de alunos"));
        float[ ] nota = new float[tot];
        String []nome = new String[tot];
        float soma = 0,media;
        for( int i = 0; i<tot;i++){
        nome[i] = JOptionPane.showInputDialog("Digite nome do aluno "+ (i+1));
        nota[i]=Float.parseFloat(JOptionPane.showInputDialog("Nota do " + nome[i]));
        soma+=nota[i];
        }
        media = soma/tot;
        for( int i = 0; i<tot;i++){
            if(nota[i]> media)
                System.out.println("Parabems "+nome[i]);
        } 
        
    }
    
}
