package com.sankuai.meituan.mtimageloader.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9e946e51a77a2a091c1e2c9e95e0b5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9e946e51a77a2a091c1e2c9e95e0b5e");
        } else if (com.sankuai.meituan.mtimageloader.config.a.i()) {
            th.printStackTrace();
        }
    }

    public static void a(View view, final Runnable runnable, final Exception exc) {
        Object[] objArr = {view, runnable, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12f9b04196227af826f82ecb00d6cbc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12f9b04196227af826f82ecb00d6cbc1");
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.meituan.mtimageloader.utils.c.1
            public static ChangeQuickRedirect a;
            public int b = 0;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "626ef814b835db23f04db82a2e56de15", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "626ef814b835db23f04db82a2e56de15")).booleanValue();
                }
                View view2 = (View) weakReference.get();
                int i = this.b;
                this.b = i + 1;
                if (i == 50) {
                    c.a(new IllegalStateException("onPreDraw回调超过50次", exc));
                    if (view2 != null && (view2.getContext() instanceof Activity)) {
                        try {
                            ((Activity) view2.getContext()).getWindow().getDecorView().getViewTreeObserver().removeOnPreDrawListener(this);
                            return true;
                        } catch (Exception unused) {
                        }
                    }
                }
                if (view2 == null) {
                    return true;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    if (!view2.isAttachedToWindow()) {
                        return true;
                    }
                } else {
                    View rootView = view2.getRootView();
                    if (rootView == null || rootView.getParent() == null) {
                        return true;
                    }
                }
                runnable.run();
                return true;
            }
        });
    }
}
