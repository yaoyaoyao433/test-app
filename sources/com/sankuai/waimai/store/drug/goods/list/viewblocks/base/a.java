package com.sankuai.waimai.store.drug.goods.list.viewblocks.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.base.e;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.newwidgets.FloatingWindowLayout;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends e {
    public static ChangeQuickRedirect n;

    public void a(RecyclerView.k kVar) {
    }

    public void a(FloatingWindowLayout floatingWindowLayout) {
    }

    public void a(RestMenuResponse restMenuResponse) {
    }

    public boolean h() {
        return false;
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eca21526aca0f80a4fefe93e48cf1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eca21526aca0f80a4fefe93e48cf1a9");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbf365e65ad6a68dd717e6466269e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbf365e65ad6a68dd717e6466269e01");
        }
    }

    public a(@NonNull c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9ed68729bd835606999b1bf4fe113e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9ed68729bd835606999b1bf4fe113e");
        }
    }
}
