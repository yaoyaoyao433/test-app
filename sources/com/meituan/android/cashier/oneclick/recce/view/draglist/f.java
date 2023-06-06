package com.meituan.android.cashier.oneclick.recce.view.draglist;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;

    public f(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d64152933ac34fa0834d63d71f7a59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d64152933ac34fa0834d63d71f7a59");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013a005ead18d127afbbe7357c38be63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013a005ead18d127afbbe7357c38be63");
            return;
        }
        rect.left = this.b;
        rect.right = this.c;
        rect.bottom = this.d;
        if (recyclerView.getChildPosition(view) == 0) {
            rect.top = this.e;
        }
    }
}
