package com.dianping.dataservice.http.impl;

import com.dianping.dataservice.http.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends com.dianping.dataservice.impl.a implements c {
    public static ChangeQuickRedirect a;
    protected int b;
    private List<com.dianping.apache.http.a> c;

    public a(int i, Object obj, List<com.dianping.apache.http.a> list, Object obj2) {
        super(obj, obj2);
        Object[] objArr = {Integer.valueOf(i), obj, list, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a28bd1fadf734be16aded6b8f41d2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a28bd1fadf734be16aded6b8f41d2b");
            return;
        }
        this.b = i;
        this.c = list;
    }

    @Override // com.dianping.dataservice.http.c
    public final int b() {
        return this.b;
    }
}
