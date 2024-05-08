package org.example.singleton;

public class SingletonService {

    private static final SingletonService INSTANCE = new SingletonService();

    public static SingletonService getInstance() {
        return INSTANCE;
    }
    private SingletonService() {

    }

    public void logic() {
        System.out.println(" 싱글톤 객체 로직 생성  " );
    }

//    public static void main(String[] args) {
//        SingletonService singletonService1 = SingletonService.getInstance();
//        SingletonService singletonService2 = SingletonService.getInstance();
//    }
}
