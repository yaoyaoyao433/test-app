package com.sankuai.waimai.store.cell.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodTopLabel;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import com.sankuai.waimai.store.platform.domain.core.view.SingleColorLabelStyle;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.y;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class InnerCellView extends SpuBaseCellView {
    public static ChangeQuickRedirect b;
    private TextView a;
    private ImageView ar;
    private TextView as;
    private View at;
    private int au;
    private View av;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected FrameLayout f;
    protected FrameLayout g;
    protected TextView h;
    protected TextView i;
    protected FrameLayout j;
    protected TextView k;
    protected PoiCategory l;

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public int getLayoutId() {
        return R.layout.wm_st_poi_market_adapter_goods_bak;
    }

    public void h() {
    }

    public InnerCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2584bd33d79b603e465cad59b1d78b6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2584bd33d79b603e465cad59b1d78b6f");
        }
    }

    public InnerCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4545b4d5751c9a90fc090354c10987ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4545b4d5751c9a90fc090354c10987ac");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f659a9f5a2b57824673dbf79cec758b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f659a9f5a2b57824673dbf79cec758b2");
            return;
        }
        super.c();
        this.as = (TextView) this.n.findViewById(R.id.tv_stickyfood_sold_count);
        this.c = (TextView) this.n.findViewById(R.id.tv_stickyfood_stock);
        this.d = (TextView) this.n.findViewById(R.id.tv_stickyfood_recommend_reason);
        this.e = (TextView) this.n.findViewById(R.id.tv_stickyfood_rank);
        if (this.e != null) {
            this.e.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_nox_search_color_FFF5E2)).a(h.a(getContext(), 4.0f)).a());
        }
        this.f = (FrameLayout) findViewById(R.id.fl_property_label_container);
        this.g = (FrameLayout) findViewById(R.id.fl_property_label_container_old);
        this.h = (TextView) this.n.findViewById(R.id.txt_stickyfood_price_unit);
        this.at = this.n.findViewById(R.id.txt_skufood_bottom_line);
        this.a = (TextView) this.n.findViewById(R.id.txt_hot_sale_sort);
        this.ar = (ImageView) this.n.findViewById(R.id.img_hot_sale_sort);
        this.i = (TextView) this.n.findViewById(R.id.btn_sold_subscribe);
        this.j = (FrameLayout) this.n.findViewById(R.id.btn_sold_subscribe_fl);
        this.k = (TextView) this.n.findViewById(R.id.txt_stickyfood_status_out_new);
        this.av = this.n.findViewById(R.id.select_bg);
    }

    public final void a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory, int i, int i2) {
        Object[] objArr = {goodsSpu, goodsPoiCategory, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40c46c88ebf214de49d351aba593fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40c46c88ebf214de49d351aba593fb6");
            return;
        }
        this.l = goodsPoiCategory;
        this.au = i2;
        a(goodsSpu, i);
    }

    public void setViewLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f3d315a836a5e60bec1e6a45f0d315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f3d315a836a5e60bec1e6a45f0d315");
        } else if (z) {
            u.a(this.at);
        } else {
            u.c(this.at);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c961b4ef91ca7cee331b8c343a64b28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c961b4ef91ca7cee331b8c343a64b28");
            return;
        }
        l();
        m();
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe4ce0647efce173807159712cfee68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe4ce0647efce173807159712cfee68d");
        } else if (t.a(this.ae.getMonthSaledContent())) {
            u.b(this.as);
        } else {
            u.a(this.as);
            if (!p.a(this.as)) {
                this.as.setText(this.ae.getMonthSaledContent());
            }
        }
        k();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06f0348e2163aecafa1602a45f659c94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06f0348e2163aecafa1602a45f659c94");
        } else if (!p.a(this.h)) {
            if (z()) {
                u.c(this.h);
            } else if (TextUtils.isEmpty(this.ae.getGoodsUnit())) {
                u.c(this.h);
            } else {
                u.a(this.h);
                this.h.setText(this.ae.getGoodsUnit());
                if (this.ae.hasManySpec()) {
                    this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_BCBCBD));
                } else {
                    this.h.setTextColor(com.sankuai.waimai.store.util.b.b(this.h.getContext(), R.color.wm_sg_color_999999));
                }
            }
        }
        setViewLine(false);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "75d5c6e2ab33a4a0b1315099bac4b644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "75d5c6e2ab33a4a0b1315099bac4b644");
        } else if (p.a(this.i, this.j)) {
        } else {
            if (!this.ae.isDisplaySubscribe() || this.af.z()) {
                this.j.setVisibility(8);
                return;
            }
            this.j.setVisibility(0);
            if (this.ae.canSubscribe()) {
                this.i.setText(R.string.wm_sg_detail_spu_subscribe_on);
                this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.cell.view.InnerCellView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "487fa884819c37ae2e394d02108faa7a", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "487fa884819c37ae2e394d02108faa7a");
                        } else {
                            InnerCellView.this.aj.a(InnerCellView.this.ae);
                        }
                    }
                });
                return;
            }
            this.i.setText(R.string.wm_sg_spu_subscribe_off);
            this.j.setOnClickListener(null);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17684ffeb6870dd0ff0562a3a75bcebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17684ffeb6870dd0ff0562a3a75bcebf");
        } else if (this.v == null) {
        } else {
            if (this.ae == null || t.a(this.ae.videoIconUrl) || !t.a(this.ae.coverUrl)) {
                this.v.setVisibility(8);
                return;
            }
            m.c(this.ae.videoIconUrl, this.v.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_15)).a(this.v);
            this.v.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1389a05fe0d76e497b7716a91d228a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1389a05fe0d76e497b7716a91d228a");
        } else if (this.ae.getStatus() != 1 || p.a(this.k)) {
            u.c(this.k);
            super.g();
        } else {
            u.c(this.r);
            u.a(this.k, this.s);
            if (!t.a(this.ae.getStatusDescription())) {
                this.k.setText(this.ae.getStatusDescription());
            } else {
                this.k.setText(R.string.wm_sc_common_sold_out);
            }
            u.c(this.w);
            h();
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final boolean i() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b59e65d88e6d3e71c4a99b47ff399c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b59e65d88e6d3e71c4a99b47ff399c")).booleanValue();
        }
        int i = this.au;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf81a5489a851a8f8fae0f7f7670d428", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf81a5489a851a8f8fae0f7f7670d428")).booleanValue();
        } else if (i < 0 || this.l == null || this.l.activityTag == null || !this.l.activityTag.contains("hotsale_food") || i > 6) {
            u.c(this.a, this.ar);
            z = false;
        } else {
            u.a(this.a, this.ar);
            if (!p.a(this.a)) {
                this.a.setText(String.valueOf(i));
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e41ebca150258be80e32a6b1e8b20e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e41ebca150258be80e32a6b1e8b20e0");
            } else {
                u.c(this.x);
            }
            z = true;
        }
        if (z) {
            u.c(this.S, this.x);
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9d6174e1b0930430bf2c9bb29f1330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9d6174e1b0930430bf2c9bb29f1330");
        } else if (p.a(this.ae, this.u)) {
        } else {
            b.C0608b a = m.a(t.a(this.ae.coverUrl) ? this.ae.picture : this.ae.coverUrl, (int) getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_75), getDishPicQuality());
            a.j = R.drawable.wm_sc_common_poi_error;
            a.i = R.drawable.wm_sc_common_loading_large;
            a.a(this.u);
            u.a(this.u);
        }
    }

    public int getDishPicQuality() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e44bba96a0797ffda46a3b8a67173d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e44bba96a0797ffda46a3b8a67173d")).intValue() : ImageQualityUtil.b();
    }

    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c45efe04942105ad689d5d8e2d904f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c45efe04942105ad689d5d8e2d904f");
        } else if (this.ae == null || this.c == null) {
        } else {
            if (!t.a(this.ae.stockLabel)) {
                this.c.setVisibility(0);
                this.c.setText(this.ae.stockLabel);
                return;
            }
            this.c.setVisibility(8);
        }
    }

    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5c2f44298051e6e940f8d13a696dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5c2f44298051e6e940f8d13a696dc4");
        } else if (this.ae == null) {
            u.c(this.d, this.e);
        } else {
            y.a(this.ae.productTopLabels, this.ae.recommendReason, new y.a() { // from class: com.sankuai.waimai.store.cell.view.InnerCellView.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a(@NonNull String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "447d18aa11ae76df95c248a12ca61fb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "447d18aa11ae76df95c248a12ca61fb3");
                        return;
                    }
                    u.c(InnerCellView.this.e);
                    u.a(InnerCellView.this.d, InnerCellView.this.ae.recommendReason);
                }

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a(@NonNull GoodTopLabel goodTopLabel) {
                    Object[] objArr2 = {goodTopLabel};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3171906504c9d797d5cc55a843e8c073", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3171906504c9d797d5cc55a843e8c073");
                        return;
                    }
                    u.c(InnerCellView.this.d);
                    u.a(InnerCellView.this.e);
                    if (InnerCellView.this.e != null) {
                        InnerCellView.this.e.setText(goodTopLabel.content);
                        InnerCellView.this.e.setBackground(SingleColorLabelStyle.createDrawableFromStyle(InnerCellView.this.getContext(), goodTopLabel.style));
                        if (goodTopLabel.style != null) {
                            InnerCellView.this.e.setTextColor(d.a(goodTopLabel.style.contentColor, com.sankuai.waimai.store.util.b.b(InnerCellView.this.getContext(), R.color.wm_sg_color_FF7919)));
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "867c719f9dc8e96b701a6f003b2bd295", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "867c719f9dc8e96b701a6f003b2bd295");
                    } else {
                        u.c(InnerCellView.this.d, InnerCellView.this.e);
                    }
                }
            });
        }
    }

    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1566a4de8c655202abc1dfc44314381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1566a4de8c655202abc1dfc44314381");
            return;
        }
        u.a(this.g);
        u.c(this.f);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec43f1e16c7403ca1765e98347773cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec43f1e16c7403ca1765e98347773cf");
            return;
        }
        super.n();
        if (this.q == null || this.q.getVisibility() != 0) {
            return;
        }
        u.c(this.d, this.e);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void setSpuSelectedStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b914b9f7c23e73cf1d5edb3e474d97d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b914b9f7c23e73cf1d5edb3e474d97d");
        } else if (this.av == null) {
            super.setSpuSelectedStatus(z);
        } else {
            this.av.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "182a2de81063316fba30899e115d7a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "182a2de81063316fba30899e115d7a3d");
        } else if (p.a(this.ae, this.C)) {
        } else {
            u.a(this.C, i.a(this.ae.getMinPrice()));
        }
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09bad6bea687bad93f5c13925a257431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09bad6bea687bad93f5c13925a257431");
        } else if (a(this)) {
        } else {
            ((UniversalImageView) this.u).b();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1577313eeec2ad0eb00eae208ba6aaa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1577313eeec2ad0eb00eae208ba6aaa0");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        p();
    }

    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c5ac9c7fa371cd16fad8fdef94c89d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c5ac9c7fa371cd16fad8fdef94c89d");
        } else if (a(this)) {
        } else {
            UniversalImageView universalImageView = (UniversalImageView) this.u;
            if (I() == this) {
                universalImageView.a();
            } else {
                universalImageView.b();
            }
        }
    }

    private View I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5465566e058a64eb991d845b83d6d07f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5465566e058a64eb991d845b83d6d07f");
        }
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (a(childAt)) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "221b7b8dcf95d323a0c96d220e8fb177", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "221b7b8dcf95d323a0c96d220e8fb177")).booleanValue() : (view instanceof InnerCellView) && !a((InnerCellView) view) && view.getY() + ((float) view.getHeight()) > ((float) ((view.getHeight() * 5) / 8));
    }

    private static boolean a(InnerCellView innerCellView) {
        Object[] objArr = {innerCellView};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f3f53ef4331d331b67e96f3363def24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f3f53ef4331d331b67e96f3363def24")).booleanValue() : (innerCellView != null && (innerCellView.u instanceof UniversalImageView) && ((UniversalImageView) innerCellView.u).c()) ? false : true;
    }
}
