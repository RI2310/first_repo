class firstFile
{
int i=2;
double d,f=0.0;
public void modulus(int j)
{
d=j%2;
System.out.println("The modulus fo given number is :" +d);
}
public void divison(int a,int b)
{
	try {
f= a/b;
System.out.println("The divison value is :" +f);
	}catch(Exception e) {
		System.out.println(e);
	}

}
public static void main(String args[])
{
  firstFile f1= new firstFile();
  f1.modulus(11);
  f1.divison(5,0);
}
}
