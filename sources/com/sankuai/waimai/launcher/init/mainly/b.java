package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.android.common.statistics.cat.CatMonitorService;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.router.set_id.b;
import com.sankuai.waimai.router.set_id.setIdRequest.SetIdRequest;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "ApiRouter";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        String str;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a0666227281358716730ae71bf225ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a0666227281358716730ae71bf225ed");
            return;
        }
        final com.sankuai.waimai.router.set_id.b a2 = com.sankuai.waimai.router.set_id.b.a();
        StringBuilder sb = new StringBuilder();
        com.sankuai.waimai.platform.net.c a3 = com.sankuai.waimai.platform.net.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.c.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "7e7f44f1321be1d9288b86857e9701ff", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "7e7f44f1321be1d9288b86857e9701ff");
        } else if (!a3.a(com.sankuai.waimai.platform.net.c.b, a3.m.b)) {
            str = a3.m.b;
        } else {
            str = com.sankuai.waimai.platform.net.c.d;
        }
        sb.append(str);
        sb.append(com.sankuai.waimai.platform.net.util.f.a);
        String sb2 = sb.toString();
        a.InterfaceC0637a a4 = com.meituan.android.singleton.i.a("oknv");
        Object[] objArr3 = {application, sb2, a4};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.router.set_id.b.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "2b0cdc4c5b619c29807ed6cef3955aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "2b0cdc4c5b619c29807ed6cef3955aa4");
        } else if (a2.d == null) {
            ar a5 = new ar.a().a(sb2).a(a4).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
            Object[] objArr4 = {application, a5};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.router.set_id.b.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "8fb05507ed5661cf7f1f059ff8c6221e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "8fb05507ed5661cf7f1f059ff8c6221e");
            } else if (a2.d == null) {
                SetIdRequest setIdRequest = (SetIdRequest) a5.a(SetIdRequest.class);
                Object[] objArr5 = {application, setIdRequest};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.router.set_id.b.a;
                if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "e7ddae700cdcf26c2feefece647c181c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "e7ddae700cdcf26c2feefece647c181c");
                } else if (a2.d == null) {
                    a2.d = application;
                    a2.c = setIdRequest;
                    if (UserCenter.getInstance(application).isLogin()) {
                        Object[] objArr6 = {application};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.router.set_id.a.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "55359b8468c2b551fa600bc39f09cef6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "55359b8468c2b551fa600bc39f09cef6");
                        } else if (com.sankuai.waimai.router.set_id.a.a(application).b("region_id", (String) null) == null) {
                            SharedPreferences sharedPreferences = application.getSharedPreferences("share_setid", 0);
                            if (!TextUtils.isEmpty(sharedPreferences.getString("region_id", null))) {
                                com.meituan.android.cipstorage.x.a(com.sankuai.waimai.router.set_id.a.a(application), com.meituan.android.cipstorage.u.f, "share_setid");
                                sharedPreferences.edit().clear().apply();
                            }
                        }
                        a2.d();
                    } else {
                        a2.c();
                    }
                    UserCenter.getInstance(application).loginEventObservable().c(new rx.functions.b<UserCenter.c>() { // from class: com.sankuai.waimai.router.set_id.b.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(UserCenter.c cVar) {
                            UserCenter.c cVar2 = cVar;
                            Object[] objArr7 = {cVar2};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "96df4c5dcb60a719b98a235c28e19e23", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "96df4c5dcb60a719b98a235c28e19e23");
                            } else if (cVar2.b == UserCenter.d.login) {
                                a2.d();
                            } else if (cVar2.b == UserCenter.d.logout) {
                                a2.c();
                            }
                        }
                    });
                    if (application.getApplicationContext() instanceof Application) {
                        ((Application) application.getApplicationContext()).registerActivityLifecycleCallbacks(new b.a());
                    }
                }
            }
        }
        Object[] objArr7 = {11};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.router.set_id.b.a;
        if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "7afc921858c80d840545ab040f3cf614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "7afc921858c80d840545ab040f3cf614");
        } else {
            a2.b = new CatMonitorService(a2.d, 11);
        }
    }
}
