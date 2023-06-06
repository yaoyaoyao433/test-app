package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum MapFontSize {
    tiny(0, 4),
    small(1, 3),
    normal(2, 0),
    large(3, 1),
    huge(4, 2);
    
    private int engineCode;
    private int fontSize;

    MapFontSize(int i, int i2) {
        this.fontSize = i;
        this.engineCode = i2;
    }

    public final int getValue() {
        return this.engineCode;
    }

    public final int getFontSize() {
        return this.fontSize;
    }
}
