package billing;

import javax.swing.*;

public class BillGUI extends JFrame {

    public BillGUI() {

        setTitle("Electric Bill");
        setSize(400,400);
        setLayout(null);

        // Labels
        JLabel l1 = new JLabel("Consumer No:");
        l1.setBounds(30,20,120,25);
        add(l1);

        JLabel l2 = new JLabel("Name:");
        l2.setBounds(30,60,120,25);
        add(l2);

        JLabel l3 = new JLabel("Previous Units:");
        l3.setBounds(30,100,120,25);
        add(l3);

        JLabel l4 = new JLabel("Current Units:");
        l4.setBounds(30,140,120,25);
        add(l4);

        JLabel l5 = new JLabel("Connection:");
        l5.setBounds(30,180,120,25);
        add(l5);

        // Fields
        JTextField no = new JTextField();
        no.setBounds(160,20,150,25);
        add(no);

        JTextField name = new JTextField();
        name.setBounds(160,60,150,25);
        add(name);

        JTextField prev = new JTextField();
        prev.setBounds(160,100,150,25);
        add(prev);

        JTextField curr = new JTextField();
        curr.setBounds(160,140,150,25);
        add(curr);

        String[] types = {"domestic","commercial"};
        JComboBox cb = new JComboBox(types);
        cb.setBounds(160,180,150,25);
        add(cb);

        JButton btn = new JButton("Generate Bill");
        btn.setBounds(120,240,150,30);
        add(btn);

        // Button Action
        btn.addActionListener(e -> {
            try {
                EBill bill = new EBill();

                bill.setData(
                        Integer.parseInt(no.getText()),
                        name.getText(),
                        Integer.parseInt(prev.getText()),
                        Integer.parseInt(curr.getText()),
                        cb.getSelectedItem().toString()
                );

                bill.calculate_bill();
                PDFGenerator.generate(bill);

                JOptionPane.showMessageDialog(this,
                        "Total Bill: " + bill.getBill() + " BDT\nPDF Generated!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Please enter valid data!");
            }
        });

        setVisible(true);
    }
}