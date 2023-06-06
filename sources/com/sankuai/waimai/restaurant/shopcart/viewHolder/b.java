package com.sankuai.waimai.restaurant.shopcart.viewHolder;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.stepper.RooStepper;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect f;
    public final g g;
    public final com.sankuai.waimai.restaurant.shopcart.config.a h;
    k i;
    public Activity j;
    public View k;
    public View l;
    public RooStepper m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TagCanvasView q;
    public com.sankuai.waimai.platform.widget.tag.virtualtag.g r;
    public View s;
    public View.OnClickListener t;
    private Typeface u;
    private RelativeLayout v;
    private LinearLayout w;
    private LayoutInflater x;

    public b(@NonNull View view, Activity activity, g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, Typeface typeface) {
        super(view);
        Object[] objArr = {view, activity, gVar, aVar, typeface};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1eebf5d1aff3398ffcd2b5c9ee6503", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1eebf5d1aff3398ffcd2b5c9ee6503");
            return;
        }
        this.i = k.a();
        this.u = null;
        this.t = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.b.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String physicalTag;
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bbf7d8d3e6c0ceeb97707fbb05e7962", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bbf7d8d3e6c0ceeb97707fbb05e7962");
                } else if (view2.getId() == R.id.layout_food_item) {
                    OrderedFood orderedFood = (OrderedFood) view2.getTag();
                    if (orderedFood.spu.getActivityTag() != null && orderedFood.spu.getActivityTag().length() > 0) {
                        physicalTag = orderedFood.spu.getActivityTag();
                    } else if (orderedFood.spu.getTag() != null && orderedFood.spu.getTag().length() > 0) {
                        physicalTag = orderedFood.spu.getTag();
                    } else {
                        physicalTag = orderedFood.spu.getPhysicalTag();
                    }
                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(b.this.g.f(), physicalTag, orderedFood.getSpuId());
                    JudasManualManager.a a2 = JudasManualManager.a("b_mwhkm").a("c_CijEL");
                    a2.b = AppUtil.generatePageInfoKey(b.this.j);
                    a2.a("is_combo", 1).a();
                }
            }
        };
        this.j = activity;
        this.x = LayoutInflater.from(new ContextThemeWrapper(activity, 2131558963));
        this.g = gVar;
        this.h = aVar;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "602c2334e31a97eacadae7f5626ac9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "602c2334e31a97eacadae7f5626ac9d7");
        } else {
            this.k = view.findViewById(R.id.layout_food_item);
            this.m = (RooStepper) view.findViewById(R.id.roo_stepper);
            this.m.setBackColor(Color.parseColor("#F5F5F6"));
            this.o = (TextView) view.findViewById(R.id.txt_food_price);
            this.p = (TextView) view.findViewById(R.id.txt_food_original_price);
            this.p.setPaintFlags(17);
            this.n = (TextView) view.findViewById(R.id.txt_food_name);
            this.l = view.findViewById(R.id.layout_food_item_divider_long_line);
            this.w = (LinearLayout) view.findViewById(R.id.shop_cart_item_container);
            this.q = (TagCanvasView) view.findViewById(R.id.tcv_shop_cart);
            this.s = a(R.id.img_foodCount_add);
            try {
                if (this.u != null) {
                    this.o.setTypeface(this.u);
                    this.p.setTypeface(this.u);
                }
            } catch (Throwable unused) {
            }
            this.v = (RelativeLayout) view.findViewById(R.id.shop_cart_price_layout);
            this.v.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02b1137c55fe12d3242dbb6972410dca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02b1137c55fe12d3242dbb6972410dca");
                        return;
                    }
                    b bVar = b.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.f;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "ec5667ff1d76935af5935ab74afefe56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "ec5667ff1d76935af5935ab74afefe56");
                        return;
                    }
                    int measuredWidth = (bVar.j.getResources().getDisplayMetrics().widthPixels - (bVar.o.getMeasuredWidth() + bVar.p.getMeasuredWidth())) - com.sankuai.waimai.foundation.utils.g.a(bVar.j, 194.0f);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bVar.q.getLayoutParams();
                    if (layoutParams.width != measuredWidth) {
                        layoutParams.width = measuredWidth;
                        bVar.q.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        this.u = typeface;
    }

    public void a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar, OrderedFood orderedFood) {
        Object[] objArr = {gVar, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06fb1d60b06bd51d8e2ce69a96603d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06fb1d60b06bd51d8e2ce69a96603d1f");
            return;
        }
        this.w.removeAllViews();
        if (orderedFood == null || com.sankuai.waimai.foundation.utils.b.b(orderedFood.getComboItems())) {
            return;
        }
        List<OrderedFood> comboItems = orderedFood.getComboItems();
        int i = 0;
        while (i < comboItems.size()) {
            com.sankuai.waimai.business.restaurant.base.shopcart.g gVar2 = new com.sankuai.waimai.business.restaurant.base.shopcart.g();
            ShopCartItem shopCartItem = new ShopCartItem();
            shopCartItem.food = comboItems.get(i);
            c cVar = new c(this.x.inflate(R.layout.wm_shopcart_adapter_food_item, (ViewGroup) null, false), this.j, this.g, this.h, this.u, true);
            gVar2.h = shopCartItem;
            gVar2.g = i;
            gVar2.e = 3;
            gVar2.d = gVar.d;
            gVar2.f = gVar.f;
            gVar2.r = i == comboItems.size() - 1;
            cVar.a(gVar2, i);
            this.w.addView(cVar.b);
            i++;
        }
    }

    public int a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2dfea104f895beb7679ff29d6b5241", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2dfea104f895beb7679ff29d6b5241")).intValue();
        }
        if (this.g != null) {
            return com.sankuai.waimai.restaurant.shopcart.utils.d.a(this.g.f(), gVar.h.getFoodSpu(), gVar.h.getFoodSku());
        }
        return 0;
    }
}
