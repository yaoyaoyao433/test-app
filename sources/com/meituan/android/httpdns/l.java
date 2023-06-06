package com.meituan.android.httpdns;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l implements o {
    public static ChangeQuickRedirect a;
    private Context b;

    public static com.meituan.android.cipstorage.q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a01e19f621970c195b04ece68f3f9278", 6917529027641081856L) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a01e19f621970c195b04ece68f3f9278") : com.meituan.android.cipstorage.q.a(context, "httpdns");
    }

    public l(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60d6efb390a930c4b9dc8fa3958df20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60d6efb390a930c4b9dc8fa3958df20");
            return;
        }
        this.b = null;
        this.b = context;
    }

    @Override // com.meituan.android.httpdns.o
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e902ec8686b86b29a669058978b0c7c6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e902ec8686b86b29a669058978b0c7c6") : a(this.b).b(str, "");
    }

    @Override // com.meituan.android.httpdns.o
    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d72d2c5ff7d014473123caa8d9a6e7", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d72d2c5ff7d014473123caa8d9a6e7")).booleanValue() : a(this.b).a(str, str2);
    }
}
