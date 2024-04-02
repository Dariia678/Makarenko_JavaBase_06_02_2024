package ua.hillel.makarenko.lessons.lesson14.classes;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car("BMW", 60, "BLACK", 123.3, "qwe");
//
//        Car.Door door = new Car.Door("qwe");



        DemoInterface demoInterface = new DemoInterface() {
            @Override
            public void demoMethodFromInterface() {
                System.out.println("test");
            }
        };

        DemoAbstractClass demoAbstractClass = new DemoAbstractClass() {
            @Override
            void demoMethodFromAbstractClass() {
                System.out.println("test 2");
            }

            @Override
            void demoMethodFromAbstractClass2() {

            }

            @Override
            void demoMethodFromAbstractClass3() {

            }
        };


//        demoInterface.demoMethodFromInterface();
//        demoAbstractClass.demoMethodFromAbstractClass();


//        DemoClassisClass demoClassisClass = new DemoClassisClass();
//        demoClassisClass.demoMethod1();
//        demoClassisClass.demoMethod2();
//        demoClassisClass.demoMethod3();
//        demoClassisClass.demoMethod4();

//        Если хотим что-то поменять:
        DemoClassisClass demoClassisClass2 = new DemoClassisClass() {

            @Override
            public void demoMethod3() {
                System.out.println("NEW VERSION efrewrwerwer");
            }

            @Override
            public void demoMethod4() {
                System.out.println("NEW VERSION");
            }
        };

        demoClassisClass2.demoMethod1();
        demoClassisClass2.demoMethod2();
        demoClassisClass2.demoMethod3();
        demoClassisClass2.demoMethod4();
    }
}
