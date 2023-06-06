package com.sankuai.waimai.store.search.ui;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.modular.eventbus.sharedata.a;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.search.ui.actionbar.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseSearchFragment extends SCBaseFragment {
    public static ChangeQuickRedirect a;
    public GlobalSearchActivity c;
    public SearchShareData d;

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf17fc194b34158a6c0824de2d716cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf17fc194b34158a6c0824de2d716cfa");
            return;
        }
        super.onAttach(activity);
        if (this.F instanceof GlobalSearchActivity) {
            this.c = (GlobalSearchActivity) this.F;
            return;
        }
        throw new IllegalArgumentException("BaseSearchFragment can only be added to GlobalSearchActivity!");
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35e3796802d2d5c87ae52e5430a37d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35e3796802d2d5c87ae52e5430a37d92");
            return;
        }
        super.onCreate(bundle);
        this.d = (SearchShareData) a.a(this, SearchShareData.class);
    }

    public final void a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50b780bea2c7d933a84e520a62201e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50b780bea2c7d933a84e520a62201e9b");
        } else if (this.c != null) {
            this.c.a(str, j, str2, false, null);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7938a7fd344ab8276e8ea4bab8dd49ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7938a7fd344ab8276e8ea4bab8dd49ef");
        } else if (this.c != null) {
            this.c.g();
        }
    }

    public final b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d80957713a5d130adfa6f402b3548ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d80957713a5d130adfa6f402b3548ca");
        }
        if (this.c != null) {
            return this.c.b;
        }
        return null;
    }
}
