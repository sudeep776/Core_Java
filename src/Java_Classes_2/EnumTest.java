package Java_Classes_2;

public class EnumTest {
    public static void main(String[] args) {
        for(EnumClass c1:EnumClass.values()){
            System.out.println(c1);
        }

        //
        EnumClass enumSample = EnumClass.valueOf("FRIDAY");
        System.out.println(enumSample.name());

        EnumSample enumSample1 = EnumSample.TUESDAY;
        enumSample1.getEnumfromValue(101);
        System.out.println(enumSample1.getComment());
        enumSample1.dummyMethod();
        System.out.println(enumSample1.toLowerCase());
    }
}
