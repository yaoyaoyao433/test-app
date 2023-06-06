package com.sankuai.waimai.store.search.template.waterfallspu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.RecommendSummary;
import com.sankuai.waimai.store.search.model.f;
import com.sankuai.waimai.store.search.template.spu.V750FeedSpuPropertyView;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.util.c;
import com.sankuai.waimai.store.search.view.SoldOutRemindView;
import com.sankuai.waimai.store.search.view.StoreHandPriceView;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.LiveView;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    TextView F;
    View G;
    ViewGroup H;
    com.sankuai.waimai.store.search.template.spu.b I;
    View J;
    ImageView K;
    TextView L;
    c M;
    e.a N;
    int[] O;
    boolean P;
    SearchShareData Q;
    final ArrayList<Long> R;
    private FrameLayout S;
    private TextView T;
    private RecyclerView U;
    private TextView V;
    private List<V750FeedSpuPropertyView> W;
    Context b;
    View c;
    TextView d;
    ImageView e;
    TextView f;
    LiveView g;
    ImageView h;
    TextView i;
    View j;
    SoldOutRemindView k;
    TextView l;
    ViewGroup m;
    TextView n;
    SCSingleLineFlowLayout o;
    SCSingleLineFlowLayout p;
    TextView q;
    TextView r;
    TextView s;
    TextView t;
    StoreHandPriceView u;
    TextView v;
    TextView w;
    View x;
    ImageView y;
    ImageView z;

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6cc138a2eb5b353ba59b7c2b6fac87f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6cc138a2eb5b353ba59b7c2b6fac87f");
            return;
        }
        this.O = new int[0];
        this.R = new ArrayList<>();
        this.b = view.getContext();
        this.c = view.findViewById(R.id.search_feed_spu_waterfall_spu_region);
        this.S = (FrameLayout) view.findViewById(R.id.search_feed_spu_waterfall_image_container);
        this.d = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_ad);
        this.e = (ImageView) view.findViewById(R.id.search_feed_spu_waterfall_image);
        this.f = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_video_time);
        this.g = (LiveView) view.findViewById(R.id.search_feed_spu_waterfall_live_icon);
        this.h = (ImageView) view.findViewById(R.id.search_feed_spu_waterfall_short_label);
        this.i = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_diamond_property);
        this.j = view.findViewById(R.id.search_feed_spu_waterfall_sold_out_layer);
        this.k = (SoldOutRemindView) view.findViewById(R.id.search_feed_spu_waterfall_sold_out_view_container);
        this.l = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_spu_name);
        this.m = (ViewGroup) view.findViewById(R.id.recommend_summary_container);
        this.n = (TextView) view.findViewById(R.id.search_feed_spu_behaviour_recommend);
        this.o = (SCSingleLineFlowLayout) view.findViewById(R.id.search_feed_spu_waterfall_spu_property_container);
        this.p = (SCSingleLineFlowLayout) view.findViewById(R.id.search_feed_spu_waterfall_recommend_container);
        this.q = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_price_symbol);
        this.r = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_price);
        this.s = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_price_unit);
        this.t = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_price_description);
        this.u = (StoreHandPriceView) view.findViewById(R.id.search_feed_spu_waterfall_hand_price);
        this.v = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_spu_tag);
        this.w = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_month_sale);
        this.x = view.findViewById(R.id.search_feed_spu_waterfall_poi_region);
        this.y = (ImageView) view.findViewById(R.id.search_feed_spu_waterfall_poi_image);
        this.z = (ImageView) view.findViewById(R.id.search_feed_spu_waterfall_poi_icon);
        this.A = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_poi_name);
        this.B = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_delivery_fee);
        this.C = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_origin_delivery_fee);
        this.C.getPaint().setStrikeThruText(true);
        this.D = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_delivery_time);
        this.E = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_delivery_type_kuaidi);
        this.F = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_poi_status);
        this.G = view.findViewById(R.id.search_feed_spu_waterfall_gray_cover_global);
        this.H = (ViewGroup) view.findViewById(R.id.search_feed_spu_waterfall_recommend_spu_container);
        this.T = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_recommend_spu_title);
        this.U = (RecyclerView) view.findViewById(R.id.search_feed_spu_waterfall_recommend_spu);
        this.V = (TextView) view.findViewById(R.id.search_feed_spu_waterfall_buy);
        this.J = view.findViewById(R.id.presale_container);
        this.K = (ImageView) view.findViewById(R.id.presale_iv);
        this.L = (TextView) view.findViewById(R.id.presale_tv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.b);
        linearLayoutManager.setOrientation(0);
        this.I = new com.sankuai.waimai.store.search.template.spu.b();
        this.U.setLayoutManager(linearLayoutManager);
        this.U.setAdapter(this.I);
        this.N = new e.a();
        this.M = new c(this.b);
        int a2 = (h.a(this.b) - h.a(this.b, 32.0f)) / 2;
        ViewGroup.LayoutParams layoutParams = this.S.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = a2;
            layoutParams.height = a2;
            this.S.setLayoutParams(layoutParams);
        }
        this.Q = SearchShareData.a(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3faaac885dc6371d901e42d9353e903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3faaac885dc6371d901e42d9353e903");
            return;
        }
        u.a((View) this.V, 8);
        if (recommendSummary == null || recommendSummary.recommendTags == null || recommendSummary.recommendTags.size() <= 0) {
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
        for (int i = 0; i < a2; i++) {
            RecommendSummary.RecommendTag recommendTag = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i);
            if (recommendTag != null && !TextUtils.isEmpty(recommendTag.text) && recommendTag.location == 5) {
                u.a((View) this.V, 0);
                u.a(this.V, recommendTag.text);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9274415a32a458e0b0fb76a62f6541f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9274415a32a458e0b0fb76a62f6541f9");
            return;
        }
        BaseProductPoi.RecommendSpuCombo recommendSpuCombo = fVar.productInfoItem.Q;
        this.R.clear();
        if (recommendSpuCombo == null || com.sankuai.shangou.stone.util.a.b(recommendSpuCombo.recommendSpus)) {
            return;
        }
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) recommendSpuCombo.recommendSpus); i++) {
            BaseProductPoi.RecommendSpu recommendSpu = (BaseProductPoi.RecommendSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSpuCombo.recommendSpus, i);
            if (recommendSpu != null) {
                this.R.add(Long.valueOf(recommendSpu.spuId));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febe7052339fbdd244c8b681a7ba4a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febe7052339fbdd244c8b681a7ba4a93");
        } else if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.i.setVisibility(8);
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
                this.i.setVisibility(8);
                return;
            }
            this.i.setVisibility(0);
            this.i.setText(recommendTag.text);
            this.i.setTextColor(d.a(recommendTag.textColor, -16777216));
            this.i.setBackground(this.N.a(this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).b(0).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{d.a(recommendTag.backgroundStartColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_white)), d.a(recommendTag.backgroundEndColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_white))}).a());
            if (recommendTag.iconUrl != null) {
                final int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_11);
                final int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2);
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = this.b;
                a3.c = recommendTag.iconUrl;
                a3.a(new b.a() { // from class: com.sankuai.waimai.store.search.template.waterfallspu.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr2 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61e80aeabe36a6fbfa068f524be0a7a9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61e80aeabe36a6fbfa068f524be0a7a9");
                            return;
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(b.this.b.getResources(), bitmap);
                        bitmapDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        b.this.i.setCompoundDrawables(bitmapDrawable, null, null, null);
                        b.this.i.setCompoundDrawablePadding(dimensionPixelSize2);
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "610fc4caaf39bcae822e35d5e0e29fb7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "610fc4caaf39bcae822e35d5e0e29fb7");
                        } else {
                            b.this.i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "197e040a4e02557db3880ea41e3c63e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "197e040a4e02557db3880ea41e3c63e9");
        } else if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.n.setVisibility(8);
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
                this.n.setVisibility(8);
                return;
            }
            this.n.setVisibility(0);
            this.n.setText(recommendTag.text);
            this.n.setTextColor(d.a(recommendTag.textColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFCC99)));
            this.n.setBackground(this.N.a(this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2)).b(this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_half)).a(d.a(d.a(recommendTag.textColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFCC99)), 0.3f)).c(0).a(GradientDrawable.Orientation.LEFT_RIGHT, this.O).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04422d1801629cdf91564f26369e843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04422d1801629cdf91564f26369e843");
        } else if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
            this.o.setVisibility(8);
        } else {
            a();
            this.o.setVisibility(0);
            int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
            int i = 0;
            for (int i2 = 0; i2 < a2; i2++) {
                RecommendSummary.RecommendTag recommendTag = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i2);
                if (recommendTag != null && !TextUtils.isEmpty(recommendTag.text) && recommendTag.location == 4) {
                    V750FeedSpuPropertyView a3 = a(this.o);
                    a3.a(recommendTag, i);
                    this.o.addView(a3);
                    i++;
                }
            }
            if (this.o.getChildCount() == 0) {
                this.o.setVisibility(8);
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc86bab9d4fd8eaafe72fb9350096632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc86bab9d4fd8eaafe72fb9350096632");
            return;
        }
        int childCount = this.o.getChildCount();
        if (childCount == 0) {
            return;
        }
        if (this.W == null) {
            this.W = new ArrayList(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            this.W.add((V750FeedSpuPropertyView) this.o.getChildAt(i));
        }
        this.o.removeAllViews();
    }

    private V750FeedSpuPropertyView a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ccc0bdb758adf8c595fe830e0e8da0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (V750FeedSpuPropertyView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ccc0bdb758adf8c595fe830e0e8da0b");
        }
        if (this.W == null || this.W.isEmpty()) {
            return (V750FeedSpuPropertyView) LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_list_item_v750_feed_spu_property, viewGroup, false);
        }
        return this.W.remove(this.W.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313bf0ce311cb7a06ddb601dacd50c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313bf0ce311cb7a06ddb601dacd50c10");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            int indexOf = str.indexOf(CommonConstant.Symbol.DOT);
            if (indexOf > 0) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new AbsoluteSizeSpan(this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14)), indexOf, str.length(), 17);
                this.r.setText(spannableString);
                return;
            }
            this.r.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(4.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d1a535a3f2e58736994e55d53fb3de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d1a535a3f2e58736994e55d53fb3de")).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 4.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 4.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, final ImageView imageView) {
        Object[] objArr = {str, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d21809b607ae0bc8fec0094880d1d5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d21809b607ae0bc8fec0094880d1d5ab");
        } else if (TextUtils.isEmpty(str)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = str;
            a2.a(new b.d() { // from class: com.sankuai.waimai.store.search.template.waterfallspu.b.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31be2b2169f51220c9ea232656979ce7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31be2b2169f51220c9ea232656979ce7");
                    } else {
                        imageView.setVisibility(0);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b280b39344d181bb63c278f24eace5a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b280b39344d181bb63c278f24eace5a0");
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }).a(imageView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(BaseProductPoi.RecommendSpuTitle recommendSpuTitle) {
        Object[] objArr = {recommendSpuTitle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2506ab01ddaa2d12c7adace196fb1211", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2506ab01ddaa2d12c7adace196fb1211")).booleanValue();
        }
        if (recommendSpuTitle == null || TextUtils.isEmpty(recommendSpuTitle.text)) {
            this.T.setVisibility(8);
            return false;
        }
        this.T.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        for (char c : recommendSpuTitle.text.toCharArray()) {
            sb.append(c);
            sb.append('\n');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        this.T.setText(sb.toString());
        this.T.setTextColor(d.a(recommendSpuTitle.textColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000)));
        this.T.setBackground(new e.a().c(d.a(recommendSpuTitle.backgroundColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFF8E1))).a(this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4)).a());
        return true;
    }
}
