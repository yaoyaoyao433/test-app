package com.meizu.cloud.pushsdk.handler.a.e;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
/* loaded from: classes3.dex */
public final class c extends com.meizu.cloud.pushsdk.handler.a.a<RegisterStatus> {
    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final int b() {
        return 512;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public final boolean f(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_REGISTER_STATUS.equals(com.sankuai.waimai.platform.utils.f.a(intent, "method"));
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ void c(RegisterStatus registerStatus) {
        com.meizu.cloud.pushsdk.b.c.a.a().execute(new Runnable() { // from class: com.meizu.cloud.pushsdk.handler.a.e.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c.a(c.this);
            }
        });
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* bridge */ /* synthetic */ void a(RegisterStatus registerStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        RegisterStatus registerStatus2 = registerStatus;
        if (this.a == null || registerStatus2 == null) {
            return;
        }
        this.a.a(this.b, registerStatus2);
    }

    @Override // com.meizu.cloud.pushsdk.handler.a.a
    public final /* synthetic */ RegisterStatus a(Intent intent) {
        RegisterStatus registerStatus = (RegisterStatus) com.sankuai.waimai.platform.utils.f.c(intent, PushConstants.EXTRA_APP_PUSH_REGISTER_STATUS);
        if (!TextUtils.isEmpty(registerStatus.getPushId())) {
            com.meizu.cloud.pushsdk.util.b.b(this.b, registerStatus.getPushId(), this.b.getPackageName());
            com.meizu.cloud.pushsdk.util.b.a(this.b, (int) ((System.currentTimeMillis() / 1000) + registerStatus.getExpireTime()), this.b.getPackageName());
        }
        return registerStatus;
    }

    static /* synthetic */ void a(c cVar) {
        String mzPushServicePackageName = MzSystemUtils.getMzPushServicePackageName(cVar.b);
        if (com.meizu.cloud.pushsdk.util.b.j(cVar.b, mzPushServicePackageName)) {
            com.meizu.cloud.pushsdk.util.b.c(cVar.b, mzPushServicePackageName, false);
            if (TextUtils.isEmpty(com.meizu.cloud.pushsdk.util.b.i(cVar.b, mzPushServicePackageName))) {
                String a = a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                com.meizu.cloud.pushsdk.util.b.e(cVar.b, mzPushServicePackageName, a);
            }
        }
    }
}
