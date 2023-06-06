package com.sankuai.waimai.bussiness.order.rocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.bussiness.order.detailnew.a implements com.sankuai.waimai.ad.b, com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.b, com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.c, j {
    public static ChangeQuickRedirect aJ;
    com.meituan.android.cube.pga.common.g<RecyclerView> aK;
    public com.meituan.android.cube.pga.common.g<Map<String, Object>> aL;
    public com.meituan.android.cube.pga.common.g<com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a> aM;
    public com.meituan.android.cube.pga.common.b<ViewGroup> aN;
    public com.meituan.android.cube.pga.common.g<Integer> aO;
    public com.meituan.android.cube.pga.common.g<com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a> aP;
    public com.meituan.android.cube.pga.common.a<String, Map<String, Object>> aQ;
    com.meituan.android.cube.pga.common.b<Integer> aR;

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = aJ;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d720b64bf7982f3cfd29cb36ea036f71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d720b64bf7982f3cfd29cb36ea036f71");
            return;
        }
        this.aK = new com.meituan.android.cube.pga.common.g<>();
        this.aL = new com.meituan.android.cube.pga.common.g<>();
        this.aM = new com.meituan.android.cube.pga.common.g<>();
        this.aN = new com.meituan.android.cube.pga.common.b<>();
        this.aO = new com.meituan.android.cube.pga.common.g<>();
        this.aP = new com.meituan.android.cube.pga.common.g<>();
        this.aQ = new com.meituan.android.cube.pga.common.a<>();
        this.aR = new com.meituan.android.cube.pga.common.b<>();
    }

    @Override // com.sankuai.waimai.ad.b
    public final b.c at_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = aJ;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fc4870ea8e6b4474d17becc96c637c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fc4870ea8e6b4474d17becc96c637c");
        }
        b.c cVar = new b.c();
        cVar.b = "c_hgowsqb";
        cVar.d = "waimai";
        HashMap hashMap = new HashMap();
        hashMap.put("before_poi_id", this.D.a());
        hashMap.put("rank_list_id", this.B.a());
        com.sankuai.waimai.business.order.api.detail.model.a a = this.J.a();
        if (a != null) {
            hashMap.put("order_status", Integer.valueOf(a.e));
        }
        cVar.e = hashMap;
        cVar.g = false;
        return cVar;
    }

    @Override // com.sankuai.waimai.ad.b
    public final com.meituan.android.cube.pga.common.b<Integer> au_() {
        return this.aR;
    }
}
