package com.meizu.cloud.pushsdk.handler.a.d;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a.c.h;
/* loaded from: classes3.dex */
public final class f extends com.meizu.cloud.pushsdk.handler.a.a<h> {
    public f(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 262144;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        int i;
        DebugLogger.i("AbstractMessageHandler", "start WithDrawMessageHandler match");
        String a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        if (!TextUtils.isEmpty(a)) {
            com.meizu.cloud.pushsdk.handler.a.c.b a2 = com.meizu.cloud.pushsdk.handler.a.c.b.a(a);
            if (a2.a != null) {
                i = a2.a.a;
                return !PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "4".equals(String.valueOf(i));
            }
        }
        i = 0;
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void b(h hVar) {
        h hVar2 = hVar;
        com.meizu.cloud.pushsdk.util.d.b(this.b, hVar2.b, hVar2.a.b.d, hVar2.a.b.a, hVar2.a.b.e, hVar2.a.b.b);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void a(h hVar, com.meizu.cloud.pushsdk.notification.c cVar) {
        h hVar2 = hVar;
        NotificationManager notificationManager = (NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            DebugLogger.e("AbstractMessageHandler", "start cancel notification id " + hVar2.c);
            notificationManager.cancel(hVar2.c);
            com.meizu.cloud.pushsdk.handler.a.a.a aVar = com.meizu.cloud.pushsdk.b.a(this.b).c;
            if (aVar != null) {
                aVar.a(hVar2.c);
            }
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ h a(Intent intent) {
        String a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_CONTROL_MESSAGE);
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_SEQ_ID);
        return new h(com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_PRIVATE_MESSAGE), c(intent), a, com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), a2);
    }
}
