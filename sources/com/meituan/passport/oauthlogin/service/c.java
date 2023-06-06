package com.meituan.passport.oauthlogin.service;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.handler.a;
import com.meituan.passport.handler.resume.h;
import com.meituan.passport.handler.resume.i;
import com.meituan.passport.handler.resume.j;
import com.meituan.passport.plugins.q;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.request.g;
import com.meituan.passport.service.ag;
import com.meituan.passport.utils.s;
import com.meituan.passport.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends ag<g<com.meituan.passport.oauthlogin.model.a>, User> {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cb081255feae542ac08783a2ab757a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cb081255feae542ac08783a2ab757a");
            return;
        }
        FragmentActivity c = c();
        if (c == null) {
            return;
        }
        boolean b = q.a().d().b();
        com.meituan.passport.oauthlogin.model.a aVar = (com.meituan.passport.oauthlogin.model.a) ((g) this.e).b.b();
        if (aVar == null) {
            return;
        }
        String str = TextUtils.isEmpty(this.c) ? aVar.b : this.c;
        String str2 = str;
        com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new h(c, this.f, this.h, this.b, str2, "action")).a(new i(c, "", 700, this.b, str2, "login")).a(new j(c, this.f, this.h, str, "login")).a(new com.meituan.passport.handler.resume.a(c, str, this.b)).b;
        rx.d dVar = null;
        if (UserCenter.OAUTH_TYPE_WEIXIN.equals(aVar.b)) {
            String a2 = aVar.a("appid", com.sankuai.meituan.oauth.a.c(c));
            Object[] objArr2 = {this, aVar, a2, Byte.valueOf(b ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            dVar = v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b923d9811df8d2c65d90db023cbbb929", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b923d9811df8d2c65d90db023cbbb929") : new d(this, aVar, a2, b));
        } else if (UserCenter.OAUTH_TYPE_QQ.equals(aVar.b)) {
            String a3 = q.a().d().a();
            if (TextUtils.isEmpty(a3)) {
                a3 = com.sankuai.meituan.oauth.a.e(c);
            }
            String a4 = aVar.a(Constants.PARAM_CLIENT_ID, a3);
            q.a().d();
            String str3 = TextUtils.isEmpty(null) ? aVar.b : null;
            Object[] objArr3 = {this, str3, a4, aVar, Byte.valueOf(b ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            dVar = v.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3b7524e038f7e0fd5547ba8f9782dee7", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3b7524e038f7e0fd5547ba8f9782dee7") : new e(this, str3, a4, aVar, b));
        }
        com.meituan.passport.converter.h a5 = com.meituan.passport.converter.h.a();
        a5.h = bVar;
        a5.g = a(c, 700, aVar.b);
        com.meituan.passport.converter.h a6 = a5.a(c.getSupportFragmentManager());
        a6.i = dVar;
        a6.c = this.f;
        a6.j = com.meituan.passport.exception.monitor.e.a(300);
        a6.b();
    }

    public static /* synthetic */ rx.d a(c cVar, com.meituan.passport.oauthlogin.model.a aVar, String str, boolean z, String str2, String str3) {
        Object[] objArr = {cVar, aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e6547051f0250614ae82f453edd9578", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e6547051f0250614ae82f453edd9578") : s.b().codeOauth(((g) cVar.e).c(), aVar.b, str, aVar.e, z, str2, str3);
    }

    public static /* synthetic */ rx.d a(c cVar, String str, String str2, com.meituan.passport.oauthlogin.model.a aVar, boolean z, String str3, String str4) {
        Object[] objArr = {cVar, str, str2, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b59d21dc3b3d408a5facd91a66463d83", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b59d21dc3b3d408a5facd91a66463d83") : s.b().accessTokenOauth(((g) cVar.e).c(), str, str2, aVar.a(), z, str3, str4);
    }
}
