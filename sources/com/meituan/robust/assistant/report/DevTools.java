package com.meituan.robust.assistant.report;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.assistant.HostConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DevTools {
    private static v client;

    DevTools() {
    }

    static {
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a = b.a(vVar);
        client = a;
        a.a(300L, TimeUnit.MILLISECONDS);
        client.b(300L, TimeUnit.MILLISECONDS);
        client.c(300L, TimeUnit.MILLISECONDS);
    }

    public static boolean canConnectPatchTestServer() {
        String str;
        try {
            str = simpleGet(getUrl(HostConfig.PATCH_LIST_TEST_URL));
        } catch (IOException e) {
            e.printStackTrace();
            str = null;
        }
        return !TextUtils.isEmpty(str);
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

    private static String getUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        try {
            sb.append("apiLevel=");
            sb.append(Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
        }
        try {
            sb.append("&dev=");
            sb.append(URLEncoder.encode(Build.DEVICE));
        } catch (Throwable unused2) {
        }
        try {
            sb.append("&devModel=");
            sb.append(URLEncoder.encode(Build.MODEL));
        } catch (Throwable unused3) {
        }
        try {
            sb.append("&brand=");
            sb.append(URLEncoder.encode(Build.BRAND));
        } catch (Throwable unused4) {
        }
        try {
            sb.append("&jvmVersion=");
            sb.append(URLEncoder.encode(System.getProperty("java.vm.version")));
        } catch (Throwable unused5) {
        }
        try {
            sb.append("&cpuArc=");
            sb.append(URLEncoder.encode(Build.CPU_ABI));
        } catch (Throwable unused6) {
        }
        try {
            sb.append("&robustVersion=");
            sb.append(URLEncoder.encode("0.8.28"));
        } catch (Throwable unused7) {
        }
        return str + sb.toString();
    }
}
