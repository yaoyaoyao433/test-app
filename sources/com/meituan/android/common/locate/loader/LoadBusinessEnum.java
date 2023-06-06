package com.meituan.android.common.locate.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public enum LoadBusinessEnum {
    MEITUAN,
    DIANPING,
    HOMEBREW;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    LoadBusinessEnum() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04c869ac7d334a015bb8b0eb87866e10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04c869ac7d334a015bb8b0eb87866e10");
        }
    }

    public static LoadBusinessEnum valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LoadBusinessEnum) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1329a83427e37efeb492d9f5a57a7ac6", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1329a83427e37efeb492d9f5a57a7ac6") : Enum.valueOf(LoadBusinessEnum.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LoadBusinessEnum[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LoadBusinessEnum[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14c87a79f1b5aab22725ff1d1fe5562f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14c87a79f1b5aab22725ff1d1fe5562f") : values().clone());
    }
}
