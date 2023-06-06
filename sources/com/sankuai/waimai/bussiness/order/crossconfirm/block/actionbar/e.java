package com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.viewmodel.a<MultiPoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    @NonNull
    d p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557819260cfb16c084bca71fe69aac44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557819260cfb16c084bca71fe69aac44");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        long j;
        String str;
        List<Long> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67823b6738fa99163357c3e43a431589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67823b6738fa99163357c3e43a431589");
            return;
        }
        super.d();
        if (this.c != 0) {
            d dVar = this.p;
            List<PoiOrderPreviewResult> list2 = ((MultiPoiOrderPreviewResult) this.c).poiOrders;
            Object[] objArr2 = {list2};
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d89b3bda8676dede08a38af1f2e3b079", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d89b3bda8676dede08a38af1f2e3b079")).longValue();
            } else {
                j = (list2 == null || list2.size() <= 0 || list2.get(0).poiInfo == null) ? -1L : list2.get(0).poiInfo.poiId;
            }
            dVar.b = j;
            d dVar2 = this.p;
            List<PoiOrderPreviewResult> list3 = ((MultiPoiOrderPreviewResult) this.c).poiOrders;
            Object[] objArr3 = {list3};
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5c3ee7daed5ae40f992616b74550d90", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5c3ee7daed5ae40f992616b74550d90");
            } else {
                str = (list3 == null || list3.size() <= 0 || list3.get(0).poiInfo == null) ? "" : list3.get(0).poiInfo.poiIdStr;
            }
            dVar2.c = str;
            this.p.e = ((MultiPoiOrderPreviewResult) this.c).addressItem;
            this.p.d = ((MultiPoiOrderPreviewResult) this.c).addressType;
            d dVar3 = this.p;
            List<PoiOrderPreviewResult> list4 = ((MultiPoiOrderPreviewResult) this.c).poiOrders;
            Object[] objArr4 = {list4};
            ChangeQuickRedirect changeQuickRedirect4 = o;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "58f77f18509aeb50ac07fed1b77c9d23", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "58f77f18509aeb50ac07fed1b77c9d23");
            } else if (com.sankuai.waimai.foundation.utils.b.b(list4)) {
                list = null;
            } else {
                list = new ArrayList<>();
                for (PoiOrderPreviewResult poiOrderPreviewResult : list4) {
                    if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null) {
                        list.add(Long.valueOf(poiOrderPreviewResult.poiInfo.poiId));
                    }
                }
            }
            dVar3.f = list;
            this.p.j = true;
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.e = null;
        this.p.d = -1;
        this.p.f = null;
    }
}
