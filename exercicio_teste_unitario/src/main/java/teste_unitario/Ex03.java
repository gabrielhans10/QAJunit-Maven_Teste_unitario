package teste_unitario;

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String [] args) {   
        String Nome = ( JOptionPane.showInputDialog("Digite seu nome:"));
        Nome = "Gabriel" ;
        System.out.println("seu nome é" + Nome);
        
}

    /**
     * @return
     */
    public static Object retorneNome() {
        return "Gabriel";
    }
}
