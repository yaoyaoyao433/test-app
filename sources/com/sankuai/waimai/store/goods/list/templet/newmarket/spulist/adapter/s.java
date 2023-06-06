package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.SearchRecommendPairBlock;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.e;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.SearchRecommendCollocateCard;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import com.sankuai.waimai.store.view.price.SCPriceView;
import com.sankuai.waimai.store.view.standard.FlashDialog;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class s extends t {
    public static ChangeQuickRedirect a;
    private TextView c;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.t
    public final InnerCellView b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c382fa2a33b1f7f173e445d630a90d57", RobustBitConfig.DEFAULT_VALUE)) {
            return (InnerCellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c382fa2a33b1f7f173e445d630a90d57");
        }
        Poi poi = (this.o == 0 || ((j) this.o).p() != null) ? ((j) this.o).p().b : null;
        if (poi != null && !((j) this.o).p().t() && (TextUtils.equals(poi.shangPinKaPianNewStyle(), "A") || TextUtils.equals(poi.shangPinKaPianNewStyle(), ErrorCode.ERROR_TYPE_B))) {
            return new b((j) this.o);
        }
        return new a((j) this.o);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.t, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec8325abf527793effce8f2fd0b9eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec8325abf527793effce8f2fd0b9eec");
            return;
        }
        super.a(view);
        this.c = (TextView) view.findViewById(R.id.tv_spu_base_cycle_purchase);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.t, com.sankuai.waimai.store.newwidgets.list.g
    public final void a(k kVar, int i) {
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe46f79f0a17bd6bc1dd1cee799a80cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe46f79f0a17bd6bc1dd1cee799a80cd");
            return;
        }
        super.a(kVar, i);
        if (kVar == null || kVar.d == null) {
            return;
        }
        ((j) this.o).a(kVar.d, this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static final class b extends a {
        public static ChangeQuickRedirect at;
        private u aA;
        private e au;
        private TextView av;
        private ViewGroup aw;
        private LinearLayout ax;
        private FrameLayout ay;
        private ImageView az;

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a, com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final int getLayoutId() {
            return R.layout.wm_st_poi_market_adapter_goods_bak_two_line_v2;
        }

        public b(@NonNull j jVar) {
            super(jVar);
            Poi.AdditionalInfo additionalInfo;
            LinearLayout.LayoutParams layoutParams;
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c254972740bab4cd912d4e5e11ed2950", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c254972740bab4cd912d4e5e11ed2950");
                return;
            }
            Object[] objArr2 = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = at;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18315d6ed6ae9d5025de78f4c3239c10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18315d6ed6ae9d5025de78f4c3239c10");
                return;
            }
            com.sankuai.waimai.store.platform.domain.manager.poi.a p = (jVar == null || jVar.p() == null) ? null : jVar.p();
            if (p == null || p.t() || p.b == null || (additionalInfo = p.b.addition) == null || !additionalInfo.addToCartLarger) {
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = at;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d96c91a3b3d1d88904317b06d97d254e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d96c91a3b3d1d88904317b06d97d254e");
                return;
            }
            this.aw.setClipChildren(false);
            this.aw.setClipToPadding(false);
            ViewGroup.LayoutParams layoutParams2 = this.ax.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
                layoutParams3.topMargin = com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f);
                layoutParams3.rightMargin = -com.sankuai.shangou.stone.util.h.a(getContext(), 10.0f);
                this.ax.setLayoutParams(layoutParams3);
            }
            this.as.setClipToPadding(false);
            this.as.setClipChildren(false);
            ViewGroup.LayoutParams layoutParams4 = this.I.getLayoutParams();
            if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                layoutParams5.rightMargin = -com.sankuai.shangou.stone.util.h.a(getContext(), 10.0f);
                this.I.setLayoutParams(layoutParams5);
            }
            ViewGroup.LayoutParams layoutParams6 = this.ay.getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.height = com.sankuai.shangou.stone.util.h.a(getContext(), 31.0f);
                this.ay.setLayoutParams(layoutParams6);
            }
            int a = com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f);
            int a2 = com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f);
            this.ay.setPadding(a, a2, a, a2);
            this.ay.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0f51c955e3c1462ef4fba4b0d712c3f3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0f51c955e3c1462ef4fba4b0d712c3f3");
                    } else {
                        b.this.b(b.this.C());
                    }
                }
            });
            ImageView imageView = this.V;
            Object[] objArr4 = {imageView};
            ChangeQuickRedirect changeQuickRedirect4 = at;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ca6a0716468ad4ef9fd5e35195946af8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ca6a0716468ad4ef9fd5e35195946af8");
            } else {
                int a3 = com.sankuai.shangou.stone.util.h.a(getContext(), 12.0f);
                int a4 = com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f);
                imageView.setPadding(a3, a4, a3, a4);
                ViewGroup.LayoutParams layoutParams7 = imageView.getLayoutParams();
                if (layoutParams7 instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.height = com.sankuai.shangou.stone.util.h.a(getContext(), 31.0f);
                    layoutParams8.width = com.sankuai.shangou.stone.util.h.a(getContext(), 47.0f);
                    layoutParams8.rightMargin = -com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f);
                    imageView.setLayoutParams(layoutParams8);
                }
            }
            ImageView imageView2 = this.F;
            Object[] objArr5 = {imageView2};
            ChangeQuickRedirect changeQuickRedirect5 = at;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "da4ac8e9682e1c76b687e0d2e1099bfd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "da4ac8e9682e1c76b687e0d2e1099bfd");
            } else {
                ViewGroup.LayoutParams layoutParams9 = imageView2.getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.height = com.sankuai.shangou.stone.util.h.a(getContext(), 23.0f);
                    layoutParams9.width = com.sankuai.shangou.stone.util.h.a(getContext(), 23.0f);
                }
                imageView2.setPadding(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams9);
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = at;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "460593c3304cdbee9aaad8f43a3a19a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "460593c3304cdbee9aaad8f43a3a19a5");
            } else {
                ViewGroup.LayoutParams layoutParams10 = this.G.getLayoutParams();
                if (layoutParams10 instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams10;
                    layoutParams11.rightMargin = 0;
                    this.G.setLayoutParams(layoutParams11);
                }
                TextView textView = (TextView) this.G.findViewById(R.id.tv);
                if (textView != null && (layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams()) != null) {
                    layoutParams.bottomMargin = com.sankuai.shangou.stone.util.h.a(getContext(), 0.5f);
                    textView.setLayoutParams(layoutParams);
                }
            }
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = at;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9fbd87e82b20184cd1dedef1e526d39b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9fbd87e82b20184cd1dedef1e526d39b");
            } else {
                ViewGroup.LayoutParams layoutParams12 = this.W.getLayoutParams();
                if (layoutParams12 instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams13 = (LinearLayout.LayoutParams) layoutParams12;
                    layoutParams13.width = com.sankuai.shangou.stone.util.h.a(getContext(), 24.0f);
                    layoutParams13.rightMargin = -com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f);
                    this.W.setLayoutParams(layoutParams13);
                }
            }
            this.I.setPadding(a, 0, a, 0);
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a, com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea42223809be563ff13ac63fc0e3921", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea42223809be563ff13ac63fc0e3921");
                return;
            }
            super.c();
            this.av = (TextView) findViewById(R.id.txt_total_stock_label);
            this.aw = (ViewGroup) findViewById(R.id.detail_content_layout);
            this.ax = (LinearLayout) findViewById(R.id.root_food_count_view);
            this.ay = (FrameLayout) findViewById(R.id.sg_flash_button_container);
            this.az = (ImageView) findViewById(R.id.installment_icon);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layout_warm_up_label_container);
            if (frameLayout != null) {
                this.aA = new u(getContext(), this);
                this.aA.createAndReplaceView(frameLayout);
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a, com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void d() {
            int i;
            int i2;
            String a;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7937d2bd8754aae219e8b53a4787b74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7937d2bd8754aae219e8b53a4787b74");
                return;
            }
            super.d();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = at;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7efd418deee19df082b09da75f1a8eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7efd418deee19df082b09da75f1a8eb");
            } else if (this.ae == null || this.ae.tradeAttrLabel == null || TextUtils.isEmpty(this.ae.tradeAttrLabel.pictureUrl)) {
                this.az.setVisibility(8);
            } else {
                this.ar.b(this.ae, this.az);
                this.az.setVisibility(0);
                com.sankuai.waimai.store.util.m.d(this.ae.tradeAttrLabel.pictureUrl, com.sankuai.shangou.stone.util.h.a(getContext(), 15.0f)).a(this.az);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = at;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a502e0ff7ff9e35b78291fea312739b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a502e0ff7ff9e35b78291fea312739b9");
            } else if (this.aA != null) {
                final u uVar = this.aA;
                final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = this.af;
                final GoodsSpu goodsSpu = this.ae;
                Object[] objArr4 = {aVar, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect4 = u.a;
                if (PatchProxy.isSupport(objArr4, uVar, changeQuickRedirect4, false, "28ce73c9105223dc868dc72efff80343", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, uVar, changeQuickRedirect4, false, "28ce73c9105223dc868dc72efff80343");
                    i = 3;
                    i2 = 1;
                } else if (goodsSpu == null || goodsSpu.mSaleType != 3) {
                    i = 3;
                    i2 = 1;
                    com.sankuai.shangou.stone.util.u.c(uVar.c);
                } else {
                    uVar.g = false;
                    uVar.h = false;
                    com.sankuai.shangou.stone.util.u.a((View) uVar.c, 0);
                    String str = goodsSpu.shippingTimeStr;
                    uVar.f = goodsSpu.subscribe;
                    if (uVar.f <= 0) {
                        uVar.f = 3;
                    }
                    com.sankuai.shangou.stone.util.u.a(uVar.d, str);
                    uVar.a();
                    Object[] objArr5 = {aVar, goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect5 = u.a;
                    i = 3;
                    if (PatchProxy.isSupport(objArr5, uVar, changeQuickRedirect5, false, "61031538a4708453f8b7c6dc5b536e44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, uVar, changeQuickRedirect5, false, "61031538a4708453f8b7c6dc5b536e44");
                    } else if (!uVar.h) {
                        com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.b(uVar.getContext(), "b_waimai_l75d10q9_mv").a("poi_id", aVar.d()).a("spu_id", Long.valueOf(goodsSpu.id));
                        if (uVar.f == 3) {
                            a = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_warm_up_wait_for_subscribe);
                        } else {
                            a = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_warm_up_subscribe);
                        }
                        a2.a("word", a).a();
                        i2 = 1;
                        uVar.h = true;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String a3;
                                Object[] objArr6 = {view};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0da4e9e041cf42e85c3a2c528c420093", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0da4e9e041cf42e85c3a2c528c420093");
                                } else if (uVar.g) {
                                } else {
                                    u uVar2 = uVar;
                                    com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2 = aVar;
                                    GoodsSpu goodsSpu2 = goodsSpu;
                                    Object[] objArr7 = {aVar2, goodsSpu2};
                                    ChangeQuickRedirect changeQuickRedirect7 = u.a;
                                    if (PatchProxy.isSupport(objArr7, uVar2, changeQuickRedirect7, false, "a6a784c4bb4649002db367757db5d57e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, uVar2, changeQuickRedirect7, false, "a6a784c4bb4649002db367757db5d57e");
                                    } else {
                                        com.sankuai.waimai.store.callback.a a4 = com.sankuai.waimai.store.manager.judas.b.a(uVar2.getContext(), "b_waimai_l75d10q9_mc").a("poi_id", aVar2.d()).a("spu_id", Long.valueOf(goodsSpu2.id));
                                        if (uVar2.f == 3) {
                                            a3 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_warm_up_wait_for_subscribe);
                                        } else {
                                            a3 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_warm_up_subscribe);
                                        }
                                        a4.a("word", a3).a();
                                    }
                                    if (System.currentTimeMillis() >= goodsSpu.shippingTime && uVar.b != null) {
                                        uVar.b.performClick();
                                    } else if (uVar.f == 4) {
                                        com.sankuai.waimai.store.manager.judas.b.b(uVar.getContext(), "b_waimai_4wdbvowq_mv").a("poi_id", aVar.d()).a("spu_id", Long.valueOf(goodsSpu.id)).a();
                                        new FlashDialog.a(uVar.getContext()).a("商品开售前10分钟会以APP消息和短信的方式通知您，请及时关注哦~").b("取消订阅", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1.3
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                Object[] objArr8 = {dialogInterface, Integer.valueOf(i3)};
                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2225650b83f8ac51e36d9e28587aeb94", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2225650b83f8ac51e36d9e28587aeb94");
                                                    return;
                                                }
                                                dialogInterface.dismiss();
                                                com.sankuai.waimai.store.manager.judas.b.a(uVar.getContext(), "b_waimai_4wdbvowq_mc").a("poi_id", aVar.d()).a("spu_id", Long.valueOf(goodsSpu.id)).a();
                                                u.a(uVar, aVar, goodsSpu);
                                            }
                                        }).a("知道啦", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1.2
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                Object[] objArr8 = {dialogInterface, Integer.valueOf(i3)};
                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3f6dc8a5976af0310232d74bab8fa353", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3f6dc8a5976af0310232d74bab8fa353");
                                                } else {
                                                    dialogInterface.dismiss();
                                                }
                                            }
                                        }).a(new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1.1
                                            @Override // android.content.DialogInterface.OnShowListener
                                            public final void onShow(DialogInterface dialogInterface) {
                                            }

                                            {
                                                AnonymousClass1.this = this;
                                            }
                                        }).a();
                                    } else {
                                        u.a(uVar, aVar, goodsSpu);
                                    }
                                }
                            }
                        };
                        View[] viewArr = new View[i2];
                        viewArr[0] = uVar.e;
                        com.sankuai.shangou.stone.util.u.a(onClickListener, viewArr);
                    }
                    i2 = 1;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String a3;
                            Object[] objArr6 = {view};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0da4e9e041cf42e85c3a2c528c420093", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0da4e9e041cf42e85c3a2c528c420093");
                            } else if (uVar.g) {
                            } else {
                                u uVar2 = uVar;
                                com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2 = aVar;
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr7 = {aVar2, goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect7 = u.a;
                                if (PatchProxy.isSupport(objArr7, uVar2, changeQuickRedirect7, false, "a6a784c4bb4649002db367757db5d57e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, uVar2, changeQuickRedirect7, false, "a6a784c4bb4649002db367757db5d57e");
                                } else {
                                    com.sankuai.waimai.store.callback.a a4 = com.sankuai.waimai.store.manager.judas.b.a(uVar2.getContext(), "b_waimai_l75d10q9_mc").a("poi_id", aVar2.d()).a("spu_id", Long.valueOf(goodsSpu2.id));
                                    if (uVar2.f == 3) {
                                        a3 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_warm_up_wait_for_subscribe);
                                    } else {
                                        a3 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_warm_up_subscribe);
                                    }
                                    a4.a("word", a3).a();
                                }
                                if (System.currentTimeMillis() >= goodsSpu.shippingTime && uVar.b != null) {
                                    uVar.b.performClick();
                                } else if (uVar.f == 4) {
                                    com.sankuai.waimai.store.manager.judas.b.b(uVar.getContext(), "b_waimai_4wdbvowq_mv").a("poi_id", aVar.d()).a("spu_id", Long.valueOf(goodsSpu.id)).a();
                                    new FlashDialog.a(uVar.getContext()).a("商品开售前10分钟会以APP消息和短信的方式通知您，请及时关注哦~").b("取消订阅", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1.3
                                        public static ChangeQuickRedirect a;

                                        {
                                            AnonymousClass1.this = this;
                                        }

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i3) {
                                            Object[] objArr8 = {dialogInterface, Integer.valueOf(i3)};
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2225650b83f8ac51e36d9e28587aeb94", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2225650b83f8ac51e36d9e28587aeb94");
                                                return;
                                            }
                                            dialogInterface.dismiss();
                                            com.sankuai.waimai.store.manager.judas.b.a(uVar.getContext(), "b_waimai_4wdbvowq_mc").a("poi_id", aVar.d()).a("spu_id", Long.valueOf(goodsSpu.id)).a();
                                            u.a(uVar, aVar, goodsSpu);
                                        }
                                    }).a("知道啦", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1.2
                                        public static ChangeQuickRedirect a;

                                        {
                                            AnonymousClass1.this = this;
                                        }

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i3) {
                                            Object[] objArr8 = {dialogInterface, Integer.valueOf(i3)};
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3f6dc8a5976af0310232d74bab8fa353", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3f6dc8a5976af0310232d74bab8fa353");
                                            } else {
                                                dialogInterface.dismiss();
                                            }
                                        }
                                    }).a(new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.1.1
                                        @Override // android.content.DialogInterface.OnShowListener
                                        public final void onShow(DialogInterface dialogInterface) {
                                        }

                                        {
                                            AnonymousClass1.this = this;
                                        }
                                    }).a();
                                } else {
                                    u.a(uVar, aVar, goodsSpu);
                                }
                            }
                        }
                    };
                    View[] viewArr2 = new View[i2];
                    viewArr2[0] = uVar.e;
                    com.sankuai.shangou.stone.util.u.a(onClickListener2, viewArr2);
                }
                if (this.ae != null && this.ae.mSaleType == i) {
                    View[] viewArr3 = new View[i2];
                    viewArr3[0] = this.r;
                    com.sankuai.shangou.stone.util.u.c(viewArr3);
                    View[] viewArr4 = new View[i2];
                    viewArr4[0] = this.j;
                    com.sankuai.shangou.stone.util.u.c(viewArr4);
                    View[] viewArr5 = new View[i2];
                    viewArr5[0] = this.ay;
                    com.sankuai.shangou.stone.util.u.c(viewArr5);
                } else {
                    View[] viewArr6 = new View[i2];
                    viewArr6[0] = this.ay;
                    com.sankuai.shangou.stone.util.u.a(viewArr6);
                }
                if (this.ae == null || this.ae.priceHidden != i2) {
                    return;
                }
                View[] viewArr7 = new View[5];
                viewArr7[0] = this.E;
                viewArr7[i2] = this.O;
                viewArr7[2] = this.B;
                viewArr7[i] = this.C;
                viewArr7[4] = this.D;
                com.sankuai.shangou.stone.util.u.c(viewArr7);
                View[] viewArr8 = new View[6];
                viewArr8[0] = this.I;
                viewArr8[1] = this.N;
                viewArr8[2] = this.W;
                viewArr8[i] = this.F;
                viewArr8[4] = this.V;
                viewArr8[5] = this.G;
                com.sankuai.shangou.stone.util.u.c(viewArr8);
                com.sankuai.shangou.stone.util.u.c(this.J);
                com.sankuai.shangou.stone.util.u.c(this.L);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView
        public final void m() {
            boolean z;
            boolean z2;
            e.b aVar;
            boolean z3 = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7bf98b576976774d4195b1bf9c7635", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7bf98b576976774d4195b1bf9c7635");
            } else if (this.af != null && this.ae != null) {
                super.m();
                if (this.ae.presaleInfo == null && com.sankuai.shangou.stone.util.a.b(this.ae.propertyLabels)) {
                    return;
                }
                if (this.au == null) {
                    this.au = new e(getContext());
                    this.au.createView(this.f);
                }
                e eVar = this.au;
                com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2 = this.af;
                GoodsSpu goodsSpu = this.ae;
                Object[] objArr2 = {aVar2, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "e8f813823385f764185de458a45addd8", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "e8f813823385f764185de458a45addd8")).booleanValue();
                } else {
                    if (goodsSpu.presaleInfo != null) {
                        GoodsSpu.PresaleInfo presaleInfo = goodsSpu.presaleInfo;
                        Object[] objArr3 = {presaleInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = e.a;
                        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "6ceb66196638f378f5d560df8bb1b3fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "6ceb66196638f378f5d560df8bb1b3fb");
                        } else {
                            com.sankuai.shangou.stone.util.u.a(eVar.c);
                            com.sankuai.shangou.stone.util.u.a(eVar.d, presaleInfo.header);
                            com.sankuai.shangou.stone.util.u.a(eVar.e, presaleInfo.content);
                            float a = com.sankuai.shangou.stone.util.h.a(eVar.getContext(), 4.0f);
                            eVar.d.setBackground(new e.a().a(a, 0.0f, 0.0f, a).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(eVar.getContext(), R.color.wm_sg_color_E5F9F7), ContextCompat.getColor(eVar.getContext(), R.color.wm_sg_color_CDF2EF)}).a());
                            eVar.e.setBackground(new e.a().a(0.0f, a, a, 0.0f).c(ContextCompat.getColor(eVar.getContext(), R.color.wm_sg_color_EBF9F8)).a());
                        }
                        z = true;
                    } else {
                        com.sankuai.shangou.stone.util.u.c(eVar.c);
                        z = false;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "863ffc95edab3d5d765bea54ccc3e3bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "863ffc95edab3d5d765bea54ccc3e3bc");
                    } else if (eVar.b.getChildCount() > 0) {
                        eVar.b.removeAllViews();
                    }
                    List<GoodsSpu.GoodPropertyLabel> list = goodsSpu.propertyLabels;
                    if (com.sankuai.shangou.stone.util.a.b(list)) {
                        z2 = z;
                    } else {
                        for (GoodsSpu.GoodPropertyLabel goodPropertyLabel : list) {
                            Object[] objArr5 = new Object[1];
                            objArr5[z3 ? 1 : 0] = goodPropertyLabel;
                            ChangeQuickRedirect changeQuickRedirect5 = e.a;
                            if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "83f802bf5c71b4071abeef3a109301eb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, z3, "83f802bf5c71b4071abeef3a109301eb");
                            } else {
                                if (goodPropertyLabel != null) {
                                    SCSingleLineFlowLayout sCSingleLineFlowLayout = eVar.b;
                                    int i = goodPropertyLabel.type;
                                    Object[] objArr6 = new Object[2];
                                    objArr6[z3 ? 1 : 0] = sCSingleLineFlowLayout;
                                    objArr6[1] = Integer.valueOf(i);
                                    ChangeQuickRedirect changeQuickRedirect6 = e.a;
                                    if (!PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "55756b95ee0f0440ee1e34c6d0bcff5c", RobustBitConfig.DEFAULT_VALUE)) {
                                        switch (i) {
                                            case 101:
                                                aVar = new e.a(sCSingleLineFlowLayout);
                                                break;
                                            case 102:
                                                aVar = new e.d(sCSingleLineFlowLayout);
                                                break;
                                            case 103:
                                            case 104:
                                                aVar = new e.c(sCSingleLineFlowLayout);
                                                break;
                                            case 105:
                                            default:
                                                aVar = new e.f(sCSingleLineFlowLayout);
                                                break;
                                            case 106:
                                                aVar = new e.C1186e(sCSingleLineFlowLayout);
                                                break;
                                        }
                                    } else {
                                        aVar = (e.b) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "55756b95ee0f0440ee1e34c6d0bcff5c");
                                    }
                                    aVar.b(goodPropertyLabel);
                                }
                                z3 = false;
                            }
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    com.sankuai.shangou.stone.util.u.c(this.g);
                    com.sankuai.shangou.stone.util.u.a(this.f);
                }
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void B() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8008235d139b3c7fdb0cf5f1a40476", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8008235d139b3c7fdb0cf5f1a40476");
                return;
            }
            super.B();
            com.sankuai.shangou.stone.util.u.c(this.V);
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView
        public final int getDishPicQuality() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb48b17c2f4c495e1a61529d09e460a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb48b17c2f4c495e1a61529d09e460a")).intValue();
            }
            return com.sankuai.waimai.store.config.i.h().a("menupage/picture_high_quality", false) ? ImageQualityUtil.a() : super.getDishPicQuality();
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView
        public final void l() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9db0dc6456cb7301ecfa7f53bb4f96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9db0dc6456cb7301ecfa7f53bb4f96");
                return;
            }
            super.l();
            this.e.setBackground(null);
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView
        public final void k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = at;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f91752f9fe7fee1f748c2d20ab33090", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f91752f9fe7fee1f748c2d20ab33090");
                return;
            }
            com.sankuai.shangou.stone.util.u.c(this.av);
            if (this.ae.totalStockLabel == null) {
                super.k();
                return;
            }
            com.sankuai.shangou.stone.util.u.c(this.c);
            if (com.sankuai.shangou.stone.util.t.a(this.ae.totalStockLabel)) {
                return;
            }
            com.sankuai.shangou.stone.util.u.a(this.av, this.ae.totalStockLabel);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends InnerCellView {
        public static ChangeQuickRedirect a;
        private View aA;
        private View aB;
        private TextView aC;
        private UniversalImageView aD;
        private SCSingleLineFlowLayout aE;
        private com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.helper.a aF;
        private TagCanvasView aG;
        private SCPriceView aH;
        protected j ar;
        protected ViewGroup as;
        private View at;
        private TextView au;
        private TextView av;
        private View aw;
        private TextView ax;
        private RecommendPairBlock ay;
        private SearchRecommendPairBlock az;

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public int getLayoutId() {
            return R.layout.wm_st_poi_market_adapter_goods_bak_two_line;
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public String getMinOrderCountText() {
            return "份起购";
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final boolean y() {
            return true;
        }

        public a(@NonNull j jVar) {
            super(jVar.getContext());
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94b7b60a5e4a3ddcd7810215542864a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94b7b60a5e4a3ddcd7810215542864a2");
                return;
            }
            this.ar = jVar;
            CellUiConfig a2 = CellUiConfig.a();
            a2.d = 2;
            setCellConfig(a2);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void u() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9abce0d00bd09b32b84c6c8b8490ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9abce0d00bd09b32b84c6c8b8490ea");
                return;
            }
            super.u();
            com.sankuai.shangou.stone.util.u.c(this.aA, this.aG);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void v() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "648470d722ce445b72d3f16f6a0c70e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "648470d722ce445b72d3f16f6a0c70e9");
                return;
            }
            super.v();
            com.sankuai.shangou.stone.util.u.c(this.aA, this.aG);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void F() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfef1f66ad1076602ae11c8f339245c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfef1f66ad1076602ae11c8f339245c4");
                return;
            }
            super.F();
            com.sankuai.shangou.stone.util.u.c(this.aA);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void E() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6939fe47d996ba9bcbda0b1403b1133d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6939fe47d996ba9bcbda0b1403b1133d");
            } else if (com.sankuai.shangou.stone.util.p.a(this.aG, this.ae) || this.ae.dynamicActLabels == null) {
                com.sankuai.shangou.stone.util.u.a(this.aA);
                super.E();
                com.sankuai.shangou.stone.util.u.c(this.aG);
            } else {
                com.sankuai.shangou.stone.util.u.c(this.aA);
                com.sankuai.shangou.stone.util.u.a(this.aG);
                com.sankuai.waimai.platform.widget.tag.virtualtag.g gVar = (com.sankuai.waimai.platform.widget.tag.virtualtag.g) this.aG.getAdapter();
                if (gVar == null) {
                    gVar = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(getContext(), null);
                    gVar.b();
                    gVar.h = new CanvasView.a.InterfaceC1104a() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a.InterfaceC1104a
                        public final boolean a(com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map) {
                            Object[] objArr2 = {cVar, map};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0538b8fc0963ebadcbded6e102940533", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0538b8fc0963ebadcbded6e102940533")).booleanValue();
                            }
                            if (cVar == null) {
                                return false;
                            }
                            return cVar.a == 1 || cVar.a == 2;
                        }

                        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.a.InterfaceC1104a
                        public final void b(@Nullable com.sankuai.waimai.platform.widget.tag.api.c cVar, Map<String, String> map) {
                            Object[] objArr2 = {cVar, map};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc4c804869f30b84a4cb33d7deed98f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc4c804869f30b84a4cb33d7deed98f0");
                            } else if (cVar == null) {
                            } else {
                                if (map != null) {
                                    a.this.ar.a(a.this.ae, map);
                                }
                                if (cVar.a == 1) {
                                    com.sankuai.waimai.store.platform.domain.core.view.a aVar = (com.sankuai.waimai.store.platform.domain.core.view.a) com.sankuai.waimai.store.util.i.a(cVar.b, com.sankuai.waimai.store.platform.domain.core.view.a.class);
                                    if (aVar == null) {
                                        return;
                                    }
                                    if ("0".equals(aVar.f)) {
                                        final Dialog a2 = com.sankuai.waimai.store.util.d.a(a.this.getContext());
                                        com.sankuai.waimai.store.base.net.sg.a.c().a(a.this.af.f(), a.this.af.h(), aVar.a, aVar.b, aVar.d, aVar.c, aVar.e, "inner_sd", "inner_sd_07", new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a.1.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                            public final /* synthetic */ void a(Object obj) {
                                                Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                                                Object[] objArr3 = {poiCouponItem};
                                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85e5143ac8e8e6d909e8c2eb41cba1ba", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85e5143ac8e8e6d909e8c2eb41cba1ba");
                                                    return;
                                                }
                                                com.sankuai.waimai.store.util.d.a(a2);
                                                com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
                                            }

                                            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                                Object[] objArr3 = {bVar};
                                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d9eacf5e18d55aa5a4f3d32735a5fce", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d9eacf5e18d55aa5a4f3d32735a5fce");
                                                    return;
                                                }
                                                super.a(bVar);
                                                com.sankuai.waimai.store.util.d.a(a2);
                                                String message = bVar.getMessage();
                                                if (TextUtils.isEmpty(message)) {
                                                    message = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_net_error_info);
                                                }
                                                am.a(a.this.at, message);
                                            }
                                        });
                                    }
                                }
                                if (cVar.a == 2) {
                                    if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                                        if (TextUtils.isEmpty(a.this.ae.promotion.schemeUrl)) {
                                            return;
                                        }
                                        com.sankuai.waimai.store.router.d.a(a.this.ar.getContext(), a.this.ae.promotion.schemeUrl);
                                        return;
                                    }
                                    com.sankuai.waimai.store.manager.user.a.a(a.this.ar.getContext(), new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a.1.2
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2c003aa23715eb8e77d52710c8cd8f7", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2c003aa23715eb8e77d52710c8cd8f7");
                                            } else {
                                                com.sankuai.waimai.store.manager.poi.a.a().a(a.this.ar.p().d());
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    };
                    gVar.f = new com.sankuai.waimai.platform.widget.tag.virtualtag.c<Map<String, String>>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.c
                        public final void a(Set<Map<String, String>> set) {
                            int i = 0;
                            Object[] objArr2 = {set};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef5d96ce56ecb3b6ab092e1c30e823ef", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef5d96ce56ecb3b6ab092e1c30e823ef");
                                return;
                            }
                            for (Map<String, String> map : set) {
                                if (map == null) {
                                    map = new HashMap<>();
                                }
                                map.put("index", String.valueOf(i));
                                a.this.ar.a(a.this.aG, a.this.ae, map);
                                i++;
                            }
                        }
                    };
                    this.aG.setAdapter(gVar);
                }
                gVar.b(com.sankuai.waimai.platform.widget.tag.util.a.a(getContext(), this.ae.dynamicActLabels));
                gVar.notifyChanged();
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView
        public final void h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33689f4e3889324badd2f9447a8b7abf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33689f4e3889324badd2f9447a8b7abf");
            } else {
                com.sankuai.shangou.stone.util.u.c(this.aA, this.aG);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a3fb167249cbc07c0f266e33d74a45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a3fb167249cbc07c0f266e33d74a45");
                return;
            }
            super.c();
            this.at = findViewById(R.id.ll_stickyfoodList_adapter_food_food);
            this.as = (ViewGroup) findViewById(R.id.top_container);
            this.au = (TextView) findViewById(R.id.tv_praise_rate);
            this.av = (TextView) findViewById(R.id.tv_stickyfood_sold_count);
            this.aw = findViewById(R.id.new_customer_promotion);
            this.ax = (TextView) findViewById(R.id.txt_promotion_drawable);
            this.aA = findViewById(R.id.ll_promotion_info);
            this.aB = findViewById(R.id.ll_promotion_coupon);
            this.aC = (TextView) findViewById(R.id.txt_promotion_coupon);
            this.aD = (UniversalImageView) findViewById(R.id.im_promotion_coupon_arrow);
            this.aG = (TagCanvasView) findViewById(R.id.tag_top_of_price);
            this.aH = (SCPriceView) findViewById(R.id.id_sc_price_view);
            this.aA.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a(), 4.0f)).a(com.sankuai.waimai.store.util.b.b(com.sankuai.waimai.store.util.b.a(), R.color.wm_sg_color_FDC9C6)).b(2).a());
            this.aD.setImageDrawable(com.sankuai.waimai.store.view.a.a(com.sankuai.waimai.store.util.b.a(), (int) R.dimen.wm_sc_common_dimen_4, (int) R.dimen.wm_sc_common_dimen_6, (int) R.color.wm_sg_color_FB4E44, a.EnumC1338a.RIGHT));
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public void d() {
            boolean z;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75fdd41b61d5b1f7c38d3a83afbc619e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75fdd41b61d5b1f7c38d3a83afbc619e");
                return;
            }
            com.sankuai.shangou.stone.util.u.c(this.aw);
            super.d();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d37d0287e5ec7f4d0b23bb35b547f6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d37d0287e5ec7f4d0b23bb35b547f6c");
            } else if (this.ae != null) {
                if (com.sankuai.shangou.stone.util.t.a(this.ae.praiseRate)) {
                    this.au.setVisibility(8);
                } else {
                    this.au.setVisibility(0);
                    this.au.setText(this.ae.praiseRate);
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80b6364c5fcc78783ce10e2a120c3417", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80b6364c5fcc78783ce10e2a120c3417");
            } else if (this.ae != null && com.sankuai.shangou.stone.util.t.a(this.ae.praiseRate) && com.sankuai.shangou.stone.util.t.a(this.ae.getMonthSaledContent())) {
                this.av.setVisibility(8);
            }
            GoodsPoiCategory goodsPoiCategory = (GoodsPoiCategory) this.l;
            Object[] objArr4 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "209cdc650d7657360e4425da74fd0776", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "209cdc650d7657360e4425da74fd0776")).booleanValue();
            } else {
                z = goodsPoiCategory != null && goodsPoiCategory.getParentCategory().type == 10;
            }
            if (z && this.ar.b(this.ae)) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "faae62ea3e52d21fef0bbaa9b662173d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "faae62ea3e52d21fef0bbaa9b662173d");
                } else {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5077eee855ee2f064353ad31adb86a39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5077eee855ee2f064353ad31adb86a39");
                    } else if (this.az == null) {
                        this.az = new SearchRecommendPairBlock(this.at.getContext(), this.ar);
                        this.az.bindView(((ViewStub) findViewById(R.id.search_recommend_pair_container)).inflate());
                    }
                    if (this.az != null) {
                        SearchRecommendPairBlock searchRecommendPairBlock = this.az;
                        GoodsSpu goodsSpu = this.ae;
                        GoodsPoiCategory goodsPoiCategory2 = (GoodsPoiCategory) this.l;
                        Object[] objArr7 = {goodsSpu, goodsPoiCategory2};
                        ChangeQuickRedirect changeQuickRedirect7 = SearchRecommendPairBlock.a;
                        if (PatchProxy.isSupport(objArr7, searchRecommendPairBlock, changeQuickRedirect7, false, "61279dd837d26e0334efb6b47de3e41a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, searchRecommendPairBlock, changeQuickRedirect7, false, "61279dd837d26e0334efb6b47de3e41a");
                        } else if (goodsSpu != null && goodsPoiCategory2 != null) {
                            SearchRecommendCollocateCard searchRecommendCollocateCard = goodsPoiCategory2.searchRecommendCollocateCard;
                            if (searchRecommendCollocateCard == null) {
                                com.sankuai.shangou.stone.util.u.c(searchRecommendPairBlock.getView());
                            } else {
                                com.sankuai.shangou.stone.util.u.a(searchRecommendPairBlock.b, searchRecommendCollocateCard.title);
                                com.sankuai.shangou.stone.util.u.c(searchRecommendPairBlock.c, searchRecommendPairBlock.d, searchRecommendPairBlock.e);
                                SearchRecommendPairBlock.a aVar = searchRecommendPairBlock.f;
                                Object[] objArr8 = {goodsSpu, searchRecommendCollocateCard};
                                ChangeQuickRedirect changeQuickRedirect8 = SearchRecommendPairBlock.a.a;
                                if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "fca876a288dd577d5c6bd50ee7bb5813", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "fca876a288dd577d5c6bd50ee7bb5813");
                                } else {
                                    aVar.b.clear();
                                    aVar.b.put("poi_id", aVar.f().p().d());
                                    aVar.b.put("spu_id", Long.valueOf(goodsSpu.getId()));
                                    if (w.e(aVar.f().p().b)) {
                                        aVar.b.put("page_type", 0);
                                    }
                                    if (w.c(aVar.f().p().b)) {
                                        aVar.b.put("page_type", 2);
                                    }
                                    aVar.b_(searchRecommendCollocateCard.spus);
                                }
                                com.sankuai.shangou.stone.util.u.a(searchRecommendPairBlock.getView());
                            }
                        }
                    }
                    if (this.ay != null) {
                        this.ay.setVisible(false);
                    }
                }
            } else {
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "2f848b3fc517897a9eee0c899b85aed2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "2f848b3fc517897a9eee0c899b85aed2");
                } else {
                    if (this.af.c) {
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "60c07dbacebe96517deafe449bfc798c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "60c07dbacebe96517deafe449bfc798c");
                        } else if (this.ay == null) {
                            this.ay = new RecommendPairBlock(this.at.getContext(), this.ar);
                            this.ay.bindView(((ViewStub) findViewById(R.id.recommend_pair_container)).inflate());
                        }
                        if (this.ay != null) {
                            final RecommendPairBlock recommendPairBlock = this.ay;
                            GoodsSpu goodsSpu2 = this.ae;
                            Object[] objArr11 = {goodsSpu2};
                            ChangeQuickRedirect changeQuickRedirect11 = RecommendPairBlock.a;
                            if (PatchProxy.isSupport(objArr11, recommendPairBlock, changeQuickRedirect11, false, "5aae2c26a69f72c4235f9b651dfad6f9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, recommendPairBlock, changeQuickRedirect11, false, "5aae2c26a69f72c4235f9b651dfad6f9");
                            } else if (goodsSpu2 != null) {
                                recommendPairBlock.s = goodsSpu2;
                                final RecommendPair recommendPair = goodsSpu2.recommendPair;
                                if (recommendPair == null || (TextUtils.isEmpty(recommendPair.sceneId) && recommendPair.moduleType != RecommendPairBlock.d)) {
                                    com.sankuai.shangou.stone.util.u.c(recommendPairBlock.getView());
                                } else {
                                    final HashMap hashMap = new HashMap();
                                    GoodsPoiCategory m = recommendPairBlock.i.m();
                                    GoodsPoiCategory l = recommendPairBlock.i.l();
                                    int n = recommendPairBlock.i.n();
                                    int o = recommendPairBlock.i.o();
                                    hashMap.put("poi_id", recommendPairBlock.i.p().d());
                                    hashMap.put("product_id", Long.valueOf(goodsSpu2.getId()));
                                    hashMap.put("scene_id", recommendPair.sceneId);
                                    hashMap.put("sub_title", recommendPair.subTitle);
                                    hashMap.put("category_index", Integer.valueOf(n));
                                    hashMap.put("category_name", m == null ? "" : m.getTagName());
                                    hashMap.put("category_sec_id", l == m ? "" : l.getTagCode());
                                    hashMap.put("category_sec_index", Integer.valueOf(o));
                                    hashMap.put("category_sec_name", l == m ? "" : l.getTagName());
                                    com.sankuai.shangou.stone.util.u.a(recommendPairBlock.m, recommendPair.mainTitle);
                                    com.sankuai.shangou.stone.util.u.a(recommendPairBlock.n, recommendPair.subTitle);
                                    com.sankuai.shangou.stone.util.u.a(recommendPairBlock.o, recommendPair.schemeText);
                                    if (recommendPair.moduleType == RecommendPairBlock.d) {
                                        hashMap.put("spu_id", Long.valueOf(goodsSpu2.getId()));
                                        recommendPairBlock.w.b(hashMap);
                                        recommendPairBlock.x.b(hashMap);
                                    } else {
                                        recommendPairBlock.u.b(hashMap);
                                        recommendPairBlock.v.b(hashMap);
                                        recommendPairBlock.t.b(hashMap);
                                    }
                                    recommendPairBlock.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.3
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Object[] objArr12 = {view};
                                            ChangeQuickRedirect changeQuickRedirect12 = a;
                                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "7149a4837f4f51a24ea4125c4352fbeb", 4611686018427387906L)) {
                                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "7149a4837f4f51a24ea4125c4352fbeb");
                                                return;
                                            }
                                            com.sankuai.waimai.store.router.d.a(RecommendPairBlock.this.getContext(), recommendPair.scheme);
                                            if (recommendPair.moduleType == RecommendPairBlock.d) {
                                                com.sankuai.waimai.store.manager.judas.b.a(RecommendPairBlock.this.getContext(), "b_waimai_x08fxwol_mc").b(hashMap).a();
                                            } else {
                                                com.sankuai.waimai.store.manager.judas.b.a(RecommendPairBlock.this.getContext(), "b_waimai_7h8upa4l_mc").b(hashMap).a();
                                            }
                                        }
                                    });
                                    if (TextUtils.isEmpty(recommendPair.mainTitle) || TextUtils.isEmpty(recommendPair.subTitle)) {
                                        com.sankuai.shangou.stone.util.u.c(recommendPairBlock.p);
                                    } else {
                                        com.sankuai.shangou.stone.util.u.a(recommendPairBlock.p);
                                    }
                                    Drawable drawable = ContextCompat.getDrawable(recommendPairBlock.getContext(), R.drawable.wm_sc_goods_list_recommend_pair_bg);
                                    if (recommendPair.moduleType == RecommendPairBlock.d) {
                                        drawable = ContextCompat.getDrawable(recommendPairBlock.getContext(), R.drawable.wm_sc_goods_list_recommend_pair_pink_bg);
                                        com.sankuai.shangou.stone.util.u.c(recommendPairBlock.k);
                                        com.sankuai.shangou.stone.util.u.a(recommendPairBlock.l);
                                        if (recommendPairBlock.m != null) {
                                            recommendPairBlock.m.setTextSize(14.0f);
                                        }
                                        if (recommendPairBlock.n != null) {
                                            recommendPairBlock.n.setTextSize(10.0f);
                                        }
                                        if (recommendPairBlock.o != null) {
                                            recommendPairBlock.o.setTextColor(com.sankuai.waimai.store.util.b.b(recommendPairBlock.getContext(), R.color.wm_st_common_222426));
                                        }
                                    } else {
                                        com.sankuai.shangou.stone.util.u.a(recommendPairBlock.k);
                                        com.sankuai.shangou.stone.util.u.c(recommendPairBlock.l);
                                        if (recommendPairBlock.m != null) {
                                            recommendPairBlock.m.setTextSize(17.0f);
                                        }
                                        if (recommendPairBlock.n != null) {
                                            recommendPairBlock.n.setTextSize(15.0f);
                                        }
                                        if (recommendPairBlock.o != null) {
                                            recommendPairBlock.o.setTextColor(com.sankuai.waimai.store.util.b.b(recommendPairBlock.getContext(), R.color.wm_sg_color_858687));
                                        }
                                    }
                                    if (recommendPairBlock.j != null) {
                                        recommendPairBlock.j.setBackground(drawable);
                                    }
                                    recommendPairBlock.r.a(goodsSpu2, recommendPair);
                                    if (!recommendPair.isRecommendPairAnimated) {
                                        recommendPairBlock.q.scrollToPosition(0);
                                        Object[] objArr12 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect12 = RecommendPairBlock.a;
                                        if (PatchProxy.isSupport(objArr12, recommendPairBlock, changeQuickRedirect12, false, "40bb1576fa4088590c2bc672a5ceb6dc", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, recommendPairBlock, changeQuickRedirect12, false, "40bb1576fa4088590c2bc672a5ceb6dc");
                                        } else {
                                            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(recommendPairBlock.getView(), PropertyValuesHolder.ofFloat(View.ALPHA, 0.0f, 1.0f));
                                            ofPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.RecommendPairBlock.4
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
                                                    Object[] objArr13 = {animator};
                                                    ChangeQuickRedirect changeQuickRedirect13 = a;
                                                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "f65434c2588f9bf97d1458fc4efe5fbc", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "f65434c2588f9bf97d1458fc4efe5fbc");
                                                    } else {
                                                        com.sankuai.shangou.stone.util.u.a(RecommendPairBlock.this.getView());
                                                    }
                                                }
                                            });
                                            ofPropertyValuesHolder.setDuration(800L).setStartDelay(300L);
                                            ofPropertyValuesHolder.start();
                                        }
                                        recommendPair.isRecommendPairAnimated = true;
                                    } else {
                                        com.sankuai.shangou.stone.util.u.a(recommendPairBlock.getView());
                                        Object[] objArr13 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect13 = RecommendPairBlock.a;
                                        if (PatchProxy.isSupport(objArr13, recommendPairBlock, changeQuickRedirect13, false, "93768994d1bc1bcd03a8fe1e9eda5f39", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr13, recommendPairBlock, changeQuickRedirect13, false, "93768994d1bc1bcd03a8fe1e9eda5f39");
                                        } else {
                                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recommendPairBlock.q.getLayoutManager();
                                            if (recommendPairBlock.s != null && recommendPairBlock.s.recommendPair != null && linearLayoutManager != null) {
                                                linearLayoutManager.scrollToPositionWithOffset(recommendPairBlock.s.recommendPair.scrollPosition, recommendPairBlock.s.recommendPair.scrollOffset);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.az != null) {
                        this.az.setVisible(false);
                    }
                }
            }
            Object[] objArr14 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "2cfa20e2282892990dfde85d123416b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "2cfa20e2282892990dfde85d123416b4");
            } else if (this.ae.promotion != null && this.ae.dynamicActLabels == null) {
                final GoodsSpu goodsSpu3 = this.ae;
                int i = this.ae.promotion.receiveStatus;
                Object[] objArr15 = {goodsSpu3, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect15 = a;
                if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "881d623dded477a4bb9e3cab5434e8c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "881d623dded477a4bb9e3cab5434e8c3");
                } else if (this.aB != null && goodsSpu3 != null) {
                    switch (i) {
                        case -1:
                            com.sankuai.shangou.stone.util.u.c(this.aB);
                            com.sankuai.shangou.stone.util.u.c(this.aC);
                            com.sankuai.shangou.stone.util.u.c(this.aD);
                            this.aB.setBackground(null);
                            break;
                        case 0:
                            com.sankuai.shangou.stone.util.u.a(this.aB);
                            com.sankuai.shangou.stone.util.u.a(this.aC);
                            com.sankuai.shangou.stone.util.u.c(this.aD);
                            this.aB.setBackgroundColor(getResources().getColor(R.color.wm_sg_color_FFEAE9));
                            com.sankuai.shangou.stone.util.u.a(this.aC, (int) R.string.wm_sc_shop_accept_coupon);
                            break;
                        case 1:
                        case 3:
                            com.sankuai.shangou.stone.util.u.a(this.aB);
                            com.sankuai.shangou.stone.util.u.a(this.aC);
                            com.sankuai.shangou.stone.util.u.a(this.aD);
                            this.aB.setBackgroundColor(getResources().getColor(R.color.wm_sg_color_FFEAE9));
                            com.sankuai.shangou.stone.util.u.a(this.aC, !com.sankuai.shangou.stone.util.t.a(this.ae.promotion.buttonText) ? this.ae.promotion.buttonText : getResources().getString(R.string.wm_sg_coupon_use));
                            break;
                        case 2:
                            com.sankuai.shangou.stone.util.u.a(this.aB);
                            com.sankuai.shangou.stone.util.u.c(this.aC);
                            com.sankuai.shangou.stone.util.u.a(this.aD);
                            this.aB.setBackground(null);
                            break;
                    }
                    this.aA.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr16 = {view};
                            ChangeQuickRedirect changeQuickRedirect16 = a;
                            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "2edb68b308dd8737abfa6fa5d9da77d7", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "2edb68b308dd8737abfa6fa5d9da77d7");
                                return;
                            }
                            a.this.ar.f(goodsSpu3);
                            a.this.ar.e(goodsSpu3);
                        }
                    });
                }
                if (!TextUtils.isEmpty(this.ae.promotionInfo) && this.ae.promotion != null && !TextUtils.isEmpty(this.ae.promotion.promotionTxt)) {
                    this.ar.b(this.aA, this.ae);
                }
            }
            Object[] objArr16 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect16 = a;
            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "0acd5a401f39b129195b6ce8ec7d2126", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "0acd5a401f39b129195b6ce8ec7d2126");
            } else {
                if (!(this.q != null && this.q.getVisibility() == 0)) {
                    this.aE = (SCSingleLineFlowLayout) findViewById(R.id.tv_spu_attr_label);
                    if (this.aF == null) {
                        this.aF = new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.helper.a();
                    }
                    com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.helper.a aVar2 = this.aF;
                    Context context = getContext();
                    GoodsSpu goodsSpu4 = this.ae;
                    SCSingleLineFlowLayout sCSingleLineFlowLayout = this.aE;
                    Object[] objArr17 = {context, goodsSpu4, sCSingleLineFlowLayout};
                    ChangeQuickRedirect changeQuickRedirect17 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.helper.a.a;
                    if (PatchProxy.isSupport(objArr17, aVar2, changeQuickRedirect17, false, "95662642becd6636c5a8cabb8995d98a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr17, aVar2, changeQuickRedirect17, false, "95662642becd6636c5a8cabb8995d98a");
                    } else if (!com.sankuai.waimai.store.util.b.a(context) && sCSingleLineFlowLayout != null && goodsSpu4 != null) {
                        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu4.productTopLabels) || !com.sankuai.shangou.stone.util.t.a(goodsSpu4.recommendReason)) {
                            sCSingleLineFlowLayout.setVisibility(8);
                        } else if (goodsSpu4.productAttrLabel != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu4.productAttrLabel.attrLabelList)) {
                            sCSingleLineFlowLayout.setVisibility(0);
                            aVar2.a(context, goodsSpu4, sCSingleLineFlowLayout);
                        } else {
                            sCSingleLineFlowLayout.setVisibility(8);
                        }
                    }
                }
            }
            Object[] objArr18 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect18 = a;
            if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "db9762da8a6519b94edaa9d049c651ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "db9762da8a6519b94edaa9d049c651ed");
            } else if (this.h != null) {
                if (!z()) {
                    if (this.ae == null || com.sankuai.shangou.stone.util.a.b(this.ae.getSkus())) {
                        this.h.setVisibility(8);
                    } else if (this.ae.hasManySpec()) {
                        if (I()) {
                            com.sankuai.shangou.stone.util.u.a(this.h);
                            this.h.setText(R.string.wm_sc_common_multi_goods_price_format);
                            this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_BCBCBD));
                        } else if (TextUtils.isEmpty(this.ae.getUnit())) {
                            com.sankuai.shangou.stone.util.u.c(this.h);
                        } else {
                            com.sankuai.shangou.stone.util.u.a(this.h);
                            this.h.setText(this.h.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                            this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_999999));
                        }
                    } else if (!TextUtils.isEmpty(this.ae.getUnit())) {
                        com.sankuai.shangou.stone.util.u.a(this.h);
                        this.h.setText(this.h.getContext().getString(R.string.wm_sc_common_unit_format, this.ae.getUnit()));
                        this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_999999));
                    }
                }
                com.sankuai.shangou.stone.util.u.c(this.h);
            }
            if (this.ae.priceHidden == 1 || this.ae.unifyPrice == null) {
                this.aH.setVisibility(8);
                return;
            }
            com.sankuai.shangou.stone.util.u.c(this.O, this.D, this.B, this.C, this.P, this.Q, this.h);
            Object[] objArr19 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect19 = a;
            if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "2bfe383dfd9f83f85a8b04c7bfe6dade", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "2bfe383dfd9f83f85a8b04c7bfe6dade");
                return;
            }
            this.aH.setVisibility(0);
            this.aH.a(1, this.ae.unifyPrice, 36, this.ae.getStatus() > 0);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void G() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73e1c218bbc8269cea77628a712ac6e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73e1c218bbc8269cea77628a712ac6e2");
            } else if (this.ae.unifyPrice != null) {
            } else {
                if (this.af == null || this.ae == null || this.af.t()) {
                    com.sankuai.shangou.stone.util.u.c(this.Q);
                    return;
                }
                HandPriceInfo b = com.sankuai.waimai.store.util.k.b(this.af.b, this.ae);
                if (b == null || com.sankuai.shangou.stone.util.t.a(b.getHandActivityPriceText())) {
                    com.sankuai.shangou.stone.util.u.c(this.Q);
                } else if (this.Q != null) {
                    com.sankuai.shangou.stone.util.u.c(this.P);
                    com.sankuai.shangou.stone.util.u.a(this.Q);
                    this.Q.a(b, 0);
                }
            }
        }

        private boolean I() {
            GoodsSku goodsSku;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1253bdb8d3e8b744979141107ae8d5bc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1253bdb8d3e8b744979141107ae8d5bc")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b684535fc832d6e6c9c1d8ab3c907d3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b684535fc832d6e6c9c1d8ab3c907d3d");
                return;
            }
            super.x();
            com.sankuai.waimai.store.platform.domain.manager.poi.a p = this.ar.p();
            if (com.sankuai.shangou.stone.util.p.a(this.ae, this.ae.handPriceInfo, p, this.A) || !this.ae.handPriceInfo.isShowNewStyle() || com.sankuai.waimai.store.order.a.e().i(p.d())) {
                return;
            }
            this.ar.a(this.A.getHandPriceLabelView(), this.ae);
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24bbf161d26e685e926f0ad175cb4edf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24bbf161d26e685e926f0ad175cb4edf");
                return;
            }
            super.a(z);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff7a24af0b223a79c6aa0342f7b65c38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff7a24af0b223a79c6aa0342f7b65c38");
            } else if (com.sankuai.shangou.stone.util.p.a(this.af) || !this.af.t() || !z() || com.sankuai.shangou.stone.util.p.a(this.A)) {
            } else {
                ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int dimensionPixelSize = (com.sankuai.shangou.stone.util.p.a(this.V) || this.V.getVisibility() != 0) ? getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_50) : getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_80);
                    if (marginLayoutParams.rightMargin != dimensionPixelSize) {
                        marginLayoutParams.rightMargin = dimensionPixelSize;
                        this.A.requestLayout();
                    }
                }
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public void setNormalPromotionInfo(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cfb1e484c9765a2fc21a407575f3b08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cfb1e484c9765a2fc21a407575f3b08");
            } else if (this.ae == null || this.ae.promotion == null) {
                com.sankuai.shangou.stone.util.u.c(this.aA);
            } else if (TextUtils.isEmpty(this.ae.promotion.promotionTxt)) {
                com.sankuai.shangou.stone.util.u.c(this.aA);
            } else {
                this.w.setText(this.ae.promotion.promotionTxt);
                com.sankuai.shangou.stone.util.u.a(this.aA);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void w() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3651e3051813967bd01a6bdd8699a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3651e3051813967bd01a6bdd8699a2");
            } else if (com.sankuai.shangou.stone.util.p.a(this.ae, this.R) || this.ae.mTopNumberAndPrivacyTag == null) {
                com.sankuai.shangou.stone.util.u.c(this.R);
            } else {
                com.sankuai.shangou.stone.util.u.a(this.R);
                com.sankuai.waimai.store.cell.a.a(getContext(), this.R, this.ae.mTopNumberAndPrivacyTag, this.am);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public void setSpuSelectedStatus(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9fb1cd76eae4430cb8603db883d1ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9fb1cd76eae4430cb8603db883d1ce");
            } else if (z) {
                this.as.setBackgroundResource(R.color.wm_sg_color_1affa200);
            } else {
                this.as.setBackgroundResource(R.color.wm_st_common_white);
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public void setNewCustomerLabel(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04cfbb43158517eb2dda5f183f01d82f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04cfbb43158517eb2dda5f183f01d82f");
                return;
            }
            com.sankuai.shangou.stone.util.u.c(this.w);
            com.sankuai.shangou.stone.util.u.c(this.aA);
            if (com.sankuai.shangou.stone.util.t.a(this.ae.promotion.labelPic)) {
                com.sankuai.shangou.stone.util.u.c(this.aw);
                return;
            }
            this.ax.setText(this.ae.promotion.promotionTxt);
            com.sankuai.shangou.stone.util.u.a(this.aw);
            com.sankuai.shangou.stone.util.u.a(this.ac);
            com.sankuai.waimai.store.util.m.b(this.ae.promotion.labelPic).a(new b.a() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.s.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2910d20d79c8f623a4ebe14459c29a14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2910d20d79c8f623a4ebe14459c29a14");
                        return;
                    }
                    a.this.ac.getLayoutParams().width = (a.this.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16) * bitmap.getWidth()) / bitmap.getHeight();
                    a.this.ac.setImageBitmap(bitmap);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d65f97d1b69185ef64da6b4c73094b1a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d65f97d1b69185ef64da6b4c73094b1a");
                    } else {
                        com.sankuai.shangou.stone.util.u.c(a.this.aw);
                    }
                }
            });
        }

        @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bb7098f9d7c175ff360a14b1820a37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bb7098f9d7c175ff360a14b1820a37");
            } else if (this.ae.unifyPrice == null) {
                super.a();
            }
        }

        @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9cb5c7342a775bba20742ecc2c069f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9cb5c7342a775bba20742ecc2c069f");
            } else if (this.ae.unifyPrice == null) {
                super.b();
            }
        }
    }
}
