package com.meituan.android.legwork.common.user;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.legwork.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.login.user.b;
import java.util.HashMap;
import java.util.Map;
import rx.d;
import rx.j;
import rx.subscriptions.e;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();
    private Map<String, Object> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49ff312ec5a21d238c8492b921995fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49ff312ec5a21d238c8492b921995fb");
        } else {
            this.c = new HashMap(2);
        }
    }

    public static a a() {
        return b;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9274ed749e3187885d152f9f707818f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9274ed749e3187885d152f9f707818f3")).booleanValue() : com.sankuai.waimai.kit.login.user.c.a().b();
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa0606e204b11f62ac01e9c6b9a056f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa0606e204b11f62ac01e9c6b9a056f");
            return;
        }
        com.sankuai.waimai.kit.login.user.c.a(context);
        this.c.put("status", "start");
        q.a("legwork_login", 4, this.c);
    }

    public static /* synthetic */ void a(a aVar, final j jVar) {
        Object[] objArr = {aVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a74d1fb3fb179d7bca7ba3f743cb6503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a74d1fb3fb179d7bca7ba3f743cb6503");
            return;
        }
        com.sankuai.waimai.kit.login.user.b bVar = new com.sankuai.waimai.kit.login.user.b() { // from class: com.meituan.android.legwork.common.user.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.kit.login.user.b
            public final void a(b.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3822f49ecfee72c6eff628d453642cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3822f49ecfee72c6eff628d453642cd");
                } else if (jVar.isUnsubscribed()) {
                } else {
                    if (aVar2 == b.a.LOGIN) {
                        jVar.onNext(1);
                        a.this.c.put("status", "success");
                    } else if (aVar2 == b.a.CANCEL) {
                        jVar.onNext(2);
                        a.this.c.put("status", "error");
                    } else if (aVar2 == b.a.LOGOUT) {
                        jVar.onNext(3);
                        a.this.c.put("status", "logout");
                    } else {
                        jVar.onNext(-1);
                        a.this.c.put("status", "unknow");
                    }
                    q.a("legwork_login", 4, a.this.c);
                }
            }
        };
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        jVar.add(e.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc120d243dcc1be40d94baf7ddb35d3f", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc120d243dcc1be40d94baf7ddb35d3f") : new c(bVar)));
        com.sankuai.waimai.kit.login.user.c.a().a(bVar);
    }

    public static /* synthetic */ void a(com.sankuai.waimai.kit.login.user.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7b04af89a5a4c1bba05f4102537a3bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7b04af89a5a4c1bba05f4102537a3bb");
        } else {
            com.sankuai.waimai.kit.login.user.c.a().b(bVar);
        }
    }

    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39015b2c418bb11c39ebf65206397812", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39015b2c418bb11c39ebf65206397812")).longValue() : com.sankuai.waimai.kit.login.user.c.a().c();
    }

    @NonNull
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13cb32fec9d919089fd3375748a9ea0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13cb32fec9d919089fd3375748a9ea0") : com.sankuai.waimai.kit.login.user.c.a().e();
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f41a3ba7a80853635b4f5ea1d00c3e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f41a3ba7a80853635b4f5ea1d00c3e1") : com.sankuai.waimai.kit.login.user.c.a().d();
    }

    public final d<Integer> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149412de44529f2072afa608ee397330", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149412de44529f2072afa608ee397330");
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        return d.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a1f6d7c58cc06de6febe268a02799071", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a1f6d7c58cc06de6febe268a02799071") : new b(this));
    }
}
