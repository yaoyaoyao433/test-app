package com.sankuai.waimai.store.newwidgets.list;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    @Nullable
    Drawable b;
    int c;
    int d;
    int e;
    int f;
    private final Rect g;
    @NonNull
    private final a h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        int getFooterCount();
    }

    public j(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2435e55e5ceefecb42acacb147090b2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2435e55e5ceefecb42acacb147090b2c");
            return;
        }
        this.c = -1;
        this.g = new Rect();
        this.e = 0;
        this.f = 0;
        this.h = aVar;
    }

    public final void a(int i) {
        if (i >= 0) {
            this.d = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int i;
        int i2;
        int width;
        int i3 = 0;
        Object[] objArr = {canvas, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51211317fd54515c85207eef2ac19655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51211317fd54515c85207eef2ac19655");
        } else if (recyclerView.getLayoutManager() == null || this.b == null) {
        } else {
            if (this.c != 1) {
                Object[] objArr2 = {canvas, recyclerView};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f39e5f64d9163622da01f1da70c7b76e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f39e5f64d9163622da01f1da70c7b76e");
                    return;
                } else if (this.b == null) {
                    return;
                } else {
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        i = recyclerView.getPaddingTop();
                        height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                        canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                    } else {
                        height = recyclerView.getHeight();
                        i = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    while (i3 < childCount) {
                        View childAt = recyclerView.getChildAt(i3);
                        recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.g);
                        int round = this.g.right + Math.round(childAt.getTranslationX());
                        this.b.setBounds(round - this.d, i, round, height);
                        this.b.draw(canvas);
                        i3++;
                    }
                    canvas.restore();
                    return;
                }
            }
            Object[] objArr3 = {canvas, recyclerView};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "293a2ffdc4cb15fb0c4ee75e3e7f185a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "293a2ffdc4cb15fb0c4ee75e3e7f185a");
            } else if (this.b == null) {
            } else {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i2 = recyclerView.getPaddingLeft() + this.e;
                    width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f;
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i2 = this.e;
                    width = recyclerView.getWidth() - this.f;
                }
                int childCount2 = recyclerView.getChildCount();
                int footerCount = this.h.getFooterCount();
                int i4 = footerCount > 0 ? childCount2 - footerCount : childCount2 - 1;
                while (i3 < i4) {
                    View childAt2 = recyclerView.getChildAt(i3);
                    recyclerView.getDecoratedBoundsWithMargins(childAt2, this.g);
                    int round2 = this.g.bottom + Math.round(childAt2.getTranslationY());
                    this.b.setBounds(i2, round2 - this.d, width, round2);
                    this.b.draw(canvas);
                    i3++;
                }
                canvas.restore();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3434100e37a051162fb948b5a8da90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3434100e37a051162fb948b5a8da90");
        } else if (this.b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, this.d);
        } else {
            rect.set(0, 0, this.d, 0);
        }
    }
}
