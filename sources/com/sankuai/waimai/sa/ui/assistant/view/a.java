package com.sankuai.waimai.sa.ui.assistant.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
    private static final int[] h = {16843284};
    public int b;
    public int c;
    public int d;
    private Context e;
    private Paint f;
    private int g;
    private boolean i;

    private a(@NonNull Context context, int i, boolean z) {
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01206af295815a2bab5214164b10a38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01206af295815a2bab5214164b10a38");
            return;
        }
        this.g = 2;
        this.b = 0;
        this.c = 0;
        this.i = false;
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("param orientation error ! ");
        }
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.e = context;
        this.d = i;
        this.i = z;
        context.obtainStyledAttributes(h).recycle();
    }

    public a(@NonNull Context context, int i, int i2, boolean z) {
        this(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671d16fd1629022bf2c6caf30875edac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671d16fd1629022bf2c6caf30875edac");
        } else {
            this.g = i2;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        Object[] objArr = {rect, Integer.valueOf(i), recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ab9677ffa145cc81525073e6c900ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ab9677ffa145cc81525073e6c900ce");
            return;
        }
        int itemCount = recyclerView.getAdapter().getItemCount() - 1;
        if (this.d == 1) {
            if (i == 0) {
                rect.set(0, this.i ? this.b > 0 ? this.b : this.g : 0, 0, this.g);
            } else if (i == itemCount) {
                rect.set(0, 0, 0, this.c > 0 ? this.c : this.g);
            } else {
                rect.set(0, 0, 0, this.g);
            }
        } else if (i == 0) {
            rect.set(this.i ? this.b > 0 ? this.b : this.g : 0, 0, this.g, 0);
        } else if (i == itemCount) {
            rect.set(0, 0, this.c > 0 ? this.c : this.g, 0);
        } else {
            rect.set(0, 0, this.g, 0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
        int i = 0;
        Object[] objArr = {canvas, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b4c76d34481440a3b8efa4ef0b3e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b4c76d34481440a3b8efa4ef0b3e46");
        } else if (this.d == 1) {
            Object[] objArr2 = {canvas, recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41428fed0685b92dc3832a5e452a1d40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41428fed0685b92dc3832a5e452a1d40");
                return;
            }
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.g gVar = (RecyclerView.g) childAt.getLayoutParams();
                if (this.i && i == 0) {
                    int top = childAt.getTop() - gVar.topMargin;
                    int i2 = top - (this.b > 0 ? this.b : this.g);
                    if (this.f != null) {
                        canvas.drawRect(paddingLeft, i2, measuredWidth, top, this.f);
                    }
                }
                int bottom = childAt.getBottom() + gVar.bottomMargin;
                int i3 = ((i != childCount + (-1) || this.c <= 0) ? this.g : this.c) + bottom;
                if (this.f != null) {
                    canvas.drawRect(paddingLeft, bottom, measuredWidth, i3, this.f);
                }
                i++;
            }
        } else {
            Object[] objArr3 = {canvas, recyclerView};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da9d5057b6460bb2371bc583f536113a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da9d5057b6460bb2371bc583f536113a");
                return;
            }
            int paddingTop = recyclerView.getPaddingTop();
            int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            while (i < childCount2) {
                View childAt2 = recyclerView.getChildAt(i);
                RecyclerView.g gVar2 = (RecyclerView.g) childAt2.getLayoutParams();
                if (this.i && i == 0) {
                    int left = childAt2.getLeft() - gVar2.leftMargin;
                    int i4 = left - (this.b > 0 ? this.b : this.g);
                    if (this.f != null) {
                        canvas.drawRect(i4, paddingTop, left, measuredHeight, this.f);
                    }
                }
                int right = childAt2.getRight() + gVar2.rightMargin;
                int i5 = ((i != childCount2 + (-1) || this.c <= 0) ? this.g : this.c) + right;
                if (this.f != null) {
                    canvas.drawRect(right, paddingTop, i5, measuredHeight, this.f);
                }
                i++;
            }
        }
    }
}
