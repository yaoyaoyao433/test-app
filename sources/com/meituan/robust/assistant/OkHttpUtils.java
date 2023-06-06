package com.meituan.robust.assistant;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.httpdns.g;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OkHttpUtils {
    private static v client;
    private static boolean isHttpDnsInit;

    static {
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        client = b.a(vVar);
        isHttpDnsInit = false;
    }

    public static void initHttpDns(Context context) {
        if (isHttpDnsInit) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("api.meituan.com");
        copyOnWriteArrayList.add("apimobile.meituan.com");
        com.meituan.android.httpdns.b bVar = new com.meituan.android.httpdns.b(copyOnWriteArrayList);
        g.a aVar = new g.a();
        aVar.b = bVar;
        client.s = aVar.a(context);
        isHttpDnsInit = true;
    }

    public static Boolean simpleDownload(String str, File file, boolean z) {
        if (file != null && file.exists() && !z) {
            return Boolean.TRUE;
        }
        file.delete();
        try {
            z a = client.a(new x.a().a(str).a()).a();
            if (!a.c()) {
                return Boolean.FALSE;
            }
            byte[] bArr = new byte[4096];
            InputStream d = a.g.d();
            new StringBuilder(" download bytes size  ").append(d.available());
            new StringBuilder(" file path ").append(file.getAbsolutePath());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                int read = d.read(bArr);
                if (read > 0) {
                    new StringBuilder(" download bytes size  ").append(read);
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return Boolean.TRUE;
                }
            }
        } catch (Throwable th) {
            ThrowableReporter.report(th);
            return Boolean.FALSE;
        }
    }

    public static String simpleGet(String str) throws IOException {
        z a = client.a(new x.a().a(str).a()).a();
        StringBuilder sb = new StringBuilder("request response ");
        sb.append(a.c());
        sb.append("   ");
        sb.append(a.toString());
        if (a.c()) {
            return a.g.f();
        }
        throw new IOException("request failed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }
}
