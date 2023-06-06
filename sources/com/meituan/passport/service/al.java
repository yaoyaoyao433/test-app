package com.meituan.passport.service;

import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.handler.a;
import com.meituan.passport.handler.resume.l;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class al extends ag<com.meituan.passport.pojo.request.g<String>, User> {
    public static ChangeQuickRedirect a;
    @Nullable
    private String b;
    @Nullable
    private String c;
    @Nullable
    private String i;
    private String j;
    private String k;

    public al(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabdc3e0bc8f48669bd0ce64edd3498b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabdc3e0bc8f48669bd0ce64edd3498b");
            return;
        }
        this.b = str;
        this.c = str2;
        this.i = str3;
        this.k = str4;
        this.j = str5;
    }

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6ec504f26728d94677c45e14214f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6ec504f26728d94677c45e14214f4d");
            return;
        }
        FragmentActivity c = c();
        if (c == null) {
            return;
        }
        rx.d<T> a2 = com.meituan.passport.utils.v.a(new rx.functions.h<String, String, rx.d<User>>() { // from class: com.meituan.passport.service.al.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.h
            public final /* synthetic */ rx.d<User> a(String str, String str2) {
                String str3 = str2;
                Object[] objArr2 = {str, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "571cd1ddaef9a6b8408f376549381e61", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "571cd1ddaef9a6b8408f376549381e61") : com.meituan.passport.utils.s.b().userReopen(((com.meituan.passport.pojo.request.g) al.this.e).c(), (String) ((com.meituan.passport.pojo.request.g) al.this.e).b.b(), "", "", str3);
            }
        });
        l.a<User> aVar = new l.a<User>() { // from class: com.meituan.passport.service.al.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.handler.resume.l.a
            public final rx.d<User> a(final String str, final String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20041d0e816d79a48c5141ddba609d18", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20041d0e816d79a48c5141ddba609d18") : com.meituan.passport.utils.v.a(new rx.functions.h<String, String, rx.d<User>>() { // from class: com.meituan.passport.service.al.2.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.h
                    public final /* synthetic */ rx.d<User> a(String str3, String str4) {
                        String str5 = str4;
                        Object[] objArr3 = {str3, str5};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4eef20055c3c26700b7a7133d9b1bc20", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4eef20055c3c26700b7a7133d9b1bc20") : com.meituan.passport.utils.s.b().userReopen(((com.meituan.passport.pojo.request.g) al.this.e).c(), (String) ((com.meituan.passport.pojo.request.g) al.this.e).b.b(), str, str2, str5);
                    }
                });
            }
        };
        com.meituan.passport.converter.h a3 = com.meituan.passport.converter.h.a();
        a3.h = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.l(c, aVar, this.k, this.j)).a(new com.meituan.passport.handler.resume.i(c, this.b, 100, this.i, this.k, this.j)).a(new com.meituan.passport.handler.resume.d(c, this.b, this.c, this.k, this.f, this.j)).a(new com.meituan.passport.handler.resume.j(c, this.f, this.h, this.k, this.j)).b;
        a3.g = b(c);
        com.meituan.passport.converter.h a4 = a3.a(c.getSupportFragmentManager());
        a4.i = a2;
        com.meituan.passport.converter.h a5 = a4.a((com.meituan.passport.converter.m) this.f);
        a5.k = R.string.passport_reopen_loading;
        a5.b();
    }
}
