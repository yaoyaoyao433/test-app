package com.meituan.android.pay.utils;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paybase.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static boolean a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a992de6b17639c7040955b0fd18befb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a992de6b17639c7040955b0fd18befb")).booleanValue() : mTPayment != null && com.meituan.android.pay.common.payment.utils.c.e(mTPayment.getPayType());
    }

    public static boolean b(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b587854ee75f37130372a7173e4030e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b587854ee75f37130372a7173e4030e")).booleanValue() : mTPayment != null && mTPayment.isOpenCreditPay();
    }

    public static boolean c(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66b0c986894fc5bf17274bcd61c616f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66b0c986894fc5bf17274bcd61c616f4")).booleanValue() : (mTPayment == null || mTPayment.getCreditPayOpenInfo() == null || TextUtils.isEmpty(mTPayment.getCreditPayOpenInfo().getUrl())) ? false : true;
    }

    public static boolean d(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bb68f033649324b7fb76335f253ce8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bb68f033649324b7fb76335f253ce8c")).booleanValue() : a(mTPayment) && !b(mTPayment) && c(mTPayment);
    }

    public static String a(Activity activity, String str, String str2, String str3) {
        Object[] objArr = {activity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "803079469c0ff63fe7899ce774691e73", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "803079469c0ff63fe7899ce774691e73");
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("openSource", str2);
        Object[] objArr2 = {activity, buildUpon, str3};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e2d1c6556e9a8763bb7980bc4410df16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e2d1c6556e9a8763bb7980bc4410df16");
        } else if (buildUpon != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            buildUpon.appendQueryParameter("halfPageHeight", str3);
            buildUpon.appendQueryParameter("screenWidth", String.valueOf(ab.a(com.meituan.android.paybase.config.a.d().a())));
            buildUpon.appendQueryParameter("dpi", String.valueOf(displayMetrics.density));
        }
        return buildUpon.toString();
    }

    public static void a() {
        b = false;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "873bda6e7d25735999bb9afca0371aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "873bda6e7d25735999bb9afca0371aae");
        } else {
            com.meituan.android.pay.desk.pack.u.a().g = "new_creditpay_open_success";
        }
    }
}
