package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
/* loaded from: classes3.dex */
public final class e extends com.meizu.cloud.pushsdk.handler.a.a<com.meizu.cloud.pushsdk.handler.a.c.c> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 32768;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationStateMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_STATE.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void b(com.meizu.cloud.pushsdk.handler.a.c.c cVar) {
        com.meizu.cloud.pushsdk.handler.a.c.c cVar2 = cVar;
        switch (cVar2.d) {
            case -2:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_ACCESS_DENY");
                com.meizu.cloud.pushsdk.util.d.a(this.b, false, cVar2.a.getUploadDataPackageName(), cVar2.a.getDeviceId(), cVar2.a.getTaskId(), cVar2.a.getSeqId(), "npm", cVar2.a.getPushTimestamp(), cVar2.a.getDelayedReportMillis());
                return;
            case -1:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_INBOX");
                com.meizu.cloud.pushsdk.util.d.a(this.b, false, cVar2.a.getUploadDataPackageName(), cVar2.a.getDeviceId(), cVar2.a.getTaskId(), cVar2.a.getSeqId(), "sipm", cVar2.a.getPushTimestamp(), cVar2.a.getDelayedReportMillis());
                return;
            case 0:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_NORMAL");
                return;
            case 1:
                DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_FLOAT");
                return;
            default:
                return;
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void a(com.meizu.cloud.pushsdk.handler.a.c.c cVar, com.meizu.cloud.pushsdk.notification.c cVar2) {
        com.meizu.cloud.pushsdk.handler.a.c.c cVar3 = cVar;
        DebugLogger.e("AbstractMessageHandler", "store notification id " + cVar3.c);
        com.meizu.cloud.pushsdk.notification.c.b.b(this.b, cVar3.a.getUploadDataPackageName(), cVar3.c);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ com.meizu.cloud.pushsdk.handler.a.c.c a(Intent intent) {
        String a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME);
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.NOTIFICATION_EXTRA_TASK_ID);
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.NOTIFICATION_EXTRA_SEQ_ID);
        String a4 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.NOTIFICATION_EXTRA_DEVICE_ID);
        String a5 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP);
        String a6 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE);
        boolean a7 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_WHITE_LIST, false);
        long a8 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, 0L);
        DebugLogger.i("AbstractMessageHandler", "current taskId " + a2 + " seqId " + a3 + " deviceId " + a4 + " packageName " + a);
        com.meizu.cloud.pushsdk.handler.a.c.c cVar = new com.meizu.cloud.pushsdk.handler.a.c.c(MessageV3.parse(this.b.getPackageName(), a, a5, a4, a2, a3, a6, a7, a8));
        String a9 = com.sankuai.waimai.platform.utils.f.a(intent, "flyme:notification_pkg");
        int a10 = com.sankuai.waimai.platform.utils.f.a(intent, "flyme:notification_id", 0);
        int a11 = com.sankuai.waimai.platform.utils.f.a(intent, "flyme:notification_state", 0);
        cVar.c = a10;
        cVar.b = a9;
        cVar.d = a11;
        return cVar;
    }
}
