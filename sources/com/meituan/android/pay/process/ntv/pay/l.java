package com.meituan.android.pay.process.ntv.pay;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static c a(FragmentActivity fragmentActivity, DeskData deskData) {
        Object[] objArr = {fragmentActivity, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf95a7bb12ebe9b545c86282e319cef2", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf95a7bb12ebe9b545c86282e319cef2");
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "verify_type");
        if (!com.meituan.android.pay.desk.payment.verify.a.a(b)) {
            b = String.valueOf(com.meituan.android.pay.desk.component.data.a.i(deskData.getDesk()));
        }
        return a(fragmentActivity, b, deskData);
    }

    public static c a(FragmentActivity fragmentActivity, String str, DeskData deskData) {
        Object[] objArr = {fragmentActivity, str, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a0b274f45320f5707a34f8856ae48a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a0b274f45320f5707a34f8856ae48a9");
        }
        if (fragmentActivity == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.equals("4", str) || TextUtils.equals("8", str)) {
            return new d(fragmentActivity, deskData);
        }
        if (TextUtils.equals("1", str)) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_e9zsegtc_mc", (Map<String, Object>) null);
            return new e(fragmentActivity, deskData);
        } else if (TextUtils.equals("21", str) || TextUtils.equals("2", str)) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_olutmb4m_mc ", (Map<String, Object>) null);
            return new a(fragmentActivity, deskData);
        } else {
            return null;
        }
    }
}
