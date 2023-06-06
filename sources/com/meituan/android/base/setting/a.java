package com.meituan.android.base.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a c;
    public x b;
    private Context d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8efee10c2f67124f7f8caf6b324168b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8efee10c2f67124f7f8caf6b324168b");
            return;
        }
        this.d = context.getApplicationContext();
        this.b = x.a(q.a(this.d, "mtplatform_settings"));
    }
}
