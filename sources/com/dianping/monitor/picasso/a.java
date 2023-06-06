package com.dianping.monitor.picasso;

import android.content.Context;
import com.dianping.monitor.impl.l;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements l {
    public static ChangeQuickRedirect a;
    private final m b;

    public a(int i, Context context, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca316f7057356f713cfe9212a18e911c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca316f7057356f713cfe9212a18e911c");
        } else {
            this.b = new m(i, context, str, b.a(context, str2, str3));
        }
    }

    @Override // com.dianping.monitor.impl.l
    public final l a(String str, List<Float> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb6b9cca1e4ce1ec6d856292717695d", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb6b9cca1e4ce1ec6d856292717695d");
        }
        this.b.a(str, list);
        return this;
    }

    @Override // com.dianping.monitor.impl.l
    public final l a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b810bed7dd893595bc44831c3035314c", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b810bed7dd893595bc44831c3035314c");
        }
        this.b.a(str, str2);
        return this;
    }

    @Override // com.dianping.monitor.impl.l
    public final l a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690451d2323cf84c4ba21c72687f3bd0", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690451d2323cf84c4ba21c72687f3bd0");
        }
        this.b.a(str);
        return this;
    }

    @Override // com.dianping.monitor.impl.l
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6a52aa18522f088b4ddb779ace5e68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6a52aa18522f088b4ddb779ace5e68");
        } else {
            this.b.a();
        }
    }
}
