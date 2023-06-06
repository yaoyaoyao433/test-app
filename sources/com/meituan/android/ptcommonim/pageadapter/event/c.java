package com.meituan.android.ptcommonim.pageadapter.event;

import android.view.View;
import com.meituan.android.ptcommonim.pageadapter.event.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c<T extends b> {
    public static ChangeQuickRedirect a;
    private final T b;

    public abstract boolean a(View view, T t);

    public c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8806a812dd9bfbfb53e628da70fb1174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8806a812dd9bfbfb53e628da70fb1174");
        } else {
            this.b = t;
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86e4f00c4cc94462f0a6666cecb9029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86e4f00c4cc94462f0a6666cecb9029");
        } else {
            a(view, this.b);
        }
    }
}
