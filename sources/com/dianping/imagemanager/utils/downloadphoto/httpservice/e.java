package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e implements p {
    public static ChangeQuickRedirect b;
    private Object a;
    private Object c;

    public e(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387374fb2c76e94b5572bf8cdbf250dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387374fb2c76e94b5572bf8cdbf250dc");
            return;
        }
        this.a = obj;
        this.c = obj2;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.p
    public final Object c() {
        return this.a;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.p
    public final Object d() {
        return this.c;
    }
}
