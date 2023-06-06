package com.dianping.base.push.pushservice.friends;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum d {
    APP_FIRST_LAUNCH(1),
    ALWAYS(2);
    
    public static ChangeQuickRedirect a;

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b80eb8fdf37a483f9ac84e438be98d6c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b80eb8fdf37a483f9ac84e438be98d6c") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6bc634d87fd38c193cd2fa461b84186", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6bc634d87fd38c193cd2fa461b84186") : (d[]) values().clone();
    }

    d(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd77f3b63148e9c2393597d5ba8fc30a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd77f3b63148e9c2393597d5ba8fc30a");
        }
    }
}
