import javax.swing.JOptionPane;

public class Fatorial {

    static void Fat() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int f = num;
        while (num > 1) {
            f = f * (num - 1);
            num--;
        }
        JOptionPane.showMessageDialog(null, "O valor do Fatorial é: " + f, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null,
                "Este programa calcula o valor do fatorial de um número, sendo ele inteiro e positivo!", "FATORIAL",
                JOptionPane.INFORMATION_MESSAGE);
        Fat();

    }
}
