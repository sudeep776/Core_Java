package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));

        for(Method method:eagleClass.getMethods()){
            System.out.println("name:"+method.getName());
            System.out.println("return_type:"+method.getReturnType());
            System.out.println("class:"+method.getDeclaringClass());
        }

    }
}
