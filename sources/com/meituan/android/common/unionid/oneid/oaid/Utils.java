package com.meituan.android.common.unionid.oneid.oaid;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Utils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getLocalOaidStatus(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "166df66c51c14011f0b83e25eb109830", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "166df66c51c14011f0b83e25eb109830")).intValue() : OneIdSharePref.getInstance(context).getLocalOaidStatus();
    }

    public static void setLocalOaidStatus(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "154f3729eaa54ae050ed5f6e848d1b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "154f3729eaa54ae050ed5f6e848d1b6e");
        } else {
            OneIdSharePref.getInstance(context).setLocalOaidStatus(i);
        }
    }

    public static String getLocalOaid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70323cfea74676b029182f7ecaa4b12f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70323cfea74676b029182f7ecaa4b12f") : OneIdSharePref.getInstance(context).getLocalOaid();
    }

    public static void setLocalOaid(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ee5904184cb5daa2a223f3e5916bb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ee5904184cb5daa2a223f3e5916bb91");
        } else {
            OneIdSharePref.getInstance(context).setLocalOaid(str);
        }
    }

    public static boolean isDeviceDataTransfer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e92000fcf829d0951b503543018e3ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e92000fcf829d0951b503543018e3ee")).booleanValue();
        }
        String brand = AppUtil.getBrand(context);
        String deviceModel = AppUtil.getDeviceModel(context);
        String deviceFingerPrint = OneIdSharePref.getInstance(context).getDeviceFingerPrint();
        String replaceAll = (brand + deviceModel).replaceAll("\\s*", "");
        if (!TextUtils.isEmpty(deviceFingerPrint)) {
            return !replaceAll.equals(deviceFingerPrint);
        }
        OneIdSharePref.getInstance(context).setDeviceFingerPrint(replaceAll);
        return false;
    }
}
