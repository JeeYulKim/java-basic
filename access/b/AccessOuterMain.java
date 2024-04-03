package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        //public만 접근가능

        AccessData accessData = new AccessData();

        accessData.publicField = 10;
        accessData.publicMethod();

        accessData.innerAccess();
    }
}
