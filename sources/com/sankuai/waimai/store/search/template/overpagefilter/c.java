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
public final class c extends com.sankuai.waimai.store.search.adapterdelegates.b<OverPageFilterGroup, d> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ d a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc2fd7ec551229a2546f85877326a19", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc2fd7ec551229a2546f85877326a19") : new d(layoutInflater.inflate(R.layout.wm_sc_nox_search_over_page_filter_waterfall, viewGroup, false), 1, 11);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull OverPageFilterGroup overPageFilterGroup, @NonNull d dVar, int i) {
        OverPageFilterGroup overPageFilterGroup2 = overPageFilterGroup;
        d dVar2 = dVar;
        Object[] objArr = {overPageFilterGroup2, dVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3bbc0e09fea9085078e10ff1c788ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3bbc0e09fea9085078e10ff1c788ce");
        } else {
            dVar2.a(overPageFilterGroup2);
        }
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ba71a1cc40253ca03244da1c360ce7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ba71a1cc40253ca03244da1c360ce7");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3daa98cde10c4392e9e6eae8128e127e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3daa98cde10c4392e9e6eae8128e127e")).booleanValue() : str.equals("wm_shangou_search_over_page_filter_cascade");
    }
}
