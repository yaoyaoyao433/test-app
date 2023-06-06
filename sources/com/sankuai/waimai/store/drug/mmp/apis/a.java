package com.sankuai.waimai.store.drug.mmp.apis;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements f {
    public static ChangeQuickRedirect a;
    private static final a b = new a();

    public static f a() {
        return b;
    }

    @Override // com.sankuai.waimai.business.order.api.pay.f
    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71aa3c183330f3118b3cfbe962ee4cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71aa3c183330f3118b3cfbe962ee4cc2");
        } else {
            MedicinePayImpl.a(activity, str, str2);
        }
    }
}
