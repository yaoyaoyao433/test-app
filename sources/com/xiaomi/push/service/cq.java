package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Pair;
import com.xiaomi.push.fy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes6.dex */
public final class cq {
    private static final Map<String, byte[]> a = new HashMap();
    private static ArrayList<Pair<String, byte[]>> b = new ArrayList<>();

    public static void a(Context context, int i, String str) {
        synchronized (a) {
            for (String str2 : a.keySet()) {
                com.xiaomi.channel.commonutils.logger.c.a("notify registration error. " + str2);
                a(context, str2, a.get(str2), i, str);
            }
            a.clear();
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent, h.a(str));
    }

    public static void a(XMPushService xMPushService) {
        try {
            synchronized (a) {
                for (String str : a.keySet()) {
                    com.xiaomi.channel.commonutils.logger.c.a("processing pending registration request. " + str);
                    h.a(xMPushService, str, a.get(str));
                }
                a.clear();
            }
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.d("fail to deal with pending register request. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void a(String str, byte[] bArr) {
        synchronized (a) {
            com.xiaomi.channel.commonutils.logger.c.a("pending registration request. " + str);
            a.put(str, bArr);
        }
    }

    public static void b(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (b) {
                arrayList = b;
                b = new ArrayList<>();
            }
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<Pair<String, byte[]>> it = arrayList.iterator();
            while (it.hasNext()) {
                Pair<String, byte[]> next = it.next();
                h.a(xMPushService, (String) next.first, (byte[]) next.second);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (fy e) {
            com.xiaomi.channel.commonutils.logger.c.d("meet error when process pending message. " + e);
            xMPushService.a(10, e);
        }
    }

    public static void b(String str, byte[] bArr) {
        synchronized (b) {
            b.add(new Pair<>(str, bArr));
            if (b.size() > 50) {
                b.remove(0);
            }
        }
    }
}
