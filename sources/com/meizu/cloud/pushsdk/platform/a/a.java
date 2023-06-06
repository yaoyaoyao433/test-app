package com.meizu.cloud.pushsdk.platform.a;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.LinkedHashMap;
/* loaded from: classes3.dex */
public final class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

    public final c a(String str, String str2, String str3, int i, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appId", str);
        linkedHashMap.put(PushConstants.KEY_PUSH_ID, str3);
        linkedHashMap.put("msgType", String.valueOf(i));
        linkedHashMap.put("subSwitch", z ? "1" : "0");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(DeviceInfo.SIGN, com.meizu.cloud.pushsdk.platform.b.a(linkedHashMap, str2));
        DebugLogger.i("PushAPI", this.m + " switchPush post map " + linkedHashMap2);
        return com.meizu.cloud.pushsdk.c.a.b(this.m).a(linkedHashMap2).a().a();
    }

    public a(Context context) {
        this.k = "https://api-push.meizu.com/garcia/api/client/";
        this.a = this.k + "message/registerPush";
        this.b = this.k + "message/unRegisterPush";
        this.l = this.k + "advance/unRegisterPush";
        this.c = this.k + "message/getRegisterSwitch";
        this.m = this.k + "message/changeRegisterSwitch";
        this.d = this.k + "message/changeAllSwitch";
        this.e = this.k + "message/subscribeTags";
        this.f = this.k + "message/unSubscribeTags";
        this.g = this.k + "message/unSubAllTags";
        this.h = this.k + "message/getSubTags";
        this.i = this.k + "message/subscribeAlias";
        this.j = this.k + "message/unSubscribeAlias";
        this.n = this.k + "message/getSubAlias";
        this.o = this.k + "advance/changeRegisterSwitch";
        com.meizu.cloud.pushsdk.c.a.a.a();
        if (MzSystemUtils.isOverseas()) {
            this.k = "https://api-push.in.meizu.com/garcia/api/client/";
            this.a = this.k + "message/registerPush";
            this.b = this.k + "message/unRegisterPush";
            this.l = this.k + "advance/unRegisterPush";
            this.c = this.k + "message/getRegisterSwitch";
            this.m = this.k + "message/changeRegisterSwitch";
            this.d = this.k + "message/changeAllSwitch";
            this.e = this.k + "message/subscribeTags";
            this.f = this.k + "message/unSubscribeTags";
            this.g = this.k + "message/unSubAllTags";
            this.h = this.k + "message/getSubTags";
            this.i = this.k + "message/subscribeAlias";
            this.j = this.k + "message/unSubscribeAlias";
            this.n = this.k + "message/getSubAlias";
            this.o = this.k + "advance/changeRegisterSwitch";
        }
    }
}
