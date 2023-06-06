package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.StringUtil;
import com.xiaomi.push.ho;
import com.xiaomi.push.jj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes6.dex */
public final class s {
    private static final boolean a = Log.isLoggable("NCHelper", 3);

    @TargetApi(26)
    private static NotificationChannel a(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ho hoVar) {
        if (hoVar == null || hoVar.j == null || !hoVar.j.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        hoVar.f = 0;
        hoVar.j.remove("channel_id");
        hoVar.j.remove("channel_importance");
        hoVar.j.remove("channel_name");
        hoVar.j.remove("channel_description");
        hoVar.j.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.c.a("delete channel info by:" + hoVar.j.get("REMOVE_CHANNEL_MARK"));
        hoVar.j.remove("REMOVE_CHANNEL_MARK");
    }

    private static int a(NotificationChannel notificationChannel) {
        int i;
        try {
            i = ((Integer) com.xiaomi.push.am.b(notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            try {
                if (a) {
                    com.xiaomi.channel.commonutils.logger.c.a("NCHelper", "isUserLockedChannel:" + i + StringUtil.SPACE + notificationChannel);
                }
            } catch (Exception e) {
                e = e;
                com.xiaomi.channel.commonutils.logger.c.a("NCHelper", "is user locked error" + e);
                return i;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
        return i;
    }

    private static void a(Context context, List<String> list) {
        if (a) {
            com.xiaomi.channel.commonutils.logger.c.a("NCHelper", "deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        for (String str : list) {
            edit.remove(str);
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    @android.annotation.TargetApi(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(com.xiaomi.push.service.w r17, java.lang.String r18, java.lang.CharSequence r19, java.lang.String r20, int r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.s.a(com.xiaomi.push.service.w, java.lang.String, java.lang.CharSequence, java.lang.String, int, int, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a(Context context, String str) {
        if (!jj.a(context) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            w a2 = w.a(context, str);
            Set<String> keySet = a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : keySet) {
                if (!TextUtils.isEmpty(str2) ? str2.startsWith(a2.a("")) : false) {
                    arrayList.add(str2);
                    if (a) {
                        com.xiaomi.channel.commonutils.logger.c.a("NCHelper", "delete channel copy record:" + str2);
                    }
                }
            }
            a(context, arrayList);
        } catch (Exception unused) {
        }
        bz.a(context, str);
    }
}
