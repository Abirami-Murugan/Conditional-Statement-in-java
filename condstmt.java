class condstmt{

static int no1 = 10;

public static void main(String[] args){


condstmt cd = new condstmt();
//cd.identifyno();
//cd.identifyno2();
//cd.passmark();
//cd.passtrue();
//cd.markgrade();
//cd.passboth();
//cd.centumBothGift();
//cd.centumSingleSubjectGift();
cd.markGift();
}

public void markGift(){

int mark1 = 100, mark2 = 100;

if(mark1 == 100)
{
  if(mark2==100)
  {
    System.out.println("200 Rs Gift");
  }
  else
  {
  System.out.println("100 Rs is Gift");
  }
}
else
{
System.out.println("50 Rs is Gift");
}
}



public void centumSingleSubjectGift(){

int mark1 = 98,mark2 =100;

if(mark1 == 100 || mark2 == 100)
{
System.out.println("Gift");
}
}

public void centumBothGift(){

int mark1 = 100,mark2=100;
{

if(mark1==100 && mark2 == 100)
{
System.out.println("Gift");
}
}
}



public void passboth(){

int mark1 = 25 ,mark2 = 25;

if(mark1 >=35 && mark2 >=35)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}

public void markgrade(){

int mark=70;

if(mark>80)
{
System.out.println("A");
}
else if(mark>70)
{
System.out.println("B");
}
else
{
System.out.println("C");
}
}

public void passtrue()
{

if(true)
{
System.out.println("pass");
}


}

public void passmark()
{

int mark = 25;

if(mark>=35)
{
System.out.println("pass");
}

else
{
System.out.println("fail");
}

}

public void identifyno2(){


int no1 = 8;

if(no1>9)
{
System.out.println("Two digit number");
}
else
{
System.out.println("Single digit number");
}
}


public void identifyno(){

int no1 = 10;
if(no1>9)
{
System.out.println("Two digit number");
}

}
}

