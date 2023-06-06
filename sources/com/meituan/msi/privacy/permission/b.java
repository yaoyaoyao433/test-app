package com.meituan.msi.privacy.permission;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91f1b52df1b53e0336f107574acd6430", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91f1b52df1b53e0336f107574acd6430");
        }
        switch (i) {
            case -10:
                return "auth denied by system";
            case -9:
                return "auth denied by app";
            case -2:
                return "illegal scene token";
            case -1:
                return "auth denied by remote";
            default:
                return "unknown auth error";
        }
    }

    private static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cedb81649b0483efdf2dd9d46407880", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cedb81649b0483efdf2dd9d46407880")).intValue();
        }
        switch (i) {
            case -10:
                return XPlayerConstants.FFP_MSG_FIRST_FRAME_READ;
            case -9:
                return 442;
            case -2:
                return XPlayerConstants.FFP_MSG_VIDEO_DECODER_BEFORE;
            case -1:
                return 443;
            default:
                return 460;
        }
    }

    public static String a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e610e62b0df49ce094437902b2f5f93d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e610e62b0df49ce094437902b2f5f93d");
        }
        if (iArr == null || iArr.length == 0) {
            return "unknown auth error";
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] <= 0) {
                return a(iArr[i]);
            }
        }
        return "";
    }

    public static int b(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39d9147815a896c1101ef8c6616ecc43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39d9147815a896c1101ef8c6616ecc43")).intValue();
        }
        if (iArr == null || iArr.length == 0) {
            return 460;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] <= 0) {
                return b(iArr[i]);
            }
        }
        return 499;
    }
}
