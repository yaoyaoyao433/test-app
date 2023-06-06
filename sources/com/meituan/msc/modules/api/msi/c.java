package com.meituan.msc.modules.api.msi;

import com.meituan.msc.modules.engine.h;
import com.meituan.msi.ApiPortal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c<T> implements com.meituan.msi.interceptor.a<T> {
    public static ChangeQuickRedirect a;
    protected h b;

    public abstract String a();

    public final void a(ApiPortal.a aVar, h hVar) {
        Object[] objArr = {aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3832250f764e42f9863a52d828559ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3832250f764e42f9863a52d828559ec9");
            return;
        }
        this.b = hVar;
        aVar.a(a(), this);
    }
}
