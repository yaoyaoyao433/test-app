package com.sankuai.waimai.store.util;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class o extends RecyclerView.k {
    public static ChangeQuickRedirect a;
    private boolean b;
    private a c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public o(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806d9c97e778362ed9f896be5e89cd47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806d9c97e778362ed9f896be5e89cd47");
            return;
        }
        this.b = false;
        this.c = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bcc86d8218fa2f29826666c0096287c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bcc86d8218fa2f29826666c0096287c");
            return;
        }
        switch (i) {
            case 0:
                this.b = false;
                return;
            case 1:
                if (this.b) {
                    return;
                }
                if (this.c != null) {
                    this.c.a();
                }
                this.b = true;
                com.sankuai.shangou.stone.util.log.a.a("JudasSlideRecyclerOnScrollListener", "滑动了", new Object[0]);
                return;
            case 2:
                this.b = false;
                return;
            default:
                return;
        }
    }
}
