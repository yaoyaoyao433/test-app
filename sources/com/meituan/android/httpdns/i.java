package com.meituan.android.httpdns;

import android.content.Context;
import com.meituan.android.httpdns.IConfigInit;
import com.meituan.android.httpdns.h;
import com.meituan.android.httpdns.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public static String b;
    public static Context c;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b729d9896ed19ed17812ad3c640f609b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b729d9896ed19ed17812ad3c640f609b");
            return;
        }
        h.a().c = i;
        z.b = new z.a() { // from class: com.meituan.android.httpdns.i.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.httpdns.z.a
            public final Executor a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5dd4395732fc819bb68a8cc9e2813e2", 6917529027641081856L) ? (Executor) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5dd4395732fc819bb68a8cc9e2813e2") : com.sankuai.android.jarvis.c.b("mt-httpdns");
            }
        };
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        IConfigInit iConfigInit = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baff0352621bb43d58a9fcb4dc7aae97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baff0352621bb43d58a9fcb4dc7aae97");
            return;
        }
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ce905624811b1747a72e16970ae7499d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ce905624811b1747a72e16970ae7499d");
            return;
        }
        c = context.getApplicationContext();
        b = b(context, str);
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = k.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6506edd5baee3c167bc7cabbb02cfcfd", 6917529027641081856L)) {
            iConfigInit = (IConfigInit) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6506edd5baee3c167bc7cabbb02cfcfd");
        } else if (k.b != null) {
            iConfigInit = k.b;
        } else {
            if (!com.sankuai.meituan.serviceloader.b.a()) {
                com.sankuai.meituan.serviceloader.b.a(context);
            }
            List a2 = com.sankuai.meituan.serviceloader.b.a(IConfigInit.class, "ConfigInit");
            if (a2 != null && a2.size() > 0) {
                iConfigInit = (IConfigInit) a2.get(0);
            }
        }
        if (iConfigInit != null) {
            iConfigInit.a(context, b, new IConfigInit.a() { // from class: com.meituan.android.httpdns.i.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.httpdns.IConfigInit.a
                public final void a(h.a aVar) {
                    Object[] objArr4 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f8152e9ae39e2c0c6b2feab2186312a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f8152e9ae39e2c0c6b2feab2186312a");
                    } else if (aVar == null) {
                    } else {
                        h a3 = h.a();
                        Object[] objArr5 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "6466b78f969852ef59d78c60b24aa658", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "6466b78f969852ef59d78c60b24aa658");
                            return;
                        }
                        if (aVar != null) {
                            a3.b = aVar;
                        }
                        a3.d = System.currentTimeMillis();
                    }
                }
            });
        }
    }

    private static String b(Context context, String str) {
        int i;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ee84ff89132cbff1c650ae0aa630d1a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ee84ff89132cbff1c650ae0aa630d1a");
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            i = -1;
        }
        if (i == -1) {
            return l.a(c).b("httpdns_city_id", "-1");
        }
        l.a(c).a("httpdns_city_id", str);
        return str;
    }
}
