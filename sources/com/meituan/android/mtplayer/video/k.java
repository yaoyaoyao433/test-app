package com.meituan.android.mtplayer.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private int h;
    private int i;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562c6550817306f72ad4a8c4ac3b4c17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562c6550817306f72ad4a8c4ac3b4c17");
        } else {
            this.g = 0;
        }
    }

    public final void a(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0122, code lost:
        if (r1 > r14) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.video.k.b(int, int):void");
    }
}
