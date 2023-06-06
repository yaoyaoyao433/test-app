package com.sankuai.waimai.drug.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.cart.f;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class b extends LinearLayout {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.order.a b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    ImageView d;
    TextView e;
    private com.sankuai.waimai.store.shopping.cart.contract.a f;
    private TextView g;

    public b(Context context, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(context, null);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b2b029b303628e1f4ee3a589fc4e39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b2b029b303628e1f4ee3a589fc4e39");
            return;
        }
        this.b = com.sankuai.waimai.store.order.a.e();
        this.f = aVar;
        this.c = aVar.g();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "821c29e5bb90c7573d5a292ac366b8d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "821c29e5bb90c7573d5a292ac366b8d1");
            return;
        }
        inflate(context, R.layout.wm_sc_shopcart_b2c_shop_cart, this);
        setId(R.id.b2c_shop_cart_item);
        this.d = (ImageView) findViewById(R.id.b2c_shopcart_top_img);
        this.e = (TextView) findViewById(R.id.b2c_shopcart_bottom_tv);
        this.g = (TextView) findViewById(R.id.b2c_shopcart_food_num_txt);
        setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.common.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bfc04a89ac6c6b23009f501421b5f41d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bfc04a89ac6c6b23009f501421b5f41d");
                } else if (b.this.f != null) {
                    b.this.f.k();
                }
            }
        });
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac2a67908cd31afc0995f87d8df7361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac2a67908cd31afc0995f87d8df7361");
            return;
        }
        super.onVisibilityChanged(view, i);
        if (view.getId() == getId() && i == 0) {
            f.a().a(this.d, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7fa3a9cadb2e91f2177de1d9be44a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7fa3a9cadb2e91f2177de1d9be44a5");
            return;
        }
        if (i > 99) {
            this.g.setTextSize(2, 6.0f);
            this.g.setText("···");
        } else {
            this.g.setTextSize(2, 10.0f);
            this.g.setText(String.valueOf(i));
        }
        this.g.setVisibility(i <= 0 ? 4 : 0);
    }
}
