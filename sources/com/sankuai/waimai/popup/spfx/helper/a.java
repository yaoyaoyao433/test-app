package com.sankuai.waimai.popup.spfx.helper;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.popup.spfx.listener.c {
    public static ChangeQuickRedirect a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b3593a1df2820a7e99ad6ac72c3c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b3593a1df2820a7e99ad6ac72c3c82");
            return;
        }
        Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
        if (c != null) {
            c.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a3030d542fe1153f73d333832cad86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a3030d542fe1153f73d333832cad86");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9ce2ef2623dee7aaef221bb3a1e2b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9ce2ef2623dee7aaef221bb3a1e2b78");
            return;
        }
        Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
        if (c != null) {
            c.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }
}
