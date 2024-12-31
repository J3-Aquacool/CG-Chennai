/*USE CASE
1. VendingMachine
2. Coffee,Tea
ca
*/




interface Bevarages
{

void prepare();


}


class Tea implements Bevarages
{

public void prepare()
{
System.out.println("Tea Prepraed");
}

}

class Capuchinu implements Bevarages
{
public void prepare()
{
System.out.println("Capuchinu Prepraed");
}
}


class Coffee implements Bevarages
{

public void prepare()
{
System.out.println("Coffee Prepraed");
}

}


class VendingMachine
{

 private Bevarages b;

VendingMachine(Bevarages b)
{
this.b=b;
}

void prepareDrink()
{
b.prepare();
}



}

class App
{

public static void  main(String a[])throws NoInteractionException
{

VendingMachine vm=new VendingMachine(new Capuchinu());
vm.prepareDrink();



}


}


