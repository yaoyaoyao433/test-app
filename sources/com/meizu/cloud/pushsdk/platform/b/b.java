package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class b extends c<RegisterStatus> {
    Handler a;
    private ScheduledExecutorService b;
    private int c;

    private b(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
        this.b = (ScheduledExecutorService) com.meizu.cloud.pushsdk.d.b.a.b.a();
        this.a = new Handler(context.getMainLooper()) { // from class: com.meizu.cloud.pushsdk.platform.b.b.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what == 0) {
                    b.this.h();
                }
            }
        };
    }

    public b(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.j = z;
    }

    private b(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, null, null, aVar, scheduledExecutorService);
        this.c = 0;
    }

    private static boolean a(String str, String str2, int i) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.startsWith(str) || System.currentTimeMillis() / 1000 > ((long) i);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public final boolean a() {
        DebugLogger.e("Strategy", "isBrandMeizu " + MzSystemUtils.isBrandMeizu(this.d));
        return (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) ? false : true;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ RegisterStatus f() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final int g() {
        return 2;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public final Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.e);
        intent.putExtra(KnbConstants.PARAMS_APP_KEY, this.f);
        intent.putExtra("strategy_package_name", this.d.getPackageName());
        intent.putExtra("strategy_type", 2);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public final /* synthetic */ void a(RegisterStatus registerStatus) {
        PlatformMessageSender.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), registerStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public final /* synthetic */ RegisterStatus e() {
        RegisterStatus registerStatus = new RegisterStatus();
        String a = com.meizu.cloud.pushsdk.util.b.a(this.d, this.g);
        int b = com.meizu.cloud.pushsdk.util.b.b(this.d, this.g);
        String a2 = com.meizu.cloud.pushsdk.b.c.a(this.d);
        boolean a3 = a(a2, a, b);
        if (a3) {
            a3 = a(a2, com.meizu.cloud.pushsdk.platform.a.a(a), b);
        }
        if (a3) {
            com.meizu.cloud.pushsdk.util.b.b(this.d, "", this.g);
            String a4 = com.meizu.cloud.pushsdk.b.c.a(this.d);
            if (!TextUtils.isEmpty(a4) || this.c >= 3) {
                this.c = 0;
                com.meizu.cloud.pushsdk.platform.a.a aVar = this.h;
                String str = this.e;
                String str2 = this.f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("appId", str);
                linkedHashMap.put("deviceId", a4);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
                DebugLogger.i("PushAPI", "register post map " + linkedHashMap2);
                com.meizu.cloud.pushsdk.c.a.c a5 = com.meizu.cloud.pushsdk.c.a.b(aVar.a).a(linkedHashMap2).a().a();
                if (a5.a()) {
                    registerStatus = new RegisterStatus((String) a5.a);
                    DebugLogger.e("Strategy", "registerStatus " + registerStatus);
                    if (!TextUtils.isEmpty(registerStatus.getPushId())) {
                        com.meizu.cloud.pushsdk.util.b.b(this.d, registerStatus.getPushId(), this.g);
                        com.meizu.cloud.pushsdk.util.b.a(this.d, (int) ((System.currentTimeMillis() / 1000) + registerStatus.getExpireTime()), this.g);
                    }
                } else {
                    com.meizu.cloud.pushsdk.c.b.a aVar2 = a5.b;
                    if (aVar2.d != null) {
                        DebugLogger.e("Strategy", "status code=" + aVar2.b + " data=" + aVar2.d);
                    }
                    registerStatus.setCode(String.valueOf(aVar2.b));
                    registerStatus.setMessage(aVar2.a);
                    DebugLogger.e("Strategy", "registerStatus " + registerStatus);
                }
            } else {
                DebugLogger.i("Strategy", "after " + (this.c * 10) + " seconds start register");
                this.b.schedule(new Runnable() { // from class: com.meizu.cloud.pushsdk.platform.b.b.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.meizu.cloud.pushsdk.b.c.a(b.this.d);
                        b.this.a.sendEmptyMessage(0);
                    }
                }, (long) (this.c * 10), TimeUnit.SECONDS);
                this.c = this.c + 1;
                registerStatus.setCode("20000");
                registerStatus.setMessage("deviceId is empty");
            }
        } else {
            registerStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            registerStatus.setMessage("already register PushId,don't register frequently");
            registerStatus.setPushId(a);
            registerStatus.setExpireTime((int) (b - (System.currentTimeMillis() / 1000)));
        }
        return registerStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ RegisterStatus b() {
        String str;
        RegisterStatus registerStatus = new RegisterStatus();
        registerStatus.setCode("20001");
        if (!TextUtils.isEmpty(this.e)) {
            str = TextUtils.isEmpty(this.f) ? "appKey not empty" : "appKey not empty";
            return registerStatus;
        }
        str = "appId not empty";
        registerStatus.setMessage(str);
        return registerStatus;
    }
}
