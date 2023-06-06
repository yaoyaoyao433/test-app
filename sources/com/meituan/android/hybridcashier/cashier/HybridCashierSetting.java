package com.meituan.android.hybridcashier.cashier;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.util.l;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class HybridCashierSetting implements Serializable {
    private static final String REGEX_BETA_CASHIER_VERSION = "([0-9]+.){2,3}[0-9]+";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1673387435893969297L;
    private String breatheDeathOptions;
    private long breatheDelayMillis;
    private long breatheIntervalTimeMillis;
    private long breatheTimeoutMillis;
    private int breatheUnresponsiveTimesAsBroken;
    private String cif;
    private boolean enableCheckDomCount;
    private boolean enableCheckOfflineAvailable;
    private boolean enableCheckUpsePayStatus;
    private List<List<String>> enableChromeVersion;
    private boolean enableNeoBreathe;
    private boolean enableNeoBridge;
    private boolean enableNeoPrerenderBridge;
    private boolean enableNeoRequestBridge;
    private boolean enablePixelColor;
    private boolean enablePresetBundle;
    private boolean enableUseOfflineCacheUrl;
    private String extParam;
    private String extraData;
    private String extraStatics;
    private String greyFlag;
    private String guidePlanInfos;
    private String hybridCashierPath;
    private String hybridCashierVersion;
    private String hybridUserFlag;
    private boolean isCheckOfflinePackageEnable;
    private boolean isNSRAllPagesEnabled;
    private boolean isNSREnabled;
    private boolean isNSRKeepEnabled;
    private boolean isOfflinePkgCheckAvailable;
    private boolean isPreloadEnabled;
    private boolean isPreloadUsedEnabled;
    private boolean isSSREnabled;
    private String lastResumedPage;
    private boolean loadingEnabled;
    private String merchantNo;
    private long nsrBusinessLimitTime;
    private long nsrDelay;
    private String nsrLoadPath;
    private int offlineStatus;
    private String payToken;
    private String preloadPath;
    private String ssrRequestUrl;
    private String ssrShowOnVisible;
    private String tradeNo;
    private boolean webUnavailableDowngrade;
    private long webUnavailableTimeout;

    public HybridCashierSetting initFromIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44e327f0c697b1b854fa685278f3b546", RobustBitConfig.DEFAULT_VALUE) ? (HybridCashierSetting) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44e327f0c697b1b854fa685278f3b546") : intent == null ? this : initFromUri(intent.getData());
    }

    public HybridCashierSetting initFromUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbb710be40d97421767fa365d40213d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierSetting) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbb710be40d97421767fa365d40213d3");
        }
        if (uri == null) {
            return this;
        }
        HashMap hashMap = new HashMap();
        l.a(uri, hashMap);
        return initBusiness(hashMap);
    }

    public HybridCashierSetting initBusiness(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b865ecc8b0de16768b6af8b89514d31", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierSetting) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b865ecc8b0de16768b6af8b89514d31");
        }
        if (i.a(map)) {
            return this;
        }
        this.tradeNo = map.get("trade_number");
        this.payToken = map.get("pay_token");
        this.merchantNo = map.get("merchant_no");
        this.lastResumedPage = map.get("last_resumed_page");
        this.extraData = map.get("extra_data");
        this.extraStatics = map.get("extra_statics");
        this.extParam = map.get("ext_param");
        this.cif = map.get("cif");
        try {
            if (!TextUtils.isEmpty(this.extraData)) {
                this.guidePlanInfos = new JSONObject(this.extraData).optString("guide_plan_infos");
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public HashMap<String, Object> genDispatcherParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e40766cf08da484de078f25cc2c90644", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e40766cf08da484de078f25cc2c90644") : genDispatcherParams(true);
    }

    public HashMap<String, Object> genDispatcherParams(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "209280ef3fb7b748d60a26dda739c956", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "209280ef3fb7b748d60a26dda739c956");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("tradeno", this.tradeNo);
        hashMap.put("pay_token", this.payToken);
        hashMap.put("nb_version", com.meituan.android.hybridcashier.config.a.a());
        hashMap.put("extra_data", this.extraData);
        hashMap.put("outer_business_data", this.extraData);
        hashMap.put("ext_dim_stat", genExtDimStat());
        hashMap.put("nb_hybrid_version", this.hybridCashierVersion);
        hashMap.put("ext_param", this.extParam);
        hashMap.put("guide_plan_infos", this.guidePlanInfos);
        hashMap.put("cif", this.cif);
        hashMap.put("installed_apps", com.meituan.android.neohybrid.neo.tunnel.a.a().e("device_install_apps"));
        hashMap.put("upsepay_type", com.meituan.android.neohybrid.neo.tunnel.a.a().e("device_upse_pay_type"));
        hashMap.put("rooted", com.meituan.android.neohybrid.neo.tunnel.a.a().e("device_rooted"));
        hashMap.put("nb_fingerprint", com.meituan.android.neohybrid.neo.tunnel.a.a().e("device_fingerprint"));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.hybridcashier.config.a.a;
        hashMap.put("token", PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "28f03f9dd49a867331cb33c8f9303e6d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "28f03f9dd49a867331cb33c8f9303e6d") : com.meituan.android.neohybrid.init.a.c().p());
        hashMap.put("nb_app", com.meituan.android.hybridcashier.config.a.i());
        hashMap.put("nb_appversion", com.meituan.android.hybridcashier.config.a.j());
        hashMap.put("nb_ci", com.meituan.android.hybridcashier.config.a.f());
        hashMap.put("nb_deviceid", com.meituan.android.hybridcashier.config.a.g());
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.hybridcashier.config.a.a;
        hashMap.put("nb_uuid", PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "3f157b5980735fb20dc67ca307bbe040", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "3f157b5980735fb20dc67ca307bbe040") : com.meituan.android.neohybrid.init.a.c().j());
        hashMap.put("nb_location", com.meituan.android.hybridcashier.config.a.e());
        hashMap.put("nb_channel", com.meituan.android.hybridcashier.config.a.c());
        hashMap.put("nb_osversion", com.meituan.android.hybridcashier.config.a.d());
        hashMap.put("nb_device_model", Build.MODEL);
        hashMap.put("nb_platform", "android");
        if (z && !((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).isEnableRequestWithoutNBContainer()) {
            hashMap.put("nb_container", "hybrid");
        }
        hashMap.put("app_display_type", com.meituan.android.neohybrid.neo.tunnel.a.a().e("app_display_type"));
        return hashMap;
    }

    public String genCashierUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad19c1ece5c91a756f89e06c8331373", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad19c1ece5c91a756f89e06c8331373");
        }
        com.meituan.android.neohybrid.debug.a debugger = Neo.debugger();
        return debugger.a("debug_cashier_url", com.meituan.android.hybridcashier.config.a.k() + getHybridCashierPath());
    }

    public Uri.Builder genCashierUrlWithConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae131241372dd0d49f4316bf45959a3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae131241372dd0d49f4316bf45959a3c");
        }
        Uri.Builder buildUpon = Uri.parse(genCashierUrl()).buildUpon();
        appendQuery(buildUpon);
        return buildUpon;
    }

    public Uri.Builder genCashierUrlWithBusiness() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "566e79ab1b1e9202b255b4ddd083f18c", RobustBitConfig.DEFAULT_VALUE) ? (Uri.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "566e79ab1b1e9202b255b4ddd083f18c") : genCashierUrlWithConfig();
    }

    public Uri.Builder genCashierUrlForNSR() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae6572c69df48fc65d9268d614aac7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae6572c69df48fc65d9268d614aac7f");
        }
        if (TextUtils.isEmpty(this.nsrLoadPath)) {
            return genCashierUrlWithConfig();
        }
        Uri.Builder buildUpon = Uri.parse(com.meituan.android.hybridcashier.config.a.k() + getNsrLoadPath()).buildUpon();
        appendQuery(buildUpon);
        return buildUpon;
    }

    public String genPreloadUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da49a31ad4896748b77ecf0b5e6b7571", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da49a31ad4896748b77ecf0b5e6b7571");
        }
        if (TextUtils.isEmpty(this.preloadPath)) {
            return "";
        }
        return com.meituan.android.hybridcashier.config.a.k() + this.preloadPath;
    }

    public static void appendQuery(Uri.Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26ed6f62bc3fb304e659b8a4ec667cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26ed6f62bc3fb304e659b8a4ec667cd8");
        } else if (builder == null) {
        } else {
            Map<String, Object> c = com.meituan.android.neohybrid.neo.tunnel.a.a().c();
            appendQueryFromTunnel(builder, "app_pay_sdk_version", c);
            appendQueryFromTunnel(builder, AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, c);
            appendQueryFromTunnel(builder, "device_platform", c);
            appendQueryFromTunnel(builder, "is_debug", c);
        }
    }

    private String genExtDimStat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83152537d1f751f4b61d134d00fcfb93", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83152537d1f751f4b61d134d00fcfb93");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("grey_flag", this.greyFlag);
            jSONObject.put("last_resumed_page", this.lastResumedPage);
            jSONObject.put("is_offline_package_exist", com.meituan.android.neohybrid.neo.offline.b.a(com.meituan.android.hybridcashier.a.a, genCashierUrl()));
            jSONObject.put("network_env", com.meituan.android.paybase.utils.b.a());
        } catch (Exception e) {
            com.meituan.android.neohybrid.neo.report.b.a(e, "HybridCashierFragment_getExtDimStat", (Map<String, Object>) null);
        }
        try {
            jSONObject.put("outer_business_statics", this.extraStatics);
        } catch (Exception e2) {
            com.meituan.android.neohybrid.neo.report.b.a(e2, "HybridCashierFragment_getExtDimStat_extraStatics", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    private static void appendQueryWithoutEmptyValue(Uri.Builder builder, String str, String str2) {
        Object[] objArr = {builder, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0bf6ba84df164b6c77e9d13821a9152d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0bf6ba84df164b6c77e9d13821a9152d");
        } else if (builder == null || str2 == null || StringUtil.NULL.equalsIgnoreCase(str2)) {
        } else {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void appendQueryFromTunnel(Uri.Builder builder, String str, Map<String, Object> map) {
        Object[] objArr = {builder, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93143480e88956446b467feca9d938b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93143480e88956446b467feca9d938b4");
        } else {
            appendQueryWithoutEmptyValue(builder, str, String.valueOf(map.get(str)));
        }
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public String getMerchantNo() {
        return this.merchantNo;
    }

    public String getGreyFlag() {
        return this.greyFlag;
    }

    public String getLastResumedPage() {
        return this.lastResumedPage;
    }

    public String getExtraData() {
        return this.extraData;
    }

    public String getExtraStatics() {
        return this.extraStatics;
    }

    public String getExtParam() {
        return this.extParam;
    }

    public String getCif() {
        return this.cif;
    }

    public String getHybridCashierPath() {
        return this.hybridCashierPath;
    }

    public String getHybridCashierVersion() {
        return this.hybridCashierVersion;
    }

    public String getHybridUserFlag() {
        return this.hybridUserFlag;
    }

    public boolean isLoadingEnabled() {
        return this.loadingEnabled;
    }

    public int getOfflineStatus() {
        return this.offlineStatus;
    }

    public boolean isPreloadEnabled() {
        return this.isPreloadEnabled;
    }

    public boolean isPreloadUsedEnabled() {
        return this.isPreloadUsedEnabled;
    }

    public String getPreloadPath() {
        return this.preloadPath;
    }

    public boolean isSSREnabled() {
        return this.isSSREnabled;
    }

    public void setSSREnabled(boolean z) {
        this.isSSREnabled = z;
    }

    public String getSsrRequestUrl() {
        return this.ssrRequestUrl;
    }

    public void setSSRRequestUrl(String str) {
        this.ssrRequestUrl = str;
    }

    public String getSSRShowOnVisible() {
        return this.ssrShowOnVisible;
    }

    public void setSSRShowOnVisible(String str) {
        this.ssrShowOnVisible = str;
    }

    public String getNsrLoadPath() {
        return this.nsrLoadPath;
    }

    public void setNsrLoadPath(String str) {
        this.nsrLoadPath = str;
    }

    public static a builder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2327f03329d1a27040e8a52bbf4b7fc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2327f03329d1a27040e8a52bbf4b7fc") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private HybridCashierSetting b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882e9bbba110f1b6374b02c57c98151f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882e9bbba110f1b6374b02c57c98151f");
            } else {
                this.b = new HybridCashierSetting();
            }
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ba1ed750c26d57d57d237071de6888", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ba1ed750c26d57d57d237071de6888");
            }
            this.b.hybridCashierPath = str;
            return this;
        }

        public final a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2068f3d60d425b22177f956cfe5d886a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2068f3d60d425b22177f956cfe5d886a");
            }
            this.b.greyFlag = str;
            return this;
        }

        public final a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153f844bdcd4d64da024502ffeff4af5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153f844bdcd4d64da024502ffeff4af5");
            }
            this.b.hybridUserFlag = str;
            return this;
        }

        public final a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c183bb732ce83fdf3385de8ed2d932", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c183bb732ce83fdf3385de8ed2d932");
            }
            this.b.loadingEnabled = z;
            return this;
        }

        public final a b(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7e8453cfdcef4ea8ab307f975b1bdc", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7e8453cfdcef4ea8ab307f975b1bdc");
            }
            this.b.isNSREnabled = z;
            return this;
        }

        public final a c(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168192cc17978a27053d168a14791f39", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168192cc17978a27053d168a14791f39");
            }
            this.b.isNSRKeepEnabled = z;
            return this;
        }

        public final a d(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0f7a6792b239a604ea6085da0134e7", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0f7a6792b239a604ea6085da0134e7");
            }
            this.b.isNSRAllPagesEnabled = z;
            return this;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321ffb892857df5ffefbc1155e871bba", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321ffb892857df5ffefbc1155e871bba");
            }
            this.b.nsrDelay = j;
            return this;
        }

        public final a b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4a925efd5778ca15fb8cd85cc02872", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4a925efd5778ca15fb8cd85cc02872");
            }
            this.b.nsrBusinessLimitTime = j;
            return this;
        }

        public final a d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487a833abfa492b48fe3aaf2031a0df7", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487a833abfa492b48fe3aaf2031a0df7");
            }
            this.b.nsrLoadPath = str;
            return this;
        }

        public final a e(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047496ad5c9efe1d27d3c017e4a601df", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047496ad5c9efe1d27d3c017e4a601df");
            }
            this.b.webUnavailableDowngrade = z;
            return this;
        }

        public final a c(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b315501a449843316307cb7079599c0", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b315501a449843316307cb7079599c0");
            }
            this.b.webUnavailableTimeout = j;
            return this;
        }

        public final a a(List<List<String>> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d29107e6475d7d5981f4798b8454c6e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d29107e6475d7d5981f4798b8454c6e");
            }
            this.b.enableChromeVersion = list;
            return this;
        }

        public final a f(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a4816f77c6b18ca03e266fdab64dbc8", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a4816f77c6b18ca03e266fdab64dbc8");
            }
            this.b.isCheckOfflinePackageEnable = z;
            return this;
        }

        public final a g(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2443f157e9fb18270701fc38aa066116", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2443f157e9fb18270701fc38aa066116");
            }
            this.b.isOfflinePkgCheckAvailable = z;
            return this;
        }

        public final a h(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe1b93f0df19ad3438ee33e978fb7a04", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe1b93f0df19ad3438ee33e978fb7a04");
            }
            this.b.enableNeoBridge = z;
            return this;
        }

        public final a i(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030034fedaa6dfd8539c5cbc9ee83e10", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030034fedaa6dfd8539c5cbc9ee83e10");
            }
            this.b.enablePresetBundle = z;
            return this;
        }

        public final a j(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23280a539a4e46dbcc4776c5adcac98b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23280a539a4e46dbcc4776c5adcac98b");
            }
            this.b.enableNeoRequestBridge = z;
            return this;
        }

        public final a k(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a597367a31b1618159753e070350527a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a597367a31b1618159753e070350527a");
            }
            this.b.enableNeoPrerenderBridge = z;
            return this;
        }

        public final a l(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70754740b929c4a5696d6f14882bcdc5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70754740b929c4a5696d6f14882bcdc5");
            }
            this.b.enableCheckUpsePayStatus = z;
            return this;
        }

        public final a m(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b3c952a05d10efd09ca68a6d244601", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b3c952a05d10efd09ca68a6d244601");
            }
            this.b.isSSREnabled = z;
            return this;
        }

        public final a e(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60b4a5b50620303ca78a501e050b1d7", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60b4a5b50620303ca78a501e050b1d7");
            }
            this.b.ssrRequestUrl = str;
            return this;
        }

        public final a f(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe0767f38190b6b1cca91b5956dbdeb", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe0767f38190b6b1cca91b5956dbdeb");
            }
            this.b.ssrShowOnVisible = str;
            return this;
        }

        public final a n(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d4d29d2482ab0dc6549a6a92bb780af", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d4d29d2482ab0dc6549a6a92bb780af");
            }
            this.b.isPreloadEnabled = z;
            return this;
        }

        public final a o(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b46f2852cf2cf8976bc9c57de54522", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b46f2852cf2cf8976bc9c57de54522");
            }
            this.b.isPreloadUsedEnabled = z;
            return this;
        }

        public final a g(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33cff8519b2fa1f50715b9c1b6480a0b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33cff8519b2fa1f50715b9c1b6480a0b");
            }
            this.b.preloadPath = str;
            return this;
        }

        public final HybridCashierSetting a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cbdae4fd6527e122099c406901307e", RobustBitConfig.DEFAULT_VALUE)) {
                return (HybridCashierSetting) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cbdae4fd6527e122099c406901307e");
            }
            this.b.setOfflineStatus();
            this.b.setHybridCashierVersion();
            return this.b;
        }

        public final a p(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cdde5cfc4c5c78c30116b8ba208d0d", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cdde5cfc4c5c78c30116b8ba208d0d");
            }
            this.b.enableNeoBreathe = z;
            return this;
        }

        public final a q(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73b26def8d15f5e2187f4c4137336ea", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73b26def8d15f5e2187f4c4137336ea");
            }
            this.b.enablePixelColor = z;
            return this;
        }

        public final a r(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4534f2bd966c02b7932ea1da651ead99", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4534f2bd966c02b7932ea1da651ead99");
            }
            this.b.enableCheckDomCount = z;
            return this;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685641ed4f27c72c55265c2f5da61e59", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685641ed4f27c72c55265c2f5da61e59");
            }
            this.b.breatheUnresponsiveTimesAsBroken = i;
            return this;
        }

        public final a d(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044955554a9519c228bc4080532ab77c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044955554a9519c228bc4080532ab77c");
            }
            this.b.breatheIntervalTimeMillis = j;
            return this;
        }

        public final a e(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2216d9ca992930a4bea9f8b4f8f4731", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2216d9ca992930a4bea9f8b4f8f4731");
            }
            this.b.breatheDelayMillis = j;
            return this;
        }

        public final a f(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76334fe57629e4d319e688d074510881", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76334fe57629e4d319e688d074510881");
            }
            this.b.breatheTimeoutMillis = j;
            return this;
        }

        public final a h(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4fbb24e8a231170654925fbb564c2b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4fbb24e8a231170654925fbb564c2b");
            }
            this.b.breatheDeathOptions = str;
            return this;
        }
    }

    public boolean isNSREnabled() {
        return this.isNSREnabled;
    }

    public boolean isNSRKeepEnabled() {
        return this.isNSRKeepEnabled;
    }

    public boolean isNSRAllPagesEnabled() {
        return this.isNSRAllPagesEnabled;
    }

    public long getNsrDelay() {
        return this.nsrDelay;
    }

    public long getNsrBusinessLimitTime() {
        return this.nsrBusinessLimitTime;
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

    public boolean isOfflinePkgCheckAvailable() {
        return this.isOfflinePkgCheckAvailable;
    }

    public boolean enableNeoBridge() {
        return this.enableNeoBridge;
    }

    public boolean enablePresetBundle() {
        return this.enablePresetBundle;
    }

    public boolean ennableNeoRequestBridgeBridge() {
        return this.enableNeoRequestBridge;
    }

    public boolean enableNeoPrerenderBridge() {
        return this.enableNeoPrerenderBridge;
    }

    public boolean enableCheckUpsePayStatus() {
        return this.enableCheckUpsePayStatus;
    }

    public boolean isCheckOfflinePackageEnable() {
        return this.isCheckOfflinePackageEnable;
    }

    public boolean isEnableNeoBreathe() {
        return this.enableNeoBreathe;
    }

    public boolean isEnablePixelColor() {
        return this.enablePixelColor;
    }

    public boolean isEnableCheckDomCount() {
        return this.enableCheckDomCount;
    }

    public int getBreatheUnresponsiveTimesAsBroken() {
        return this.breatheUnresponsiveTimesAsBroken;
    }

    public long getBreatheIntervalTimeMillis() {
        return this.breatheIntervalTimeMillis;
    }

    public long getBreatheDelayMillis() {
        return this.breatheDelayMillis;
    }

    public long getBreatheTimeoutMillis() {
        return this.breatheTimeoutMillis;
    }

    public String getBreatheDeathOptions() {
        return this.breatheDeathOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "999dbabacfe5b38fff0d1b2e881e1e0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "999dbabacfe5b38fff0d1b2e881e1e0e");
        } else {
            this.offlineStatus = com.meituan.android.neohybrid.neo.offline.b.a(com.meituan.android.hybridcashier.a.a, genCashierUrl()) ? 1 : 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHybridCashierVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd938caf3d435414cb61582de7cfa9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd938caf3d435414cb61582de7cfa9e");
            return;
        }
        if (TextUtils.isEmpty(getHybridCashierPath())) {
            this.hybridCashierVersion = "unknown";
        }
        try {
            Matcher matcher = Pattern.compile(REGEX_BETA_CASHIER_VERSION).matcher(this.hybridCashierPath);
            this.hybridCashierVersion = matcher.find() ? matcher.group() : "unknown";
        } catch (Exception unused) {
            this.hybridCashierVersion = "unknown";
        }
    }
}
