package com.meituan.android.neohybrid.core.config;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.neohybrid.util.l;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NeoConfig extends BaseConfig {
    public static final Parcelable.Creator<NeoConfig> CREATOR = new Parcelable.Creator<NeoConfig>() { // from class: com.meituan.android.neohybrid.core.config.NeoConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NeoConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "858796111c03d7d4aa5770b88e8ca91e", RobustBitConfig.DEFAULT_VALUE) ? (NeoConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "858796111c03d7d4aa5770b88e8ca91e") : new NeoConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NeoConfig[] newArray(int i) {
            return new NeoConfig[i];
        }
    };
    public static final String NEO_BRIDGE = "neo_bridge";
    public static final String NEO_CONFIG = "neo_config";
    public static final String NEO_INDEX_PARAMS = "neo_index_params";
    public static final String NEO_OFFLINE = "neo_offline";
    public static final String NEO_PRERENDER_BRIDGE = "neo_prerender_bridge";
    public static final String NEO_PRESET_BUNDLE = "neo_preset_bundle";
    private static final String NEO_REPORT_PARAMS = "report_params";
    public static final String NEO_REQUEST_BRIDGE = "neo_request_bridge";
    public static final String NEO_SCENE = "neo_scene";
    public static final String NEO_STORAGE_BRIDGE = "neo_storage_bridge";
    private static final String NEO_TUNNEL_PARAMS = "request_params";
    public static final String NEO_URL = "url";
    public static ChangeQuickRedirect changeQuickRedirect;
    private BreatheConfig breatheConfig;
    private CacheConfig cacheConfig;
    private DowngradeConfig downgradeConfig;
    private KernelConfig kernelConfig;
    private LoadingConfig loadingConfig;
    @Bean(defNumBool = 0, value = NEO_BRIDGE)
    private boolean neoBridge;
    @Bean(defNumBool = 0, value = NEO_INDEX_PARAMS)
    private boolean neoIndexParams;
    @Bean(defNumBool = 0, value = NEO_OFFLINE)
    private boolean neoOffline;
    @Bean(defNumBool = 0, value = NEO_PRERENDER_BRIDGE)
    private boolean neoPrerenderBridge;
    @Bean(defNumBool = 0, value = NEO_PRESET_BUNDLE)
    private boolean neoPresetBundle;
    @Bean(NEO_REPORT_PARAMS)
    private Map<String, Object> neoReportParams;
    @Bean(defNumBool = 0, value = NEO_REQUEST_BRIDGE)
    private boolean neoRequestBridge;
    @Bean(defNumBool = 0, value = NEO_STORAGE_BRIDGE)
    private boolean neoStorageBridge;
    @Bean(NEO_TUNNEL_PARAMS)
    private Map<String, Object> neoTunnelParams;
    private NSFConfig nsfConfig;
    private NeoConfig replacedConfig;
    @Bean(NEO_SCENE)
    private String scene;
    private SSRConfig ssrConfig;
    private UIConfig uiConfig;
    @Bean("url")
    private String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NeoConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ee51b7be7100a5732992f8bf95e32ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ee51b7be7100a5732992f8bf95e32ea");
            return;
        }
        this.uiConfig = new UIConfig();
        this.loadingConfig = new LoadingConfig();
        this.cacheConfig = new CacheConfig();
        this.nsfConfig = new NSFConfig();
        this.ssrConfig = new SSRConfig();
        this.downgradeConfig = new DowngradeConfig();
        this.breatheConfig = new BreatheConfig();
        this.kernelConfig = new KernelConfig();
    }

    public NeoConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b97fb9c676bd155ad9d868444347045d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b97fb9c676bd155ad9d868444347045d");
            return;
        }
        this.uiConfig = new UIConfig();
        this.loadingConfig = new LoadingConfig();
        this.cacheConfig = new CacheConfig();
        this.nsfConfig = new NSFConfig();
        this.ssrConfig = new SSRConfig();
        this.downgradeConfig = new DowngradeConfig();
        this.breatheConfig = new BreatheConfig();
        this.kernelConfig = new KernelConfig();
        this.scene = str;
    }

    public NeoConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f357264817a1124a11f5a35cf1f146", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f357264817a1124a11f5a35cf1f146");
            return;
        }
        this.uiConfig = new UIConfig();
        this.loadingConfig = new LoadingConfig();
        this.cacheConfig = new CacheConfig();
        this.nsfConfig = new NSFConfig();
        this.ssrConfig = new SSRConfig();
        this.downgradeConfig = new DowngradeConfig();
        this.breatheConfig = new BreatheConfig();
        this.kernelConfig = new KernelConfig();
        this.uiConfig = (UIConfig) parcel.readParcelable(UIConfig.class.getClassLoader());
        this.loadingConfig = (LoadingConfig) parcel.readParcelable(LoadingConfig.class.getClassLoader());
        this.cacheConfig = (CacheConfig) parcel.readParcelable(CacheConfig.class.getClassLoader());
        this.nsfConfig = (NSFConfig) parcel.readParcelable(NSFConfig.class.getClassLoader());
        this.ssrConfig = (SSRConfig) parcel.readParcelable(SSRConfig.class.getClassLoader());
        this.downgradeConfig = (DowngradeConfig) parcel.readParcelable(DowngradeConfig.class.getClassLoader());
        this.breatheConfig = (BreatheConfig) parcel.readParcelable(BreatheConfig.class.getClassLoader());
        this.kernelConfig = (KernelConfig) parcel.readParcelable(KernelConfig.class.getClassLoader());
        this.url = parcel.readString();
        this.scene = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1c90e34f78babe72787f36f6a3e79e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1c90e34f78babe72787f36f6a3e79e6");
            return;
        }
        parcel.writeParcelable(this.uiConfig, i);
        parcel.writeParcelable(this.loadingConfig, i);
        parcel.writeParcelable(this.cacheConfig, i);
        parcel.writeParcelable(this.nsfConfig, i);
        parcel.writeParcelable(this.ssrConfig, i);
        parcel.writeParcelable(this.downgradeConfig, i);
        parcel.writeParcelable(this.breatheConfig, i);
        parcel.writeParcelable(this.kernelConfig, i);
        parcel.writeString(this.url);
        parcel.writeString(this.scene);
    }

    public UIConfig uiConfig() {
        return this.uiConfig;
    }

    public LoadingConfig loadingConfig() {
        return this.loadingConfig;
    }

    public CacheConfig cacheConfig() {
        return this.cacheConfig;
    }

    public NSFConfig nsfConfig() {
        return this.nsfConfig;
    }

    public SSRConfig ssrConfig() {
        return this.ssrConfig;
    }

    public DowngradeConfig downgradeConfig() {
        return this.downgradeConfig;
    }

    public BreatheConfig breathConfig() {
        return this.breatheConfig;
    }

    public KernelConfig kernelConfig() {
        return this.kernelConfig;
    }

    public String getScene() {
        return this.scene;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setNeoScene(String str) {
        this.scene = str;
    }

    public boolean isNeoBridge() {
        return this.neoBridge;
    }

    public void setNeoBridge(boolean z) {
        this.neoBridge = z;
    }

    public void setNeoPresetBundle(boolean z) {
        this.neoPresetBundle = z;
    }

    public boolean isNeoRequestBridge() {
        return this.neoRequestBridge;
    }

    public void setNeoRequestBridge(boolean z) {
        this.neoRequestBridge = z;
    }

    public boolean isNeoStorageBridge() {
        return this.neoStorageBridge;
    }

    public void setNeoStorageBridge(boolean z) {
        this.neoStorageBridge = z;
    }

    public boolean isNeoPrerenderBridge() {
        return this.neoPrerenderBridge;
    }

    public void setNeoPrerenderBridge(boolean z) {
        this.neoPrerenderBridge = z;
    }

    public boolean isNeoOffline() {
        return this.neoOffline;
    }

    public boolean isNeoPresetBundle() {
        return this.neoPresetBundle;
    }

    public void setNeoOffline(boolean z) {
        this.neoOffline = z;
    }

    public boolean isNeoIndexParams() {
        return this.neoIndexParams;
    }

    public void setNeoIndexParams(boolean z) {
        this.neoIndexParams = z;
    }

    public Map<String, Object> getNeoTunnelParams() {
        return this.neoTunnelParams;
    }

    public void setNeoTunnelParams(Map<String, Object> map) {
        this.neoTunnelParams = map;
    }

    public Map<String, Object> getNeoReportParams() {
        return this.neoReportParams;
    }

    public void setNeoReportParams(Map<String, Object> map) {
        this.neoReportParams = map;
    }

    public Bundle newNeoArguments(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f75b456d665a63b9ffb910e29c06b00", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f75b456d665a63b9ffb910e29c06b00");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable(NEO_CONFIG, this);
        return bundle;
    }

    public Bundle newKNBArguments(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e22cfa24517d092faf6eae22ac79cdb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e22cfa24517d092faf6eae22ac79cdb");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        String progressColor = uiConfig().getProgressColor();
        if (!TextUtils.isEmpty(progressColor)) {
            bundle.putString("progresscolor", progressColor);
        }
        return bundle;
    }

    public NeoConfig getReplacedConfig() {
        return this.replacedConfig;
    }

    public void setReplacedConfig(NeoConfig neoConfig) {
        this.replacedConfig = neoConfig;
    }

    public boolean isLegal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bec3da7375d33838d25cc2fd24aa9983", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bec3da7375d33838d25cc2fd24aa9983")).booleanValue() : !TextUtils.isEmpty(getScene());
    }

    public static NeoConfig initNeoConfigFromBundle(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4f09720ffc4c6b81117c45e1aa47ead", RobustBitConfig.DEFAULT_VALUE)) {
            return (NeoConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4f09720ffc4c6b81117c45e1aa47ead");
        }
        if (bundle == null) {
            return null;
        }
        Parcelable parcelable = bundle.getParcelable(NEO_CONFIG);
        if (parcelable instanceof NeoConfig) {
            return (NeoConfig) parcelable;
        }
        NeoConfig neoConfig = new NeoConfig();
        neoConfig.parse(bundle);
        if (neoConfig.isLegal()) {
            return neoConfig;
        }
        return null;
    }

    public static NeoConfig initNeoConfigFromIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85bef80ed7104f81c8a8ce9315479828", RobustBitConfig.DEFAULT_VALUE)) {
            return (NeoConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85bef80ed7104f81c8a8ce9315479828");
        }
        if (intent == null) {
            return null;
        }
        NeoConfig neoConfig = new NeoConfig();
        Uri data = intent.getData();
        HashMap hashMap = new HashMap();
        l.a(data, hashMap);
        neoConfig.parse(hashMap);
        if (neoConfig.isLegal()) {
            return neoConfig;
        }
        return null;
    }

    public static NeoConfig initNeoConfigFromDefault() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e83434fce027923fe05ce62a6612e52", RobustBitConfig.DEFAULT_VALUE) ? (NeoConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e83434fce027923fe05ce62a6612e52") : new NeoConfig("unknown");
    }
}
