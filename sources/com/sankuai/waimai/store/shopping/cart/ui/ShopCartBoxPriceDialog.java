package com.sankuai.waimai.store.shopping.cart.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopCartBoxPriceDialog extends CustomDialog {
    public static ChangeQuickRedirect a;
    private TextView b;
    private View c;
    private TextView d;
    private TextView e;
    private RecyclerView f;
    private TextView h;
    private com.sankuai.waimai.store.shopping.cart.adapter.b i;
    private RelativeLayout j;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;

    public ShopCartBoxPriceDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_shopcart_box_fee_detail_layout, (ViewGroup) null, false));
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b52d992645ccda8923a0a41d57a3c521", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b52d992645ccda8923a0a41d57a3c521");
            return;
        }
        Window window = getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.gravity = 80;
        attributes.width = -1;
        window.setAttributes(attributes);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68babf0291b315e805f59a76341480c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68babf0291b315e805f59a76341480c1");
            return;
        }
        super.a(view);
        this.c = findViewById(R.id.iv_close_button);
        this.d = (TextView) findViewById(R.id.tv_spu_box_fee_name);
        this.e = (TextView) findViewById(R.id.tv_spu_box_fee_price);
        this.f = (RecyclerView) findViewById(R.id.box_fee_recyclerView);
        this.h = (TextView) findViewById(R.id.total_box_price);
        this.b = (TextView) findViewById(R.id.dialog_title);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.ui.ShopCartBoxPriceDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02ad4472b66da790c6db37706d75a8bf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02ad4472b66da790c6db37706d75a8bf");
                } else {
                    com.sankuai.waimai.store.util.d.a(ShopCartBoxPriceDialog.this);
                }
            }
        });
        this.i = new com.sankuai.waimai.store.shopping.cart.adapter.b(getContext());
        this.f.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f.setAdapter(this.i);
        this.j = (RelativeLayout) findViewById(R.id.rl_order_bag_container);
        this.m = (TextView) findViewById(R.id.tv_vag_name);
        this.n = (TextView) findViewById(R.id.tv_bag_tips);
        this.o = (TextView) findViewById(R.id.tv_order_bag_price);
        this.p = (TextView) findViewById(R.id.tv_bag_explain);
    }

    public final void a(ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo) {
        Object[] objArr = {shopCartTotalBoxPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd6a4b5a7ffc5999bc7e112bcf543cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd6a4b5a7ffc5999bc7e112bcf543cb");
        } else if (shopCartTotalBoxPriceInfo == null || !shopCartTotalBoxPriceInfo.isPackingFeeValued()) {
        } else {
            c(shopCartTotalBoxPriceInfo);
            d(shopCartTotalBoxPriceInfo);
            b(shopCartTotalBoxPriceInfo);
        }
    }

    private void b(@NonNull ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo) {
        Object[] objArr = {shopCartTotalBoxPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fffc11f5ac625ed78721a78bd55113e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fffc11f5ac625ed78721a78bd55113e");
            return;
        }
        this.b.setText(shopCartTotalBoxPriceInfo.totalBoxPriceTitle);
        if (!t.a(shopCartTotalBoxPriceInfo.activityTotalOrderBoxPrice) && !TextUtils.equals(shopCartTotalBoxPriceInfo.activityTotalOrderBoxPrice, "0")) {
            u.a(this.h, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_coupon_purchase_original_unit, shopCartTotalBoxPriceInfo.activityTotalOrderBoxPrice));
        } else {
            u.a(this.h, shopCartTotalBoxPriceInfo.totalBoxPrice);
        }
    }

    private void c(@NonNull ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo) {
        Object[] objArr = {shopCartTotalBoxPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f171799146a3bd0286d16c907454322b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f171799146a3bd0286d16c907454322b");
        } else if (com.sankuai.shangou.stone.util.a.b(shopCartTotalBoxPriceInfo.boxPriceItems)) {
            u.c(this.d);
            u.c(this.f);
            u.c(this.e);
        } else {
            if (t.a(shopCartTotalBoxPriceInfo.totalBoxPriceSubtitle)) {
                u.c(this.d);
                u.c(this.e);
            } else {
                u.a(this.d, shopCartTotalBoxPriceInfo.totalBoxPriceSubtitle);
                u.a(this.e, shopCartTotalBoxPriceInfo.totalBoxPrice);
            }
            this.i.a(shopCartTotalBoxPriceInfo.boxPriceItems);
        }
    }

    private void d(@NonNull ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo) {
        Object[] objArr = {shopCartTotalBoxPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78afb982a2d92f776a3f81582b64dfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78afb982a2d92f776a3f81582b64dfdf");
        } else if (t.a(shopCartTotalBoxPriceInfo.explainText)) {
            u.c(this.j);
        } else {
            String str = shopCartTotalBoxPriceInfo.explainIcon;
            String str2 = shopCartTotalBoxPriceInfo.explainTextPre;
            int a2 = com.sankuai.shangou.stone.util.d.a(shopCartTotalBoxPriceInfo.explainTextPreColor, com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_26BF66));
            u.a(this.j);
            u.a(this.m, shopCartTotalBoxPriceInfo.packingBagPriceSubtitle);
            u.a(this.n, shopCartTotalBoxPriceInfo.packingBagPriceSubtitleSuffix);
            if (!t.a(shopCartTotalBoxPriceInfo.activityPackingBagPrice)) {
                u.a(this.o, com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_coupon_purchase_original_unit, shopCartTotalBoxPriceInfo.activityPackingBagPrice));
            }
            SpannableString spannableString = new SpannableString(str2 + StringUtil.SPACE + shopCartTotalBoxPriceInfo.explainText);
            spannableString.setSpan(new ForegroundColorSpan(a2), 0, str2.length(), 33);
            com.sankuai.waimai.store.view.standard.a.a(this.p, spannableString, str, 1, h.a(getContext(), 4.0f));
            this.p.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_F7F7F7)).a((float) h.a(getContext(), 6.0f)).a());
        }
    }
}
