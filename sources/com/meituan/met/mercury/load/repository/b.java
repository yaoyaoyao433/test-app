package com.meituan.met.mercury.load.repository;

import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends BaseLoadRequest {
    public static ChangeQuickRedirect a;
    public final List<ResourceNameVersion> b;

    public b(String str, DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, List<ResourceNameVersion> list, n nVar) {
        super(str, dDLoadStrategy, dDLoadParams, nVar);
        Object[] objArr = {str, dDLoadStrategy, dDLoadParams, list, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ac843fd27cbb47a18a2e7bdc03b9ebe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ac843fd27cbb47a18a2e7bdc03b9ebe");
        } else {
            this.b = list;
        }
    }

    @Override // com.meituan.met.mercury.load.repository.BaseLoadRequest
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "737ebb07f9491d3f958a455fb396ff80", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "737ebb07f9491d3f958a455fb396ff80");
        }
        return "FetchSpecifiedListRequest{nameVersions=" + this.b + '}';
    }
}
