package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ai {
    protected final RecyclerView.LayoutManager a;
    int b;
    final Rect c;

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public abstract int h();

    private ai(RecyclerView.LayoutManager layoutManager) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = layoutManager;
    }

    public final int a() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return e() - this.b;
    }

    public static ai a(RecyclerView.LayoutManager layoutManager, int i) {
        switch (i) {
            case 0:
                return a(layoutManager);
            case 1:
                return b(layoutManager);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }

    public static ai a(RecyclerView.LayoutManager layoutManager) {
        return new ai(layoutManager) { // from class: android.support.v7.widget.ai.1
            @Override // android.support.v7.widget.ai
            public final int c() {
                return this.a.getWidth() - this.a.getPaddingRight();
            }

            @Override // android.support.v7.widget.ai
            public final int d() {
                return this.a.getWidth();
            }

            @Override // android.support.v7.widget.ai
            public final void a(int i) {
                this.a.offsetChildrenHorizontal(i);
            }

            @Override // android.support.v7.widget.ai
            public final int b() {
                return this.a.getPaddingLeft();
            }

            @Override // android.support.v7.widget.ai
            public final int e(View view) {
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                return this.a.getDecoratedMeasuredWidth(view) + gVar.leftMargin + gVar.rightMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int f(View view) {
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                return this.a.getDecoratedMeasuredHeight(view) + gVar.topMargin + gVar.bottomMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int b(View view) {
                return this.a.getDecoratedRight(view) + ((RecyclerView.g) view.getLayoutParams()).rightMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int a(View view) {
                return this.a.getDecoratedLeft(view) - ((RecyclerView.g) view.getLayoutParams()).leftMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int c(View view) {
                this.a.getTransformedBoundingBox(view, true, this.c);
                return this.c.right;
            }

            @Override // android.support.v7.widget.ai
            public final int d(View view) {
                this.a.getTransformedBoundingBox(view, true, this.c);
                return this.c.left;
            }

            @Override // android.support.v7.widget.ai
            public final int e() {
                return (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
            }

            @Override // android.support.v7.widget.ai
            public final int f() {
                return this.a.getPaddingRight();
            }

            @Override // android.support.v7.widget.ai
            public final int g() {
                return this.a.getWidthMode();
            }

            @Override // android.support.v7.widget.ai
            public final int h() {
                return this.a.getHeightMode();
            }
        };
    }

    public static ai b(RecyclerView.LayoutManager layoutManager) {
        return new ai(layoutManager) { // from class: android.support.v7.widget.ai.2
            @Override // android.support.v7.widget.ai
            public final int c() {
                return this.a.getHeight() - this.a.getPaddingBottom();
            }

            @Override // android.support.v7.widget.ai
            public final int d() {
                return this.a.getHeight();
            }

            @Override // android.support.v7.widget.ai
            public final void a(int i) {
                this.a.offsetChildrenVertical(i);
            }

            @Override // android.support.v7.widget.ai
            public final int b() {
                return this.a.getPaddingTop();
            }

            @Override // android.support.v7.widget.ai
            public final int e(View view) {
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                return this.a.getDecoratedMeasuredHeight(view) + gVar.topMargin + gVar.bottomMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int f(View view) {
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                return this.a.getDecoratedMeasuredWidth(view) + gVar.leftMargin + gVar.rightMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int b(View view) {
                return this.a.getDecoratedBottom(view) + ((RecyclerView.g) view.getLayoutParams()).bottomMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int a(View view) {
                return this.a.getDecoratedTop(view) - ((RecyclerView.g) view.getLayoutParams()).topMargin;
            }

            @Override // android.support.v7.widget.ai
            public final int c(View view) {
                this.a.getTransformedBoundingBox(view, true, this.c);
                return this.c.bottom;
            }

            @Override // android.support.v7.widget.ai
            public final int d(View view) {
                this.a.getTransformedBoundingBox(view, true, this.c);
                return this.c.top;
            }

            @Override // android.support.v7.widget.ai
            public final int e() {
                return (this.a.getHeight() - this.a.getPaddingTop()) - this.a.getPaddingBottom();
            }

            @Override // android.support.v7.widget.ai
            public final int f() {
                return this.a.getPaddingBottom();
            }

            @Override // android.support.v7.widget.ai
            public final int g() {
                return this.a.getHeightMode();
            }

            @Override // android.support.v7.widget.ai
            public final int h() {
                return this.a.getWidthMode();
            }
        };
    }
}
