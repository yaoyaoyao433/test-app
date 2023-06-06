package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.util.gson.annotation.ArrayCheck;
import com.meituan.android.neohybrid.util.gson.annotation.FailedType;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@JsonBean
@JsonCheck(failedType = FailedType.FIELD_NULL)
/* loaded from: classes2.dex */
public class EnableOptions implements Serializable {
    public static final String CHECK_OFFLINE_URLS_EMPTY_KEY = "hybrid_cashier_empty";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3071548808493758657L;
    @SerializedName("check_offline_package")
    private boolean checkOfflinePackageEnable;
    @SerializedName("check_offline_urls")
    private Map<String, List<String>> checkOfflineUrls;
    @SerializedName("enable_chrome_version")
    private List<List<String>> enableChromeVersion;
    @SerializedName("network_types")
    @ArrayCheck(strCheck = {"", "2G", "3G", "4G", "5G", "WIFI", "Mobile"})
    private Set<String> netWorkTypes;
    @SerializedName("web_unavailable_downgrade")
    private boolean webUnavailableDowngrade;
    @SerializedName("web_unavailable_timeout")
    private long webUnavailableTimeout;

    public EnableOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42a7de859fbfaa40acc4511fe5bca449", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42a7de859fbfaa40acc4511fe5bca449");
        } else {
            this.checkOfflinePackageEnable = true;
        }
    }

    public Map<String, List<String>> getCheckOfflineUrls() {
        return this.checkOfflineUrls;
    }

    public boolean isCheckOfflinePackageEnable() {
        return this.checkOfflinePackageEnable;
    }

    public Set<String> getNetWorkTypes() {
        return this.netWorkTypes;
    }

    public boolean isWebUnavailableDowngrade() {
        return this.webUnavailableDowngrade;
    }

    public long getWebUnavailableTimeout() {
        return this.webUnavailableTimeout;
    }

    public List<List<String>> getEnableChromeVersion() {
        return this.enableChromeVersion;
    }
}
