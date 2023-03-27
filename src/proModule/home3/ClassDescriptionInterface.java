package proModule.home3;

public class ClassDescriptionInterface {
    public void checkInterface(Class<?> clazz){
        if(clazz.isAnnotationPresent(IsLike.class)){
            System.out.println(clazz.getAnnotation(IsLike.class).bool);
        }else{
            System.out.println("У этого класса нет анатации IsLike");
        }
    }
}
