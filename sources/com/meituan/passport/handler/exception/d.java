package com.meituan.passport.handler.exception;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends c {
    public static ChangeQuickRedirect b;

    public d(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe738e559d03289fa44eeff4b75a8a51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe738e559d03289fa44eeff4b75a8a51");
        }
    }

    @Override // com.meituan.passport.handler.exception.c
    public final Throwable a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1154416a1ef0e5acc5684d5e4082dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Throwable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1154416a1ef0e5acc5684d5e4082dc");
        }
        FragmentActivity b2 = b();
        if (b2 == null || th == null) {
            return th;
        }
        a(getClass(), th);
        com.meituan.passport.exception.monitor.b.a().a(th);
        com.meituan.passport.converter.b a = a();
        if (a == null || a.a(new ApiException("", th, 0, ""), true)) {
            a(b2.getString(R.string.passport_tips_io_sso_error));
            return null;
        }
        return null;
    }
}
