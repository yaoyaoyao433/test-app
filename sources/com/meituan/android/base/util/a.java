package com.meituan.android.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-M-d");
    private static final SimpleDateFormat c = new SimpleDateFormat("yyyy-M-d HH:mm");
    private static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat e = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c38fae525d1d3d7caab83872b545d8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c38fae525d1d3d7caab83872b545d8c");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(5);
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        return i + CommonConstant.Symbol.MINUS + ((calendar.get(2) % 12) + 1) + CommonConstant.Symbol.MINUS + i2 + StringUtil.SPACE + a(i3) + CommonConstant.Symbol.COLON + a(i4);
    }

    public static String b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fb736147deff2f6635d6edcb419c193", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fb736147deff2f6635d6edcb419c193") : d.format(new Date(j));
    }

    public static boolean a(Date date, Date date2) {
        Object[] objArr = {date, date2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a133cb9127b2996c3f0bdb9c83c25a80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a133cb9127b2996c3f0bdb9c83c25a80")).booleanValue();
        }
        Calendar a2 = a(date);
        Calendar a3 = a(date2);
        return a2.get(1) == a3.get(1) && a2.get(6) == a3.get(6);
    }

    private static Calendar a(Date date) {
        Object[] objArr = {date};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ca02d5aaf05e44605e48fe1b68bdcc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Calendar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ca02d5aaf05e44605e48fe1b68bdcc9");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.clear();
        calendar.set(i, i2, i3);
        return calendar;
    }

    public static long c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e5cc0d42461da90e7d2de1a8bf1e744", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e5cc0d42461da90e7d2de1a8bf1e744")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.clear();
        calendar.set(i, i2, i3);
        return calendar.getTimeInMillis();
    }

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13a5723d18ecf6dce22376c0c009368e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13a5723d18ecf6dce22376c0c009368e");
        }
        if (i < 10) {
            return "0" + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }
}
