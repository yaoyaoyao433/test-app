package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b implements c {
    public static ChangeQuickRedirect a;
    private List<String> b;

    public b(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aae35c3abcf6fcfc24830d171303086", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aae35c3abcf6fcfc24830d171303086");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.b = list;
    }

    @Override // com.meituan.android.httpdns.c
    public synchronized boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f47f510dab8e338e8025e77f9730e0b1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f47f510dab8e338e8025e77f9730e0b1")).booleanValue();
        }
        return this.b == null || this.b.isEmpty() || this.b.contains(str);
    }
}
