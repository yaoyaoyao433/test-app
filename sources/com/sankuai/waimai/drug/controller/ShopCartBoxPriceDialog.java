package com.sankuai.waimai.drug.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.drug.adapter.b;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopCartBoxPriceDialog extends CustomDialog {
    public static ChangeQuickRedirect a;
    private View b;
    private RecyclerView c;
    private TextView d;
    private TextView e;
    private b f;

    public ShopCartBoxPriceDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_drug_shopcart_box_fee_detail_layout, (ViewGroup) null, false));
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f365a1b603758c5cad9a9ac1f2cfe422", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f365a1b603758c5cad9a9ac1f2cfe422");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ceaea7db3f614b7d786326497cec40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ceaea7db3f614b7d786326497cec40");
            return;
        }
        super.a(view);
        this.b = findViewById(R.id.iv_close_button);
        this.c = (RecyclerView) findViewById(R.id.box_fee_recyclerView);
        this.d = (TextView) findViewById(R.id.total_box_price);
        this.e = (TextView) findViewById(R.id.dialog_title);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.controller.ShopCartBoxPriceDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fff49167407c3bd46258f905a91efa0e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fff49167407c3bd46258f905a91efa0e");
                } else {
                    d.a(ShopCartBoxPriceDialog.this);
                }
            }
        });
        this.f = new b(getContext());
        this.c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.c.setAdapter(this.f);
    }

    public final void a(ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo) {
        Object[] objArr = {shopCartTotalBoxPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7115cb0769a34ba3710883a4c5d3072b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7115cb0769a34ba3710883a4c5d3072b");
        } else if (shopCartTotalBoxPriceInfo == null) {
        } else {
            b bVar = this.f;
            List<ShopCartTotalBoxPriceInfo.a> list = shopCartTotalBoxPriceInfo.boxPriceItems;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "de705bbdae91ad9397c16104256570ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "de705bbdae91ad9397c16104256570ab");
            } else {
                bVar.b = list;
                bVar.notifyDataSetChanged();
            }
            this.d.setText(shopCartTotalBoxPriceInfo.totalBoxPrice);
            this.e.setText(shopCartTotalBoxPriceInfo.totalBoxPriceTitle);
        }
    }
}
