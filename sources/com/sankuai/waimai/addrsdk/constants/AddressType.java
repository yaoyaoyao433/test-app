package com.sankuai.waimai.addrsdk.constants;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public enum AddressType {
    LBS_TYPE(1),
    POST_TYPE(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    public static AddressType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3a16817fc852273cdf97847de91f5be", RobustBitConfig.DEFAULT_VALUE) ? (AddressType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3a16817fc852273cdf97847de91f5be") : (AddressType) Enum.valueOf(AddressType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AddressType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70e2d906dedd0f96fc3d958061c5e14c", RobustBitConfig.DEFAULT_VALUE) ? (AddressType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70e2d906dedd0f96fc3d958061c5e14c") : (AddressType[]) values().clone();
    }

    AddressType(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6286fa5bfb76ee230ca9e2f60bf3b290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6286fa5bfb76ee230ca9e2f60bf3b290");
        } else {
            this.value = i;
        }
    }

    public final AddressType valueOf(int i) {
        switch (i) {
            case 1:
                return LBS_TYPE;
            case 2:
                return POST_TYPE;
            default:
                return null;
        }
    }

    public final int getValue() {
        return this.value;
    }
}
