package com.sankuai.waimai.store.im.entrance.drug.search;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.entrance.drug.jump.I.a;
import com.sankuai.waimai.store.im.entrance.drug.jump.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SchemeJumpDrugIMContractImpl implements IJumpDrugImService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a mJumpContract;

    @Override // com.sankuai.waimai.store.im.entrance.drug.search.IJumpDrugImService
    public void init(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19942781e832b870fedf3b92fba63dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19942781e832b870fedf3b92fba63dac");
        } else {
            this.mJumpContract = new b(activity, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.im.entrance.drug.search.IJumpDrugImService
    public void jump(int i, long j, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5ce08016a8cc337770331daad8103a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5ce08016a8cc337770331daad8103a1");
        } else if (this.mJumpContract != null) {
            this.mJumpContract.a(i, j, str, str2, true);
        }
    }
}
