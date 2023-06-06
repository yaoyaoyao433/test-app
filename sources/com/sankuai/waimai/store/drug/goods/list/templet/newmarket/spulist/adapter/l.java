package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import com.sankuai.waimai.store.widgets.text.GoodDetailPriceTextView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends m {
    public static ChangeQuickRedirect a;
    private TextView c;

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.m
    public final InnerCellView b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e12bd32144038d4803be8d359ee6f7d", RobustBitConfig.DEFAULT_VALUE) ? (InnerCellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e12bd32144038d4803be8d359ee6f7d") : new a((d) this.o);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.m, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0634fd3b61cf85544cf552b8c2bb62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0634fd3b61cf85544cf552b8c2bb62b");
            return;
        }
        super.a(view);
        this.c = (TextView) view.findViewById(R.id.tv_spu_base_cycle_purchase);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.m, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dfe19303c00bb877e2ff8ced9260297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dfe19303c00bb877e2ff8ced9260297");
            return;
        }
        super.a(eVar, i);
        if (eVar == null || eVar.d == null) {
            return;
        }
        ((d) this.o).a(eVar.d, this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends InnerCellView implements com.sankuai.waimai.platform.widget.tag.virtualtag.c<Map<String, String>>, CanvasView.a.InterfaceC1104a {
        public static ChangeQuickRedirect a;
        private View aA;
        private View aB;
        private TextView aC;
        private UniversalImageView aD;
        private SCSingleLineFlowLayout aE;
        private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.helper.a aF;
        private TagCanvasView aG;
        private TagCanvasView aH;
        private View aI;
        private TextView aJ;
        private GoodDetailPriceTextView aK;
        private LinearLayout aL;
        private View ar;
        private TextView as;
        private View at;
        private TextView au;
        private d av;
        private RecommendPairBlock aw;
        private SearchRecommendPairBlock ax;
        private View ay;
        private View az;

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final int getLayoutId() {
            return R.layout.wm_st_poi_market_adapter_goods_bak_two_line;
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final boolean y() {
            return true;
        }

        public a(@NonNull d dVar) {
            super(dVar.getContext());
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5baf9e16be8865bfdd617365ceb03a69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5baf9e16be8865bfdd617365ceb03a69");
                return;
            }
            this.av = dVar;
            CellUiConfig a2 = CellUiConfig.a();
            a2.d = 2;
            setCellConfig(a2);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void a(GoodsSpu goodsSpu) {
            Object[] objArr = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25cd0586c2a684063448539e17509547", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25cd0586c2a684063448539e17509547");
                return;
            }
            super.a(goodsSpu);
            if (com.sankuai.waimai.store.config.d.h().a("drug_poi_auto_add_multi_sku", true) && goodsSpu.isManySku()) {
                this.aj.a(goodsSpu, this.ag);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void u() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d763c565ad40dfcd495b221e322ab0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d763c565ad40dfcd495b221e322ab0");
                return;
            }
            super.u();
            u.c(this.aA);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void v() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfd7e25500ab4afeec26175203ecd89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfd7e25500ab4afeec26175203ecd89");
                return;
            }
            super.v();
            u.c(this.aA);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void F() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3b68fece2aa31bfc343df10c1d0a09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3b68fece2aa31bfc343df10c1d0a09");
                return;
            }
            super.F();
            u.c(this.aA);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void E() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e237cc08848e1242ae905bd76c1082", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e237cc08848e1242ae905bd76c1082");
                return;
            }
            u.a(this.aA);
            super.E();
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView
        public final void h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a04ec769f2d4e245c8ed4c388acead", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a04ec769f2d4e245c8ed4c388acead");
            } else {
                u.c(this.aA);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38a98d08550b1bc403940246d83a00e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38a98d08550b1bc403940246d83a00e");
                return;
            }
            super.c();
            this.ar = findViewById(R.id.ll_stickyfoodList_adapter_food_food);
            this.ay = findViewById(R.id.top_container);
            this.as = (TextView) findViewById(R.id.tv_praise_rate);
            this.at = findViewById(R.id.new_customer_promotion);
            this.au = (TextView) findViewById(R.id.txt_promotion_drawable);
            this.aA = findViewById(R.id.ll_promotion_info);
            this.aB = findViewById(R.id.ll_promotion_coupon);
            this.aC = (TextView) findViewById(R.id.txt_promotion_coupon);
            this.aD = (UniversalImageView) findViewById(R.id.im_promotion_coupon_arrow);
            this.az = findViewById(R.id.v_position_layout);
            u.c(findViewById(R.id.rl_month_sale_good_rate));
            this.aG = (TagCanvasView) findViewById(R.id.tag_top_of_price);
            u.a(this.aG);
            this.aH = (TagCanvasView) findViewById(R.id.tag_of_brief);
            u.a(this.aH);
            this.aA.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a(), 4.0f)).a(com.sankuai.waimai.store.util.b.b(com.sankuai.waimai.store.util.b.a(), R.color.wm_sg_color_FDC9C6)).b(2).a());
            this.aD.setImageDrawable(com.sankuai.waimai.store.view.a.a(com.sankuai.waimai.store.util.b.a(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_6, (int) R.color.wm_sg_color_FB4E44, a.EnumC1338a.RIGHT));
            this.aI = this.n.findViewById(R.id.price_info_on_pic);
            this.aJ = (TextView) this.n.findViewById(R.id.price_info_on_pic_prefix_text);
            this.aK = (GoodDetailPriceTextView) this.n.findViewById(R.id.price_info_on_pic_price);
            this.aL = (LinearLayout) findViewById(R.id.root_food_count_view);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57b685833878c39224ee97c7db58ccf9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57b685833878c39224ee97c7db58ccf9");
            } else if (com.sankuai.waimai.store.config.d.i == null) {
            } else {
                if ("A1".equals(com.sankuai.waimai.store.config.d.i.e) || "A2".equals(com.sankuai.waimai.store.config.d.i.e)) {
                    this.ar.setPadding(0, 0, 0, 0);
                } else {
                    this.ar.setPadding(0, 0, 0, com.sankuai.shangou.stone.util.h.a(getContext(), 10.0f));
                }
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final String getDrugName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1115a4929d2b3cf55b3e0ee1d2f555df", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1115a4929d2b3cf55b3e0ee1d2f555df") : this.ae == null ? "" : t.a(this.ae.showName) ? this.ae.getName() : this.ae.showName;
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void j() {
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d744c9fd9e45faf5593993032742ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d744c9fd9e45faf5593993032742ce");
            } else if (p.a(this.ae, this.u)) {
            } else {
                if (t.a(this.ae.vaguePicture)) {
                    str = t.a(this.ae.coverUrl) ? this.ae.picture : this.ae.coverUrl;
                } else {
                    str = this.ae.vaguePicture;
                }
                b.C0608b a2 = com.sankuai.waimai.store.util.m.a(str, (int) getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_75), getDishPicQuality());
                a2.j = R.drawable.wm_drug_goods_list_product_place_holder;
                a2.i = R.drawable.wm_drug_goods_list_product_place_holder;
                a2.a(this.u);
                u.a(this.u);
            }
        }

        private void I() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb40f5dc34e447e4ec7614b7e924e4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb40f5dc34e447e4ec7614b7e924e4d");
            } else if (this.ae == null) {
            } else {
                if (!p.a(this.ae.multiProductDiscountInfo, this.af) && !p.a(Double.valueOf(this.ae.multiProductDiscountInfo.lowestUnitPrice)) && !t.a(this.af.u()) && com.sankuai.shangou.stone.util.i.e(Double.valueOf(this.ae.multiProductDiscountInfo.lowestUnitPrice), Double.valueOf(0.0d)) && !q()) {
                    String a2 = com.sankuai.shangou.stone.util.i.a(this.ae.multiProductDiscountInfo.lowestUnitPrice);
                    if (!p.a(this.aK)) {
                        GoodDetailPriceTextView goodDetailPriceTextView = this.aK;
                        Context context = getContext();
                        Object[] objArr2 = {context, Float.valueOf(8.0f)};
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.shangou.stone.util.h.a;
                        goodDetailPriceTextView.setPointPriceTextSize(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d925addcc03bf3f2b22775b49d09d2bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d925addcc03bf3f2b22775b49d09d2bd")).intValue() : (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
                        this.aK.setPrice(a2);
                    }
                    this.aI.setBackground(new e.a().a(0.0f, 0.0f, com.sankuai.shangou.stone.util.h.a(getContext(), 2.0f), com.sankuai.shangou.stone.util.h.a(getContext(), 2.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FDEEEC), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FEF5F4)}).a());
                    if (this.ae.multiProductDiscountInfo.type == 1) {
                        u.a(this.aJ, "单件价格约");
                        u.a(this.aI, 0);
                        return;
                    } else if (this.ae.multiProductDiscountInfo.productAmount > 0) {
                        u.a(this.aJ, this.ae.multiProductDiscountInfo.productAmount + "件单价约");
                        u.a(this.aI, 0);
                        return;
                    } else {
                        u.a(this.aI, 8);
                        return;
                    }
                }
                u.a(this.aI, 8);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f82698159596b33065830caa3e2ef38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f82698159596b33065830caa3e2ef38");
                return;
            }
            u.c(this.at);
            super.d();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20800626c3bdeb8de7242c6a01637a22", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20800626c3bdeb8de7242c6a01637a22");
            } else if (this.ae != null) {
                if (t.a(this.ae.praiseRate)) {
                    this.as.setVisibility(8);
                } else {
                    this.as.setVisibility(0);
                    this.as.setText(this.ae.praiseRate);
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ed9fee877f890b5004982c2faa8505a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ed9fee877f890b5004982c2faa8505a");
            } else {
                if (this.af.c) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8f43b2bd27fb41a6cc6763ab87d0215d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8f43b2bd27fb41a6cc6763ab87d0215d");
                    } else if (this.aw == null) {
                        this.aw = new RecommendPairBlock(this.ar.getContext(), this.av);
                        ViewStub viewStub = (ViewStub) findViewById(R.id.recommend_pair_container);
                        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.rightMargin = 0;
                            viewStub.setLayoutParams(marginLayoutParams);
                        }
                        viewStub.setLayoutResource(R.layout.wm_drug_goods_list_recommend_pair_list);
                        this.aw.bindView(viewStub.inflate());
                    }
                    if (this.aw != null) {
                        final RecommendPairBlock recommendPairBlock = this.aw;
                        GoodsSpu goodsSpu = this.ae;
                        Object[] objArr5 = {goodsSpu};
                        ChangeQuickRedirect changeQuickRedirect5 = RecommendPairBlock.a;
                        if (PatchProxy.isSupport(objArr5, recommendPairBlock, changeQuickRedirect5, false, "09f2f6a3309521dced3a571b37a4a417", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, recommendPairBlock, changeQuickRedirect5, false, "09f2f6a3309521dced3a571b37a4a417");
                        } else if (goodsSpu != null) {
                            RecommendPair recommendPair = goodsSpu.recommendPair;
                            if (recommendPair == null) {
                                u.c(recommendPairBlock.getView());
                            } else {
                                u.a(recommendPairBlock.c, recommendPair.mainTitle);
                                u.a(recommendPairBlock.d, recommendPair.subTitle);
                                u.a(recommendPairBlock.e, recommendPair.legalText);
                                RecommendPairBlock.b bVar = recommendPairBlock.g;
                                Object[] objArr6 = {goodsSpu, recommendPair};
                                ChangeQuickRedirect changeQuickRedirect6 = RecommendPairBlock.b.a;
                                if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "917da2a50cae22451ccd6cbca5ba78d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "917da2a50cae22451ccd6cbca5ba78d9");
                                } else {
                                    bVar.c = goodsSpu;
                                    bVar.b.clear();
                                    bVar.b.put("poi_id", bVar.f().n().d());
                                    bVar.b.put("pre_spu_id", Long.valueOf(goodsSpu.getId()));
                                    bVar.b.put("stid", bVar.f().n().b.abExpInfo);
                                    bVar.b.put("trace_id", TextUtils.isEmpty(recommendPair.traceId) ? "" : recommendPair.traceId);
                                    bVar.b_(recommendPair.spus);
                                }
                                if (recommendPair.isRecommendPairAnimated) {
                                    u.a(recommendPairBlock.getView());
                                } else {
                                    recommendPairBlock.f.scrollToPosition(0);
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = RecommendPairBlock.a;
                                    if (PatchProxy.isSupport(objArr7, recommendPairBlock, changeQuickRedirect7, false, "98506387f01a2266b55e412c905b2120", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, recommendPairBlock, changeQuickRedirect7, false, "98506387f01a2266b55e412c905b2120");
                                    } else {
                                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(recommendPairBlock.getView(), PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f));
                                        ofPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.2
                                            public static ChangeQuickRedirect a;

                                            @Override // android.animation.Animator.AnimatorListener
                                            public final void onAnimationCancel(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public final void onAnimationRepeat(Animator animator) {
                                            }

                                            @Override // android.animation.Animator.AnimatorListener
                                            public final void onAnimationStart(Animator animator) {
                                                Object[] objArr8 = {animator};
                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "f8d428043e89a0159d0d7bcf34211945", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "f8d428043e89a0159d0d7bcf34211945");
                                                } else {
                                                    u.a(RecommendPairBlock.this.getView());
                                                }
                                            }
                                        });
                                        ofPropertyValuesHolder.setDuration(800L).setStartDelay(300L);
                                        ofPropertyValuesHolder.start();
                                    }
                                    recommendPair.isRecommendPairAnimated = true;
                                }
                            }
                        }
                    }
                }
                if (this.ax != null) {
                    this.ax.setVisible(false);
                }
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ea3a60ec58943e15565bf178f75ae59f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ea3a60ec58943e15565bf178f75ae59f");
            } else if (this.ae.promotion != null) {
                final GoodsSpu goodsSpu2 = this.ae;
                int i = this.ae.promotion.receiveStatus;
                Object[] objArr9 = {goodsSpu2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "1a8fa780fa6bdce2f5c324a87141b631", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "1a8fa780fa6bdce2f5c324a87141b631");
                } else if (this.aB != null && goodsSpu2 != null) {
                    switch (i) {
                        case -1:
                            u.c(this.aB);
                            u.c(this.aC);
                            u.c(this.aD);
                            this.aB.setBackground(null);
                            break;
                        case 0:
                            u.a(this.aB);
                            u.a(this.aC);
                            u.c(this.aD);
                            this.aB.setBackgroundColor(getResources().getColor(R.color.wm_sg_color_FFEAE9));
                            u.a(this.aC, (int) R.string.wm_sc_shop_accept_coupon);
                            break;
                        case 1:
                        case 3:
                            u.a(this.aB);
                            u.a(this.aC);
                            u.a(this.aD);
                            this.aB.setBackgroundColor(getResources().getColor(R.color.wm_sg_color_FFEAE9));
                            u.a(this.aC, !t.a(this.ae.promotion.buttonText) ? this.ae.promotion.buttonText : getResources().getString(R.string.wm_sg_coupon_use));
                            break;
                        case 2:
                            u.a(this.aB);
                            u.c(this.aC);
                            u.a(this.aD);
                            this.aB.setBackground(null);
                            break;
                    }
                    this.aA.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.l.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr10 = {view};
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "95acfd978649a2a4a472845f29fa4b82", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "95acfd978649a2a4a472845f29fa4b82");
                                return;
                            }
                            a.this.av.a(goodsSpu2);
                            a.this.av.c(goodsSpu2);
                        }
                    });
                }
                if (!TextUtils.isEmpty(this.ae.promotionInfo) && this.ae.promotion != null && !TextUtils.isEmpty(this.ae.promotion.promotionTxt)) {
                    this.av.b(this.aA, this.ae);
                }
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "7d0cb454ad304f5b57c314ed0ede3c44", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "7d0cb454ad304f5b57c314ed0ede3c44");
            } else {
                this.aE = (SCSingleLineFlowLayout) findViewById(R.id.tv_spu_attr_label);
                if (this.aF == null) {
                    this.aF = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.helper.a();
                }
                com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.helper.a aVar = this.aF;
                GoodsSpu goodsSpu3 = this.ae;
                SCSingleLineFlowLayout sCSingleLineFlowLayout = this.aE;
                Object[] objArr11 = {goodsSpu3, sCSingleLineFlowLayout};
                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.helper.a.a;
                if (PatchProxy.isSupport(objArr11, aVar, changeQuickRedirect11, false, "9539dfc29cf660caaa10c0fed72f6632", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, aVar, changeQuickRedirect11, false, "9539dfc29cf660caaa10c0fed72f6632");
                } else if (sCSingleLineFlowLayout != null && goodsSpu3 != null) {
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu3.productTopLabels) || !t.a(goodsSpu3.recommendReason)) {
                        sCSingleLineFlowLayout.setVisibility(8);
                    } else if (goodsSpu3.productAttrLabel != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu3.productAttrLabel.attrLabelList)) {
                        sCSingleLineFlowLayout.setVisibility(0);
                        aVar.a(goodsSpu3, sCSingleLineFlowLayout);
                    } else {
                        sCSingleLineFlowLayout.setVisibility(8);
                    }
                }
            }
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = a;
            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "5d7b770e185671452854f785d1abcdba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "5d7b770e185671452854f785d1abcdba");
            } else if (this.h != null) {
                if (!z()) {
                    if (this.ae == null || com.sankuai.shangou.stone.util.a.b(this.ae.getSkus())) {
                        this.h.setVisibility(8);
                    } else if (this.ae.hasManySpec()) {
                        if (J()) {
                            u.a(this.h);
                            this.h.setText(R.string.wm_sc_common_multi_goods_price_format);
                            this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_BCBCBD));
                        } else if (TextUtils.isEmpty(this.ae.getUnit())) {
                            u.c(this.h);
                        } else {
                            u.a(this.h);
                            this.h.setText(this.h.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                            this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_999999));
                        }
                    } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                        u.a(this.h);
                        this.h.setText(this.h.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                        this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_999999));
                    }
                }
                u.c(this.h);
            }
            Object[] objArr13 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect13 = a;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "52ed073264a03ca3bcafd623e86b3c80", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "52ed073264a03ca3bcafd623e86b3c80");
            } else {
                if (this.ae.kanoSpuLabel == null || com.sankuai.shangou.stone.util.a.b(this.ae.kanoSpuLabel.topOfPriceTag)) {
                    u.c(this.aG);
                } else {
                    u.a(this.aG);
                    if (!com.sankuai.shangou.stone.util.a.b(this.ae.kanoSpuLabel.amountSaleTips)) {
                        this.ae.kanoSpuLabel.topOfPriceTag.addAll(this.ae.kanoSpuLabel.amountSaleTips);
                        this.ae.kanoSpuLabel.amountSaleTips.clear();
                    }
                    if (this.aG.getAdapter() == null) {
                        this.aG.setAdapter(new com.sankuai.waimai.platform.widget.tag.virtualtag.g(this.av.getContext(), null));
                    }
                    ((com.sankuai.waimai.platform.widget.tag.virtualtag.g) this.aG.getAdapter()).h = this;
                    ((com.sankuai.waimai.platform.widget.tag.virtualtag.g) this.aG.getAdapter()).f = this;
                    ((com.sankuai.waimai.platform.widget.tag.virtualtag.g) this.aG.getAdapter()).b(com.sankuai.waimai.platform.widget.tag.util.a.a(this.av.getContext(), this.ae.kanoSpuLabel.topOfPriceTag));
                    this.aG.getAdapter().notifyChanged();
                }
                Object[] objArr14 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect14 = a;
                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "06e91bdc028b47fb08d76ab6f6f93189", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "06e91bdc028b47fb08d76ab6f6f93189");
                } else if (this.ae.kanoSpuLabel == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) this.ae.kanoSpuLabel.drugSearchRecTag)) {
                    u.c(this.aH);
                } else {
                    u.a(this.aH);
                    if (this.aH.getAdapter() == null) {
                        this.aH.setAdapter(new com.sankuai.waimai.platform.widget.tag.virtualtag.g(this.av.getContext(), null));
                    }
                    ((com.sankuai.waimai.platform.widget.tag.virtualtag.g) this.aH.getAdapter()).b(com.sankuai.waimai.platform.widget.tag.util.a.a(this.av.getContext(), this.ae.kanoSpuLabel.drugSearchRecTag));
                    this.aH.getAdapter().notifyChanged();
                    this.aH.post(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.l.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr15 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect15 = a;
                            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "f18824c8dbf18b182ded6e94998fbc33", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "f18824c8dbf18b182ded6e94998fbc33");
                            } else if (a.this.aH.getHeight() > 0) {
                                a.this.av.a(a.this.aH, 0, a.this.ae);
                            }
                        }
                    });
                }
            }
            I();
            if (w.a(this.ae, this.af.d()) != 0 || this.aw == null) {
                return;
            }
            RecommendPairBlock recommendPairBlock2 = this.aw;
            GoodsSpu goodsSpu4 = this.ae;
            Object[] objArr15 = {goodsSpu4};
            ChangeQuickRedirect changeQuickRedirect15 = RecommendPairBlock.a;
            if (PatchProxy.isSupport(objArr15, recommendPairBlock2, changeQuickRedirect15, false, "3beff87332dc2346483d63767473e17b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, recommendPairBlock2, changeQuickRedirect15, false, "3beff87332dc2346483d63767473e17b");
            } else {
                recommendPairBlock2.hide();
                if (recommendPairBlock2.b.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) recommendPairBlock2.b.getContext(), RecommendPairBlock.a(goodsSpu4));
                }
            }
            this.ae.recommendPair = null;
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void G() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e91ca9c10000720686d7ddd7c28de3c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e91ca9c10000720686d7ddd7c28de3c8");
            } else if (this.af == null || this.ae == null || this.af.t()) {
                u.c(this.Q);
            } else {
                HandPriceInfo b = com.sankuai.waimai.store.util.k.b(this.af.b, this.ae);
                if (b == null || t.a(b.getHandActivityPriceText()) || com.sankuai.waimai.store.order.a.e().i(this.af.d())) {
                    u.c(this.Q);
                } else if (this.Q != null) {
                    u.c(this.P);
                    u.a(this.Q);
                    this.Q.a(b, 0);
                }
            }
        }

        private boolean J() {
            GoodsSku goodsSku;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ed8c0a5df5d87d070b6e9d2d0b67b0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ed8c0a5df5d87d070b6e9d2d0b67b0")).booleanValue();
            }
            if (this.ae == null || com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus()) <= 1 || (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), 0)) == null) {
                return false;
            }
            if (goodsSku.price == goodsSku.originPrice) {
                return true;
            }
            int a2 = com.sankuai.shangou.stone.util.a.a((List) this.ae.getSkus());
            for (int i = 0; i < a2; i++) {
                GoodsSku goodsSku2 = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ae.getSkus(), i);
                if (goodsSku2 != null && (goodsSku2.price != goodsSku.price || goodsSku2.originPrice != goodsSku.originPrice)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void x() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e521633e27d8f2effb793c82c6d6dc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e521633e27d8f2effb793c82c6d6dc7");
                return;
            }
            super.x();
            com.sankuai.waimai.store.platform.domain.manager.poi.a n = this.av.n();
            if (p.a(this.ae, this.ae.handPriceInfo, n, this.A) || !this.ae.handPriceInfo.isShowNewStyle() || com.sankuai.waimai.store.order.a.e().i(n.d())) {
                return;
            }
            this.av.a(this.A.getHandPriceLabelView(), this.ae);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef48e50a0ce875178223a7855970c91c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef48e50a0ce875178223a7855970c91c");
                return;
            }
            super.a(z);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b86588679a071b77a216d106e9d9e4ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b86588679a071b77a216d106e9d9e4ce");
            } else if (!p.a(this.af) && this.af.t() && z()) {
                if (!p.a(this.A)) {
                    ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int dimensionPixelSize = (p.a(this.V) || this.V.getVisibility() != 0) ? getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50) : getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_80);
                        if (marginLayoutParams.rightMargin != dimensionPixelSize) {
                            marginLayoutParams.rightMargin = dimensionPixelSize;
                            this.A.requestLayout();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.af.u())) {
                    if (this.ae != null && this.ae.handPriceInfo != null && !TextUtils.isEmpty(this.ae.handPriceInfo.getHandPriceLabel()) && !com.sankuai.waimai.store.order.a.e().i(this.af.d())) {
                        a(-13);
                        return;
                    } else {
                        a(0);
                        return;
                    }
                }
                a(0);
            }
        }

        private void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f8e890849e32e0550579116cf7c818", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f8e890849e32e0550579116cf7c818");
            } else if (this.aL == null) {
            } else {
                ViewGroup.LayoutParams layoutParams = this.aL.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = com.sankuai.shangou.stone.util.h.a(getContext(), i);
                    this.aL.setLayoutParams(layoutParams);
                    this.aL.requestLayout();
                }
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void setNormalPromotionInfo(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86d15f691c2b6156bc87a1d03de9788", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86d15f691c2b6156bc87a1d03de9788");
            } else if (this.ae == null || this.ae.promotion == null) {
                u.c(this.aA);
            } else if (TextUtils.isEmpty(this.ae.promotion.promotionTxt)) {
                u.c(this.aA);
            } else {
                this.w.setText(this.ae.promotion.promotionTxt);
                u.a(this.aA);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void w() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c83ffafd279de789bac33be8f3ea9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c83ffafd279de789bac33be8f3ea9e");
            } else if (p.a(this.ae, this.R) || this.ae.mTopNumberAndPrivacyTag == null) {
                u.c(this.R);
            } else {
                u.a(this.R);
                com.sankuai.waimai.store.cell.a.a(getContext(), this.R, this.ae.mTopNumberAndPrivacyTag, this.am);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void setSpuSelectedStatus(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd544d580b86490e64664b36b6aa9feb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd544d580b86490e64664b36b6aa9feb");
            } else if (z) {
                this.ay.setBackgroundResource(R.color.wm_sg_color_1affa200);
            } else {
                this.ay.setBackgroundResource(R.color.wm_st_common_white);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void setNewCustomerLabel(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc1a88c0df124abd9245af01d5feeb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc1a88c0df124abd9245af01d5feeb8");
                return;
            }
            u.c(this.w);
            u.c(this.aA);
            if (t.a(this.ae.promotion.labelPic)) {
                u.c(this.at);
                return;
            }
            this.au.setText(this.ae.promotion.promotionTxt);
            u.a(this.at);
            u.a(this.ac);
            com.sankuai.waimai.store.util.m.b(this.ae.promotion.labelPic).a(new b.a() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.l.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "440d5bd22487519ff24e86b99b660291", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "440d5bd22487519ff24e86b99b660291");
                        return;
                    }
                    a.this.ac.getLayoutParams().width = (a.this.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16) * bitmap.getWidth()) / bitmap.getHeight();
                    a.this.ac.setImageBitmap(bitmap);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3f405fd2b1361a39a8d30e38e9dd9d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3f405fd2b1361a39a8d30e38e9dd9d1");
                    } else {
                        u.c(a.this.at);
                    }
                }
            });
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a.InterfaceC1104a
        public final boolean a(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map) {
            Object[] objArr = {cVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a858e16920f6de8e39d31855ec93a0de", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a858e16920f6de8e39d31855ec93a0de")).booleanValue();
            }
            if (cVar == null) {
                return false;
            }
            return cVar.a == 1 || cVar.a == 2;
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a.InterfaceC1104a
        public final void b(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map) {
            Object[] objArr = {cVar, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b45219d08a0ea80393d0d7d3dc9d402", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b45219d08a0ea80393d0d7d3dc9d402");
            } else if (cVar == null) {
            } else {
                if (map != null) {
                    this.av.a(this.ae, map);
                }
                com.sankuai.waimai.store.platform.domain.core.view.a aVar = (com.sankuai.waimai.store.platform.domain.core.view.a) com.sankuai.waimai.store.util.i.a(cVar.b, com.sankuai.waimai.store.platform.domain.core.view.a.class);
                if (aVar == null) {
                    return;
                }
                if (cVar.a == 1 && "0".equals(aVar.f)) {
                    final Dialog a2 = com.sankuai.waimai.store.util.d.a(getContext());
                    com.sankuai.waimai.store.drug.base.net.b.c().a(this.af.f(), this.af.h(), aVar.a, aVar.b, aVar.d, aVar.h, aVar.e, new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.l.a.4
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj) {
                            Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                            Object[] objArr2 = {poiCouponItem};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fb9575957663a337c7f55ced1f90566", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fb9575957663a337c7f55ced1f90566");
                                return;
                            }
                            com.sankuai.waimai.store.util.d.a(a2);
                            com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr2 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbeaeb42312eb608c497278218c29985", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbeaeb42312eb608c497278218c29985");
                                return;
                            }
                            super.a(bVar);
                            com.sankuai.waimai.store.util.d.a(a2);
                            String message = bVar.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_net_error_info);
                            }
                            am.a(a.this.ar, message);
                        }
                    });
                }
                if (cVar.a == 2) {
                    if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                        if (TextUtils.isEmpty(aVar.g)) {
                            return;
                        }
                        com.sankuai.waimai.store.router.d.a(this.av.getContext(), aVar.g);
                        return;
                    }
                    com.sankuai.waimai.store.manager.user.a.a(this.av.getContext(), new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.l.a.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fefbf005600bd034e4009e2a38d46f7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fefbf005600bd034e4009e2a38d46f7");
                            } else {
                                com.sankuai.waimai.store.manager.poi.a.a().a(a.this.av.n().d());
                            }
                        }
                    });
                }
            }
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.c
        public final void a(Set<Map<String, String>> set) {
            int i = 0;
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5194f17d953ff1defb8ba24dfe87698", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5194f17d953ff1defb8ba24dfe87698");
                return;
            }
            for (Map<String, String> map : set) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("index", String.valueOf(i));
                this.av.a(this.aG, this.ae, map);
                i++;
            }
        }
    }
}
