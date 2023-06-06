package com.meizu.cloud.pushsdk.handler.a.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
/* loaded from: classes3.dex */
public final class c extends com.meizu.cloud.pushsdk.handler.a.a<MessageV3> {
    private Context c;

    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
        this.c = context;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 1048576;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationCloseMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_CLOSE.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void b(MessageV3 messageV3) {
        MessageV3 messageV32 = messageV3;
        com.meizu.cloud.pushsdk.util.d.a(this.b, messageV32.getUploadDataPackageName(), messageV32.getDeviceId(), messageV32.getTaskId(), messageV32.getSeqId(), messageV32.getPushTimestamp());
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        MessageV3 messageV32 = messageV3;
        if (messageV32 != null) {
            if (messageV32.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV32.getAdvertisementOption().getAdPackage())) {
                Context context = this.c;
                String adPackage = messageV32.getAdvertisementOption().getAdPackage();
                long currentTimeMillis = System.currentTimeMillis();
                context.getSharedPreferences("mz_push_preference_new", 0).edit().putLong(adPackage + ".ad_last_close_time", currentTimeMillis).apply();
                com.meizu.cloud.pushsdk.util.d.a(this.c, true, messageV32.getAdvertisementOption().getAdInstallPackage(), messageV32.getDeviceId(), messageV32.getTaskId(), messageV32.getSeqId(), "acce", messageV32.getPushTimestamp());
            }
            if (!TextUtils.isEmpty(messageV32.getTitle()) && !TextUtils.isEmpty(messageV32.getContent()) && this.a != null) {
                this.a.c(this.b, MzPushMessage.fromMessageV3(messageV32));
            }
            b(messageV32);
            a(this.c, messageV32);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ MessageV3 a(Intent intent) {
        return (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
    }
}
