package com.meituan.android.cube.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;
    HashMap<String, Object> b;
    private HashMap<String, Map<String, Object>> c;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417ca6d597bc5f62200ced2f89a75c66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417ca6d597bc5f62200ced2f89a75c66");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }
}
