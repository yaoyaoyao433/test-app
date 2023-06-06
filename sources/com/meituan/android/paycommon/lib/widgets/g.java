package com.meituan.android.paycommon.lib.widgets;

import android.os.SystemClock;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class g implements View.OnClickListener {
    public static ChangeQuickRedirect g;
    private long a;
    private boolean b;
    private long c;

    public abstract void a(View view);

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9707df682b3dc5cb5db72fc0a529f04b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9707df682b3dc5cb5db72fc0a529f04b");
            return;
        }
        this.a = 500L;
        this.b = false;
        this.c = 0L;
    }

    public final g a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcd0e390537b6ffd0c0403770694636", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcd0e390537b6ffd0c0403770694636");
        }
        this.a = j;
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25e0be6c58a7395c5428578f3aa29f0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25e0be6c58a7395c5428578f3aa29f0");
        } else if (!this.b || this.c <= 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.c > this.a) {
                this.c = elapsedRealtime;
                a(view);
            }
        }
    }
}
