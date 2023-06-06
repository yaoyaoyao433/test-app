package com.sankuai.titans.protocol.services;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IStorageService {
    public static final int LEVEL_CLOUD = 2;
    public static final int LEVEL_DISK = 1;
    public static final int LEVEL_MEMORY = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public @interface Level {
    }

    String getValue(String str);

    void removeValue(String str);

    void setValue(String str, String str2, @Level int i);
}
