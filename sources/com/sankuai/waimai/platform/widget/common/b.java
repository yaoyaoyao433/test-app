package com.sankuai.waimai.platform.widget.common;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    int b;
    private SparseArray<View> c;

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "518643673e43daeb9cfd3c51042ffbc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "518643673e43daeb9cfd3c51042ffbc4");
        } else {
            this.c = new SparseArray<>();
        }
    }

    public static b a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16e8962c4358552a6f887291b4e6f0e6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16e8962c4358552a6f887291b4e6f0e6") : new b(view);
    }

    public final <T extends View> T a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e323732b10c745761da6044474a3da5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e323732b10c745761da6044474a3da5a");
        }
        T t = (T) this.c.get(i);
        if (t == null) {
            T t2 = (T) this.itemView.findViewById(i);
            this.c.put(i, t2);
            return t2;
        }
        return t;
    }
}
