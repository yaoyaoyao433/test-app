package com.sankuai.meituan.mapsdk.maps;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.storage.b;
import com.sankuai.meituan.mapsdk.mapcore.config.MapConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import com.sankuai.meituan.mapsdk.mapcore.utils.a;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.utils.d;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.aa;
import com.sankuai.meituan.mapsdk.maps.interfaces.ab;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.k;
import com.sankuai.meituan.mapsdk.maps.interfaces.m;
import com.sankuai.meituan.mapsdk.maps.model.MTMapEnv;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbstractMapView extends FrameLayout implements m {
    public static final int MAP_RENDER_TYPE_GLSURFACEVIEW = 0;
    public static final int MAP_RENDER_TYPE_RENDER_LAYER = 2;
    public static final int MAP_RENDER_TYPE_TEXTUREVIEW = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private m a;
    protected k b;
    protected aa c;
    private ac d;
    private MTMap e;
    private int f;
    private String g;
    private String h;
    private Platform i;
    private boolean j;
    private MapViewOptions k;
    private long l;
    private long m;
    private boolean n;
    private final long[] o;
    private MemoryMonitor p;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MapRenderType {
    }

    public abstract int getMapRenderType();

    public static /* synthetic */ void access$000(AbstractMapView abstractMapView, File[] fileArr, File[] fileArr2) {
        Object[] objArr = {fileArr, fileArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, abstractMapView, changeQuickRedirect2, false, "ca799243df3fc93c0474c24d5118e797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, abstractMapView, changeQuickRedirect2, false, "ca799243df3fc93c0474c24d5118e797");
            return;
        }
        f.a(abstractMapView.getContext(), abstractMapView.getMapType(), abstractMapView.g, abstractMapView.getClass(), "reportMapCache", 779L, (("map_upload_cache: {" + abstractMapView.a(fileArr, "mtmap_cache_info") + ", ") + abstractMapView.a(fileArr2, "qmap_cache_info")) + CommonConstant.Symbol.BIG_BRACKET_RIGHT, (String) null, 0.0f);
        c.a("MTMapUploadCache: 上报地图缓存完成");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MemoryMonitor implements ComponentCallbacks {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<AbstractMapView> a;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NonNull Configuration configuration) {
        }

        public MemoryMonitor(AbstractMapView abstractMapView) {
            Object[] objArr = {abstractMapView};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6553605b3d93f3345f276e90897bbf91", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6553605b3d93f3345f276e90897bbf91");
            } else {
                this.a = new WeakReference<>(abstractMapView);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d300d20dc0e44a72cbaac418a84a746f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d300d20dc0e44a72cbaac418a84a746f");
                return;
            }
            AbstractMapView abstractMapView = this.a.get();
            if (abstractMapView != null) {
                f.a(abstractMapView.getContext(), abstractMapView.getMapType(), abstractMapView.getMapKey(), getClass(), "onTrimMemory", (long) MetricsAnrManager.ANR_THRESHOLD, String.format(Locale.getDefault(), "warnMTMap_size:%s,mtmap_address:%s,pageName:%s", g.d(), Long.toHexString(System.identityHashCode(abstractMapView.getMap())), abstractMapView.getContext().getClass().getName()), (String) null, 0.0f);
            }
        }
    }

    public void setMapViewOptions(MapViewOptions mapViewOptions) {
        this.k = mapViewOptions;
    }

    public AbstractMapView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62040f2f60464e3b8b74bd11c3d2879f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62040f2f60464e3b8b74bd11c3d2879f");
            return;
        }
        this.f = -1;
        this.i = Platform.NATIVE;
        this.j = false;
        this.n = false;
        this.o = new long[3];
        a();
    }

    public AbstractMapView(@NonNull Context context, int i) {
        this(context, i, Platform.NATIVE);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16a3d9fd507e17a30e710fc5e28b1bf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16a3d9fd507e17a30e710fc5e28b1bf4");
        }
    }

    public AbstractMapView(@NonNull Context context, int i, Platform platform) {
        this(context, i, platform, "");
        Object[] objArr = {context, Integer.valueOf(i), platform};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dc8dbc26ccd5cff7b36e5372538d230", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dc8dbc26ccd5cff7b36e5372538d230");
        }
    }

    public AbstractMapView(@NonNull Context context, int i, Platform platform, String str) {
        this(context, i, platform, str, "");
        Object[] objArr = {context, Integer.valueOf(i), platform, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfcdb961e0d7c8cc51966cbe7ba82340", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfcdb961e0d7c8cc51966cbe7ba82340");
        }
    }

    public AbstractMapView(@NonNull Context context, int i, Platform platform, String str, String str2) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), platform, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b86b7f06f39fd349340518d4050c4d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b86b7f06f39fd349340518d4050c4d3");
            return;
        }
        this.f = -1;
        this.i = Platform.NATIVE;
        this.j = false;
        this.n = false;
        this.o = new long[3];
        this.f = i;
        this.h = str2;
        this.i = platform;
        if (a(str)) {
            this.g = str;
            this.n = true;
        } else {
            this.g = a.a(context);
        }
        a();
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "464604e47fc53201eb62363c20cc7310", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "464604e47fc53201eb62363c20cc7310")).booleanValue() : !TextUtils.isEmpty(str) && str.trim().length() >= 20;
    }

    public AbstractMapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e217f550ec0064ba97fd912c12223075", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e217f550ec0064ba97fd912c12223075");
        }
    }

    public AbstractMapView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "068933052ac2ff5cfd8cce5bb55813db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "068933052ac2ff5cfd8cce5bb55813db");
            return;
        }
        this.f = -1;
        this.i = Platform.NATIVE;
        this.j = false;
        this.n = false;
        this.o = new long[3];
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c629d295ad5f064de6c469d4f087674b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c629d295ad5f064de6c469d4f087674b");
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.mtMapType, R.attr.mapsdk_key});
            this.f = obtainStyledAttributes.getInt(0, -1);
            String string = obtainStyledAttributes.getString(1);
            if (a(string)) {
                this.g = string;
                this.n = true;
            } else {
                this.g = a.a(context);
            }
            obtainStyledAttributes.recycle();
        }
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ee5f347ae868c0ebb9775fd35efc748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ee5f347ae868c0ebb9775fd35efc748");
            return;
        }
        Object a = d.a("com.sankuai.meituan.mapdk.maputil.ConfigDialog", "CONFIG_CUSTOMIZE_ENABLE");
        if (a != null && (a instanceof Boolean) && ((Boolean) a).booleanValue()) {
            Object a2 = d.a("com.sankuai.meituan.mapdk.maputil.ConfigDialog", "CUSTOMIZE_MAP_TYPE");
            if (a2 != null && (a2 instanceof Integer)) {
                this.f = ((Integer) a2).intValue();
            }
            Object a3 = d.a("com.sankuai.meituan.mapdk.maputil.ConfigDialog", "CUSTOMIZE_MTMAP_ENV");
            if (a3 != null && (a3 instanceof MTMapEnv)) {
                MapsInitializer.setMTMapEnv((MTMapEnv) a3);
            }
        }
        this.o[0] = SystemClock.elapsedRealtime();
        com.sankuai.meituan.mapsdk.mapcore.a.a(getContext());
        com.sankuai.meituan.mapsdk.mapcore.area.a.a(getContext());
    }

    private void b() {
        boolean z;
        k obtain;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b07efcb3dc7dab0b33d58799f5d7cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b07efcb3dc7dab0b33d58799f5d7cce");
            return;
        }
        int i = this.f;
        String str = this.g;
        Platform platform = this.i;
        MapViewOptions mapViewOptions = this.k;
        String str2 = this.h;
        Object[] objArr2 = {Integer.valueOf(i), str, platform, mapViewOptions, str2};
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a590d9561e56db32353e21fd0d72308a", RobustBitConfig.DEFAULT_VALUE)) {
            obtain = (k) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a590d9561e56db32353e21fd0d72308a");
            z = true;
        } else {
            z = true;
            obtain = new MapAdapterProvider(getContext(), i, str, platform, getMapRenderType(), mapViewOptions, str2).obtain();
            View innerMapView = obtain.getInnerMapView(getContext());
            removeAllViews();
            addView(innerMapView);
        }
        this.b = obtain;
        this.a = this.b.getMapView();
        if (this.k != null) {
            this.a.setZoomMode(this.k.getZoomMode());
        }
        if (this.d != null) {
            this.a.setZoomMode(this.d);
        }
        this.j = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72b4a67d0733a09c5a2344718f5a3329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72b4a67d0733a09c5a2344718f5a3329");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onCreate(Bundle bundle) {
        MapConfig.AllConfig allConfig;
        int i;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8c9009b1a5053d7585a072614fd4542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8c9009b1a5053d7585a072614fd4542");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c208cc263c9f22b4dcbbd22635f5227d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c208cc263c9f22b4dcbbd22635f5227d");
        } else {
            MapConfig b = com.sankuai.meituan.mapsdk.mapcore.a.b();
            if (b != null && (allConfig = b.getAllConfig()) != null) {
                MapConfig.MapUploadCache mapUploadCache = allConfig.getMapUploadCache();
                if (mapUploadCache == null) {
                    c.a("MTMapUploadCache: 没有缓存上报配置，不需要上报地图缓存");
                } else {
                    int version = mapUploadCache.getVersion();
                    com.sankuai.meituan.mapsdk.mapcore.preference.a a = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                    if (version <= (PatchProxy.isSupport(objArr3, a, changeQuickRedirect4, false, "5e3bd9bb465a0c94e1696fe3dc915514", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect4, false, "5e3bd9bb465a0c94e1696fe3dc915514")).intValue() : a.b.getInt("horn_upload_map_cache_config_version", 0))) {
                        c.a("MTMapUploadCache: 上次已经执行过的命令版本，不需要上报地图缓存");
                    } else {
                        final File[] listFiles = b.a("map_sdk", "mtmap/mtmap.db", false).getParentFile().listFiles();
                        final File[] fileArr = {new File(getContext().getFilesDir().getAbsolutePath() + "/tencentMapSdk"), new File(getContext().getExternalFilesDir(null).getAbsolutePath() + "/tencentmapsdk/"), new File("/storage/emulated/0/tencentmapsdk")};
                        if (mapUploadCache.isState()) {
                            com.sankuai.meituan.mapsdk.mapcore.preference.a a2 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
                            int version2 = mapUploadCache.getVersion();
                            Object[] objArr4 = {Integer.valueOf(version2)};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
                            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "bed3d838613e091f16908fb0ec4ebe01", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "bed3d838613e091f16908fb0ec4ebe01");
                            } else {
                                a2.b.edit().putInt("horn_upload_map_cache_config_version", version2).apply();
                            }
                            com.sankuai.meituan.mapfoundation.threadcenter.a.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.maps.AbstractMapView.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "4005df6b66e8a6a84365c46659ea8136", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "4005df6b66e8a6a84365c46659ea8136");
                                    } else {
                                        AbstractMapView.access$000(AbstractMapView.this, listFiles, fileArr);
                                    }
                                }
                            }, "mtmap-thread-reportMapCache").start();
                        }
                    }
                }
            }
        }
        this.p = new MemoryMonitor(this);
        if (!this.j) {
            String d = g.d();
            b();
            f.a(getContext(), getMapType(), getMapKey(), getClass(), "onCreate", 800L, String.format(Locale.getDefault(), "beforeCreateMTMap_size:%s,afterCreateMTMap_size:%s,mtmap_address:%s,pageName:%s", d, g.d(), this.b != null ? Long.toHexString(System.identityHashCode(this.b.getMap())) : null, getContext().getClass().getName()), (String) null, 0.0f);
        }
        if (this.a == null && this.b != null) {
            this.a = this.b.getMapView();
        }
        if (this.a != null) {
            this.a.onCreate(bundle);
            this.l = 0L;
            this.m = 0L;
        }
        if (this.b != null) {
            MapTypeUtils.setCurrentMapType(this.b.getMapType());
            com.sankuai.meituan.mapsdk.mapcore.a.a(this.i);
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "98543c56dfb40514c6fe2cda5deebb3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "98543c56dfb40514c6fe2cda5deebb3f");
            } else {
                Class<?> cls = getClass();
                Context context = getContext();
                int mapType = this.b.getMapType();
                if (!this.n) {
                    Platform platform = this.i;
                    f.a(context, mapType, platform, cls, "dataAnalyze", "Key is null or not valid: Context=" + context.getClass().getName());
                }
                if (mapType == 3) {
                    com.sankuai.meituan.mapsdk.mapcore.report.g.a().a(context, mapType, this.g, cls, "dataAnalyze");
                }
                MapViewOptions.BasemapSourceType basemapSourceType = MapViewOptions.BasemapSourceType.VECTOR;
                if (this.k != null) {
                    boolean isOverseasMapEnabled = this.k.isOverseasMapEnabled();
                    i = isOverseasMapEnabled;
                    if (this.k.getBasemapSourceType() != null) {
                        basemapSourceType = this.k.getBasemapSourceType();
                        i = isOverseasMapEnabled;
                    }
                } else {
                    i = 0;
                }
                f.a(context, mapType, this.g, cls, "dataAnalyze", 6001L, String.format(Locale.getDefault(), "inputvendor=%d&esVersion=%s&platform=%s&biz=%s&sourceType=%s&useOverseasMap=%s&pageDetailMessage=%s", Integer.valueOf(this.f), g.c(), this.i.name(), this.h, Integer.valueOf(basemapSourceType.getValue()), Integer.valueOf(i), f.a(context)), (String) null, 0.0f);
            }
        }
        Object a3 = d.a("com.sankuai.meituan.mapdk.maputil.ConfigDialog", "CONFIG_CUSTOMIZE_ENABLE");
        if (a3 != null && (a3 instanceof Boolean) && ((Boolean) a3).booleanValue()) {
            MTMap map = getMap();
            Object a4 = d.a("com.sankuai.meituan.mapdk.maputil.ConfigDialog", "MAX_FPS");
            if (a4 != null && (a4 instanceof Integer)) {
                map.setRenderFps(((Integer) a4).intValue());
            }
            Object a5 = d.a("com.sankuai.meituan.mapdk.maputil.ConfigDialog", "REFRESH_CONTINUOUSLY");
            if (a5 == null || !(a5 instanceof Boolean)) {
                return;
            }
            map.refreshContinuously(((Boolean) a5).booleanValue());
        }
    }

    private String a(File[] fileArr, String str) {
        Object[] objArr = {fileArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e783acd0d47f72ae287921085b3795f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e783acd0d47f72ae287921085b3795f");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": {");
        for (File file : fileArr) {
            sb.append(file.getAbsolutePath());
            sb.append(": ");
            sb.append(a(file));
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }

    private long a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f76075b06284abc2163cd5faa497dba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f76075b06284abc2163cd5faa497dba")).longValue();
        }
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        long length = file.length();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                length += a(file2);
            }
        }
        return length;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b46bafc811dd6a52894c6702820b9e02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b46bafc811dd6a52894c6702820b9e02");
            return;
        }
        if (this.p != null) {
            getContext().registerComponentCallbacks(this.p);
        }
        if (this.a != null) {
            this.a.onResume();
            this.l = SystemClock.elapsedRealtime();
        }
        if (this.b != null) {
            MapTypeUtils.setCurrentMapType(this.b.getMapType());
            com.sankuai.meituan.mapsdk.mapcore.a.a(this.i);
        }
        this.o[2] = SystemClock.elapsedRealtime();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b321d5f62fde29a87ac2f2acd1896cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b321d5f62fde29a87ac2f2acd1896cf");
        } else if (this.a != null) {
            this.a.onStart();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61f4ec0c1cc94a36c840be59068fd8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61f4ec0c1cc94a36c840be59068fd8a6");
            return;
        }
        if (this.p != null) {
            getContext().unregisterComponentCallbacks(this.p);
        }
        if (this.a != null) {
            this.a.onPause();
            if (this.l > 0) {
                this.m += SystemClock.elapsedRealtime() - this.l;
            }
        }
        if (this.b != null && this.b.getMapType() == 3) {
            com.sankuai.meituan.mapsdk.mapcore.report.g.a().b();
        }
        this.o[1] = SystemClock.elapsedRealtime();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57dbc1fd0ed4d78d31c998b932aa1e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57dbc1fd0ed4d78d31c998b932aa1e0");
        } else if (this.a != null) {
            this.a.onStop();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f04cf2511154bb3ad10e007b55918530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f04cf2511154bb3ad10e007b55918530");
            return;
        }
        this.p = null;
        if (this.a != null) {
            if (this.b != null && this.b.getMap() != null) {
                this.b.getMap().destroy();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "938f24eac167782101cda72a6ca6353c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "938f24eac167782101cda72a6ca6353c");
                } else if (this.m > 0) {
                    HashMap hashMap = new HashMap();
                    String valueOf = this.f == -1 ? "3" : String.valueOf(this.f);
                    hashMap.put("mapKey", this.g);
                    hashMap.put("techType", f.a(this.i));
                    hashMap.put("mapVender", valueOf);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("MTMapRunningTime", Float.valueOf((float) this.m));
                    f.a(hashMap, hashMap2);
                }
                f.a(getContext(), getMapType(), getMapKey(), getClass(), "onDestroy", 800L, String.format(Locale.getDefault(), "deallocMTMap_size:%s,mtmap_address:%s,pageName:%s", g.d(), this.b != null ? Long.toHexString(System.identityHashCode(this.b.getMap())) : null, getContext().getClass().getName()), (String) null, 0.0f);
            }
            this.a.onDestroy();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fffeb49f8d2d2dea0b2cd482109b2b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fffeb49f8d2d2dea0b2cd482109b2b50");
        } else if (this.a != null) {
            this.a.onLowMemory();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bcf12bece460205752c4eb1c54a2aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bcf12bece460205752c4eb1c54a2aa8");
        } else if (this.a != null) {
            this.a.onSaveInstanceState(bundle);
        }
    }

    @Override // android.view.View, com.sankuai.meituan.mapsdk.maps.interfaces.j
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a450590e369e8c18a9dc55abd7ffc698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a450590e369e8c18a9dc55abd7ffc698");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a != null) {
            this.a.onSizeChanged(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap] */
    public MTMap getMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56b1aa801b3481a739dc0cbb4c2bf84", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56b1aa801b3481a739dc0cbb4c2bf84");
        }
        if (this.e != null) {
            return this.e;
        }
        if (!this.j) {
            b();
        }
        if (this.b == null) {
            return null;
        }
        MapTypeUtils.setCurrentMapType(this.b.getMapType());
        AbsMTMap map = this.b.getMap();
        if (map != null) {
            map.setPlatform(this.i);
            map.setIsTextureView(getMapRenderType() == 1);
            if (map.getMapView() == null) {
                map.setMapView(this);
            }
        }
        AbsMTMap absMTMap = map;
        if (this.b.isApiTracking()) {
            absMTMap = (IMTMap) Proxy.newProxyInstance(AbsMTMap.class.getClassLoader(), new Class[]{IMTMap.class}, new com.sankuai.meituan.mapsdk.mapcore.report.a(map));
        }
        this.e = new MTMap(absMTMap);
        this.e.setMapView(this);
        return this.e;
    }

    public UiSettings getUiSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b014cf7fac894109c672b426021756ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (UiSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b014cf7fac894109c672b426021756ab");
        }
        if (getMap() != null) {
            return getMap().getUiSettings();
        }
        return null;
    }

    public k getMapAdapter() {
        return this.b;
    }

    @Override // android.view.View, com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "488e5d5d127edb9e12d281fbbfad048b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "488e5d5d127edb9e12d281fbbfad048b");
            return;
        }
        super.setVisibility(i);
        if (this.a != null) {
            this.a.setVisibility(i);
        }
    }

    public void setMapType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7b6e0b816d0dfe5f4f39ae3f6dde596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7b6e0b816d0dfe5f4f39ae3f6dde596");
            return;
        }
        this.f = i;
        com.sankuai.meituan.mapsdk.mapcore.preference.a.a().a(i);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setZoomMode(ac acVar) {
        Object[] objArr = {acVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6af82c6189bea914f85622a0fb37e901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6af82c6189bea914f85622a0fb37e901");
        } else if (this.a != null) {
            this.a.setZoomMode(acVar);
        } else {
            this.d = acVar;
        }
    }

    public int getMapType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f3e2ad9e0a9610e757ecd3b6406c800", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f3e2ad9e0a9610e757ecd3b6406c800")).intValue();
        }
        if (this.b != null) {
            return this.b.getMapType();
        }
        return -1;
    }

    public void setMapKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b09f2f4a14f3c9907885cc8995dab2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b09f2f4a14f3c9907885cc8995dab2f");
        } else if (a(str)) {
            this.g = str;
            if (this.j) {
                return;
            }
            this.n = true;
        }
    }

    public String getMapKey() {
        return this.g;
    }

    public void switchMap(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9110a3303c20d81a7a60efd42b1596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9110a3303c20d81a7a60efd42b1596");
        } else if (this.b == null || this.b.getMapType() == i) {
        } else {
            com.sankuai.meituan.mapsdk.mapcore.preference.a.a().a(i);
            this.b = new MapAdapterProvider(getContext(), i, this.g, this.i, getMapRenderType(), this.k, this.h).obtain();
            View innerMapView = this.b.getInnerMapView(getContext());
            removeAllViews();
            addView(innerMapView);
            m mVar = this.a;
            this.a = this.b.getMapView();
            if (this.a != null) {
                this.a.onCreate(null);
                if (mVar == null || this.a == mVar) {
                    return;
                }
                mVar.onDestroy();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setCustomMapStylePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c69595d2dc1ce02bf17f8a79513285e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c69595d2dc1ce02bf17f8a79513285e");
        } else if (this.a != null) {
            this.a.setCustomMapStylePath(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setMapCustomEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3c67a4fe873af6cea4f072dcf375c22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3c67a4fe873af6cea4f072dcf375c22");
        } else if (this.a != null) {
            this.a.setMapCustomEnable(z);
        }
    }

    public List<Marker> getMapScreenMarkers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e9a2e9e3d3e4190898395c4b2f96910", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e9a2e9e3d3e4190898395c4b2f96910") : getMap().getMapScreenMarkers();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public void setOnDrawFrameCostListener(ab abVar) {
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "836e6bd6d779dc03322bf6a25011e000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "836e6bd6d779dc03322bf6a25011e000");
        } else if (this.a != null) {
            this.a.setOnDrawFrameCostListener(abVar);
        }
    }

    public void setOnMapTouchListener(aa aaVar) {
        this.c = aaVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.m
    public final void onSurfaceChanged(Object obj, int i, int i2) {
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d76c6385239f0ee0d8abd1a5b6248669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d76c6385239f0ee0d8abd1a5b6248669");
        } else if (obj instanceof Surface) {
            this.a.onSurfaceChanged(obj, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View, com.sankuai.meituan.mapsdk.maps.interfaces.m
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df1bdf24e018d876094433797df489ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df1bdf24e018d876094433797df489ab")).booleanValue();
        }
        if (this.c != null) {
            this.c.a(motionEvent);
        }
        if (getMapRenderType() == 2 && this.a != null) {
            return this.a.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public long[] getTimestamps() {
        return this.o;
    }

    @Deprecated
    public boolean isTextureMapView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "064aed6a56ce585dfed56d23e7d46578", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "064aed6a56ce585dfed56d23e7d46578")).booleanValue() : getMapRenderType() == 1;
    }
}
