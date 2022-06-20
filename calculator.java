
/*Programmed by : Mayyas Qasem  */
			
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mycalculator extends JFrame implements ActionListener
{
	JTextField t;
	JButton b1,b2,b3,b4,b5
			,b6,b7,b8,b9,b10
			,b11,b12,b13,b14,b15
			,b16,b17,b18,b19,b20;
	StringBuffer s1;
	StringBuffer s2;
	String s;
	int i,j,onCal;
	boolean cal,del,delAns;
	double x;
	double y,Ans;
	public mycalculator()
	{
		t=new JTextField(20);
		s1=new StringBuffer();
		s2=new StringBuffer();
		i=-1;
		cal=true;
		del=false;
		delAns=false;
		///////////////////////
		b1=new JButton("7");
		b2=new JButton("8");
		b3=new JButton("9");
		b4=new JButton("C");
		b5=new JButton("AC");
		///////////////////////
		b6=new JButton("4");
		b7=new JButton("5");
		b8=new JButton("6");
		b9=new JButton("*");
		b10=new JButton("/");
		///////////////////////
		b11=new JButton("1");
		b12=new JButton("2");
		b13=new JButton("3");
		b14=new JButton("+");
		b15=new JButton("-");
		///////////////////////
		b16=new JButton("0");
		b17=new JButton(".");
		b18=new JButton("%");
		b19=new JButton("An");
		b20=new JButton("=");
		///////////////////////
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);///5
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);///5
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);///5
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		t.setEditable(false);
		Container cr=getContentPane();
		cr.setLayout(new FlowLayout());
		cr.add(t);
		cr.add(b1);
		cr.add(b2);
		cr.add(b3);
		cr.add(b4);
		cr.add(b5);
		cr.add(b6);
		cr.add(b7);
		cr.add(b8);
		cr.add(b9);
		cr.add(b10);
		cr.add(b11);
		cr.add(b12);
		cr.add(b13);
		cr.add(b14);
		cr.add(b15);
		cr.add(b16);
		cr.add(b17);
		cr.add(b18);
		cr.add(b19);
		cr.add(b20);
		setSize(260,200);
		setVisible(true);
		setResizable(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("7");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b2)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("8");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b3)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("9");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b6)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("4");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b7)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("5");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b8)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("6");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b11)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("1");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b12)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("2");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b13)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
			}
			s1.append("3");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b16)
		{
			if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
				cal=false;
			}
			s1.append("0");
			i++;
			if(!cal)
				y=Double.parseDouble(s1.toString());
			else
			{
				del=false;
				x=Double.parseDouble(s1.toString());
			}
		}
		if(e.getSource()==b17)
		{
		if(del)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				del=false;
				cal=false;
			}
			if((s1.toString()).indexOf('.')<0)
			{
				s1.append(".");
				i++;
			}//////////////
		}
		if(e.getSource()==b4)
		{
			if(delAns)
			{
				s1.delete(0,i+1);
				i=-1;
				t.setText(s1.toString());
				delAns=false;
			}

			if(i>-1)
			{
				i=(s1.toString()).length()-1;
				s1.deleteCharAt(i);
				if(i>0)
				{
					if(!cal)
						y=Double.parseDouble(s1.toString());
					else
					{
						x=Double.parseDouble(s1.toString());
						Ans=x;
					}
				}
				else
				{
					if(!cal)
						y=0;
					else
						x=0;
				}
				i--;
			}
		}
		if(e.getSource()==b19)
		{
			s1.delete(0,i+1);
			i=-1;
			t.setText(s1.toString());
			s1.append("Ans");
			i=(s1.toString()).length()-1;
			if(!cal)
				y=Ans;
			else
				x=Ans;
				del=true;
				delAns=true;
		}
		if(e.getSource()==b5)
		{
			s1.delete(0,i+1);
			i=-1;
			del=true;
			delAns=false;
		}
		if(e.getSource()==b9)
		{
			if(del)
				x=Ans;
				onCal=9;
				cal=false;
				del=true;
		}
		if(e.getSource()==b10)
		{
			if(del)
				x=Ans;
			onCal=10;
			cal=false;
			del=true;
		}
		if(e.getSource()==b14)
		{
			if(del)
				x=Ans;
			onCal=14;
			cal=false;
			del=true;
		}
		if(e.getSource()==b15)
		{
			if(del)
				x=Ans;
			onCal=15;
			cal=false;
			del=true;
		}
		if(e.getSource()==b18)
		{
			if(delAns)
			{
				Ans=Ans/100;
				s=Double.toString(Ans);
				s1.delete(0,i+1);
				i=-1;
				s1.append(s);
				i=s.length()-1;
				cal=true;///////
				del=true;
			}
			x=Double.parseDouble(s1.toString());
			Ans=x/100;
			s=Double.toString(Ans);
			s1.delete(0,i+1);
			i=-1;
			s1.append(s);
			i=s.length()-1;
			cal=true;///////
			del=true;
		}
		if(e.getSource()==b20)
		{
			if(!del)
			{
				if(onCal==9)
					Ans=x*y;
				if(onCal==10)
					Ans=x/y;
				if(onCal==14)
					Ans=x+y;
				if(onCal==15)
					Ans=x-y;
				s=Double.toString(Ans);
				i=s.length()-1;
				s1.delete(0,i+1);
				i=-1;
				s1.append(s);
				i=s.length()-1;
				cal=true;
				del=true;
			}
			else if(delAns)
			{
				if(onCal==9)
					Ans=x*y;
				if(onCal==10)
					Ans=x/y;
				if(onCal==14)
					Ans=x+y;
				if(onCal==15)
					Ans=x-y;
				s=Double.toString(Ans);
				i=s.length()-1;
				s1.delete(0,i+1);
				i=-1;
				s1.append(s);
				i=s.length()-1;
				cal=true;
				del=true;
			}
		}
		t.setText(s1.toString());
	}
	public static void main(String args[])
	{
		mycalculator f=new mycalculator();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
