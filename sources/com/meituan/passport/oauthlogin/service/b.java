package com.meituan.passport.oauthlogin.service;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.converter.h;
import com.meituan.passport.converter.m;
import com.meituan.passport.handler.a;
import com.meituan.passport.plugins.q;
import com.meituan.passport.pojo.BindStatus;
import com.meituan.passport.pojo.request.g;
import com.meituan.passport.service.ag;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends ag<g<com.meituan.passport.oauthlogin.model.a>, BindStatus> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.passport.service.ag
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca10207c5ae95698b15dbf2f7edfcb01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca10207c5ae95698b15dbf2f7edfcb01");
            return;
        }
        FragmentActivity c = c();
        if (c == null) {
            return;
        }
        UserCenter userCenter = UserCenter.getInstance(c);
        if (userCenter.isLogin()) {
            com.meituan.passport.oauthlogin.model.a aVar = (com.meituan.passport.oauthlogin.model.a) ((g) this.e).b.b();
            com.meituan.passport.handler.resume.b bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.oauthlogin.handler.a(c, (g) this.e, this.f, this.g)).a(new com.meituan.passport.oauthlogin.handler.b(c, aVar, this.f, this.g)).b;
            HashMap hashMap = new HashMap();
            hashMap.put("token", userCenter.getUser().token);
            hashMap.put("confirm", "0");
            rx.d dVar = null;
            if (UserCenter.OAUTH_TYPE_WEIXIN.equals(aVar.b)) {
                dVar = s.b().bindOauthCode(aVar.b, aVar.e, com.sankuai.meituan.oauth.a.c(c), hashMap);
            } else if (UserCenter.OAUTH_TYPE_QQ.equals(aVar.b)) {
                String a2 = q.a().d().a();
                if (TextUtils.isEmpty(a2)) {
                    a2 = com.sankuai.meituan.oauth.a.e(c);
                }
                String str = a2;
                q.a().d();
                dVar = s.b().bind(TextUtils.isEmpty(null) ? aVar.b : null, aVar.d, aVar.c, str, hashMap);
            }
            h a3 = h.a();
            a3.g = b(c);
            a3.h = bVar;
            h a4 = a3.a(c.getSupportFragmentManager());
            a4.i = dVar;
            a4.a((m) this.f).b();
        }
    }
}
