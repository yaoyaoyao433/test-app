package com.meituan.android.pay.common.payment.utils;

import android.text.TextUtils;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fdc127f0b292ef99b3b52ab885829e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fdc127f0b292ef99b3b52ab885829e8")).booleanValue() : TextUtils.equals("balancepay", str);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e172d108696203d79d960965f37f6e7d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e172d108696203d79d960965f37f6e7d")).booleanValue() : TextUtils.equals("walletpay", str);
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "358c4659b217e9963f9ff0f63e78a92b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "358c4659b217e9963f9ff0f63e78a92b")).booleanValue() : TextUtils.equals("valuecard", str);
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d766a160c1cff53b5eec795a09eed040", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d766a160c1cff53b5eec795a09eed040")).booleanValue() : TextUtils.equals("privilegepay", str);
    }

    public static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "065a2d2c5f31a2a56cb224767f2c0881", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "065a2d2c5f31a2a56cb224767f2c0881")).booleanValue() : TextUtils.equals("creditpay", str);
    }

    public static boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4af62060bd0a72d2033e8b8eb3bc951", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4af62060bd0a72d2033e8b8eb3bc951")).booleanValue() : g.c.contains(str);
    }

    public static boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "200c33a95914e5c469d92e3db93a36d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "200c33a95914e5c469d92e3db93a36d7")).booleanValue() : TextUtils.equals("cardpay", str);
    }

    public static boolean h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd68f150e00594c8ec8f6ed5377b288d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd68f150e00594c8ec8f6ed5377b288d")).booleanValue() : TextUtils.equals("newforeigncardpay", str) || TextUtils.equals("foreigncardpay", str);
    }

    public static boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e05b694b40ab1fdee597fa4415199e0f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e05b694b40ab1fdee597fa4415199e0f")).booleanValue() : TextUtils.equals("bankselectpay", str);
    }

    public static boolean a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e6bed5d82c2099f4c7f715c00c48a12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e6bed5d82c2099f4c7f715c00c48a12")).booleanValue() : mTPayment != null && TextUtils.equals("quickbank", mTPayment.getPayType()) && mTPayment.getIsCoBrandedCard();
    }

    private static boolean m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0060515d7a2637f32abeb8183fb2b103", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0060515d7a2637f32abeb8183fb2b103")).booleanValue() : TextUtils.equals("signedunbindpay", str);
    }

    public static boolean j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9f959188210eb4db3498ef660858bf9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9f959188210eb4db3498ef660858bf9")).booleanValue() : g(str) || i(str) || m(str);
    }

    public static boolean k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfa43ac06866ab59095f69300a40c572", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfa43ac06866ab59095f69300a40c572")).booleanValue() : g.f.contains(str);
    }

    public static boolean l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "921472a522607b2e1cafb8dc888aa15b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "921472a522607b2e1cafb8dc888aa15b")).booleanValue() : TextUtils.equals("delaypay", str);
    }
}
