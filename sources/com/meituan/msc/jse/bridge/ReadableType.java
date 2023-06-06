package com.meituan.msc.jse.bridge;

import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public enum ReadableType {
    Null,
    Boolean,
    Number,
    String,
    Map,
    Array;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static ReadableType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd55219f47e9817f9b5382bdf12310f4", RobustBitConfig.DEFAULT_VALUE) ? (ReadableType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd55219f47e9817f9b5382bdf12310f4") : (ReadableType) Enum.valueOf(ReadableType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ReadableType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d59c4035008b640dac2ef663e218992", RobustBitConfig.DEFAULT_VALUE) ? (ReadableType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d59c4035008b640dac2ef663e218992") : (ReadableType[]) values().clone();
    }

    ReadableType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f6e5b2a05ae33d8786c29bc3ab68de1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f6e5b2a05ae33d8786c29bc3ab68de1");
        }
    }
}
