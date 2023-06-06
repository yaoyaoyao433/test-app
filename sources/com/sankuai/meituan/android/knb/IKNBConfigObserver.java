package com.sankuai.meituan.android.knb;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IKNBConfigObserver {
    public static final int TYPE_PRELOAD = 1;

    int getType();

    void onConfigReady(int i);
}
