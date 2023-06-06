package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    protected final RecyclerView.LayoutManager b;
    public final Rect c;
    private int d;

    public abstract int a();

    public abstract int a(View view);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    private b(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd12dcf87f451a5d3f47214ba97244d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd12dcf87f451a5d3f47214ba97244d");
            return;
        }
        this.d = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = layoutManager;
    }
}
