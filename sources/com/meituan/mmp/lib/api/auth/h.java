package com.meituan.mmp.lib.api.auth;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h {
    public static ChangeQuickRedirect d;
    protected String e;
    protected boolean f;
    public boolean g;

    public h() {
    }

    public h(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18cc71c0a5c1fad1f1d5b8191996f394", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18cc71c0a5c1fad1f1d5b8191996f394");
            return;
        }
        this.e = str;
        this.f = z;
    }

    public static boolean a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee9873aeac972a3029952ff851d7718f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee9873aeac972a3029952ff851d7718f")).booleanValue() : "scope.userLocationBackground".equals(hVar.e);
    }
}
