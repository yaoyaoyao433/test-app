package com.dianping.shield.dynamic.protocols;

import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IDynamicModuleViewItem {
    DynamicModuleViewItemData getViewItemData();

    void setComputeViewInputListener(ComputeViewInputListener computeViewInputListener);
}
