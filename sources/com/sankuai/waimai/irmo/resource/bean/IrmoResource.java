package com.sankuai.waimai.irmo.resource.bean;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.singleton.b;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.resource.a;
import java.io.File;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class IrmoResource {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long expirationTime;
    public String irmoBundleId;
    public boolean isFromCache;
    public String rootPath;
    public String zipPath;

    public IrmoResource(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5d71152be2c1cedd259201f75dc77e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5d71152be2c1cedd259201f75dc77e8");
            return;
        }
        this.expirationTime = Long.MAX_VALUE;
        if (builder == null) {
            return;
        }
        this.expirationTime = builder.eTime;
        this.rootPath = builder.rootPath;
        this.irmoBundleId = builder.irmoBundleId;
        this.zipPath = builder.zipPath;
        this.isFromCache = builder.isFromCache;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private long eTime;
        private String irmoBundleId;
        public boolean isFromCache;
        private String rootPath;
        private String zipPath;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f926f67d70dedf00a3e05d457e6b6e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f926f67d70dedf00a3e05d457e6b6e3");
            } else {
                this.eTime = Long.MAX_VALUE;
            }
        }

        public Builder expire(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "565ca448aedb6810c4820b1e6eff6a6f", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "565ca448aedb6810c4820b1e6eff6a6f");
            }
            this.eTime = j;
            return this;
        }

        public Builder rootPath(String str) {
            this.rootPath = str;
            return this;
        }

        public Builder irmoBundleId(String str) {
            this.irmoBundleId = str;
            return this;
        }

        public Builder zipPath(String str) {
            this.zipPath = str;
            return this;
        }

        public Builder fromCache(boolean z) {
            this.isFromCache = z;
            return this;
        }

        public IrmoResource build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68c08574239ebf0ad39a128bb3a60ec8", RobustBitConfig.DEFAULT_VALUE) ? (IrmoResource) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68c08574239ebf0ad39a128bb3a60ec8") : new IrmoResource(this);
        }
    }

    public boolean isExpired() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3fe6a10102125d9cae4831736b0875c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3fe6a10102125d9cae4831736b0875c")).booleanValue() : System.currentTimeMillis() > this.expirationTime;
    }

    public static IrmoResource convert(DDResource dDResource) {
        Object[] objArr = {dDResource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bff2acb07a2c7fb0eff090b73a7d24b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IrmoResource) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bff2acb07a2c7fb0eff090b73a7d24b");
        }
        if (dDResource == null || TextUtils.isEmpty(dDResource.getName())) {
            return null;
        }
        long j = Long.MAX_VALUE;
        try {
            j = Long.parseLong(dDResource.getTags());
        } catch (Exception unused) {
        }
        return new Builder().irmoBundleId(dDResource.getName()).expire(j).zipPath(dDResource.getLocalPath()).rootPath(getUnZipPath(dDResource.getName())).fromCache(!dDResource.isFromNet()).build();
    }

    public static String getUnZipPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9a56cbdb9eded208660ee116c50629c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9a56cbdb9eded208660ee116c50629c");
        }
        try {
            Context context = b.a;
            StringBuilder sb = new StringBuilder("resource");
            sb.append(File.separator);
            sb.append(a.a().c() ? "test" : "prod");
            String absolutePath = q.a(context, "irmo", sb.toString(), u.b).getAbsolutePath();
            return absolutePath + File.separator + str;
        } catch (Exception unused) {
            return "";
        }
    }
}
