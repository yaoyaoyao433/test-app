package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes3.dex */
public final class e extends c<SubTagsStatus> {
    public String a;
    public int b;
    public String c;

    private e(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public e(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.j = z;
    }

    private e(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.b = 3;
    }

    private e(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
        this.a = null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final boolean a() {
        return (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.a)) ? false : true;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ SubTagsStatus f() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final int g() {
        return 4;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.e);
        intent.putExtra(KnbConstants.PARAMS_APP_KEY, this.f);
        intent.putExtra("strategy_package_name", this.d.getPackageName());
        intent.putExtra(DataConstants.PUSH_ID, this.a);
        intent.putExtra("strategy_type", 4);
        intent.putExtra("strategy_child_type", this.b);
        intent.putExtra("strategy_params", this.c);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ void a(SubTagsStatus subTagsStatus) {
        PlatformMessageSender.a(this.d, !TextUtils.isEmpty(this.g) ? this.g : this.d.getPackageName(), subTagsStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ SubTagsStatus e() {
        com.meizu.cloud.pushsdk.c.a.c a;
        String str;
        StringBuilder sb;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        switch (this.b) {
            case 0:
                com.meizu.cloud.pushsdk.platform.a.a aVar = this.h;
                String str2 = this.e;
                String str3 = this.f;
                String str4 = this.a;
                String str5 = this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("appId", str2);
                linkedHashMap.put(PushConstants.KEY_PUSH_ID, str4);
                linkedHashMap.put("tags", str5);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str3));
                DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap2);
                a = com.meizu.cloud.pushsdk.c.a.b(aVar.e).a(linkedHashMap2).a().a();
                break;
            case 1:
                com.meizu.cloud.pushsdk.platform.a.a aVar2 = this.h;
                String str6 = this.e;
                String str7 = this.f;
                String str8 = this.a;
                String str9 = this.c;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("appId", str6);
                linkedHashMap3.put(PushConstants.KEY_PUSH_ID, str8);
                linkedHashMap3.put("tags", str9);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                linkedHashMap4.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap3, str7));
                DebugLogger.i("PushAPI", "subScribeTags post map " + linkedHashMap4);
                a = com.meizu.cloud.pushsdk.c.a.b(aVar2.f).a(linkedHashMap4).a().a();
                break;
            case 2:
                com.meizu.cloud.pushsdk.platform.a.a aVar3 = this.h;
                String str10 = this.e;
                String str11 = this.f;
                String str12 = this.a;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("appId", str10);
                linkedHashMap5.put(PushConstants.KEY_PUSH_ID, str12);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(linkedHashMap5);
                linkedHashMap6.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap5, str11));
                DebugLogger.i("PushAPI", "subScribeAllTags post map " + linkedHashMap6);
                a = com.meizu.cloud.pushsdk.c.a.b(aVar3.g).a(linkedHashMap6).a().a();
                break;
            case 3:
                com.meizu.cloud.pushsdk.platform.a.a aVar4 = this.h;
                String str13 = this.e;
                String str14 = this.f;
                String str15 = this.a;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("appId", str13);
                linkedHashMap7.put(PushConstants.KEY_PUSH_ID, str15);
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(linkedHashMap7);
                linkedHashMap8.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap7, str14));
                DebugLogger.i("PushAPI", "checkPush post map " + linkedHashMap8);
                a = com.meizu.cloud.pushsdk.c.a.a(aVar4.h).a(linkedHashMap8).a().a();
                break;
            default:
                a = null;
                break;
        }
        if (a == null) {
            DebugLogger.e("Strategy", "network anResponse is null");
            return null;
        }
        if (a.a()) {
            subTagsStatus = new SubTagsStatus((String) a.a);
            str = "Strategy";
            sb = new StringBuilder("network subTagsStatus ");
        } else {
            com.meizu.cloud.pushsdk.c.b.a aVar5 = a.b;
            if (aVar5.d != null) {
                DebugLogger.e("Strategy", "status code=" + aVar5.b + " data=" + aVar5.d);
            }
            subTagsStatus.setCode(String.valueOf(aVar5.b));
            subTagsStatus.setMessage(aVar5.a);
            str = "Strategy";
            sb = new StringBuilder("subTagsStatus ");
        }
        sb.append(subTagsStatus);
        DebugLogger.e(str, sb.toString());
        return subTagsStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    protected final /* synthetic */ SubTagsStatus b() {
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        subTagsStatus.setCode("20001");
        if (TextUtils.isEmpty(this.e)) {
            str = "appId not empty";
        } else if (!TextUtils.isEmpty(this.f)) {
            if (TextUtils.isEmpty(this.a)) {
                str = "pushId not empty";
            }
            return subTagsStatus;
        } else {
            str = "appKey not empty";
        }
        subTagsStatus.setMessage(str);
        return subTagsStatus;
    }
}
