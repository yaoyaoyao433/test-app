package com.meituan.msc.common.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ay {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile("([\\d\\.]+)([abp]\\d+)?");
    private static String c;

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "762a5345075d27f289e97fbdf3009b4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "762a5345075d27f289e97fbdf3009b4f")).intValue();
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
            long parseLong = Long.parseLong(matcher.group(1));
            String group = matcher.group(2);
            if (!matcher2.matches()) {
                return 1;
            }
            long parseLong2 = Long.parseLong(matcher2.group(1));
            String group2 = matcher2.group(2);
            int i2 = (parseLong > parseLong2 ? 1 : (parseLong == parseLong2 ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            if (group != null && group.length() != 0) {
                if (group2 == null || group2.length() == 0) {
                    return 1;
                }
                String substring = group.substring(0, 1);
                long parseLong3 = Long.parseLong(group.substring(1));
                String substring2 = group2.substring(0, 1);
                long parseLong4 = Long.parseLong(group2.substring(1));
                if (substring.compareTo(substring2) > 0) {
                    return 1;
                }
                if (substring.compareTo(substring2) < 0) {
                    return -1;
                }
                int i3 = (parseLong3 > parseLong4 ? 1 : (parseLong3 == parseLong4 ? 0 : -1));
                if (i3 > 0) {
                    return 1;
                }
                if (i3 < 0) {
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

    @Nullable
    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f05a10722b3cb4938b50df03ce907a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f05a10722b3cb4938b50df03ce907a7");
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        Matcher matcher = Pattern.compile("\\d+[.\\d+]*").matcher("1.18.23.2");
        if (matcher.find()) {
            String group = matcher.group();
            c = group;
            return group;
        }
        return null;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19f784da0cf458744978abeb6382d4f5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19f784da0cf458744978abeb6382d4f5")).booleanValue() : TextUtils.isEmpty(str) || a(str, "1.18.23.2", 2) != 0;
    }

    public static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92ca09ffde136e92a4a73286c4d41b48", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92ca09ffde136e92a4a73286c4d41b48")).booleanValue() : a(str, str2, 2) > 0;
    }

    public static int a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fc5e60311b67d04a9ba4de9d250ee14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fc5e60311b67d04a9ba4de9d250ee14")).intValue();
        }
        Pattern compile = Pattern.compile("\\d+[.\\d+]*");
        Matcher matcher = compile.matcher(str);
        Matcher matcher2 = compile.matcher(str2);
        if (matcher.find() && matcher2.find()) {
            String group = matcher.group();
            String group2 = matcher2.group();
            String[] split = group.split("\\.");
            String[] split2 = group2.split("\\.");
            int min = Math.min(split.length, split2.length);
            if (i == 0 || i >= min) {
                i = min;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (split[i2].length() == split2[i2].length()) {
                    if (split[i2].compareTo(split2[i2]) != 0) {
                        return split[i2].compareTo(split2[i2]);
                    }
                } else {
                    return split[i2].length() - split2[i2].length();
                }
            }
        }
        return 0;
    }
}
