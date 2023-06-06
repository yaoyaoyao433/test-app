package com.sankuai.waimai.store.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends FrameLayout {
    public static ChangeQuickRedirect a;
    boolean b;
    boolean c;
    boolean d;
    private int e;
    private RecyclerView.s f;

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50106faac49afb0895be40c9365f439f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50106faac49afb0895be40c9365f439f");
            return;
        }
        this.d = false;
        this.e = 0;
    }

    public final void setUpwardSticky(boolean z) {
        this.b = z;
    }

    public final void setDownwardSticky(boolean z) {
        this.c = z;
    }

    public final void setSpecialScroller(boolean z) {
        this.d = z;
    }

    public final int getOffset() {
        return this.e;
    }

    public final void setOffset(int i) {
        this.e = i;
    }

    public final void setViewHolder(RecyclerView.s sVar) {
        this.f = sVar;
    }

    public final RecyclerView.s getViewHolder() {
        return this.f;
    }
}
