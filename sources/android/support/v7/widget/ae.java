package android.support.v7.widget;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ae extends ar {
    @Nullable
    private ai b;
    @Nullable
    private ai c;

    @Override // android.support.v7.widget.ar
    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(layoutManager, view, d(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(layoutManager, view, c(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // android.support.v7.widget.ar
    public final int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View a;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(layoutManager instanceof RecyclerView.p.b) || (itemCount = layoutManager.getItemCount()) == 0 || (a = a(layoutManager)) == null || (position = layoutManager.getPosition(a)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.p.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            i4 = a(layoutManager, d(layoutManager), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i5 = a(layoutManager, c(layoutManager), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = position + i4;
        if (i6 < 0) {
            i6 = 0;
        }
        return i6 >= itemCount ? i3 : i6;
    }

    @Override // android.support.v7.widget.ar
    public final View a(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return a(layoutManager, c(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return a(layoutManager, d(layoutManager));
        }
        return null;
    }

    private static int a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, ai aiVar) {
        int d;
        int a = aiVar.a(view) + (aiVar.e(view) / 2);
        if (layoutManager.getClipToPadding()) {
            d = aiVar.b() + (aiVar.e() / 2);
        } else {
            d = aiVar.d() / 2;
        }
        return a - d;
    }

    private int a(RecyclerView.LayoutManager layoutManager, ai aiVar, int i, int i2) {
        int[] a = a(i, i2);
        float b = b(layoutManager, aiVar);
        if (b <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(a[0]) > Math.abs(a[1]) ? a[0] : a[1]) / b);
    }

    @Nullable
    private static View a(RecyclerView.LayoutManager layoutManager, ai aiVar) {
        int d;
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            d = aiVar.b() + (aiVar.e() / 2);
        } else {
            d = aiVar.d() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((aiVar.a(childAt) + (aiVar.e(childAt) / 2)) - d);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    private static float b(RecyclerView.LayoutManager layoutManager, ai aiVar) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MAX_VALUE;
        View view2 = null;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i) {
                    view = childAt;
                    i = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(aiVar.b(view), aiVar.b(view2)) - Math.min(aiVar.a(view), aiVar.a(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i2 - i) + 1);
    }

    @NonNull
    private ai c(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (this.b == null || this.b.a != layoutManager) {
            this.b = ai.b(layoutManager);
        }
        return this.b;
    }

    @NonNull
    private ai d(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (this.c == null || this.c.a != layoutManager) {
            this.c = ai.a(layoutManager);
        }
        return this.c;
    }
}
