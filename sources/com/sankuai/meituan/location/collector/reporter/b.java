package com.sankuai.meituan.location.collector.reporter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public class b extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2429b099a2eed563f388f7ec427754c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2429b099a2eed563f388f7ec427754c");
            return;
        }
        Handler b = com.sankuai.meituan.location.collector.b.b();
        if (b == null) {
            return;
        }
        b.post(new Runnable() { // from class: com.sankuai.meituan.location.collector.reporter.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Context context2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eedeaa3f1f486a097c42d43f689dc0d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eedeaa3f1f486a097c42d43f689dc0d1");
                } else if (context == null) {
                } else {
                    if ("com.meituan.android.common.locate.reporter".equals(intent != null ? intent.getAction() : null)) {
                        try {
                            context2 = context.getApplicationContext();
                        } catch (Throwable th) {
                            LogUtils.a(getClass(), th);
                            context2 = null;
                        }
                        if (context2 == null) {
                            return;
                        }
                        LogUtils.a("ReporterAlarmReceiver received");
                        com.sankuai.meituan.location.collector.io.a.a();
                    }
                }
            }
        });
    }
}
