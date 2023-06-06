package com.meituan.android.recce.bridge;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RecceCustomApi {
    public static ChangeQuickRedirect c;
    protected WeakReference<Activity> d;

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c824fa4403f49b19b5ed99e28f820f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c824fa4403f49b19b5ed99e28f820f04");
        } else if (activity != null) {
            this.d = new WeakReference<>(activity);
        }
    }

    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9c5bba4a9d1ca49f25e1b299af61f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9c5bba4a9d1ca49f25e1b299af61f5");
        }
        if (this.d == null || this.d.get() == null) {
            return null;
        }
        return this.d.get();
    }
}
