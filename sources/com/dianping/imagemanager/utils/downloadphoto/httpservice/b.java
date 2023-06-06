package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b extends e implements j {
    public static ChangeQuickRedirect a;
    private int c;
    private List<l> d;

    public b(int i, Object obj, List<l> list, Object obj2) {
        super(obj, obj2);
        Object[] objArr = {Integer.valueOf(i), obj, list, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c598b5fba241bfee13fa327aa3d9fc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c598b5fba241bfee13fa327aa3d9fc1");
            return;
        }
        this.c = i;
        this.d = list;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.j
    public final int a() {
        return this.c;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.j
    public final List<l> b() {
        return this.d;
    }
}
