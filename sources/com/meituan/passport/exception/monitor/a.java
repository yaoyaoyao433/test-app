package com.meituan.passport.exception.monitor;

import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;
    protected boolean b;

    public a(boolean z) {
        super(200);
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08824d6344643c95dc0984a51199298b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08824d6344643c95dc0984a51199298b");
            return;
        }
        this.b = false;
        this.b = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.passport.exception.monitor.d, com.meituan.passport.exception.monitor.c
    public final void a(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4395dbffdba44f5ba547897758c7ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4395dbffdba44f5ba547897758c7ae5");
            return;
        }
        super.a(user);
        b.a().a("dynamic_detail", this.b ? "signup" : "login");
    }
}
