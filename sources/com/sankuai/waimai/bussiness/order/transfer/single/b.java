package com.sankuai.waimai.bussiness.order.transfer.single;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements com.sankuai.waimai.bussiness.order.transfer.base.d<d, f, b.C0904b> {
    public static ChangeQuickRedirect a;
    protected Activity b;

    public b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391b397e417bf94b1302c99a1df00ac5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391b397e417bf94b1302c99a1df00ac5");
        } else {
            this.b = activity;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.d
    public void a(d dVar, f fVar, b.C0904b c0904b, com.sankuai.waimai.bussiness.order.transfer.base.c cVar) {
        Object[] objArr = {dVar, fVar, c0904b, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc908ee96ea89b457d12270b787e77e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc908ee96ea89b457d12270b787e77e3");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar = new com.sankuai.waimai.bussiness.order.confirm.request.preview.a(this.b);
        aVar.h = cVar;
        aVar.e = new com.sankuai.waimai.platform.domain.core.response.a();
        com.sankuai.waimai.bussiness.order.confirm.request.b a2 = com.sankuai.waimai.bussiness.order.confirm.request.b.a(0, fVar, c0904b.h);
        a2.e = c0904b;
        a2.f = aVar;
        a2.a();
    }
}
