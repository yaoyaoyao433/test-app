package com.huawei.updatesdk.b.d;

import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.mtmap.rendersdk.MapConstant;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    private static volatile d a;

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (a == null) {
                a = new d();
            }
            dVar = a;
        }
        return dVar;
    }

    public static String b() {
        String b = com.huawei.updatesdk.a.b.a.a.c().b();
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        String str = b + "/updatesdk";
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : "";
    }

    public HttpURLConnection a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        httpURLConnection.setConnectTimeout(MapConstant.LayerPropertyFlag_RasterOpacity);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setInstanceFollowRedirects(true);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(com.huawei.secure.android.common.ssl.b.a(com.huawei.updatesdk.a.b.a.a.c().a()));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
        return httpURLConnection;
    }
}
