package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.ds;
import com.xiaomi.push.ep;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class MessageHandleService extends BaseService {
    private static ConcurrentLinkedQueue<a> a = new ConcurrentLinkedQueue<>();
    private static ExecutorService b = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* loaded from: classes6.dex */
    public static class a {
        PushMessageReceiver a;
        Intent b;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.a = pushMessageReceiver;
            this.b = intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Context context, Intent intent) {
        b(context);
    }

    private static void b(Context context) {
        if (b.isShutdown()) {
            return;
        }
        b.execute(new bm(context));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    protected final boolean a() {
        return a != null && a.size() > 0;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    public static void a(Context context, a aVar) {
        a.add(aVar);
        b(context);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, MessageHandleService.class));
        com.xiaomi.push.m.a(context).a(new bl(context, intent), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, a aVar) {
        String[] stringArrayExtra;
        if (aVar == null) {
            return;
        }
        try {
            PushMessageReceiver pushMessageReceiver = aVar.a;
            Intent intent = aVar.b;
            int a2 = com.sankuai.waimai.platform.utils.f.a(intent, RemoteMessageConst.MSGTYPE, 1);
            if (a2 != 1) {
                switch (a2) {
                    case 3:
                        n nVar = (n) com.sankuai.waimai.platform.utils.f.c(intent, "key_command");
                        com.xiaomi.channel.commonutils.logger.c.f("(Local) begin execute onCommandResult, command=" + nVar.a + ", resultCode=" + nVar.b + ", reason=" + nVar.c);
                        pushMessageReceiver.onCommandResult(context, nVar);
                        if (TextUtils.equals(nVar.a, ep.COMMAND_REGISTER.k)) {
                            pushMessageReceiver.onReceiveRegisterResult(context, nVar);
                            PushMessageHandler.a(context, nVar);
                            if (nVar.b == 0) {
                                aw.b(context);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        return;
                    case 5:
                        if (!"error_lack_of_permission".equals(com.sankuai.waimai.platform.utils.f.a(intent, "error_type")) || (stringArrayExtra = intent.getStringArrayExtra("error_message")) == null) {
                            return;
                        }
                        com.xiaomi.channel.commonutils.logger.c.f("begin execute onRequirePermissions, lack of necessary permissions");
                        pushMessageReceiver.onRequirePermissions(context, stringArrayExtra);
                        return;
                    default:
                        return;
                }
            }
            PushMessageHandler.a a3 = ae.a(context).a(intent);
            int a4 = com.sankuai.waimai.platform.utils.f.a(intent, "eventMessageType", -1);
            if (a3 != null) {
                if (!(a3 instanceof o)) {
                    if (a3 instanceof n) {
                        n nVar2 = (n) a3;
                        com.xiaomi.channel.commonutils.logger.c.f("begin execute onCommandResult, command=" + nVar2.a + ", resultCode=" + nVar2.b + ", reason=" + nVar2.c);
                        pushMessageReceiver.onCommandResult(context, nVar2);
                        if (TextUtils.equals(nVar2.a, ep.COMMAND_REGISTER.k)) {
                            pushMessageReceiver.onReceiveRegisterResult(context, nVar2);
                            PushMessageHandler.a(context, nVar2);
                            if (nVar2.b == 0) {
                                aw.b(context);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                o oVar = (o) a3;
                if (!oVar.n) {
                    pushMessageReceiver.onReceiveMessage(context, oVar);
                }
                if (oVar.g == 1) {
                    ds.a(context.getApplicationContext()).a(context.getPackageName(), intent, 2004, (String) null);
                    com.xiaomi.channel.commonutils.logger.c.f("begin execute onReceivePassThroughMessage from " + oVar.a);
                    pushMessageReceiver.onReceivePassThroughMessage(context, oVar);
                } else if (oVar.j) {
                    if (a4 == 1000) {
                        ds.a(context.getApplicationContext()).a(context.getPackageName(), intent, 1007, (String) null);
                    } else {
                        ds.a(context.getApplicationContext()).a(context.getPackageName(), intent, 3007, (String) null);
                    }
                    com.xiaomi.channel.commonutils.logger.c.f("begin execute onNotificationMessageClicked from\u3000" + oVar.a);
                    pushMessageReceiver.onNotificationMessageClicked(context, oVar);
                } else {
                    com.xiaomi.channel.commonutils.logger.c.f("begin execute onNotificationMessageArrived from " + oVar.a);
                    pushMessageReceiver.onNotificationMessageArrived(context, oVar);
                }
            }
        } catch (RuntimeException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(Context context) {
        try {
            b(context, a.poll());
        } catch (RuntimeException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }
}
