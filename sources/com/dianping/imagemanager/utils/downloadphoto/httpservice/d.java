package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d implements n {
    public static ChangeQuickRedirect b;
    private String a;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75876ac7430e636819084252a2879f6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75876ac7430e636819084252a2879f6b");
        } else {
            this.a = str;
        }
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.n
    public final String f() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}
