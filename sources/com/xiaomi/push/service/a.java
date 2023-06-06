package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.gq;
import com.xiaomi.push.jj;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class a {
    private static a a;
    private static String e;
    private static String f = gq.a(5) + CommonConstant.Symbol.MINUS;
    private static long g = 0;
    private Context b;
    private boolean d;
    private Messenger j;
    private Messenger c = null;
    private List<Message> h = new ArrayList();
    private boolean i = false;

    private a(Context context) {
        this.d = false;
        this.b = context.getApplicationContext();
        if (a()) {
            com.xiaomi.channel.commonutils.logger.c.c("use miui push service");
            this.d = true;
        }
    }

    public static a a(Context context) {
        if (a == null) {
            a = new a(context);
        }
        return a;
    }

    private boolean a() {
        if (com.xiaomi.push.e.f) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.i = false;
        return false;
    }

    private synchronized void b(Intent intent) {
        if (this.i) {
            Message c = c(intent);
            if (this.h.size() >= 50) {
                this.h.remove(0);
            }
            this.h.add(c);
        } else if (this.j == null) {
            this.b.bindService(intent, new au(this), 1);
            this.i = true;
            this.h.clear();
            this.h.add(c(intent));
        } else {
            try {
                this.j.send(c(intent));
            } catch (RemoteException unused) {
                this.j = null;
                this.i = false;
            }
        }
    }

    private static Message c(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    public final boolean a(Intent intent) {
        try {
            if (jj.a() || Build.VERSION.SDK_INT < 26) {
                this.b.startService(intent);
                return true;
            }
            b(intent);
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a(e2);
            return false;
        }
    }
}
