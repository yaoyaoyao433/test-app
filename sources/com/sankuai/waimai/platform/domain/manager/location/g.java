package com.sankuai.waimai.platform.domain.manager.location;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        int length;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "580650a322c374d5783aef4e42ae43e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "580650a322c374d5783aef4e42ae43e9");
        }
        if (str == null || str2 == null || (length = str.length()) <= 0) {
            return null;
        }
        int i = length - 1;
        return str2.equals(str.substring(i)) ? str.substring(0, i) : str;
    }

    public static String a(String str, String str2, String str3) {
        int length;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d0ab6317322b3a9d095046c2bed4b2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d0ab6317322b3a9d095046c2bed4b2d");
        }
        if (str == null || str2 == null || str3 == null || (length = str.length()) <= 0) {
            return null;
        }
        int i = length - 1;
        String substring = str.substring(i);
        if (!str.contains(str2)) {
            return str3.equals(substring) ? str.substring(0, i) : str;
        } else if (str3.equals(substring)) {
            return str.substring(str.indexOf(str2) + 1, i);
        } else {
            return str.substring(str.indexOf(str2) + 1, length);
        }
    }
}
