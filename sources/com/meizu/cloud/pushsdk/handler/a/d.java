package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes3.dex */
public final class d extends a<String> {
    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 16;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterMessageHandler match");
        if (PushConstants.MZ_PUSH_ON_REGISTER_ACTION.equals(intent.getAction())) {
            return true;
        }
        return PushConstants.REGISTRATION_CALLBACK_INTENT.equals(intent.getAction()) && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "registration_id"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* bridge */ /* synthetic */ void a(String str, com.meizu.cloud.pushsdk.notification.c cVar) {
        String str2 = str;
        if (this.a != null) {
            this.a.a(this.b, str2);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ String a(Intent intent) {
        String a = com.sankuai.waimai.platform.utils.f.a(intent, "registration_id");
        com.meizu.cloud.pushsdk.util.b.b(this.b, a, this.b.getPackageName());
        com.meizu.cloud.pushsdk.util.b.a(this.b, 0, this.b.getPackageName());
        return a;
    }
}
