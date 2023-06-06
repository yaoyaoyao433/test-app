package com.sankuai.waimai.store.poi.list.newp.methods;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newcustomer.NewCustomerCouponListDialog;
import com.sankuai.waimai.store.platform.domain.core.poi.CouponCollectionTip;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i implements com.sankuai.waimai.store.mach.event.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;

    public i(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235cb55cff4ee5e58ab069a9466aaf97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235cb55cff4ee5e58ab069a9466aaf97");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        CouponCollectionTip couponCollectionTip;
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d22210e1f19476ff1e32d4d19bade7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d22210e1f19476ff1e32d4d19bade7e");
        } else if (map == null || map.size() == 0 || !(map.get("sg_task_grab_info") instanceof Map) || (couponCollectionTip = (CouponCollectionTip) com.sankuai.waimai.store.util.i.a(new JSONObject((Map) map.get("sg_task_grab_info")).toString(), CouponCollectionTip.class)) == null) {
        } else {
            Activity a2 = aVar.a();
            Object[] objArr2 = {a2, couponCollectionTip};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23c73469201f83464bc12d2bff6d3d00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23c73469201f83464bc12d2bff6d3d00");
                return;
            }
            NewCustomerCouponListDialog newCustomerCouponListDialog = new NewCustomerCouponListDialog(a2);
            newCustomerCouponListDialog.a(couponCollectionTip, new com.sankuai.waimai.store.poi.list.logreport.d(this.b));
            newCustomerCouponListDialog.show();
        }
    }
}
