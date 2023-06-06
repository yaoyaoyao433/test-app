package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public final class f extends c<PushSwitchStatus> {
    public String a;
    public int b;
    public boolean c;
    private final Map<String, Boolean> k;

    private f(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public f(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.j = z;
    }

    private f(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.b = 0;
        this.k = new HashMap();
    }

    private f(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
        this.a = null;
    }

    private void b(boolean z) {
        com.meizu.cloud.pushsdk.util.b.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), z);
    }

    private void c(boolean z) {
        com.meizu.cloud.pushsdk.util.b.b(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), z);
    }

    private void d(boolean z) {
        com.meizu.cloud.pushsdk.util.b.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), z);
        com.meizu.cloud.pushsdk.util.b.b(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), z);
    }

    private void e(boolean z) {
        Map<String, Boolean> map = this.k;
        map.put(this.g + CommonConstant.Symbol.UNDERLINE + this.b, Boolean.valueOf(z));
    }

    private boolean j() {
        return com.meizu.cloud.pushsdk.util.b.e(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName());
    }

    private boolean k() {
        return com.meizu.cloud.pushsdk.util.b.g(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName());
    }

    private boolean l() {
        Map<String, Boolean> map = this.k;
        Boolean bool = map.get(this.g + CommonConstant.Symbol.UNDERLINE + this.b);
        boolean z = bool == null || bool.booleanValue();
        DebugLogger.e("Strategy", "isSyncPushStatus " + this.g + " switch type->" + this.b + " flag->" + z);
        return z;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final boolean a() {
        return (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.a)) ? false : true;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final int g() {
        return 16;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.e);
        intent.putExtra(KnbConstants.PARAMS_APP_KEY, this.f);
        intent.putExtra("strategy_package_name", this.d.getPackageName());
        intent.putExtra(DataConstants.PUSH_ID, this.a);
        intent.putExtra("strategy_type", 16);
        intent.putExtra("strategy_child_type", this.b);
        intent.putExtra("strategy_params", this.c ? "1" : "0");
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ void a(PushSwitchStatus pushSwitchStatus) {
        PlatformMessageSender.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), pushSwitchStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ PushSwitchStatus f() {
        switch (this.b) {
            case 0:
                b(this.c);
                return null;
            case 1:
                c(this.c);
                return null;
            case 2:
            case 3:
                d(this.c);
                return null;
            default:
                return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ PushSwitchStatus e() {
        com.meizu.cloud.pushsdk.c.a.c cVar;
        boolean z;
        boolean j;
        boolean k;
        Context context;
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setPushId(this.a);
        pushSwitchStatus.setCode(BasicPushStatus.SUCCESS_CODE);
        int i = 1;
        switch (this.b) {
            case 0:
                pushSwitchStatus.setMessage("SWITCH_NOTIFICATION");
                if (j() == this.c && !l()) {
                    z = this.c;
                    pushSwitchStatus.setSwitchNotificationMessage(z);
                    k = k();
                    pushSwitchStatus.setSwitchThroughMessage(k);
                    cVar = null;
                    break;
                } else {
                    e(true);
                    b(this.c);
                    cVar = this.h.a(this.e, this.f, this.a, this.b, this.c);
                    break;
                }
            case 1:
                pushSwitchStatus.setMessage("SWITCH_THROUGH_MESSAGE");
                if (k() == this.c && !l()) {
                    j = j();
                    pushSwitchStatus.setSwitchNotificationMessage(j);
                    k = this.c;
                    pushSwitchStatus.setSwitchThroughMessage(k);
                    cVar = null;
                    break;
                } else {
                    e(true);
                    c(this.c);
                    cVar = this.h.a(this.e, this.f, this.a, this.b, this.c);
                    break;
                }
                break;
            case 2:
                pushSwitchStatus.setMessage("CHECK_PUSH");
                Context context2 = this.d;
                String packageName = !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName();
                if (com.meizu.cloud.pushsdk.util.b.a(context2, "mz_push_preference", "switch_notification_message_" + packageName)) {
                    Context context3 = this.d;
                    String packageName2 = !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName();
                    if (com.meizu.cloud.pushsdk.util.b.a(context3, "mz_push_preference", "switch_through_message_" + packageName2) && !l()) {
                        z = j();
                        pushSwitchStatus.setSwitchNotificationMessage(z);
                        k = k();
                        pushSwitchStatus.setSwitchThroughMessage(k);
                        cVar = null;
                        break;
                    }
                }
                e(true);
                com.meizu.cloud.pushsdk.platform.a.a aVar = this.h;
                String str = this.e;
                String str2 = this.f;
                String str3 = this.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("appId", str);
                linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
                DebugLogger.i("PushAPI", "checkPush post map " + linkedHashMap2);
                cVar = com.meizu.cloud.pushsdk.c.a.a(aVar.c).a(linkedHashMap2).a().a();
                break;
            case 3:
                pushSwitchStatus.setMessage("SWITCH_ALL");
                if (j() != this.c || k() != this.c || l()) {
                    e(true);
                    d(this.c);
                    com.meizu.cloud.pushsdk.platform.a.a aVar2 = this.h;
                    String str4 = this.e;
                    String str5 = this.f;
                    String str6 = this.a;
                    boolean z2 = this.c;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("appId", str4);
                    linkedHashMap3.put(PushConstants.KEY_PUSH_ID, str6);
                    linkedHashMap3.put("subSwitch", z2 ? "1" : "0");
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                    linkedHashMap4.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap3, str5));
                    DebugLogger.i("PushAPI", aVar2.d + " switchPush post map " + linkedHashMap4);
                    cVar = com.meizu.cloud.pushsdk.c.a.b(aVar2.d).a(linkedHashMap4).a().a();
                    break;
                } else {
                    j = this.c;
                    pushSwitchStatus.setSwitchNotificationMessage(j);
                    k = this.c;
                    pushSwitchStatus.setSwitchThroughMessage(k);
                    cVar = null;
                    break;
                }
                break;
            default:
                cVar = null;
                break;
        }
        if (cVar != null) {
            if (cVar.a()) {
                PushSwitchStatus pushSwitchStatus2 = new PushSwitchStatus((String) cVar.a);
                DebugLogger.e("Strategy", "network pushSwitchStatus " + pushSwitchStatus2);
                if (BasicPushStatus.SUCCESS_CODE.equals(pushSwitchStatus.getCode())) {
                    e(false);
                    DebugLogger.e("Strategy", "update local switch preference");
                    pushSwitchStatus.setSwitchNotificationMessage(pushSwitchStatus2.isSwitchNotificationMessage());
                    pushSwitchStatus.setSwitchThroughMessage(pushSwitchStatus2.isSwitchThroughMessage());
                    b(pushSwitchStatus2.isSwitchNotificationMessage());
                    c(pushSwitchStatus2.isSwitchThroughMessage());
                }
            } else {
                com.meizu.cloud.pushsdk.c.b.a aVar3 = cVar.b;
                if (aVar3.d != null) {
                    DebugLogger.e("Strategy", "status code=" + aVar3.b + " data=" + aVar3.d);
                }
                pushSwitchStatus.setCode(String.valueOf(aVar3.b));
                pushSwitchStatus.setMessage(aVar3.a);
                DebugLogger.e("Strategy", "pushSwitchStatus " + pushSwitchStatus);
            }
        }
        DebugLogger.e("Strategy", "enableRpc " + this.j + " isSupportRemoteInvoke " + this.i);
        if (this.j && !this.i) {
            int i2 = this.b;
            if (i2 != 3) {
                switch (i2) {
                    case 0:
                    case 1:
                        context = this.d;
                        i = this.b;
                        break;
                }
            } else {
                PlatformMessageSender.a(this.d, 0, this.c, this.g);
                context = this.d;
            }
            PlatformMessageSender.a(context, i, this.c, this.g);
        }
        return pushSwitchStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ PushSwitchStatus b() {
        String str;
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setCode("20001");
        if (TextUtils.isEmpty(this.e)) {
            str = "appId not empty";
        } else if (!TextUtils.isEmpty(this.f)) {
            if (TextUtils.isEmpty(this.a)) {
                str = "pushId not empty";
            }
            return pushSwitchStatus;
        } else {
            str = "appKey not empty";
        }
        pushSwitchStatus.setMessage(str);
        return pushSwitchStatus;
    }
}
