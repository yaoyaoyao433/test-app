package com.sankuai.waimai.ugc.creator.framework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d extends c {
    public static ChangeQuickRedirect c;

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36b976d8b4feabd8f09f5e2b2fd139e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36b976d8b4feabd8f09f5e2b2fd139e8");
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.c
    public final View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12127e969f3afbe1b63df38bf5612c7a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12127e969f3afbe1b63df38bf5612c7a") : this.f.s;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.c
    public final e b(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f7547705a697b0a814d2b6e0089a37", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f7547705a697b0a814d2b6e0089a37");
        }
        e eVar = null;
        if (activity instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activity;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = BaseActivity.b;
            eVar = PatchProxy.isSupport(objArr2, baseActivity, changeQuickRedirect2, false, "9ad99a32c9731212a559bc74354da945", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, baseActivity, changeQuickRedirect2, false, "9ad99a32c9731212a559bc74354da945") : baseActivity.c.e;
        }
        if (eVar == null) {
            eVar = new e(activity);
        }
        eVar.d = bundle;
        return eVar;
    }
}
