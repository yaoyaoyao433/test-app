package com.meituan.android.common.dfingerprint.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public enum ContentType {
    plain_text,
    application_json;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    ContentType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9218719d5e6aa31d30e750b429fb55a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9218719d5e6aa31d30e750b429fb55a");
        }
    }

    public static ContentType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ContentType) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fafbe02911474af7cafb69af7f0e0a8a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fafbe02911474af7cafb69af7f0e0a8a") : Enum.valueOf(ContentType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ContentType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ContentType[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75a08905dc15aeac6d1821361d1d0d5a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75a08905dc15aeac6d1821361d1d0d5a") : values().clone());
    }
}
