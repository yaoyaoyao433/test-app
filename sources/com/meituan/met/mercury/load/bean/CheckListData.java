package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CheckListData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<BundleData> bundles;
    public List<ResourceIdVersion> bundlesToDel;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cab33c7a513c2c830e77f07c1e2f1414", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cab33c7a513c2c830e77f07c1e2f1414");
        }
        return "CheckListData{bundles=" + this.bundles + ", bundlesToDel=" + this.bundlesToDel + '}';
    }
}
