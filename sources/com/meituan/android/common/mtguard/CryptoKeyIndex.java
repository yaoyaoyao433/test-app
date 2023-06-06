package com.meituan.android.common.mtguard;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public enum CryptoKeyIndex {
    AESKEY("aesKey"),
    COMMONKEY("commonKey"),
    CONCHKEY("conchKey"),
    WTKEY("wtKey"),
    MAOYANKEY("maoyan_aes_key"),
    OWLKEY("owl_aes_key");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public String value;

    CryptoKeyIndex(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d3cfb93a16a1db4e5115d0446f90b6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d3cfb93a16a1db4e5115d0446f90b6b");
        } else {
            this.value = str;
        }
    }

    public static CryptoKeyIndex valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (CryptoKeyIndex) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22126ebd6b267f7af36c0cc8f10ab7c7", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22126ebd6b267f7af36c0cc8f10ab7c7") : Enum.valueOf(CryptoKeyIndex.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CryptoKeyIndex[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (CryptoKeyIndex[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78d18d2c6885a20d53f87468e11bc57b", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78d18d2c6885a20d53f87468e11bc57b") : values().clone());
    }
}
