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
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public final class d extends c<SubAliasStatus> {
    public String a;
    public int b;
    public String c;
    private final Map<String, Boolean> k;

    private d(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public d(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.j = z;
    }

    private d(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.k = new HashMap();
    }

    private d(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
        this.a = null;
    }

    private void b(boolean z) {
        Map<String, Boolean> map = this.k;
        map.put(this.g + CommonConstant.Symbol.UNDERLINE + this.b, Boolean.valueOf(z));
    }

    private void d(String str) {
        com.meizu.cloud.pushsdk.util.b.c(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), str);
    }

    private String j() {
        return com.meizu.cloud.pushsdk.util.b.f(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName());
    }

    private boolean k() {
        Map<String, Boolean> map = this.k;
        Boolean bool = map.get(this.g + CommonConstant.Symbol.UNDERLINE + this.b);
        return bool == null || bool.booleanValue();
    }

    private boolean l() {
        return !this.i && PushConstants.PUSH_PACKAGE_NAME.equals(this.g);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final boolean a() {
        return (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.a)) ? false : true;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final int g() {
        return 8;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final Intent c() {
        if (this.b != 2) {
            Intent intent = new Intent();
            intent.putExtra("app_id", this.e);
            intent.putExtra(KnbConstants.PARAMS_APP_KEY, this.f);
            intent.putExtra("strategy_package_name", this.d.getPackageName());
            intent.putExtra(DataConstants.PUSH_ID, this.a);
            intent.putExtra("strategy_type", 8);
            intent.putExtra("strategy_child_type", this.b);
            intent.putExtra("strategy_params", this.c);
            return intent;
        }
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ void a(SubAliasStatus subAliasStatus) {
        PlatformMessageSender.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), subAliasStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ SubAliasStatus f() {
        if (this.b == 2) {
            SubAliasStatus subAliasStatus = new SubAliasStatus();
            subAliasStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            subAliasStatus.setPushId(this.a);
            subAliasStatus.setAlias(j());
            subAliasStatus.setMessage("check alias success");
            return subAliasStatus;
        }
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ SubAliasStatus e() {
        com.meizu.cloud.pushsdk.c.a.c cVar;
        String str;
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setPushId(this.a);
        subAliasStatus.setMessage("");
        switch (this.b) {
            case 0:
                if (this.c.equals(j()) && !k()) {
                    subAliasStatus.setCode(BasicPushStatus.SUCCESS_CODE);
                    str = this.c;
                    subAliasStatus.setAlias(str);
                    cVar = null;
                    break;
                } else {
                    b(true);
                    if (l()) {
                        d(this.c);
                    }
                    com.meizu.cloud.pushsdk.platform.a.a aVar = this.h;
                    String str2 = this.e;
                    String str3 = this.f;
                    String str4 = this.a;
                    String str5 = this.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("appId", str2);
                    linkedHashMap.put("appKey", str3);
                    linkedHashMap.put(PushConstants.KEY_PUSH_ID, str4);
                    linkedHashMap.put("alias", str5);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str3));
                    DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
                    cVar = com.meizu.cloud.pushsdk.c.a.b(aVar.i).a(linkedHashMap2).a().a();
                    break;
                }
                break;
            case 1:
                if (TextUtils.isEmpty(j()) && !k()) {
                    subAliasStatus.setCode(BasicPushStatus.SUCCESS_CODE);
                    str = "";
                    subAliasStatus.setAlias(str);
                    cVar = null;
                    break;
                } else {
                    b(true);
                    if (l()) {
                        d("");
                    }
                    com.meizu.cloud.pushsdk.platform.a.a aVar2 = this.h;
                    String str6 = this.e;
                    String str7 = this.f;
                    String str8 = this.a;
                    String str9 = this.c;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("appId", str6);
                    linkedHashMap3.put(PushConstants.KEY_PUSH_ID, str8);
                    linkedHashMap3.put("alias", str9);
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                    linkedHashMap4.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap3, str7));
                    DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap4);
                    cVar = com.meizu.cloud.pushsdk.c.a.b(aVar2.j).a(linkedHashMap4).a().a();
                    break;
                }
            case 2:
                subAliasStatus.setAlias(j());
                subAliasStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            default:
                cVar = null;
                break;
        }
        if (cVar != null) {
            if (cVar.a()) {
                subAliasStatus = new SubAliasStatus((String) cVar.a);
                DebugLogger.e("Strategy", "network subAliasStatus " + subAliasStatus);
                if (BasicPushStatus.SUCCESS_CODE.equals(subAliasStatus.getCode())) {
                    b(false);
                }
            } else {
                com.meizu.cloud.pushsdk.c.b.a aVar3 = cVar.b;
                if (aVar3.d != null) {
                    DebugLogger.e("Strategy", "status code=" + aVar3.b + " data=" + aVar3.d);
                }
                subAliasStatus.setCode(String.valueOf(aVar3.b));
                subAliasStatus.setMessage(aVar3.a);
                DebugLogger.e("Strategy", "subAliasStatus " + subAliasStatus);
            }
        }
        return subAliasStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ SubAliasStatus b() {
        String str;
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode("20001");
        if (TextUtils.isEmpty(this.e)) {
            str = "appId not empty";
        } else if (!TextUtils.isEmpty(this.f)) {
            if (TextUtils.isEmpty(this.a)) {
                str = "pushId not empty";
            }
            return subAliasStatus;
        } else {
            str = "appKey not empty";
        }
        subAliasStatus.setMessage(str);
        return subAliasStatus;
    }
}
