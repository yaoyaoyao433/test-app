package com.meizu.cloud.pushsdk.handler.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes3.dex */
public final class f extends a<Boolean> {
    public f(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 32;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start UnRegisterMessageHandler match");
        if (PushConstants.MZ_PUSH_ON_UNREGISTER_ACTION.equals(intent.getAction())) {
            return true;
        }
        return PushConstants.REQUEST_UNREGISTER_INTENT.equals(intent.getAction()) && TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_UNREGISTERED));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ void a(Boolean bool, com.meizu.cloud.pushsdk.notification.c cVar) {
        Boolean bool2 = bool;
        if (this.a != null) {
            this.a.a(this.b, bool2.booleanValue());
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    protected final /* synthetic */ Boolean a(Intent intent) {
        boolean a = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_APP_IS_UNREGISTER_SUCCESS, false);
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_REGISTRATION_ERROR);
        String a3 = com.sankuai.waimai.platform.utils.f.a(intent, PushConstants.EXTRA_UNREGISTERED);
        DebugLogger.i("AbstractMessageHandler", "processUnRegisterCallback 5.0:" + a + " 4.0:" + a2 + " 3.0:" + a3);
        if (TextUtils.isEmpty(a2) || a || !TextUtils.isEmpty(a3)) {
            com.meizu.cloud.pushsdk.util.b.b(this.b, "", this.b.getPackageName());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
