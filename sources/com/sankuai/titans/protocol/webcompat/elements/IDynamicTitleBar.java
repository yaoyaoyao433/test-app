package com.sankuai.titans.protocol.webcompat.elements;

import android.graphics.drawable.Drawable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IDynamicTitleBar {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ResourceProvider {
        Drawable getDrawable(String str);
    }

    DynamicTitleBarEntity getDynamicTitleBar();

    ResourceProvider getResourceProvider();
}
