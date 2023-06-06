package com.meituan.passport.yoda;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.converter.m;
import com.meituan.passport.pojo.BaseResult;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.yoda.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements m {
    public static ChangeQuickRedirect a;
    private final a.C0517a b;

    private e(a.C0517a c0517a) {
        this.b = c0517a;
    }

    public static m a(a.C0517a c0517a) {
        Object[] objArr = {c0517a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90b5939873c6d0f115d6d8df39ff64d4", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90b5939873c6d0f115d6d8df39ff64d4") : new e(c0517a);
    }

    @Override // com.meituan.passport.converter.m
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b42348a69667a5e7d5fc2000f31215f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b42348a69667a5e7d5fc2000f31215f");
            return;
        }
        a.C0517a c0517a = this.b;
        Object[] objArr2 = {c0517a, (BaseResult) obj};
        ChangeQuickRedirect changeQuickRedirect2 = a.C0517a.e;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c7e32426e4c8275494d0b893460f6221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c7e32426e4c8275494d0b893460f6221");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.C0517a.e;
        if (PatchProxy.isSupport(objArr3, c0517a, changeQuickRedirect3, false, "9266bd274b3b9116a7a793e2288f9184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c0517a, changeQuickRedirect3, false, "9266bd274b3b9116a7a793e2288f9184");
            return;
        }
        FragmentActivity fragmentActivity = c0517a.c.get();
        if (fragmentActivity == null || fragmentActivity.isFinishing() || c0517a.b == null) {
            return;
        }
        SmsResult smsResult = new SmsResult();
        c0517a.d.a(smsResult);
        c0517a.b.a(smsResult);
    }
}
