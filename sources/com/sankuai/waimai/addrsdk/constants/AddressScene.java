package com.sankuai.waimai.addrsdk.constants;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public enum AddressScene {
    DEFAULT_SCENE(0),
    CABINET_SCENE(1);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    public static AddressScene valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1f05aa63a0266520c616789a3e6c333", RobustBitConfig.DEFAULT_VALUE) ? (AddressScene) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1f05aa63a0266520c616789a3e6c333") : (AddressScene) Enum.valueOf(AddressScene.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AddressScene[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87af183e24cd5ecda84791312a5f64a7", RobustBitConfig.DEFAULT_VALUE) ? (AddressScene[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87af183e24cd5ecda84791312a5f64a7") : (AddressScene[]) values().clone();
    }

    AddressScene(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e79e365f8978e85792369bc6a9303f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e79e365f8978e85792369bc6a9303f8");
        } else {
            this.value = i;
        }
    }

    public static AddressScene valueOf(int i) {
        if (i == 1) {
            return CABINET_SCENE;
        }
        return DEFAULT_SCENE;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isCabinetScene() {
        return this.value == CABINET_SCENE.value;
    }
}
