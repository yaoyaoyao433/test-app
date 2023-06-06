package com.meituan.passport.oauthlogin.jsbridge;

import com.meituan.passport.clickaction.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements c {
    public static ChangeQuickRedirect a;
    private final com.meituan.passport.oauthlogin.model.a b;

    public a(com.meituan.passport.oauthlogin.model.a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.passport.clickaction.c
    public final Object getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013529a7f0765487cac3daf829dc0021", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013529a7f0765487cac3daf829dc0021") : QQBindJSHandler.lambda$doOAuthSuccess$0(this.b);
    }
}
