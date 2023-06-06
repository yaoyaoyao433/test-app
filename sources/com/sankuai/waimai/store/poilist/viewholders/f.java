package com.sankuai.waimai.store.poilist.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.poilist.viewholders.a {
    public static ChangeQuickRedirect a;
    public final a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;
        private final com.sankuai.waimai.store.param.a b;

        public a(@NonNull Context context, com.sankuai.waimai.store.param.a aVar) {
            super(context);
            Object[] objArr = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6f1da5f9791e543f52a68225cf3abc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6f1da5f9791e543f52a68225cf3abc");
            } else {
                this.b = aVar;
            }
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0547c90236d9e6d20161965b7eb20c84", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0547c90236d9e6d20161965b7eb20c84");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Long.valueOf(this.b.c));
            hashMap.put("sec_cat_id", this.b.f);
            hashMap.put("section", "2");
            hashMap.put("api_stids", this.b.c());
            hashMap.put("index", Integer.valueOf(i));
            hashMap.put("scheme_params", this.b.aA);
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final View d(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36d739c96ae1d89ba7969db4aac9c04", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36d739c96ae1d89ba7969db4aac9c04");
            }
            View d = super.d(baseModuleDesc, i);
            if (d != null) {
                d.setPadding(d.getPaddingLeft(), com.sankuai.shangou.stone.util.h.a(d.getContext(), i == 0 ? 0.0f : 8.0f), d.getPaddingRight(), d.getPaddingBottom());
            }
            return d;
        }
    }

    public f(a aVar) {
        super(aVar.d);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0fe511baf0d0456ba3617101a7390a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0fe511baf0d0456ba3617101a7390a6");
            return;
        }
        this.b = aVar;
        this.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
