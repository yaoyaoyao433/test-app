package com.sankuai.meituan.mtplayer.xplayer;

import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import com.dianping.titans.offline.OfflineCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.xp.f;
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
    f c;

    public a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b25e7e563ce75cd29a022200a4baf14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b25e7e563ce75cd29a022200a4baf14");
            return;
        }
        this.b = c.a("RiverrunVodPlayer", 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), null, new RejectedExecutionHandler() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Object[] objArr2 = {runnable, threadPoolExecutor};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f31cc688988ba14e1b7654a5236f4745", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f31cc688988ba14e1b7654a5236f4745");
                } else if (a.this.b.isShutdown()) {
                    Log.e("RiverRunPlayer", "rejectedExecution after shutdown");
                } else {
                    Log.e("RiverRunPlayer", "rejectedExecution with unknown reason");
                }
            }
        });
        this.c = fVar;
    }

    synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6ed144fd869e1f0ab4fa91be071805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6ed144fd869e1f0ab4fa91be071805");
        } else {
            this.c.b();
        }
    }

    synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4fd22fc60d273c3ab4802b7920bbf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4fd22fc60d273c3ab4802b7920bbf5");
        } else {
            this.c.a();
        }
    }

    synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1756da81ddfcdc9d0aad5cd5003f2210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1756da81ddfcdc9d0aad5cd5003f2210");
        } else {
            this.c.c();
        }
    }

    synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6eb0e322a7f9caca4040b5e0ac52833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6eb0e322a7f9caca4040b5e0ac52833");
        } else {
            this.c.d();
        }
    }

    synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180aa3f51cb23d52b309c1d8e44587af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180aa3f51cb23d52b309c1d8e44587af");
        } else {
            this.c.f();
        }
    }

    synchronized void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c6f38c067a279bec3faa9e12fb53ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c6f38c067a279bec3faa9e12fb53ae");
        } else {
            this.c.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0216d46609f09c8a9119e5defbb9c1d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0216d46609f09c8a9119e5defbb9c1d7");
        } else {
            this.b.submit(runnable);
        }
    }

    synchronized void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9233256b251e1499929a087898d91c7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9233256b251e1499929a087898d91c7c");
        } else {
            this.c.a(f, f2);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c946c1ff397aa20b72374cef41512cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c946c1ff397aa20b72374cef41512cc7");
        } else {
            this.c.a(str);
        }
    }

    synchronized void b(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd3071413dfe0522f8475adfea133ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd3071413dfe0522f8475adfea133ad");
        } else {
            this.c.b(str);
        }
    }

    public final void a(final Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2228e59495405c8ddd914af600ebe1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2228e59495405c8ddd914af600ebe1b");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49ad0f444dc442a76615c243bf903996", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49ad0f444dc442a76615c243bf903996");
                    } else {
                        a.this.b(surface);
                    }
                }
            });
        }
    }

    synchronized void b(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52f3788ef09841e1abc2b369f6e06ae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52f3788ef09841e1abc2b369f6e06ae0");
        } else {
            this.c.a(surface);
        }
    }

    public final void a(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424750529fd98ef3e531577fcee634ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424750529fd98ef3e531577fcee634ea");
        } else {
            a(new Runnable() { // from class: com.sankuai.meituan.mtplayer.xplayer.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32d883d469ef198269b02903856722e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32d883d469ef198269b02903856722e8");
                        return;
                    }
                    f fVar = a.this.c;
                    long j2 = j;
                    Object[] objArr3 = {new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect3 = f.p;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "dbea6963473d6e7e0ff52a7f89eeb8b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "dbea6963473d6e7e0ff52a7f89eeb8b0");
                        return;
                    }
                    fVar.q.seekTo(j2);
                    fVar.a(OfflineCenter.ERROR_BUNDLE_DOWNLOAD, (Bundle) null);
                }
            });
        }
    }
}
