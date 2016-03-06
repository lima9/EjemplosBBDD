package NewSingleton;

public class SinglePatternDemo
{
    public static void main(String[] args)
    {
        SingleObject objeto = SingleObject.getInstancia(); //Cogemos el único objeto disponible
        SingleObject objeto2 = SingleObject.getInstancia2();
        objeto2.showMessage();
        objeto.showMessage();                              //Invocamos el metodo de dicho objeto

    }
}


/*
Las situaciones más habituales de aplicación de este patrón
son aquellas en las que dicha clase controla el acceso a un
recurso físico único (como puede ser el ratón o un archivo
abierto en modo exclusivo) o cuando cierto tipo de datos debe
estar disponible para todos los demás objetos de la aplicación.
 */