package com.sankuai.common.utils;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MtTextUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String toSBC(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "130805df6395576078e2965b98ee45f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "130805df6395576078e2965b98ee45f9");
        }
        char[] cArr = new char[charSequence.length()];
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            cArr[i] = charSequence.charAt(i);
            if (cArr[i] == ' ') {
                cArr[i] = 12288;
            } else if (cArr[i] < 127 && cArr[i] > ' ') {
                cArr[i] = (char) (cArr[i] + 65248);
            }
        }
        return new String(cArr);
    }

    public static String toDBC(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02938be60bf95eedc6752961588b5309", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02938be60bf95eedc6752961588b5309");
        }
        char[] cArr = new char[charSequence.length()];
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            cArr[i] = charSequence.charAt(i);
            if (cArr[i] == 12288) {
                cArr[i] = Constants.SPACE;
            } else if (cArr[i] > 65280 && cArr[i] < 65375) {
                cArr[i] = (char) (cArr[i] - 65248);
            }
        }
        String str = new String(cArr);
        str.replaceAll("。", CommonConstant.Symbol.DOT);
        return str;
    }

    public static final String formatLength(String str, int i) {
        int i2 = 0;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa5f238c01df2686b001328b8db63a88", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa5f238c01df2686b001328b8db63a88");
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i3 = 0;
        while (true) {
            if (i2 < length) {
                char c = charArray[i2];
                if (c > 255) {
                    i3 += 2;
                    if (i3 != i) {
                        if (i3 < i) {
                            sb.append(c);
                            i2++;
                        } else {
                            sb.append("…");
                            break;
                        }
                    } else if (i2 == length - 1) {
                        sb.append(c);
                        i2++;
                    } else {
                        sb.append("… ");
                        break;
                    }
                } else {
                    i3++;
                    if (i3 != i) {
                        if (i3 >= i) {
                            break;
                        }
                        sb.append(c);
                        i2++;
                    } else if (i2 == length - 1) {
                        sb.append(c);
                        i2++;
                    } else {
                        sb.append("…");
                        break;
                    }
                }
            } else {
                break;
            }
        }
        while (i3 < i) {
            sb.append(StringUtil.SPACE);
            i3++;
        }
        return sb.toString();
    }
}
