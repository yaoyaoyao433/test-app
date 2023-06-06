package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ab implements Runnable {
    static final ThreadLocal<ab> a = new ThreadLocal<>();
    static Comparator<b> e = new Comparator<b>() { // from class: android.support.v7.widget.ab.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            if ((bVar3.d == null) != (bVar4.d == null)) {
                return bVar3.d == null ? 1 : -1;
            } else if (bVar3.a != bVar4.a) {
                return bVar3.a ? -1 : 1;
            } else {
                int i = bVar4.b - bVar3.b;
                if (i != 0) {
                    return i;
                }
                int i2 = bVar3.c - bVar4.c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
        }
    };
    long c;
    long d;
    ArrayList<RecyclerView> b = new ArrayList<>();
    private ArrayList<b> f = new ArrayList<>();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class b {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements RecyclerView.LayoutManager.a {
        int a;
        int b;
        int[] c;
        int d;

        final void a(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            if (this.c != null) {
                Arrays.fill(this.c, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.d()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.mState, this);
            }
            if (this.d > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = this.d;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.b();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager.a
        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d * 2;
            if (this.c == null) {
                this.c = new int[4];
                Arrays.fill(this.c, -1);
            } else if (i3 >= this.c.length) {
                int[] iArr = this.c;
                this.c = new int[i3 * 2];
                System.arraycopy(iArr, 0, this.c, 0, iArr.length);
            }
            this.c[i3] = i;
            this.c[i3 + 1] = i2;
            this.d++;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean a(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a() {
            if (this.c != null) {
                Arrays.fill(this.c, -1);
            }
            this.d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.c == 0) {
            this.c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a aVar = recyclerView.mPrefetchRegistry;
        aVar.a = i;
        aVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        b bVar;
        long j = 0;
        try {
            TraceCompat.beginSection("RV Prefetch");
            if (this.b.isEmpty()) {
                this.c = 0L;
                TraceCompat.endSection();
                return;
            }
            int size = this.b.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView2 = this.b.get(i);
                if (recyclerView2.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView2.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.c = 0L;
                TraceCompat.endSection();
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.d;
            int size2 = this.b.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                RecyclerView recyclerView3 = this.b.get(i3);
                if (recyclerView3.getWindowVisibility() == 0) {
                    recyclerView3.mPrefetchRegistry.a(recyclerView3, false);
                    i2 += recyclerView3.mPrefetchRegistry.d;
                }
            }
            this.f.ensureCapacity(i2);
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                RecyclerView recyclerView4 = this.b.get(i4);
                if (recyclerView4.getWindowVisibility() == 0) {
                    a aVar = recyclerView4.mPrefetchRegistry;
                    int abs = Math.abs(aVar.a) + Math.abs(aVar.b);
                    int i6 = i5;
                    for (int i7 = 0; i7 < aVar.d * 2; i7 += 2) {
                        if (i6 >= this.f.size()) {
                            bVar = new b();
                            this.f.add(bVar);
                        } else {
                            bVar = this.f.get(i6);
                        }
                        int i8 = aVar.c[i7 + 1];
                        try {
                            bVar.a = i8 <= abs;
                            bVar.b = abs;
                            bVar.c = i8;
                            bVar.d = recyclerView4;
                            bVar.e = aVar.c[i7];
                            i6++;
                        } catch (Throwable th) {
                            th = th;
                            j = 0;
                            this.c = j;
                            TraceCompat.endSection();
                            throw th;
                        }
                    }
                    i5 = i6;
                }
                i4++;
                j = 0;
            }
            Collections.sort(this.f, e);
            for (int i9 = 0; i9 < this.f.size(); i9++) {
                b bVar2 = this.f.get(i9);
                if (bVar2.d == null) {
                    break;
                }
                RecyclerView.s a2 = a(bVar2.d, bVar2.e, bVar2.a ? Long.MAX_VALUE : nanos);
                if (a2 != null && a2.mNestedRecyclerView != null && a2.isBound() && !a2.isInvalid() && (recyclerView = a2.mNestedRecyclerView.get()) != null) {
                    if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.b() != 0) {
                        recyclerView.removeAndRecycleViews();
                    }
                    a aVar2 = recyclerView.mPrefetchRegistry;
                    aVar2.a(recyclerView, true);
                    if (aVar2.d != 0) {
                        TraceCompat.beginSection("RV Nested Prefetch");
                        RecyclerView.State state = recyclerView.mState;
                        RecyclerView.a aVar3 = recyclerView.mAdapter;
                        state.d = 1;
                        state.e = aVar3.getItemCount();
                        state.g = false;
                        state.h = false;
                        state.i = false;
                        for (int i10 = 0; i10 < aVar2.d * 2; i10 += 2) {
                            a(recyclerView, aVar2.c[i10], nanos);
                        }
                        TraceCompat.endSection();
                    }
                }
                bVar2.a = false;
                bVar2.b = 0;
                bVar2.c = 0;
                bVar2.d = null;
                bVar2.e = 0;
            }
            this.c = 0L;
            TraceCompat.endSection();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static RecyclerView.s a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b2 = recyclerView.mChildHelper.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b2) {
                z = false;
                break;
            }
            RecyclerView.s childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.c(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.m mVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.s a2 = mVar.a(i, false, j);
            if (a2 != null) {
                if (a2.isBound() && !a2.isInvalid()) {
                    mVar.a(a2.itemView);
                } else {
                    mVar.a(a2, false);
                }
            }
            return a2;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
