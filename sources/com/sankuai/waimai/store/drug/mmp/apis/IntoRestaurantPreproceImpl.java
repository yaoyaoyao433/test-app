package com.sankuai.waimai.store.drug.mmp.apis;

import com.meituan.msi.api.extension.medicine.IIntoRestaurantPreproce;
import com.meituan.msi.api.extension.medicine.IIntoRestaurantPreproceParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.store.util.al;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class IntoRestaurantPreproceImpl extends IIntoRestaurantPreproce {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.medicine.IIntoRestaurantPreproce
    public final void a(final IIntoRestaurantPreproceParam iIntoRestaurantPreproceParam, final MsiCustomContext msiCustomContext, i<EmptyResponse> iVar) {
        Object[] objArr = {iIntoRestaurantPreproceParam, msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239374dbd39d0e9fac9bc406e19e7fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239374dbd39d0e9fac9bc406e19e7fcc");
        } else if (iIntoRestaurantPreproceParam == null) {
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mmp.apis.IntoRestaurantPreproceImpl.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ef0d4374e75fb52fba4a52a3c4c76f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ef0d4374e75fb52fba4a52a3c4c76f3");
                        return;
                    }
                    int a2 = r.a(iIntoRestaurantPreproceParam.latitude, 0);
                    int a3 = r.a(iIntoRestaurantPreproceParam.longitude, 0);
                    if (!com.sankuai.waimai.foundation.core.a.d()) {
                        AddressItem addressItem = new AddressItem();
                        addressItem.lat = a2;
                        addressItem.lng = a3;
                        com.sankuai.waimai.platform.domain.manager.location.a.b(msiCustomContext.getActivity(), addressItem);
                        return;
                    }
                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_ORDER_LIST_PREORDER;
                }
            }, "");
        }
    }
}
