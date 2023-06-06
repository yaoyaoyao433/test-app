package com.sankuai.waimai.secondfloor;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.KNBFragmentCommon;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SecondFloorKNBFragment extends KNBFragmentCommon {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.waimai.business.knb.KNBFragmentCommon, com.sankuai.waimai.business.knb.KNBFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d9e06952a3e2f0d02679b6975b1918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d9e06952a3e2f0d02679b6975b1918");
            return;
        }
        super.onCreate(bundle);
        a_(false);
    }
}
