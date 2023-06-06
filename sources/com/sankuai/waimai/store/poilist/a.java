package com.sankuai.waimai.store.poilist;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends RecyclerView.k {
    public static ChangeQuickRedirect c;
    private int a;
    private int b;
    private int d;
    private int e;
    private boolean f;

    public abstract void a(int i);

    public abstract void b(int i);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b55269141fb10d0f99bd009bf4c0e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b55269141fb10d0f99bd009bf4c0e6");
            return;
        }
        this.d = -1;
        this.e = -1;
        this.f = false;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ccbe339cbf379c2d0b2295de55eea67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ccbe339cbf379c2d0b2295de55eea67");
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.d = linearLayoutManager.findFirstVisibleItemPosition();
            this.e = linearLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            this.d = staggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0];
            this.e = staggeredGridLayoutManager.findLastVisibleItemPositions(null)[0];
        }
        if (recyclerView.getLayoutManager().getItemCount() != 0) {
            if (this.d == this.b) {
                int a = a(recyclerView);
                int abs = Math.abs(this.a - a);
                if (!this.f) {
                    if (this.a > a) {
                        a(abs);
                    } else if (this.a < a) {
                        b(abs);
                    }
                } else {
                    this.f = false;
                }
                this.a = a;
                return;
            }
            if (!this.f) {
                if (this.d > this.b) {
                    a(Integer.MAX_VALUE);
                } else {
                    b(Integer.MAX_VALUE);
                }
            } else {
                this.f = false;
            }
            this.a = a(recyclerView);
            this.b = this.d;
        }
    }

    private int a(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5964a44c23f7ed1046a3554aaf74c28b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5964a44c23f7ed1046a3554aaf74c28b")).intValue();
        }
        if (recyclerView == null || recyclerView.getChildAt(0) == null) {
            return 0;
        }
        return recyclerView.getChildAt(0).getTop();
    }
}
