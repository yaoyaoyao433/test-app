package com.sankuai.waimai.touchmatrix.rebuild.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.constraint.R;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    public final ConcurrentLinkedQueue<a> b;
    public volatile boolean c;
    public volatile boolean d;
    private final ArrayList<WeakReference<Activity>> e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        @MainThread
        void a();

        @MainThread
        void b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "3a609b48688be75f0ce5e68c67832786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "3a609b48688be75f0ce5e68c67832786");
            return;
        }
        c.b("通知进入前台", new Object[0]);
        dVar.c = false;
        Iterator<a> it = dVar.b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Exception e) {
                c.e("notifyForeground failed: " + e.getMessage(), new Object[0]);
            }
        }
    }

    public static /* synthetic */ void b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "bb9370d7c054b26790e70f10154aa966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "bb9370d7c054b26790e70f10154aa966");
            return;
        }
        c.b("通知进入后台", new Object[0]);
        dVar.c = true;
        Iterator<a> it = dVar.b.iterator();
        while (it.hasNext()) {
            try {
                it.next().b();
            } catch (Throwable th) {
                c.e("notifyPostBg failed: " + th.getMessage(), new Object[0]);
            }
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349eedcfe3c2a928087a880001f3657c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349eedcfe3c2a928087a880001f3657c");
            return;
        }
        this.d = false;
        this.b = new ConcurrentLinkedQueue<>();
        this.e = new ArrayList<>(30);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class b {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f68bfaa3d45d3ace0670706ccf01c28c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f68bfaa3d45d3ace0670706ccf01c28c") : b.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b4e9814817e95ca42b994f279bff3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b4e9814817e95ca42b994f279bff3c");
            return;
        }
        c.e("TMatrixLifecycleManager onActivityCreated : " + activity.getClass().getSimpleName(), new Object[0]);
        this.e.add(new WeakReference<>(activity));
        com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55870940b2494785e86f5a8ad4d2695b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55870940b2494785e86f5a8ad4d2695b");
            return;
        }
        c.e("TMatrixLifecycleManager onActivityResumed : " + activity.getClass().getSimpleName(), new Object[0]);
        com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(activity));
        e.a(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.rebuild.utils.d.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f51166b1329d70ba93e4c0b154fdf4f7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f51166b1329d70ba93e4c0b154fdf4f7");
                    return;
                }
                com.sankuai.waimai.touchmatrix.rebuild.message.b a2 = com.sankuai.waimai.touchmatrix.rebuild.message.b.a();
                com.sankuai.waimai.touchmatrix.event.a a3 = com.sankuai.waimai.touchmatrix.event.a.a(1);
                a3.c = com.sankuai.waimai.touchmatrix.rebuild.biz.a.a();
                a2.a(a3);
            }
        });
        final com.sankuai.waimai.touchmatrix.utils.a a2 = com.sankuai.waimai.touchmatrix.utils.a.a();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.touchmatrix.utils.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a6974be5950537390543087b1ed761d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a6974be5950537390543087b1ed761d8");
            return;
        }
        if (a2.i == null) {
            a2.i = LayoutInflater.from(activity).inflate(R.layout.wm_tmatrix_float_console_layout, (ViewGroup) null);
            a2.k = (TextView) a2.i.findViewById(R.id.out_text);
            a2.l = (Button) a2.i.findViewById(R.id.float_console_close);
            a2.m = (Button) a2.i.findViewById(R.id.float_console_clear_msg);
            a2.j = a2.i.findViewById(R.id.float_console_header);
            a2.j.setOnTouchListener(a2.h);
            a2.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.touchmatrix.utils.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "568cf4c893bf190b8fb92be004386fc2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "568cf4c893bf190b8fb92be004386fc2");
                        return;
                    }
                    a aVar = a2;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e1c8cad7859818efbb96efe5fcd3c239", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e1c8cad7859818efbb96efe5fcd3c239");
                        return;
                    }
                    aVar.b();
                    aVar.b = false;
                }
            });
            a2.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.touchmatrix.utils.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "668f1bc749dbbf9b3632dabbd4da387c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "668f1bc749dbbf9b3632dabbd4da387c");
                        return;
                    }
                    if (a2.c != null) {
                        a2.c.delete(0, a2.c.length());
                    }
                    if (a2.k != null) {
                        a2.k.setText(a2.c.toString());
                    }
                }
            });
        } else if (a2.i.getParent() != null) {
            ((ViewGroup) a2.i.getParent()).removeView(a2.i);
        }
        if (a2.b) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 700);
            layoutParams.gravity = 17;
            ((ViewGroup) activity.getWindow().getDecorView()).addView(a2.i, layoutParams);
            a2.k.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8123b4a023d7ee1349d47d6190e2aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8123b4a023d7ee1349d47d6190e2aaa");
        } else {
            com.sankuai.waimai.touchmatrix.utils.a.a().b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85ae37f4d4935800e735810e55ab743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85ae37f4d4935800e735810e55ab743");
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.message.b a2 = com.sankuai.waimai.touchmatrix.rebuild.message.b.a();
        com.sankuai.waimai.touchmatrix.event.a a3 = com.sankuai.waimai.touchmatrix.event.a.a(2);
        a3.c = com.sankuai.waimai.touchmatrix.rebuild.biz.a.a();
        a2.a(a3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41178b1de9812764b0a691a925a6c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41178b1de9812764b0a691a925a6c64");
            return;
        }
        try {
            if (this.e == null || this.e.size() <= 0) {
                return;
            }
            int size = this.e.size() - 1;
            while (true) {
                if (size >= 0) {
                    WeakReference<Activity> weakReference = this.e.get(size);
                    if (weakReference != null && weakReference.get() == activity) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size >= 0) {
                this.e.remove(size);
            }
        } catch (Throwable unused) {
        }
    }

    public final Activity b() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b117e886a554404f0b801540ec96378d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b117e886a554404f0b801540ec96378d");
        }
        if (this.e.size() <= 0) {
            c.e("TMatrixLifecycleManager size ==0  使用基建获取", new Object[0]);
            activity = com.sankuai.waimai.foundation.utils.activity.a.a().c();
        } else {
            activity = this.e.get(this.e.size() - 1).get();
        }
        if (activity == null) {
            c.e("TMatrixLifecycleManager 获取栈顶 activity == null", new Object[0]);
        }
        return activity;
    }
}
