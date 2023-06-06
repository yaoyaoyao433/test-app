package com.meituan.android.pay.utils;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(FragmentActivity fragmentActivity, Object obj) {
        String pageMessage;
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6c271177c61fa7c255de02f4191f0e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6c271177c61fa7c255de02f4191f0e8");
            return;
        }
        if ((obj instanceof BankInfo) && fragmentActivity != null) {
            BankInfo bankInfo = (BankInfo) obj;
            String b = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "finger_type");
            if (bankInfo.isOpen()) {
                if (TextUtils.equals("1", b)) {
                    String i = com.meituan.android.paycommon.lib.config.a.a().i();
                    com.meituan.android.paybase.fingerprint.util.b.b(i);
                    com.meituan.android.paybase.fingerprint.util.b.a(i);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_mn6ph8xr", new a.c().a("type", b).b);
                com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_FINGERPRINT_GUIDE, 200);
                if (TextUtils.isEmpty(bankInfo.getPageMessage())) {
                    pageMessage = fragmentActivity.getString(R.string.paycommon__open_fingerprint_success);
                } else {
                    pageMessage = bankInfo.getPageMessage();
                }
                com.meituan.android.paybase.dialog.e.a(fragmentActivity, pageMessage, e.a.TOAST_TYPE_SUCCESS);
            } else {
                com.meituan.android.paybase.common.analyse.a.a("b_yzodpqrt", new a.c().a("type", b).b);
                com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_FINGERPRINT_GUIDE, -9753);
                com.meituan.android.paybase.fingerprint.soter.soterexternal.e.a(fragmentActivity, "", bankInfo.getVerifySoterStatus());
                com.meituan.android.paybase.dialog.e.a(fragmentActivity, TextUtils.isEmpty(bankInfo.getPageMessage()) ? fragmentActivity.getString(R.string.paycommon__open_fingerprint_fail) : bankInfo.getPageMessage(), e.a.TOAST_TYPE_EXCEPTION);
            }
        }
        PayActivity.a(fragmentActivity);
    }

    public static void a(FragmentActivity fragmentActivity, Exception exc) {
        Object[] objArr = {fragmentActivity, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c1a110e7510bb7904efa869a8ca65f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c1a110e7510bb7904efa869a8ca65f3");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("PayActivity", "onRequestException", "open_fingerprintPay_fail", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "finger_type"));
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_FINGERPRINT_GUIDE, exc instanceof PayException ? ((PayException) exc).getCode() : -9753);
        com.meituan.android.paybase.fingerprint.soter.soterexternal.e.b(fragmentActivity, "");
        com.meituan.android.paybase.dialog.e.a(fragmentActivity, fragmentActivity.getString(R.string.paycommon__open_fingerprint_fail), e.a.TOAST_TYPE_EXCEPTION);
        PayActivity.a(fragmentActivity);
    }
}
