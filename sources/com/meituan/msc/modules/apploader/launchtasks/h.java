package com.meituan.msc.modules.apploader.launchtasks;

import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements com.meituan.msc.common.support.java.util.function.d {
    public static ChangeQuickRedirect a;
    private final g b;

    public h(g gVar) {
        this.b = gVar;
    }

    @Override // com.meituan.msc.common.support.java.util.function.d
    public final Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5a33284acc86a3d0c9b85b0ab54deb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5a33284acc86a3d0c9b85b0ab54deb") : g.a(this.b, (AppMetaInfoWrapper) obj);
    }
}
