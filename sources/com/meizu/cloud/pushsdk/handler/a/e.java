package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.a.c.d;
/* loaded from: classes3.dex */
public final class e extends a<MessageV3> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 8;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start ThroughMessageHandler match");
        if (a(1, c(intent))) {
            if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction())) {
                if ("message".equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"))) {
                    return true;
                }
                if (TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "method"))) {
                    String a = com.sankuai.waimai.platform.utils.f.a(intent, "message");
                    if (!TextUtils.isEmpty(a) && !a(a)) {
                        return true;
                    }
                }
            }
            return PushConstants.C2DM_INTENT.equals(intent.getAction());
        }
        return false;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ void b(MessageV3 messageV3) {
        MessageV3 messageV32 = messageV3;
        if (messageV32 == null || TextUtils.isEmpty(messageV32.getDeviceId()) || TextUtils.isEmpty(messageV32.getTaskId())) {
            return;
        }
        String b = b(messageV32.getThroughMessage());
        if (!TextUtils.isEmpty(b)) {
            com.meizu.cloud.pushsdk.util.d.c(this.b, b, messageV32.getDeviceId(), messageV32.getTaskId(), messageV32.getSeqId(), messageV32.getPushTimestamp());
        } else {
            com.meizu.cloud.pushsdk.util.d.c(this.b, messageV32.getUploadDataPackageName(), messageV32.getDeviceId(), messageV32.getTaskId(), messageV32.getSeqId(), messageV32.getPushTimestamp());
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        MessageV3 messageV32 = messageV3;
        if (this.a == null || messageV32 == null || TextUtils.isEmpty(messageV32.getThroughMessage())) {
            return;
        }
        this.a.b(this.b, messageV32.getThroughMessage());
        com.meizu.cloud.pushsdk.handler.a aVar = this.a;
        Context context = this.b;
        String throughMessage = messageV32.getThroughMessage();
        d.a aVar2 = new d.a();
        aVar2.a = messageV32.getTaskId();
        aVar2.b = messageV32.getSeqId();
        aVar2.c = messageV32.getPushTimestamp();
        aVar2.d = messageV32.getDeviceId();
        aVar.a(context, throughMessage, aVar2.a().a());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ MessageV3 a(Intent intent) {
        MessageV3 messageV3 = new MessageV3();
        if (PushConstants.C2DM_INTENT.equals(intent.getAction())) {
            this.a.a(this.b, intent);
            return null;
        }
        messageV3.setThroughMessage(com.sankuai.waimai.platform.utils.f.a(intent, "message"));
        messageV3.setTaskId(com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_TASK_ID));
        messageV3.setDeviceId(b(intent));
        messageV3.setSeqId(com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_SEQ_ID));
        messageV3.setPushTimestamp(d(intent));
        messageV3.setUploadDataPackageName(c(intent));
        return messageV3;
    }
}
