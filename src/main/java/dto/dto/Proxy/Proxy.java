package dto.dto.Proxy;

import sun.misc.ProxyGenerator;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Proxy {
    public static void main(String[] args) throws IOException {

        byte[] proxyfiles = ProxyGenerator.generateProxyClass("Proxy@.",new Class[]{CarSellImpl.class});
        OutputStream os = new FileOutputStream("C:\\Users\\YouChuanXia\\Desktop\\ProxyCar.class");
        os.write(proxyfiles);
        os.flush();
        os.close();
    }
}
