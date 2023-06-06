package com.meituan.crashreporter;

import android.support.annotation.NonNull;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.task.ThreadManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.snare.s;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g {
    public static ChangeQuickRedirect a = null;
    private static volatile g b = null;
    private static volatile boolean c = true;
    private static long d;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92890161c331d5a1bde3906130295ef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92890161c331d5a1bde3906130295ef5");
        } else {
            d = System.currentTimeMillis();
        }
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0354d3934e05bd45e0750c1822aca41", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0354d3934e05bd45e0750c1822aca41");
        }
        if (b == null) {
            synchronized (g.class) {
                if (b == null) {
                    b = new g();
                }
            }
        }
        return b;
    }

    public final void a(String str, @NonNull s sVar) {
        Object[] objArr = {str, sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9231310589e62712698c9dcadc73e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9231310589e62712698c9dcadc73e10");
        } else if (a(sVar)) {
        } else {
            a(str, sVar.c, "", "");
        }
    }

    public final void a(String str, @NonNull s sVar, String str2) {
        Object[] objArr = {str, sVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d64d6a8c8e45c4a744c0a0d12fc765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d64d6a8c8e45c4a744c0a0d12fc765");
        } else if (a(sVar)) {
        } else {
            a(str, sVar.c, str2, "");
        }
    }

    public final void a(String str, @NonNull s sVar, String str2, @NonNull String str3) {
        Object[] objArr = {str, sVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68b00e5919d816c86c91ce708880d5f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68b00e5919d816c86c91ce708880d5f7");
        } else if (a(sVar)) {
        } else {
            a(str, sVar.c, str2, str3);
        }
    }

    public final void a(String str, String str2, String str3, @NonNull String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4efbe3fe7b1c5b4c70fd32e4462d2f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4efbe3fe7b1c5b4c70fd32e4462d2f0d");
        } else if (c) {
            b(str, str2, str3, str4);
        } else {
            c(str, str2, str3, str4);
        }
    }

    private void b(final String str, final String str2, final String str3, final String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e326dadad7ed7dda1f248cc703f1b840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e326dadad7ed7dda1f248cc703f1b840");
        } else {
            ThreadManager.getInstance().postRunnableDelayed(new Runnable() { // from class: com.meituan.crashreporter.g.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3b88f2a07b9a294039557fec3426ef3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3b88f2a07b9a294039557fec3426ef3");
                    } else {
                        g.this.c(str, str2, str3, str4);
                    }
                }
            }, 8000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65315fff7fd05e77a0d6367389be55f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65315fff7fd05e77a0d6367389be55f4");
            return;
        }
        Logger.getMetricxLogger().d("recordCrashReportEvent", "[eventType]", str, "[path]", str2, "[guid]", str3, "[log]", str4);
        HashMap hashMap = new HashMap();
        hashMap.put("eventType", str);
        hashMap.put("path", str2);
        hashMap.put("guid", str3);
        Babel.logRT(new Log.Builder(str4).value(1L).generalChannelStatus(true).optional(hashMap).tag("crashSLA").build());
        if (!c || System.currentTimeMillis() - d <= 8000) {
            return;
        }
        c = false;
    }

    private boolean a(s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36b98de8e62f1c3600ff69a9c5346f32", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36b98de8e62f1c3600ff69a9c5346f32")).booleanValue() : sVar.g && !sVar.a() && sVar.b;
    }
}
