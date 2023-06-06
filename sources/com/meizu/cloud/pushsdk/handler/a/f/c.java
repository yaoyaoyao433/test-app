package com.meizu.cloud.pushsdk.handler.a.f;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.d;
import com.sankuai.waimai.platform.utils.f;
/* loaded from: classes3.dex */
public final class c extends com.meizu.cloud.pushsdk.handler.a.c {
    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    public final void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (cVar != null) {
            cVar.a(messageV3);
            a(messageV3);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 8192;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ int d(MessageV3 messageV3) {
        return 0;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public final void d2(MessageV3 messageV3) {
        DebugLogger.e("AbstractMessageHandler", "ScheduleNotificationHandler don't repeat upload receiver push event");
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c
    public final int f(MessageV3 messageV3) {
        return 0;
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: g */
    public final MessageV3 a(Intent intent) {
        return (MessageV3) intent.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_SCHEDULE_NOTIFICATION_MESSAGE);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start ScheduleNotificationHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SCHEDULE_NOTIFICATION.equals(f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    /* renamed from: e */
    public final void c(MessageV3 messageV3) {
        d.a(this.b, messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.c, com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void b(MessageV3 messageV3) {
        DebugLogger.e("AbstractMessageHandler", "ScheduleNotificationHandler don't repeat upload receiver push event");
    }
}
