import javax.swing.JOptionPane;

public class Progressao {

    static void pa() {
        float varI = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor inicial da progressão: "));
        float varF = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor final da progressão: "));
        float varN = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de termos da progressão: "));

        float result = (varN * (varI + varF)) / 2;
        JOptionPane.showMessageDialog(null, "O valor da Soma dos termos dessa PA é: " + result, "RESULTADO ",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void pg() {
        int varI = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da progressão: "));
        int R = Integer.parseInt(JOptionPane.showInputDialog("Digite a Razão da progressão: "));
        int varN = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos da progressão: "));
        int R1 = 1;
        int i = 1;
        for (i = 0; i < varN; i++) {
            R1 = R1 * R;
        }
        JOptionPane.showMessageDialog(null, "A Soma dos Termos da PG é:" + R1, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        int result = (varI * (R1 - 1)) / (R - 1);
        JOptionPane.showMessageDialog(null, "A Soma dos Termos da PG é:" + result, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Esse Programa serve para realizar a soma dos termos de um PA ou PG!",
                "Início", JOptionPane.INFORMATION_MESSAGE);
        String Tip = JOptionPane.showInputDialog("Digite qual tipo de progressão quer fazer a soma: ");

        if (Tip.equals("PA")) {
            pa();
        }
        if (Tip.equals("PG")) {
            pg();
        }
    }
}
