package com.sankuai.waimai.store.search.template.hotrank;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.HotRankEntity;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.RoundedCornerImageView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<HotRankEntity, C1309a> {
    public static ChangeQuickRedirect a;
    Map<String, Object> b;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1309a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b2f75f8d2b5a0118b70b6dab9a0516", RobustBitConfig.DEFAULT_VALUE) ? (C1309a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b2f75f8d2b5a0118b70b6dab9a0516") : new C1309a(layoutInflater.inflate(R.layout.wm_sc_nox_search_hot_rank_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull HotRankEntity hotRankEntity, @NonNull C1309a c1309a, int i) {
        HotRankEntity hotRankEntity2 = hotRankEntity;
        C1309a c1309a2 = c1309a;
        Object[] objArr = {hotRankEntity2, c1309a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d465dc997e1d979cdf61df3f6671d5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d465dc997e1d979cdf61df3f6671d5b7");
            return;
        }
        Object[] objArr2 = {c1309a2, hotRankEntity2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8fbd75aa7c9a02477bcd0e3d89631c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8fbd75aa7c9a02477bcd0e3d89631c6");
        } else if (hotRankEntity2 != null) {
            if (!TextUtils.isEmpty(hotRankEntity2.picture)) {
                if (this.k != null && this.k.getResources() != null) {
                    b.C0608b a2 = m.a(hotRankEntity2.picture);
                    a2.b = this.k;
                    a2.l = true;
                    a2.e = 1;
                    a2.a(new FixedSizeTransform(g.a(this.k), (int) this.k.getResources().getDimension(R.dimen.wm_sc_common_dimen_221)), BlurTransformation.a(com.meituan.android.singleton.b.a, 0.1f, 0.3f, 0.33f)).a(c1309a2.b);
                }
                b.C0608b a3 = m.a(hotRankEntity2.picture);
                a3.b = this.k;
                a3.l = true;
                a3.e = 1;
                a3.a((ImageView) c1309a2.c);
            }
            u.a(c1309a2.g, hotRankEntity2.title);
            TextView textView = c1309a2.h;
            textView.setText("热榜指数 " + hotRankEntity2.hotNum);
            if (hotRankEntity2.positionType == 2) {
                u.a(c1309a2.e);
                c1309a2.e.setBackgroundResource(R.drawable.wm_sc_search_hot_rank_pos_type_up);
            } else if (hotRankEntity2.positionType == 3) {
                u.a(c1309a2.e);
                c1309a2.e.setBackgroundResource(R.drawable.wm_sc_search_hot_rank_pos_type_down);
            } else {
                u.c(c1309a2.e);
            }
            u.a(c1309a2.i, hotRankEntity2.hotLabelRankExlpain);
            if (hotRankEntity2.indexInfo != null && !TextUtils.isEmpty(hotRankEntity2.indexInfo.icon)) {
                TextView textView2 = c1309a2.f;
                StringBuilder sb = new StringBuilder();
                sb.append(hotRankEntity2.indexInfo.innerIndex);
                textView2.setText(sb.toString());
                b.C0608b a4 = m.a(hotRankEntity2.indexInfo.icon);
                a4.b = this.k;
                a4.l = true;
                a4.e = 1;
                a4.a(c1309a2.d);
            }
            c1309a2.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.hotrank.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c9eea07823b71174018aa287155d06c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c9eea07823b71174018aa287155d06c");
                        return;
                    }
                    a.this.a();
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_waimai_sg_xrks6etb_mc").b(a.this.b).a();
                }
            });
        }
        Object[] objArr3 = {hotRankEntity2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "10e23f26f00a4a30966f3ffb937a6c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "10e23f26f00a4a30966f3ffb937a6c9c");
        } else if (hotRankEntity2 != null) {
            int i2 = hotRankEntity2.indexInfo != null ? hotRankEntity2.indexInfo.innerIndex : -999;
            this.b.put("keyword", this.l.h);
            this.b.put("index", Integer.valueOf(hotRankEntity2.getStatisticsIndex()));
            this.b.put("cat_id", Integer.valueOf(this.l.z));
            this.b.put("search_log_id", this.l.b(hotRankEntity2));
            this.b.put("stid", com.sankuai.waimai.store.search.statistics.g.f(this.l));
            this.b.put("search_source", Integer.valueOf(this.l.aw));
            this.b.put("template_type", Integer.valueOf(this.l.D));
            this.b.put("search_global_id", this.l.r);
            this.b.put("hotword_recommend_v2", Integer.valueOf(hotRankEntity2.hotLabelRankExlpainType));
            this.b.put("hotword_recommend_v2_details", hotRankEntity2.hotLabelRankExlpain);
            this.b.put("hotword_txt", hotRankEntity2.title);
            this.b.put(DataConstants.INDEX, Integer.valueOf(i2));
            this.b.put("hotword_value", Integer.valueOf(hotRankEntity2.hotNum));
        }
        if (hotRankEntity2.isExposed) {
            return;
        }
        hotRankEntity2.isExposed = true;
        com.sankuai.waimai.store.manager.judas.b.b(this.k, "b_waimai_sg_xrks6etb_mv").b(this.b).a();
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44652f92ac98cb33d7b6a29d0e7510cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44652f92ac98cb33d7b6a29d0e7510cf");
        } else {
            this.b = new HashMap();
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4902e2b139f18e23d86d8d802695c8c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4902e2b139f18e23d86d8d802695c8c8")).booleanValue() : str.equals("wm_shangou_search_hot_label_rank");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.hotrank.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1309a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        RoundedCornerImageView c;
        ImageView d;
        ImageView e;
        TextView f;
        TextView g;
        TextView h;
        TextView i;
        TextView j;

        public C1309a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c982bed6431031d8e3fb3d6f2958b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c982bed6431031d8e3fb3d6f2958b3");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_bg);
            this.c = (RoundedCornerImageView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_picture);
            this.d = (ImageView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_inner_index_icon);
            this.f = (TextView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_inner_index);
            this.g = (TextView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_title);
            this.h = (TextView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_hot_num);
            this.e = (ImageView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_position_type);
            this.i = (TextView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_exlpain);
            this.j = (TextView) view.findViewById(R.id.wm_sc_nox_search_hot_rank_all);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461d1a1398c7791afd573097b484ae0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461d1a1398c7791afd573097b484ae0b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("entranceId", String.valueOf(this.l.y));
        hashMap.put("categoryType", String.valueOf(this.l.z));
        hashMap.put("categoryText", this.l.A);
        hashMap.put("subCategoryType", String.valueOf(this.l.B));
        hashMap.put("hotRankStid", com.sankuai.waimai.store.search.statistics.g.f(this.l));
        d.a(this.k, "flashbuy-search-hot-rank", "flashbuy-search-guide", hashMap);
    }
}
