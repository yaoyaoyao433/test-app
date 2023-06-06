package com.meituan.android.neohybrid.core.horn.options;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NeoOfflineOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("offline_scopes")
    private Set<String> offlineScopes;

    public Set<String> getOfflineScopes() {
        return this.offlineScopes;
    }

    public boolean isEnableOffline() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f3926882787cb831b9a40203dccb546", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f3926882787cb831b9a40203dccb546")).booleanValue() : (this.offlineScopes == null || this.offlineScopes.isEmpty()) ? false : true;
    }
}
