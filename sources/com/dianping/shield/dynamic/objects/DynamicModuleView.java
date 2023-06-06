package com.dianping.shield.dynamic.objects;

import android.content.Context;
import android.view.View;
import com.dianping.shield.dynamic.mapping.DynamicViewDataMapping;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class DynamicModuleView {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void createView(Object obj, Context context, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData);

    public abstract View getModuleView();

    public abstract void paintViewData(Object obj, DynamicModuleViewItemData dynamicModuleViewItemData);

    public static DynamicModuleView createViewByModel(DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e12fe9388579fe06c841de92ff034ca", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e12fe9388579fe06c841de92ff034ca") : DynamicViewDataMapping.INSTANCE.getViewDataMapping().get(dynamicModuleViewItemData.getViewTypeInModel()).initView();
    }
}
