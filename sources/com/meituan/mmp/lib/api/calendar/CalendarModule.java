package com.meituan.mmp.lib.api.calendar;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.CalendarContract;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CalendarModule extends ActivityApi {
    @SupportApiNames
    public static String[] API_NAMES = {WMCalendarModule.ADD_PHONE_CALENDAR, "addPhoneRepeatCalendar"};
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        char c;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f145d3ae58ec2b26861e63e7656fb513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f145d3ae58ec2b26861e63e7656fb513");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 550098086) {
            if (hashCode == 1957417899 && str.equals(WMCalendarModule.ADD_PHONE_CALENDAR)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("addPhoneRepeatCalendar")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "443f70be8598709dc5d476faf2b277da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "443f70be8598709dc5d476faf2b277da");
                    return;
                }
                if (jSONObject.optBoolean("switchToCalendar", true)) {
                    Intent b = b(jSONObject, iApiCallback);
                    if (b == null) {
                        return;
                    }
                    startActivityForResult(b, iApiCallback);
                } else {
                    ContentValues c2 = c(jSONObject, iApiCallback);
                    if (c2 == null) {
                        iApiCallback.onFail(codeJson(-1, WMCalendarModule.ADD_CALENDAR_EVENT_ERROR));
                        return;
                    }
                    Uri a = Privacy.createContentResolver(getContext(), getToken(jSONObject)).a(Uri.parse("content://com.android.calendar/events"), c2);
                    if (jSONObject.optBoolean(NotificationCompat.CATEGORY_ALARM, true)) {
                        ContentValues a2 = a(jSONObject, a);
                        if (a2 == null) {
                            iApiCallback.onFail(codeJson(-1, WMCalendarModule.ADD_CALENDAR_ALARM_ERROR));
                            return;
                        }
                        Privacy.createContentResolver(getContext(), getToken(jSONObject)).a(Uri.parse("content://com.android.calendar/reminders"), a2);
                    }
                }
                iApiCallback.onSuccess(null);
                return;
            case 1:
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d7884fdb4acc823d57ee4b5d40927ab9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d7884fdb4acc823d57ee4b5d40927ab9");
                    return;
                }
                if (jSONObject.optBoolean("switchToCalendar", true)) {
                    Intent b2 = b(jSONObject, iApiCallback);
                    if (b2 == null) {
                        return;
                    }
                    b2.putExtra("rrule", b(jSONObject));
                    startActivityForResult(b2, iApiCallback);
                } else {
                    ContentValues c3 = c(jSONObject, iApiCallback);
                    if (c3 == null) {
                        iApiCallback.onFail(codeJson(-1, WMCalendarModule.ADD_CALENDAR_EVENT_ERROR));
                        return;
                    }
                    c3.put("rrule", b(jSONObject));
                    Uri a3 = Privacy.createContentResolver(getContext(), getToken(jSONObject)).a(Uri.parse("content://com.android.calendar/events"), c3);
                    if (jSONObject.optBoolean(NotificationCompat.CATEGORY_ALARM, true)) {
                        ContentValues a4 = a(jSONObject, a3);
                        if (a4 == null) {
                            iApiCallback.onFail(codeJson(-1, WMCalendarModule.ADD_CALENDAR_ALARM_ERROR));
                        }
                        Privacy.createContentResolver(getContext(), getToken(jSONObject)).a(Uri.parse("content://com.android.calendar/reminders"), a4);
                    }
                }
                iApiCallback.onSuccess(null);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f0b7473ba45c696dde4e4effc1efac1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f0b7473ba45c696dde4e4effc1efac1");
        }
        if (Build.VERSION.SDK_INT >= 23 && !jSONObject.optBoolean("switchToCalendar", true)) {
            return new String[]{PermissionGuard.PERMISSION_CALENDAR};
        }
        return super.a(str, jSONObject);
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5a5738792a2386420d43792f7c5155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5a5738792a2386420d43792f7c5155");
            return;
        }
        super.onActivityResult(i, intent, iApiCallback);
        iApiCallback.onSuccess(null);
    }

    private boolean a(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133bddbf400d0314ea07fdcb635fde54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133bddbf400d0314ea07fdcb635fde54")).booleanValue();
        }
        Object opt = jSONObject.opt("startTime");
        Object opt2 = jSONObject.opt("title");
        Object opt3 = jSONObject.opt("endTime");
        if (opt3 == null) {
            opt3 = opt;
        }
        if (opt == null) {
            iApiCallback.onFail(codeJson(-1, WMCalendarModule.START_TIME_UNDEFINED));
            return true;
        } else if (opt2 == null || TextUtils.equals("", opt2.toString())) {
            iApiCallback.onFail(codeJson(-1, WMCalendarModule.TITLE_UNDEFINED));
            return true;
        } else if (opt.toString().length() < 10) {
            iApiCallback.onFail(codeJson(-1, WMCalendarModule.START_TIME_ERROR));
            return true;
        } else if (jSONObject.optBoolean("allDay") || Long.valueOf(opt.toString()).longValue() <= Long.valueOf(opt3.toString()).longValue()) {
            return false;
        } else {
            iApiCallback.onFail(codeJson(-1, WMCalendarModule.TIME_ODER_ERROR));
            return true;
        }
    }

    private Intent b(JSONObject jSONObject, IApiCallback iApiCallback) {
        long j;
        long j2;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f529bb7bfb5c81b48ffdb204b6014019", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f529bb7bfb5c81b48ffdb204b6014019");
        }
        if (a(jSONObject, iApiCallback)) {
            return null;
        }
        long optLong = jSONObject.optLong("startTime");
        long optLong2 = jSONObject.optLong("endTime", optLong);
        if (jSONObject.optBoolean("allDay")) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(optLong * 1000));
            calendar.setTimeZone(TimeZone.getDefault());
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
            j = calendar.getTimeInMillis();
            j2 = j;
        } else {
            j = optLong * 1000;
            j2 = optLong2 * 1000;
        }
        Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j).putExtra("endTime", j2).putExtra("title", jSONObject.optString("title"));
        return putExtra.putExtra("description", jSONObject.optString("description") + jSONObject.optString("url")).putExtra("allDay", jSONObject.optBoolean("allDay")).putExtra("eventTimezone", TimeZone.getDefault().getID()).putExtra("hasAlarm", jSONObject.optBoolean(NotificationCompat.CATEGORY_ALARM)).putExtra("eventLocation", jSONObject.optString("location"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r1.equals(com.meituan.msi.api.component.picker.bean.DatePickerParam.FIELD_DAY) != false) goto L15;
     */
    @android.annotation.SuppressLint({"SimpleDateFormat"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(org.json.JSONObject r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.api.calendar.CalendarModule.h
            java.lang.String r11 = "39f766e05570b70bf52c0e5340e9c6e1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L1e:
            java.lang.String r1 = "repeatInterval"
            java.lang.String r1 = r13.optString(r1)
            java.lang.String r2 = "repeatEndTime"
            long r2 = r13.optLong(r2)
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "FREQ="
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 99228(0x1839c, float:1.39048E-40)
            if (r4 == r5) goto L5d
            r0 = 3645428(0x379ff4, float:5.108333E-39)
            if (r4 == r0) goto L52
            r0 = 3704893(0x38883d, float:5.191661E-39)
            if (r4 == r0) goto L47
            goto L66
        L47:
            java.lang.String r0 = "year"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L66
            r0 = 0
            goto L67
        L52:
            java.lang.String r0 = "week"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L66
            r0 = 2
            goto L67
        L5d:
            java.lang.String r4 = "day"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L66
            goto L67
        L66:
            r0 = -1
        L67:
            switch(r0) {
                case 0: goto La0;
                case 1: goto L8e;
                case 2: goto L7c;
                default: goto L6a;
            }
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "MONTHLY"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lb1
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "WEEKLY"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lb1
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "DAILY"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lb1
        La0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "YEARLY"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lb1:
            if (r13 == 0) goto Leb
            java.lang.String r1 = r13.toString()
            int r1 = r1.length()
            r2 = 10
            if (r1 < r2) goto Leb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ";UNTIL="
            r1.append(r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMdd'T'HHmmss'Z'"
            r0.<init>(r2)
            long r2 = r13.longValue()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.String r13 = r0.format(r13)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.calendar.CalendarModule.b(org.json.JSONObject):java.lang.String");
    }

    private int c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d550316e862bbf168ba69d1aaf63ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d550316e862bbf168ba69d1aaf63ef")).intValue();
        }
        Cursor a = Privacy.createContentResolver(getContext(), getToken(jSONObject)).a(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        if (a == null) {
            return -1;
        }
        try {
            if (a.getCount() <= 0) {
                if (a != null) {
                    a.close();
                }
                return -1;
            }
            a.moveToFirst();
            int i = a.getInt(a.getColumnIndex("_id"));
            if (a != null) {
                a.close();
            }
            return i;
        } finally {
            if (a != null) {
                a.close();
            }
        }
    }

    private long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867ce536754c50be7f725c88ed8b834a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867ce536754c50be7f725c88ed8b834a")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.setTime(new Date(j * 1000));
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar2.getTimeInMillis();
    }

    private ContentValues a(JSONObject jSONObject, Uri uri) {
        Object[] objArr = {jSONObject, uri};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a23ddf33beb6c604b774939799301b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a23ddf33beb6c604b774939799301b");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", Long.valueOf(ContentUris.parseId(uri)));
        if (!jSONObject.optBoolean("allDay")) {
            contentValues.put("minutes", Long.valueOf(jSONObject.optLong("alarmOffset", 0L) / 60));
        }
        contentValues.put("method", (Integer) 1);
        return contentValues;
    }

    private ContentValues c(JSONObject jSONObject, IApiCallback iApiCallback) {
        long j;
        long j2;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6411fffb200f7aff83887e8d9f71faf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6411fffb200f7aff83887e8d9f71faf4");
        }
        int c = c(jSONObject);
        if (c < 0) {
            iApiCallback.onFail(codeJson(-1, WMCalendarModule.GET_CALENDAR_ACCOUNT_ERROR));
            return null;
        } else if (a(jSONObject, iApiCallback)) {
            return null;
        } else {
            long optLong = jSONObject.optLong("startTime");
            long optLong2 = jSONObject.optLong("endTime", optLong);
            if (jSONObject.optBoolean("allDay")) {
                j = a(optLong);
                j2 = a(optLong2);
            } else {
                j = optLong * 1000;
                j2 = optLong2 * 1000;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", jSONObject.optString("title"));
            contentValues.put("description", jSONObject.optString("description") + jSONObject.optString("url"));
            contentValues.put("calendar_id", Integer.valueOf(c));
            contentValues.put("eventLocation", jSONObject.optString("location"));
            contentValues.put("dtstart", Long.valueOf(j));
            contentValues.put("dtend", Long.valueOf(j2));
            contentValues.put("hasAlarm", Boolean.valueOf(jSONObject.optBoolean(NotificationCompat.CATEGORY_ALARM, true)));
            contentValues.put("allDay", Boolean.valueOf(jSONObject.optBoolean("allDay")));
            contentValues.put("eventTimezone", TimeZone.getDefault().getID());
            return contentValues;
        }
    }
}
