package com.meituan.msc.modules.page.render.rn.fps;

import android.os.Looper;
import android.view.Choreographer;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e implements Choreographer.FrameCallback, com.sankuai.meituan.Lifecycle.d {
    public static ChangeQuickRedirect a;
    private static volatile e f;
    public boolean b;
    private Choreographer c;
    private boolean d;
    private final List<a> e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(long j);
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.d = true;
        return true;
    }

    public static /* synthetic */ boolean b(e eVar, boolean z) {
        eVar.b = true;
        return true;
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fc3400f3e90ec0a22bb3aa5cf8233c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fc3400f3e90ec0a22bb3aa5cf8233c1");
        }
        if (f == null) {
            synchronized (e.class) {
                if (f == null) {
                    f = new e();
                }
            }
        }
        return f;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cef5cc5f8d3cebfa950025978735506", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cef5cc5f8d3cebfa950025978735506");
            return;
        }
        this.e = new CopyOnWriteArrayList();
        Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.fps.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cacc63d76c36e835a9331a505688d775", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cacc63d76c36e835a9331a505688d775");
                    return;
                }
                e.this.c = Choreographer.getInstance();
                e.a(e.this, true);
                e.this.c.postFrameCallback(e.this);
                e.b(e.this, true);
                com.sankuai.meituan.Lifecycle.b.a().a(e.this);
            }
        };
        Object[] objArr2 = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5237124da76414eeff0a1085442d2144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5237124da76414eeff0a1085442d2144");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0971ead7022b29fdaf2155d9f1aa91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0971ead7022b29fdaf2155d9f1aa91");
            return;
        }
        for (a aVar : this.e) {
            aVar.a(j);
        }
        if (this.b && this.d) {
            this.c.postFrameCallback(this);
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ae8932828bd994ff3b8c709cde37d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ae8932828bd994ff3b8c709cde37d0");
        } else if (aVar != null) {
            this.e.add(aVar);
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60baffeeb2f52ca9d0faf92b97c9f0e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60baffeeb2f52ca9d0faf92b97c9f0e4");
        } else {
            this.e.remove(aVar);
        }
    }

    @Override // com.sankuai.meituan.Lifecycle.d
    public void applicationEnterForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a82ed756ee725602e09ad73f973f91b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a82ed756ee725602e09ad73f973f91b");
            return;
        }
        this.b = true;
        if (this.d) {
            this.c.postFrameCallback(this);
        }
    }

    @Override // com.sankuai.meituan.Lifecycle.d
    public void applicationEnterBackground() {
        this.b = false;
    }
}
