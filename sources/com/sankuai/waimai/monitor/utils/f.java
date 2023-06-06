package com.sankuai.waimai.monitor.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6bf6915a5159ff935da8412de92c647", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6bf6915a5159ff935da8412de92c647");
        }
        try {
            int intValue = Integer.valueOf(str).intValue();
            StringBuilder sb = new StringBuilder();
            if (intValue == 0) {
                sb.insert(0, "12345689ABCDEGHJKLMNPQRSTUVWXYZ".charAt(intValue % 31));
                intValue /= 31;
            }
            while (intValue > 0) {
                sb.insert(0, "12345689ABCDEGHJKLMNPQRSTUVWXYZ".charAt(intValue % 31));
                intValue /= 31;
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
