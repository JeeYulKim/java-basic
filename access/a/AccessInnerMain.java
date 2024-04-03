package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        //public, default, protected 접근 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        accessData.defaultField = 2;
        accessData.defaultMethod();

        accessData.innerAccess();

    }
}
