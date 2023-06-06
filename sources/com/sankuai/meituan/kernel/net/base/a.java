package com.sankuai.meituan.kernel.net.base;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static int b;
    public static int c;
    public static float d;
    public static int e;
    public static boolean f;
    private static String g;
    private static String h;
    private static String i;
    private static boolean j;

    public static String a() {
        String str;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06206c79b1d050af2182047a9c91f8d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06206c79b1d050af2182047a9c91f8d6");
        }
        if (TextUtils.isEmpty(i)) {
            String str3 = "";
            b a2 = c.a();
            if (a2 != null && a2.j() != null) {
                str3 = a2.j();
            }
            StringBuilder sb = new StringBuilder("MApi 1.1 (");
            sb.append("com.sankuai.meituan ");
            sb.append(str3);
            sb.append(StringUtil.SPACE);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51c91e29fcb2d863c6928dbd656a391f", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51c91e29fcb2d863c6928dbd656a391f");
            } else {
                if (!j) {
                    b a3 = c.a();
                    String str4 = "";
                    if (a3 != null && a3.i() != null) {
                        str4 = a3.i();
                    }
                    String a4 = a(str4);
                    g = a4;
                    if (a4.equals(Constants.UNDEFINED)) {
                        g = StringUtil.NULL;
                    }
                    j = true;
                }
                str = g;
            }
            sb.append(str);
            sb.append(StringUtil.SPACE);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "de0a41a4cd95724042018382ad99a8c5", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "de0a41a4cd95724042018382ad99a8c5");
            } else {
                if (h == null) {
                    h = a(Build.MODEL);
                }
                str2 = h;
            }
            sb.append(str2);
            sb.append("; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
            i = sb.toString();
        }
        return i;
    }

    private static String a(String str) {
        char[] charArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26cdaea2baf954de7cc834e1c9cb938a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26cdaea2baf954de7cc834e1c9cb938a");
        }
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            if (c2 >= 'a' && c2 <= 'z') {
                sb.append(c2);
            } else if (c2 >= 'A' && c2 <= 'Z') {
                sb.append(c2);
            } else if (c2 >= '0' && c2 <= '9') {
                sb.append(c2);
            } else if (c2 == '.' || c2 == '_' || c2 == '-' || c2 == '/') {
                sb.append(c2);
            } else if (c2 == ' ') {
                sb.append('_');
            }
        }
        return sb.toString();
    }
}
