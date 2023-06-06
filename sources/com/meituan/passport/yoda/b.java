package com.meituan.passport.yoda;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.dialogs.WarningDialog;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements com.meituan.passport.converter.b {
    public static ChangeQuickRedirect a;
    private final a.C0517a b;

    public b(a.C0517a c0517a) {
        this.b = c0517a;
    }

    @Override // com.meituan.passport.converter.b
    public final boolean a(ApiException apiException, boolean z) {
        Object accessDispatch;
        Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1957c304f4e488ab88484da01ff91c", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1957c304f4e488ab88484da01ff91c");
        } else {
            a.C0517a c0517a = this.b;
            Object[] objArr2 = {c0517a, apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a.C0517a.e;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b75a894c26e9bd430fb08ec5137ee571", RobustBitConfig.DEFAULT_VALUE)) {
                FragmentActivity fragmentActivity = c0517a.c.get();
                if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                    if (apiException.code == 121066) {
                        if (c0517a.d.l.b().booleanValue()) {
                            WarningDialog.a a2 = WarningDialog.a.a();
                            a2.e = f.a(c0517a);
                            a2.b = fragmentActivity.getString(R.string.passport_please_call_kf);
                            a2.c = fragmentActivity.getString(R.string.passport_call_kf);
                            a2.b().show(fragmentActivity.getSupportFragmentManager(), "tips");
                        }
                        return false;
                    } else if (c0517a.b != null) {
                        return c0517a.b.a(apiException);
                    }
                }
                return true;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b75a894c26e9bd430fb08ec5137ee571");
        }
        return ((Boolean) accessDispatch).booleanValue();
    }
}
