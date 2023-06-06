package com.dianping.nvnetwork.shark.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum e {
    OFFLINE(0),
    BAD(1),
    GOOD(2),
    MODERATE(3),
    UNKNOWN(-1);
    
    public static ChangeQuickRedirect a;
    public int g;

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "168118e97b0fbc2c13908bbc25e7a45a", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "168118e97b0fbc2c13908bbc25e7a45a") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b93a0bb21cba69d72f1d56564a09ecae", 6917529027641081856L) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b93a0bb21cba69d72f1d56564a09ecae") : (e[]) values().clone();
    }

    e(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768dab87856dfbb4112de0800affc656", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768dab87856dfbb4112de0800affc656");
        } else {
            this.g = i;
        }
    }
}
