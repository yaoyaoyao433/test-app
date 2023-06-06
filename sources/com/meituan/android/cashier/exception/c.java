package com.meituan.android.cashier.exception;

import com.meituan.android.cashier.NativeStandardCashierAdapter;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends a {
    public static ChangeQuickRedirect e;

    public c(MTCashierActivity mTCashierActivity) {
        super(mTCashierActivity);
        Object[] objArr = {mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3aacc034093342ffcf57e110e92b208", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3aacc034093342ffcf57e110e92b208");
        }
    }

    @Override // com.meituan.android.cashier.exception.a
    public final void b(Exception exc) {
        String str;
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e081e8eca86e1debc20854bdec6c7ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e081e8eca86e1debc20854bdec6c7ac");
            return;
        }
        int code = exc instanceof PayException ? ((PayException) exc).getCode() : 0;
        a.c cVar = new a.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c980c22de9356b6dbf12f8b14ea8c58", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c980c22de9356b6dbf12f8b14ea8c58");
        } else {
            ICashier iCashier = this.d.e;
            str = iCashier instanceof NativeStandardCashierAdapter ? ((NativeStandardCashierAdapter) iCashier).c : "";
        }
        a.c a = cVar.a("pay_type", str);
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        com.meituan.android.paybase.common.analyse.a.a("b_afd0sd11", a.a("code", sb.toString()).a("message", exc.getMessage()).b);
    }
}
