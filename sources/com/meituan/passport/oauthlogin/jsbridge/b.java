package com.meituan.passport.oauthlogin.jsbridge;

import com.meituan.passport.clickaction.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements c {
    public static ChangeQuickRedirect a;
    private final com.meituan.passport.oauthlogin.model.a b;

    public b(com.meituan.passport.oauthlogin.model.a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.passport.clickaction.c
    public final Object getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5c5edb54860a5e3c2d72c8034e4812", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5c5edb54860a5e3c2d72c8034e4812") : WechatBindJSHandler.lambda$doOAuthSuccess$1(this.b);
    }
}
