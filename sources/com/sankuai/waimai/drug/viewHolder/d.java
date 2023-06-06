package com.sankuai.waimai.drug.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.adapter.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.f, a.InterfaceC0932a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_shopcart_adapter_header_invaild;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* bridge */ /* synthetic */ void a(com.sankuai.waimai.drug.model.f fVar, int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19a967b8557448623e17e15597591bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19a967b8557448623e17e15597591bf");
        } else {
            ((TextView) view.findViewById(R.id.wm_st_shopcart_adapter_header_invaild_clear)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.viewHolder.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3de4ba5e066578ac80dd33d30416e30c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3de4ba5e066578ac80dd33d30416e30c");
                    } else if (d.this.o != null) {
                        ((a.InterfaceC0932a) d.this.o).a();
                    }
                }
            });
        }
    }
}
