package com.meituan.msc.modules.api.msi.components.coverview;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    boolean b;
    private final com.meituan.msc.modules.api.msi.e c;
    private final MSCCoverViewTouchHelper d;
    private Runnable e;
    private volatile boolean f;

    public h(com.meituan.msc.modules.api.msi.e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383ab00404a15f73b39c8e45a8663204", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383ab00404a15f73b39c8e45a8663204");
            return;
        }
        this.b = true;
        this.e = new Runnable() { // from class: com.meituan.msc.modules.api.msi.components.coverview.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ec5af31004dbe2a370ddac30363a46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ec5af31004dbe2a370ddac30363a46");
                } else if (h.this.f) {
                    h.this.c.a("onLongPress", null);
                }
            }
        };
        this.f = false;
        this.c = eVar;
        this.d = new MSCCoverViewTouchHelper(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.api.msi.components.coverview.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
