package com.meituan.android.mtplayer.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum l {
    TYPE_IJK,
    TYPE_ANDROID,
    TYPE_XPLAYER;
    
    public static ChangeQuickRedirect a;

    l() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5452796488b8ce55693ec7036b99eac2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5452796488b8ce55693ec7036b99eac2");
        }
    }

    public static l valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3ad1d41a933b3d9b5e1484463d96f97", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3ad1d41a933b3d9b5e1484463d96f97") : (l) Enum.valueOf(l.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static l[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d926188bffe1c0cf2914ef12fc905bbe", RobustBitConfig.DEFAULT_VALUE) ? (l[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d926188bffe1c0cf2914ef12fc905bbe") : (l[]) values().clone();
    }
}
