package com.meituan.android.legwork.utils;

import android.text.format.Time;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final ThreadLocal<SimpleDateFormat> b = new ThreadLocal<SimpleDateFormat>() { // from class: com.meituan.android.legwork.utils.g.1
        public static ChangeQuickRedirect a;

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19327778bf0d9649f9e42584e457dddc", RobustBitConfig.DEFAULT_VALUE)) {
                return (SimpleDateFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19327778bf0d9649f9e42584e457dddc");
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Utils.LONG_DATE_FORMAT, Locale.CHINA);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
            return simpleDateFormat;
        }
    };

    public static String a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cf76ab6c44f644699fd481ae1b9e220", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cf76ab6c44f644699fd481ae1b9e220");
        }
        SimpleDateFormat simpleDateFormat = b.get();
        simpleDateFormat.applyPattern(str);
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public static String a(StringBuilder sb, long j) {
        long j2;
        long j3;
        Object[] objArr = {sb, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c20833224e5136696ee8a640f8833d40", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c20833224e5136696ee8a640f8833d40");
        }
        if (sb == null) {
            sb = new StringBuilder(8);
        } else {
            sb.setLength(0);
        }
        if (j >= 3600) {
            j2 = j / 3600;
            j -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (j >= 60) {
            j3 = j / 60;
            j -= 60 * j3;
        } else {
            j3 = 0;
        }
        Formatter formatter = new Formatter(sb, Locale.getDefault());
        return j2 > 0 ? formatter.format("%1$d:%2$02d:%3$02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j)).toString() : j3 > 10 ? formatter.format("%1$02d:%2$02d", Long.valueOf(j3), Long.valueOf(j)).toString() : formatter.format("%1$d:%2$02d", Long.valueOf(j3), Long.valueOf(j)).toString();
    }

    public static boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0da3a6ffdd57f3b96349dee592a2214f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0da3a6ffdd57f3b96349dee592a2214f")).booleanValue();
        }
        long b2 = com.meituan.android.time.c.b();
        Object[] objArr2 = {new Long(b2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "45b55387ace8b1249209bea24878a9fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "45b55387ace8b1249209bea24878a9fb")).booleanValue();
        }
        Time time = new Time();
        time.set(j);
        int i = time.year;
        int i2 = time.month;
        int i3 = time.monthDay;
        time.set(b2);
        return i == time.year && i2 == time.month && i3 == time.monthDay;
    }
}
