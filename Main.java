import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    // Declare GUI components
    private JTextField firstNameField, lastNameField, ageField, mobileNumberField, emailField;
    private JComboBox<String> sexComboBox;
    private JSpinner birthdaySpinner;
    private JButton submitButton;

    // Constructor
    public Main() {
        // Set frame properties
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10)); // Grid layout with 8 rows and 2 columns

        // Initialize GUI components
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel sexLabel = new JLabel("Sex:");
        JLabel birthdayLabel = new JLabel("Birthday:");
        JLabel mobileNumberLabel = new JLabel("Mobile Number:");
        JLabel emailLabel = new JLabel("Email Address:");

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        ageField = new JTextField();
        sexComboBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        birthdaySpinner = new JSpinner(new SpinnerDateModel());
        mobileNumberField = new JTextField();
        emailField = new JTextField();
        submitButton = new JButton("Submit");

        // Add components to the frame
        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(ageLabel);
        add(ageField);
        add(sexLabel);
        add(sexComboBox);
        add(birthdayLabel);
        add(birthdaySpinner);
        add(mobileNumberLabel);
        add(mobileNumberField);
        add(emailLabel);
        add(emailField);
        add(new JLabel()); // Empty label for spacing
        add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve and print form data
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String age = ageField.getText();
                String sex = (String) sexComboBox.getSelectedItem();
                String birthday = birthdaySpinner.getValue().toString();
                String mobileNumber = mobileNumberField.getText();
                String email = emailField.getText();

                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Age: " + age);
                System.out.println("Sex: " + sex);
                System.out.println("Birthday: " + birthday);
                System.out.println("Mobile Number: " + mobileNumber);
                System.out.println("Email Address: " + email);
            }
        });

        // Set frame visibility
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of RegistrationForm
        new Main();
    }
}
