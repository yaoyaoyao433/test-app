package com.ta.utdid2.device;

import android.content.Context;
import android.os.Binder;
import android.provider.Settings;
import android.text.TextUtils;
import com.ta.utdid2.a.a.f;
import com.ta.utdid2.a.a.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    public static c a;
    public static final Object e = new Object();
    public static final String k = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: a  reason: collision with other field name */
    public com.ta.utdid2.b.a.c f20a;

    /* renamed from: a  reason: collision with other field name */
    public d f21a;
    public com.ta.utdid2.b.a.c b;
    public String i;
    public String j;
    public Context mContext;
    public String h = null;

    /* renamed from: b  reason: collision with other field name */
    public Pattern f22b = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public c(Context context) {
        this.mContext = null;
        this.f21a = null;
        this.i = "xx_utdid_key";
        this.j = "xx_utdid_domain";
        this.f20a = null;
        this.b = null;
        this.mContext = context;
        this.b = new com.ta.utdid2.b.a.c(context, k, "Alvin2", false, true);
        this.f20a = new com.ta.utdid2.b.a.c(context, ".DataStorage", "ContextData", false, true);
        this.f21a = new d();
        this.i = String.format("K_%d", Integer.valueOf(g.a(this.i)));
        this.j = String.format("D_%d", Integer.valueOf(g.a(this.j)));
    }

    public static c a(Context context) {
        if (context != null && a == null) {
            synchronized (e) {
                if (a == null) {
                    c cVar = new c(context);
                    a = cVar;
                    cVar.c();
                }
            }
        }
        return a;
    }

    private boolean b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f22b.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        com.ta.utdid2.b.a.c cVar = this.b;
        if (cVar != null) {
            if (g.m29a(cVar.getString("UTDID2"))) {
                String string = this.b.getString("UTDID");
                if (!g.m29a(string)) {
                    f(string);
                }
            }
            boolean z = false;
            if (!g.m29a(this.b.getString("DID"))) {
                this.b.remove("DID");
                z = true;
            }
            if (!g.m29a(this.b.getString("EI"))) {
                this.b.remove("EI");
                z = true;
            }
            if (!g.m29a(this.b.getString("SI"))) {
                this.b.remove("SI");
                z = true;
            }
            if (z) {
                this.b.commit();
            }
        }
    }

    private void f(String str) {
        com.ta.utdid2.b.a.c cVar;
        if (b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (cVar = this.b) == null) {
                return;
            }
            cVar.putString("UTDID2", str);
            this.b.commit();
        }
    }

    private void g(String str) {
        com.ta.utdid2.b.a.c cVar;
        if (str == null || (cVar = this.f20a) == null || str.equals(cVar.getString(this.i))) {
            return;
        }
        this.f20a.putString(this.i, str);
        this.f20a.commit();
    }

    private void h(String str) {
        if (f() && b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                String str2 = null;
                try {
                    str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                } catch (Exception unused) {
                }
                if (b(str2)) {
                    return;
                }
                try {
                    Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void i(String str) {
        String str2;
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            str2 = null;
        }
        if (str.equals(str2)) {
            return;
        }
        try {
            Settings.System.putString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
        } catch (Exception unused2) {
        }
    }

    private void j(String str) {
        if (!f() || str == null) {
            return;
        }
        i(str);
    }

    public synchronized String getValue() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        return h();
    }

    private String g() {
        com.ta.utdid2.b.a.c cVar = this.b;
        if (cVar != null) {
            String string = cVar.getString("UTDID2");
            if (g.m29a(string) || this.f21a.c(string) == null) {
                return null;
            }
            return string;
        }
        return null;
    }

    public static String b(byte[] bArr) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(f.a(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return com.ta.utdid2.a.a.b.encodeToString(mac.doFinal(bArr), 2);
    }

    private boolean f() {
        return com.sankuai.meituan.takeoutnew.util.aop.f.a(this.mContext, "android.permission.WRITE_SETTINGS", Binder.getCallingPid(), Binder.getCallingUid()) == 0;
    }

    public synchronized String i() {
        String str;
        String str2 = "";
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
        } catch (Exception unused) {
        }
        if (b(str2)) {
            return str2;
        }
        e eVar = new e();
        boolean z = false;
        try {
            str = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused2) {
            str = null;
        }
        if (g.m29a(str)) {
            z = true;
        } else {
            String e2 = eVar.e(str);
            if (b(e2)) {
                h(e2);
                return e2;
            }
            String d = eVar.d(str);
            if (b(d)) {
                String c = this.f21a.c(d);
                if (!g.m29a(c)) {
                    j(c);
                    try {
                        str = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
                    } catch (Exception unused3) {
                    }
                }
            }
            String d2 = this.f21a.d(str);
            if (b(d2)) {
                this.h = d2;
                f(d2);
                g(str);
                h(this.h);
                return this.h;
            }
        }
        String g = g();
        if (b(g)) {
            String c2 = this.f21a.c(g);
            if (z) {
                j(c2);
            }
            h(g);
            g(c2);
            this.h = g;
            return g;
        }
        String string = this.f20a.getString(this.i);
        if (!g.m29a(string)) {
            String d3 = eVar.d(string);
            if (!b(d3)) {
                d3 = this.f21a.d(string);
            }
            if (b(d3)) {
                String c3 = this.f21a.c(d3);
                if (!g.m29a(d3)) {
                    this.h = d3;
                    if (z) {
                        j(c3);
                    }
                    f(this.h);
                    return this.h;
                }
            }
        }
        return null;
    }

    public synchronized String h() {
        String i = i();
        this.h = i;
        if (!TextUtils.isEmpty(i)) {
            return this.h;
        }
        try {
            byte[] m36c = m36c();
            if (m36c != null) {
                String encodeToString = com.ta.utdid2.a.a.b.encodeToString(m36c, 2);
                this.h = encodeToString;
                f(encodeToString);
                String c = this.f21a.c(m36c);
                if (c != null) {
                    j(c);
                    g(c);
                }
                return this.h;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* renamed from: c  reason: collision with other method in class */
    private byte[] m36c() throws Exception {
        String sb;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int nextInt = new Random().nextInt();
        byte[] bytes = com.ta.utdid2.a.a.d.getBytes((int) (System.currentTimeMillis() / 1000));
        byte[] bytes2 = com.ta.utdid2.a.a.d.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            sb = com.ta.utdid2.a.a.e.a(this.mContext);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(new Random().nextInt());
            sb = sb2.toString();
        }
        byteArrayOutputStream.write(com.ta.utdid2.a.a.d.getBytes(g.a(sb)), 0, 4);
        byteArrayOutputStream.write(com.ta.utdid2.a.a.d.getBytes(g.a(b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }
}
