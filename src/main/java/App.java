import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        //Сравнение Cat по ссылке
        System.out.println(beanCat1==beanCat2);
        //Сравнение HelloWorld по ссылке
        System.out.println(bean==bean1);


    }
}