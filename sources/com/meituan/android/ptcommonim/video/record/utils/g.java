package com.meituan.android.ptcommonim.video.record.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static volatile g c;
    protected final a b;
    private final ExecutorService d;

    private static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16fa2e4eca8cf8bcd00444b02e49b5f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16fa2e4eca8cf8bcd00444b02e49b5f2");
        }
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    c = new g();
                }
            }
        }
        return c;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba33946df866f795beca182b12e832c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba33946df866f795beca182b12e832c");
            return;
        }
        this.b = new a(Looper.getMainLooper());
        this.d = com.sankuai.android.jarvis.c.a("ptim-video-manager", 8);
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eec0b6fea88fb592aa1707c31ae7275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eec0b6fea88fb592aa1707c31ae7275");
        } else {
            a().d.execute(runnable);
        }
    }

    public static <R> void a(c<R> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46cf8f086facd279d263500e12ab060f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46cf8f086facd279d263500e12ab060f");
        } else {
            a().d.execute(cVar);
        }
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e48400b2074f054fcc1a39451e441cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e48400b2074f054fcc1a39451e441cf");
            return;
        }
        Object[] objArr2 = {runnable, 0L};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9f5eecb6cfb8e04072b40b5b6d1818f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9f5eecb6cfb8e04072b40b5b6d1818f2");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "061a5f5cd1b22eb65b84a3666b60cfe7", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "061a5f5cd1b22eb65b84a3666b60cfe7") : a().b).postDelayed(runnable, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;

        public a(Looper looper) {
            super(looper);
            Object[] objArr = {looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e978798c91efa305642bf9cdc4b0349", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e978798c91efa305642bf9cdc4b0349");
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(@NonNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6553bf46d09a86e324ad63ef38e176", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6553bf46d09a86e324ad63ef38e176");
                return;
            }
            try {
                super.dispatchMessage(message);
            } catch (Error | Exception unused) {
            }
        }
    }
}
