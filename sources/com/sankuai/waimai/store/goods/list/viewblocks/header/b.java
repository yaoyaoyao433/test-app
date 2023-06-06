package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends j {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j
    public int a() {
        return R.layout.wm_st_drug_compose_goods_list_layout_head_c;
    }

    public b(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, ViewGroup viewGroup) {
        super(dVar, viewGroup);
        Object[] objArr = {dVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f24a0b425c2bf5cfac2efd1d36a5b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f24a0b425c2bf5cfac2efd1d36a5b3");
        }
    }
}
