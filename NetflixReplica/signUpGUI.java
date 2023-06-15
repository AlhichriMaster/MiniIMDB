import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUpGUI implements ActionListener{
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userLabel;
    private static JLabel ageLabel;   
    private static JLabel emailLabel;
    private static JLabel passLabel;
    private static JTextField userText; 
    private static JTextField ageText;   
    private static JTextField emailText;  
    private static JPasswordField passText;
    private static JButton loginButton;
    private static JLabel success;




    public signUpGUI(){
        frame = new JFrame();
        panel = new JPanel();

        //creating a GUI window frame and adding a close function
        //We're also adding an invisible panel where we can put all the lables we'll be creating 
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        frame.add(panel);

        placeComponents(panel);
        
        frame.setVisible(true);  
    }


    private void placeComponents(JPanel panel){
        //create and add the username label as well as the text field on the frame  
        userLabel = new JLabel("Name");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        //create and add the password label as well as the password field on the frame   
        ageLabel = new JLabel("Age");
        ageLabel.setBounds(10, 50, 80, 25);
        panel.add(ageLabel);

        ageText = new JTextField(20);
        ageText.setBounds(100, 50, 165, 25);
        panel.add(ageText);


        //create and add the password label as well as the password field on the frame   
        emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 80, 80, 25);
        panel.add(emailLabel);

        emailText = new JTextField(20);
        emailText.setBounds(100, 80, 165, 25);
        panel.add(emailText);


        //create and add the password label as well as the password field on the frame   
        passLabel = new JLabel("Password");
        passLabel.setBounds(10, 110, 80, 25);
        panel.add(passLabel);

        passText = new JPasswordField(20);
        passText.setBounds(100, 110, 165, 25);
        panel.add(passText);



        loginButton = new JButton("Sign Up");
        loginButton.setBounds(10, 140, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        success = new JLabel("");
        success.setBounds(10, 170, 300, 25);
        panel.add(success);
    }




    @Override
    public void actionPerformed(ActionEvent e){
        String username = userText.getText();

        String age = ageText.getText();
        String email = emailText.getText();

        String password = passText.getText();

        userList uList = new userList();

        boolean listNotEmpty = false;
        for(User u : uList.getUsers()){
            if(u.getName().equals(username)){
                success.setText("Name is already in use");
            }else{
                //TODO: make the program add the new user info into the csv file
                success.setText("Sign Up Successful!");
            }
            listNotEmpty = true;
        } 

        if(!listNotEmpty){
            success.setText("List is empty, program not fully developed yet");
        }

    }




    public static void main(String[] args){
        new signUpGUI();
    }
}

