package com.sankuai.meituan.riverrunplayer.player;

import android.util.Log;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    ExecutorService b;
    com.sankuai.meituan.xp.d c;

    public a(com.sankuai.meituan.xp.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1274737226965196ff175351d7d6f504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1274737226965196ff175351d7d6f504");
            return;
        }
        this.b = com.sankuai.android.jarvis.c.a("RiverrunPlayer", 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), null, new RejectedExecutionHandler() { // from class: com.sankuai.meituan.riverrunplayer.player.a.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Object[] objArr2 = {runnable, threadPoolExecutor};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af17fec4e85b085efb5e7f2dcf5f8a8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af17fec4e85b085efb5e7f2dcf5f8a8f");
                } else if (a.this.b.isShutdown()) {
                    Log.e("RiverRunPlayer", "rejectedExecution after shutdown");
                } else {
                    Log.e("RiverRunPlayer", "rejectedExecution with unknown reason");
                }
            }
        });
        this.c = dVar;
    }

    synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6a5bdeab1c0c1d73ec094bfc0a2be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6a5bdeab1c0c1d73ec094bfc0a2be3");
        } else {
            this.c.b();
        }
    }

    synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954705c443f51424f72b3d61da7a41cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954705c443f51424f72b3d61da7a41cf");
        } else {
            this.c.a();
        }
    }

    synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ce5eaa6d1705c9857694daf9a9d02b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ce5eaa6d1705c9857694daf9a9d02b");
        } else {
            this.c.c();
        }
    }

    synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bb7c85b5778c4897c810513df2bb90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bb7c85b5778c4897c810513df2bb90");
        } else {
            this.c.d();
        }
    }

    synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0002c0b9873a0072c270b1e4d6656d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0002c0b9873a0072c270b1e4d6656d0");
        } else {
            this.c.f();
        }
    }

    synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4b7f1aacdd3b46a21336de1bc55413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4b7f1aacdd3b46a21336de1bc55413");
        } else {
            this.c.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9742b5650e2c2728bab91682c94f1785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9742b5650e2c2728bab91682c94f1785");
        } else {
            this.b.submit(runnable);
        }
    }

    public final void a(final float f, final float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c5bd621b968fe8bd12fa140fe20ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c5bd621b968fe8bd12fa140fe20ee9");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.player.a.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "465b0e1fc11f5c8b112dcd1e8ccf5a5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "465b0e1fc11f5c8b112dcd1e8ccf5a5b");
                    } else {
                        a.this.b(f, f2);
                    }
                }
            });
        }
    }

    synchronized void b(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f2dd0067f623632a619ff0f3a7009d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f2dd0067f623632a619ff0f3a7009d");
        } else {
            this.c.a(f, f2);
        }
    }

    synchronized void a(int i, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f6dc5dfaafd452fa76f6df3a8e652c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f6dc5dfaafd452fa76f6df3a8e652c4");
        } else {
            this.c.a(i, str, j);
        }
    }

    synchronized void a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1462379f260d97f902f65995c4bab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1462379f260d97f902f65995c4bab3");
        } else {
            this.c.b(str);
        }
    }

    synchronized void a(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7fca5f6614ff81bd9dd7f07bcb18532", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7fca5f6614ff81bd9dd7f07bcb18532");
        } else {
            this.c.a(surface);
        }
    }
}
