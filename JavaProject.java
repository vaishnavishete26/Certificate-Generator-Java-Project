
    import javax.swing.*;
    import java.awt.event.*;
    import java.awt.*;
    import java.io.File;
    import javax.swing.filechooser.FileNameExtensionFilter;
    import java.util.*;

     class LoginFrame extends JFrame
     {
         JButton b1,b2,b3;
         JLabel l1,l2,l3;
         ImageIcon MyImage , image;
         Image img , newImg;
    
         public LoginFrame()
         {
             super("PILLAI COLLEGE OF ENGINEERING");
             setSize(1000 , 400);
             setResizable(false);
             setLocation(100 , 150); 
             setLayout(null);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
                             
             l1 = new JLabel();
             l1.setBounds(100, 30 , 200 , 200);    

         MyImage = new ImageIcon("5.jpeg");
         img = MyImage.getImage();
         newImg = img.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
         image = new ImageIcon(newImg);

             l1.setIcon(image);  
             add(l1);            

             l2 = new JLabel();
             l2.setBounds(400, 30 , 200 , 200);    

         MyImage = new ImageIcon("7.jpg");
         img = MyImage.getImage();
         newImg = img.getScaledInstance(l2.getWidth(), l2.getHeight(), Image.SCALE_SMOOTH);
         image = new ImageIcon(newImg);

             l2.setIcon(image);  
             add(l2);            

             l3 = new JLabel();
             l3.setBounds(700, 30 , 200 , 200);    

         MyImage = new ImageIcon("8.jpg");
         img = MyImage.getImage();
         newImg = img.getScaledInstance(l3.getWidth(), l3.getHeight(), Image.SCALE_SMOOTH);
         image = new ImageIcon(newImg);

             l3.setIcon(image);  
             add(l3);            

           b1 = new JButton("ALEGRIA"); 
           b1.setBounds(130, 250 , 130 , 30);    
           add(b1);   

           b2 = new JButton("csi-pce"); 
           b2.setBounds(430, 250 , 130 , 30);    
           add(b2);   

           b3 = new JButton("Project Based Learning"); 
           b3.setBounds(700, 250 , 200 , 30);    
           add(b3);   

             b1.addActionListener( new ActionListener()
             {
                   public void actionPerformed(ActionEvent e)
                   {      
                               LoginFrame.this.setVisible(false);
                               new Frame2("ALEGRIA" , LoginFrame.this);            
                   }
             });

             b2.addActionListener( new ActionListener()
             {
                   public void actionPerformed(ActionEvent e)
                   {      
                               LoginFrame.this.setVisible(false);
                               new Frame2("CSI-PCE" , LoginFrame.this);            
                   }
             });

             b3.addActionListener( new ActionListener()
             {
                   public void actionPerformed(ActionEvent e)
                   {      
                               LoginFrame.this.setVisible(false);
                               new Frame2("PROJECT BASED LEARNING" , LoginFrame.this);            
                   }
             });

              setVisible(true); 
         }
   }

   class Frame2 extends JFrame
   {
         LoginFrame lf;   
         JLabel l1,l2,l3,l4,l5,l6;
         JTextField t1,t2,t3,t4;
         ButtonGroup bg1;
         JRadioButton rb1 , rb2;
         JButton b1, b2, b3;

	   
         public Frame2(String str , LoginFrame lf)
         {
             super("PILLAI COLLEGE OF ENGINEERING");
             setSize(700 , 500);
             setResizable(false);
             setLocation(200 , 50); 
             setLayout(null);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
                  this.lf =lf;

              l1 = new JLabel("Enter First Name : ");
              l1.setBounds(80 , 50 , 150 , 30);
              add(l1); 

              t1 = new JTextField();
              t1.setBounds(230 , 50 , 200 , 30);
              add(t1); 

              l2 = new JLabel("Enter Last Name : ");
              l2.setBounds(80 , 100 , 150 , 30);
              add(l2); 

              t2 = new JTextField();
              t2.setBounds(230 , 100 , 200 , 30);
              add(t2); 

             rb1 = new JRadioButton("MALE",true);
             rb2 = new JRadioButton("FEMALE");

             bg1 = new ButtonGroup();
             bg1.add(rb1);
             bg1.add(rb2);
              
             l3 = new JLabel("Select Gender : ");
             l3.setBounds(80,150,150,30);
             add(l3); 

             rb1.setBounds(230 , 150 , 80 , 30);
             rb2.setBounds(330 , 150 , 80 , 30);

             add(rb1);
             add(rb2);

              l4 = new JLabel("Event Name : ");
              l4.setBounds(80 , 190 , 150 , 30);
              add(l4); 
             
              t3 = new JTextField(str);
              Font f = new Font(Font.SERIF , Font.BOLD , 12);
              t3.setFont(f);
              t3.setBounds(230 , 190 , 200 , 30);
              add(t3); 

              l5 = new JLabel("Event Date : ");
              l5.setBounds(80 , 230 , 150 , 30);
              add(l5); 

              b2 = new JButton("SUBMIT DETAILS");
              b2.setBounds(100 , 330 , 150, 30);
              add(b2);

              b3 = new JButton("BACK");
              b3.setBounds(270 , 330 , 150, 30);
              add(b3);

              t4 = new JTextField();
              t4.setBounds(230 , 230 , 200 , 30);
              add(t4); 

              l6 = new JLabel(); 
              l6.setBounds(450 , 30 , 180, 180);
              add(l6); 

              b1 = new JButton("UPLOAD PHOTO");
              b1.setBounds(470 , 230 , 150, 30);
              add(b1);
                
       b3.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                    Frame2.this.setVisible(false);
                    Frame2.this.lf.setVisible(true);
             }
     });

       b2.addActionListener(new ActionListener()
       {
             public void actionPerformed(ActionEvent ae)
             {
                     if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals(""))   
                     {
   JOptionPane.showMessageDialog(Frame2.this,"Please Enter Details","MESSAGE",JOptionPane.PLAIN_MESSAGE); 
                             return;
                     } 

                       String s1 = t1.getText().trim().toUpperCase();
                        s1 = s1 +" "+ t2.getText().trim().toUpperCase();
                       
                       String s2 = t3.getText().trim().toUpperCase();   

                       String s3 = t4.getText().trim().toUpperCase();   

                             Frame2.this.setVisible(false);
                             new Frame3(s1 , s2 , s3);
             }
       });  

     b1.addActionListener(new ActionListener()
     {
        public void actionPerformed(ActionEvent e)
        {
          JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
         
     FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png","jpeg");
    
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
    
      if(result == JFileChooser.APPROVE_OPTION)
      {
              File selectedFile = file.getSelectedFile();
              String path = selectedFile.getAbsolutePath();

              l6.setIcon(ResizeImage(path));
	     
      }
      else if(result == JFileChooser.CANCEL_OPTION)
      {
              System.out.println("No File Select");
      }
        }
    });
                setVisible(true);
         } 

    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(l6.getWidth(), l6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
   }

   class Frame3 extends JFrame
   {
         JLabel l1,l2,l3,l4,l5,l6;

         public Frame3(String str1 , String str2 , String str3)
         {
             super("PILLAI COLLEGE OF ENGINEERING");
             setSize(900 , 400);
             setResizable(false);
             setLocation(200 , 50); 
             setLayout(null);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
    
 
             l1 = new JLabel("CERTIFICATE");
             l1.setForeground(Color.RED);
             l1.setFont(new Font(Font.MONOSPACED , Font.BOLD , 28));  
             l1.setBounds(330 , 30 , 300 , 30);
             add(l1);  
 
             l2 = new JLabel("This is to certify that ");
             l2.setFont(new Font(Font.MONOSPACED , Font.PLAIN , 18));  
             l2.setBounds(280 , 100 , 700 , 30);
             add(l2);  
            
             l3 = new JLabel(str1);
             l3.setForeground(Color.RED);
             l3.setFont(new Font(Font.SERIF , Font.BOLD , 22));  
             l3.setBounds(300 , 150 , 700 , 30);
             add(l3);  

             l4 = new JLabel("has attended the workshop on the topic "+str2);
             l4.setFont(new Font(Font.MONOSPACED , Font.PLAIN, 18));  
             l4.setBounds(130 , 180 , 700 , 30);
             add(l4);  

             l5 = new JLabel("held under the banner of "+str2+" on "+str3);
             l5.setFont(new Font(Font.MONOSPACED , Font.PLAIN, 18));  
             l5.setBounds(130 , 210 , 700 , 30);
             add(l5); 
	  

                setVisible(true);     
         }
   }

     
   public class JavaProject
   {
       public static void main(String [] args)
       {
              new LoginFrame();
       }
   }  

