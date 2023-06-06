package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public final class g extends c<UnRegisterStatus> {
    private g(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
    }

    public g(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.j = z;
    }

    private g(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, null, null, aVar, scheduledExecutorService);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final boolean a() {
        return (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) ? false : true;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ UnRegisterStatus f() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final int g() {
        return 32;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.e);
        intent.putExtra(KnbConstants.PARAMS_APP_KEY, this.f);
        intent.putExtra("strategy_package_name", this.d.getPackageName());
        intent.putExtra("strategy_type", 32);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ void a(UnRegisterStatus unRegisterStatus) {
        PlatformMessageSender.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), unRegisterStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ UnRegisterStatus e() {
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        if (TextUtils.isEmpty(com.meizu.cloud.pushsdk.util.b.a(this.d, this.g))) {
            unRegisterStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            unRegisterStatus.setMessage("already unRegister PushId,don't unRegister frequently");
            unRegisterStatus.setIsUnRegisterSuccess(true);
        } else {
            String a = com.meizu.cloud.pushsdk.b.c.a(this.d);
            com.meizu.cloud.pushsdk.platform.a.a aVar = this.h;
            String str = this.e;
            String str2 = this.f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appId", str);
            linkedHashMap.put("deviceId", a);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
            DebugLogger.i("PushAPI", "unregister post map " + linkedHashMap2);
            com.meizu.cloud.pushsdk.c.a.c a2 = com.meizu.cloud.pushsdk.c.a.a(aVar.b).a(linkedHashMap2).a().a();
            if (a2.a()) {
                unRegisterStatus = new UnRegisterStatus((String) a2.a);
                DebugLogger.e("Strategy", "network unRegisterStatus " + unRegisterStatus);
                if (BasicPushStatus.SUCCESS_CODE.equals(unRegisterStatus.getCode())) {
                    com.meizu.cloud.pushsdk.util.b.b(this.d, "", this.g);
                }
            } else {
                com.meizu.cloud.pushsdk.c.b.a aVar2 = a2.b;
                if (aVar2.d != null) {
                    DebugLogger.e("Strategy", "status code=" + aVar2.b + " data=" + aVar2.d);
                }
                unRegisterStatus.setCode(String.valueOf(aVar2.b));
                unRegisterStatus.setMessage(aVar2.a);
                DebugLogger.e("Strategy", "unRegisterStatus " + unRegisterStatus);
            }
        }
        return unRegisterStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ UnRegisterStatus b() {
        String str;
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        unRegisterStatus.setCode("20001");
        if (!TextUtils.isEmpty(this.e)) {
            str = TextUtils.isEmpty(this.f) ? "appKey not empty" : "appKey not empty";
            return unRegisterStatus;
        }
        str = "appId not empty";
        unRegisterStatus.setMessage(str);
        return unRegisterStatus;
    }
}
