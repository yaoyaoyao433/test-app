package com.meituan.msc.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    public Uri b;
    public Context c;

    public void a(@Nullable String str) {
    }

    public boolean a() {
        return true;
    }

    public abstract boolean a(Context context, Uri uri, Intent intent, boolean z);

    public a(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03382981e0e9aa109d39c43dd819567b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03382981e0e9aa109d39c43dd819567b");
            return;
        }
        this.b = uri;
        this.c = context.getApplicationContext();
    }
}
