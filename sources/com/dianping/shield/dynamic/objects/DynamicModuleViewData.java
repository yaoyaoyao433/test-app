package com.dianping.shield.dynamic.objects;

import com.dianping.shield.dynamic.mapping.DynamicViewDataMapping;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class DynamicModuleViewData implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract int getInputHeight();

    public abstract int getInputWidth();

    public abstract Object getViewInput();

    public abstract boolean hasInput();

    public void onStatusChanged(AttachStatus attachStatus, ScrollDirection scrollDirection) {
    }

    public abstract void setViewInput(Object obj);

    public static DynamicModuleViewData createViewDataByModel(DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a65b631716cb91bf69d69f5bdc62ff38", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleViewData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a65b631716cb91bf69d69f5bdc62ff38");
        }
        if (DynamicViewDataMapping.INSTANCE.getViewDataMapping().get(dynamicModuleViewItemData.getViewTypeInModel()) != null) {
            return DynamicViewDataMapping.INSTANCE.getViewDataMapping().get(dynamicModuleViewItemData.getViewTypeInModel()).initViewData();
        }
        return null;
    }

    public Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9576e5ac4fd72a8760130de59d5c1f54", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9576e5ac4fd72a8760130de59d5c1f54") : super.clone();
    }
}
