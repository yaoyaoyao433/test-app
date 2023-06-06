package com.meituan.android.edfu.mbar.netservice;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c implements b {
    public static ChangeQuickRedirect a = null;
    private static String e = "c";
    public WeakReference<Context> b;
    public k c;
    public boolean d;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c283c3cb2f68822024ab40419e87b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c283c3cb2f68822024ab40419e87b5");
        } else {
            this.b = new WeakReference<>(context);
        }
    }
}
