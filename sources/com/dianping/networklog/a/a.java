package com.dianping.networklog.a;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final Map<Integer, Integer> b;
    final Map<Integer, Integer> c;

    @SuppressLint({"UseSparseArrays"})
    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ce37679b204863a19148bbd3ffd138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ce37679b204863a19148bbd3ffd138");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
    }
}
