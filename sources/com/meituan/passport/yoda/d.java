package com.meituan.passport.yoda;

import com.meituan.passport.handler.resume.l;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements l.a {
    public static ChangeQuickRedirect a;
    private final rx.d b;

    private d(rx.d dVar) {
        this.b = dVar;
    }

    public static l.a a(rx.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70b2b794629a7d99ea3b354a681d027e", RobustBitConfig.DEFAULT_VALUE) ? (l.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70b2b794629a7d99ea3b354a681d027e") : new d(dVar);
    }

    @Override // com.meituan.passport.handler.resume.l.a
    public final rx.d a(String str, String str2) {
        Object accessDispatch;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63da407fec20d8229c0299b5fd63e09e", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63da407fec20d8229c0299b5fd63e09e");
        } else {
            rx.d dVar = this.b;
            Object[] objArr2 = {dVar, str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a.C0517a.e;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "454d8f115708e12e825e092b3017182d", RobustBitConfig.DEFAULT_VALUE)) {
                return dVar;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "454d8f115708e12e825e092b3017182d");
        }
        return (rx.d) accessDispatch;
    }
}
