package com.huawei.secure.android.common.ssl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import com.huawei.secure.android.common.ssl.util.f;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static final String a = "SecureX509SingleInstance";
    private static volatile d b;

    private c() {
    }

    @SuppressLint({"NewApi"})
    public static d a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            com.huawei.secure.android.common.ssl.util.c.a(context);
            if (b == null) {
                synchronized (c.class) {
                    if (b == null) {
                        InputStream b2 = com.huawei.secure.android.common.ssl.util.a.b(context);
                        if (b2 == null) {
                            f.a(a);
                            b2 = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            f.a(a);
                        }
                        b = new d(b2, "");
                        com.sankuai.waimai.launcher.util.aop.b.a(new com.huawei.secure.android.common.ssl.util.d(), AsyncTask.THREAD_POOL_EXECUTOR, context);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("SecureX509TrustManager getInstance: cost : ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return b;
        }
        throw new NullPointerException(MonitorManager.CONTEXT_IS_NULL_MSG);
    }
}
