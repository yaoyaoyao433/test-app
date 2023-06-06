package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i implements com.sankuai.waimai.router.core.i {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.router.core.i
    public void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea4c98400dcb1acc606f2900998fc26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea4c98400dcb1acc606f2900998fc26");
            return;
        }
        a(jVar);
        gVar.a();
    }

    public void a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d440981a60c7641ba8e76bf50326d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d440981a60c7641ba8e76bf50326d8");
            return;
        }
        Map map = (Map) jVar.a(Map.class, "com.sankuai.waimai.router.UriParamInterceptor.uri_append_params");
        if (map != null) {
            jVar.a(com.sankuai.waimai.router.utils.f.a(jVar.d, map));
        }
    }
}
