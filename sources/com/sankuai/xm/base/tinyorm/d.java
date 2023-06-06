package com.sankuai.xm.base.tinyorm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    String b;
    Class c;
    LinkedList<com.sankuai.xm.base.tinyorm.a> d;
    LinkedHashMap<String, com.sankuai.xm.base.tinyorm.a> e;
    LinkedList<a> f;

    public d(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6eb43ec7356b9394740f016c75ef70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6eb43ec7356b9394740f016c75ef70");
            return;
        }
        this.b = str;
        this.c = cls;
        this.d = new LinkedList<>();
        this.e = new LinkedHashMap<>();
        this.f = new LinkedList<>();
    }

    public final void a(String str, com.sankuai.xm.base.tinyorm.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759cdc157e9ea11ddb9592acf2818283", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759cdc157e9ea11ddb9592acf2818283");
        } else {
            this.e.put(str, aVar);
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdeec6bc5736fe044fe23c0cdcb1360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdeec6bc5736fe044fe23c0cdcb1360");
        } else {
            this.f.add(aVar);
        }
    }

    public final void a(com.sankuai.xm.base.tinyorm.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a2c9045414bfa8a0986db5b1b84fb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a2c9045414bfa8a0986db5b1b84fb9");
        } else {
            this.d.add(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        boolean d;

        public a(String str, String str2, boolean z) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fcc7b58b3cb978540a4203aeacffc1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fcc7b58b3cb978540a4203aeacffc1");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = z;
        }
    }
}
