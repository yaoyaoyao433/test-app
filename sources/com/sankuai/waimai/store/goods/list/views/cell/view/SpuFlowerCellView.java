package com.sankuai.waimai.store.goods.list.views.cell.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.param.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.SpuInfo;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.StrikeTextView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuFlowerCellView extends SpuBaseCellView implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private a ar;
    private int as;
    private int at;
    private TextView au;
    private LinearLayout av;
    private TextView b;
    private TextView c;
    private TextView d;
    private ImageView e;
    private StrikeTextView f;
    private TextView g;
    private RelativeLayout h;
    private TextView i;
    private ImageView j;
    private TextView k;
    private SpuInfo l;

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public int getLayoutId() {
        return R.layout.wm_st_view_spu_flower_cell;
    }

    public static /* synthetic */ void a(SpuFlowerCellView spuFlowerCellView, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, spuFlowerCellView, changeQuickRedirect, false, "a4992d9255f860f23ae735de12a8a686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, spuFlowerCellView, changeQuickRedirect, false, "a4992d9255f860f23ae735de12a8a686");
        } else if (p.a(spuFlowerCellView.ar, spuFlowerCellView.l.spu, spuFlowerCellView.l.poi)) {
        } else {
            GoodsSpu goodsSpu = spuFlowerCellView.l.spu;
            Poi poi = spuFlowerCellView.l.poi;
            b.a(spuFlowerCellView.ar.G, str).a("poi_id", poi.getOfficialPoiId()).a("spu_id", Long.valueOf(goodsSpu.id)).a("index", Integer.valueOf(spuFlowerCellView.as)).a("cat_id", Long.valueOf(spuFlowerCellView.ar.c)).a("sec_cat_id", spuFlowerCellView.ar.f).a("sort", Long.valueOf(spuFlowerCellView.ar.g)).a("filter", spuFlowerCellView.ar.n()).a("delivery_fee", i.a(Double.valueOf(poi.shippingFee), Double.valueOf(0.0d)) ? spuFlowerCellView.getContext().getString(R.string.wm_sc_goods_label_delivery_fee_free) : null).a("delivery_time", poi.mtDeliveryTime).a("score", Double.valueOf(poi.poiScore)).a("activity_type", Integer.valueOf(goodsSpu.activityType)).a("orig_price", Double.valueOf(goodsSpu.getOriginPrice())).a("current_price", Double.valueOf(goodsSpu.getMinPrice())).a("sale", Integer.valueOf(goodsSpu.monthSaled)).a();
        }
    }

    public SpuFlowerCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac04f4bd7437d6ef2ad3f6562edff70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac04f4bd7437d6ef2ad3f6562edff70");
        }
    }

    public SpuFlowerCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4273fb929a9acc27b0d7231567cafef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4273fb929a9acc27b0d7231567cafef");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebca641f795cb9c6c4c3e2fca8106610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebca641f795cb9c6c4c3e2fca8106610");
            return;
        }
        super.c();
        this.au = (TextView) this.n.findViewById(R.id.txt_shipping_fee);
        this.b = (TextView) this.n.findViewById(R.id.txt_poi_name);
        this.c = (TextView) this.n.findViewById(R.id.txt_poi_score);
        this.d = (TextView) this.n.findViewById(R.id.txt_poi_delivery_time);
        this.e = (ImageView) this.n.findViewById(R.id.img_poi_store_link);
        this.f = (StrikeTextView) this.n.findViewById(R.id.food_original_price);
        this.g = (TextView) this.n.findViewById(R.id.channel_spu_flower_promotion);
        this.h = (RelativeLayout) this.n.findViewById(R.id.layout_poi);
        this.i = (TextView) this.n.findViewById(R.id.txt_poi_status_closed);
        this.j = (ImageView) this.n.findViewById(R.id.img_star);
        this.k = (TextView) this.n.findViewById(R.id.txt_poi_month_sale);
        this.av = (LinearLayout) this.n.findViewById(R.id.layout_poi_bottom);
        this.at = (h.a(getContext()) - getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_30)) / 2;
        ViewGroup.LayoutParams layoutParams = this.u.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.at, this.at);
        }
        layoutParams.width = this.at;
        layoutParams.height = this.at;
        this.u.setLayoutParams(layoutParams);
        this.s.setLayoutParams(layoutParams);
        this.e.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.e.getContext(), (int) R.dimen.wm_sc_common_dimen_2_half, (int) R.dimen.wm_sc_common_dimen_5, (int) R.color.wm_sg_color_c9c5c2, a.EnumC1338a.RIGHT));
    }

    public final void a(SpuInfo spuInfo, int i) {
        Object[] objArr = {spuInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23d58753c3c5b40e35076dfc96063ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23d58753c3c5b40e35076dfc96063ad");
        } else if (spuInfo == null) {
        } else {
            a(this.h);
            this.l = spuInfo;
            this.as = i;
            setOnClickListener(this);
            setPoiHelper(new com.sankuai.waimai.store.platform.domain.manager.poi.a(this.l.poi));
            com.sankuai.waimai.store.order.a.e().a(this.af.d(), this.af.b);
            super.a(this.l.spu, i);
        }
    }

    private void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8201050611e3cd4a26690abee2299e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8201050611e3cd4a26690abee2299e3");
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            } else {
                childAt.forceLayout();
            }
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c5de270f4bfb38ff7c2d683f913df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c5de270f4bfb38ff7c2d683f913df7");
            return;
        }
        super.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86dbaab6b92b8dc9da43511989a27021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86dbaab6b92b8dc9da43511989a27021");
        } else if (!p.a(this.l.spu)) {
            if (i.e(Double.valueOf(this.l.spu.getOriginPrice()), Double.valueOf(0.0d))) {
                u.a(this.f);
                this.f.setText(getContext().getString(R.string.wm_sc_common_price, i.a(this.l.spu.getOriginPrice())));
            } else {
                u.c(this.f);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63501985fe355698f33d63b4adb8e1d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63501985fe355698f33d63b4adb8e1d9");
        } else if (this.l.spu != null && this.l.spu.promotion != null) {
            this.g.setText(this.l.spu.promotion.promotionTxt);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "88b89e42d467e68f8e25fef30a37fdf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "88b89e42d467e68f8e25fef30a37fdf2");
        } else {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.views.cell.view.SpuFlowerCellView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0aa01ce52a17b1c9d4a2a57689334776", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0aa01ce52a17b1c9d4a2a57689334776");
                        return;
                    }
                    SpuFlowerCellView.a(SpuFlowerCellView.this, "b_waimai_4jw58efj_mc");
                    if (p.a(SpuFlowerCellView.this.l.poi) || TextUtils.isEmpty(SpuFlowerCellView.this.l.poi.restaurantScheme)) {
                        return;
                    }
                    d.a(SpuFlowerCellView.this.getContext(), SpuFlowerCellView.this.l.poi.restaurantScheme);
                }
            });
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fbc558f1ec2ba6fc7bac0ce0b0042aa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fbc558f1ec2ba6fc7bac0ce0b0042aa0");
        } else if (!p.a(this.l.poi)) {
            this.b.setText(this.l.poi.name);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e6f4045138bb866fff6c2db642ec1f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e6f4045138bb866fff6c2db642ec1f47");
        } else if (p.a(this.l.poi)) {
        } else {
            if (this.l.poi.getState() == 3) {
                u.a(this.i);
                u.c(this.av, this.j, this.c);
                return;
            }
            u.c(this.i);
            u.a(this.av, this.j, this.c);
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f8738753a989f6535acb99cb2110ee35", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f8738753a989f6535acb99cb2110ee35");
            } else if (this.l.poi != null) {
                this.k.setText(this.l.poi.monthSale);
                if (TextUtils.isEmpty(this.l.poi.monthSale)) {
                    this.k.setVisibility(8);
                } else {
                    this.k.setVisibility(0);
                }
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "533b48fbcff6a877349e6688912b0dee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "533b48fbcff6a877349e6688912b0dee");
            } else if (!p.a(this.l.poi)) {
                this.d.setText(this.l.poi.mtDeliveryTime);
                if (TextUtils.isEmpty(this.l.poi.mtDeliveryTime)) {
                    this.d.setVisibility(8);
                } else {
                    this.d.setVisibility(0);
                }
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "cee47ccfa9578172f56ca1343e6da18f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "cee47ccfa9578172f56ca1343e6da18f");
            } else if (this.l.poi != null) {
                if (i.a(Double.valueOf(this.l.poi.shippingFee), Double.valueOf(0.0d))) {
                    this.au.setText(getContext().getString(R.string.wm_sc_goods_label_delivery_fee_free));
                } else {
                    this.au.setText(getContext().getString(R.string.wm_sg_channel_flower_cell_shipping_fee, i.a(this.l.poi.shippingFee)));
                }
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "53d9217d29d6bdc555f6b1bf70a1fcab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "53d9217d29d6bdc555f6b1bf70a1fcab");
            } else if (p.a(this.l.poi)) {
            } else {
                if (i.a(Double.valueOf(this.l.poi.poiScore), Double.valueOf(0.0d))) {
                    this.j.setImageResource(R.drawable.wm_sc_poi_star_gray);
                    this.c.setText("");
                    return;
                }
                this.j.setImageResource(R.drawable.wm_sc_poi_star);
                this.c.setText(String.valueOf(this.l.poi.poiScore));
            }
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75abf5dd3676a5bcd4b83e4a2a470196", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75abf5dd3676a5bcd4b83e4a2a470196");
        } else if (p.a(this.l.spu, this.u)) {
            u.c(this.u);
        } else {
            b.C0608b a2 = m.a(this.l.spu.getPicture(), this.at, ImageQualityUtil.b());
            a2.j = R.drawable.wm_sc_common_poi_error;
            a2.i = R.drawable.wm_sc_common_loading_large;
            a2.a(this.u);
            u.a(this.u);
        }
    }

    public void setInDataParam(com.sankuai.waimai.store.param.a aVar) {
        this.ar = aVar;
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView, android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6f5a37d84f6dd4de38c7ec7aaa9405", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6f5a37d84f6dd4de38c7ec7aaa9405");
        } else {
            super.onClick(view);
        }
    }
}
