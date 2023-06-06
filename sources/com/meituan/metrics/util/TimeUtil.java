package com.meituan.metrics.util;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.time.c;
import com.meituan.metrics.speedmeter.CustomProcessStartTimer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TimeUtil {
    private static long PROCESS_START_TIME_FROM_STAT = 0;
    private static ThreadLocal<DateFormat> SAFE_DATETIME_FORMAT = new ThreadLocal<DateFormat>() { // from class: com.meituan.metrics.util.TimeUtil.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e451ef5b4e6d04d7d67d498ff57b94", RobustBitConfig.DEFAULT_VALUE) ? (SimpleDateFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e451ef5b4e6d04d7d67d498ff57b94") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
    };
    private static ThreadLocal<DateFormat> SAFE_TIMESTAMP_FORMAT = new ThreadLocal<DateFormat>() { // from class: com.meituan.metrics.util.TimeUtil.2
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28f08aeec01844d92584197907e30288", RobustBitConfig.DEFAULT_VALUE) ? (SimpleDateFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28f08aeec01844d92584197907e30288") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };
    private static final int STAT_PROCESS_START_TIME_INDEX = 21;
    private static final String TAG = "TimeUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String formatDateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b02a3ade04ad496d3f977c9e8a394326", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b02a3ade04ad496d3f977c9e8a394326");
        }
        try {
            return SAFE_DATETIME_FORMAT.get().format(new Date(j));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String formatTimeStamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f25cc78f6341977ac067fd9662cd7e50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f25cc78f6341977ac067fd9662cd7e50");
        }
        try {
            return SAFE_TIMESTAMP_FORMAT.get().format(new Date(j));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static long currentTimeSeconds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3371e2d8ff2ee75383d0bb96e64c57ce", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3371e2d8ff2ee75383d0bb96e64c57ce")).longValue() : System.currentTimeMillis() / 1000;
    }

    @Deprecated
    public static long currentTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7e96aeb8880d2909d2ff31e5fd42c14", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7e96aeb8880d2909d2ff31e5fd42c14")).longValue() : System.currentTimeMillis();
    }

    public static long currentTimeMillisSNTP() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce682633adf7133f4a770a9c1f02fff5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce682633adf7133f4a770a9c1f02fff5")).longValue() : c.b();
    }

    public static long elapsedTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "097c4f00b688b3c548c04421fe0a3273", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "097c4f00b688b3c548c04421fe0a3273")).longValue() : SystemClock.elapsedRealtime();
    }

    public static long getDayStartMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f789bdc8005e25e85e505334e76a3455", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f789bdc8005e25e85e505334e76a3455")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(currentTimeMillis()));
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getDayEndMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a1b1b8b463f6424635c9c1d9ac15da9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a1b1b8b463f6424635c9c1d9ac15da9")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static String getStartOfDay(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63a60e7cf8dd971ad893e24cbd5302c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63a60e7cf8dd971ad893e24cbd5302c9");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(SAFE_DATETIME_FORMAT.get().parse(str));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            return SAFE_DATETIME_FORMAT.get().format(calendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getEndOfDay(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "585441dc087764ff87765faf3bcdac23", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "585441dc087764ff87765faf3bcdac23");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(SAFE_DATETIME_FORMAT.get().parse(str));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            return SAFE_DATETIME_FORMAT.get().format(calendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static long getDayStartMillsSNTP() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9bd4acea420240135deb2c8458ade34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9bd4acea420240135deb2c8458ade34")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(currentTimeMillisSNTP()));
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long processStartElapsedTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0b68e0b78e394e5da9016a3675853e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0b68e0b78e394e5da9016a3675853e0")).longValue();
        }
        if (CustomProcessStartTimer.PROCESS_START_ELAPSED_TIME > 0) {
            return CustomProcessStartTimer.PROCESS_START_ELAPSED_TIME;
        }
        if (PROCESS_START_TIME_FROM_STAT > 0) {
            return PROCESS_START_TIME_FROM_STAT;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                long startElapsedRealtime = Process.getStartElapsedRealtime();
                PROCESS_START_TIME_FROM_STAT = startElapsedRealtime;
                return startElapsedRealtime;
            }
        } catch (Throwable th) {
            Logger.getMetricsLogger().et(TAG, "getStartElapsedRealtime failed", th);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/stat")), 1000);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            String[] split = readLine.split(StringUtil.SPACE);
            if (split.length > 21 && split[0].equals(String.valueOf(Process.myPid()))) {
                long parseLong = Long.parseLong(split[21]) * 10;
                PROCESS_START_TIME_FROM_STAT = parseLong;
                return parseLong;
            }
        } catch (FileNotFoundException e) {
            Logger.getMetricsLogger().et(TAG, "can't read process status file", e);
        } catch (IOException e2) {
            Logger.getMetricsLogger().et(TAG, "read process status failed", e2);
        } catch (NumberFormatException e3) {
            Logger.getMetricsLogger().et(TAG, "parse status file failed", e3);
        }
        long elapsedTimeMillis = elapsedTimeMillis();
        PROCESS_START_TIME_FROM_STAT = elapsedTimeMillis;
        return elapsedTimeMillis;
    }

    public static String currentDate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd1b80b4dbf63fe6f833a5cef7ebf07b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd1b80b4dbf63fe6f833a5cef7ebf07b");
        }
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(currentTimeMillisSNTP()));
            return String.format(Locale.US, "%d-%02d-%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String currentSysDate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "192f001c519f46228566f1a853a31928", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "192f001c519f46228566f1a853a31928");
        }
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(currentTimeMillis()));
            return String.format(Locale.US, "%d-%02d-%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
        } catch (Exception unused) {
            return "";
        }
    }
}
