package com.sankuai.waimai.business.knb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBFragmentCommon extends KNBFragment {
    public static ChangeQuickRedirect k;

    @Override // com.sankuai.waimai.business.knb.KNBFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a96b87eeefa897f35852f47dcebd5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a96b87eeefa897f35852f47dcebd5d");
            return;
        }
        super.onCreate(bundle);
        if (com.sankuai.waimai.business.knb.util.b.a(i())) {
            return;
        }
        a(this.c);
        d();
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5352e2c24869141dc005a366692543fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5352e2c24869141dc005a366692543fb");
            return;
        }
        super.onActivityCreated(bundle);
        this.c.onActivityCreated(bundle);
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45670104c2e430d222094b1e925f200b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45670104c2e430d222094b1e925f200b");
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657c1f8e619348736abb8366ca8bea3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657c1f8e619348736abb8366ca8bea3b");
        } else {
            super.c();
        }
    }
}
