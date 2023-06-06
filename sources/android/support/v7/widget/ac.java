package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ac {
    int b;
    int c;
    int d;
    int e;
    boolean h;
    boolean i;
    boolean a = true;
    int f = 0;
    int g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(RecyclerView.State state) {
        return this.c >= 0 && this.c < state.c();
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
