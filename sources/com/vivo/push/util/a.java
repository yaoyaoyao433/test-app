package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    private static volatile a c;
    private byte[] a;
    private byte[] b;

    private a(Context context) {
        w.b().a(ContextDelegate.getContext(context));
        w b = w.b();
        this.a = b.c();
        this.b = b.d();
    }

    public static a a(Context context) {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a(context.getApplicationContext());
                }
            }
        }
        return c;
    }

    public final String a(String str) throws Exception {
        String a = f.a(a());
        String a2 = f.a(b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(a2.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(a.getBytes("utf-8")));
        return Base64.encodeToString(cipher.doFinal(bytes), 2);
    }

    public final String b(String str) throws Exception {
        return new String(f.a(f.a(a()), f.a(b()), Base64.decode(str, 2)), "utf-8");
    }

    private byte[] a() {
        if (this.a != null && this.a.length > 0) {
            return this.a;
        }
        return w.b().c();
    }

    private byte[] b() {
        if (this.b != null && this.b.length > 0) {
            return this.b;
        }
        return w.b().d();
    }
}
