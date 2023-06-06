package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.g;
import com.xiaomi.push.ds;
import com.xiaomi.push.ep;
import com.xiaomi.push.he;
import com.xiaomi.push.ik;
import com.xiaomi.push.jr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class PushMessageHandler extends BaseService {
    private static List<g.a> a = new ArrayList();
    private static List<g.b> b = new ArrayList();
    private static ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a extends Serializable {
    }

    private static void a(long j, String str, String str2) {
        synchronized (b) {
            Iterator<g.b> it = b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private static void a(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent, ar.a(context));
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("callback sync error" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(g.a aVar) {
        synchronized (a) {
            if (!a.contains(aVar)) {
                a.add(aVar);
            }
        }
    }

    protected static void a(g.b bVar) {
        synchronized (b) {
            if (!b.contains(bVar)) {
                b.add(bVar);
            }
        }
    }

    private static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b() {
        synchronized (b) {
            b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void c() {
        synchronized (a) {
            a.clear();
        }
    }

    private static void c(Context context, Intent intent) {
        if (intent == null || c.isShutdown()) {
            return;
        }
        c.execute(new ac(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    protected final boolean a() {
        return (c == null || c.getQueue() == null || c.getQueue().size() <= 0) ? false : true;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        c(getApplicationContext(), intent);
    }

    public static void a(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.c.c("addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(context, PushMessageHandler.class));
            try {
                context.startService(intent2);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(Context context, Intent intent) {
        boolean z;
        try {
            z = com.sankuai.waimai.platform.utils.f.a(intent, "is_clicked_activity_call", false);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("intent unparcel error:" + th);
            z = false;
        }
        try {
            ResolveInfo resolveInfo = null;
            r3 = null;
            String str = null;
            r3 = null;
            String str2 = null;
            r3 = null;
            String str3 = null;
            resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                bc.a(context, intent, null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                he heVar = new he();
                ik.a(heVar, intent.getByteArrayExtra("mipush_payload"));
                com.xiaomi.channel.commonutils.logger.c.c("PushMessageHandler.onHandleIntent " + heVar.i);
                p.a(context, heVar);
            } else if (1 == r.a(context)) {
                if (b.isEmpty()) {
                    com.xiaomi.channel.commonutils.logger.c.d("receive a message before application calling initialize");
                    if (z) {
                        a(context);
                        return;
                    }
                    return;
                }
                a a2 = ae.a(context).a(intent);
                if (a2 != null) {
                    if (a2 instanceof o) {
                        a(context, (o) a2);
                    } else if (a2 instanceof n) {
                        n nVar = (n) a2;
                        String str4 = nVar.a;
                        if (ep.COMMAND_REGISTER.k.equals(str4)) {
                            List<String> list = nVar.d;
                            if (list != null && !list.isEmpty()) {
                                str = list.get(0);
                            }
                            a(nVar.b, nVar.c, str);
                        } else {
                            if (!ep.COMMAND_SET_ALIAS.k.equals(str4) && !ep.COMMAND_UNSET_ALIAS.k.equals(str4) && !ep.COMMAND_SET_ACCEPT_TIME.k.equals(str4)) {
                                if (ep.COMMAND_SUBSCRIBE_TOPIC.k.equals(str4)) {
                                    List<String> list2 = nVar.d;
                                    if (list2 != null && !list2.isEmpty()) {
                                        str2 = list2.get(0);
                                    }
                                    a(context, nVar.e, nVar.b, nVar.c, str2);
                                } else if (ep.COMMAND_UNSUBSCRIBE_TOPIC.k.equals(str4)) {
                                    List<String> list3 = nVar.d;
                                    if (list3 != null && !list3.isEmpty()) {
                                        str3 = list3.get(0);
                                    }
                                    b(context, nVar.e, nVar.b, nVar.c, str3);
                                }
                            }
                            a(context, nVar.e, str4, nVar.b, nVar.c, nVar.d);
                        }
                    }
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (queryBroadcastReceivers != null) {
                        Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResolveInfo next = it.next();
                            if (next.activityInfo != null && next.activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(jr.a(context, next.activityInfo.name))) {
                                resolveInfo = next;
                                break;
                            }
                        }
                    }
                    if (resolveInfo != null) {
                        try {
                            MessageHandleService.a aVar = new MessageHandleService.a(intent2, (PushMessageReceiver) jr.a(context, resolveInfo.activityInfo.name).newInstance());
                            if (z) {
                                MessageHandleService.b(context.getApplicationContext(), aVar);
                            } else {
                                MessageHandleService.a(context.getApplicationContext(), aVar);
                            }
                            MessageHandleService.a(context, new Intent(context.getApplicationContext(), MessageHandleService.class));
                        } catch (Throwable th2) {
                            com.xiaomi.channel.commonutils.logger.c.a(th2);
                        }
                    } else {
                        com.xiaomi.channel.commonutils.logger.c.d("cannot find the receiver to handler this message, check your manifest");
                        ds.a(context).a(context.getPackageName(), intent, "11");
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    ds.a(context).a(context.getPackageName(), intent, "9");
                }
            }
        } finally {
            if (z) {
                a(context);
            }
        }
    }

    private static void a(Context context, o oVar) {
        synchronized (b) {
            for (g.b bVar : b) {
                a(oVar.m, bVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            for (g.b bVar : b) {
                a(str, bVar.a);
            }
        }
    }

    private static void b(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            for (g.b bVar : b) {
                a(str, bVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (b) {
            for (g.b bVar : b) {
                a(str, bVar.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, n nVar) {
        synchronized (a) {
            for (g.a aVar : a) {
                if (aVar instanceof g.d) {
                    g.c cVar = new g.c();
                    if (nVar != null && nVar.d != null && nVar.d.size() > 0) {
                        cVar.b = nVar.b;
                        cVar.a = nVar.d.get(0);
                    }
                }
            }
        }
    }
}
