package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.config.NSRConfig;
import com.meituan.android.neohybrid.util.gson.annotation.FailedType;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.neohybrid.util.gson.annotation.Range;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Set;
/* compiled from: ProGuard */
@JsonBean
@JsonCheck(failedType = FailedType.NULL)
/* loaded from: classes2.dex */
public class NSROptions implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enable_all_pages")
    private boolean nsrAllPagesEnabled;
    @SerializedName("nsr_business_limit_time")
    @Range(max = Integer.MAX_VALUE, min = 1000)
    private long nsrBusinessLimitTime;
    @SerializedName(NSRConfig.NEO_NSR_DELAY)
    @Range(max = Integer.MAX_VALUE)
    private long nsrDelay;
    @SerializedName("enable_nsr_downgrade")
    private boolean nsrDowngradeEnabled;
    @SerializedName("enable_nsr")
    private boolean nsrEnabled;
    @SerializedName("enable_nsr_keep")
    private boolean nsrKeepEnabled;
    @SerializedName("nsr_load_path")
    private String nsrLoadPath;
    @SerializedName("nsr_pages")
    private Set<String> nsrPages;
    @SerializedName("whitelist")
    private Set<String> nsrWhiteList;

    public boolean isNsrEnabled() {
        return this.nsrEnabled;
    }

    public long getNsrDelay() {
        return this.nsrDelay;
    }

    public long getNsrBusinessLimitTime() {
        return this.nsrBusinessLimitTime;
    }

    public Set<String> getNsrWhiteList() {
        return this.nsrWhiteList;
    }

    public Set<String> getNsrPages() {
        return this.nsrPages;
    }

    public boolean isNsrKeepEnabled() {
        return this.nsrKeepEnabled;
    }

    public boolean isNsrAllPagesEnabled() {
        return this.nsrAllPagesEnabled;
    }

    public boolean isNsrDowngradeEnabled() {
        return this.nsrDowngradeEnabled;
    }

    public String getNsrLoadPath() {
        return this.nsrLoadPath;
    }

    public boolean isInNSRPages(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "528cdc17cee8516bfc624b129842933d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "528cdc17cee8516bfc624b129842933d")).booleanValue() : !i.a(this.nsrPages) && this.nsrPages.contains(str);
    }
}
