package com.meituan.passport.moduleinterface;

import com.meituan.passport.api.IPassportProvider;
import com.meituan.passport.b;
import com.meituan.passport.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PassportProviderImpl implements IPassportProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.api.IPassportProvider
    public boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffac95602309f5b447d9e277f539043e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffac95602309f5b447d9e277f539043e")).booleanValue() : b.a();
    }

    @Override // com.meituan.passport.api.IPassportProvider
    public void throwExceptionIfDebug(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940a4f41a1f20c330afdf1a58f047cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940a4f41a1f20c330afdf1a58f047cf7");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4a1fb36d1dc44dcd113d5d5610395f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4a1fb36d1dc44dcd113d5d5610395f15");
        } else if (m.a()) {
            throw new RuntimeException(str);
        }
    }

    @Override // com.meituan.passport.api.IPassportProvider
    public void throwExceptionIfDebug(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91cf1a426928a380c267a6ee063a0fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91cf1a426928a380c267a6ee063a0fdf");
        } else {
            m.a(th);
        }
    }
}
