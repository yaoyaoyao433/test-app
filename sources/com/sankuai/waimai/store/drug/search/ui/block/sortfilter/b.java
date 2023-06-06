package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum b {
    NO_ARROW,
    ONE_GREY_UP,
    ONE_GERY_DOWN,
    ONE_ORANGE_UP,
    ONE_ORANGE_DOWN,
    TWO_GREY,
    TWO_UP_GREY,
    TWO_DOWN_GREY;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244905cb5790c5e3e0b9a35b96f2f805", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244905cb5790c5e3e0b9a35b96f2f805");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba300bd916cf41ee1de86e235675e232", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba300bd916cf41ee1de86e235675e232") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb6961ebac4aa0361b456c83db341997", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb6961ebac4aa0361b456c83db341997") : (b[]) values().clone();
    }
}
