package android.support.v7.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ar extends RecyclerView.i {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.k c = new RecyclerView.k() { // from class: android.support.v7.widget.ar.1
        boolean a = false;

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                ar.this.a();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.k
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    };

    public abstract int a(RecyclerView.LayoutManager layoutManager, int i, int i2);

    @Nullable
    public abstract View a(RecyclerView.LayoutManager layoutManager);

    @Nullable
    public abstract int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view);

    @Override // android.support.v7.widget.RecyclerView.i
    public boolean onFling(int i, int i2) {
        ad b;
        int a;
        boolean z;
        RecyclerView.LayoutManager layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) {
            if (!(layoutManager instanceof RecyclerView.p.b) || (b = b(layoutManager)) == null || (a = a(layoutManager, i, i2)) == -1) {
                z = false;
            } else {
                b.setTargetPosition(a);
                layoutManager.startSmoothScroll(b);
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void a(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        if (this.a == recyclerView) {
            return;
        }
        if (this.a != null) {
            this.a.removeOnScrollListener(this.c);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (this.a != null) {
            if (this.a.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.addOnScrollListener(this.c);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            a();
        }
    }

    public final int[] a(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    final void a() {
        RecyclerView.LayoutManager layoutManager;
        View a;
        if (this.a == null || (layoutManager = this.a.getLayoutManager()) == null || (a = a(layoutManager)) == null) {
            return;
        }
        int[] a2 = a(layoutManager, a);
        if (a2[0] == 0 && a2[1] == 0) {
            return;
        }
        this.a.smoothScrollBy(a2[0], a2[1]);
    }

    @Nullable
    @Deprecated
    protected ad b(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.p.b) {
            return new ad(this.a.getContext()) { // from class: android.support.v7.widget.ar.2
                @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
                protected final void onTargetFound(View view, RecyclerView.State state, RecyclerView.p.a aVar) {
                    int[] a = ar.this.a(ar.this.a.getLayoutManager(), view);
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
            };
        }
        return null;
    }
}
