package bsu.rfe.java.group8.lab2.Yury.varA4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class MainFrame extends JFrame {
    // Размеры окна приложения в виде констант
    private static final int WIDTH = 500;
    private static final int HEIGHT = 340;
    public double SUM = 0.0;

    // Текстовые поля для считывания значений переменных, как компоненты, совместно используемые в различных методах
    private JTextField textFieldX;
    private JTextField textFieldY;
    private JTextField textFieldZ;

    // Текстовое поле для отображения результата, как компонент, совместно используемый в различных методах
    private JTextField textFieldResult;

    // Группа радио-кнопок для обеспечения уникальности выделения в группе
    private ButtonGroup radioButtons = new ButtonGroup();

    // Контейнер для отображения радио-кнопок
    private Box hboxFormulaType = Box.createHorizontalBox();
    private int formulaId = 1;

    // Формула №1 для рассчѐта
    public Double calculate1(Double x, Double y, Double z) {
        if (x == 0) {
            JOptionPane.showMessageDialog(MainFrame.this,
                    "X не может равняться 0", " " + "Ошибка ввода", JOptionPane.WARNING_MESSAGE);
            return 0.0;
        }

        if (z == -1) {
            JOptionPane.showMessageDialog(MainFrame.this,
                    "Z не может равняться -1", " " + "Ошибка ввода", JOptionPane.WARNING_MESSAGE);
            return 0.0;
        }
        return Math.pow(Math.pow(Math.sin(y) + Math.pow(y, 2) + Math.pow(Math.E, Math.cos(y)), 2)
                + Math.pow((Math.log(z * z)) + Math.sin(Math.PI * x * x), 3), 0.5);
    }

    // Вспомогательный метод для добавления кнопок на панель
    private void addRadioButton(String buttonName, final int formulaId) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MainFrame.this.formulaId = formulaId;

            }
        });
        radioButtons.add(button);
        hboxFormulaType.add(button);
    }

    public MainFrame() {
        super("ВЫчисление формулы");
	// write your code here
    }

    public static void main(String[] args){
    // write your code here
    }
}
