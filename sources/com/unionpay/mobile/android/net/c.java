package com.unionpay.mobile.android.net;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.unionpay.mobile.android.utils.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
/* loaded from: classes6.dex */
public final class c {
    private HttpURLConnection a = null;
    private byte[] b = null;
    private String c = null;
    private InputStream d = null;
    private d e;
    private Context f;

    public c(d dVar, Context context) {
        this.e = null;
        this.e = dVar;
        this.f = context;
    }

    public final int a() {
        String str;
        String message;
        HttpURLConnection httpURLConnection;
        k.a("uppay", "HttpConn.connect() +++");
        int i = 1;
        if (this.e == null) {
            k.c("uppay", "params==null!!!");
            return 1;
        }
        try {
            URL a = this.e.a();
            if ("https".equals(a.getProtocol().toLowerCase())) {
                httpURLConnection = (HttpsURLConnection) HttpURLWrapper.wrapURLConnection(a.openConnection());
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new a(this.f).a().getSocketFactory());
            } else {
                httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(a.openConnection());
            }
            httpURLConnection.setRequestMethod(this.e.b());
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setUseCaches(false);
            HashMap<String, String> d = this.e.d();
            if (d != null) {
                for (String str2 : d.keySet()) {
                    httpURLConnection.setRequestProperty(str2, d.get(str2));
                }
            }
            String b = this.e.b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 70454) {
                if (hashCode == 2461856 && b.equals("POST")) {
                    c = 1;
                }
            } else if (b.equals("GET")) {
                c = 0;
            }
            switch (c) {
                case 1:
                    httpURLConnection.setDoOutput(true);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                    outputStreamWriter.write(this.e.c());
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    break;
            }
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                this.d = httpURLConnection.getInputStream();
                if (this.d != null) {
                    this.c = e.a(this.d, "UTF-8");
                    i = 0;
                }
            } else if (httpURLConnection.getResponseCode() == 401) {
                i = 8;
            } else {
                k.c("uppay", "http status code:" + httpURLConnection.getResponseCode());
            }
        } catch (IllegalStateException e) {
            str = "uppay";
            if ("e2: ".concat(String.valueOf(e)) != null) {
                message = e.getMessage();
                k.c(str, message);
            }
            message = "e == null";
            k.c(str, message);
        } catch (SSLHandshakeException e2) {
            k.a("uppay", "e0:" + e2.getMessage());
            i = 4;
        } catch (IOException e3) {
            str = "uppay";
            if ("e1: ".concat(String.valueOf(e3)) != null) {
                message = e3.getMessage();
                k.c(str, message);
            }
            message = "e == null";
            k.c(str, message);
        } catch (Exception e4) {
            str = "uppay";
            if ("e3: ".concat(String.valueOf(e4)) != null) {
                message = e4.getMessage();
                k.c(str, message);
            }
            message = "e == null";
            k.c(str, message);
        }
        k.a("uppay", "HttpConn.connect() ---");
        return i;
    }

    public final byte[] b() {
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        return this.c.getBytes();
    }

    public final String c() {
        return this.c;
    }
}
