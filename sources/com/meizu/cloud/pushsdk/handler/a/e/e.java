package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
/* loaded from: classes3.dex */
public final class e extends com.meizu.cloud.pushsdk.handler.a.a<SubTagsStatus> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 2048;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start SubScribeTagsStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBTAGS_STATUS.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* bridge */ /* synthetic */ void a(SubTagsStatus subTagsStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        SubTagsStatus subTagsStatus2 = subTagsStatus;
        if (this.a == null || subTagsStatus2 == null) {
            return;
        }
        this.a.a(this.b, subTagsStatus2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ SubTagsStatus a(Intent intent) {
        return (SubTagsStatus) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.EXTRA_APP_PUSH_SUBTAGS_STATUS);
    }
}
