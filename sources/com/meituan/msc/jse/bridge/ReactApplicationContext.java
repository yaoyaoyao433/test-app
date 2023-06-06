package com.meituan.msc.jse.bridge;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactApplicationContext extends ReactContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IRuntimeDelegate mDelegate;

    public ReactApplicationContext(Context context, IRuntimeDelegate iRuntimeDelegate) {
        super(context.getApplicationContext(), iRuntimeDelegate);
        Object[] objArr = {context, iRuntimeDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "882500f40d632c1434a19248394f7586", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "882500f40d632c1434a19248394f7586");
        } else {
            this.mDelegate = iRuntimeDelegate;
        }
    }

    @Override // com.meituan.msc.jse.bridge.ReactContext
    public IRuntimeDelegate getRuntimeDelegate() {
        return this.mDelegate;
    }
}
