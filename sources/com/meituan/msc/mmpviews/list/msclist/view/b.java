package com.meituan.msc.mmpviews.list.msclist.view;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(int i);
    }

    public b(int i, int i2, a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bd28a6bcfcd6edd19ed0ce29b52e9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bd28a6bcfcd6edd19ed0ce29b52e9c");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        boolean z;
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04222cc168decfea4554118bf7964593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04222cc168decfea4554118bf7964593");
            return;
        }
        rect.left = this.b / 2;
        rect.right = this.b / 2;
        rect.bottom = 0;
        rect.top = this.c;
        int a2 = ((GridLayoutManager) recyclerView.getLayoutManager()).a();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        boolean z2 = this.d != null && this.d.a(childAdapterPosition);
        int a3 = ((GridLayoutManager.b) view.getLayoutParams()).a();
        if (z2) {
            rect.left = 0;
            rect.right = 0;
        } else {
            int i = a3 % a2;
            if (i == 0) {
                rect.left = 0;
            } else if (i == a2 - 1) {
                rect.right = 0;
            }
        }
        if (childAdapterPosition < a2) {
            int i2 = 0;
            while (true) {
                if (i2 >= childAdapterPosition) {
                    z = false;
                    break;
                } else if (this.d.a(i2)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return;
            }
            rect.top = 0;
        }
    }
}
