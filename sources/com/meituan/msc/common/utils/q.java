package com.meituan.msc.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22d94c8a277fe469e64614020c968955", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22d94c8a277fe469e64614020c968955");
        }
        return a(str == null ? 0L : str.length());
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11b085891b0cffe5a93c53541c25281e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11b085891b0cffe5a93c53541c25281e");
        }
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return j + ErrorCode.ERROR_TYPE_B;
        } else if (j < 1048576) {
            return (Math.round((j * 100.0d) / 1024.0d) / 100.0d) + "KB";
        } else if (j < 1073741824) {
            return (Math.round((j * 100.0d) / 1048576.0d) / 100.0d) + "MB";
        } else {
            return (Math.round((j * 100.0d) / 1.073741824E9d) / 100.0d) + "GB";
        }
    }
}
