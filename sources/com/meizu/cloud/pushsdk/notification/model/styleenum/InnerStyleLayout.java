package com.meizu.cloud.pushsdk.notification.model.styleenum;
/* loaded from: classes3.dex */
public enum InnerStyleLayout {
    EXPANDABLE_STANDARD(0),
    EXPANDABLE_TEXT(1),
    EXPANDABLE_PIC(2),
    EXPANDABLE_VIDEO(3);
    
    private final int code;

    InnerStyleLayout(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
