package com.sankuai.waimai.drug.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.drug.adapter.a;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.widgets.StrikeTextView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.f, a.InterfaceC0932a> {
    public static ChangeQuickRedirect a;
    private TextView A;
    private TextView B;
    private ViewGroup C;
    private ViewGroup D;
    private TextView E;
    private TextView F;
    private TextView G;
    private TextView H;
    private TagCanvasView I;
    private View J;
    private g K;
    private View L;
    private View.OnClickListener M;
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
    private TextView l;
    private StrikeTextView m;
    private ImageView r;
    private TextView s;
    private ImageView t;
    private View u;
    private View v;
    private TextView w;
    private TextView x;
    private LinearLayout y;
    private TextView z;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shopcart_adapter_food_item;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09a4  */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.sankuai.waimai.drug.model.f r29, int r30) {
        /*
            Method dump skipped, instructions count: 2564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.drug.viewHolder.b.a(java.lang.Object, int):void");
    }

    public b(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCPageConfig sCPageConfig) {
        Object[] objArr = {aVar, sCPageConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42d3bf2495e5f11d9cfbbae7891ccbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42d3bf2495e5f11d9cfbbae7891ccbe");
            return;
        }
        this.M = new View.OnClickListener() { // from class: com.sankuai.waimai.drug.viewHolder.b.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcc1f77be3c4324655e9f3b230df7bfd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcc1f77be3c4324655e9f3b230df7bfd");
                } else if (view.getId() == R.id.layout_food_item) {
                    com.sankuai.waimai.store.drug.util.d.a(view.getContext(), ((OrderedFood) view.getTag()).spu, b.this.c.b);
                    com.sankuai.waimai.store.manager.judas.b.a(b.this.d.d, "b_mwhkm").a();
                }
            }
        };
        this.c = aVar;
        this.d = sCPageConfig;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "500254780ada7994dd5003b64e1659f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "500254780ada7994dd5003b64e1659f0");
            return;
        }
        this.e = view.findViewById(R.id.layout_food_item);
        this.u = view.findViewById(R.id.view_food_divider);
        this.v = view.findViewById(R.id.view_food_divider_bottom);
        this.f = (ImageView) view.findViewById(R.id.img_foodCount_dec);
        this.t = (ImageView) view.findViewById(R.id.img_shopcart_member);
        this.r = (ImageView) view.findViewById(R.id.img_food_pic);
        this.g = (TextView) view.findViewById(R.id.txt_foodCount_number);
        this.s = (TextView) view.findViewById(R.id.txt_food_price_unit);
        this.h = (ImageView) view.findViewById(R.id.img_foodCount_add);
        this.i = (TextView) view.findViewById(R.id.txt_food_price);
        this.m = (StrikeTextView) view.findViewById(R.id.txt_food_original_price);
        this.j = (TextView) view.findViewById(R.id.txt_food_name);
        this.k = (TextView) view.findViewById(R.id.txt_food_attrs);
        this.w = (TextView) view.findViewById(R.id.txt_food_present);
        this.x = (TextView) view.findViewById(R.id.last_good_number_text);
        this.y = (LinearLayout) view.findViewById(R.id.last_good_number_container);
        this.z = (TextView) view.findViewById(R.id.txt_food_activity_tag);
        this.A = (TextView) view.findViewById(R.id.txt_box_price);
        this.B = (TextView) view.findViewById(R.id.txt_box_price_desc);
        this.C = (ViewGroup) view.findViewById(R.id.layout_box_fee);
        this.b = (ImageView) view.findViewById(R.id.txt_promotion_label);
        this.D = (ViewGroup) view.findViewById(R.id.layout_hand_price_info);
        this.E = (TextView) view.findViewById(R.id.txt_hand_price);
        this.F = (TextView) view.findViewById(R.id.txt_hand_price_desc);
        this.G = (TextView) view.findViewById(R.id.duties_desc);
        this.H = (TextView) view.findViewById(R.id.txt_hand_price_tips);
        this.I = (TagCanvasView) view.findViewById(R.id.tag_below_of_name);
        this.J = view.findViewById(R.id.layout_member_info);
        this.L = view.findViewById(R.id.view_food_count);
        this.l = (TextView) view.findViewById(R.id.txt_food_activity_text);
        this.K = new g(view.findViewById(R.id.update_price));
    }

    private boolean a(ShopCartItem shopCartItem) {
        Object[] objArr = {shopCartItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8346ff86c292e33814d1edc8d75c6a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8346ff86c292e33814d1edc8d75c6a0")).booleanValue() : (shopCartItem == null || t.a(b(shopCartItem))) ? false : true;
    }

    private String b(@NonNull ShopCartItem shopCartItem) {
        Object[] objArr = {shopCartItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210b680ce214cdc31d7b2314a9f68630", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210b680ce214cdc31d7b2314a9f68630") : shopCartItem.priceAB == null ? "" : shopCartItem.priceAB.get("price_update_group");
    }
}
