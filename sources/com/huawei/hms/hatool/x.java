package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class x {
    public static x b = new x();
    public a a = new a();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a {
        public String a;
        public String b;
        public String c;
        public long d = 0;

        public a() {
        }

        public void a(long j) {
            x.this.a.d = j;
        }

        public void a(String str) {
            x.this.a.c = str;
        }

        public void b(String str) {
            x.this.a.a = str;
        }

        public void c(String str) {
            x.this.a.b = str;
        }
    }

    public static x f() {
        return b;
    }

    public String a() {
        return this.a.c;
    }

    public long b() {
        return this.a.d;
    }

    public String c() {
        return this.a.b;
    }

    public void d() {
        long b2 = b();
        if (b2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - b2 > DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME) {
                String str = this.a.a;
                String b3 = com.huawei.secure.android.common.encrypt.utils.b.b(16);
                String a2 = e.a(str, b3);
                this.a.a(currentTimeMillis);
                this.a.c(b3);
                this.a.a(a2);
                return;
            }
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String e = e();
        if (TextUtils.isEmpty(e)) {
            y.f("hmsSdk", "get rsa pubkey config error");
            return;
        }
        String b4 = com.huawei.secure.android.common.encrypt.utils.b.b(16);
        String a3 = e.a(e, b4);
        this.a.b(e);
        this.a.a(currentTimeMillis2);
        this.a.c(b4);
        this.a.a(a3);
    }

    public final String e() {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = b.f().getResources().getAssets().open("hianalytics_njjn");
            try {
                try {
                    String a2 = r0.a(inputStream);
                    r0.a((Closeable) inputStream);
                    return a2;
                } catch (IOException unused) {
                    y.f("hmsSdk", "read pubKey error,the file is corrupted");
                    r0.a((Closeable) inputStream);
                    return null;
                }
            } catch (Throwable th) {
                InputStream inputStream3 = inputStream;
                th = th;
                inputStream2 = inputStream3;
                r0.a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            r0.a((Closeable) inputStream2);
            throw th;
        }
    }
}
