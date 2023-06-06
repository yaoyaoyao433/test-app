package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
/* loaded from: classes3.dex */
public final class f extends com.meizu.cloud.pushsdk.handler.a.a<UnRegisterStatus> {
    public f(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 1024;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start UnRegisterStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_UNREGISTER_STATUS.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* bridge */ /* synthetic */ void a(UnRegisterStatus unRegisterStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        UnRegisterStatus unRegisterStatus2 = unRegisterStatus;
        if (this.a == null || unRegisterStatus2 == null) {
            return;
        }
        this.a.a(this.b, unRegisterStatus2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ UnRegisterStatus a(Intent intent) {
        UnRegisterStatus unRegisterStatus = (UnRegisterStatus) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.EXTRA_APP_PUSH_UNREGISTER_STATUS);
        if (unRegisterStatus.isUnRegisterSuccess()) {
            com.meizu.cloud.pushsdk.util.b.b(this.b, "", this.b.getPackageName());
        }
        return unRegisterStatus;
    }
}
