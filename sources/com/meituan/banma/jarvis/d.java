package com.meituan.banma.jarvis;

import com.meituan.banma.jarvis.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static ScheduledExecutorService b = null;
    private static volatile boolean c = false;

    public static /* synthetic */ boolean a(boolean z) {
        c = true;
        return true;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42d0a3c72de61cd8b4465867c4989b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42d0a3c72de61cd8b4465867c4989b66");
        } else if (!c) {
            e();
        } else {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis: JarvisScheduleService", "init ==>> scheduleExecutor has inited");
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d4c86888115dc8f8bda754b1e4d5a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d4c86888115dc8f8bda754b1e4d5a2a");
        } else if (c) {
            if (b != null) {
                b.shutdownNow();
                b = null;
            }
            e();
        } else {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis: JarvisScheduleService", "restart ==>> scheduleExecutor not inited");
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfea230783cc8693238228b3cee719a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfea230783cc8693238228b3cee719a0");
        } else if (c) {
            if (b != null) {
                b.shutdownNow();
                b = null;
            }
        } else {
            com.meituan.banma.jarvis.utils.c.a("banma_jarvis: JarvisScheduleService", "stop ==>> scheduleExecutor not inited");
        }
    }

    private static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c3de9d75747f87d2b829e1243a8799b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c3de9d75747f87d2b829e1243a8799b");
            return;
        }
        long b2 = com.meituan.banma.jarvis.env.c.a().b();
        com.meituan.banma.jarvis.utils.c.a("banma_jarvis: JarvisScheduleService", "start ==>> JarvisScheduleService,pollingTime:" + b2 + ",isInited:" + c);
        try {
            ScheduledExecutorService c2 = com.sankuai.android.jarvis.c.c("banma-JarvisScheduleService");
            b = c2;
            c2.scheduleAtFixedRate(e.a(), !c ? 0L : b2, b2, TimeUnit.SECONDS);
        } catch (Exception unused) {
            com.meituan.banma.jarvis.utils.c.b("banma_jarvis: JarvisScheduleService", new Object[0]);
        }
    }

    public static /* synthetic */ void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2022a9773802ff76ff04a38c02b45cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2022a9773802ff76ff04a38c02b45cc");
            return;
        }
        final boolean z = !c;
        b.a(new b.a() { // from class: com.meituan.banma.jarvis.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.banma.jarvis.b.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c625378a5e08bd237b70e1eecef11c1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c625378a5e08bd237b70e1eecef11c1e");
                    return;
                }
                d.a(true);
                b.a(str, z);
            }

            @Override // com.meituan.banma.jarvis.b.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dc3e58a624b7df3fd33a018a4c0f61b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dc3e58a624b7df3fd33a018a4c0f61b");
                    return;
                }
                d.a(true);
                com.meituan.banma.jarvis.utils.c.a("banma_jarvis: JarvisScheduleService", str);
            }
        }, z);
    }
}
