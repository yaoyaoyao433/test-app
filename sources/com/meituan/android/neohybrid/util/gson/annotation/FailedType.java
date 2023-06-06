package com.meituan.android.neohybrid.util.gson.annotation;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public enum FailedType {
    NULL,
    EXCEPTION,
    FIELD_NULL;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static FailedType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bcbef684a36b2940c8dc9846617f70d", RobustBitConfig.DEFAULT_VALUE) ? (FailedType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bcbef684a36b2940c8dc9846617f70d") : (FailedType) Enum.valueOf(FailedType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FailedType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "009df5a679ed9a1022c8f2b929e0df5f", RobustBitConfig.DEFAULT_VALUE) ? (FailedType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "009df5a679ed9a1022c8f2b929e0df5f") : (FailedType[]) values().clone();
    }

    FailedType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03d10a39ba9815cfdd6e83b50f5d61d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03d10a39ba9815cfdd6e83b50f5d61d0");
        }
    }
}
