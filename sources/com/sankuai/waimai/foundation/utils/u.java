package com.sankuai.waimai.foundation.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class u<T> {
    public static ChangeQuickRedirect a;
    private HashSet<T> b;
    private ArrayList<T> c;

    public u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2cb2c2ccd5df75b8b263d15823a9a19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2cb2c2ccd5df75b8b263d15823a9a19");
            return;
        }
        this.b = new HashSet<>();
        this.c = new ArrayList<>();
    }
}
