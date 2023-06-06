package com.sankuai.waimai.store.poilist.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.poilist.viewholders.a {
    public static ChangeQuickRedirect a;
    private final a b;

    public final void a(PoiCardInfo poiCardInfo, int i) {
        Object[] objArr = {poiCardInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27212b101f75c24fc6d52ea0f3100411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27212b101f75c24fc6d52ea0f3100411");
        } else {
            this.b.c(poiCardInfo.moduleDesc, i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;
        private final com.sankuai.waimai.store.param.a b;

        public a(@NonNull Context context, com.sankuai.waimai.store.param.a aVar) {
            super(context);
            Object[] objArr = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2598b3f9f6c3c2c816e52924de063698", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2598b3f9f6c3c2c816e52924de063698");
            } else {
                this.b = aVar;
            }
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f16557430726fcc7b1eb93ed913b7e6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f16557430726fcc7b1eb93ed913b7e6");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Long.valueOf(this.b.c));
            hashMap.put("sec_cat_id", this.b.f);
            hashMap.put("section", "2");
            hashMap.put("api_stids", this.b.c());
            hashMap.put("rank_trace_id", this.b.l.get(this.b.f));
            hashMap.put("index", Integer.valueOf(i));
            hashMap.put("scheme_params", this.b.aA);
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final View d(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1cb1abf3c0f734dd55762ce6ac50696", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1cb1abf3c0f734dd55762ce6ac50696");
            }
            if (baseModuleDesc != null && baseModuleDesc.layoutInfo != null) {
                baseModuleDesc.layoutInfo.a = 0;
                baseModuleDesc.layoutInfo.b = 0;
            }
            View d = super.d(baseModuleDesc, i);
            if (d != null) {
                int a2 = com.sankuai.shangou.stone.util.h.a(d.getContext(), 3.0f);
                d.setPadding(a2, a2, a2, a2);
            }
            return d;
        }
    }

    public e(a aVar) {
        super(aVar.d);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5fd8157b096de809e7668a9b5750fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5fd8157b096de809e7668a9b5750fe");
            return;
        }
        this.b = aVar;
        this.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
