package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
/* loaded from: classes3.dex */
public final class d extends com.meizu.cloud.pushsdk.handler.a.a<SubAliasStatus> {
    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 4096;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start SubScribeAliasStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBALIAS_STATUS.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* bridge */ /* synthetic */ void a(SubAliasStatus subAliasStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        SubAliasStatus subAliasStatus2 = subAliasStatus;
        if (this.a == null || subAliasStatus2 == null) {
            return;
        }
        this.a.a(this.b, subAliasStatus2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ SubAliasStatus a(Intent intent) {
        SubAliasStatus subAliasStatus = (SubAliasStatus) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.EXTRA_APP_PUSH_SUBALIAS_STATUS);
        if (BasicPushStatus.SUCCESS_CODE.equals(subAliasStatus.getCode())) {
            com.meizu.cloud.pushsdk.util.b.c(this.b, this.b.getPackageName(), subAliasStatus.getAlias());
        }
        return subAliasStatus;
    }
}
