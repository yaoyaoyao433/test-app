package com.meituan.passport.base.argument;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b c;
    public Map<String, c> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19aa28d354628d042695f01168b9a469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19aa28d354628d042695f01168b9a469");
        } else {
            this.b = new HashMap();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a08e277d5349e6452d9c74b7899705c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a08e277d5349e6452d9c74b7899705c1");
        }
        if (c == null) {
            c = new b();
        }
        return c;
    }

    public final c a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22568d9b51e142c1f085ec358228540", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22568d9b51e142c1f085ec358228540");
        }
        c cVar = this.b.containsKey(str) ? this.b.get(str) : null;
        if (cVar == null) {
            c cVar2 = new c();
            this.b.put(str, cVar2);
            return cVar2;
        }
        return cVar;
    }

    public final void b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b095b5695fa6554e21e1c93357c07224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b095b5695fa6554e21e1c93357c07224");
        } else {
            this.b.remove(str);
        }
    }
}
