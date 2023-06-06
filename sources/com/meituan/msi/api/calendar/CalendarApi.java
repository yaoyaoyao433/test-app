package com.meituan.msi.api.calendar;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CalendarApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = WMCalendarModule.ADD_PHONE_CALENDAR, request = AddPhoneCalendarParam.class)
    public void addPhoneCalendar(AddPhoneCalendarParam addPhoneCalendarParam, MsiContext msiContext) {
        Object[] objArr = {addPhoneCalendarParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f062c68db31215fd5d3a921dae748d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f062c68db31215fd5d3a921dae748d8");
            return;
        }
        if (addPhoneCalendarParam.switchToCalendar) {
            Intent a2 = a(addPhoneCalendarParam, msiContext);
            if (a2 == null) {
                return;
            }
            msiContext.startActivityForResult(a2, -1);
        } else {
            String str = addPhoneCalendarParam._mt == null ? "" : addPhoneCalendarParam._mt.sceneToken;
            ContentValues a3 = a(addPhoneCalendarParam, msiContext, str);
            if (a3 == null) {
                msiContext.onError(400, WMCalendarModule.ADD_CALENDAR_EVENT_ERROR);
                return;
            }
            Uri a4 = Privacy.createContentResolver(a.f(), str).a(Uri.parse("content://com.android.calendar/events"), a3);
            if (addPhoneCalendarParam.alarm) {
                ContentValues a5 = a(addPhoneCalendarParam, a4);
                if (a5 == null) {
                    msiContext.onError(500, WMCalendarModule.ADD_CALENDAR_ALARM_ERROR);
                    return;
                }
                Privacy.createContentResolver(a.f(), str).a(Uri.parse("content://com.android.calendar/reminders"), a5);
            }
        }
        msiContext.onSuccess(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r0.equals("week") != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    @com.meituan.msi.annotations.MsiApiMethod(name = "addPhoneRepeatCalendar", request = com.meituan.msi.api.calendar.AddPhoneRepeatCalendarParam.class)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addPhoneRepeatCalendar(com.meituan.msi.api.calendar.AddPhoneRepeatCalendarParam r17, com.meituan.msi.bean.MsiContext r18) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.calendar.CalendarApi.addPhoneRepeatCalendar(com.meituan.msi.api.calendar.AddPhoneRepeatCalendarParam, com.meituan.msi.bean.MsiContext):void");
    }

    private Intent a(AddPhoneCalendarParam addPhoneCalendarParam, MsiContext msiContext) {
        long j;
        long j2;
        Object[] objArr = {addPhoneCalendarParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea0c2670aaef52a5945775cb70093d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea0c2670aaef52a5945775cb70093d9");
        }
        if (b(addPhoneCalendarParam, msiContext)) {
            return null;
        }
        long j3 = addPhoneCalendarParam.startTime;
        long j4 = addPhoneCalendarParam.endTime;
        if (addPhoneCalendarParam.allDay) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j3 * 1000));
            calendar.setTimeZone(TimeZone.getDefault());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            j = calendar.getTimeInMillis();
            j2 = j;
        } else {
            j = j3 * 1000;
            j2 = j4 * 1000;
        }
        return new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j).putExtra("endTime", j2).putExtra("title", addPhoneCalendarParam.title).putExtra("description", addPhoneCalendarParam.description).putExtra("allDay", addPhoneCalendarParam.allDay).putExtra("eventTimezone", TimeZone.getDefault().getID()).putExtra("hasAlarm", addPhoneCalendarParam.alarm).putExtra("eventLocation", addPhoneCalendarParam.location);
    }

    private boolean b(AddPhoneCalendarParam addPhoneCalendarParam, MsiContext msiContext) {
        Object[] objArr = {addPhoneCalendarParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f0e6489421159c8c2af210d56c9244", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f0e6489421159c8c2af210d56c9244")).booleanValue();
        }
        long j = addPhoneCalendarParam.startTime;
        String str = addPhoneCalendarParam.title;
        long j2 = addPhoneCalendarParam.endTime;
        if (j == 0) {
            msiContext.onError(400, WMCalendarModule.START_TIME_UNDEFINED);
            return true;
        } else if (TextUtils.isEmpty(str)) {
            msiContext.onError(400, WMCalendarModule.TITLE_UNDEFINED);
            return true;
        } else if (j < 1000000000) {
            msiContext.onError(400, WMCalendarModule.START_TIME_ERROR);
            return true;
        } else if (addPhoneCalendarParam.allDay || j <= j2) {
            return false;
        } else {
            msiContext.onError(400, WMCalendarModule.TIME_ODER_ERROR);
            return true;
        }
    }

    private long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe66021e71e9e2ee99f4a31f84c8c12b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe66021e71e9e2ee99f4a31f84c8c12b")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.setTime(new Date(j * 1000));
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar2.getTimeInMillis();
    }

    private ContentValues a(AddPhoneCalendarParam addPhoneCalendarParam, Uri uri) {
        Object[] objArr = {addPhoneCalendarParam, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5de9f44dabdd8b6f8129145118df9a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5de9f44dabdd8b6f8129145118df9a9");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", Long.valueOf(ContentUris.parseId(uri)));
        if (!addPhoneCalendarParam.allDay) {
            contentValues.put("minutes", Integer.valueOf(addPhoneCalendarParam.alarmOffset / 60));
        }
        contentValues.put("method", (Integer) 1);
        return contentValues;
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea8b7130d8da91754d3cbbde10d9f24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea8b7130d8da91754d3cbbde10d9f24")).intValue();
        }
        Cursor a2 = Privacy.createContentResolver(a.f(), str).a(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        if (a2 == null) {
            return -1;
        }
        try {
            if (a2.getCount() <= 0) {
                if (a2 != null) {
                    a2.close();
                }
                return -1;
            }
            a2.moveToFirst();
            int i = a2.getInt(a2.getColumnIndex("_id"));
            if (a2 != null) {
                a2.close();
            }
            return i;
        } finally {
            if (a2 != null) {
                a2.close();
            }
        }
    }

    private ContentValues a(AddPhoneCalendarParam addPhoneCalendarParam, MsiContext msiContext, String str) {
        long j;
        long j2;
        Object[] objArr = {addPhoneCalendarParam, msiContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ca3355c3a1ebc2bbf099b4f90a0210", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ca3355c3a1ebc2bbf099b4f90a0210");
        }
        int a2 = a(str);
        if (a2 < 0) {
            msiContext.onError(500, WMCalendarModule.GET_CALENDAR_ACCOUNT_ERROR);
            return null;
        } else if (b(addPhoneCalendarParam, msiContext)) {
            return null;
        } else {
            long j3 = addPhoneCalendarParam.startTime;
            long j4 = addPhoneCalendarParam.endTime;
            if (addPhoneCalendarParam.allDay) {
                j = a(j3);
                j2 = a(j4);
            } else {
                j = j3 * 1000;
                j2 = j4 * 1000;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", addPhoneCalendarParam.title);
            contentValues.put("description", addPhoneCalendarParam.description);
            contentValues.put("calendar_id", Integer.valueOf(a2));
            contentValues.put("eventLocation", addPhoneCalendarParam.location);
            contentValues.put("dtstart", Long.valueOf(j));
            contentValues.put("dtend", Long.valueOf(j2));
            contentValues.put("hasAlarm", Boolean.valueOf(addPhoneCalendarParam.alarm));
            contentValues.put("allDay", Boolean.valueOf(addPhoneCalendarParam.allDay));
            contentValues.put("eventTimezone", TimeZone.getDefault().getID());
            return contentValues;
        }
    }
}
