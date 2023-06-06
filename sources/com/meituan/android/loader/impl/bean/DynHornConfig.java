package com.meituan.android.loader.impl.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DynHornConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<String> assetsUnzipWhiteList;
    private List<String> soUnzipWhiteList;

    public DynHornConfig() {
    }

    public DynHornConfig(List<String> list, List<String> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e2ba71fa4724bd2b41ac6581da5a480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e2ba71fa4724bd2b41ac6581da5a480");
            return;
        }
        this.soUnzipWhiteList = list;
        this.assetsUnzipWhiteList = list2;
    }

    public List<String> getSoUnzipWhiteList() {
        return this.soUnzipWhiteList;
    }

    public List<String> getAssetsUnzipWhiteList() {
        return this.assetsUnzipWhiteList;
    }
}
