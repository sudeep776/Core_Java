package Collections.ExceptionHandling;

public class ThrowsClassNotFound {
    public static void loadClass(String className) throws ClassNotFoundException{
        Class.forName(className);
        System.out.println("Class loaded");
    }

    public static void main(String[] args) {
     try{
        loadClass("com.example.NonExistentClass");
     }
     catch (ClassNotFoundException e){
         System.out.println("Class not found "+e.getMessage());
     }
    }
}

