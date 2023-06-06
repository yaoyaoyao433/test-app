package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.JSApplicationCausedNativeException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g extends JSApplicationCausedNativeException {
    public static ChangeQuickRedirect a;
    @Nullable
    private View b;

    public g(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90788f951b0b7cc446d5c6c4f25b7eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90788f951b0b7cc446d5c6c4f25b7eb");
        }
    }

    public g(String str, @Nullable View view, Throwable th) {
        super(str, th);
        Object[] objArr = {str, view, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bfee1583a2e234abea639c251b46a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bfee1583a2e234abea639c251b46a7");
        } else {
            this.b = view;
        }
    }
}
