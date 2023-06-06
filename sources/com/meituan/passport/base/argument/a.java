package com.meituan.passport.base.argument;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public c b;
    private boolean c;
    private String d;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907abbd8dac250246734ef77fa99aebc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907abbd8dac250246734ef77fa99aebc");
            return;
        }
        this.c = false;
        this.b = new c();
        this.d = str;
    }
}
