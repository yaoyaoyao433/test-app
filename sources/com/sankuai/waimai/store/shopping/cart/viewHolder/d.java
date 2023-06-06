package com.sankuai.waimai.store.shopping.cart.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.shopping.cart.adapter.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends g<com.sankuai.waimai.store.platform.domain.core.order.a, a.InterfaceC1328a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_shopcart_adapter_header_invaild;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* bridge */ /* synthetic */ void a(com.sankuai.waimai.store.platform.domain.core.order.a aVar, int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636c8c8985da15cd7f5a4c7b06ce1de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636c8c8985da15cd7f5a4c7b06ce1de4");
        } else {
            ((TextView) view.findViewById(R.id.wm_st_shopcart_adapter_header_invaild_clear)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.shopping.cart.viewHolder.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59c663d8fcca7c48fa2e2c7284e24f8c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59c663d8fcca7c48fa2e2c7284e24f8c");
                    } else if (d.this.o != null) {
                        ((a.InterfaceC1328a) d.this.o).a();
                    }
                }
            });
        }
    }
}
