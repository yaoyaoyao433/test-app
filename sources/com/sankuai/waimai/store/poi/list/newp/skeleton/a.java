package com.sankuai.waimai.store.poi.list.newp.skeleton;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private final int b;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b097b016a290370e335a3d32fc8910", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b097b016a290370e335a3d32fc8910");
        } else {
            this.b = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, @NonNull RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f7099de68bc729eae1b25018da9432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f7099de68bc729eae1b25018da9432");
            return;
        }
        if (recyclerView.getChildLayoutPosition(view) % 2 == 0) {
            rect.right = this.b / 2;
        } else {
            rect.left = this.b / 2;
        }
        rect.bottom = this.b;
    }
}
