package com.meizu.cloud.pushsdk.notification.model.styleenum;
/* loaded from: classes3.dex */
public enum BaseStyleModel {
    FLYME(0),
    PURE_PICTURE(1),
    ANDROID(2);
    
    private final int code;

    BaseStyleModel(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
