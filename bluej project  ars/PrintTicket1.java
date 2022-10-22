import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintTicket1 extends JFrame
{
    
    public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
    {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        

        JPanel Panel2 = new JPanel(null);

        Panel2.setPreferredSize(new Dimension(500,200));
        
        JLabel LEmptyy = new JLabel("<html><font color=\"#ffffff\">---------------------------------------------------------------------------------------------------------------------------------------------------------------------------</font></html>");

        JLabel LTitle = new JLabel("<html><b><font color=\"#C71585\",size=\"7\">AirLine Ticket</font></b></html>");
        JLabel LFrom = new JLabel("<html><b><font color=\"#ffffff\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#ffffff\">"+ sFrom+"</font></html>" );
        JLabel LTo = new JLabel("<html><font color=\"#ffffff\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#ffffff\">"+sTo+"</font></html>");
        JLabel LClass = new JLabel("<html><font color=\"#ffffff\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#ffffff\">"+sClass+"</font></html>" );
        JLabel LBookingDate = new JLabel("<html><font color=\"#ffffff\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#ffffff\">"+ sBookingDate+"</font></html>" );
        JLabel LPrice = new JLabel("<html><font color=\"#ffffff\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#ffffff\">"+ iPrice+"</font></html>" );
        JLabel LTime = new JLabel("<html><font color=\"#ffffff\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#ffffff\">"+ sTime+"</font></html>" );
        JLabel LAdult = new JLabel("<html><font color=\"#ffffff\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#ffffff\">"+iAdult+"</font></html>" );
        JLabel LChildren = new JLabel("<html><font color=\"#ffffff\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#ffffff\">"+ iChildren+"</font></html>" );
        JLabel LInfant = new JLabel("<html><font color=\"#ffffff\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#ffffff\">"+iInfant+"</font></html>" );
        JLabel LWishes = new JLabel("<html><body><I><font color=\"#00FF00\">Wish you a happy journey.........</font></I></body></html>");


        JLabel LTicketNo=new JLabel("<html><font color=\"#ffffff\">Ticket Number &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");
        JLabel LBookedBy=new JLabel("<html><font color=\"#ffffff\">Booked By &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: Raushan (Agent for ON-LINE bookings)<font color=\\\"#ffffff\\\"></font></html>");

        JLabel LEmpty = new JLabel("<html><font color=\"#ffffff\">---------------------------------------------------------------------------------------------------------------------------------------------------------------------------</font></html>");
        JLabel LDemo = new JLabel("<html><U><font color=\"#B22222\">AirLine Management Project Developed By :<p>21432 Rohan Mistry </font></U></I></html>");

        LTitle.setBounds(170,15,500,45);
        LFrom.setBounds(20,80,300,20);

        LTo.setBounds(20,125,300,20);
        LClass.setBounds(20,170,300,20);
        LBookingDate.setBounds(20,215,300,20);
        LPrice.setBounds(20,260,300,20);
        LTime.setBounds(20,305,300,20);
        LAdult.setBounds(20,345,300,20);
        LChildren.setBounds(20,385,300,20);
        LInfant.setBounds(20,430,300,20);

        LWishes.setBounds(530,435,300,20);


        LTicketNo.setBounds(320,80,300,20);
        LBookedBy.setBounds(320,125,300,20);

        LEmpty.setBounds(3,445,1000,20);
        LEmptyy.setBounds(0,50,900,20);


        LDemo.setBounds(30,465,300,120);

        Panel2.add(LTitle);
        Panel2.add(LFrom);
        Panel2.add(LTo);
        Panel2.add(LClass);
        Panel2.add(LBookingDate);
        Panel2.add(LAdult);
        Panel2.add(LChildren);
        Panel2.add(LInfant);
        Panel2.add(LPrice);
        Panel2.add(LTime);
        Panel2.add(LEmpty);

        Panel2.add(LWishes);

        Panel2.add(LTicketNo);
        Panel2.add(LBookedBy);
        Panel2.add(LEmptyy);
        Panel2.add(LDemo);



        Panel2.setBackground(Color.black);

        c.add(Panel2, BorderLayout.CENTER);


        //pack();
        setSize(700,650);
        setVisible(true);
    }
}
