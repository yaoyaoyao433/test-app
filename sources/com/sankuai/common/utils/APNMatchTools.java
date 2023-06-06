package com.sankuai.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class APNMatchTools {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class APNNet {
        public static final String CMNET = "cmnet";
        public static final String CMTDS = "cmtds";
        public static final String CMWAP = "cmwap";
        public static final String CTNET = "ctnet";
        public static final String CTWAP = "ctwap";
        public static final String GNET_3 = "3gnet";
        public static final String GWAP_3 = "3gwap";
        public static final String UNINET = "uninet";
        public static final String UNIWAP = "uniwap";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static String matchAPN(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77d2935d24f9222f95d5f6f51e27ce4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77d2935d24f9222f95d5f6f51e27ce4e");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith(APNNet.CMNET) ? APNNet.CMNET : lowerCase.startsWith(APNNet.CMWAP) ? APNNet.CMWAP : lowerCase.startsWith(APNNet.CTNET) ? APNNet.CTNET : lowerCase.startsWith(APNNet.CTWAP) ? APNNet.CTWAP : lowerCase.startsWith(APNNet.GNET_3) ? APNNet.GNET_3 : lowerCase.startsWith(APNNet.GWAP_3) ? APNNet.GWAP_3 : lowerCase.startsWith(APNNet.UNINET) ? APNNet.UNINET : lowerCase.startsWith(APNNet.UNIWAP) ? APNNet.UNIWAP : lowerCase.startsWith(APNNet.CMTDS) ? APNNet.CMTDS : lowerCase.startsWith("default") ? "default" : "";
    }
}
