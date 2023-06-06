package com.sankuai.waimai.store.shopping.cart.viewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.adapter.a;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.StrikeTextView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends g<com.sankuai.waimai.store.platform.domain.core.order.a, a.InterfaceC1328a> {
    public static ChangeQuickRedirect a;
    private TextView A;
    private ViewGroup B;
    private LinearLayout C;
    private ViewGroup D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private GoodDetailResponse I;
    private View.OnClickListener J;
    ImageView b;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    final SCPageConfig d;
    private View e;
    private ImageView f;
    private TextView g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private StrikeTextView l;
    private ImageView m;
    private TextView r;
    private ImageView s;
    private View t;
    private View u;
    private TextView v;
    private TextView w;
    private TextView x;
    private View y;
    private TextView z;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_shopcart_adapter_food_item;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05de  */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.sankuai.waimai.store.platform.domain.core.order.a r19, int r20) {
        /*
            Method dump skipped, instructions count: 1533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.shopping.cart.viewHolder.b.a(java.lang.Object, int):void");
    }

    public b(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig, GoodDetailResponse goodDetailResponse) {
        Object[] objArr = {aVar, sCPageConfig, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97037bc733499f9ff0b1cb0ead98d89d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97037bc733499f9ff0b1cb0ead98d89d");
            return;
        }
        this.J = new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.viewHolder.b.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01a9049b757d546ef71cffbce40d3c4e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01a9049b757d546ef71cffbce40d3c4e");
                } else if (view.getId() == R.id.layout_food_item) {
                    com.sankuai.waimai.store.router.g.a(view.getContext(), ((OrderedFood) view.getTag()).spu, b.this.c.b);
                    com.sankuai.waimai.store.manager.judas.b.a(b.this.d.d, "b_mwhkm").a();
                }
            }
        };
        this.c = aVar;
        this.d = sCPageConfig;
        this.I = goodDetailResponse;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113f1e8f9a3de296c323f169e8ebb6b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113f1e8f9a3de296c323f169e8ebb6b3");
            return;
        }
        this.e = view.findViewById(R.id.layout_food_item);
        this.t = view.findViewById(R.id.view_food_divider);
        this.u = view.findViewById(R.id.view_food_divider_bottom);
        this.f = (ImageView) view.findViewById(R.id.img_foodCount_dec);
        this.s = (ImageView) view.findViewById(R.id.img_shopcart_member);
        this.m = (ImageView) view.findViewById(R.id.img_food_pic);
        this.g = (TextView) view.findViewById(R.id.txt_foodCount_number);
        this.r = (TextView) view.findViewById(R.id.txt_food_price_unit);
        this.h = (ImageView) view.findViewById(R.id.img_foodCount_add);
        this.i = (TextView) view.findViewById(R.id.txt_food_price);
        this.l = (StrikeTextView) view.findViewById(R.id.txt_food_original_price);
        this.j = (TextView) view.findViewById(R.id.txt_food_name);
        this.k = (TextView) view.findViewById(R.id.txt_food_attrs);
        this.v = (TextView) view.findViewById(R.id.txt_food_present);
        this.w = (TextView) view.findViewById(R.id.txt_left_food_num);
        this.x = (TextView) view.findViewById(R.id.txt_food_activity_tag);
        this.y = view.findViewById(R.id.txt_food_line);
        this.z = (TextView) view.findViewById(R.id.txt_box_price);
        this.A = (TextView) view.findViewById(R.id.txt_box_price_desc);
        this.B = (ViewGroup) view.findViewById(R.id.layout_box_fee);
        this.C = (LinearLayout) view.findViewById(R.id.txt_product_label);
        this.b = (ImageView) view.findViewById(R.id.txt_promotion_label);
        this.D = (ViewGroup) view.findViewById(R.id.layout_hand_price_info);
        this.E = (TextView) view.findViewById(R.id.txt_hand_price);
        this.F = (TextView) view.findViewById(R.id.txt_hand_price_desc);
        this.G = (TextView) view.findViewById(R.id.duties_desc);
        this.H = (TextView) view.findViewById(R.id.txt_hand_price_tips);
    }

    private void a(List<String> list) {
        ImageView imageView;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4cfafc1c0873737ac25cdcd89ff2958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4cfafc1c0873737ac25cdcd89ff2958");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.C.setVisibility(8);
        } else {
            this.C.setVisibility(0);
            this.C.removeAllViews();
            for (String str : list) {
                Context context = this.C.getContext();
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab4e51b2149d6e87e400b63db7a71341", RobustBitConfig.DEFAULT_VALUE)) {
                    imageView = (ImageView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab4e51b2149d6e87e400b63db7a71341");
                } else {
                    imageView = new ImageView(context);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
                    marginLayoutParams.rightMargin = h.a(context, 4.0f);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setAdjustViewBounds(true);
                }
                m.a(str, ImageQualityUtil.b()).a(imageView);
                this.C.addView(imageView);
            }
        }
    }

    public static String a(OrderedFood orderedFood) {
        String[] split;
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aac6e9827640bbd7540fd451a60c3dc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aac6e9827640bbd7540fd451a60c3dc4");
        }
        if (orderedFood == null) {
            return "";
        }
        String picture = !t.a(orderedFood.sku.getPicture()) ? orderedFood.sku.getPicture() : orderedFood.spu.getPicture();
        return (t.a(picture) || (split = picture.split(CommonConstant.Symbol.COMMA)) == null || split.length <= 0) ? picture : split[0];
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9a77f221726b92dba0e0bd76b1577a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9a77f221726b92dba0e0bd76b1577a")).booleanValue() : (this.c != null && this.c.x()) || !(this.I == null || this.I.poiInformation == null || this.I.poiInformation.mPurchasedType != 1);
    }
}
