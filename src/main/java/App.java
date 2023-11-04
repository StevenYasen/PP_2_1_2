import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        Cat firstCat = applicationContext.getBean("getCat", Cat.class);
        Cat secondCat = (Cat)applicationContext.getBean("getCat");
        System.out.println(bean==bean1);
        System.out.println(firstCat==secondCat);
    }
}