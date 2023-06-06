package com.sankuai.meituan.riverrunplayer.views;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    WeakReference<View> b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;

    public a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23aa4dd13f7d0380be6ff16d2cca96ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23aa4dd13f7d0380be6ff16d2cca96ef");
            return;
        }
        this.j = 0;
        this.b = new WeakReference<>(view);
    }

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final void b(int i, int i2) {
        this.e = i;
        this.f = i2;
    }
}
