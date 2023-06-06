package com.sankuai.waimai.business.restaurant.framework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e extends b {
    public static ChangeQuickRedirect d;
    View e;

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a71af0a8d1c6bf5e9b3ad254bca96a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a71af0a8d1c6bf5e9b3ad254bca96a");
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.Lifecycle
    public final void aB_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78abda7e5b0a9dbc2fd92b0f4bf23a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78abda7e5b0a9dbc2fd92b0f4bf23a57");
            return;
        }
        super.aB_();
        this.e = null;
    }
}
