package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class w extends RecyclerView.f {
    private static final int[] a = {16843284};
    private Drawable b;
    private int c;
    private final Rect d = new Rect();

    public w(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.c = 1;
    }

    public final void a(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.b = drawable;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() == null || this.b == null) {
            return;
        }
        int i3 = 0;
        if (this.c == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                recyclerView.getDecoratedBoundsWithMargins(childAt, this.d);
                int round = this.d.bottom + Math.round(childAt.getTranslationY());
                this.b.setBounds(i2, round - this.b.getIntrinsicHeight(), width, round);
                this.b.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.d);
            int round2 = this.d.right + Math.round(childAt2.getTranslationX());
            this.b.setBounds(round2 - this.b.getIntrinsicWidth(), i, round2, height);
            this.b.draw(canvas);
            i3++;
        }
        canvas.restore();
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, this.b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.b.getIntrinsicWidth(), 0);
        }
    }
}
