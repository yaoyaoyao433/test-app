package com.dianping.widget.view;

import android.support.v4.view.PagerAdapter;
import com.dianping.widget.view.NovaViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class NovaPagerAdapter extends PagerAdapter implements NovaViewPager.a {
    public static ChangeQuickRedirect a;
    String b;
    com.dianping.judas.expose.c c;
    private final int d;
    private int e;

    public NovaPagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6433f5b2d15563d44286692f7ee321", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6433f5b2d15563d44286692f7ee321");
            return;
        }
        this.d = -1;
        this.e = 0;
        this.b = null;
    }
}
