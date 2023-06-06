package dianping.com.nvlinker;

import dianping.com.nvlinker.stub.ISharkService;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NVURLStream extends URLStreamHandler {
    private ISharkService networkService = NVLinker.getShark();

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url) throws IOException {
        return open(url);
    }

    @Override // java.net.URLStreamHandler
    protected URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        throw new UnsupportedOperationException("unsupported set proxy operation");
    }

    HttpURLConnection open(URL url) {
        String protocol = url.getProtocol();
        if (protocol.equals("http")) {
            return new NVHttpCon(url, this.networkService);
        }
        if (protocol.equals("https")) {
            return new NVHttpsConn(url, this.networkService);
        }
        throw new IllegalArgumentException("Unexpected protocol: " + protocol);
    }
}
