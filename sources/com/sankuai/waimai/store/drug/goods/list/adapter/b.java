package com.sankuai.waimai.store.drug.goods.list.adapter;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.k {
    public static ChangeQuickRedirect a;
    final List<RecyclerView.k> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1ae1406f7bddf8c884ea9bef96cd0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1ae1406f7bddf8c884ea9bef96cd0e");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a469d725d0415151894e21ca7411a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a469d725d0415151894e21ca7411a19");
            return;
        }
        for (RecyclerView.k kVar : this.b) {
            kVar.onScrollStateChanged(recyclerView, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b3bb40529e137cbf6ad9135c21472bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b3bb40529e137cbf6ad9135c21472bd");
            return;
        }
        for (RecyclerView.k kVar : this.b) {
            kVar.onScrolled(recyclerView, i, i2);
        }
    }
}
