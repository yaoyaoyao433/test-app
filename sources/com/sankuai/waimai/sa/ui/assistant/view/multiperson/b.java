package com.sankuai.waimai.sa.ui.assistant.view.multiperson;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private static final int[] c = {16843284};
    int b;
    private Drawable d;
    private int e;
    private int f;

    public b(Context context, int i, Drawable drawable) {
        Object[] objArr = {context, 1, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02940d9221e0b5236d1bdf3efa0afd1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02940d9221e0b5236d1bdf3efa0afd1f");
            return;
        }
        this.d = drawable;
        if (this.d == null) {
            this.d = new ColorDrawable(-1);
        }
        Object[] objArr2 = {1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a30caba9029852921bf2346ad17aa09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a30caba9029852921bf2346ad17aa09c");
        } else {
            this.f = 1;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
        int i;
        Object[] objArr = {canvas, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fe4fa74b9773f1dc52894e71765893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fe4fa74b9773f1dc52894e71765893");
        } else if (this.f != 1) {
            a(canvas, recyclerView);
        } else {
            Object[] objArr2 = {canvas, recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f78e64590e52c633af30588b5b4359a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f78e64590e52c633af30588b5b4359a");
                return;
            }
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                int bottom = childAt.getBottom() + ((RecyclerView.g) childAt.getLayoutParams()).bottomMargin + Math.round(ViewCompat.getTranslationY(childAt));
                this.d.setBounds(paddingLeft, bottom, width, b() + bottom);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (recyclerView.getAdapter().getItemViewType(childAdapterPosition) == 4 || recyclerView.getAdapter().getItemViewType(childAdapterPosition) == 3 || ((i = childAdapterPosition + 1) < recyclerView.getAdapter().getItemCount() && recyclerView.getAdapter().getItemViewType(i) == 2)) {
                    new ColorDrawable(-1).draw(canvas);
                } else {
                    this.d.draw(canvas);
                }
            }
        }
    }

    private void a(Canvas canvas, RecyclerView recyclerView) {
        Object[] objArr = {canvas, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e417536732ea8d06d7e2a22a3af377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e417536732ea8d06d7e2a22a3af377");
            return;
        }
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.g) childAt.getLayoutParams()).rightMargin + Math.round(ViewCompat.getTranslationX(childAt));
            this.d.setBounds(right, paddingTop, a() + right, height);
            this.d.draw(canvas);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        Object[] objArr = {rect, Integer.valueOf(i), recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9756521efc5ae4c74e1e8ff0e68453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9756521efc5ae4c74e1e8ff0e68453");
        } else if (this.f == 1) {
            rect.set(0, 0, 0, b());
        } else {
            rect.set(0, 0, a(), 0);
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2a327f76f7ea90dae43f3ed2c39369", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2a327f76f7ea90dae43f3ed2c39369")).intValue() : this.e > 0 ? this.e : this.d.getIntrinsicWidth();
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d997a893357a1099f376e5a735e88fe6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d997a893357a1099f376e5a735e88fe6")).intValue() : this.b > 0 ? this.b : this.d.getIntrinsicHeight();
    }
}
