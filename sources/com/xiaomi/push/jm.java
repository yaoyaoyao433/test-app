package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes6.dex */
public final class jm implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ ComponentName b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jm(Context context, ComponentName componentName) {
        this.a = context;
        this.b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager.getComponentEnabledSetting(this.b) != 2) {
                packageManager.setComponentEnabledSetting(this.b, 2, 1);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("close static register of network status receiver failed:" + th);
        }
    }
}
