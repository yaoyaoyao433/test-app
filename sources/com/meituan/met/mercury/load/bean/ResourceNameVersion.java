package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ResourceNameVersion {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;
    private String version;

    public ResourceNameVersion() {
    }

    public ResourceNameVersion(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0129b592b6fc1547431f96ef3ef4a855", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0129b592b6fc1547431f96ef3ef4a855");
            return;
        }
        this.version = str2;
        this.name = str;
    }

    public static List<ResourceNameVersion> transformToList(List<DDResource> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a31c2debd42dc3a759e6e0529dfdad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a31c2debd42dc3a759e6e0529dfdad1");
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Builder builder = new Builder();
        for (DDResource dDResource : list) {
            builder.name(dDResource.getName());
            builder.version(dDResource.getVersion());
            arrayList.add(builder.build());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "584d25e65c955d1a4a7891aab608a80d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "584d25e65c955d1a4a7891aab608a80d")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResourceNameVersion) {
            ResourceNameVersion resourceNameVersion = (ResourceNameVersion) obj;
            return Objects.equals(this.name, resourceNameVersion.name) && Objects.equals(this.version, resourceNameVersion.version);
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7510109a62710bab9bc5f7723c70140", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7510109a62710bab9bc5f7723c70140")).intValue() : Objects.hash(this.name, this.version);
    }

    public String getVersion() {
        return this.version;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80a350951b1e715370e0e2567239226f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80a350951b1e715370e0e2567239226f");
        }
        return "ResourceNameVersion{name='" + this.name + "', version='" + this.version + "'}";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String name;
        private String version;

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder version(String str) {
            this.version = str;
            return this;
        }

        public final ResourceNameVersion build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a02fa735a3fe28906fe28601d0dba79", RobustBitConfig.DEFAULT_VALUE)) {
                return (ResourceNameVersion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a02fa735a3fe28906fe28601d0dba79");
            }
            ResourceNameVersion resourceNameVersion = new ResourceNameVersion();
            resourceNameVersion.name = this.name;
            resourceNameVersion.version = this.version;
            return resourceNameVersion;
        }
    }
}
