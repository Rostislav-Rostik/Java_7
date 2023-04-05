import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GroupedFields extends JFrame {
    private JTextField inputField;
    private JTextField outputField;

    public GroupedFields() {
        super("Grouped Fields Application");

        // Створення елементів
        JLabel inputLabel = new JLabel("Введіть текст: ");
        inputField = new JTextField(20);

        JLabel outputLabel = new JLabel("Поле для виводу: ");
        outputField = new JTextField(20);
        outputField.setEditable(false); // Поле виводу не редаговане

        JButton copyButton = new JButton("Копіювати");

        // Створення панелей
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputLabel, BorderLayout.CENTER);
        inputPanel.add(inputField, BorderLayout.SOUTH);

        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(outputLabel, BorderLayout.CENTER);
        outputPanel.add(outputField, BorderLayout.SOUTH);

        // Розміщення панелей
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(inputPanel, BorderLayout.CENTER);
        c.add(outputPanel, BorderLayout.SOUTH);
        c.add(copyButton, BorderLayout.EAST);

        // Додавання обробників подій
        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                outputField.setText(text);
            }
        });

        // Налаштування вікна
        setSize(400, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GroupedFields();
    }
}
