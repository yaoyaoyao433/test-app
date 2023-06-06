package com.meituan.passport;

import com.meituan.passport.service.ar;
import com.meituan.passport.service.av;
import com.meituan.passport.service.ax;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements o {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.o
    public final com.meituan.passport.country.phonecontroler.c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e6eaee18eb2e8f8e3a78b7e9218dc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.country.phonecontroler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e6eaee18eb2e8f8e3a78b7e9218dc3");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.country.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "163ccf79f95e0e9f7dff98f065c7f1fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.country.phonecontroler.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "163ccf79f95e0e9f7dff98f065c7f1fa");
        }
        if (i != 86) {
            if (i == 886) {
                return new com.meituan.passport.country.phonecontroler.d();
            }
            return new com.meituan.passport.country.phonecontroler.b();
        }
        return new com.meituan.passport.country.phonecontroler.a();
    }

    @Override // com.meituan.passport.o
    public final <N extends com.meituan.passport.service.w> N a(com.meituan.passport.service.ai aiVar) {
        ah ahVar;
        N n;
        Object[] objArr = {aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a6139c1007175d4bc184ac578eaba3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (N) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a6139c1007175d4bc184ac578eaba3e");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ah.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4ed28f4b4296ae13d2e80f9b28753e46", RobustBitConfig.DEFAULT_VALUE)) {
            ahVar = (ah) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4ed28f4b4296ae13d2e80f9b28753e46");
        } else {
            if (ah.b == null) {
                ah.b = new ah();
            }
            ahVar = ah.b;
        }
        Object[] objArr3 = {aiVar};
        ChangeQuickRedirect changeQuickRedirect3 = ah.a;
        if (PatchProxy.isSupport(objArr3, ahVar, changeQuickRedirect3, false, "51c04613be19bc81a4de4196d235b028", RobustBitConfig.DEFAULT_VALUE)) {
            n = (N) PatchProxy.accessDispatch(objArr3, ahVar, changeQuickRedirect3, false, "51c04613be19bc81a4de4196d235b028");
        } else {
            com.meituan.passport.service.ah ahVar2 = ahVar.c.get(aiVar);
            n = ahVar2 != null ? (N) ahVar2.a() : null;
        }
        if (n != null) {
            return n;
        }
        switch (aiVar) {
            case TYPE_ACCOUNT_LOGIN:
                return new com.meituan.passport.service.a();
            case TYPE_DYNAMIC_LOGIN:
                return new com.meituan.passport.service.v();
            case TYPE_REQUESTCODE:
                return new ar();
            case TYPE_SEND_SMS_CODE:
                return new com.meituan.passport.service.ao();
            case TYPE_CHECK_USER_NAME:
                return new com.meituan.passport.service.r();
            case TYPE_BP_SEND_SMS_CODE:
                return new com.meituan.passport.service.f();
            case TYPE_BIND_PHONE:
                return new com.meituan.passport.service.q();
            case TYPE_NEW_SSOLOGIN:
                return new com.meituan.passport.service.aj();
            case TYPE_IDENTIFY_VERIFICATION_SERVICE:
                return new com.meituan.passport.service.x();
            case TYPE_VERIFY_LOGIN:
                return new ax();
            case TYPE_RETRIEVE_PASSWORD:
                return new com.meituan.passport.service.am();
            case TYPE_IDENTIFY_VERIFICATION:
                return new av();
            case TYPE_BIND_MOBILE_LOGIN:
                return new com.meituan.passport.service.m();
            default:
                return null;
        }
    }
}
