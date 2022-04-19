import javax.swing.JOptionPane;

public class Fisica {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Esse programa serve para calcaular o espaço percorrido por um MRUV, dada pela fórmula S = S0 + V0 + at²/2.",
                "Início", JOptionPane.INFORMATION_MESSAGE);
        float VI = Float.parseFloat(JOptionPane.showInputDialog("Digite a Velocidade(m/s): "));
        float SI = Float.parseFloat(JOptionPane.showInputDialog("Digite a Espaço Inicial(m): "));
        float A = Float.parseFloat(JOptionPane.showInputDialog("Digite a Aceleração(m/s²): "));
        float T = Float.parseFloat(JOptionPane.showInputDialog("Digite a Tempo(s): "));

        float Espaço = SI + (VI * T) + ((A * (T * T)) / 2);
        JOptionPane.showMessageDialog(null, "O Espaço calculado é: " + Espaço + "m", "RESULTADO",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
