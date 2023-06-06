package com.meituan.android.mrn.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ae {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;

    public ae() {
    }

    public ae(String str, String str2) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a122a795f94d6ab53d50f757d08ae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a122a795f94d6ab53d50f757d08ae4");
            return;
        }
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f1b948844c946836b4840cf96b749f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f1b948844c946836b4840cf96b749f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae) {
            ae aeVar = (ae) obj;
            return TextUtils.equals(this.b, aeVar.b) && TextUtils.equals(this.c, aeVar.c);
        }
        return false;
    }
}
