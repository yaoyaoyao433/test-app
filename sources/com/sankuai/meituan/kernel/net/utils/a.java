package com.sankuai.meituan.kernel.net.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a = null;
    private static int b = -1;
    private static a c;
    private static boolean d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddfa8d2f834bb7cd8db68db161687220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddfa8d2f834bb7cd8db68db161687220");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static /* synthetic */ boolean a(boolean z) {
        d = false;
        return false;
    }

    public static synchronized void a(Application application) {
        synchronized (a.class) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e03be1bbedb8ddf3d16285754385023b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e03be1bbedb8ddf3d16285754385023b");
                return;
            }
            if (c == null) {
                c = new a();
                application.registerActivityLifecycleCallbacks(c);
            }
            d = true;
        }
    }

    public static synchronized void a() {
        synchronized (a.class) {
            d = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5dda5fd5a259ec8ff991d1fe6e5c486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5dda5fd5a259ec8ff991d1fe6e5c486");
        } else if (!d) {
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f098459d30e3149ca50b2f737b72ab7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f098459d30e3149ca50b2f737b72ab7");
                return;
            }
            View view = (View) activity.getWindow().getDecorView().getTag(R.id.dev_kit_tag_id);
            if (view != null) {
                ((ViewGroup) activity.getWindow().getDecorView()).removeView(view);
                activity.getWindow().getDecorView().setTag(R.id.dev_kit_tag_id, null);
            }
        } else {
            Object[] objArr3 = {activity};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2425eb309f4c9371d7fe4c09febc73ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2425eb309f4c9371d7fe4c09febc73ff");
            } else if (((View) activity.getWindow().getDecorView().getTag(R.id.dev_kit_tag_id)) == null) {
                if (b <= 0) {
                    if (activity.getResources() != null) {
                        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            b = (displayMetrics.heightPixels >> 1) - ((int) (30 * com.sankuai.meituan.kernel.net.base.a.d));
                        }
                    } else {
                        b = 300;
                    }
                }
                final C0595a c0595a = new C0595a(activity);
                c0595a.setText("Mock");
                c0595a.setTextColor(-16711936);
                c0595a.setBackgroundColor(-7829368);
                c0595a.getBackground().setAlpha(100);
                c0595a.setId(R.id.dev_kit_tag_id);
                c0595a.setX(0.0f);
                c0595a.setY(b);
                c0595a.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.kernel.net.utils.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr4 = {view2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f593c632ea0e30bade9f8f22bb5849a6", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f593c632ea0e30bade9f8f22bb5849a6");
                            return;
                        }
                        ((ViewGroup) activity.getWindow().getDecorView()).removeView(c0595a);
                        activity.getWindow().getDecorView().setTag(R.id.dev_kit_tag_id, null);
                        a.a(false);
                        String str = activity.getPackageName() + "_preferences";
                        x a2 = x.a(d.a(activity));
                        a2.a("enable_dianping_mock", false, str);
                        a2.a("dianping_mock_enable", false, str);
                    }
                });
                activity.getWindow().getDecorView().setTag(R.id.dev_kit_tag_id, c0595a);
                ((ViewGroup) activity.getWindow().getDecorView()).addView(c0595a, new ViewGroup.LayoutParams(-2, -2));
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0595a extends Button {
        public static ChangeQuickRedirect a;
        private static final int b = (int) (10 * com.sankuai.meituan.kernel.net.base.a.d);
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;

        public C0595a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2066b9e5bdf16f9a016e277492ece0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2066b9e5bdf16f9a016e277492ece0");
            }
        }

        @Override // android.widget.TextView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e8fe61b69147337a802ed564c690a39", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e8fe61b69147337a802ed564c690a39")).booleanValue();
            }
            switch (motionEvent.getAction()) {
                case 0:
                    this.e = motionEvent.getRawX();
                    this.f = motionEvent.getRawY();
                    this.c = getX();
                    this.d = getY();
                    break;
                case 1:
                    if (Math.abs(motionEvent.getRawX() - this.e) <= b && Math.abs(motionEvent.getRawY() - this.f) <= b) {
                        performClick();
                        break;
                    }
                    break;
                case 2:
                    this.g = motionEvent.getRawX();
                    this.h = motionEvent.getRawY();
                    setX(this.c + (this.g - this.e));
                    setY(this.d + (this.h - this.f));
                    break;
            }
            return true;
        }
    }
}
