package com.alipay.sdk.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static final CookieManager a = new CookieManager();

    /* compiled from: ProGuard */
    /* renamed from: com.alipay.sdk.net.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0028a {
        public final String a;
        public final byte[] b;
        public final Map<String, String> c;

        public C0028a(String str, Map<String, String> map, byte[] bArr) {
            this.a = str;
            this.b = bArr;
            this.c = map;
        }

        public final String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.a, this.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public final Map<String, List<String>> a;
        public final String b;
        public final byte[] c;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.a = map;
            this.b = str;
            this.c = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alipay.sdk.net.a.b a(android.content.Context r11, com.alipay.sdk.net.a.C0028a r12) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.net.a.a(android.content.Context, com.alipay.sdk.net.a$a):com.alipay.sdk.net.a$b");
    }

    private static Proxy a(Context context) {
        String c = c(context);
        if (c == null || c.contains("wap")) {
            try {
                String property = System.getProperty("https.proxyHost");
                String property2 = System.getProperty("https.proxyPort");
                if (TextUtils.isEmpty(property)) {
                    return null;
                }
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private static String c(Context context) {
        try {
            NetworkInfo b2 = b(context);
            return (b2 == null || !b2.isAvailable()) ? "none" : b2.getType() == 1 ? "wifi" : b2.getExtraInfo().toLowerCase();
        } catch (Exception unused) {
            return "none";
        }
    }

    private static NetworkInfo b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
