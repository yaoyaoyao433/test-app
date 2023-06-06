package com.sankuai.waimai.launcher.provider.scheme;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.d;
import com.sankuai.waimai.foundation.utils.ab;
import com.sankuai.waimai.reactnative.WmRNActivity;
import com.sankuai.waimai.router.components.f;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final com.sankuai.waimai.router.utils.c b = new com.sankuai.waimai.router.utils.c("RegisterPage") { // from class: com.sankuai.waimai.launcher.provider.scheme.d.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.router.utils.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c070c15e2e9800d48aba4d7853fdbb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c070c15e2e9800d48aba4d7853fdbb2");
            } else {
                d.b();
            }
        }
    };

    public static /* synthetic */ void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "693615e2a37591f1c8a43341934f6cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "693615e2a37591f1c8a43341934f6cbb");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WMRouter", "register page...", new Object[0]);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c0f5eec6705ffe5001506347b55fd186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c0f5eec6705ffe5001506347b55fd186");
            return;
        }
        String str = com.sankuai.waimai.foundation.router.interfaces.c.V;
        Object[] objArr3 = {str, WmRNActivity.class};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.router.impl.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "dc50699e9bedf6f89db7a87fa68baa3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "dc50699e9bedf6f89db7a87fa68baa3a");
            return;
        }
        String str2 = com.sankuai.waimai.foundation.router.interfaces.b.d;
        Object[] objArr4 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect4 = ab.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "1e0756820ef5295853df7e6b45bce1ea", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "1e0756820ef5295853df7e6b45bce1ea");
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.startsWith(str2)) {
            str = str.substring(str2.length());
        }
        com.sankuai.waimai.foundation.router.impl.a.a().b.a(str, WmRNActivity.class, new i[0]);
    }

    public static void a(Context context) {
        i a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc89f269ec1848a913c4235e8dad6bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc89f269ec1848a913c4235e8dad6bbd");
            return;
        }
        com.sankuai.waimai.router.core.d.a(new f() { // from class: com.sankuai.waimai.launcher.provider.scheme.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.components.f
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a72dcafc6315cd22a8fd40875cbaaad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a72dcafc6315cd22a8fd40875cbaaad");
                    return;
                }
                super.a(th);
                com.sankuai.waimai.foundation.core.exception.a.b(th);
            }
        });
        com.sankuai.waimai.router.core.d.a(com.sankuai.meituan.takeoutnew.a.f);
        com.sankuai.waimai.router.core.d.b(com.sankuai.meituan.takeoutnew.a.f);
        com.sankuai.waimai.router.components.i.a(true);
        com.sankuai.waimai.foundation.router.interfaces.d.a(d.a.WM_APP);
        e eVar = new e();
        Object[] objArr2 = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.router.impl.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "613822a6a8997bae763dc61ba3d1e82c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "613822a6a8997bae763dc61ba3d1e82c");
        } else if (com.sankuai.waimai.foundation.router.impl.a.b == null) {
            com.sankuai.waimai.foundation.router.impl.a.b = eVar;
            if (com.sankuai.waimai.foundation.router.interfaces.d.a(context)) {
                com.sankuai.waimai.router.common.a aVar = new com.sankuai.waimai.router.common.a(context, com.sankuai.waimai.foundation.router.interfaces.b.a, com.sankuai.waimai.foundation.router.interfaces.b.b);
                com.sankuai.waimai.foundation.router.impl.a.c = aVar;
                com.sankuai.waimai.router.a.a(aVar);
            } else if (com.sankuai.waimai.foundation.router.interfaces.d.b(context)) {
                com.sankuai.waimai.foundation.router.impl.a.c = (com.sankuai.waimai.router.common.a) com.sankuai.waimai.router.a.c();
            } else if (com.sankuai.waimai.foundation.router.interfaces.d.c(context)) {
                com.sankuai.waimai.router.common.a aVar2 = new com.sankuai.waimai.router.common.a(context, "dianping", "waimai.dianping.com");
                com.sankuai.waimai.foundation.router.impl.a.c = aVar2;
                com.sankuai.waimai.router.a.a(aVar2);
            } else {
                com.sankuai.waimai.router.common.a aVar3 = new com.sankuai.waimai.router.common.a(context, com.sankuai.waimai.foundation.router.interfaces.b.a, com.sankuai.waimai.foundation.router.interfaces.b.b);
                com.sankuai.waimai.foundation.router.impl.a.c = aVar3;
                com.sankuai.waimai.router.a.a(aVar3);
            }
        }
        com.sankuai.waimai.router.common.a a3 = com.sankuai.waimai.foundation.router.impl.a.a();
        a3.a(new com.sankuai.waimai.platform.utils.lifecycle.b());
        a3.c.a(new com.sankuai.waimai.launcher.provider.scheme.interceptor.a());
        a3.a(new i() { // from class: com.sankuai.waimai.launcher.provider.scheme.d.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.core.i
            public final void a(@NonNull j jVar, @NonNull g gVar) {
                Object[] objArr3 = {jVar, gVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbf2e5b62b4bf7a8e23dd16d06a1ff29", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbf2e5b62b4bf7a8e23dd16d06a1ff29");
                    return;
                }
                d.b.b();
                gVar.a();
            }
        });
        com.sankuai.waimai.launcher.config.a a4 = com.sankuai.waimai.launcher.config.a.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.config.a.a;
        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "c4fe9203c5fe8460811991658c1a80fd", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (i) PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "c4fe9203c5fe8460811991658c1a80fd");
        } else {
            a2 = a4.b != null ? a4.b.a() : null;
        }
        a3.a(a2);
        a3.a(new com.sankuai.waimai.launcher.provider.scheme.interceptor.b());
        a3.a(new com.sankuai.waimai.platform.preload.b());
        a aVar4 = new a();
        Object[] objArr4 = {aVar4};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.foundation.router.impl.a.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9d59074d9eecb6d06ebef49733cf9914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9d59074d9eecb6d06ebef49733cf9914");
        } else {
            com.sankuai.waimai.foundation.router.impl.a.a().g = aVar4;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44c869a237bb681b5b7427f9ecc8da38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44c869a237bb681b5b7427f9ecc8da38");
            return;
        }
        com.sankuai.waimai.router.utils.c cVar = b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.router.utils.c.c;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "5e467bcfddf829dbf8f837ea0f894310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "5e467bcfddf829dbf8f837ea0f894310");
        } else {
            cVar.c();
        }
    }

    public static String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1072666723df8a1b7d4f05e6f6e27e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1072666723df8a1b7d4f05e6f6e27e3");
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = uri.getQueryParameter("inner_url");
        }
        return TextUtils.isEmpty(queryParameter) ? uri.getQueryParameter("web_url") : queryParameter;
    }

    public static boolean b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5056a8e63ffdfd369c67f5d8e3d34a1a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5056a8e63ffdfd369c67f5d8e3d34a1a")).booleanValue() : uri != null && "1".equals(uri.getQueryParameter("need_login"));
    }
}
