package com.sankuai.waimai.store.search.template.overpagefilter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.OverPageFilterGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<OverPageFilterGroup, d> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ d a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c32a820b4b3ff2d889d063fc4098f0", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c32a820b4b3ff2d889d063fc4098f0") : new d(layoutInflater.inflate(R.layout.wm_sc_search_over_page_filter, viewGroup, false), 0, 11);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull OverPageFilterGroup overPageFilterGroup, @NonNull d dVar, int i) {
        OverPageFilterGroup overPageFilterGroup2 = overPageFilterGroup;
        d dVar2 = dVar;
        Object[] objArr = {overPageFilterGroup2, dVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4453d3e50da47b0c7ab03b372fa8e696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4453d3e50da47b0c7ab03b372fa8e696");
        } else {
            dVar2.a(overPageFilterGroup2);
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6dd89f2d264764b798ab566d74cfca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6dd89f2d264764b798ab566d74cfca5");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fafb0c6180753927aed5f3dc76e616d5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fafb0c6180753927aed5f3dc76e616d5")).booleanValue() : str.equals("wm_shangou_search_over_page_filter");
    }
}
