package com.meituan.msc.modules.api.auth;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect d;
    protected String e;
    protected boolean f;
    public boolean g;

    public c() {
    }

    public c(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f90e78f87a2753751cee0a2a14ad447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f90e78f87a2753751cee0a2a14ad447");
            return;
        }
        this.e = str;
        this.f = z;
    }

    public static boolean a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b124d3a68a778be3e31ee8ad65bfa0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b124d3a68a778be3e31ee8ad65bfa0e")).booleanValue() : "scope.userLocationBackground".equals(cVar.e);
    }
}
