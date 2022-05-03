public class findClassLoader
/*{
    public static void main(String[] args)
    {
        ClassLoader loader = findClassLoader.class.getClassLoader(); //shorter: findClassLoader.class.getResource("findClassLoader.class");
        System.out.println(loader.getResource("findClassLoader.class"));
    }
}
*/
{
    public static void main(String[] args)
    {
        ClassLoader loader = findClassLoader.class.getResource("findClassLoader.class"); //shorter: ;
    }
}
