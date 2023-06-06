package com.sankuai.waimai.business.search.ui.result.itemViewDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.business.search.adapterdelegates.a<Serializable, a> {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ void a(@NonNull Serializable serializable, @NonNull a aVar, @NonNull int i) {
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    @NonNull
    public final /* synthetic */ a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694014aa8859a58d8e8b1ea05311796b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694014aa8859a58d8e8b1ea05311796b") : new a(layoutInflater.inflate(R.layout.wm_nox_search_list_recommend_margin, viewGroup, false));
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Serializable serializable, @NonNull List<Serializable> list, int i) {
        return serializable instanceof com.sankuai.waimai.business.search.datatype.c;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a562030505e6186bdc94184ddad08ec5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a562030505e6186bdc94184ddad08ec5");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends RecyclerView.s {
        public a(View view) {
            super(view);
        }
    }
}
