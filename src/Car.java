public class Car  implements AutoCloseable {
    public void drive(){
        System.out.println("машына заведённый стоит");
    }

    @Override
    public void close() {
        System.out.println("машына закрываеться");
    }
}
