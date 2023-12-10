package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.vlaue = " + dataA.value);
        System.out.println("dataB.vlaue = " + dataB.value);

        // dataA value 변경
        dataA.value = 20;
        System.out.println("dataA.value 변경");
        System.out.println("dataA.vlaue = " + dataA.value);
        System.out.println("dataB.vlaue = " + dataB.value);

        // dataA value 변경
        dataB.value = 30;
        System.out.println("dataB.value 변경");
        System.out.println("dataA.vlaue = " + dataA.value);
        System.out.println("dataB.vlaue = " + dataB.value);
    }
}
