package android.support.v7.widget;

import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class aj extends ar {
    @Nullable
    private ai b;
    @Nullable
    private ai c;

    @Override // android.support.v7.widget.ar
    @Nullable
    public int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
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
    @Nullable
    public View a(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return a(layoutManager, c(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return a(layoutManager, d(layoutManager));
        }
        return null;
    }

    @Override // android.support.v7.widget.ar
    public int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int position;
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (layoutManager.canScrollVertically()) {
            view = b(layoutManager, c(layoutManager));
        } else if (layoutManager.canScrollHorizontally()) {
            view = b(layoutManager, d(layoutManager));
        }
        if (view == null || (position = layoutManager.getPosition(view)) == -1) {
            return -1;
        }
        boolean z = false;
        boolean z2 = !layoutManager.canScrollHorizontally() ? i2 <= 0 : i <= 0;
        if ((layoutManager instanceof RecyclerView.p.b) && (computeScrollVectorForPosition = ((RecyclerView.p.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
            z = true;
        }
        return z ? z2 ? position - 1 : position : z2 ? position + 1 : position;
    }

    @Override // android.support.v7.widget.ar
    protected final ad b(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.p.b) {
            return new ad(this.a.getContext()) { // from class: android.support.v7.widget.aj.1
                @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
                protected final void onTargetFound(View view, RecyclerView.State state, RecyclerView.p.a aVar) {
                    int[] a = aj.this.a(aj.this.a.getLayoutManager(), view);
                    int i = a[0];
                    int i2 = a[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        aVar.a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // android.support.v7.widget.ad
                protected final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.support.v7.widget.ad
                public final int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }
            };
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

    @Nullable
    private static View b(RecyclerView.LayoutManager layoutManager, ai aiVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int a = aiVar.a(childAt);
            if (a < i) {
                view = childAt;
                i = a;
            }
        }
        return view;
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
