package com.tencent.connect.auth;

import com.tencent.tauth.IUiListener;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static b a;
    static final /* synthetic */ boolean d = !b.class.desiredAssertionStatus();
    private static int e = 0;
    public HashMap<String, a> b = new HashMap<>();
    public final String c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public IUiListener a;
        public com.tencent.connect.auth.a b;
        public String c;
    }

    public static b a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    public static int b() {
        int i = e + 1;
        e = i;
        return i;
    }

    public String a(a aVar) {
        int b = b();
        try {
            HashMap<String, a> hashMap = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            hashMap.put(sb.toString(), aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        return sb2.toString();
    }

    public String c() {
        int ceil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ceil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * length)]);
        }
        return stringBuffer.toString();
    }
}
