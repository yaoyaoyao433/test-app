package com.meituan.android.mrn.component.map.view.childview;

import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class c extends com.facebook.react.views.view.f {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public f d;
    ao e;

    public c(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dec67d21e29359883769a0d8d508f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dec67d21e29359883769a0d8d508f7");
        } else {
            this.e = aoVar;
        }
    }

    public final void setParentMarker(f fVar) {
        this.d = fVar;
    }
}
