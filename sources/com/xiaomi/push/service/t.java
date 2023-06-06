package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.hg;
import com.xiaomi.push.jj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@TargetApi(24)
/* loaded from: classes6.dex */
public final class t {
    private static t a = new t();

    /* loaded from: classes6.dex */
    public class a {
        List<b> a;
        List<b> b;

        private a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b {
        int a;
        Notification b;

        public b(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        public final String toString() {
            return "id:" + this.a;
        }
    }

    private t() {
    }

    private static int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    public static t a() {
        return a;
    }

    private static String a(Notification notification) {
        if (notification == null || notification.extras == null) {
            return null;
        }
        return notification.extras.getString("push_src_group_name");
    }

    private static List<StatusBarNotification> a(w wVar) {
        List<StatusBarNotification> c = wVar != null ? wVar.c() : null;
        if (c == null || c.size() == 0) {
            return null;
        }
        return c;
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return d(notification) ? a(notification) : notification.getGroup();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private static boolean c(Notification notification) {
        if (notification != null) {
            Object a2 = com.xiaomi.push.am.a((Object) notification, "isGroupSummary", (Object[]) null);
            if (a2 instanceof Boolean) {
                return ((Boolean) a2).booleanValue();
            }
            return false;
        }
        return false;
    }

    private boolean d(Notification notification) {
        if (notification == null || notification.getGroup() == null || notification.extras == null) {
            return false;
        }
        long j = notification.extras.getLong("push_src_group_time");
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(j), a(notification)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i, Notification notification) {
        String str;
        String d = x.d(notification);
        if (TextUtils.isEmpty(d)) {
            str = "group restore not extract pkg from notification:" + i;
        } else {
            w a2 = w.a(context, d);
            List<StatusBarNotification> a3 = a(a2);
            if (a3 != null) {
                for (StatusBarNotification statusBarNotification : a3) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (notification2 != null && d(notification2) && statusBarNotification.getId() != i) {
                        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                        recoverBuilder.setGroup(a(notification2));
                        x.a(recoverBuilder, c(notification2));
                        a2.a(statusBarNotification.getId(), recoverBuilder.build());
                        com.xiaomi.channel.commonutils.logger.c.b("group restore notification:" + statusBarNotification.getId());
                    }
                }
                return;
            }
            str = "group restore not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.c.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Context context) {
        if (b(context) && w.a(context)) {
            return z.a(context).a(hg.LatestNotificationNotIntoGroupSwitch.by, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return z.a(context).a(hg.NotificationAutoGroupSwitch.by, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i, Notification notification, boolean z) {
        String str;
        Notification.Builder defaults;
        String str2;
        String d = x.d(notification);
        if (TextUtils.isEmpty(d)) {
            str2 = "group auto not extract pkg from notification:" + i;
        } else {
            List<StatusBarNotification> a2 = a(w.a(context, d));
            if (a2 != null) {
                String b2 = b(notification);
                HashMap hashMap = new HashMap();
                for (StatusBarNotification statusBarNotification : a2) {
                    if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                        String b3 = b(statusBarNotification.getNotification());
                        a aVar = (a) hashMap.get(b3);
                        if (aVar == null) {
                            aVar = new a();
                            hashMap.put(b3, aVar);
                        }
                        (c(statusBarNotification.getNotification()) ? aVar.b : aVar.a).add(new b(statusBarNotification.getId(), statusBarNotification.getNotification()));
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str3)) {
                        a aVar2 = (a) entry.getValue();
                        if (str3.equals(b2) && !d(notification)) {
                            (c(notification) ? aVar2.b : aVar2.a).add(new b(i, notification));
                        }
                        int size = aVar2.a.size();
                        if (aVar2.b.size() <= 0) {
                            if (size >= 2) {
                                Notification notification2 = aVar2.a.get(0).b;
                                try {
                                    if (TextUtils.isEmpty(str3)) {
                                        str = "group show summary group is null";
                                    } else {
                                        int a3 = x.a(context, d);
                                        if (a3 == 0) {
                                            str = "group show summary not get icon from " + d;
                                        } else {
                                            w a4 = w.a(context, d);
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                String b4 = w.b(notification2.getChannelId(), "groupSummary");
                                                NotificationChannel b5 = a4.b(b4);
                                                if ("groupSummary".equals(b4) && b5 == null) {
                                                    a4.a(new NotificationChannel(b4, "group_summary", 3));
                                                }
                                                defaults = new Notification.Builder(context, b4);
                                            } else {
                                                defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
                                            }
                                            x.a(defaults, true);
                                            Notification build = defaults.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(d, a3)).setAutoCancel(true).setGroup(str3).setGroupSummary(true).build();
                                            if (!jj.d() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                                                x.a(build, d);
                                            }
                                            int a5 = a(d, str3);
                                            a4.a(a5, build);
                                            com.xiaomi.channel.commonutils.logger.c.b("group show summary notify:" + a5);
                                        }
                                    }
                                    com.xiaomi.channel.commonutils.logger.c.a(str);
                                } catch (Exception e) {
                                    com.xiaomi.channel.commonutils.logger.c.a("group show summary error " + e);
                                }
                            }
                        } else if (size <= 0) {
                            com.xiaomi.channel.commonutils.logger.c.b("group cancel summary:" + str3);
                            w.a(context, d).a(a(d, str3));
                        }
                    }
                }
                return;
            }
            str2 = "group auto not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.c.a(str2);
    }
}
