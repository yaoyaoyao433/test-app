package com.meituan.met.mercury.load.repository;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class BaseLoadRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String business;
    private final n loadCallback;
    private final DDLoadParams params;
    private final DDLoadStrategy strategy;

    public BaseLoadRequest(String str) {
        this(str, null);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f07f4caeccd8cb1ce19d767ecc2b887", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f07f4caeccd8cb1ce19d767ecc2b887");
        }
    }

    public BaseLoadRequest(String str, DDLoadStrategy dDLoadStrategy) {
        this(str, dDLoadStrategy, null);
        Object[] objArr = {str, dDLoadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8cb6f7ee6d3fcbd161a3fe1f7c5040e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8cb6f7ee6d3fcbd161a3fe1f7c5040e");
        }
    }

    public BaseLoadRequest(String str, DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams) {
        this(str, dDLoadStrategy, dDLoadParams, null);
        Object[] objArr = {str, dDLoadStrategy, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d00671c9ff627344567882ff8c06f4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d00671c9ff627344567882ff8c06f4d");
        }
    }

    public BaseLoadRequest(String str, DDLoadStrategy dDLoadStrategy, DDLoadParams dDLoadParams, n nVar) {
        Object[] objArr = {str, dDLoadStrategy, dDLoadParams, nVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44b9ec2518bdd159a14444176b8340be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44b9ec2518bdd159a14444176b8340be");
        } else if (TextUtils.isEmpty(str)) {
            throw new f((short) 1, "business params is empty");
        } else {
            this.business = str;
            this.strategy = dDLoadStrategy;
            this.params = dDLoadParams == null ? new DDLoadParams(0) : dDLoadParams;
            this.loadCallback = nVar;
        }
    }

    public String getBusiness() {
        return this.business;
    }

    public DDLoadStrategy getStrategy() {
        return this.strategy;
    }

    public DDLoadParams getParams() {
        return this.params;
    }

    public n getLoadCallback() {
        return this.loadCallback;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "244ce805785a1da59c5f2978520d7936", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "244ce805785a1da59c5f2978520d7936");
        }
        return "BaseLoadRequest{business='" + this.business + "', strategy=" + this.strategy + ", params=" + this.params + ", loadCallback=" + this.loadCallback + '}';
    }
}
