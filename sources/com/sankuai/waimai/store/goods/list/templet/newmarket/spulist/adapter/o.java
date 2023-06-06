package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SaleOutRemind;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class o extends com.sankuai.waimai.store.newwidgets.list.g<k, j> {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_poi_market_adapter_sold_out_button;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(k kVar, int i) {
        SaleOutRemind saleOutRemind;
        final k kVar2 = kVar;
        Object[] objArr = {kVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7569d25386511394888521dce700b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7569d25386511394888521dce700b1");
        } else if (kVar2 == null || kVar2.b == null || (saleOutRemind = kVar2.b.saleOutRemind) == null) {
        } else {
            ((j) this.o).a(this.p);
            if (!TextUtils.isEmpty(saleOutRemind.msg)) {
                this.b.setText(saleOutRemind.msg);
            }
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.o.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e67b4a95439b662137f5343fe8a6a8f1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e67b4a95439b662137f5343fe8a6a8f1");
                    } else {
                        ((j) o.this.o).c(kVar2.b);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8957754fd984e58f80f5bba57c6e8a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8957754fd984e58f80f5bba57c6e8a2c");
            return;
        }
        com.sankuai.waimai.store.view.a a2 = com.sankuai.waimai.store.view.a.a(view.getContext(), R.dimen.wm_sc_common_dimen_7, R.dimen.wm_sc_common_dimen_4, R.color.wm_sg_color_c9c5c2, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.DOWN);
        this.b = (TextView) view.findViewById(R.id.sold_out_button);
        this.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
    }
}
