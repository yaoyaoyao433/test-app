package com.meituan.android.hybridcashier.config.bean;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.android.hybridcashier.config.a;
import com.meituan.android.hybridcashier.config.horn.c;
import com.meituan.android.neohybrid.neo.offline.b;
import com.meituan.android.neohybrid.util.gson.annotation.ArrayCheck;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.neohybrid.util.gson.annotation.Regex;
import com.meituan.android.neohybrid.util.gson.annotation.Required;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@JsonBean
@JsonCheck
/* loaded from: classes2.dex */
public class HybridCashierConfig implements Serializable {
    private static final String ENABLE_HYBRID_ABSOLUTELY_WILDCARD = "*";
    private static final String HYBRID_CASHIER_PATH_REGEX = "^(/web-cashier)/v([0-9]+.){2,3}[0-9]+/((index)|(index_ssr_prerender_base)).html(\\?[^?]*)?";
    private static final int OFFLINE_STATUS_CACHE = -1;
    private static final int OFFLINE_STATUS_FALSE = 2;
    private static final int OFFLINE_STATUS_TRUE = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1016612742772057586L;
    @SerializedName("enable_options")
    private EnableOptions enableOptions;
    @SerializedName("enable_hybrid_pages")
    @ArrayCheck
    @Required
    private Set<String> enabledHybridPages;
    @SerializedName("grey_flag")
    private String greyFlag;
    @SerializedName("enable_hybrid_cashier")
    @Required
    private Boolean hybridCashierEnable;
    @SerializedName("hybrid_cashier_path")
    @Required
    @Regex(regex = HYBRID_CASHIER_PATH_REGEX)
    private String hybridCashierPath;
    @SerializedName("hybrid_user_flag")
    private String hybridUserFlag;
    @SerializedName("neo_configurations")
    @Required
    private NeoConfigurations neoConfigurations;
    private int offlineStatusCache;
    @SerializedName("hybrid_cashier_test")
    private HybridCashierTestConfig testConfig;

    public HybridCashierConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8795528c356166812b42ea2c335084fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8795528c356166812b42ea2c335084fa");
        } else {
            this.offlineStatusCache = -1;
        }
    }

    public boolean isHybridCashierEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18818e2c25ca7b09d9beefe1ea1ebe4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18818e2c25ca7b09d9beefe1ea1ebe4e")).booleanValue();
        }
        if (this.hybridCashierEnable == null) {
            return false;
        }
        return this.hybridCashierEnable.booleanValue();
    }

    public Set<String> getEnabledHybridPages() {
        return this.enabledHybridPages;
    }

    public EnableOptions getEnableOptions() {
        return this.enableOptions;
    }

    public Map<String, List<String>> getCheckOfflineUrls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50582d8821e73d7a2d8120b7a7f30557", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50582d8821e73d7a2d8120b7a7f30557");
        }
        if (this.enableOptions != null) {
            return this.enableOptions.getCheckOfflineUrls();
        }
        return null;
    }

    public String getHybridCashierPath() {
        return this.hybridCashierPath;
    }

    public NeoConfigurations getNeoConfigurations() {
        return this.neoConfigurations;
    }

    public String getHybridUserFlag() {
        return this.hybridUserFlag;
    }

    public String getGreyFlag() {
        return this.greyFlag;
    }

    public HybridCashierTestConfig getTestConfig() {
        return this.testConfig;
    }

    public String getCashierUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a6121a5d8eab3f2aa5c8ae2db264f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a6121a5d8eab3f2aa5c8ae2db264f6");
        }
        if (TextUtils.isEmpty(this.hybridCashierPath)) {
            return "";
        }
        return a.k() + this.hybridCashierPath;
    }

    public String getCashierUrlWithConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72ae6fc408d0b86e262cc8c904efd1ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72ae6fc408d0b86e262cc8c904efd1ab");
        }
        Uri.Builder buildUpon = Uri.parse(getCashierUrl()).buildUpon();
        HybridCashierSetting.appendQuery(buildUpon);
        return buildUpon.toString();
    }

    public String getCashierUrlForNSR() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9253052cb238d9affd6402123993d6a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9253052cb238d9affd6402123993d6a5");
        }
        String nSRLoadPath = getNSRLoadPath();
        if (TextUtils.isEmpty(nSRLoadPath)) {
            return getCashierUrlWithConfig();
        }
        Uri.Builder buildUpon = Uri.parse(a.k() + nSRLoadPath).buildUpon();
        HybridCashierSetting.appendQuery(buildUpon);
        return buildUpon.toString();
    }

    public boolean isPageFeatureAvailable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ae2ae0dafca5237f104ae60ded205ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ae2ae0dafca5237f104ae60ded205ec")).booleanValue();
        }
        Set<String> enabledHybridPages = getEnabledHybridPages();
        if (i.a(enabledHybridPages)) {
            return false;
        }
        if (c.a(this) && enabledHybridPages.size() == 1 && enabledHybridPages.contains("*")) {
            return true;
        }
        return enabledHybridPages.contains(str);
    }

    public int getOfflineStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "797fe6146bd26f91726e84107c7d602d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "797fe6146bd26f91726e84107c7d602d")).intValue() : (!z || this.offlineStatusCache == -1) ? getOfflineStatus() : this.offlineStatusCache;
    }

    private int getOfflineStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31022344c8611c925452d68b0ad8cc7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31022344c8611c925452d68b0ad8cc7f")).intValue();
        }
        this.offlineStatusCache = b.a(com.meituan.android.hybridcashier.a.a, getCashierUrl()) ? 1 : 2;
        return this.offlineStatusCache;
    }

    public boolean isOfflinePckCheckExtraAvailable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0224b274f8032bfc30a2962a6590421", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0224b274f8032bfc30a2962a6590421")).booleanValue();
        }
        Map<String, List<String>> checkOfflineUrls = getCheckOfflineUrls();
        if (i.a(checkOfflineUrls)) {
            return true;
        }
        for (Map.Entry<String, List<String>> entry : checkOfflineUrls.entrySet()) {
            if (!isOfflineUrlsAvailable(entry.getKey(), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    private boolean isOfflineUrlsAvailable(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "174e963dbdea05019fd131b916c140d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "174e963dbdea05019fd131b916c140d1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || i.a((Collection) list)) {
            return true;
        }
        if (EnableOptions.CHECK_OFFLINE_URLS_EMPTY_KEY.equals(str)) {
            str = "";
        }
        for (String str2 : list) {
            if (!b.a(str, str2)) {
                return false;
            }
        }
        return true;
    }

    public boolean isCheckOfflinePackageEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce4fa4444b0dbe54b6d60540db16d207", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce4fa4444b0dbe54b6d60540db16d207")).booleanValue() : this.enableOptions != null && this.enableOptions.isCheckOfflinePackageEnable();
    }

    public boolean isOfflinePkgCheckAvailable(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e26275ee1cbeb8d15c6eabff566d80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e26275ee1cbeb8d15c6eabff566d80")).booleanValue();
        }
        if (this.enableOptions == null || !this.enableOptions.isCheckOfflinePackageEnable()) {
            return true;
        }
        z2 = (b.a(com.meituan.android.hybridcashier.a.a, getCashierUrl()) && isOfflinePckCheckExtraAvailable()) ? false : false;
        if (!z2 && z) {
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_downgrade_reason_sc", com.meituan.android.neohybrid.neo.report.a.a().a("downgrade_type", "offline").b);
            com.meituan.android.neohybrid.neo.report.c.a("hybrid_downgrade_reason", com.meituan.android.neohybrid.neo.report.a.a().a("downgrade_type", "offline").b);
        }
        return z2;
    }

    public boolean isEnablePresetBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab21c489022a46eacffd98104cf0d096", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab21c489022a46eacffd98104cf0d096")).booleanValue() : getNeoConfigurations().isEnablePresetBundle();
    }

    public boolean isNetWorkAvailable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d912933652b0f6818134405b99c8a830", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d912933652b0f6818134405b99c8a830")).booleanValue();
        }
        if (this.enableOptions == null || this.enableOptions.getNetWorkTypes() == null || this.enableOptions.getNetWorkTypes().size() == 0) {
            return true;
        }
        boolean contains = this.enableOptions.getNetWorkTypes().contains(com.meituan.android.paybase.utils.b.a());
        if (!contains && z) {
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_downgrade_reason_sc", com.meituan.android.neohybrid.neo.report.a.a().a("downgrade_type", "network").b);
            com.meituan.android.neohybrid.neo.report.c.a("hybrid_downgrade_reason", com.meituan.android.neohybrid.neo.report.a.a().a("downgrade_type", "network").b);
        }
        return contains;
    }

    public boolean isNSREnabled() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6b9db4169d04fd3f69c581b776a3e9a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6b9db4169d04fd3f69c581b776a3e9a")).booleanValue() : isHybridCashierEnable() && this.neoConfigurations != null && (nsrOptions = this.neoConfigurations.getNsrOptions()) != null && nsrOptions.isNsrEnabled();
    }

    public boolean isNSREnabled(String str) {
        NSROptions nsrOptions;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ef9da94408988836406143dfbfc9891", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ef9da94408988836406143dfbfc9891")).booleanValue() : isHybridCashierEnable() && this.neoConfigurations != null && (nsrOptions = this.neoConfigurations.getNsrOptions()) != null && nsrOptions.isNsrEnabled() && nsrOptions.isInNSRPages(str);
    }

    public boolean isNSRKeepEnabled() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d443bcda05ac6161442bfc636ee67ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d443bcda05ac6161442bfc636ee67ed")).booleanValue() : isHybridCashierEnable() && this.neoConfigurations != null && (nsrOptions = this.neoConfigurations.getNsrOptions()) != null && nsrOptions.isNsrEnabled() && nsrOptions.isNsrKeepEnabled();
    }

    public boolean isNSRAllPagesEnabled() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f25c62d18cfdc440d7e6310f7169e5ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f25c62d18cfdc440d7e6310f7169e5ef")).booleanValue() : isHybridCashierEnable() && this.neoConfigurations != null && (nsrOptions = this.neoConfigurations.getNsrOptions()) != null && nsrOptions.isNsrEnabled() && nsrOptions.isNsrAllPagesEnabled();
    }

    public boolean isNsrCheckAvailable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca7ad6530f9ca53ef307ac817e22e564", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca7ad6530f9ca53ef307ac817e22e564")).booleanValue();
        }
        if (isNSREnabled() && this.neoConfigurations != null && this.neoConfigurations.getNsrOptions() != null && this.neoConfigurations.getNsrOptions().isNsrDowngradeEnabled()) {
            return com.meituan.android.neohybrid.neo.nsr.b.b(getCashierUrlForNSR());
        }
        return true;
    }

    public long getNSRDelay() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c7a031eff5fa344c9761398a0f3f528", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c7a031eff5fa344c9761398a0f3f528")).longValue();
        }
        if (!isHybridCashierEnable() || this.neoConfigurations == null || (nsrOptions = this.neoConfigurations.getNsrOptions()) == null) {
            return 0L;
        }
        return nsrOptions.getNsrDelay();
    }

    public long getNSRBusinessLimitTime() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a7363823672e4be578be02b66560ca7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a7363823672e4be578be02b66560ca7")).longValue();
        }
        if (!isHybridCashierEnable() || this.neoConfigurations == null || (nsrOptions = this.neoConfigurations.getNsrOptions()) == null) {
            return 0L;
        }
        return nsrOptions.getNsrBusinessLimitTime();
    }

    public Set<String> getNSRPages() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43a5102909dc352c26b599165d3bb266", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43a5102909dc352c26b599165d3bb266");
        }
        if (!isHybridCashierEnable() || this.neoConfigurations == null || (nsrOptions = this.neoConfigurations.getNsrOptions()) == null) {
            return null;
        }
        return nsrOptions.getNsrPages();
    }

    public String getNSRLoadPath() {
        NSROptions nsrOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20f9656af63755b896a8674e1c9186fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20f9656af63755b896a8674e1c9186fb");
        }
        if (!isHybridCashierEnable() || this.neoConfigurations == null || (nsrOptions = this.neoConfigurations.getNsrOptions()) == null) {
            return null;
        }
        return nsrOptions.getNsrLoadPath();
    }

    public boolean isEnableCheckUpsePayStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c82cdceed507b33d5d12826634a501b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c82cdceed507b33d5d12826634a501b4")).booleanValue();
        }
        if (this.neoConfigurations == null) {
            return false;
        }
        return this.neoConfigurations.isEnableCheckUpsePayStatus();
    }

    public boolean isPreloadEnabled() {
        PreLoadOptions preLoadOptions;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0901237a94e3924e1fd837461576a239", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0901237a94e3924e1fd837461576a239")).booleanValue() : isHybridCashierEnable() && this.neoConfigurations != null && (preLoadOptions = this.neoConfigurations.getPreLoadOptions()) != null && preLoadOptions.isPreloadEnabled();
    }

    public String getPreloadUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1562bdacc49b47574be9304efc738a84", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1562bdacc49b47574be9304efc738a84");
        }
        String preloadPath = (this.neoConfigurations == null || this.neoConfigurations.getPreLoadOptions() == null) ? null : this.neoConfigurations.getPreLoadOptions().getPreloadPath();
        if (TextUtils.isEmpty(preloadPath)) {
            return "";
        }
        return a.k() + preloadPath;
    }

    public long getPreloadDelay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f12ab9788632a748e3e9e384c3fb12d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f12ab9788632a748e3e9e384c3fb12d7")).longValue();
        }
        if (this.neoConfigurations == null || this.neoConfigurations.getPreLoadOptions() == null) {
            return 0L;
        }
        return this.neoConfigurations.getPreLoadOptions().getPreloadDelay();
    }

    public boolean isActivityMerged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22676c1fdc8234c8d98f94bb240121a6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22676c1fdc8234c8d98f94bb240121a6")).booleanValue() : getTestConfig() != null && getTestConfig().isActivityMerged();
    }
}
