package com.meituan.android.mrn.component.list.item;

import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MListExpressionManager extends ViewGroupManager<b> {
    public static final String COMPONENT_NAME = "MRNListExpression";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return COMPONENT_NAME;
    }

    @ReactProp(name = "index")
    public void setForIndexName(b bVar, Dynamic dynamic) {
    }

    @ReactProp(name = "item")
    public void setForItemName(b bVar, Dynamic dynamic) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public b createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944ed134ed8f5868aef6f7688b1de018", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944ed134ed8f5868aef6f7688b1de018") : new b(aoVar);
    }

    @ReactProp(name = "lif")
    public void setCondition(b bVar, Dynamic dynamic) {
        Object[] objArr = {bVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13875027a7e1f4d06a677daa3b91e54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13875027a7e1f4d06a677daa3b91e54b");
        } else {
            bVar.setCondition(dynamic);
        }
    }

    @ReactProp(name = "lfor")
    public void setRepeat(b bVar, Dynamic dynamic) {
        Object[] objArr = {bVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ede2e70fa1c60b63b7f19ca3b8d9d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ede2e70fa1c60b63b7f19ca3b8d9d76");
        } else {
            bVar.setRepeat(dynamic);
        }
    }

    @ReactProp(name = "lnotif")
    public void setInversion(b bVar, Dynamic dynamic) {
        Object[] objArr = {bVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4a1c51bbbb7aafb3fce899d7a9f976f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4a1c51bbbb7aafb3fce899d7a9f976f");
        } else {
            bVar.setInversion(dynamic);
        }
    }

    public static boolean converseDynamicToBoolean(Dynamic dynamic) {
        Object[] objArr = {dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a428b016511072d9d5cfadc33eb5d75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a428b016511072d9d5cfadc33eb5d75")).booleanValue();
        }
        if (dynamic == null) {
            return false;
        }
        ReadableType type = dynamic.getType();
        if (type == ReadableType.Boolean) {
            return dynamic.asBoolean();
        }
        return type == ReadableType.String ? !TextUtils.isEmpty(dynamic.asString()) : type != ReadableType.Null && type == ReadableType.Number && dynamic.asDouble() > 0.0d;
    }
}
