package com.meituan.msc.modules.page;

import com.meituan.msc.modules.manager.MSCMethod;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface d {
    @MSCMethod
    void disableScrollBounce(boolean z);

    @MSCMethod
    void setBackgroundColor(int i);

    @MSCMethod
    void setBackgroundTextStyle(boolean z);

    @MSCMethod
    void startPullDownRefresh();

    @MSCMethod
    void stopPullDownRefresh();
}
