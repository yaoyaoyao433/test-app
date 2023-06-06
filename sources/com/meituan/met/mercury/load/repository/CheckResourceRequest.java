package com.meituan.met.mercury.load.repository;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CheckResourceRequest extends BaseLoadRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Set<String> requestResources;

    public CheckResourceRequest(String str, DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, n nVar, Set<String> set) {
        super(str, dDLoadStrategy, dDLoadParams, nVar);
        Object[] objArr = {str, dDLoadStrategy, dDLoadParams, nVar, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88600abf28f62c4f3b2a95e47126c8e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88600abf28f62c4f3b2a95e47126c8e5");
        } else {
            this.requestResources = set == null ? Collections.emptySet() : set;
        }
    }

    public Set<String> getRequestResources() {
        return this.requestResources;
    }

    @Override // com.meituan.met.mercury.load.repository.BaseLoadRequest
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bea0ada8e57ddc1a7070458685088b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bea0ada8e57ddc1a7070458685088b2");
        }
        return "CheckResourceRequest{requestResources=" + this.requestResources + '}';
    }
}
