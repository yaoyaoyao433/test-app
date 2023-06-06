package com.sankuai.waimai.store.search.template.guesslike;

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
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.GuessRecommend;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.view.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<GuessRecommend, C1308a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1308a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a99be3a99c31596cf2d3bfcb06f0592", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1308a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a99be3a99c31596cf2d3bfcb06f0592");
        }
        f fVar = new f(this.k);
        fVar.setUpwardSticky(true);
        fVar.setDownwardSticky(false);
        fVar.setLayoutParams(new RecyclerView.g(-1, -2));
        layoutInflater.inflate(R.layout.wm_sc_nox_search_list_recommend_head, (ViewGroup) fVar, true);
        return new C1308a(fVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull GuessRecommend guessRecommend, @NonNull C1308a c1308a, int i) {
        GuessRecommend guessRecommend2 = guessRecommend;
        C1308a c1308a2 = c1308a;
        Object[] objArr = {guessRecommend2, c1308a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32fbe66f39ea4e3ac4ce0d19820fd8f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32fbe66f39ea4e3ac4ce0d19820fd8f1");
            return;
        }
        RecommendHeadLayout recommendHeadLayout = c1308a2.a;
        String str = guessRecommend2.recommendContext;
        String str2 = guessRecommend2.recommendSubContext;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = RecommendHeadLayout.a;
        if (PatchProxy.isSupport(objArr2, recommendHeadLayout, changeQuickRedirect2, false, "652e3ab47f872cc4d847420b86846eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, recommendHeadLayout, changeQuickRedirect2, false, "652e3ab47f872cc4d847420b86846eef");
        } else {
            recommendHeadLayout.d = str;
            recommendHeadLayout.e = str2;
            u.a(recommendHeadLayout.b, recommendHeadLayout.d);
            u.a(recommendHeadLayout.c, recommendHeadLayout.e);
        }
        SearchShareData a2 = SearchShareData.a(this.k);
        if (guessRecommend2.isExposed) {
            return;
        }
        guessRecommend2.isExposed = true;
        com.sankuai.waimai.store.manager.judas.b.b(this.k, "b_waimai_sg_saou2dvu_mv").a("cat_id", Integer.valueOf(a2.z)).a("title", c1308a2.a.getDesc()).a("search_log_id", a2.b(guessRecommend2)).a("search_source", Integer.valueOf(a2.aw)).a("keyword", a2.h).a("stid", g.f(a2)).a("search_global_id", a2.r).a("template_type", Integer.valueOf(a2.D)).a();
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a49d74b7d58aed560e84beb831179ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a49d74b7d58aed560e84beb831179ec");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4495828693d0e659b05d84dcbed0054", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4495828693d0e659b05d84dcbed0054")).booleanValue() : str.equals("wm_search_recommend_header");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.guesslike.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1308a extends RecyclerView.s {
        public RecommendHeadLayout a;

        public C1308a(View view) {
            super(view);
            this.a = (RecommendHeadLayout) view.findViewById(R.id.root);
        }
    }
}
