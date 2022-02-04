import java.awt.*;
import java.awt.event.*;
public class Form extends Frame implements ActionListener{
    TextField name , address,DOB;
    Label name1,address1,DOB1;
    Button button;
    public Form(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("FORM");
        

        name1=new Label("Name : ");
        address1=new Label("Address : ");
        DOB1 =new Label("DOB : ");

        name = new TextField(30);
        address = new TextField(30);
        DOB = new TextField(30);
        
        button = new Button("submit");
        add(name1);
        add(name);

        add(address1);
        add(address);

        add(DOB1);
        add(DOB);
        


        add(button);
        button.addActionListener(this);

        setBounds(200, 500, 300,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("name : "+name.getText());
        System.out.println("Address: "+address.getText());
        System.out.println("DOB : "+DOB.getText());
        
         }
        public static void main(String [] args){
        new Form();
    }
    
}
