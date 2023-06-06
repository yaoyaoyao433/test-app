package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.dianping.picasso.PicassoUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.push.ej;
import com.xiaomi.push.ha;
import com.xiaomi.push.ho;
import com.xiaomi.push.hx;
import com.xiaomi.push.jj;
import com.xiaomi.push.js;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class l {
    public static long a;
    private static final LinkedList<Pair<Integer, hx>> b = new LinkedList<>();
    private static ExecutorService c = Executors.newCachedThreadPool();
    private static volatile r d;

    /* loaded from: classes6.dex */
    public static class b {
        Notification a;
        long b = 0;
    }

    /* loaded from: classes6.dex */
    public static class c {
        public String a;
        public long b = 0;
        public boolean c = false;
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, PicassoUtils.DEF_TYPE, str);
        }
        return 0;
    }

    private static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Context r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, int r8) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.l.a(android.content.Context, java.lang.String, java.util.Map, int):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.Intent a(android.content.Context r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.l.a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }

    private static Bitmap a(Context context, String str, boolean z) {
        Future submit = c.submit(new a(str, context, z));
        try {
            try {
                Bitmap bitmap = (Bitmap) submit.get(180L, TimeUnit.SECONDS);
                return bitmap == null ? bitmap : bitmap;
            } finally {
                submit.cancel(true);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            submit.cancel(true);
            return null;
        }
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static String a(Map<String, String> map, int i) {
        String format = i == 0 ? "notify_effect" : b(map) ? String.format("cust_btn_%s_ne", Integer.valueOf(i)) : i == 1 ? "notification_style_button_left_notify_effect" : i == 2 ? "notification_style_button_mid_notify_effect" : i == 3 ? "notification_style_button_right_notify_effect" : i == 4 ? "notification_colorful_button_notify_effect" : null;
        if (map == null || format == null) {
            return null;
        }
        return map.get(format);
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static void a(Context context, String str, int i) {
        a(context, str, i, -1);
    }

    public static void a(Context context, String str, int i, int i2) {
        boolean z;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        w a2 = w.a(context, str);
        List<StatusBarNotification> c2 = a2.c();
        if (js.a(c2)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        int i3 = 0;
        if (i == -1) {
            z = true;
        } else {
            i3 = ((str.hashCode() / 10) * 10) + i;
            z = false;
        }
        Iterator<StatusBarNotification> it = c2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            StatusBarNotification next = it.next();
            if (!TextUtils.isEmpty(String.valueOf(next.getId()))) {
                int id = next.getId();
                if (z) {
                    linkedList.add(next);
                    a2.a(id);
                } else if (i3 == id) {
                    by.a(context, next, i2);
                    linkedList.add(next);
                    a2.a(id);
                    break;
                }
            }
        }
        a(context, linkedList);
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        w a2 = w.a(context, str);
        List<StatusBarNotification> c2 = a2.c();
        if (js.a(c2)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : c2) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String a3 = x.a(notification);
                String b2 = x.b(notification);
                if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(b2) && a(a3, str2) && a(b2, str3)) {
                    linkedList.add(statusBarNotification);
                    a2.a(id);
                }
            }
        }
        a(context, linkedList);
    }

    private static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList.size() > 0) {
            az.a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
        }
    }

    public static boolean a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    public static boolean a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    private static int b(Context context, String str, Map<String, String> map, int i) {
        ComponentName a2;
        Intent a3 = a(context, str, map, i);
        if (a3 == null || (a2 = cg.a(context, a3)) == null) {
            return 0;
        }
        return a2.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    private static boolean b(Map<String, String> map) {
        if (map == null) {
            com.xiaomi.channel.commonutils.logger.c.a("meta extra is null");
            return false;
        }
        return "6".equals(map.get("notification_style_type"));
    }

    private static int c(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static Intent c(Context context, String str, Map<String, String> map, int i) {
        if (b(map)) {
            return a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)));
        }
        switch (i) {
            case 1:
                return a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
            case 2:
                return a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
            case 3:
                return a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
            case 4:
                return a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
            default:
                return null;
        }
    }

    public static void c(Context context, String str) {
        if (!jj.a(context) || d == null || TextUtils.isEmpty(str)) {
        }
    }

    private static int d(Map<String, String> map) {
        if (map != null) {
            String str = map.get("channel_importance");
            if (TextUtils.isEmpty(str)) {
                return 3;
            }
            try {
                com.xiaomi.channel.commonutils.logger.c.c("importance=" + str);
                return Integer.parseInt(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.d("parsing channel importance error: " + e);
                return 3;
            }
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    private static int e(Map<String, String> map) {
        if (map != null) {
            String str = map.get("notification_priority");
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                com.xiaomi.channel.commonutils.logger.c.c("priority=" + str);
                return Integer.parseInt(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.d("parsing notification priority error: " + e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    public static boolean f(hx hxVar) {
        return b(hxVar) || d(hxVar) || c(hxVar);
    }

    public static String g(hx hxVar) {
        return b(hxVar) ? "E100002" : d(hxVar) ? "E100000" : c(hxVar) ? "E100001" : e(hxVar) ? "E100003" : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class a implements Callable<Bitmap> {
        private String a;
        private Context b;
        private boolean c;

        public a(String str, Context context, boolean z) {
            this.b = context;
            this.a = str;
            this.c = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Bitmap call() {
            if (TextUtils.isEmpty(this.a)) {
                com.xiaomi.channel.commonutils.logger.c.a("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            } else if (this.a.startsWith("http")) {
                return v.a(this.b, this.a, this.c).a;
            } else {
                Bitmap a = v.a(this.b, this.a);
                if (a == null) {
                    com.xiaomi.channel.commonutils.logger.c.a("Failed get online picture/icon resource");
                    return a;
                }
                return a;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0321 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.xiaomi.push.service.l.c a(android.content.Context r21, com.xiaomi.push.hx r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.l.a(android.content.Context, com.xiaomi.push.hx, byte[]):com.xiaomi.push.service.l$c");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.PendingIntent a(android.content.Context r16, com.xiaomi.push.hx r17, java.lang.String r18, byte[] r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.l.a(android.content.Context, com.xiaomi.push.hx, java.lang.String, byte[], int, int, boolean):android.app.PendingIntent");
    }

    private static void a(Context context, Intent intent, hx hxVar, ho hoVar, String str, int i) {
        if (hxVar == null || hoVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String a2 = a(hoVar.j, i);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        if (ak.a.equals(a2) || ak.b.equals(a2) || ak.c.equals(a2)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", hxVar.e);
            if (!TextUtils.isEmpty(hxVar.f)) {
                intent.putExtra(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, hxVar.f);
            }
            intent.putExtra("job_key", a(hoVar.j, "jobkey"));
            intent.putExtra(i + "_target_component", b(context, hxVar.f, hoVar.j, i));
        }
    }

    private static boolean a(Context context, hx hxVar, String str) {
        if (hxVar != null && hxVar.h != null && hxVar.h.j != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(hxVar.h.j.get("use_clicked_activity")) && cg.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.c.a("should clicked activity params are null.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x070f  */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v99 */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.l.b a(android.content.Context r30, com.xiaomi.push.hx r31, byte[] r32, android.widget.RemoteViews r33, android.app.PendingIntent r34, int r35) {
        /*
            Method dump skipped, instructions count: 1953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.l.a(android.content.Context, com.xiaomi.push.hx, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.l$b");
    }

    @TargetApi(16)
    private static void a(ej ejVar, Context context, String str, hx hxVar, byte[] bArr, int i) {
        PendingIntent a2;
        PendingIntent a3;
        PendingIntent a4;
        PendingIntent a5;
        Map<String, String> map = hxVar.h.j;
        if (TextUtils.equals("3", map.get("notification_style_type")) || TextUtils.equals("4", map.get("notification_style_type"))) {
            return;
        }
        if (b(map)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = map.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (a5 = a(context, str, hxVar, bArr, i, i2)) != null) {
                    ejVar.addAction(0, str2, a5);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(map.get("notification_style_button_left_name")) && (a4 = a(context, str, hxVar, bArr, i, 1)) != null) {
            ejVar.addAction(0, map.get("notification_style_button_left_name"), a4);
        }
        if (!TextUtils.isEmpty(map.get("notification_style_button_mid_name")) && (a3 = a(context, str, hxVar, bArr, i, 2)) != null) {
            ejVar.addAction(0, map.get("notification_style_button_mid_name"), a3);
        }
        if (TextUtils.isEmpty(map.get("notification_style_button_right_name")) || (a2 = a(context, str, hxVar, bArr, i, 3)) == null) {
            return;
        }
        ejVar.addAction(0, map.get("notification_style_button_right_name"), a2);
    }

    private static PendingIntent a(Context context, String str, hx hxVar, byte[] bArr, int i, int i2) {
        Map<String, String> map = hxVar.h.j;
        if (map == null) {
            return null;
        }
        boolean a2 = a(context, hxVar, str);
        if (a2) {
            return a(context, hxVar, str, bArr, i, i2, a2);
        }
        Intent c2 = c(context, str, map, i2);
        if (c2 != null) {
            return PendingIntent.getActivity(context, 0, c2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 134217728);
        }
        return null;
    }

    private static RemoteViews b(Context context, hx hxVar, byte[] bArr) {
        ho hoVar = hxVar.h;
        String a2 = a(hxVar);
        if (hoVar == null || hoVar.j == null) {
            return null;
        }
        Map<String, String> map = hoVar.j;
        String str = map.get("layout_name");
        String str2 = map.get("layout_value");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a2);
                int identifier = resourcesForApplication.getIdentifier(str, "layout", a2);
                if (identifier == 0) {
                    return null;
                }
                RemoteViews remoteViews = new RemoteViews(a2, identifier);
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("text")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String string = jSONObject2.getString(next);
                            int identifier2 = resourcesForApplication.getIdentifier(next, "id", a2);
                            if (identifier2 > 0) {
                                remoteViews.setTextViewText(identifier2, string);
                            }
                        }
                    }
                    if (jSONObject.has("image")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                        Iterator<String> keys2 = jSONObject3.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            String string2 = jSONObject3.getString(next2);
                            int identifier3 = resourcesForApplication.getIdentifier(next2, "id", a2);
                            int identifier4 = resourcesForApplication.getIdentifier(string2, PicassoUtils.DEF_TYPE, a2);
                            if (identifier3 > 0) {
                                remoteViews.setImageViewResource(identifier3, identifier4);
                            }
                        }
                    }
                    if (jSONObject.has("time")) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                        Iterator<String> keys3 = jSONObject4.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            String string3 = jSONObject4.getString(next3);
                            if (string3.length() == 0) {
                                string3 = "yy-MM-dd hh:mm";
                            }
                            int identifier5 = resourcesForApplication.getIdentifier(next3, "id", a2);
                            if (identifier5 > 0) {
                                remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                            }
                        }
                    }
                    return remoteViews;
                } catch (JSONException e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                com.xiaomi.channel.commonutils.logger.c.a(e2);
            }
        }
        return null;
    }

    public static String a(hx hxVar) {
        ho hoVar;
        if ("com.xiaomi.xmsf".equals(hxVar.f) && (hoVar = hxVar.h) != null && hoVar.j != null) {
            String str = hoVar.j.get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return hxVar.f;
    }

    public static void b(Context context, String str) {
        a(context, str, -1, -1);
    }

    private static boolean a(ho hoVar) {
        if (hoVar != null) {
            String str = hoVar.a;
            return !TextUtils.isEmpty(str) && str.length() == 22 && "satuigmo".indexOf(str.charAt(0)) >= 0;
        }
        return false;
    }

    public static boolean b(hx hxVar) {
        ho hoVar = hxVar.h;
        return a(hoVar) && hoVar.l;
    }

    public static boolean c(hx hxVar) {
        ho hoVar = hxVar.h;
        return a(hoVar) && hoVar.h == 1 && !b(hxVar);
    }

    public static boolean d(hx hxVar) {
        ho hoVar = hxVar.h;
        return a(hoVar) && hoVar.h == 0 && !b(hxVar);
    }

    public static boolean e(hx hxVar) {
        return hxVar.a == ha.Registration;
    }
}
