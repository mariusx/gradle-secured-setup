package biz.marius.securedsetup.included;

import javax.crypto.spec.SecretKeySpec;

public class IncludedService {
    public void doStuff() {
        System.out.println("true = " + true);
    }

    public Boolean isTrue() {
        return null;
    }

    public void notSoSecure() {
        var secretKeySpec = new SecretKeySpec("my secret here".getBytes(), "AES");
    }
}
