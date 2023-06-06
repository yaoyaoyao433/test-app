package com.meituan.android.time.retrofit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static volatile a c = null;
    private static String d = "http://apimobile.meituan.com/";
    public ar b;

    private a(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "377c5a7c2e405246d590da20aa130a5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "377c5a7c2e405246d590da20aa130a5f");
        } else {
            this.b = new ar.a().a(d).a(interfaceC0637a).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
        }
    }

    public static a a(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4711de169f9dc4de94af3deefcbf9e8", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4711de169f9dc4de94af3deefcbf9e8");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a(interfaceC0637a);
                }
            }
        }
        return c;
    }
}
