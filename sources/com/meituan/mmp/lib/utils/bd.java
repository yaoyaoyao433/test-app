package com.meituan.mmp.lib.utils;

import com.meituan.mmp.lib.trace.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class bd {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile("([\\d\\.]+)([abp]\\d+)?");
    private static boolean c;

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccfdc548ff2b818497e86bb7e22c9d05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccfdc548ff2b818497e86bb7e22c9d05")).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            Matcher matcher = b.matcher(split[i]);
            Matcher matcher2 = b.matcher(split2[i]);
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

    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22335d54a18ca4fbbc64055ea05db4d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22335d54a18ca4fbbc64055ea05db4d9")).longValue();
        }
        Matcher matcher = Pattern.compile("^([0-9.]*)").matcher(str);
        if (!matcher.find()) {
            throw new IllegalArgumentException("version name must like \"x.yy.zzz\"");
        }
        String group = matcher.group();
        if (str.length() != group.length() && !c) {
            c = true;
            b.a.b("auto modified app version name, from " + str + " to " + group);
        }
        String[] split = group.split("\\.");
        StringBuilder sb = new StringBuilder();
        try {
            int length = split.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%04d", Integer.valueOf(Integer.parseInt(split[i]))));
            }
            return Long.parseLong(sb.toString());
        } catch (Exception e) {
            throw new IllegalArgumentException("version code must like \"x.yy.zzz\"", e);
        }
    }
}
