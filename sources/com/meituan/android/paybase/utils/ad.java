package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.paybase.dialog.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ad {
    public static ChangeQuickRedirect a;
    private static volatile ad b;
    private a c;
    private Application.ActivityLifecycleCallbacks d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        WeakReference<Activity> b;
        public String c;
        public String d;
        public e.a e;
        public boolean f;
        long g;
    }

    public static /* synthetic */ a a(ad adVar, a aVar) {
        adVar.c = null;
        return null;
    }

    public static /* synthetic */ void b(ad adVar, Activity activity, a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, adVar, changeQuickRedirect, false, "99c66fc8ae381d2bf4921e7cc4119d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, adVar, changeQuickRedirect, false, "99c66fc8ae381d2bf4921e7cc4119d83");
            return;
        }
        adVar.c = aVar;
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr2 = {new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "955fa10c75bbb470ce05871edbda4736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "955fa10c75bbb470ce05871edbda4736");
        } else {
            aVar.g = currentTimeMillis;
        }
        adVar.b(activity, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ad b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd97488d9334e3341adfc940c69ecc7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ad) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd97488d9334e3341adfc940c69ecc7c");
        }
        if (b == null) {
            synchronized (ad.class) {
                if (b == null) {
                    b = new ad(activity);
                }
            }
        }
        return b;
    }

    private ad(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c222b2e99fca8f672f4a8c5532258924", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c222b2e99fca8f672f4a8c5532258924");
            return;
        }
        this.d = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.paybase.utils.ad.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Object[] objArr2 = {activity2, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "131bc95a7689c034e3d51c88a5826d50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "131bc95a7689c034e3d51c88a5826d50");
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "999d10eb44cebfab3be477fa126efb0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "999d10eb44cebfab3be477fa126efb0c");
                } else if (ad.this.c != null) {
                    if (Math.abs(System.currentTimeMillis() - ad.this.c.g) > 1000) {
                        ad.a(ad.this, (a) null);
                    } else if (ad.this.c.b == null || ad.this.c.b.get() != activity2) {
                        ad.this.b(activity2, ad.this.c);
                    }
                }
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity, a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ceabe0db57df6430f4074c5b37810dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ceabe0db57df6430f4074c5b37810dd");
            return;
        }
        aVar.b = new WeakReference<>(activity);
        a(activity, aVar).a();
    }

    private com.sankuai.meituan.android.ui.widget.a a(Activity activity, a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6e32162a0846768e9884a211778019", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.android.ui.widget.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6e32162a0846768e9884a211778019");
        }
        String str = aVar.c;
        com.sankuai.meituan.android.ui.widget.a aVar2 = new com.sankuai.meituan.android.ui.widget.a(activity, str, aVar.f ? 0 : -1);
        aVar2.b(activity.getResources().getColor(R.color.paybase__toast_background_color)).a(activity.getResources().getDimensionPixelSize(R.dimen.paybase__toast_radius));
        View c = aVar2.c();
        if (c instanceof LinearLayout) {
            TextView textView = (TextView) c.findViewById(R.id.snackbar_text);
            if (textView != null) {
                textView.setTextSize(16.0f);
                if (!TextUtils.isEmpty(aVar.d)) {
                    textView.setText(com.meituan.android.paybase.dialog.e.a(str, aVar.d, activity.getResources().getColor(R.color.paybase__black3)));
                }
            }
            View view = null;
            if (e.a.c == aVar.e) {
                view = View.inflate(activity, R.layout.paybase__toast_icon_right, null);
            } else if (e.a.d == aVar.e) {
                view = View.inflate(activity, R.layout.paybase__toast_icon_error, null);
            }
            if (view != null) {
                aVar2.a(view);
            }
        }
        return aVar2;
    }
}
