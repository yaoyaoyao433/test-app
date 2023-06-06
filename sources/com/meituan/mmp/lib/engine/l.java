package com.meituan.mmp.lib.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum l {
    DEFAULT("mmp_preload"),
    MT_TINY("mmp_preload_mt_tiny");
    
    public static ChangeQuickRedirect a;
    public final String d;

    public static l valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d694e9474479e077b6ff1421d1a193", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d694e9474479e077b6ff1421d1a193") : (l) Enum.valueOf(l.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2818714b1e894e8a138a47053097b3f", RobustBitConfig.DEFAULT_VALUE) ? (l[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2818714b1e894e8a138a47053097b3f") : (l[]) values().clone();
    }

    l(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2894b84081fd71ddc75db2cccbeec1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2894b84081fd71ddc75db2cccbeec1c");
        } else {
            this.d = str;
        }
    }
}
