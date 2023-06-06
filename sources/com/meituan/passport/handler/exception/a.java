package com.meituan.passport.handler.exception;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends c {
    public static ChangeQuickRedirect b;

    public abstract ApiException a(ApiException apiException);

    public a(Fragment fragment, com.meituan.passport.converter.b bVar) {
        super(fragment, bVar);
        Object[] objArr = {fragment, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcf0eea66c37d26f7d3fe8bb98c64d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcf0eea66c37d26f7d3fe8bb98c64d0");
        }
    }

    public a(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62ef1e626e6a3563e2781f01e9704e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62ef1e626e6a3563e2781f01e9704e9");
        }
    }

    @Override // com.meituan.passport.handler.exception.c
    public final Throwable a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c18a46de7bfdfa4ba544e60b6f7810", RobustBitConfig.DEFAULT_VALUE) ? (Throwable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c18a46de7bfdfa4ba544e60b6f7810") : th instanceof ApiException ? a((ApiException) th) : th;
    }
}
