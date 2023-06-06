package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes6.dex */
public enum dj {
    ACTIVITY(PushConstants.INTENT_ACTIVITY_NAME),
    SERVICE_ACTION("service_action"),
    SERVICE_COMPONENT("service_component"),
    PROVIDER("provider");
    
    public String e;

    dj(String str) {
        this.e = str;
    }
}
