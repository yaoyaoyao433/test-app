package com.sankuai.common.utils;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EasyReadDataFormat {
    public static final long ONE_DAY = 86400000;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final SyncSimpleDateFormat WEEK_CHINA_FORMAT = new SyncSimpleDateFormat("EEEE", Locale.CHINA);
    public static final SyncSimpleDateFormat YMD_FORMAT = new SyncSimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
    public static final SyncSimpleDateFormat YM_FORMAT = new SyncSimpleDateFormat("yyyy-MM", Locale.CHINA);
    public static final SyncSimpleDateFormat HM_FORMAT = new SyncSimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.CHINA);
    public static final SyncSimpleDateFormat MD_FORMAT = new SyncSimpleDateFormat("MM-dd", Locale.CHINA);
    public static final SyncSimpleDateFormat MD1_FORMAT = new SyncSimpleDateFormat("MM.dd", Locale.CHINA);
    public static final SyncSimpleDateFormat E_FORMAT = new SyncSimpleDateFormat("E", Locale.CHINA);
    public static final SyncSimpleDateFormat YMD_DATE_FORMAT = new SyncSimpleDateFormat("yyyyMMdd", Locale.CHINA);
    public static final SyncSimpleDateFormat DATETIME_FORMAT = new SyncSimpleDateFormat(Utils.LONG_DATE_FORMAT, Locale.CHINA);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SyncSimpleDateFormat {
        public static ChangeQuickRedirect changeQuickRedirect;
        private SimpleDateFormat mFormatter;

        public synchronized StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            Object[] objArr = {date, stringBuffer, fieldPosition};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b905886fe73c78e00fc84a4bc1f5841", RobustBitConfig.DEFAULT_VALUE)) {
                return (StringBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b905886fe73c78e00fc84a4bc1f5841");
            }
            return this.mFormatter.format(date, stringBuffer, fieldPosition);
        }

        public SyncSimpleDateFormat(String str, Locale locale) {
            Object[] objArr = {str, locale};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bba7c2624ea42bf2eaa5afb0bc456037", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bba7c2624ea42bf2eaa5afb0bc456037");
                return;
            }
            this.mFormatter = null;
            this.mFormatter = new SimpleDateFormat(str, locale);
        }

        public SyncSimpleDateFormat(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8c9a0b680db5af46a535f63af65e3cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8c9a0b680db5af46a535f63af65e3cf");
                return;
            }
            this.mFormatter = null;
            this.mFormatter = new SimpleDateFormat(str);
        }

        public synchronized StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
            Object[] objArr = {obj, stringBuffer, fieldPosition};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a58ab71f52f78f412bc11814e943aab", RobustBitConfig.DEFAULT_VALUE)) {
                return (StringBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a58ab71f52f78f412bc11814e943aab");
            }
            return this.mFormatter.format(obj, stringBuffer, fieldPosition);
        }

        public synchronized String format(Date date) {
            Object[] objArr = {date};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92fe4fcd73fd27dedb27c39618be9b18", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92fe4fcd73fd27dedb27c39618be9b18");
            }
            return this.mFormatter.format(date);
        }

        public synchronized String format(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69b87757dfc93a1444e6d0238d42c7b8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69b87757dfc93a1444e6d0238d42c7b8");
            }
            return this.mFormatter.format(Long.valueOf(j));
        }

        public synchronized Date parse(String str) throws ParseException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784f6515242316ba18621c09d785a2d5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Date) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784f6515242316ba18621c09d785a2d5");
            }
            return this.mFormatter.parse(str);
        }
    }

    public static String formatDate(long j, Context context) {
        Object[] objArr = {new Long(j), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d6ea07ee216607dfb3807d8dc0669b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d6ea07ee216607dfb3807d8dc0669b5");
        }
        long timeInMillis = getToday().getTimeInMillis();
        long j2 = timeInMillis + 86400000;
        long j3 = 86400000 + j2;
        long timeInMillis2 = getToday(j).getTimeInMillis();
        if (timeInMillis2 == timeInMillis) {
            return context.getString(R.string.commonutil_today);
        }
        if (timeInMillis2 == j2) {
            return context.getString(R.string.commonutil_tomorrow);
        }
        if (timeInMillis2 == j3) {
            return context.getString(R.string.commonutil_aftertomorrow);
        }
        return MD_FORMAT.format(timeInMillis2);
    }

    public static String formatDateWeek(long j, Context context) {
        Object[] objArr = {new Long(j), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5cb51e0814d7fab9d508daecf93ea485", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5cb51e0814d7fab9d508daecf93ea485");
        }
        long timeInMillis = getToday().getTimeInMillis();
        long j2 = timeInMillis + 86400000;
        long j3 = 86400000 + j2;
        long timeInMillis2 = getToday(j).getTimeInMillis();
        if (timeInMillis2 == timeInMillis) {
            return context.getString(R.string.commonutil_today);
        }
        if (timeInMillis2 == j2) {
            return context.getString(R.string.commonutil_tomorrow);
        }
        if (timeInMillis2 == j3) {
            return context.getString(R.string.commonutil_aftertomorrow);
        }
        String format = E_FORMAT.format(timeInMillis2);
        return context.getString(R.string.commonutil_zhou) + format.substring(format.length() - 1);
    }

    public static String convertMinute(int i, Context context) {
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9c133bf578a0b00ca08a9023d23c578", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9c133bf578a0b00ca08a9023d23c578");
        }
        if (i < 60) {
            return String.format("%d" + context.getString(R.string.commonutil_min), Integer.valueOf(i));
        }
        int i2 = i % 60;
        if (i2 > 0) {
            return String.format("%d" + context.getString(R.string.commonutil_hr) + "%d" + context.getString(R.string.commonutil_min), Integer.valueOf(i / 60), Integer.valueOf(i2));
        }
        return String.format("%d" + context.getString(R.string.commonutil_hr), Integer.valueOf(i / 60));
    }

    public static float convertScore(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c02ed8e98bac4b71a006911de86c0ec", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c02ed8e98bac4b71a006911de86c0ec")).floatValue() : i >= 100 ? (float) ((i / 100) + (((i % 100) / 10) * 0.1d)) : i;
    }

    public static String convertPrice(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a369c7cfe46a07aff5ce3e465b665ee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a369c7cfe46a07aff5ce3e465b665ee") : StringUtils.getFormattedDoubleValue(((float) j) / 100.0f);
    }

    public static Calendar getToday() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9131101bca9df46ac74d6e736f6ef44", RobustBitConfig.DEFAULT_VALUE) ? (Calendar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9131101bca9df46ac74d6e736f6ef44") : getDate(new Date());
    }

    public static Calendar getToday(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fde29062284239b75aaefe6589413f05", RobustBitConfig.DEFAULT_VALUE) ? (Calendar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fde29062284239b75aaefe6589413f05") : getDate(new Date(j));
    }

    private static Calendar getDate(Date date) {
        Object[] objArr = {date};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bbcf9d3fc4bcd84a84f299879deac99", RobustBitConfig.DEFAULT_VALUE)) {
            return (Calendar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bbcf9d3fc4bcd84a84f299879deac99");
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
}
