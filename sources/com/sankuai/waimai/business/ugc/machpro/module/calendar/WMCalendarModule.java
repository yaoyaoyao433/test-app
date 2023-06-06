package com.sankuai.waimai.business.ugc.machpro.module.calendar;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.b;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMCalendarModule extends MPModule {
    public static final String ADD_CALENDAR_ALARM_ERROR = "add calendar alarm error";
    public static final String ADD_CALENDAR_EVENT_ERROR = "add calendar event error";
    public static final String ADD_PHONE_CALENDAR = "addPhoneCalendar";
    public static final String CALENDAR_READ_PERMISSION_ERROR = "get calendar read permission error";
    public static final String CALENDAR_WRITE_PERMISSION_ERROR = "get calendar write permission error";
    private static final String CALENDER_EVENT_URL = "content://com.android.calendar/events";
    private static final String CALENDER_REMINDER_URL = "content://com.android.calendar/reminders";
    private static final String CALENDER_URL = "content://com.android.calendar/calendars";
    public static final String EXC_ERROR = "exc error: ";
    public static final String GET_CALENDAR_ACCOUNT_ERROR = "get calendar account error";
    public static final String START_TIME_ERROR = "param error: param.startTime should be correct Unix timestamp";
    public static final String START_TIME_UNDEFINED = "param error: param.startTime is undefined";
    public static final String TIME_ODER_ERROR = "param error: param.startTime need to be less than param.endTime";
    public static final String TITLE_UNDEFINED = "param error: param.title is undefined";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, int i);
    }

    public WMCalendarModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e523dc82e143e91b0babad68df43cc86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e523dc82e143e91b0babad68df43cc86");
        }
    }

    @JSMethod(methodName = ADD_PHONE_CALENDAR)
    public void addPhoneCalendar(MachMap machMap, final MPJSCallBack mPJSCallBack, final MPJSCallBack mPJSCallBack2) {
        com.sankuai.waimai.business.ugc.machpro.module.calendar.a aVar;
        Object[] objArr = {machMap, mPJSCallBack, mPJSCallBack2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ba8d5b06f024cb4f4437ff5bda3ba46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ba8d5b06f024cb4f4437ff5bda3ba46");
            return;
        }
        Object[] objArr2 = {machMap};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.ugc.machpro.module.calendar.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a58c7850822e669bf8d5996c4a3f471e", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.business.ugc.machpro.module.calendar.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a58c7850822e669bf8d5996c4a3f471e");
        } else {
            aVar = new com.sankuai.waimai.business.ugc.machpro.module.calendar.a();
            Object[] objArr3 = {machMap};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.ugc.machpro.module.calendar.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "30da74148de47d897ac7d60074bc0802", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "30da74148de47d897ac7d60074bc0802");
            } else {
                aVar.b = b.a(machMap.get("sceneToken"), "");
                aVar.c = b.a(machMap.get("title"), "");
                aVar.d = com.sankuai.waimai.business.ugc.machpro.module.calendar.a.a(machMap.get("startTime"));
                aVar.e = machMap.containsKey("switchToCalendar") ? b.d(machMap.get("switchToCalendar")) : aVar.e;
                aVar.f = b.d(machMap.get("allDay"));
                aVar.g = b.a(machMap.get("description"), "");
                aVar.h = b.a(machMap.get("location"), "");
                aVar.i = com.sankuai.waimai.business.ugc.machpro.module.calendar.a.a(machMap.get("endTime"));
                aVar.i = aVar.i == 0 ? aVar.d : aVar.i;
                aVar.j = machMap.containsKey(NotificationCompat.CATEGORY_ALARM) ? b.d(machMap.get(NotificationCompat.CATEGORY_ALARM)) : aVar.j;
                aVar.k = b.c(machMap.get("alarmOffset"));
            }
        }
        final com.sankuai.waimai.business.ugc.machpro.module.calendar.a aVar2 = aVar;
        if (aVar2.e) {
            Intent openCalendarIntent = getOpenCalendarIntent(aVar2, mPJSCallBack2);
            if (openCalendarIntent == null) {
                return;
            }
            getMachContext().getContext().startActivity(openCalendarIntent);
            return;
        }
        final String str = aVar2.b;
        checkAndRequestPermission(com.sankuai.waimai.foundation.utils.activity.a.a().b(), PermissionGuard.PERMISSION_CALENDAR_WRITE, str, false, true, new a() { // from class: com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.a
            public final void a(boolean z, int i) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "65a913b05f6e1d7f3d55137e63a5eb09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "65a913b05f6e1d7f3d55137e63a5eb09");
                } else if (z) {
                    ContentValues calendarEvent = WMCalendarModule.this.getCalendarEvent(aVar2, mPJSCallBack2, str);
                    if (calendarEvent == null) {
                        return;
                    }
                    try {
                        Uri a2 = Privacy.createContentResolver(com.meituan.msi.a.f(), str).a(Uri.parse(WMCalendarModule.CALENDER_EVENT_URL), calendarEvent);
                        if (aVar2.j) {
                            ContentValues alarmEvent = WMCalendarModule.this.getAlarmEvent(aVar2, a2);
                            if (alarmEvent == null) {
                                mPJSCallBack2.invoke(WMCalendarModule.ADD_CALENDAR_ALARM_ERROR);
                                return;
                            }
                            Privacy.createContentResolver(com.meituan.msi.a.f(), str).a(Uri.parse(WMCalendarModule.CALENDER_REMINDER_URL), alarmEvent);
                        }
                        mPJSCallBack.invoke((MachMap) null);
                    } catch (Exception e) {
                        MPJSCallBack mPJSCallBack3 = mPJSCallBack2;
                        mPJSCallBack3.invoke(WMCalendarModule.EXC_ERROR + e.toString());
                    }
                } else {
                    mPJSCallBack2.invoke(WMCalendarModule.CALENDAR_WRITE_PERMISSION_ERROR);
                }
            }
        });
    }

    private Intent getOpenCalendarIntent(com.sankuai.waimai.business.ugc.machpro.module.calendar.a aVar, MPJSCallBack mPJSCallBack) {
        long j;
        long j2;
        Object[] objArr = {aVar, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34acf1c5bd59958389c2b9ddae570ba1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34acf1c5bd59958389c2b9ddae570ba1");
        }
        if (isErrorParam(aVar, mPJSCallBack)) {
            return null;
        }
        long j3 = aVar.d;
        long j4 = aVar.i;
        if (aVar.f) {
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
        return new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j).putExtra("endTime", j2).putExtra("title", aVar.c).putExtra("description", aVar.g).putExtra("allDay", aVar.f).putExtra("eventTimezone", TimeZone.getDefault().getID()).putExtra("hasAlarm", aVar.j).putExtra("eventLocation", aVar.h);
    }

    private boolean isErrorParam(com.sankuai.waimai.business.ugc.machpro.module.calendar.a aVar, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {aVar, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce2c2221dee3bf587473c848bf4a0d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce2c2221dee3bf587473c848bf4a0d8")).booleanValue();
        }
        long j = aVar.d;
        String str = aVar.c;
        long j2 = aVar.i;
        if (j == 0) {
            mPJSCallBack.invoke(START_TIME_UNDEFINED);
            return true;
        } else if (TextUtils.isEmpty(str)) {
            mPJSCallBack.invoke(TITLE_UNDEFINED);
            return true;
        } else if (j < 1000000000) {
            mPJSCallBack.invoke(START_TIME_ERROR);
            return true;
        } else if (aVar.f || j <= j2) {
            return false;
        } else {
            mPJSCallBack.invoke(TIME_ODER_ERROR);
            return true;
        }
    }

    private long getAllDayTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cfda0684a215fbc15871c37d6ec8223", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cfda0684a215fbc15871c37d6ec8223")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.setTime(new Date(j * 1000));
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar2.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContentValues getAlarmEvent(com.sankuai.waimai.business.ugc.machpro.module.calendar.a aVar, Uri uri) {
        Object[] objArr = {aVar, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85cc353dd7a0609ab19fddadd5539c33", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85cc353dd7a0609ab19fddadd5539c33");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", Long.valueOf(uri == null ? -1L : ContentUris.parseId(uri)));
        if (!aVar.f) {
            contentValues.put("minutes", Integer.valueOf(aVar.k / 60));
        }
        contentValues.put("method", (Integer) 1);
        return contentValues;
    }

    private int checkCalendarAccount(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7fbc9020a5fe791d99cb02c62da9956", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7fbc9020a5fe791d99cb02c62da9956")).intValue();
        }
        Cursor a2 = Privacy.createContentResolver(com.meituan.msi.a.f(), str).a(Uri.parse(CALENDER_URL), null, null, null, null);
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

    /* JADX INFO: Access modifiers changed from: private */
    public ContentValues getCalendarEvent(com.sankuai.waimai.business.ugc.machpro.module.calendar.a aVar, MPJSCallBack mPJSCallBack, String str) {
        long j;
        long j2;
        Object[] objArr = {aVar, mPJSCallBack, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "312403d7ddb2e569123c917bbf0f1477", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "312403d7ddb2e569123c917bbf0f1477");
        }
        int checkCalendarAccount = checkCalendarAccount(str);
        if (checkCalendarAccount < 0) {
            mPJSCallBack.invoke(GET_CALENDAR_ACCOUNT_ERROR);
            return null;
        } else if (isErrorParam(aVar, mPJSCallBack)) {
            return null;
        } else {
            long j3 = aVar.d;
            long j4 = aVar.i;
            if (aVar.f) {
                j = getAllDayTime(j3);
                j2 = getAllDayTime(j4);
            } else {
                j = j3 * 1000;
                j2 = j4 * 1000;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", aVar.c);
            contentValues.put("description", aVar.g);
            contentValues.put("calendar_id", Integer.valueOf(checkCalendarAccount));
            contentValues.put("eventLocation", aVar.h);
            contentValues.put("dtstart", Long.valueOf(j));
            contentValues.put("dtend", Long.valueOf(j2));
            contentValues.put("hasAlarm", Boolean.valueOf(aVar.j));
            contentValues.put("allDay", Boolean.valueOf(aVar.f));
            contentValues.put("eventTimezone", TimeZone.getDefault().getID());
            return contentValues;
        }
    }

    public static void checkAndRequestPermission(Activity activity, final String str, final String str2, final boolean z, final boolean z2, final a aVar) {
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c8b8890fa37cf969a1e6815133f5596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c8b8890fa37cf969a1e6815133f5596");
        } else if (activity == null || TextUtils.isEmpty(str)) {
            aVar.a(false, -100);
        } else {
            final WeakReference weakReference = new WeakReference(activity);
            checkSelfPermission(activity, str, str2, z2, new a() { // from class: com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.a
                public final void a(boolean z3, int i) {
                    Object[] objArr2 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a3699e29cbb92ceeb77cb2daed36e42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a3699e29cbb92ceeb77cb2daed36e42");
                    } else if (z3) {
                        if (a.this != null) {
                            a.this.a(true, i);
                        }
                    } else if (z) {
                        if (a.this != null) {
                            a.this.a(false, i);
                        }
                    } else {
                        Activity activity2 = (Activity) weakReference.get();
                        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                            if (a.this != null) {
                                a.this.a(false, -100);
                                return;
                            }
                            return;
                        }
                        WMCalendarModule.requestPermission(activity2, str, str2, z2, a.this);
                    }
                }
            });
        }
    }

    public static void checkSelfPermission(Context context, String str, String str2, boolean z, final a aVar) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0471182021f8e4c111f57a4d8d96e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0471182021f8e4c111f57a4d8d96e7d");
        } else if (context == null) {
            if (aVar != null) {
                aVar.a(false, -100);
            }
        } else {
            e check = check(str);
            if (check != null) {
                check.a(context, str, str2, z ? new g() { // from class: com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str3, int i) {
                        Object[] objArr2 = {str3, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8ce42a60ca0d9deb9510b43e33c13279", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8ce42a60ca0d9deb9510b43e33c13279");
                        } else if (a.this != null) {
                            a.this.a(i > 0, i);
                        }
                    }
                } : new d() { // from class: com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str3, int i) {
                        Object[] objArr2 = {str3, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34674b5e43fac873b1d8f38ebe07872a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34674b5e43fac873b1d8f38ebe07872a");
                        } else if (a.this != null) {
                            a.this.a(i > 0, i);
                        }
                    }
                });
            } else if (aVar != null) {
                aVar.a(false, -100);
            }
        }
    }

    public static void requestPermission(Activity activity, String str, String str2, boolean z, final a aVar) {
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0968e2a8140d010e8cba513867461e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0968e2a8140d010e8cba513867461e8");
            return;
        }
        e check = check(str);
        if (check != null) {
            check.a(activity, str, str2, z ? new g() { // from class: com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                    Object[] objArr2 = {str3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de52a24e3aa4e174cbc1c1bab7f73db1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de52a24e3aa4e174cbc1c1bab7f73db1");
                    } else if (a.this != null) {
                        a.this.a(i > 0, i);
                    }
                }
            } : new d() { // from class: com.sankuai.waimai.business.ugc.machpro.module.calendar.WMCalendarModule.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                    Object[] objArr2 = {str3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ec960ac9be3f282d58748a32486827c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ec960ac9be3f282d58748a32486827c");
                    } else if (a.this != null) {
                        a.this.a(i > 0, i);
                    }
                }
            });
        } else if (aVar != null) {
            aVar.a(false, -1);
        }
    }

    private static e check(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "414916ef9a82e2931609cd93c0961e08", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "414916ef9a82e2931609cd93c0961e08");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Privacy.createPermissionGuard();
    }
}
