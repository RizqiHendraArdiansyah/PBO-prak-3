public class EncapTest {
    public static void main(String[] args) throws Exception
    {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(10);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
