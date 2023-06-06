package com.sankuai.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VersionUtil {
    private static final Pattern PATTERN_DIGI_VERSION = Pattern.compile("([\\d\\.]+)([abp]\\d+)?");
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int compare(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8c9736a0847f8cc1eee9a1904883d93", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8c9736a0847f8cc1eee9a1904883d93")).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            Matcher matcher = PATTERN_DIGI_VERSION.matcher(split[i]);
            Matcher matcher2 = PATTERN_DIGI_VERSION.matcher(split2[i]);
            if (!matcher.matches()) {
                return -1;
            }
            int intValue = Integer.valueOf(matcher.group(1)).intValue();
            String group = matcher.group(2);
            if (!matcher2.matches()) {
                return 1;
            }
            int intValue2 = Integer.valueOf(matcher2.group(1)).intValue();
            String group2 = matcher2.group(2);
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue < intValue2) {
                return -1;
            }
            if (group != null && group.length() != 0) {
                if (group2 == null || group2.length() == 0) {
                    return 1;
                }
                String substring = group.substring(0, 1);
                int intValue3 = Integer.valueOf(group.substring(1)).intValue();
                String substring2 = group2.substring(0, 1);
                int intValue4 = Integer.valueOf(group2.substring(1)).intValue();
                if (substring.compareTo(substring2) > 0) {
                    return 1;
                }
                if (substring.compareTo(substring2) < 0) {
                    return -1;
                }
                if (intValue3 > intValue4) {
                    return 1;
                }
                if (intValue3 < intValue4) {
                    return -1;
                }
            } else if (group2 != null && group2.length() != 0) {
                return -1;
            }
        }
        if (min < split.length) {
            return 1;
        }
        return (min == split.length && min == split2.length) ? 0 : -1;
    }
}
