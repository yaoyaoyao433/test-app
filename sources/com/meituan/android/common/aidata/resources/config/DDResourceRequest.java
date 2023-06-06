package com.meituan.android.common.aidata.resources.config;

import com.meituan.android.common.aidata.resources.downloader.DDResRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DDResourceRequest extends DDResRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isStart;
    public String mBiz;
    public String mResourcePackName;
    public String mVer;

    public DDResourceRequest(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b7919fa0a72457e8b357fc3eb9b7aad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b7919fa0a72457e8b357fc3eb9b7aad");
            return;
        }
        this.mResourcePackName = str;
        this.mVer = str2;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "040cbe5182fb78d413a1bcd4b2bdf5ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "040cbe5182fb78d413a1bcd4b2bdf5ad")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DDResourceRequest dDResourceRequest = (DDResourceRequest) obj;
        return Objects.equals(this.mResourcePackName, dDResourceRequest.mResourcePackName) && Objects.equals(this.mVer, dDResourceRequest.mVer);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "983f57a13c5588829ce1e45502e78375", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "983f57a13c5588829ce1e45502e78375")).intValue() : Objects.hash(this.mResourcePackName, this.mVer);
    }
}
