package com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.e;
import com.sankuai.waimai.bussiness.order.detailnew.util.h;
import com.sankuai.waimai.foundation.utils.g;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends d {
    public static ChangeQuickRedirect d;
    b e;

    public c(Context context, String str, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        super(context, str);
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ebe7a791f69da96c0b517c39dcdc343", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ebe7a791f69da96c0b517c39dcdc343");
        } else {
            this.e = new b(context, this.g, aVar);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d, com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "128cd4db0df8da8d6b4ec4e045a7a778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "128cd4db0df8da8d6b4ec4e045a7a778");
            return;
        }
        super.b();
        a(0, 0, 0, 0);
    }

    public final void a(e eVar, OrderAbnormalInfo orderAbnormalInfo, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b bVar, h.a aVar) {
        boolean z = false;
        Object[] objArr = {eVar, orderAbnormalInfo, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0102d26b54bd2f7212b3c52090c1240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0102d26b54bd2f7212b3c52090c1240");
            return;
        }
        super.a(eVar);
        this.b.setMinimumHeight(g.a(this.c, 54.0f));
        b bVar2 = this.e;
        Object[] objArr2 = {orderAbnormalInfo, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "a8858082a8417fc30fd5429fb20a588c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "a8858082a8417fc30fd5429fb20a588c");
            return;
        }
        bVar2.e = orderAbnormalInfo;
        bVar2.f = orderAbnormalInfo.logicInfo;
        bVar2.h = bVar;
        bVar2.i = aVar;
        bVar2.g = System.currentTimeMillis();
        bVar2.j = new com.sankuai.waimai.bussiness.order.detailnew.controller.c((Activity) bVar2.b, orderAbnormalInfo.volleyTag, null);
        if (orderAbnormalInfo.attentionInfo == null || orderAbnormalInfo.attentionInfo.secondDeliveryTip == null) {
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "fbfd7d0068a5c5bc8f53830384061928", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "fbfd7d0068a5c5bc8f53830384061928")).booleanValue();
        } else {
            Set<String> b = bVar2.d.b((com.sankuai.waimai.foundation.utils.e) AbnormalSPKeys.second_delivery, (Set<String>) new HashSet());
            if (b.size() <= 0 || !b.contains(bVar2.f.b)) {
                b.add(bVar2.f.b);
                bVar2.d.a((com.sankuai.waimai.foundation.utils.e) AbnormalSPKeys.second_delivery, b);
            } else {
                z = true;
            }
        }
        if (z) {
            return;
        }
        bVar2.a(orderAbnormalInfo.attentionInfo.secondDeliveryTip);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8ac5b9e392c1ecee82003e179b7568a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8ac5b9e392c1ecee82003e179b7568a");
            return;
        }
        super.a(str, map);
        this.e.a(str, map);
    }
}
