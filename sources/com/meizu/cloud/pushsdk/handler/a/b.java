package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
/* loaded from: classes3.dex */
public final class b extends c {
    public b(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: g */
    public final MessageV3 a(Intent intent) {
        MPushMessage mPushMessage = (MPushMessage) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
        return MessageV3.parse(c(intent), b(intent), mPushMessage.getTaskId(), mPushMessage);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start MessageV2Handler match");
        return a(0, c(intent)) && PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    public final void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (cVar != null) {
            cVar.a(messageV3);
            this.a.b(this.b, MzPushMessage.fromMessageV3(messageV3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: d */
    public final void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.b(this.b, messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: e */
    public final void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.a(this.b, messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }
}
