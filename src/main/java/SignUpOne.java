import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SignUpOne extends JFrame{
    
    SignUpOne(){
        
        setLayout(null);
        
        Random rdm = new Random();
        Long num = Math.abs((rdm.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO: " + num);
        formno.setFont(new Font("Roleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Roleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 250, 30);
        add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Roleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        JTextField nameTextField= new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel frame = new JLabel("Fathers  Name:");
        frame.setFont(new Font("Roleway", Font.BOLD, 20));
        frame.setBounds(100, 190, 200, 30);
        add(frame);
        
        JTextField frameTextField= new JTextField();
        frameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        frameTextField.setBounds(300, 190, 400, 30);
        add(frameTextField);
        
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Roleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        JTextField dobTextField= new JTextField();
        dobTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        dobTextField.setBounds(300, 240, 400, 30);
        add(dobTextField);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Roleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Roleway", Font.BOLD, 18));
        male.setBounds(300, 290, 70, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Roleway", Font.BOLD, 18));
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Roleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        JTextField emailTextField= new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        JLabel mStatus = new JLabel("Marital Status:");
        mStatus.setFont(new Font("Roleway", Font.BOLD, 20));
        mStatus.setBounds(100, 390, 200, 30);
        add(mStatus);
        
        JRadioButton married = new JRadioButton("Married");
        married.setFont(new Font("Roleway", Font.BOLD, 18));
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Roleway", Font.BOLD, 18));
        unmarried.setBounds(450, 390, 150, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        JRadioButton other = new JRadioButton("Other");
        other.setFont(new Font("Roleway", Font.BOLD, 18));
        other.setBounds(600, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup mgroup = new ButtonGroup();
        mgroup.add(married);
        mgroup.add(unmarried);
        mgroup.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Roleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        JTextField addressTextField= new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Roleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        JTextField cityTextField= new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Roleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        JTextField stateTextField= new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Roleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        JTextField pinCodeTextField= new JTextField();
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        pinCodeTextField.setBounds(300, 590, 400, 30);
        add(pinCodeTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 80, 30);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 750);
        setLocation(350, 10);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new SignUpOne();
    }
}
