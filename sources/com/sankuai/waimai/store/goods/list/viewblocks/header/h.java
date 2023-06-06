package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.goods.list.base.d {
    public static ChangeQuickRedirect c;
    TextView d;

    public h(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9525a75a6c9bb6651fcc8f9ecc0a7cc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9525a75a6c9bb6651fcc8f9ecc0a7cc6");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4632ff2e7faeec0d8c213141797ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4632ff2e7faeec0d8c213141797ac1");
            return;
        }
        super.onViewCreated();
        this.d = (TextView) this.mView.findViewById(R.id.shop_name);
    }
}
