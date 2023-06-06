package com.xiaomi.mipush.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.ha;
import com.xiaomi.push.hl;
import com.xiaomi.push.hn;
import com.xiaomi.push.ho;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ie;
import com.xiaomi.push.il;
import com.xiaomi.push.iq;
import com.xiaomi.push.js;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
/* loaded from: classes6.dex */
public final class ae {
    private static ae a;
    private static Queue<String> c;
    private static Object d = new Object();
    private Context b;

    private ae(Context context) {
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
    }

    public static ae a(Context context) {
        if (a == null) {
            a = new ae(context);
        }
        return a;
    }

    private void a(String str, long j, as asVar) {
        am c2 = az.c(asVar);
        if (c2 == null) {
            return;
        }
        if (j == 0) {
            synchronized (x.class) {
                if (x.a(this.b).e(str)) {
                    x.a(this.b).d(str);
                    if ("syncing".equals(x.a(this.b).a(c2))) {
                        x.a(this.b).a(c2, "synced");
                    }
                }
            }
        } else if (!"syncing".equals(x.a(this.b).a(c2))) {
            x.a(this.b).d(str);
        } else {
            synchronized (x.class) {
                if (x.a(this.b).e(str)) {
                    if (x.a(this.b).c(str) < 10) {
                        x.a(this.b).b(str);
                        ag.a(this.b).a(str, c2, asVar);
                    } else {
                        x.a(this.b).d(str);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0 A[Catch: Exception -> 0x02eb, iq -> 0x02fb, TryCatch #4 {iq -> 0x02fb, Exception -> 0x02eb, blocks: (B:12:0x006a, B:15:0x007d, B:18:0x0085, B:23:0x00a3, B:25:0x00b3, B:30:0x00c0, B:32:0x00c4, B:33:0x00cc, B:35:0x00e6, B:36:0x00ea, B:37:0x00ff, B:21:0x009d, B:38:0x011e, B:40:0x0125, B:42:0x0129, B:44:0x012f, B:46:0x0139, B:48:0x013e, B:54:0x019a, B:49:0x0165, B:51:0x016f, B:53:0x0174, B:56:0x01a0, B:58:0x01a6, B:60:0x01aa, B:64:0x01b4, B:66:0x01b8, B:68:0x01c2, B:70:0x01cc, B:72:0x01d1, B:74:0x01fd, B:76:0x0206, B:78:0x020c, B:80:0x0212, B:82:0x021c, B:84:0x022b, B:86:0x0235, B:88:0x023f, B:92:0x024b, B:94:0x026f, B:96:0x0291, B:97:0x02a7, B:99:0x02af, B:101:0x02b5, B:103:0x02bb, B:105:0x02bf, B:106:0x02ce, B:107:0x02d5, B:108:0x02e1), top: B:150:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff A[Catch: Exception -> 0x02eb, iq -> 0x02fb, TryCatch #4 {iq -> 0x02fb, Exception -> 0x02eb, blocks: (B:12:0x006a, B:15:0x007d, B:18:0x0085, B:23:0x00a3, B:25:0x00b3, B:30:0x00c0, B:32:0x00c4, B:33:0x00cc, B:35:0x00e6, B:36:0x00ea, B:37:0x00ff, B:21:0x009d, B:38:0x011e, B:40:0x0125, B:42:0x0129, B:44:0x012f, B:46:0x0139, B:48:0x013e, B:54:0x019a, B:49:0x0165, B:51:0x016f, B:53:0x0174, B:56:0x01a0, B:58:0x01a6, B:60:0x01aa, B:64:0x01b4, B:66:0x01b8, B:68:0x01c2, B:70:0x01cc, B:72:0x01d1, B:74:0x01fd, B:76:0x0206, B:78:0x020c, B:80:0x0212, B:82:0x021c, B:84:0x022b, B:86:0x0235, B:88:0x023f, B:92:0x024b, B:94:0x026f, B:96:0x0291, B:97:0x02a7, B:99:0x02af, B:101:0x02b5, B:103:0x02bb, B:105:0x02bf, B:106:0x02ce, B:107:0x02d5, B:108:0x02e1), top: B:150:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.xiaomi.mipush.sdk.PushMessageHandler.a a(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.ae.a(android.content.Intent):com.xiaomi.mipush.sdk.PushMessageHandler$a");
    }

    private PushMessageHandler.a a(hx hxVar, byte[] bArr) {
        String str;
        String str2 = null;
        try {
            il a2 = z.a(this.b, hxVar);
            if (a2 == null) {
                com.xiaomi.channel.commonutils.logger.c.d("message arrived: receiving an un-recognized message. " + hxVar.a);
                return null;
            }
            ha haVar = hxVar.a;
            com.xiaomi.channel.commonutils.logger.c.a("message arrived: processing an arrived message, action=" + haVar);
            if (af.a[haVar.ordinal()] != 1) {
                return null;
            }
            if (!hxVar.b) {
                com.xiaomi.channel.commonutils.logger.c.d("message arrived: receiving an un-encrypt message(SendMessage).");
                return null;
            }
            ie ieVar = (ie) a2;
            hn hnVar = ieVar.h;
            if (hnVar == null) {
                com.xiaomi.channel.commonutils.logger.c.d("message arrived: receive an empty message without push content, drop it");
                return null;
            }
            if (hxVar.h != null && hxVar.h.j != null) {
                str2 = hxVar.h.j.get("jobkey");
            }
            o a3 = r.a(ieVar, hxVar.h, false);
            a3.n = true;
            com.xiaomi.channel.commonutils.logger.c.a("message arrived: receive a message, msgid=" + hnVar.b + ", jobkey=" + str2);
            return a3;
        } catch (bh e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
            com.xiaomi.channel.commonutils.logger.c.d(str);
            return null;
        } catch (iq e2) {
            com.xiaomi.channel.commonutils.logger.c.a(e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
            com.xiaomi.channel.commonutils.logger.c.d(str);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x06be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.xiaomi.mipush.sdk.PushMessageHandler.a a(com.xiaomi.push.hx r24, boolean r25, byte[] r26, java.lang.String r27, int r28, android.content.Intent r29) {
        /*
            Method dump skipped, instructions count: 3572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.ae.a(com.xiaomi.push.hx, boolean, byte[], java.lang.String, int, android.content.Intent):com.xiaomi.mipush.sdk.PushMessageHandler$a");
    }

    private static boolean a(Context context, String str) {
        synchronized (d) {
            ap.a(context);
            SharedPreferences b = ap.b(context);
            if (c == null) {
                String[] split = b.getString("pref_msg_ids", "").split(CommonConstant.Symbol.COMMA);
                c = new LinkedList();
                for (String str2 : split) {
                    c.add(str2);
                }
            }
            if (c.contains(str)) {
                return true;
            }
            c.add(str);
            if (c.size() > 25) {
                c.poll();
            }
            String a2 = com.xiaomi.push.ar.a(c, CommonConstant.Symbol.COMMA);
            SharedPreferences.Editor edit = b.edit();
            edit.putString("pref_msg_ids", a2);
            edit.apply();
            return false;
        }
    }

    private void a(ia iaVar) {
        String str;
        Map<String, String> map = iaVar.h;
        if (map == null) {
            str = "detect failed because null";
        } else {
            String str2 = (String) com.xiaomi.push.service.x.a(map, "pkgList", (Object) null);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
                    if (js.a(runningAppProcesses)) {
                        com.xiaomi.channel.commonutils.logger.c.a("detect failed because params illegal");
                        return;
                    }
                    String[] split = str2.split(CommonConstant.Symbol.COMMA);
                    HashMap hashMap = new HashMap();
                    for (String str3 : split) {
                        String[] split2 = str3.split("~");
                        if (split2.length >= 2) {
                            hashMap.put(split2[1], split2[0]);
                        }
                    }
                    js.a aVar = new js.a("~", CommonConstant.Symbol.COMMA);
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (hashMap.containsKey(runningAppProcessInfo.processName)) {
                            aVar.a((String) hashMap.get(runningAppProcessInfo.processName), String.valueOf(runningAppProcessInfo.importance));
                            hashMap.remove(runningAppProcessInfo.processName);
                        }
                    }
                    if (aVar.toString().length() <= 0) {
                        com.xiaomi.channel.commonutils.logger.c.b("detect failed because no alive process");
                        return;
                    }
                    ia iaVar2 = new ia();
                    iaVar2.c = iaVar.c;
                    iaVar2.d = iaVar.d;
                    iaVar2.i = iaVar.i;
                    iaVar2.e = hl.DetectAppAliveResult.ah;
                    iaVar2.h = new HashMap();
                    iaVar2.h.put("alive", aVar.toString());
                    if (Boolean.parseBoolean((String) com.xiaomi.push.service.x.a(map, "reportNotAliveApp", "false")) && hashMap.size() > 0) {
                        js.a aVar2 = new js.a("", CommonConstant.Symbol.COMMA);
                        for (String str4 : hashMap.keySet()) {
                            aVar2.a((String) hashMap.get(str4), "");
                        }
                        iaVar2.h.put("notAlive", aVar2.toString());
                    }
                    ag.a(this.b).a((ag) iaVar2, ha.Notification, false, (ho) null);
                    return;
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.a("detect failed " + th);
                    return;
                }
            }
            str = "detect failed because empty";
        }
        com.xiaomi.channel.commonutils.logger.c.a(str);
    }
}
