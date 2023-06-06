package com.meituan.msc.modules.reporter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    private static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91dd880841c143d952c9e9edbb47fc0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91dd880841c143d952c9e9edbb47fc0e");
        }
        if (obj == null) {
            return StringUtil.NULL;
        }
        try {
            return obj.toString();
        } catch (Throwable th) {
            String str = "Failed to convert to log string, error: " + th.getMessage();
            g.b(str, th);
            return "{ " + str + " }";
        }
    }

    public static String a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "689e47b34bbaf2ed0107004d7c3e0f4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "689e47b34bbaf2ed0107004d7c3e0f4a");
        }
        int length = objArr.length;
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            Object obj = objArr[0];
            return obj == null ? "" : a(obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(objArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(StringUtil.SPACE);
            sb.append(a(objArr[i]));
        }
        return sb.toString();
    }
}
