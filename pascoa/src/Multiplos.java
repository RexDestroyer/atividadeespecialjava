import javax.swing.JOptionPane;

public class Multiplos {

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Esse é um Programa para exibir todos os múltiplos de 3 e 5 abaixo de 1000",
        "Início", JOptionPane.INFORMATION_MESSAGE);

    for (int i = 1; i < 1000; i++) {
      int j = Math.floorMod(i, 3);
      int z = Math.floorMod(i, 5);
      if ((j == 0) || (z == 0)) {
        JOptionPane.showMessageDialog(null, i, "Múltiplos", JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }
}
