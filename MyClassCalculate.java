package HomeWork;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassCalculate {
    public static void main(String[] args){
        try {
            Class<?> clazz = SumCalculate.class;
        for (Method method : clazz.getMethods()) {
            if (method.isAnnotationPresent(TestDriveAnnotation.class));
            TestDriveAnnotation annotation =
method.getAnnotation(TestDriveAnnotation.class);
            method.invoke(null,annotation.a(),annotation.b());
            System.out.println(method);
        }
    }catch (Exception e) {
            System.out.println(e.toString());
        }
        }
    }
