package com.sankuai.waimai.store.skuchoose;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.assembler.component.p;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.cell.view.SpuEstimatedPriceView;
import com.sankuai.waimai.store.goods.subscribe.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceAdapterView;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.s;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.view.SpuHandPriceNewView;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends a {
    public static ChangeQuickRedirect f;
    private RelativeLayout A;
    private TagCanvasView B;
    TextView g;
    TextView h;
    protected TextView i;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a j;
    com.sankuai.waimai.store.observers.a k;
    c l;
    boolean m;
    private int n;
    private TextView o;
    private TextView p;
    private SpuEstimatedPriceView q;
    private ViewGroup r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private SpuHandPriceNewView w;
    private com.sankuai.waimai.store.assembler.component.p x;
    private p y;
    private HandPriceAdapterView z;

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final int a() {
        return R.layout.wm_sc_view_goods_detail_price;
    }

    public static /* synthetic */ void a(l lVar, double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "980e6468b082171c0a841c4459603755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "980e6468b082171c0a841c4459603755");
            return;
        }
        lVar.p.setText(com.sankuai.shangou.stone.util.i.a(d));
        lVar.p.setTextColor(ContextCompat.getColor(lVar.b, R.color.wm_st_common_FF4A26));
        lVar.o.setTextColor(ContextCompat.getColor(lVar.b, R.color.wm_st_common_FF4A26));
    }

    public l(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, com.sankuai.waimai.store.observers.a aVar2, p pVar, c cVar) {
        super(context);
        Object[] objArr = {context, aVar, aVar2, pVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d19735e2b84e1d3bd33adaeeff2102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d19735e2b84e1d3bd33adaeeff2102");
            return;
        }
        this.j = aVar;
        this.k = aVar2;
        this.y = pVar;
        this.l = cVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2566399ea9312cce94359fe992570db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2566399ea9312cce94359fe992570db8");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe54b45c5f16a565626663332c49951d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe54b45c5f16a565626663332c49951d");
            return;
        }
        this.o = (TextView) findView(R.id.tv_price_label);
        this.p = (TextView) findView(R.id.txt_price);
        this.q = (SpuEstimatedPriceView) findView(R.id.view_estimate_price);
        this.g = (TextView) findView(R.id.tv_member_price_tag);
        this.s = (TextView) findView(R.id.txt_add_shopcart);
        this.u = (TextView) findView(R.id.txt_skufood_count);
        this.r = (ViewGroup) findView(R.id.v_add_dec_layout);
        this.t = (TextView) findView(R.id.txt_sold_subscrib);
        this.t.setTextColor(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_st_common_FF8000));
        this.t.setBackground(new e.a().b(this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_half)).a(ContextCompat.getColor(getContext(), R.color.wm_st_common_FF8000)).a(this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4)).a());
        this.x = new com.sankuai.waimai.store.assembler.component.p(this.b);
        this.r.addView(this.x.b);
        this.w = (SpuHandPriceNewView) findView(R.id.sg_new_hand_price_view);
        this.h = (TextView) findView(R.id.txt_origin_price);
        this.i = (TextView) findView(R.id.txt_promotion_info);
        this.v = (TextView) findView(R.id.tv_discount_stock);
        this.z = (HandPriceAdapterView) findView(R.id.hand_price_component);
        this.A = (RelativeLayout) findView(R.id.price_root_view);
        this.i.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.b, 4.0f)).b(1).a(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_st_common_4CFB4E44)).c(com.sankuai.waimai.store.util.b.b(this.b, R.color.wm_sg_color_FFFFFF)).a());
        if (this.j != null && this.j.x()) {
            this.s.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.b, 6.0f), com.sankuai.shangou.stone.util.h.a(this.b, 6.0f), com.sankuai.shangou.stone.util.h.a(this.b, 6.0f), com.sankuai.shangou.stone.util.h.a(this.b, 6.0f)).a(GradientDrawable.Orientation.BL_TR, new int[]{ContextCompat.getColor(this.b, R.color.wm_sg_color_6CD12E), ContextCompat.getColor(this.b, R.color.wm_sg_color_39AA23)}).a());
            this.s.setTextColor(ContextCompat.getColor(this.b, R.color.white));
            this.s.setCompoundDrawablesWithIntrinsicBounds(R.drawable.wm_st_goods_detail_shopcart_add_icon_white, 0, 0, 0);
        } else {
            this.s.setBackground(com.sankuai.waimai.store.util.b.d(this.b, R.drawable.wm_sc_bg_food_detail_add_shop_cart));
            this.s.setTextColor(ContextCompat.getColor(this.b, R.color.wm_sc_common_txt_btn_solid));
            TextView textView = this.s;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f;
            textView.setCompoundDrawablesWithIntrinsicBounds(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1c8b74ab8b614105c9c33c9a1a71edc", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1c8b74ab8b614105c9c33c9a1a71edc") : com.sankuai.waimai.store.util.e.a().a(new int[]{-16842910}, com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_sc_goods_list_icon_sku_shoose_shopping_cart_disable)).a(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_sc_goods_list_icon_sku_shoose_shopping_cart_enabled)).b, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (this.j != null) {
            this.x.a(this.j.x());
        }
        this.x.a(new p.a() { // from class: com.sankuai.waimai.store.skuchoose.l.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.assembler.component.p.a
            public final void a(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "363febc94d0c84c5823412f15c78d22c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "363febc94d0c84c5823412f15c78d22c");
                } else if (l.this.l != null) {
                    l.this.l.b(view);
                }
            }

            @Override // com.sankuai.waimai.store.assembler.component.p.a
            public final void b(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bc9713b0068579df2b70b0ac361b664c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bc9713b0068579df2b70b0ac361b664c");
                } else if (l.this.l != null) {
                    l.this.l.c(view);
                }
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.l.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cd62d40489598a702ce75d001e939ebe", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cd62d40489598a702ce75d001e939ebe");
                } else if (l.this.l != null) {
                    l.this.l.b(view);
                }
            }
        });
        this.B = (TagCanvasView) findView(R.id.id_dynamic_tag_view);
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51a144333a6892aa6d8d4d813c21f84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51a144333a6892aa6d8d4d813c21f84");
        } else if (goodsSpu == null || !com.sankuai.shangou.stone.util.a.a((Collection) goodsSpu.getSkus(), 1)) {
        } else {
            a(goodsSpu, goodsSpu.activityType > 0, goodsSpu.getSkus().get(0));
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku) {
        Object[] objArr = {goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1fa47593ad77a80f2e9fd2954b61b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1fa47593ad77a80f2e9fd2954b61b9");
        } else if (goodsSpu == null || goodsSku == null) {
            u.c(this.q);
        } else if (this.j.t() && goodsSpu.handPriceInfo != null && goodsSpu.handPriceInfo.isShowNewStyle()) {
            u.c(this.A);
            u.a(this.z);
            HandPriceAdapterView handPriceAdapterView = this.z;
            boolean i = com.sankuai.waimai.store.order.a.e().i(this.j.d());
            com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a();
            a.d = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_40;
            handPriceAdapterView.a(goodsSpu, goodsSku, i, a);
        } else {
            u.a(this.A);
            u.c(this.z);
            HandPriceInfo a2 = com.sankuai.waimai.store.util.k.a(this.j.b, goodsSpu, goodsSku);
            if (this.j.t()) {
                if (a2 != null) {
                    u.a(this.q);
                    this.q.a(3.0f, 0.0f);
                    this.q.a(this.j.b, a2);
                    this.p.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_222426));
                    this.o.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_222426));
                    u.c(this.h);
                    this.h.setVisibility(8);
                    return;
                }
                u.c(this.q);
                this.p.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_FF4A26));
                this.o.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_FF4A26));
                if (this.g.getVisibility() == 8 && this.m) {
                    u.a(this.h);
                    return;
                } else {
                    u.c(this.h);
                    return;
                }
            }
            if (!TextUtils.isEmpty(a2 != null ? a2.getHandActivityPriceText() : null)) {
                if (this.h.getVisibility() == 0) {
                    u.c(this.h);
                }
                u.a(this.w);
                this.w.a(a2, 1);
                u.c(this.q);
                this.p.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_222426));
                this.o.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_222426));
                return;
            }
            u.c(this.w, this.q);
            this.p.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_FF4A26));
            this.o.setTextColor(ContextCompat.getColor(this.b, R.color.wm_st_common_FF4A26));
            if (this.g.getVisibility() == 8 && this.m) {
                u.a(this.h);
            } else {
                u.c(this.h);
            }
        }
    }

    private void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a7a701bb2c4058163db7649877c918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a7a701bb2c4058163db7649877c918");
        } else if (this.t == null) {
        } else {
            this.t.setOnClickListener(onClickListener);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b9c96e49858d667450884ed05a3fc52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b9c96e49858d667450884ed05a3fc52");
            return;
        }
        com.sankuai.waimai.store.assembler.component.p pVar = this.x;
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.assembler.component.p.a;
        if (PatchProxy.isSupport(objArr2, pVar, changeQuickRedirect2, false, "ddc68f8c30f7cf423ddd740cf56f59be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pVar, changeQuickRedirect2, false, "ddc68f8c30f7cf423ddd740cf56f59be");
            return;
        }
        pVar.c.setEnabled(true);
        pVar.d.setEnabled(true);
    }

    private boolean a(GoodsSku goodsSku, GoodsSpu goodsSpu) {
        boolean z;
        boolean z2;
        Object[] objArr = {goodsSku, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c252235ea7aba35377e5a5bb8baa52a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c252235ea7aba35377e5a5bb8baa52a")).booleanValue();
        }
        if (goodsSku == null || goodsSpu == null) {
            b(goodsSpu);
            return true;
        }
        int status = goodsSku.getStatus();
        Object[] objArr2 = {Integer.valueOf(status), goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37f4a718bf3ee61dcce730e115432683", RobustBitConfig.DEFAULT_VALUE)) {
            switch (status) {
                case 1:
                case 2:
                    b(goodsSpu);
                    z = true;
                    break;
                default:
                    this.y.b(true);
                    this.y.a(false);
                    z = false;
                    break;
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37f4a718bf3ee61dcce730e115432683")).booleanValue();
        }
        if (!z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca67f30bdca3d6c6281603dde5a12374", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca67f30bdca3d6c6281603dde5a12374")).booleanValue();
            } else if (this.j == null || this.j.b == null || this.j.b.getState() != 3) {
                z2 = false;
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = f;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8479099bd2a40435c35c233a78f95f4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8479099bd2a40435c35c233a78f95f4c");
                } else {
                    this.y.a(false);
                    u.c(this.g);
                    u.b(this.r, this.s);
                }
                z2 = true;
            }
            if (!z2) {
                b();
                return false;
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void b(final GoodsSpu goodsSpu, final GoodsSku goodsSku) {
        Object[] objArr = {goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9d26d2fa4af31ab74d3ddc189dae1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9d26d2fa4af31ab74d3ddc189dae1d");
        } else if (goodsSku == null || !goodsSku.isDisplaySubscribe()) {
            u.c(this.t);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9203687c95c9b0004456fce25525d23", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9203687c95c9b0004456fce25525d23");
            } else {
                u.b(this.r, this.s);
                this.y.a(true);
                this.y.b(false);
                u.c(this.g);
                if (this.c != null && !TextUtils.isEmpty(this.c.getStatusDescription())) {
                    this.y.a(this.c.getStatusDescription());
                } else {
                    this.y.a(this.b.getString(R.string.wm_sc_common_sold_out));
                }
            }
            u.a(this.t);
            if (goodsSku.canSubscribe()) {
                u.a(this.t, getContext().getString(R.string.wm_sg_sku_subscribe_hint));
                this.t.setCompoundDrawablesWithIntrinsicBounds(com.sankuai.waimai.store.util.e.a(com.sankuai.waimai.store.util.b.d(getContext(), R.drawable.wm_sc_selector_subscribe_icon), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_st_common_FF8000)), (Drawable) null, (Drawable) null, (Drawable) null);
                a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.l.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ed79424e2f3a02adf169e6545fc9fe9", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ed79424e2f3a02adf169e6545fc9fe9");
                        } else if (goodsSku == null || l.this.j == null || !(view.getContext() instanceof SCBaseActivity)) {
                        } else {
                            com.sankuai.waimai.store.goods.subscribe.a.a().a((SCBaseActivity) view.getContext(), l.this.j.f(), l.this.j.h(), goodsSpu, goodsSku, new a.InterfaceC1204a() { // from class: com.sankuai.waimai.store.skuchoose.l.3.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.goods.subscribe.a.InterfaceC1204a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3b1ba162606130b0993081ec3202b401", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3b1ba162606130b0993081ec3202b401");
                                    } else if (goodsSku != null) {
                                        goodsSku.subscribe = 2;
                                        if (l.this.k != null) {
                                            l.this.k.ba_();
                                        }
                                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.goods.detail.components.root.j(goodsSku.id));
                                    }
                                }
                            });
                        }
                    }
                });
                return;
            }
            a((View.OnClickListener) null);
            u.a(this.t, this.b.getResources().getString(R.string.wm_sg_spu_subscribe_off));
            this.t.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445ec21b3c289555788847df866591ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445ec21b3c289555788847df866591ef");
            return;
        }
        this.n = i;
        b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16842b607ff0cbc3fc6ad9d33c75ee27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16842b607ff0cbc3fc6ad9d33c75ee27");
        } else if (this.d == null || this.s == null) {
        } else {
            int i2 = this.d.minOrderCount;
            if (w.a(this.c, this.j.d()) == 0 && i2 > 1) {
                TextView textView = this.s;
                textView.setText(i2 + "份起购");
                return;
            }
            this.s.setText("加入购物车");
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135049373ad6cc9768377f7490b30e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135049373ad6cc9768377f7490b30e9d");
        } else if (goodsSpu == null || goodsSku == null) {
        } else {
            this.c = goodsSpu;
            this.d = goodsSku;
            this.e = goodsAttrArr;
            if (a(goodsSku, goodsSpu)) {
                return;
            }
            a(true);
            a(com.sankuai.waimai.store.order.a.e().a(this.j.d(), goodsSpu.getId(), goodsSku.getSkuId(), goodsAttrArr));
        }
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(int i, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {Integer.valueOf(i), goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a89774acaadf9aa92cd5d60e50cb414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a89774acaadf9aa92cd5d60e50cb414");
        } else if (goodsSpu == null || goodsSku == null) {
        } else {
            this.e = goodsAttrArr;
            if (a(goodsSku, goodsSpu)) {
                return;
            }
            int stock = goodsSku.getStock();
            int a = goodsSku != null ? com.sankuai.waimai.store.order.a.e().a(this.j.d(), goodsSpu.getId(), goodsSku.getSkuId()) : 0;
            if (stock == 0 || ((i < stock && a < stock) || i <= stock)) {
                stock = i;
            }
            a(true);
            a(stock);
        }
    }

    private void b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8214058b76cc08dcab93872e041994fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8214058b76cc08dcab93872e041994fc");
            return;
        }
        u.b(this.r, this.s);
        this.y.a(true);
        u.c(this.g);
        this.y.b(false);
        if (goodsSpu != null && !TextUtils.isEmpty(goodsSpu.getStatusDescription())) {
            this.y.a(goodsSpu.getStatusDescription());
        } else {
            this.y.a(this.b.getString(R.string.wm_sc_common_sold_out));
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3855bb19eda034cc35cdd9959e046de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3855bb19eda034cc35cdd9959e046de");
            return;
        }
        this.y.a(false);
        if (this.n != 0) {
            u.b(this.s);
            u.a(this.r);
            this.x.a(this.n);
            return;
        }
        u.b(this.r);
        u.a(this.s);
        this.s.setEnabled(true);
    }

    @Override // com.sankuai.waimai.store.skuchoose.a
    public final void a(GoodsSpu goodsSpu, boolean z, GoodsSku goodsSku) {
        Object[] objArr = {goodsSpu, Byte.valueOf(z ? (byte) 1 : (byte) 0), goodsSku};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a6f9406310a3ade2411c0b9116e077d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a6f9406310a3ade2411c0b9116e077d");
        } else if (goodsSpu == null || goodsSku == null) {
        } else {
            this.c = goodsSpu;
            this.d = goodsSku;
            if (this.j.t() && goodsSpu.handPriceInfo != null && goodsSpu.handPriceInfo.isShowNewStyle()) {
                u.c(this.A);
                u.a(this.z);
                HandPriceAdapterView handPriceAdapterView = this.z;
                boolean i = com.sankuai.waimai.store.order.a.e().i(this.j.d());
                com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a();
                a.d = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_40;
                handPriceAdapterView.a(goodsSpu, goodsSku, i, a);
                return;
            }
            u.a(this.A);
            u.c(this.z);
            s.a(z, goodsSku, new s.a<GoodsSku>() { // from class: com.sankuai.waimai.store.skuchoose.l.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void a(GoodsSku goodsSku2) {
                    GoodsSku goodsSku3 = goodsSku2;
                    Object[] objArr2 = {goodsSku3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f463ca671057534112213502035d4659", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f463ca671057534112213502035d4659");
                    } else if (goodsSku3 != null) {
                        l.a(l.this, goodsSku3.price);
                        u.c(l.this.g);
                        if (com.sankuai.shangou.stone.util.p.a(l.this.h)) {
                            return;
                        }
                        if (!com.sankuai.shangou.stone.util.i.d(Double.valueOf(goodsSku3.getOriginPrice()), Double.valueOf(goodsSku3.price))) {
                            u.c(l.this.h);
                            l.this.m = false;
                            return;
                        }
                        l.this.m = true;
                        l.this.h.setText(l.this.b.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(goodsSku3.getOriginPrice())));
                    }
                }

                @Override // com.sankuai.waimai.store.util.s.a
                public final /* synthetic */ void b(GoodsSku goodsSku2) {
                    GoodsSku goodsSku3 = goodsSku2;
                    Object[] objArr2 = {goodsSku3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e67dee98c89ae8adac1622f33e5306c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e67dee98c89ae8adac1622f33e5306c1");
                    } else if (goodsSku3 != null) {
                        l.a(l.this, goodsSku3.price);
                        l lVar = l.this;
                        double d = goodsSku3.memberPrice;
                        Object[] objArr3 = {Double.valueOf(d)};
                        ChangeQuickRedirect changeQuickRedirect3 = l.f;
                        if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "29d616ac1ab6a55065d0edf424394a57", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "29d616ac1ab6a55065d0edf424394a57");
                        } else {
                            lVar.g.setText(lVar.b.getString(R.string.wm_sc_common_price, com.sankuai.shangou.stone.util.i.a(d)));
                        }
                        u.a(l.this.g);
                    }
                }
            });
            a(goodsSpu, goodsSku);
            a(goodsSku);
        }
    }

    private void a(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852e4835db8fad1d3f8d95aba15aaec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852e4835db8fad1d3f8d95aba15aaec9");
            return;
        }
        if (goodsSku.dynamicActLabels != null) {
            u.c(this.i);
            u.a(this.B);
            com.sankuai.waimai.platform.widget.tag.virtualtag.a<?> adapter = this.B.getAdapter();
            if (adapter == null) {
                adapter = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(getContext(), null);
                this.B.setAdapter(adapter);
            }
            adapter.b(com.sankuai.waimai.platform.widget.tag.util.a.a(getContext(), goodsSku.dynamicActLabels));
            adapter.notifyChanged();
        } else {
            u.c(this.B);
            if (!this.j.t() && goodsSku.promotion != null && !t.a(goodsSku.promotion.promotionTxt)) {
                u.a((View) this.i, 0);
                u.a(this.i, goodsSku.promotion.promotionTxt);
            } else {
                u.a((View) this.i, 8);
            }
        }
        if (goodsSku.totalStockLabel == null) {
            u.a(this.v, goodsSku.stockLabel);
        } else {
            u.a(this.v, goodsSku.totalStockLabel);
        }
    }
}
