package com.sankuai.xm.base.tinyorm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    int c;
    public C1377a d;
    public boolean e;
    boolean f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.tinyorm.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1377a {
        public boolean a;
    }

    public a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52211d6415c9ba4cdcbafafed2f6c722", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52211d6415c9ba4cdcbafafed2f6c722");
            return;
        }
        this.b = str;
        this.c = i;
        this.d = null;
        this.e = true;
        this.f = false;
    }
}
