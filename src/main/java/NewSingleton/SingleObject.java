package NewSingleton;

public class SingleObject
{
    private static SingleObject instancia = new SingleObject(); //Creamos un objeto de SingleObject
    private static SingleObject instancia2 = new SingleObject();
    private SingleObject(){}                                    //Hacemos el constructor privado para que no pueda ser instanciado
    public static SingleObject getInstancia()                   //Hacemos un get del unico objeto disponible
    {
        return instancia;
    }
    public static SingleObject getInstancia2()
    {
        return instancia2;
    }

    public void showMessage()
    {
        System.out.println("Hello Singleton!");
    }
}


/*

public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
 */