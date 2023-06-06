package com.dianping.judas.util;

import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends WeakReference<View> {
    public static ChangeQuickRedirect a;
    private String b;

    public c(View view, String str) {
        super(view);
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6e2dd58cf36c31cce3300ba067b99e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6e2dd58cf36c31cce3300ba067b99e");
        } else {
            this.b = str;
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f41d8119e12171333e9205c1ab9ef8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f41d8119e12171333e9205c1ab9ef8")).intValue();
        }
        if (TextUtils.isEmpty(this.b)) {
            return 1;
        }
        return this.b.hashCode() + 31;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af47d54bdacb65b7897aa93ed50fc039", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af47d54bdacb65b7897aa93ed50fc039")).booleanValue();
        }
        if (obj instanceof c) {
            return TextUtils.equals(this.b, ((c) obj).b);
        }
        return false;
    }
}
