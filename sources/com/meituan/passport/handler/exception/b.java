package com.meituan.passport.handler.exception;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect c;
    public List<Integer> d;
    private boolean g;

    public b(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar, Integer... numArr) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar, numArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf7c224f22d45bbd6206db527b444d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf7c224f22d45bbd6206db527b444d8");
            return;
        }
        this.g = true;
        this.d = Arrays.asList(numArr);
    }

    @Override // com.meituan.passport.handler.exception.a
    public final ApiException a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73b2ed0099dd2b6f49fefb471e803b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73b2ed0099dd2b6f49fefb471e803b2");
        }
        com.meituan.passport.converter.b a = a();
        a(getClass(), apiException);
        if (a == null || apiException == null || this.d == null || !this.d.contains(Integer.valueOf(apiException.code)) || a.a(apiException, false)) {
            return apiException;
        }
        if (this.g) {
            com.meituan.passport.exception.monitor.b.a().a(apiException);
            return null;
        }
        return null;
    }
}
