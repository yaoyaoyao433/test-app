package com.sankuai.waimai.foundation.core.lifecycle;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ai;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends Lifecycle implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private static b d;
    public final Set<a> b;
    public boolean c;
    private int e;
    private final ai<Activity> f;
    private final Handler g;
    private final Runnable h;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c178e95705b1a89c5488284fdae1e224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c178e95705b1a89c5488284fdae1e224");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "AppStatusLifecycle";
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98d136042f651587fafe8b76f12acab7", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98d136042f651587fafe8b76f12acab7");
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e4f96f9c092eb6d5f30822a395b495", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e4f96f9c092eb6d5f30822a395b495");
            return;
        }
        this.b = new CopyOnWriteArraySet();
        this.c = false;
        this.e = 0;
        this.f = new ai<>();
        this.g = new Handler(Looper.getMainLooper());
        this.h = new Runnable() { // from class: com.sankuai.waimai.foundation.core.lifecycle.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d90eae60518786bbb2382946b7996f06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d90eae60518786bbb2382946b7996f06");
                } else {
                    b.this.a((Activity) b.this.f.a(), false);
                }
            }
        };
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c45e6bc36159ebb1e998e1d38dd8a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c45e6bc36159ebb1e998e1d38dd8a4");
        } else if (aVar != null) {
            this.b.add(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"LogUsage"})
    public void a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37afffe9fe570d52e25dde0dafba8d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37afffe9fe570d52e25dde0dafba8d98");
        } else if (z != this.c) {
            this.c = z;
            if (z) {
                for (a aVar : this.b) {
                    aVar.onAppToForeground(activity);
                }
                return;
            }
            for (a aVar2 : this.b) {
                aVar2.onAppToBackground(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27386759927266af4fa6539caf07c486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27386759927266af4fa6539caf07c486");
            return;
        }
        this.g.removeCallbacks(this.h);
        this.e = activity.hashCode();
        a(activity, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ccdbf6f51a91a643d914d295f02d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ccdbf6f51a91a643d914d295f02d61");
        } else if (a(activity.hashCode())) {
            this.f.a(activity);
            this.g.postDelayed(this.h, 300L);
        }
    }

    public final boolean a(int i) {
        return i == this.e;
    }
}
