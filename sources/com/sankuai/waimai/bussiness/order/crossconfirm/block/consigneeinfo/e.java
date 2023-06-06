package com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0feaa8db849345d5ecdb143cd1d2556", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0feaa8db849345d5ecdb143cd1d2556");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        long j;
        String formatPoiId;
        List<Long> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "432000f61ca4630d353ae90a615ae3bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "432000f61ca4630d353ae90a615ae3bc");
            return;
        }
        super.d();
        if (this.c != 0) {
            d dVar = this.p;
            List<PoiOrderPreviewResult> list2 = ((MultiPoiOrderPreviewResult) this.c).poiOrders;
            Object[] objArr2 = {list2};
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "803f918c705d1b2466d8890f7a4d783a", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "803f918c705d1b2466d8890f7a4d783a")).longValue();
            } else {
                j = (list2 == null || list2.size() <= 0 || list2.get(0).poiInfo == null) ? -1L : list2.get(0).poiInfo.poiId;
            }
            dVar.a = j;
            d dVar2 = this.p;
            List<PoiOrderPreviewResult> list3 = ((MultiPoiOrderPreviewResult) this.c).poiOrders;
            Object[] objArr3 = {list3};
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc364b749aba5eef7a2368ba5a003fcc", RobustBitConfig.DEFAULT_VALUE)) {
                formatPoiId = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc364b749aba5eef7a2368ba5a003fcc");
            } else {
                formatPoiId = (list3 == null || list3.size() <= 0 || list3.get(0).poiInfo == null) ? null : list3.get(0).poiInfo.getFormatPoiId();
            }
            dVar2.b = formatPoiId;
            this.p.d = ((MultiPoiOrderPreviewResult) this.c).addressType;
            this.p.c = ((MultiPoiOrderPreviewResult) this.c).addressItem;
            d dVar3 = this.p;
            List<PoiOrderPreviewResult> list4 = ((MultiPoiOrderPreviewResult) this.c).poiOrders;
            Object[] objArr4 = {list4};
            ChangeQuickRedirect changeQuickRedirect4 = o;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "505a679a031dbaccbccbcefc79e9d025", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "505a679a031dbaccbccbcefc79e9d025");
            } else if (com.sankuai.waimai.foundation.utils.b.b(list4)) {
                list = null;
            } else {
                list = new ArrayList<>();
                for (PoiOrderPreviewResult poiOrderPreviewResult : list4) {
                    if (poiOrderPreviewResult.poiInfo != null) {
                        list.add(Long.valueOf(poiOrderPreviewResult.poiInfo.poiId));
                    }
                }
            }
            dVar3.e = list;
            this.p.f = a(((MultiPoiOrderPreviewResult) this.c).poiOrders);
            return;
        }
        this.p.a = -1L;
        this.p.b = "";
        this.p.d = 0;
        this.p.c = null;
        this.p.e = null;
        this.p.f = null;
    }

    @Nullable
    private List<String> a(@Nullable List<PoiOrderPreviewResult> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6768b23d9cadea4ced2191abad72e85f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6768b23d9cadea4ced2191abad72e85f");
        }
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (PoiOrderPreviewResult poiOrderPreviewResult : list) {
            if (poiOrderPreviewResult.poiInfo != null) {
                arrayList.add(poiOrderPreviewResult.poiInfo.getFormatPoiId());
            }
        }
        return arrayList;
    }
}
