import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuflama extends JFrame {
    private JTextField diasField;
    private JComboBox<String> vehiculoComboBox;
    private JLabel resultadoLabel;

    public menuflama() {

        setTitle("Sistema de alquiler de Vehiculos");
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel diasLabel = new JLabel("Ingrese los dias de alquiler:");
        diasField = new JTextField();

        JLabel vehiculoLabel = new JLabel("Seleccione el tipo de vehiculo:");
        vehiculoComboBox = new JComboBox<>(new String[]{"Auto", "Minibus", "Camion", "Furgoneta"});

        JButton calcularButton = new JButton("Calcular Alquiler");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularAlquiler();
            }
        });

        resultadoLabel = new JLabel("Resultado: ");

      
        add(diasLabel);
        add(diasField);
        add(vehiculoLabel);
        add(vehiculoComboBox);
        add(calcularButton);
        add(resultadoLabel);
    }

    private void calcularAlquiler() {
        try {
            int dias = Integer.parseInt(diasField.getText());
            if (dias < 1){
                resultadoLabel.setText("Error, ingresame 1 dia por lo menos ¬¬ ");
                return;
            }

            String tipoVehiculo = (String) vehiculoComboBox.getSelectedItem();
            vehiculo vehiculo = null;

            switch (tipoVehiculo) {
                case "Auto":
                    vehiculo = new auto("AAA111", 5);
                    break;
                case "Minibus":
                    vehiculo = new minibus("BBB222", 19); 
                    break;
                case "Camion":
                    vehiculo = new camion("CAM456", 15.0f); 
                    break;
                case "Furgoneta":
                    vehiculo = new furgoneta("FUR789", 2.5f); 
                    break;
            }

            if (vehiculo != null) {
                float totalAlquiler = vehiculo.calcularPrecioAlquiler(dias);
                if (totalAlquiler < 0) {
                    totalAlquiler = 0;
                }
                
                resultadoLabel.setText("El alquiler total es: $" + totalAlquiler);
            }
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Error: Ingrese valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            menuflama menuflama = new menuflama();
            menuflama.setVisible(true);
        });
    }
}
