package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
/* loaded from: classes3.dex */
public final class a extends com.meizu.cloud.pushsdk.handler.a.a<PushSwitchStatus> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 256;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start PushSwitchStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* bridge */ /* synthetic */ void a(PushSwitchStatus pushSwitchStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        PushSwitchStatus pushSwitchStatus2 = pushSwitchStatus;
        if (this.a == null || pushSwitchStatus2 == null) {
            return;
        }
        this.a.a(this.b, pushSwitchStatus2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ PushSwitchStatus a(Intent intent) {
        PushSwitchStatus pushSwitchStatus = (PushSwitchStatus) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.EXTRA_APP_PUSH_SWITCH_STATUS);
        if (BasicPushStatus.SUCCESS_CODE.equals(pushSwitchStatus.getCode())) {
            String c = c(intent);
            DebugLogger.e("AbstractMessageHandler", "PushSwitchStatusHandler update local " + c + " switch status " + pushSwitchStatus);
            com.meizu.cloud.pushsdk.util.b.a(this.b, c, pushSwitchStatus.isSwitchNotificationMessage());
            com.meizu.cloud.pushsdk.util.b.b(this.b, c, pushSwitchStatus.isSwitchThroughMessage());
        }
        return pushSwitchStatus;
    }
}
