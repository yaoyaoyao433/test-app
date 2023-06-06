package com.sankuai.waimai.platform.widget.common;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g extends RecyclerView.k {
    public static ChangeQuickRedirect c = null;
    public static String d = "EndlessScrollListener";
    private int a;
    int e;
    boolean f;
    int g;
    int h;
    int i;
    int j;

    public abstract void a(int i);

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff1b721076a0cbc19aed9509dfb8b57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff1b721076a0cbc19aed9509dfb8b57");
            return;
        }
        this.e = 0;
        this.f = true;
        this.a = 0;
        this.j = 1;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int childCount;
        int itemCount;
        int findFirstVisibleItemPosition;
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7659bb191fe3d1f2dfbc87ab89c51594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7659bb191fe3d1f2dfbc87ab89c51594");
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        Object[] objArr2 = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.modular.utils.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d8a13b23bb1d9f6f2ecd2f9f33de1484", RobustBitConfig.DEFAULT_VALUE)) {
            childCount = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d8a13b23bb1d9f6f2ecd2f9f33de1484")).intValue();
        } else {
            LinearLayoutManager a = com.sankuai.waimai.platform.modular.utils.a.a(recyclerView);
            childCount = a != null ? a.getChildCount() : 0;
        }
        this.h = childCount;
        Object[] objArr3 = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.modular.utils.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a025dcd558aebe91b8851edd5ce44840", RobustBitConfig.DEFAULT_VALUE)) {
            itemCount = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a025dcd558aebe91b8851edd5ce44840")).intValue();
        } else {
            LinearLayoutManager a2 = com.sankuai.waimai.platform.modular.utils.a.a(recyclerView);
            itemCount = a2 != null ? a2.getItemCount() : 0;
        }
        this.i = itemCount;
        Object[] objArr4 = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.modular.utils.a.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a8f2c07c9dc426827611c08f70271c93", RobustBitConfig.DEFAULT_VALUE)) {
            findFirstVisibleItemPosition = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a8f2c07c9dc426827611c08f70271c93")).intValue();
        } else {
            LinearLayoutManager a3 = com.sankuai.waimai.platform.modular.utils.a.a(recyclerView);
            findFirstVisibleItemPosition = a3 != null ? a3.findFirstVisibleItemPosition() : 0;
        }
        this.g = findFirstVisibleItemPosition;
        if (this.f && this.i > this.e) {
            this.f = false;
            this.e = this.i;
            com.sankuai.waimai.foundation.utils.log.a.e("LoadMore", "totalItemCount=" + this.i + ",previousTotal=" + this.e, new Object[0]);
        }
        if (this.f || this.i - this.h > this.g + this.a) {
            return;
        }
        this.f = true;
        this.j++;
        com.sankuai.waimai.foundation.utils.log.a.e("LoadMore", "Trigger LoadMore::currentPage=" + this.j, new Object[0]);
        a(this.j);
    }
}
