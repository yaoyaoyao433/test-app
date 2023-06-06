package com.meituan.mmp.lib.api;

import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.engine.AppPage;
import com.meituan.mmp.lib.model.Event;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static j a(Event event, com.meituan.mmp.lib.interfaces.a aVar) {
        Object[] objArr = {event, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39effff635e24d114fb822a99b47057d", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39effff635e24d114fb822a99b47057d") : a(event, aVar, null, null);
    }

    public static j a(Event event, com.meituan.mmp.lib.interfaces.a aVar, ab abVar, com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {event, aVar, abVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        com.meituan.mmp.lib.trace.h hVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9e40d744a5eb987ec8184e2bd101bf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9e40d744a5eb987ec8184e2bd101bf2");
        }
        if (InternalApi.b(event.b)) {
            return new j(event);
        }
        Object[] objArr2 = {event};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c992515fe6e10f84662c46054b7d78d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c992515fe6e10f84662c46054b7d78d")).booleanValue() : event.b.startsWith("insert")) {
            if (abVar != null) {
                int a2 = InternalApi.a(event.a());
                com.meituan.mmp.lib.page.e a3 = abVar.a(a2);
                AppPage a4 = a3 != null ? a3.a(a2) : null;
                if (a4 != null) {
                    hVar2 = a4.r();
                }
            }
            return new l(event, aVar, hVar2 != null ? hVar2 : hVar);
        }
        return new i(event, aVar);
    }
}
