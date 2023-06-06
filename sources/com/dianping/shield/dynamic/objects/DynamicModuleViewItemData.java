package com.dianping.shield.dynamic.objects;

import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.LoadItemListener;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.node.useritem.DataHashable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class DynamicModuleViewItemData implements DataHashable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int backgroundColor;
    public int computePriority;
    public ComputeViewInputListener computeViewInputListener;
    public int height;
    public String identifier;
    public int index;
    private boolean isLoad;
    public JSONObject jsContextInject;
    public String jsName;
    public String jsonData;
    public LoadItemListener loadItemListener;
    public BaseViewInfo newViewInfo;
    public String reuseId;
    public int selectionStyle;
    public DynamicModuleViewData viewData;
    public int width;

    public DynamicModuleViewItemData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dad344a2b063656c31fef663c52f3ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dad344a2b063656c31fef663c52f3ad");
            return;
        }
        this.computePriority = 0;
        this.index = 0;
        this.selectionStyle = DMConstant.SelectionStyle.NONE.value;
        this.backgroundColor = Integer.MAX_VALUE;
        this.isLoad = false;
    }

    public final DMConstant.DynamicModuleViewType getViewTypeInModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db9ac5b85ca17f9f9c4043d839eebe89", RobustBitConfig.DEFAULT_VALUE)) {
            return (DMConstant.DynamicModuleViewType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db9ac5b85ca17f9f9c4043d839eebe89");
        }
        return DMConstant.DynamicModuleViewType.valuesCustom()[this.newViewInfo.getViewType() != null ? this.newViewInfo.getViewType().intValue() : 0];
    }

    public final void updateViewInfo(BaseViewInfo baseViewInfo) {
        Object[] objArr = {baseViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c029ecec37b893383cb8baaf0f2f527e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c029ecec37b893383cb8baaf0f2f527e");
            return;
        }
        this.newViewInfo = baseViewInfo;
        this.viewData = DynamicModuleViewData.createViewDataByModel(this);
        this.jsName = baseViewInfo.getJsName();
        this.jsonData = baseViewInfo.getData();
        this.jsContextInject = baseViewInfo.getContext();
        this.reuseId = baseViewInfo.getReuseid();
        this.identifier = baseViewInfo.getIdentifier();
    }

    public final void resetViewInfo(BaseViewInfo baseViewInfo) {
        Object[] objArr = {baseViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06ddb59a858f5ab5672d2e2c16d5e20c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06ddb59a858f5ab5672d2e2c16d5e20c");
            return;
        }
        this.newViewInfo = baseViewInfo;
        this.jsName = baseViewInfo.getJsName();
        this.jsonData = baseViewInfo.getData();
        this.jsContextInject = baseViewInfo.getContext();
        this.reuseId = baseViewInfo.getReuseid();
        this.identifier = baseViewInfo.getIdentifier();
    }

    public final void onLoad() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fdf83c92c8e7c4818cfad5e67577f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fdf83c92c8e7c4818cfad5e67577f64");
        } else if (this.isLoad || this.loadItemListener == null) {
        } else {
            this.loadItemListener.onItemLoad(this);
            this.isLoad = true;
        }
    }

    public final Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05e5c8fa0903de565435c89c32964afd", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05e5c8fa0903de565435c89c32964afd");
        }
        try {
            DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) super.clone();
            if (dynamicModuleViewItemData.viewData != null) {
                dynamicModuleViewItemData.viewData = (DynamicModuleViewData) this.viewData.clone();
            }
            return dynamicModuleViewItemData;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean hasInput() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b866b143ba8e96d4c3bc8dfab430d55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b866b143ba8e96d4c3bc8dfab430d55")).booleanValue();
        }
        if (this.viewData == null) {
            return false;
        }
        return this.viewData.hasInput();
    }

    @Override // com.dianping.shield.node.useritem.DataHashable
    @Nullable
    public final Integer dataHash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3a2c623b768f7dc9c7308b3c90141da", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3a2c623b768f7dc9c7308b3c90141da");
        }
        if (this.jsonData != null) {
            return Integer.valueOf(this.jsonData.hashCode());
        }
        return null;
    }
}
