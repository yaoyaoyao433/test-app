package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.stepper.RooStepper;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.business.restaurant.base.manager.order.g b;
    String c;
    com.sankuai.waimai.business.restaurant.base.shopcart.b d;
    ViewGroup e;
    Activity f;
    private a.InterfaceC1128a g;

    public g(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
        String str;
        Object[] objArr = {activity, gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b2033720dfa9fc1de11c397e1a7094", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b2033720dfa9fc1de11c397e1a7094");
            return;
        }
        this.g = new a.InterfaceC1128a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.ui.g.a.InterfaceC1128a
            public final void a(int i, ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product) {
                Object[] objArr2 = {Integer.valueOf(i), product};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8e36c5ad2d5971e17e0f93c77c23188", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8e36c5ad2d5971e17e0f93c77c23188");
                    return;
                }
                JudasManualManager.b("b_waimai_5w740hhf_mc", g.this.c, g.this.f).a();
                if (g.this.d == null || g.this.d.v == null || g.this.d.v.getPoiCartFloatingLayerMemberInfo() == null) {
                    return;
                }
                List<ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product> list = g.this.d.v.getPoiCartFloatingLayerMemberInfo().products;
                if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                    return;
                }
                ShopCartMemberInfo.MemberVpParam memberVpParam = new ShopCartMemberInfo.MemberVpParam();
                ArrayList arrayList = new ArrayList();
                for (ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product2 : list) {
                    if (product2 != null) {
                        ShopCartMemberInfo.ProductParam productParam = new ShopCartMemberInfo.ProductParam();
                        productParam.productId = String.valueOf(product2.productId);
                        if (TextUtils.equals(productParam.productId, String.valueOf(product.productId))) {
                            productParam.selected = !product2.selected ? 1 : 0;
                        } else {
                            productParam.selected = product2.selected ? 1 : 0;
                        }
                        productParam.type = product2.productType;
                        arrayList.add(productParam);
                    }
                }
                memberVpParam.productParams = arrayList;
                g.this.d.v.setSelfDelivery(g.this.b.k ? 1 : 0);
                g.this.d.v.setMemberVpParam(memberVpParam);
                com.sankuai.waimai.business.restaurant.base.manager.order.k.a().b(g.this.b.f(), (com.sankuai.waimai.business.restaurant.base.shopcart.e) null);
            }
        };
        this.b = gVar;
        this.f = activity;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fad29ac69e8748aa6ec90d9af77e260e", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fad29ac69e8748aa6ec90d9af77e260e");
        } else {
            str = "";
            if (aVar.a()) {
                str = "c_CijEL";
            } else if (aVar.b()) {
                str = "c_u4fk4kw";
            } else if (aVar.e()) {
                str = "c_1b9anm4";
            } else if (aVar.d()) {
                str = "c_5y4tc0m";
            }
        }
        this.c = str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fcd79e3a3a519fa6658ff0c716f9feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fcd79e3a3a519fa6658ff0c716f9feb");
        } else if (this.b.u() && !this.b.a()) {
            b();
        } else {
            this.e.setVisibility(8);
        }
    }

    public final void b() {
        ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo poiCartFloatingLayerMemberInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac4faa57e21cac1a3a365001d824c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac4faa57e21cac1a3a365001d824c2e");
            return;
        }
        this.e.setVisibility(8);
        if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
            return;
        }
        this.d = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.b.f());
        if (this.d == null || this.d.v == null || (poiCartFloatingLayerMemberInfo = this.d.v.getPoiCartFloatingLayerMemberInfo()) == null || com.sankuai.waimai.foundation.utils.d.a(poiCartFloatingLayerMemberInfo.products)) {
            return;
        }
        c();
        ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product = null;
        a.b bVar = new a.b();
        bVar.a = poiCartFloatingLayerMemberInfo.bizIcon;
        int i = 0;
        while (true) {
            if (i >= poiCartFloatingLayerMemberInfo.products.size()) {
                break;
            }
            ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product2 = poiCartFloatingLayerMemberInfo.products.get(i);
            if (product2.selected) {
                product = product2;
                break;
            }
            i++;
        }
        if (product != null) {
            this.e.setVisibility(0);
            a(poiCartFloatingLayerMemberInfo, bVar, product, 0);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b21119e7ae3c87e5cc87e389095dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b21119e7ae3c87e5cc87e389095dd5");
        } else {
            this.e.removeAllViews();
        }
    }

    private void a(ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo poiCartFloatingLayerMemberInfo, a.b bVar, @Nonnull ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product, int i) {
        Object[] objArr = {poiCartFloatingLayerMemberInfo, bVar, product, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe727d0a990f24fb47018035badbc6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe727d0a990f24fb47018035badbc6e");
            return;
        }
        View inflate = View.inflate(this.f, product.productType == 13 ? R.layout.wm_shopcart_member_info_item_new : R.layout.wm_shopcart_member_info_item, null);
        a aVar = new a(inflate, bVar);
        aVar.e = 0;
        aVar.c = this.g;
        aVar.a(poiCartFloatingLayerMemberInfo, product);
        inflate.setTag(aVar);
        this.e.addView(aVar.d);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product b;
        InterfaceC1128a c;
        View d;
        int e;
        private RooStepper f;
        private Context g;
        private ImageView h;
        private TextView i;
        private View j;
        private TextView k;
        private TextView l;
        private b m;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.restaurant.shopcart.ui.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC1128a {
            void a(int i, ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class b {
            String a;

            public b() {
            }
        }

        public a(View view, b bVar) {
            Object[] objArr = {view, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe680affb003ed22dc516bc397dc772", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe680affb003ed22dc516bc397dc772");
                return;
            }
            this.d = view;
            this.g = view.getContext();
            this.m = bVar;
            this.h = (ImageView) view.findViewById(R.id.img_product_icon);
            this.i = (TextView) view.findViewById(R.id.txt_product_title);
            this.j = view.findViewById(R.id.img_member_explanation);
            this.k = (TextView) view.findViewById(R.id.txt_product_desc);
            this.l = (TextView) view.findViewById(R.id.txt_select_tip);
            this.f = (RooStepper) view.findViewById(R.id.roo_stepper);
            this.f.setDecListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.g.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ae3609237664d137b3a4ec828bc1aaf", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ae3609237664d137b3a4ec828bc1aaf");
                    } else if (a.this.c != null) {
                        a.this.c.a(a.this.e, a.this.b);
                    }
                }
            });
            this.f.setIncEnable(false);
        }

        public final void a(final ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo poiCartFloatingLayerMemberInfo, final ShopCartMemberInfo.PoiCartFloatingLayerMemberInfo.Product product) {
            Object[] objArr = {poiCartFloatingLayerMemberInfo, product};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ddc260924815519c6f8a5704c427e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ddc260924815519c6f8a5704c427e2");
                return;
            }
            this.b = product;
            this.f.a(1);
            if (product.productType == 13) {
                ah.a(this.l, com.sankuai.waimai.business.restaurant.base.util.e.a(poiCartFloatingLayerMemberInfo.productCommonDesc, "#FF4A26"), this.g.getString(R.string.wm_shopcart_member_select_tip));
                ah.a(this.i, com.sankuai.waimai.business.restaurant.base.util.e.a(poiCartFloatingLayerMemberInfo.bizTitle, "#FF3C26"), this.g.getString(R.string.wm_shopcart_member_title_new));
                ah.a(this.k, com.sankuai.waimai.business.restaurant.base.util.e.a(poiCartFloatingLayerMemberInfo.bizDesc, "#FF3C26"), this.g.getString(R.string.wm_shopcart_member_desc_new));
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.g;
                a2.i = R.drawable.cart_member_tip_icon;
                a2.j = R.drawable.cart_member_tip_icon;
                a2.c = poiCartFloatingLayerMemberInfo.bizIcon;
                a2.a(this.h);
                if (!TextUtils.isEmpty(poiCartFloatingLayerMemberInfo.bizAgreementDesc)) {
                    this.j.setVisibility(0);
                    this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.g.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52f55f8f0869111176866b98786cd8eb", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52f55f8f0869111176866b98786cd8eb");
                            } else {
                                com.sankuai.waimai.platform.utils.m.a(a.this.d, poiCartFloatingLayerMemberInfo.bizAgreementDesc);
                            }
                        }
                    });
                    return;
                }
                this.j.setVisibility(8);
                return;
            }
            if (product.bizProductData != null) {
                ah.a(this.l, com.sankuai.waimai.business.restaurant.base.util.e.a(product.bizProductData.selectedTip, "#FF4A26"), this.g.getString(R.string.wm_shopcart_member_select_tip));
            }
            ah.a(this.i, com.sankuai.waimai.business.restaurant.base.util.e.a(product.productTitle, "#FF4A26"), this.g.getString(R.string.wm_shopcart_member_title));
            ah.a(this.k, com.sankuai.waimai.business.restaurant.base.util.e.a(product.productDesc, "#FF4A26"), this.g.getString(R.string.wm_shopcart_member_desc));
            if (this.m != null) {
                if (!TextUtils.isEmpty(this.m.a)) {
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = this.g;
                    a3.i = R.drawable.cart_member_tip_icon;
                    a3.j = R.drawable.cart_member_tip_icon;
                    a3.c = this.m.a;
                    a3.a(this.h);
                } else {
                    this.h.setImageResource(R.drawable.cart_member_tip_icon);
                }
            }
            if (!TextUtils.isEmpty(product.agreementDesc)) {
                this.j.setVisibility(0);
                this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.g.a.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f9fa4f9997e0e37dd361b49e7a82ff5", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f9fa4f9997e0e37dd361b49e7a82ff5");
                        } else {
                            com.sankuai.waimai.platform.utils.m.a(a.this.d, product.agreementDesc);
                        }
                    }
                });
                return;
            }
            this.j.setVisibility(8);
        }
    }
}
