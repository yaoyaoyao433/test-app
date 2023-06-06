package com.dianping.dataservice.mapi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a<T> extends com.dianping.dataservice.http.a implements e<T> {
    public static ChangeQuickRedirect c;
    public boolean d;
    public int e;
    public String f;
    private c g;
    private com.dianping.archive.c<T> h;

    public a(String str, String str2, InputStream inputStream, c cVar, boolean z, int i, List<com.dianping.apache.http.a> list, long j, com.dianping.archive.c<T> cVar2) {
        super(str, str2, inputStream, list, j);
        Object[] objArr = {str, str2, inputStream, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), list, new Long(j), cVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6b3dce95033ddf872141a01ee1d0b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6b3dce95033ddf872141a01ee1d0b0");
            return;
        }
        this.e = 100;
        this.g = cVar;
        this.h = cVar2;
        this.d = z;
        this.e = z ? i : 100;
        if (inputStream == null || a(list, "Content-Type")) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.dianping.apache.http.message.a("Content-Type", "application/mapi"));
        a(arrayList);
    }

    @Override // com.dianping.dataservice.mapi.e
    public final com.dianping.archive.c<T> f() {
        return this.h;
    }

    @Override // com.dianping.dataservice.mapi.e
    public final c g() {
        return this.g;
    }

    @Override // com.dianping.dataservice.mapi.e
    public final boolean h() {
        return this.d;
    }

    private boolean a(List<com.dianping.apache.http.a> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45db968ee667866133021a346431ee3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45db968ee667866133021a346431ee3")).booleanValue();
        }
        if (list == null) {
            return false;
        }
        for (com.dianping.apache.http.a aVar : list) {
            if (aVar.a().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
