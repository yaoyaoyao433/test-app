package com.meituan.mmp.lib.api.device;

import android.content.Context;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect b;
    protected Context c;
    protected MtSensorManager d;
    protected String e;
    protected com.meituan.mmp.lib.interfaces.c f;
    protected boolean g;

    public void a(IApiCallback iApiCallback) {
    }

    public c(Context context, MtSensorManager mtSensorManager, String str, com.meituan.mmp.lib.interfaces.c cVar) {
        Object[] objArr = {context, mtSensorManager, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04a4abf7896c3935b72728204d9198c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04a4abf7896c3935b72728204d9198c");
            return;
        }
        this.g = false;
        this.c = context.getApplicationContext();
        this.d = mtSensorManager;
        this.e = str;
        this.f = cVar;
    }

    public void a(boolean z) {
        this.g = z;
    }
}
