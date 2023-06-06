package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ResourceIdVersion {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String id;
    public String version;

    public ResourceIdVersion(DDResource dDResource) {
        this(dDResource.getName(), dDResource.getVersion());
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84db7fcdb96c421a6e41509bf36a92ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84db7fcdb96c421a6e41509bf36a92ce");
        }
    }

    public ResourceIdVersion(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a5be96a8126e257d503f72a5c2e4580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a5be96a8126e257d503f72a5c2e4580");
            return;
        }
        this.id = str;
        this.version = str2;
    }

    public static List<ResourceIdVersion> transformToList(List<DDResource> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fea62e25276edf1b8dc296e8c226063", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fea62e25276edf1b8dc296e8c226063");
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DDResource dDResource : list) {
            arrayList.add(new ResourceIdVersion(dDResource));
        }
        return arrayList;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d3efa7b009b5689f6f727b02ac64c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d3efa7b009b5689f6f727b02ac64c8a");
        }
        return "ResourceIdVersion{id='" + this.id + "', version='" + this.version + "'}";
    }
}
