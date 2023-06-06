package com.sankuai.waimai.platform.restaurant.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private int b;

    public b(int i, Context context) {
        Object[] objArr = {8, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead4e073a63b14a1964ace10f1eda114", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead4e073a63b14a1964ace10f1eda114");
        } else {
            this.b = g.a(context, 8.0f);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42328e28c0b03fef9c55696f8fcc70bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42328e28c0b03fef9c55696f8fcc70bc");
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (childAdapterPosition == 0) {
            rect.top = 0;
            rect.bottom = this.b / 2;
        } else if (childAdapterPosition == itemCount - 1) {
            rect.top = this.b / 2;
            rect.bottom = 0;
        } else {
            rect.top = this.b / 2;
            rect.bottom = this.b / 2;
        }
    }
}
