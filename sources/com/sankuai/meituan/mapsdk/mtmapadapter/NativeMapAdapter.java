package com.sankuai.meituan.mapsdk.mtmapadapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.e;
import com.sankuai.meituan.mapsdk.core.render.b;
import com.sankuai.meituan.mapsdk.mapcore.a;
import com.sankuai.meituan.mapsdk.mapcore.config.MapConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.maps.AbsMTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.k;
import com.sankuai.meituan.mapsdk.maps.interfaces.m;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MTMapEnv;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NativeMapAdapter implements k {
    private static final LatLng DEFAULT_CENTER = new LatLng(39.90921d, 116.397486d);
    private static final float DEFAULT_ZOOM = 10.0f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean apiTracking;
    private final String biz;
    private AbsMTMap mMTMap;
    private e mMTMapViewImpl;
    private final String mapKey;
    private final MapViewOptions mtMapViewOptions;
    private final Platform platform;
    private final int renderType;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public int getMapType() {
        return 3;
    }

    public NativeMapAdapter(int i, String str, MTMapEnv mTMapEnv, Platform platform, boolean z, MapViewOptions mapViewOptions, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, mTMapEnv, platform, Byte.valueOf(z ? (byte) 1 : (byte) 0), mapViewOptions, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30741485cfcbdfbab29a9b509816853f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30741485cfcbdfbab29a9b509816853f");
            return;
        }
        this.renderType = i;
        this.mapKey = str;
        this.platform = platform;
        this.apiTracking = z;
        this.mtMapViewOptions = mapViewOptions;
        this.biz = str2;
        b.e(mTMapEnv == MTMapEnv.STAGE ? 1 : 0);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public View getInnerMapView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "406071f00ced76f9d6b6326d06bdf1f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "406071f00ced76f9d6b6326d06bdf1f7");
        }
        this.mMTMapViewImpl = new e(context, this.mapKey, this.platform, this.biz, this.renderType, this.mtMapViewOptions);
        return this.mMTMapViewImpl;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public m getMapView() {
        return this.mMTMapViewImpl;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public AbsMTMap getMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9640c38535c87de1255331802c1bdfd", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsMTMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9640c38535c87de1255331802c1bdfd");
        }
        if (this.mMTMap == null) {
            this.mMTMap = this.mMTMapViewImpl.getMap();
        }
        return this.mMTMap;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public boolean isApiTracking() {
        return this.apiTracking;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public int getCacheClearState(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4efa988cdd4a77fd0d0f85ced2d30e43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4efa988cdd4a77fd0d0f85ced2d30e43")).intValue() : checkCleanMapCache(context);
    }

    private int checkCleanMapCache(Context context) {
        MapConfig b;
        MapConfig.AllConfig allConfig;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf6be3bf85661b3a62ed8707bc255486", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf6be3bf85661b3a62ed8707bc255486")).intValue();
        }
        File i = b.i();
        if (!i.exists() || (b = a.b()) == null || (allConfig = b.getAllConfig()) == null) {
            return -1;
        }
        MapConfig.MapClearCache mapClearCache = allConfig.getMapClearCache();
        if (mapClearCache == null) {
            c.a("MTMapClearCache: 没有缓存清理配置，不需要清理地图缓存");
            return -1;
        } else if (mapClearCache.getVersion() == 0) {
            c.a("MTMapClearCache: 没有获取到正确的版本，不需要清理地图缓存");
            return 0;
        } else {
            int version = mapClearCache.getVersion();
            com.sankuai.meituan.mapsdk.mapcore.preference.a a = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
            if (version <= (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "c390e696508e335fc4665ea0c2ada7f4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "c390e696508e335fc4665ea0c2ada7f4")).intValue() : a.b.getInt("horn_clean_map_cache_config_version", 0))) {
                c.a("MTMapClearCache: 版本小于等于上次已经执行过的命令版本，不需要清理地图缓存");
                return 2;
            } else if (TextUtils.isEmpty(mapClearCache.getRules())) {
                c.a("MTMapClearCache: 没有获取到正确的规则，不需要清理地图缓存");
                return 3;
            } else if (!b.c(mapClearCache.getRules())) {
                c.a("MTMapClearCache: 需要清理的版本和渲染版本不匹配，不需要清理地图缓存");
                return 3;
            } else if (mapClearCache.isState()) {
                b.b(i.getAbsolutePath());
                com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                int version2 = mapClearCache.getVersion();
                Object[] objArr3 = {Integer.valueOf(version2)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "894362b09285ac2228048ad7a2d0c4c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "894362b09285ac2228048ad7a2d0c4c2");
                } else {
                    a2.b.edit().putInt("horn_clean_map_cache_config_version", version2).apply();
                }
                c.a("MTMapClearCache: 清理地图缓存完成");
                f.a(context, 3, this.mapKey, getClass(), "checkCleanMapCache", 778L, "map_clear_cache:{version:" + mapClearCache.getVersion() + ",rules:" + mapClearCache.getRules() + ",state:" + mapClearCache.isState() + CommonConstant.Symbol.BIG_BRACKET_RIGHT, (String) null, 0.0f);
                return 1;
            } else {
                return -1;
            }
        }
    }
}
