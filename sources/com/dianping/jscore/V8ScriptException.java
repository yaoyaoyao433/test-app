package com.dianping.jscore;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public abstract class V8ScriptException extends JSRuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public V8ScriptException(String str, int i, String str2, String str3, int i2, int i3, String str4, Throwable th) {
        super(getDetailMessage(str, str2, str4, str3, i, i2, i3));
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), str4, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3d679cd17ff17b46bce31344f01ab2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3d679cd17ff17b46bce31344f01ab2");
        } else if (th != null) {
            initCause(th);
        }
    }

    private static String getDetailMessage(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d15141a5f93cfcad205facdbb2904aab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d15141a5f93cfcad205facdbb2904aab");
        }
        StringBuilder sb = new StringBuilder();
        if (str3 != null && str3.contains("\n")) {
            String[] split = str3.split("\n");
            sb.append(split[0]);
            getSourceCode(sb, str4, i2, i3);
            sb.append(" (line " + i + " in the generated bundle)");
            sb.append("\n/***StackTrace***/\n");
            if (split.length > 1) {
                for (int i4 = 1; i4 < split.length; i4++) {
                    String[] split2 = split[i4].trim().split(StringUtil.SPACE);
                    if (split2.length > 1) {
                        if (split2.length > 2 && split2[2].length() > 1) {
                            sb.append(split2[1]);
                            sb.append('@');
                            sb.append(split2[2].substring(1, split2[2].length() - 1));
                            sb.append("\n");
                        } else {
                            sb.append("global code@");
                            sb.append(split2[1]);
                        }
                    } else {
                        sb.append(split[i4]);
                    }
                }
                if ('\n' != sb.charAt(sb.length() - 1)) {
                    sb.append("\n");
                }
            }
            sb.append("/***StackTrace***/");
        } else if (str3 != null || str2 != null) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COLON);
            sb.append(i);
            sb.append(str3 == null ? "" : ";" + str3);
            sb.append(str2 == null ? "" : ";" + str2);
            sb.append(";");
            getSourceCode(sb, str4, i2, i3);
        }
        return sb.toString();
    }

    private static void getSourceCode(StringBuilder sb, String str, int i, int i2) {
        int i3 = 0;
        Object[] objArr = {sb, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51cca230e0fedd41093caf82d1dd56c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51cca230e0fedd41093caf82d1dd56c3");
        } else if (TextUtils.isEmpty(str) || str.length() <= 0 || i < 0 || i2 >= str.length() || i2 < 0) {
        } else {
            int length = str.length();
            while (i > 0) {
                char charAt = str.charAt(i);
                if (charAt == ';' || charAt == '{' || charAt == '}') {
                    i3 = i + 1;
                    break;
                }
                i--;
            }
            while (true) {
                if (i2 >= str.length()) {
                    i2 = length;
                    break;
                }
                char charAt2 = str.charAt(i2);
                if (charAt2 == ';' || charAt2 == '{' || charAt2 == '}') {
                    break;
                }
                i2++;
            }
            sb.append(" (evaluating '");
            sb.append(str.substring(i3, i2));
            sb.append("') ");
        }
    }
}
