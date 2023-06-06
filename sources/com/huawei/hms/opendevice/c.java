package com.huawei.hms.opendevice;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c {
    public static final String a = "c";
    public static com.huawei.secure.android.common.encrypt.utils.d b;
    public static Map<String, String> c = new HashMap();
    public static final Object d = new Object();

    public static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    public static byte[] a(Context context) {
        byte[] a2 = a.a(context.getString(R.string.push_cat_head));
        byte[] a3 = a.a(context.getString(R.string.push_cat_body));
        return a(a(a(a2, a3), a.a(a())));
    }

    public static com.huawei.secure.android.common.encrypt.utils.d b(Context context) {
        if (b == null) {
            if (g()) {
                b = com.huawei.secure.android.common.encrypt.utils.d.a(c(), d(), b(), f());
            } else {
                HMSLog.w(a, "root key util is null, init root key.");
                d(context);
            }
        }
        return b;
    }

    public static String c(Context context) {
        if (!g()) {
            HMSLog.i(a, "work key is empty, execute init.");
            d(context);
        }
        return com.huawei.secure.android.common.encrypt.aes.a.b(e(), b(context).a());
    }

    public static void d(Context context) {
        synchronized (d) {
            e(context.getApplicationContext());
            if (g()) {
                HMSLog.i(a, "The local secret is already in separate file mode.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(p.a(context.getApplicationContext()));
            sb.append("/shared_prefs/LocalAvengers.xml");
            File file = new File(sb.toString());
            if (file.exists()) {
                if (file.exists() && !file.delete()) {
                    Log.e("IOUtil", "deleteSecure exception");
                }
                HMSLog.i(a, "destroy C, delete file LocalAvengers.xml.");
            }
            byte[] a2 = com.huawei.secure.android.common.encrypt.utils.b.a(32);
            byte[] a3 = com.huawei.secure.android.common.encrypt.utils.b.a(32);
            byte[] a4 = com.huawei.secure.android.common.encrypt.utils.b.a(32);
            byte[] a5 = com.huawei.secure.android.common.encrypt.utils.b.a(32);
            String a6 = a.a(a2);
            String a7 = a.a(a3);
            String a8 = a.a(a4);
            b = com.huawei.secure.android.common.encrypt.utils.d.a(a6, a7, a8, a5);
            a(a6, a7, a8, a.a(a5), com.huawei.secure.android.common.encrypt.aes.a.a(a.a(com.huawei.secure.android.common.encrypt.utils.b.a(32)), b.a()), context);
            HMSLog.i(a, "generate D.");
        }
    }

    public static void e(Context context) {
        if (g()) {
            HMSLog.i(a, "secretKeyCache not empty.");
            return;
        }
        c.clear();
        String a2 = p.a(context);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        String a3 = s.a(a2 + "/files/math/m");
        String a4 = s.a(a2 + "/files/panda/p");
        String a5 = s.a(a2 + "/files/panda/d");
        String a6 = s.a(a2 + "/files/math/t");
        String a7 = s.a(a2 + "/files/s");
        if (t.a(a3, a4, a5, a6, a7)) {
            c.put("m", a3);
            c.put("p", a4);
            c.put("d", a5);
            c.put("t", a6);
            c.put("s", a7);
        }
    }

    public static String f() {
        return a("t");
    }

    public static boolean g() {
        return !TextUtils.isEmpty(e());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length != 0 && bArr2.length != 0) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return new byte[0];
            }
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        }
        return new byte[0];
    }

    public static String c() {
        return a("m");
    }

    public static String b() {
        return a("d");
    }

    public static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] >> 2);
            }
            return bArr;
        }
        return new byte[0];
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Context context) {
        String a2 = p.a(context.getApplicationContext());
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("/files/math/m");
            a("m", str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2);
            sb2.append("/files/panda/p");
            a("p", str2, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a2);
            sb3.append("/files/panda/d");
            a("d", str3, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a2);
            sb4.append("/files/math/t");
            a("t", str4, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a2);
            sb5.append("/files/s");
            a("s", str5, sb5.toString());
        } catch (IOException unused) {
            HMSLog.e(a, "save key IOException.");
        }
    }

    public static String e() {
        return a("s");
    }

    public static String d() {
        return a("p");
    }

    public static void a(String str, String str2, String str3) throws IOException {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i(a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            s.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    c.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter = null;
        }
    }

    public static String a(String str) {
        String str2 = c.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }
}
