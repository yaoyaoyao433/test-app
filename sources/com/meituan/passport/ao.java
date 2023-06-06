package com.meituan.passport;

import com.meituan.passport.an;
import com.meituan.passport.api.AccountApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements Runnable {
    public static ChangeQuickRedirect a;
    private final an b;

    private ao(an anVar) {
        this.b = anVar;
    }

    public static Runnable a(an anVar) {
        Object[] objArr = {anVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c6d1e1fe26d5227e28da415465e2f3e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c6d1e1fe26d5227e28da415465e2f3e") : new ao(anVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9474317821cdc682731288ac0ea664f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9474317821cdc682731288ac0ea664f6");
            return;
        }
        an anVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = an.a;
        if (PatchProxy.isSupport(objArr2, anVar, changeQuickRedirect2, false, "99cbd43f2b866a457cd7f4b1987bd166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, anVar, changeQuickRedirect2, false, "99cbd43f2b866a457cd7f4b1987bd166");
            return;
        }
        if (anVar.e == null) {
            try {
                anVar.e = AccountApiFactory.getInstance().create();
            } catch (Exception unused) {
                return;
            }
        }
        try {
            com.meituan.passport.plugins.q.a().c();
            com.meituan.passport.utils.n.a("UserCenterImpl.refreshToken", "", "");
            com.sankuai.android.jarvis.c.a("thread-refreshToken", new an.AnonymousClass2(new com.meituan.passport.pojo.request.c())).start();
        } catch (Exception unused2) {
        }
    }
}
