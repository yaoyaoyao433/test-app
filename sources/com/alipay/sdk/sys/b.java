package com.alipay.sdk.sys;

import android.content.Context;
import com.alipay.sdk.util.d;
import com.ta.utdid2.device.UTDevice;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static b a;
    public Context b;

    public static b a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    public static boolean b() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Context context) {
        com.alipay.sdk.data.b.a();
        this.b = context.getApplicationContext();
    }

    public final String c() {
        try {
            return UTDevice.getUtdid(this.b);
        } catch (Throwable th) {
            d.a(th);
            return "getUtdidEx";
        }
    }
}
