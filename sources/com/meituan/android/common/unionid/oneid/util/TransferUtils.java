package com.meituan.android.common.unionid.oneid.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TransferUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Pair<String, String> getLocalUuidTransferInfo(Context context, int i) {
        String[] split;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70c67cd34c140b69eac4f2c80846f08a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70c67cd34c140b69eac4f2c80846f08a");
        }
        if (context != null) {
            String str = "";
            switch (i) {
                case 1:
                    str = OneIdSharePref.getInstance(context).getLocalUuidTransferInfo();
                    break;
                case 2:
                    str = OneIdSharePref.getInstance(context).getUuidTransfer(OneIdSharePref.LOCAL_UUID_TRNSFER_INFO_V2);
                    break;
                case 3:
                    str = OneIdSharePref.getInstance(context).getUuidTransfer(OneIdSharePref.LOCAL_UUID_TRNSFER_INFO_V3);
                    break;
            }
            if (!TextUtils.isEmpty(str) && str.contains(CommonConstant.Symbol.COMMA) && (split = str.split(CommonConstant.Symbol.COMMA)) != null && split.length == 2) {
                return new Pair<>(split[0], split[1]);
            }
        }
        return new Pair<>("", "");
    }

    public static boolean setLocalUuidTransferV2(Context context, int i, String str, String str2) {
        Object[] objArr = {context, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74556c05c06d39637ff961d37d814607", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74556c05c06d39637ff961d37d814607")).booleanValue();
        }
        if (context != null) {
            switch (i) {
                case 2:
                    OneIdSharePref oneIdSharePref = OneIdSharePref.getInstance(context);
                    return oneIdSharePref.setUuidTransfer(OneIdSharePref.LOCAL_UUID_TRNSFER_INFO_V2, str + CommonConstant.Symbol.COMMA + str2);
                case 3:
                    OneIdSharePref oneIdSharePref2 = OneIdSharePref.getInstance(context);
                    return oneIdSharePref2.setUuidTransfer(OneIdSharePref.LOCAL_UUID_TRNSFER_INFO_V3, str + CommonConstant.Symbol.COMMA + str2);
            }
        }
        return false;
    }

    public static boolean isUuidTransferV2(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0a7dba31f2f61f2927298d0bf062e2b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0a7dba31f2f61f2927298d0bf062e2b")).booleanValue() : (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str) || str.equals(str3) || TextUtils.isEmpty(str2) || str2.equals(str4)) ? false : true;
    }

    public static boolean isUuidTransferV3(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffccb13287eff40072ef5148cdc3c0bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffccb13287eff40072ef5148cdc3c0bd")).booleanValue() : (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str) || str.equals(str3) || TextUtils.isEmpty(str2) || str2.equals(str4)) ? false : true;
    }
}
