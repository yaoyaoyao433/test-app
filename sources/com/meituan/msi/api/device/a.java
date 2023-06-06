package com.meituan.msi.api.device;

import android.content.Context;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect b;
    protected Context c;
    protected MtSensorManager d;
    protected String e;
    public boolean f;

    public void a(MsiContext msiContext) {
    }

    public a(Context context, MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {context, mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91669ad2c39c87977b6a67006a18d6b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91669ad2c39c87977b6a67006a18d6b9");
            return;
        }
        this.f = false;
        this.c = context.getApplicationContext();
        this.d = mtSensorManager;
        this.e = str;
    }

    public final void a(boolean z) {
        this.f = z;
    }
}
