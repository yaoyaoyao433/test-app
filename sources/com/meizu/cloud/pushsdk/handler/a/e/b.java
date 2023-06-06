package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes3.dex */
public final class b extends com.meizu.cloud.pushsdk.handler.a.a<String> {
    public b(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 16384;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start ReceiveNotifyMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_RESPONSE_NOTIFICATION_MESSAGE.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void a(String str, com.meizu.cloud.pushsdk.notification.c cVar) {
        String str2 = str;
        if (this.a == null || str2 == null) {
            return;
        }
        this.a.c(this.b, str2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ String a(Intent intent) {
        return com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_PUSH_RESPONSE_NOTIFICATION_MESSAGE);
    }
}
