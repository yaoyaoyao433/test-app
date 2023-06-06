package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

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
public final class h extends com.sankuai.waimai.store.newwidgets.list.g<e, d> {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_poi_market_adapter_sold_out_button;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(e eVar, int i) {
        SaleOutRemind saleOutRemind;
        final e eVar2 = eVar;
        Object[] objArr = {eVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b8798c3c35428bc22619096cb0d363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b8798c3c35428bc22619096cb0d363");
        } else if (eVar2 == null || eVar2.b == null || (saleOutRemind = eVar2.b.saleOutRemind) == null) {
        } else {
            ((d) this.o).a(this.p);
            if (!TextUtils.isEmpty(saleOutRemind.msg)) {
                this.b.setText(saleOutRemind.msg);
            }
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.h.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c26a5dc499ffd832116039b701d1aff0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c26a5dc499ffd832116039b701d1aff0");
                    } else {
                        ((d) h.this.o).c(eVar2.b);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50f12642f63215b9206f2c3d73bd4f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50f12642f63215b9206f2c3d73bd4f45");
            return;
        }
        com.sankuai.waimai.store.view.a a2 = com.sankuai.waimai.store.view.a.a(view.getContext(), R.dimen.wm_sc_common_dimen_7, R.dimen.wm_sc_common_dimen_4, R.color.wm_sg_color_c9c5c2, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.DOWN);
        this.b = (TextView) view.findViewById(R.id.sold_out_button);
        this.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
    }
}
