package com.sankuai.waimai.business.search.ui.result.itemViewDelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.view.HorizontalSrollViewEx;
import com.sankuai.waimai.business.search.datatype.GuideQueryData;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, a> {
    public static ChangeQuickRedirect e;
    public com.sankuai.waimai.business.search.common.view.a f;
    private com.sankuai.waimai.business.search.ui.result.guideQuery.c g;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    @NonNull
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401842696234c180a249986f4a51577b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401842696234c180a249986f4a51577b");
        }
        this.f.setLayoutParams(new StaggeredGridLayoutManager.b(-1, -2));
        layoutInflater.inflate(R.layout.wm_nox_search_global_poi_guided_wrods, (ViewGroup) this.f, true);
        this.f.setUpwardSticky(true);
        this.f.setDownwardSticky(true);
        return new a(this.f);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(@NonNull Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        Serializable serializable = (Serializable) obj;
        a aVar = (a) sVar;
        Object[] objArr = {serializable, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46db33db5b528e46bdf1c5a79396b731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46db33db5b528e46bdf1c5a79396b731");
            return;
        }
        GuideQueryData guideQueryData = (GuideQueryData) serializable;
        if (this.f.getChildCount() <= 0 || this.g == null || guideQueryData == null || guideQueryData.guidedQueryWordsNew == null) {
            return;
        }
        this.g.a(guideQueryData, aVar, i);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof GuideQueryData;
    }

    public g(Context context, ResultFragment resultFragment, com.sankuai.waimai.business.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, resultFragment, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb31a6f32c31c2daa870064628de3a8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb31a6f32c31c2daa870064628de3a8b");
            return;
        }
        this.f = new com.sankuai.waimai.business.search.common.view.a(this.b);
        this.g = new com.sankuai.waimai.business.search.ui.result.guideQuery.c(context, bVar, this.f, this.c, resultFragment);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends RecyclerView.s {
        public ViewGroup a;
        public LinearLayout b;
        public LinearLayout c;
        public HorizontalSrollViewEx d;
        public ViewGroup e;

        public a(View view) {
            super(view);
            this.a = (ViewGroup) view.findViewById(R.id.guide_words_root);
            this.c = (LinearLayout) view.findViewById(R.id.ambiguous_container);
            this.d = (HorizontalSrollViewEx) view.findViewById(R.id.layout_guided_words_scroll);
            this.b = (LinearLayout) view.findViewById(R.id.layout_guided_words_container);
            this.e = (ViewGroup) view.findViewById(R.id.filter_action_panel);
        }
    }
}
