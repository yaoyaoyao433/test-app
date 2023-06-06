package uk.co.senab.photoview.scrollerproxy;

import android.content.Context;
import android.widget.Scroller;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c extends d {
    private final Scroller a;

    public c(Context context) {
        this.a = new Scroller(context);
    }

    @Override // uk.co.senab.photoview.scrollerproxy.d
    public final boolean a() {
        return this.a.computeScrollOffset();
    }

    @Override // uk.co.senab.photoview.scrollerproxy.d
    public final void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // uk.co.senab.photoview.scrollerproxy.d
    public final void a(boolean z) {
        this.a.forceFinished(true);
    }

    @Override // uk.co.senab.photoview.scrollerproxy.d
    public final boolean b() {
        return this.a.isFinished();
    }

    @Override // uk.co.senab.photoview.scrollerproxy.d
    public final int c() {
        return this.a.getCurrX();
    }

    @Override // uk.co.senab.photoview.scrollerproxy.d
    public final int d() {
        return this.a.getCurrY();
    }
}
