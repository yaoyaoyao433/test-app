package com.sankuai.waimai.store.search.template.spu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.RecommendSummary;
import com.sankuai.waimai.store.search.model.f;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.view.HotSaleTag;
import com.sankuai.waimai.store.search.view.SoldOutRemindView;
import com.sankuai.waimai.store.search.view.StoreHandPriceView;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.LiveView;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import com.sankuai.waimai.store.view.standard.FlashPrice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    TextView A;
    TextView B;
    LiveView C;
    ImageView D;
    TextView E;
    ViewGroup F;
    ViewGroup G;
    ViewGroup H;
    TextView I;
    b J;
    View K;
    ImageView L;
    ImageView M;
    TextView N;
    TextView O;
    ImageView P;
    TextView Q;
    TextView R;
    TextView S;
    TextView T;
    TextView U;
    TextView V;
    TextView W;
    TextView X;
    View Y;
    ImageView Z;
    TextView aa;
    StoreHandPriceView ab;
    View ac;
    e.a ad;
    int[] ae;
    boolean af;
    boolean ag;
    final ArrayList<Long> ah;
    private RecyclerView ai;
    private TextView aj;
    private List<V750FeedSpuPropertyView> ak;
    SearchShareData b;
    Context c;
    View d;
    SoldOutRemindView e;
    com.sankuai.waimai.store.search.util.c f;
    SCSingleLineFlowLayout g;
    LinearLayout h;
    TagCanvasView i;
    ImageView j;
    View k;
    TextView l;
    ViewGroup m;
    ImageView n;
    TextView o;
    LinearLayout p;
    TextView q;
    SCSingleLineFlowLayout r;
    ViewGroup s;
    LinearLayout t;
    FlashPrice u;
    TextView v;
    HotSaleTag w;
    TextView x;
    TextView y;
    TextView z;

    public c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4529b10d4b0a12e5687648e38df983", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4529b10d4b0a12e5687648e38df983");
            return;
        }
        this.ae = new int[0];
        this.ah = new ArrayList<>();
        this.k = view.findViewById(R.id.search_feed_spu_spu_layout);
        this.l = (TextView) view.findViewById(R.id.search_feed_spu_ad);
        this.m = (ViewGroup) view.findViewById(R.id.search_feed_spu_image_container);
        this.n = (ImageView) view.findViewById(R.id.search_feed_spu_image);
        this.o = (TextView) view.findViewById(R.id.search_feed_spu_name);
        this.p = (LinearLayout) view.findViewById(R.id.search_feed_spu_container_below_title);
        this.q = (TextView) view.findViewById(R.id.search_feed_spu_behaviour_recommend);
        this.r = (SCSingleLineFlowLayout) view.findViewById(R.id.search_result_spu_property_container);
        this.s = (ViewGroup) view.findViewById(R.id.search_feed_spu_price_layout);
        this.t = (LinearLayout) view.findViewById(R.id.search_feed_spu_flash_price_wrapper);
        this.u = (FlashPrice) view.findViewById(R.id.search_feed_spu_flash_price);
        this.z = (TextView) view.findViewById(R.id.price_description_of_paotui);
        this.v = (TextView) view.findViewById(R.id.search_feed_spu_promotion);
        this.w = (HotSaleTag) view.findViewById(R.id.search_feed_spu_hot_sale_tag);
        this.x = (TextView) view.findViewById(R.id.search_feed_spu_member_price);
        this.y = (TextView) view.findViewById(R.id.search_feed_spu_nearly_sold_out);
        this.A = (TextView) view.findViewById(R.id.search_feed_spu_month_sale);
        this.ab = (StoreHandPriceView) view.findViewById(R.id.store_search_spu_hand_price);
        this.K = view.findViewById(R.id.wm_sc_nox_search_product_feed_bottom_poi_area);
        this.L = (ImageView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_logo);
        this.M = (ImageView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_icon);
        this.N = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_name);
        this.O = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_delivery_type_text);
        this.P = (ImageView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_delivery_type);
        this.Q = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_rating_num);
        this.R = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_min_price_tip);
        this.S = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_shipping_fee);
        this.T = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_origin_shipping_fee_tip);
        this.T.getPaint().setStrikeThruText(true);
        this.U = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_too_far_text);
        this.V = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_status);
        this.W = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_delivery_time);
        this.X = (TextView) view.findViewById(R.id.wm_sc_nox_search_feed_spu_poi_delivery_distance);
        this.ac = view.findViewById(R.id.spu_gray_cover_global);
        this.B = (TextView) view.findViewById(R.id.video_time);
        this.C = (LiveView) view.findViewById(R.id.search_spu_live_icon);
        this.D = (ImageView) view.findViewById(R.id.search_feed_spu_marketing_short_label);
        this.E = (TextView) view.findViewById(R.id.search_feed_spu_diamond_property);
        this.d = view.findViewById(R.id.search_common_sold_out_layer);
        this.e = (SoldOutRemindView) view.findViewById(R.id.search_common_sold_out_view_container);
        this.g = (SCSingleLineFlowLayout) view.findViewById(R.id.search_common_recommend_summary);
        this.h = (LinearLayout) view.findViewById(R.id.search_common_dynamic_tag_container);
        this.i = (TagCanvasView) view.findViewById(R.id.search_common_dynamic_tag_view);
        this.j = (ImageView) view.findViewById(R.id.search_common_dynamic_tag_arrow);
        this.F = (ViewGroup) view.findViewById(R.id.search_feed_spu_info_top_layout);
        this.G = (ViewGroup) view.findViewById(R.id.search_feed_spu_info_bottom_layout);
        this.H = (ViewGroup) view.findViewById(R.id.wm_sc_nox_search_product_feed_recommend_spu_container);
        this.I = (TextView) view.findViewById(R.id.wm_sc_nox_search_product_feed_recommend_spu_title);
        this.ai = (RecyclerView) view.findViewById(R.id.wm_sc_nox_search_product_feed_recommend_spu);
        this.Y = view.findViewById(R.id.presale_container);
        this.Z = (ImageView) view.findViewById(R.id.presale_iv);
        this.aa = (TextView) view.findViewById(R.id.presale_tv);
        this.aj = (TextView) view.findViewById(R.id.search_common_buy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.c);
        linearLayoutManager.setOrientation(0);
        this.c = view.getContext();
        this.b = SearchShareData.a(this.c);
        this.J = new b();
        this.ai.setLayoutManager(linearLayoutManager);
        this.ai.setAdapter(this.J);
        this.f = new com.sankuai.waimai.store.search.util.c(view.getContext());
        this.ad = new e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19dcb09fd1b49525789cb61c12347286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19dcb09fd1b49525789cb61c12347286");
            return;
        }
        u.a((View) this.aj, 8);
        u.a((View) this.X, 0);
        if (recommendSummary == null || recommendSummary.recommendTags == null || recommendSummary.recommendTags.size() <= 0) {
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
        for (int i = 0; i < a2; i++) {
            RecommendSummary.RecommendTag recommendTag = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i);
            if (recommendTag != null && !TextUtils.isEmpty(recommendTag.text) && recommendTag.location == 5) {
                u.a((View) this.aj, 0);
                u.a(this.aj, recommendTag.text);
                u.a((View) this.X, 8);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2fc0d0e292b17806070d452db01619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2fc0d0e292b17806070d452db01619");
            return;
        }
        BaseProductPoi.RecommendSpuCombo recommendSpuCombo = fVar.productInfoItem.Q;
        this.ah.clear();
        if (recommendSpuCombo == null || com.sankuai.shangou.stone.util.a.b(recommendSpuCombo.recommendSpus)) {
            return;
        }
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) recommendSpuCombo.recommendSpus); i++) {
            BaseProductPoi.RecommendSpu recommendSpu = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSpuCombo.recommendSpus, i);
            if (recommendSpu != null) {
                this.ah.add(Long.valueOf(recommendSpu.spuId));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27096576a9689334cf73d7659ea23b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27096576a9689334cf73d7659ea23b67");
        } else if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.E.setVisibility(8);
        } else {
            RecommendSummary.RecommendTag recommendTag = null;
            int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
            int i = 0;
            while (true) {
                if (i < a2) {
                    RecommendSummary.RecommendTag recommendTag2 = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i);
                    if (recommendTag2 != null && !TextUtils.isEmpty(recommendTag2.text) && recommendTag2.location == 3) {
                        recommendTag = recommendTag2;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (recommendTag == null) {
                this.E.setVisibility(8);
                return;
            }
            this.E.setVisibility(0);
            this.E.setText(recommendTag.text);
            this.E.setTextColor(d.a(recommendTag.textColor, -16777216));
            this.E.setBackground(this.ad.a(this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{d.a(recommendTag.backgroundStartColor, this.c.getResources().getColor(R.color.wm_sc_nox_search_white)), d.a(recommendTag.backgroundEndColor, this.c.getResources().getColor(R.color.wm_sc_nox_search_white))}).a());
            if (recommendTag.iconUrl != null) {
                final int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_11);
                final int dimensionPixelSize2 = this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2);
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = this.c;
                a3.c = recommendTag.iconUrl;
                a3.a(new b.a() { // from class: com.sankuai.waimai.store.search.template.spu.c.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr2 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1986bb7f50abb49cc56d612309fa72e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1986bb7f50abb49cc56d612309fa72e9");
                            return;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(c.this.c.getResources(), bitmap);
                        bitmapDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        c.this.E.setCompoundDrawables(bitmapDrawable, null, null, null);
                        c.this.E.setCompoundDrawablePadding(dimensionPixelSize2);
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dce6c4554ca17fc9d079250dfc2516f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dce6c4554ca17fc9d079250dfc2516f");
                        } else {
                            c.this.E.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83699457262749623f54765ddbb5a50e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83699457262749623f54765ddbb5a50e");
        } else if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.q.setVisibility(8);
        } else {
            RecommendSummary.RecommendTag recommendTag = null;
            int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
            int i = 0;
            while (true) {
                if (i < a2) {
                    RecommendSummary.RecommendTag recommendTag2 = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i);
                    if (recommendTag2 != null && !TextUtils.isEmpty(recommendTag2.text) && recommendTag2.location == 1) {
                        recommendTag = recommendTag2;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (recommendTag == null) {
                this.q.setVisibility(8);
                return;
            }
            this.q.setVisibility(0);
            this.q.setText(recommendTag.text);
            this.q.setTextColor(d.a(recommendTag.textColor, this.c.getResources().getColor(R.color.wm_sc_nox_search_color_FFCC99)));
            this.q.setBackground(this.ad.a(this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2)).b(this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_half)).a(d.a(d.a(recommendTag.textColor, this.c.getResources().getColor(R.color.wm_sc_nox_search_color_FFCC99)), 0.3f)).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, this.ae).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f6b4b41054ec50d2c9d5c8c3288b962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f6b4b41054ec50d2c9d5c8c3288b962");
        } else if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.r.setVisibility(8);
        } else {
            a();
            this.r.setVisibility(0);
            int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
            int i = 0;
            for (int i2 = 0; i2 < a2; i2++) {
                RecommendSummary.RecommendTag recommendTag = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i2);
                if (recommendTag != null && !TextUtils.isEmpty(recommendTag.text) && recommendTag.location == 4) {
                    V750FeedSpuPropertyView a3 = a(this.r);
                    a3.a(recommendTag, i);
                    this.r.addView(a3);
                    i++;
                }
            }
            if (this.r.getChildCount() == 0) {
                this.r.setVisibility(8);
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9d9e9077758042354c695c97279031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9d9e9077758042354c695c97279031");
            return;
        }
        int childCount = this.r.getChildCount();
        if (childCount == 0) {
            return;
        }
        if (this.ak == null) {
            this.ak = new ArrayList(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            this.ak.add((V750FeedSpuPropertyView) this.r.getChildAt(i));
        }
        this.r.removeAllViews();
    }

    private V750FeedSpuPropertyView a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d2abfca759c8aa2b332f3a5efe72ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (V750FeedSpuPropertyView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d2abfca759c8aa2b332f3a5efe72ad");
        }
        if (this.ak == null || this.ak.isEmpty()) {
            return (V750FeedSpuPropertyView) LayoutInflater.from(this.c).inflate(R.layout.wm_sc_nox_search_list_item_v750_feed_spu_property, viewGroup, false);
        }
        return this.ak.remove(this.ak.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(BaseProductPoi.RecommendSpuTitle recommendSpuTitle, List<BaseProductPoi.RecommendSpu> list) {
        final BaseProductPoi.RecommendSpu recommendSpu;
        Object[] objArr = {recommendSpuTitle, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1bd63d894705bd88fea87c9343e704", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1bd63d894705bd88fea87c9343e704")).booleanValue();
        }
        if (recommendSpuTitle == null || TextUtils.isEmpty(recommendSpuTitle.text)) {
            this.I.setVisibility(8);
            return false;
        }
        this.I.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        for (char c : recommendSpuTitle.text.toCharArray()) {
            sb.append(c);
            sb.append('\n');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        this.I.setText(sb.toString());
        this.I.setTextColor(d.a(recommendSpuTitle.textColor, this.c.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000)));
        this.I.setBackground(new e.a().c(d.a(recommendSpuTitle.backgroundColor, this.c.getResources().getColor(R.color.wm_sc_nox_search_color_FFF8E1))).a(this.c.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).a());
        if (!com.sankuai.shangou.stone.util.a.a((Collection<?>) list) || (recommendSpu = list.get(0)) == null) {
            return true;
        }
        this.I.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.spu.c.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94a5f3c0b7c1bbf4448891d9ea44c2cd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94a5f3c0b7c1bbf4448891d9ea44c2cd");
                    return;
                }
                recommendSpu.nodeForRcmdSpu.b(c.this.I.getContext());
                if (TextUtils.isEmpty(recommendSpu.scheme)) {
                    return;
                }
                com.sankuai.waimai.store.router.d.a(c.this.n.getContext(), com.sankuai.waimai.store.search.statistics.e.a(recommendSpu.scheme, c.this.ah));
            }
        });
        return true;
    }
}
