package com.sankuai.meituan.mapsdk.mapcore.config;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MapConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("all_config")
    private AllConfig mAllConfig;
    @SerializedName("bussiness_config")
    private List<Bussiness> mBussinessConfigs;

    public MapConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3ca55f75d22236075b76d7e83c2f1bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3ca55f75d22236075b76d7e83c2f1bd");
            return;
        }
        this.mBussinessConfigs = null;
        this.mAllConfig = null;
    }

    public final List<Bussiness> getBussinessConfigs() {
        return this.mBussinessConfigs;
    }

    public final AllConfig getAllConfig() {
        return this.mAllConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int rectifyMapSupplier(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bfef3a83954a8e53a77b9def7f27a734", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bfef3a83954a8e53a77b9def7f27a734")).intValue();
        }
        if (i != 1) {
            if (i == 3 && g.a()) {
                return i;
            }
        } else if (g.b()) {
            return i;
        }
        return -2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Bussiness extends Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("mapsdk_product_key")
        private String mKey;

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ int getBaseMapSourceType() {
            return super.getBaseMapSourceType();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ int getMapSupplier() {
            return super.getMapSupplier();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isApiTracking() {
            return super.isApiTracking();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isNewAlongLineSymbol() {
            return super.isNewAlongLineSymbol();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isNewMapAlongLineSymbol() {
            return super.isNewMapAlongLineSymbol();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isNewSymbol() {
            return super.isNewSymbol();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isPoiNewSymbol() {
            return super.isPoiNewSymbol();
        }

        public final String getKey() {
            return this.mKey;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class AllConfig extends Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("map_clear_cache")
        private MapClearCache mMapClearCache;
        @SerializedName("map_debug_info")
        private MapDebugInfo mMapDebugInfo;
        @SerializedName("map_upload_cache")
        private MapUploadCache mMapUploadCache;

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ int getBaseMapSourceType() {
            return super.getBaseMapSourceType();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ int getMapSupplier() {
            return super.getMapSupplier();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isApiTracking() {
            return super.isApiTracking();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isNewAlongLineSymbol() {
            return super.isNewAlongLineSymbol();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isNewMapAlongLineSymbol() {
            return super.isNewMapAlongLineSymbol();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isNewSymbol() {
            return super.isNewSymbol();
        }

        @Override // com.sankuai.meituan.mapsdk.mapcore.config.MapConfig.Config
        public final /* bridge */ /* synthetic */ boolean isPoiNewSymbol() {
            return super.isPoiNewSymbol();
        }

        public final MapClearCache getMapClearCache() {
            return this.mMapClearCache;
        }

        public final MapUploadCache getMapUploadCache() {
            return this.mMapUploadCache;
        }

        public final MapDebugInfo getMapDebugInfo() {
            return this.mMapDebugInfo;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("basemap_source_type")
        private int baseMapSourceType;
        @SerializedName("api_tracking")
        protected boolean mIsApiTracking;
        @SerializedName("map_supplier")
        protected int mMapSupplier;
        @SerializedName("new_along_line_symbol")
        private boolean mNewAlongLineSymbol;
        @SerializedName("new_map_along_line_symbol")
        private boolean mNewMapAlongLineSymbol;
        @SerializedName("new_map_symbol")
        private boolean mNewSymbol;
        @SerializedName("new_map_poi_symbol")
        private boolean mPoiNewSymbol;

        public Config() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "003a74f4d8781d4707ed6be8c9cbccff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "003a74f4d8781d4707ed6be8c9cbccff");
                return;
            }
            this.mMapSupplier = -2;
            this.mIsApiTracking = false;
            this.mMapSupplier = -2;
            this.mIsApiTracking = false;
            this.mNewSymbol = false;
            this.mPoiNewSymbol = false;
            this.baseMapSourceType = 0;
        }

        public int getMapSupplier() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91f304482db8d83e463523322bdc6cda", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91f304482db8d83e463523322bdc6cda")).intValue() : MapConfig.rectifyMapSupplier(this.mMapSupplier);
        }

        public boolean isApiTracking() {
            return this.mIsApiTracking;
        }

        public boolean isNewSymbol() {
            return this.mNewSymbol;
        }

        public boolean isPoiNewSymbol() {
            return this.mPoiNewSymbol;
        }

        public int getBaseMapSourceType() {
            return this.baseMapSourceType;
        }

        public boolean isNewAlongLineSymbol() {
            return this.mNewAlongLineSymbol;
        }

        public boolean isNewMapAlongLineSymbol() {
            return this.mNewMapAlongLineSymbol;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MapClearCache {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rules")
        private String rules;
        @SerializedName("state")
        private boolean state;
        @SerializedName("version")
        private int version;

        public int getVersion() {
            return this.version;
        }

        public boolean isState() {
            return this.state;
        }

        public String getRules() {
            return this.rules;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MapUploadCache {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("state")
        private boolean state;
        @SerializedName("version")
        private int version;

        public boolean isState() {
            return this.state;
        }

        public int getVersion() {
            return this.version;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MapDebugInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("render_upload_level")
        private int renderUploadLevel;

        public int getRenderUploadLevel() {
            return this.renderUploadLevel;
        }
    }
}
