package com.meituan.passport.plugins;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static r d;
    String b;
    public rx.d<String> c;

    public static r a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202be743f2d7c1f5d327a0a74230af79", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202be743f2d7c1f5d327a0a74230af79");
        }
        if (d == null) {
            d = new r();
        }
        return d;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d5ef316ccdf0fa9f585f416b5e264d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d5ef316ccdf0fa9f585f416b5e264d") : a(com.meituan.android.singleton.b.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd6a7a77b884cd47426fc7ce5c970be", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd6a7a77b884cd47426fc7ce5c970be");
        }
        this.b = GetUUID.getInstance().getUUID(context);
        return this.b != null ? this.b : "";
    }
}
