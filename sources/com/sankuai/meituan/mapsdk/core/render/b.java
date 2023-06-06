package com.sankuai.meituan.mapsdk.core.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.mtmap.rendersdk.DynamicMapObserver;
import com.meituan.mtmap.rendersdk.IZoomUtil;
import com.meituan.mtmap.rendersdk.IndoorBuildingsObserver;
import com.meituan.mtmap.rendersdk.MapObserver;
import com.meituan.mtmap.rendersdk.NativeMap;
import com.meituan.mtmap.rendersdk.QueryObserver;
import com.meituan.mtmap.rendersdk.style.layer.CustomLayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.render.annotation.RunInRenderThread;
import com.sankuai.meituan.mapsdk.core.render.annotation.RunInUIThread;
import com.sankuai.meituan.mapsdk.core.render.model.g;
import com.sankuai.meituan.mapsdk.core.render.model.i;
import com.sankuai.meituan.mapsdk.core.utils.d;
import com.sankuai.meituan.mapsdk.mapcore.config.MapConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.utils.h;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.TileCacheType;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements QueryObserver, a {
    public static ChangeQuickRedirect a;
    private static File b;
    private NativeMap c;
    private PointF d;
    private int e;
    private int f;
    private List<QueryObserver> g;

    private static int a(boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f59e2d25a82218366bd860668ce274e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f59e2d25a82218366bd860668ce274e")).intValue() : ((z4 ? 1 : 0) << 4) | ((z ? 1 : 0) << 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 3);
    }

    private double g(double d) {
        while (true) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c37771aa1ff6b16df8402e8e3ae8e99", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c37771aa1ff6b16df8402e8e3ae8e99")).doubleValue();
            }
            if (d >= 0.0d) {
                return d <= 180.0d ? -d : 360.0d - d;
            }
            d += 360.0d;
        }
    }

    public b(Context context, String str, Platform platform, String str2, MapObserver mapObserver, IZoomUtil iZoomUtil, boolean z, MapViewOptions.BasemapSourceType basemapSourceType, byte[] bArr, String str3) {
        int i;
        int i2;
        Object[] objArr = {context, str, platform, str2, mapObserver, iZoomUtil, Byte.valueOf(z ? (byte) 1 : (byte) 0), basemapSourceType, bArr, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53af60be8367a4ea7472e268d553d3ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53af60be8367a4ea7472e268d553d3ed");
            return;
        }
        this.g = new ArrayList(1);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s=%s", "key", str));
        sb.append("&");
        sb.append(String.format("%s=%s", "appid", Integer.valueOf(MapsInitializer.getCatAppId())));
        sb.append("&");
        sb.append(String.format("%s=%s", DeviceInfo.DEVICE_MODEL, Build.MODEL));
        sb.append("&");
        sb.append(String.format("%s=%s", "osVersion", "Android " + Build.VERSION.RELEASE));
        sb.append("&");
        sb.append(String.format("%s=%s", "esVersion", com.sankuai.meituan.mapsdk.core.utils.a.a()));
        sb.append("&");
        sb.append(String.format("%s=%s", "containerPlatform", platform.toString().toLowerCase()));
        if (!TextUtils.isEmpty(str2)) {
            sb.append("&");
            sb.append(String.format("%s=%s", "containerBiz", str2));
        }
        int value = basemapSourceType != null ? basemapSourceType.getValue() : 1;
        MapConfig b2 = com.sankuai.meituan.mapsdk.mapcore.a.b();
        if (b2 != null) {
            if (b2.getAllConfig() != null && h(b2.getAllConfig().getBaseMapSourceType())) {
                value = b2.getAllConfig().getBaseMapSourceType();
            }
            List<MapConfig.Bussiness> bussinessConfigs = b2.getBussinessConfigs();
            if (bussinessConfigs != null && !TextUtils.isEmpty(str)) {
                for (MapConfig.Bussiness bussiness : bussinessConfigs) {
                    if (str.equals(bussiness.getKey())) {
                        i2 = a(bussiness.isNewSymbol(), bussiness.isPoiNewSymbol(), bussiness.isNewAlongLineSymbol(), bussiness.isNewMapAlongLineSymbol());
                        if (h(bussiness.getBaseMapSourceType())) {
                            value = bussiness.getBaseMapSourceType();
                        }
                        i = (i2 == -1 || b2.getAllConfig() == null) ? i2 : a(b2.getAllConfig().isNewSymbol(), b2.getAllConfig().isPoiNewSymbol(), b2.getAllConfig().isNewAlongLineSymbol(), b2.getAllConfig().isNewMapAlongLineSymbol());
                    }
                }
            }
            i2 = -1;
            if (i2 == -1) {
            }
        } else {
            i = -1;
        }
        int i3 = i == -1 ? 0 : i;
        c.b("renderSwitch:" + i3);
        this.c = new NativeMap(context.getResources().getDisplayMetrics().density, context, i().getAbsolutePath(), mapObserver, this, iZoomUtil, new int[]{context.hashCode()}, sb.toString(), z, i3, value + (-1), bArr, str3);
    }

    private static boolean h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91ec436302acdd5eaa836dbb88831323", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91ec436302acdd5eaa836dbb88831323")).booleanValue();
        }
        for (MapViewOptions.BasemapSourceType basemapSourceType : MapViewOptions.BasemapSourceType.valuesCustom()) {
            if (i == basemapSourceType.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static File i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8a010ebebb39d093281bd12f44a5553", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8a010ebebb39d093281bd12f44a5553");
        }
        if (b == null) {
            File a2 = com.sankuai.meituan.mapfoundation.storage.b.a("MDMap", false);
            if (a2 != null && a2.exists()) {
                com.sankuai.meituan.mapfoundation.storage.b.a(a2);
                if (TextUtils.equals(a2.getParentFile().getName(), "MDMap")) {
                    com.sankuai.meituan.mapfoundation.storage.b.a(a2.getParentFile());
                }
            }
            b = com.sankuai.meituan.mapfoundation.storage.b.a("map_sdk", "mtmap/mtmap.db", false);
        }
        return b;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(PointF pointF, boolean z) {
        Object[] objArr = {pointF, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8f227b0326060479cf92e4df6dbfa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8f227b0326060479cf92e4df6dbfa6");
            return;
        }
        CameraPosition h = h();
        if (z && h != null) {
            if (pointF != null) {
                this.d = null;
                setCameraPosition(h, new float[]{pointF.x, pointF.y, this.e - pointF.x, this.f - pointF.y}, 200);
            } else {
                a(h, 200);
            }
        }
        this.d = pointF;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final PointF a() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(QueryObserver queryObserver) {
        Object[] objArr = {queryObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114d912eebe0e226025d8e7980f4aae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114d912eebe0e226025d8e7980f4aae6");
        } else {
            this.g.add(queryObserver);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setPause(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1aa45bc12032d1fb0b9dc157f4b9f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1aa45bc12032d1fb0b9dc157f4b9f01");
        } else {
            this.c.setPause(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45efc2f394d651bac37386ac04df01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45efc2f394d651bac37386ac04df01e");
        } else {
            this.c.destroy();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void enableEventListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3afcbce59bbf4e5cc2086b289adf068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3afcbce59bbf4e5cc2086b289adf068");
        } else {
            this.c.enableEventListener();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void clearMapCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4d112b653affb426fdfdcd5c3f911e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4d112b653affb426fdfdcd5c3f911e");
        } else if (b == null || !b.exists()) {
        } else {
            b.delete();
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f63989a7fce06f2f4d1dfeb0c969be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f63989a7fce06f2f4d1dfeb0c969be8");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            NativeMap.clearOfflineData(str);
        }
    }

    public static boolean a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d46857974f5f31baa177ac5666cdf80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d46857974f5f31baa177ac5666cdf80")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return NativeMap.clearPartOfflineData(str, j);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setDebugTileBorder(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c25a0bb98e7e12126540e7213b4212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c25a0bb98e7e12126540e7213b4212");
        } else {
            this.c.setDebugTileBorder(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setMapSize(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131adb6b32eb4212666ca54f526ec3e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131adb6b32eb4212666ca54f526ec3e1");
            return;
        }
        this.e = i;
        this.f = i2;
        this.c.setMapSize(d.a(i), d.a(i2));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final int b() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final int c() {
        return this.f;
    }

    public static void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d23b985efecec009a5c24e850c3d5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d23b985efecec009a5c24e850c3d5ef");
        } else {
            NativeMap.setHostType(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void setRasterForeign(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1965adfb2f4ba891327d4a90e141ab05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1965adfb2f4ba891327d4a90e141ab05");
        } else {
            this.c.setRasterForeign(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setMaxFps(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd9bc0f073d2428754a6b6afa449b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd9bc0f073d2428754a6b6afa449b61");
        } else {
            this.c.setMaxFps(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e87a178f842b2b5a902ee847e8817e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e87a178f842b2b5a902ee847e8817e79");
        } else {
            this.c.refreshFrame(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setTileCacheType(String str, TileCacheType tileCacheType) {
        Object[] objArr = {str, tileCacheType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add9ecae7ec731f0481246f998c72763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add9ecae7ec731f0481246f998c72763");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "sankuai";
        }
        this.c.setTileCacheType(str, tileCacheType.value());
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7abe9d1512be0880d0dcd06d502d575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7abe9d1512be0880d0dcd06d502d575");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "sankuai";
        }
        this.c.setTileCacheRatio(str, f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setRoadTraffic(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01abdd463bc482d9e9d70e5705ff3f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01abdd463bc482d9e9d70e5705ff3f8");
        } else {
            this.c.setRoadTraffic(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setRoadBlock(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7b60f934125396f678668bdb882ae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7b60f934125396f678668bdb882ae0");
        } else {
            this.c.setRoadBlock(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setTrafficColor(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbef985b152cc908f95feea0bbc3f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbef985b152cc908f95feea0bbc3f01");
        } else {
            this.c.setTrafficColor(i, f(i2));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setTrafficStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4683105894b9701d8d6b3139ae5838b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4683105894b9701d8d6b3139ae5838b7");
        } else {
            this.c.setTrafficStyle(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void showRoadStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7774d7aadc2a46334d238371605ec37b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7774d7aadc2a46334d238371605ec37b");
        } else {
            this.c.showRoadStyle(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void show3dBuilding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc73e6833407924ce5f21722732be9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc73e6833407924ce5f21722732be9a");
        } else {
            this.c.show3dBuilding(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void showTrafficLight(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6b914d0a7314499b3ac809b8adb97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6b914d0a7314499b3ac809b8adb97b");
        } else {
            this.c.showTrafficLight(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setWeatherType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b0467c3bf9e980944040ed92e3978d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b0467c3bf9e980944040ed92e3978d");
        } else {
            this.c.setWeatherType(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setWeatherIntensity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814ae7b2a0836127f14dad97f10b3288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814ae7b2a0836127f14dad97f10b3288");
        } else {
            this.c.setWeatherIntensity(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setWeatherAutoUpdate(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10bca52a501e8ec9788de3e4ea934cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10bca52a501e8ec9788de3e4ea934cae");
        } else {
            this.c.setWeatherAutoUpdate(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void disableWeather() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e74ed38f825f9f00d873c1e37eb37a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e74ed38f825f9f00d873c1e37eb37a");
        } else {
            this.c.disableWeather();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInRenderThread
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0b125d411cbd013d9b4bbcf95e63b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0b125d411cbd013d9b4bbcf95e63b6");
        } else {
            this.c.render();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37572628112e469a4639b4049abf09b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37572628112e469a4639b4049abf09b7");
        } else {
            this.c.requireUpdate();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e3dd6dff0469ab9ac829434cbbb92c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e3dd6dff0469ab9ac829434cbbb92c");
            return;
        }
        this.c.setDebugTileBorder(true);
        this.c.setPreloadParentTileLevel(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9771657b856bcc7d20a3ea45e895c39b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9771657b856bcc7d20a3ea45e895c39b")).intValue() : NativeMap.getBaseStyleNum();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eacf11685cb97f9a42f7075b07ea0ee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eacf11685cb97f9a42f7075b07ea0ee") : NativeMap.getBaseStyleName(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe1f4830c112efa6a6542c7c6d4f5be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe1f4830c112efa6a6542c7c6d4f5be") : NativeMap.getBaseStyleUrl(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addStyleUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822329a8bda58c6687bcf5cf39be7a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822329a8bda58c6687bcf5cf39be7a44");
        } else {
            NativeMap.addStyleUrl(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void applyMapStyle(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca44b4c37cd8bd1faba3308ac8479311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca44b4c37cd8bd1faba3308ac8479311");
        } else {
            this.c.applyMapStyle(str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void applyColorStyle(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a31760e167aa2d59ed4796dae34563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a31760e167aa2d59ed4796dae34563");
        } else {
            this.c.applyColorStyle(str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void applyMapStyleFromBuffer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82db82a4827779d89a6e2c596fe6f80e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82db82a4827779d89a6e2c596fe6f80e");
        } else {
            this.c.applyMapStyleFromBuffer(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long getRenderFrameNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8adadbac7b445633082d8d1f19bca8e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8adadbac7b445633082d8d1f19bca8e")).longValue() : this.c.getRenderFrameNum();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void createRoadCrossing(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c524e45c05b1a455790093523d7f451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c524e45c05b1a455790093523d7f451");
        } else {
            this.c.createRoadCrossing(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void destroyRoadCrossing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36d84f3f7d44b4f10f891246c1166be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36d84f3f7d44b4f10f891246c1166be");
        } else {
            this.c.destroyRoadCrossing();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setRoadCrossingID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d59fd69d474ed3e1f17c942123d81db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d59fd69d474ed3e1f17c942123d81db");
        } else {
            this.c.setRoadCrossingID(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b1fa4aaafeabb0cd611f77bdcf1a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b1fa4aaafeabb0cd611f77bdcf1a5d");
        } else {
            this.c.setRoadBackgroundColor(f(i));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce88670d39079037af98528c67f81744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce88670d39079037af98528c67f81744");
        } else {
            this.c.setRoadCasingColor(f(i));
        }
    }

    public static boolean a(List<LatLng> list, LatLng latLng) {
        Object[] objArr = {list, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9814776b757b497b9ce363454491f29", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9814776b757b497b9ce363454491f29")).booleanValue() : NativeMap.checkPolygonContainsPoint(a(list, true, true), a(true, latLng));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c57a3cefa3cc0db779189467bed8df5", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c57a3cefa3cc0db779189467bed8df5")).doubleValue() : this.c.toRenderZoom(d);
    }

    private double f(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dad0e48f9f48503cf807ceec7c04a85", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dad0e48f9f48503cf807ceec7c04a85")).doubleValue() : this.c.fromRenderZoom(d);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInUIThread
    public final LatLng getLatLngByScreenCoordinate(PointF pointF) {
        double[] dArr;
        Object[] objArr = {pointF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c318b99c2f53a3997af49c458a6d9919", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c318b99c2f53a3997af49c458a6d9919");
        }
        if (pointF != null) {
            NativeMap nativeMap = this.c;
            PointF[] pointFArr = {pointF};
            Object[] objArr2 = {pointFArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de80a207b8c8b1e2cd0f421ba7c8adde", RobustBitConfig.DEFAULT_VALUE)) {
                dArr = (double[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de80a207b8c8b1e2cd0f421ba7c8adde");
            } else {
                dArr = new double[2];
                for (int i = 0; i <= 0; i++) {
                    dArr[0] = d.a(pointFArr[0].x);
                    dArr[1] = d.a(pointFArr[0].y);
                }
            }
            return a(nativeMap.getLatLngByScrnCoord(dArr));
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final double b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecec1e4fa9bd7e968be46797091c97f5", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecec1e4fa9bd7e968be46797091c97f5")).doubleValue() : NativeMap.getMercatorRatio(d);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final Point getScreenCoordinateByLatLng(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680c1deb7b10100265f07eb1038c0a25", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680c1deb7b10100265f07eb1038c0a25");
        }
        if (h.a(latLng)) {
            double[] scrnCoordByLatLng = this.c.getScrnCoordByLatLng(a(latLng));
            Object[] objArr2 = {scrnCoordByLatLng};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48f0122404675b6afbe7d7109094d563", RobustBitConfig.DEFAULT_VALUE)) {
                return (Point) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48f0122404675b6afbe7d7109094d563");
            }
            Point point = new Point();
            if (scrnCoordByLatLng != null && scrnCoordByLatLng.length == 2) {
                point.x = d.b((float) scrnCoordByLatLng[0]);
                point.y = d.b((float) scrnCoordByLatLng[1]);
            }
            return point;
        }
        return new Point();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final double a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d44ed1f388be7e0c3b4318ccaa8c96b", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d44ed1f388be7e0c3b4318ccaa8c96b")).doubleValue() : d.a((float) NativeMap.getMetersPerPixelAtLatitude(d, a(d2)));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final double c(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7fb3922da85f82ba01dd1aa5820bb1", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7fb3922da85f82ba01dd1aa5820bb1")).doubleValue() : d.a((float) NativeMap.getProjectedMetersPerPixel(a(d)));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final PointD a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63b9ff5ab7088a6e176d0fd031dda6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointD) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63b9ff5ab7088a6e176d0fd031dda6e");
        }
        if (h.a(latLng)) {
            double[] projectedMetersForLatLng = NativeMap.projectedMetersForLatLng(a(latLng));
            Object[] objArr2 = {projectedMetersForLatLng};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de0f0ed4eca22f5537a3e7066bf18580", RobustBitConfig.DEFAULT_VALUE)) {
                return (PointD) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de0f0ed4eca22f5537a3e7066bf18580");
            }
            if (projectedMetersForLatLng == null || projectedMetersForLatLng.length != 2) {
                return null;
            }
            return new PointD((float) projectedMetersForLatLng[1], (float) projectedMetersForLatLng[0]);
        }
        return new PointD(0.0d, 0.0d);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    public final LatLng a(PointD pointD) {
        double[] dArr;
        Object[] objArr = {pointD};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f026a728371059c49a638ad10d61a425", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f026a728371059c49a638ad10d61a425");
        }
        PointD[] pointDArr = {pointD};
        Object[] objArr2 = {pointDArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b27dc257a6ed65891e4c8aca597a144", RobustBitConfig.DEFAULT_VALUE)) {
            dArr = (double[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b27dc257a6ed65891e4c8aca597a144");
        } else {
            dArr = new double[2];
            for (int i = 0; i <= 0; i++) {
                dArr[0] = pointDArr[0].y;
                dArr[1] = pointDArr[0].x;
            }
        }
        return a(NativeMap.latLngForProjectedMeters(dArr));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInUIThread
    public final Point[] getScreenCoordinateByLatLngAndCamera(LatLng[] latLngArr, CameraPosition cameraPosition) {
        int i = 0;
        Object[] objArr = {latLngArr, cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c01671ee4ea25a80daa4771fba60c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c01671ee4ea25a80daa4771fba60c2");
        }
        if (latLngArr == null || cameraPosition == null) {
            return null;
        }
        double[] scrnCoordByLatLngAndCamera = this.c.getScrnCoordByLatLngAndCamera(a(latLngArr), a(cameraPosition, (float[]) null));
        Object[] objArr2 = {scrnCoordByLatLngAndCamera};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4780f7c6fcfb7d1c770dc16ed8bbe6b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4780f7c6fcfb7d1c770dc16ed8bbe6b6");
        }
        Point[] pointArr = new Point[scrnCoordByLatLngAndCamera.length / 2];
        while (i < scrnCoordByLatLngAndCamera.length) {
            int i2 = i + 1;
            pointArr[(i2 - 1) / 2] = new Point(d.b((float) scrnCoordByLatLngAndCamera[i]), d.b((float) scrnCoordByLatLngAndCamera[i2]));
            i = i2 + 1;
        }
        return pointArr;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInRenderThread
    public final Bitmap g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb77712a251b3ef5277e3fd00049c87", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb77712a251b3ef5277e3fd00049c87");
        }
        byte[] readStillImage = this.c.readStillImage(this.e, this.f, 0, 0);
        Bitmap createBitmap = Bitmap.createBitmap(this.e, this.f, Bitmap.Config.ARGB_8888);
        ByteBuffer wrap = ByteBuffer.wrap(readStillImage);
        wrap.rewind();
        createBitmap.copyPixelsFromBuffer(wrap);
        return createBitmap;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInRenderThread
    public final Bitmap getMapPartialScreenShot(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd0b7ecf0145f104fd98d19b9429e0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd0b7ecf0145f104fd98d19b9429e0f");
        }
        byte[] readStillImage = this.c.readStillImage(i, i2, i3, i4);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        ByteBuffer wrap = ByteBuffer.wrap(readStillImage);
        wrap.rewind();
        createBitmap.copyPixelsFromBuffer(wrap);
        return createBitmap;
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbbb0076afa200bd840cc62db8558d86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbbb0076afa200bd840cc62db8558d86")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return NativeMap.checkVersion(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final String funcCallRecordList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f6822d1dcc7e517878fa0f7c3395aa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f6822d1dcc7e517878fa0f7c3395aa") : this.c.outputFuncCallRecordList();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long queryRenderedFeaturesByOrder(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54dfaceee8dbb2e0d64503225b596fd2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54dfaceee8dbb2e0d64503225b596fd2")).longValue() : this.c.queryRenderedFeaturesByOrder(d.a(i), d.a(i2), d.a(i3), d.a(i4));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final int getFeatureNum(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b76cd5193b44cd2ad6c77fe4491486b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b76cd5193b44cd2ad6c77fe4491486b")).intValue();
        }
        if (h.a(j)) {
            return this.c.getFeatureNum(j);
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final com.sankuai.meituan.mapsdk.core.render.model.c getFeatureType(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1948359c4190b63b7a4724e6aee9eb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.core.render.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1948359c4190b63b7a4724e6aee9eb6");
        }
        if (h.a(j)) {
            switch (this.c.getFeatureType(j, i)) {
                case 0:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.Point;
                case 1:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.MultiPoint;
                case 2:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.Line;
                case 3:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.MultiLine;
                case 4:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.Polygon;
                case 5:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.MultiPolygon;
                default:
                    return com.sankuai.meituan.mapsdk.core.render.model.c.UnKnown;
            }
        }
        return com.sankuai.meituan.mapsdk.core.render.model.c.UnKnown;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final int getFeaturePropertyType(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3edc9c55c65e75d6d62fc4b2b6e026", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3edc9c55c65e75d6d62fc4b2b6e026")).intValue();
        }
        if (h.a(j)) {
            return this.c.getFeaturePropertyType(j, i, str);
        }
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final String getFeatureStringProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c15036ae1c91db7dd91cc94a79b7af33", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c15036ae1c91db7dd91cc94a79b7af33") : h.a(j) ? this.c.getFeatureStringProperty(j, i, str) : "";
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long getFeatureLongProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06932ee452e8639a6247a9a273de26fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06932ee452e8639a6247a9a273de26fe")).longValue();
        }
        if (h.a(j)) {
            return this.c.getFeatureLongProperty(j, i, str);
        }
        return 0L;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final boolean getFeatureBooleanProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519b584522c8f2456a970492c20a9a85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519b584522c8f2456a970492c20a9a85")).booleanValue();
        }
        if (h.a(j)) {
            return this.c.getFeatureBooleanProperty(j, i, str);
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double getFeatureDoubleProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229ee12429819567910375c354fbb029", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229ee12429819567910375c354fbb029")).doubleValue();
        }
        if (h.a(j)) {
            return this.c.getFeatureDoubleProperty(j, i, str);
        }
        return 0.0d;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double[] getHexagonBoundsByLatLng(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174a4ed1ce0c7dc3289c455613a6d5ed", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174a4ed1ce0c7dc3289c455613a6d5ed") : NativeMap.getHexagonBoundsByLatLng(d, d2, d3, d4);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void destroyFeatures(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1194bd48045157a6f27a4eca43ba49a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1194bd48045157a6f27a4eca43ba49a2");
        } else if (h.a(j)) {
            this.c.destroyFeatures(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long createAndAddArrow(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb1f093b6b157ef0c47892acf9a3062c", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb1f093b6b157ef0c47892acf9a3062c")).longValue() : this.c.createAndAddArrow(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeAndDestroyArrow(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d871d83da0026605fe95108bce019e19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d871d83da0026605fe95108bce019e19");
        } else if (h.a(j)) {
            this.c.removeAndDestroyArrow(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowFeatureNum(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363ca53ef5b3dc358b861ed12a662ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363ca53ef5b3dc358b861ed12a662ce0");
        } else if (h.a(j)) {
            this.c.setArrowFeatureNum(j, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowFeature(long j, int i, List<LatLng> list) {
        boolean z = true;
        Object[] objArr = {new Long(j), Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b4c2fc010e369806c6983c30b6c11f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b4c2fc010e369806c6983c30b6c11f");
        } else if (h.a(j)) {
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "69979b8a0e1b827217608532bd142fb1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "69979b8a0e1b827217608532bd142fb1")).booleanValue();
            } else if (list == null || list.size() <= 0) {
                z = false;
            }
            if (z) {
                this.c.setArrowFeature(j, i, a(list, false));
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowWidth(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4048892a31d50ca337330208381d70b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4048892a31d50ca337330208381d70b8");
        } else if (h.a(j)) {
            this.c.setArrowWidth(j, d.a(f));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerProperty(long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b4eb514dc6030a195f3ab58c98a60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b4eb514dc6030a195f3ab58c98a60b");
        } else if (h.a(j)) {
            this.c.setArrowLayerProperty(j, i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerProperty(long j, int i, float f) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6587e35392525ff74fb604212e29a049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6587e35392525ff74fb604212e29a049");
        } else if (h.a(j)) {
            this.c.setArrowLayerProperty(j, i, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerProperty(long j, int i, float[] fArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e35b54407a05b6e8505e226e6d3115f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e35b54407a05b6e8505e226e6d3115f1");
        } else if (h.a(j)) {
            this.c.setArrowLayerProperty(j, i, fArr);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerOrder(long j, float f, int i) {
        Object[] objArr = {new Long(j), Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8988186f56223a70a12c1aa47c254e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8988186f56223a70a12c1aa47c254e17");
        } else if (h.a(j)) {
            this.c.setArrowLayerOrder(j, f, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerVisibility(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a96fd80899f660e259abe6be07cda96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a96fd80899f660e259abe6be07cda96");
        } else if (h.a(j)) {
            this.c.setArrowLayerVisibility(j, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerMinZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07b76dd4e157c1e80c4f3abe2bb5cbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07b76dd4e157c1e80c4f3abe2bb5cbf");
        } else if (h.a(j)) {
            this.c.setArrowLayerMinZoom(j, (float) a(f));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setArrowLayerMaxZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59db55d95b24be06af46a49e26316160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59db55d95b24be06af46a49e26316160");
        } else if (h.a(j)) {
            this.c.setArrowLayerMaxZoom(j, (float) a(f));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void createDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc16357d7c55f35378f7f68864d7a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc16357d7c55f35378f7f68864d7a44");
        } else {
            this.c.createOrUpdateDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void resetDynamicMapFeatures(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a13f2d256b2364129197173a1dc0bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a13f2d256b2364129197173a1dc0bc");
        } else {
            this.c.resetDynamicMapFeatures(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void createDynamicMap(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6f68f504fc5dcec31ce60dff6f0068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6f68f504fc5dcec31ce60dff6f0068");
        } else {
            this.c.createOrUpdateDynamicMap(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setOnDynamicMapObserver(String str, DynamicMapObserver dynamicMapObserver) {
        Object[] objArr = {str, dynamicMapObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c34df0b3cab48626433bc1e3859cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c34df0b3cab48626433bc1e3859cd2");
        } else {
            this.c.setOnDynamicMapLoaded(str, dynamicMapObserver);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void recordDynamicMap(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05cea8c4448fdd1146896dced6b53883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05cea8c4448fdd1146896dced6b53883");
        } else {
            this.c.recordDynamicMap(str, j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void destroyDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3009c99ea279ea2526a444772c0820b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3009c99ea279ea2526a444772c0820b2");
        } else {
            this.c.destroyDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addDynamicMapGeoJSON(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3d95054a7270799fec97b3559b80ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3d95054a7270799fec97b3559b80ae");
        } else {
            this.c.addDynamicMapGeoJSON(str, str2, str3);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void addDynamicMapGeoJSONWithSize(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135ccbd6f125b143ab92e3e0f0c543ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135ccbd6f125b143ab92e3e0f0c543ed");
        } else {
            this.c.addDynamicMapGeoJSONWithSize(str, str2, str3, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63320b8e72952129ddd1177205057db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63320b8e72952129ddd1177205057db7");
        } else {
            this.c.removeDynamicMapGeoJSON(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    @Deprecated
    public final void setDynamicMapFeature(String str, long j, String str2, String str3) {
        Object[] objArr = {str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df98aff575c2ae329344ad79043c8c44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df98aff575c2ae329344ad79043c8c44");
        } else {
            this.c.setDynamicMapFeature(str, j, str2, str3);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setDynamicMapFeature(String str, String str2, long j, String str3, String str4) {
        Object[] objArr = {str, str2, new Long(j), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483cedd2e11e8689b23a2d116a7460e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483cedd2e11e8689b23a2d116a7460e1");
        } else {
            this.c.setDynamicMapFeature(str, str2, j, str3, str4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void resetDynamicMapFeature(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f55c3552b5327735ec720644ea445e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f55c3552b5327735ec720644ea445e8");
        } else {
            this.c.resetDynamicMapFeature(str, str2, j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeDynamicMapFeature(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77811e0e858f4ef6f3c604e69538c1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77811e0e858f4ef6f3c604e69538c1a8");
        } else {
            this.c.removeDynamicMapFeature(str, str2, j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setDynamicMapImages(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d4911b5ec417475cde9a04003e0a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d4911b5ec417475cde9a04003e0a89");
        } else {
            this.c.setDynamicMapImages(str, (String[]) list.toArray(new String[list.size()]));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long createLayer(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ad7f3ff930eb70716acd63fbf5ec21", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ad7f3ff930eb70716acd63fbf5ec21")).longValue() : this.c.createLayer(str, str2);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long copyLayer(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ea0fde2f390843aace6906288ad192", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ea0fde2f390843aace6906288ad192")).longValue();
        }
        if (h.a(j)) {
            return this.c.copyLayer(j, str, str2);
        }
        return 0L;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addLayer(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e82e1719afad711cb9b834a7f771701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e82e1719afad711cb9b834a7f771701");
        } else if (h.a(j)) {
            this.c.addLayer(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setSourceLayer(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05bb9fca4889a104b384a41ecd7a9ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05bb9fca4889a104b384a41ecd7a9ef0");
        } else if (h.a(j)) {
            this.c.setSourceLayer(j, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeAndDestroyLayer(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17af12c3684bfbf1348ac83cfc4583f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17af12c3684bfbf1348ac83cfc4583f9");
        } else if (h.a(j)) {
            this.c.removeAndDestroyLayer(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    @Deprecated
    public final void removeLayer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5d5b8d473f18f14b8d75a6ce4d8cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5d5b8d473f18f14b8d75a6ce4d8cb1");
        } else {
            this.c.removeLayer(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addLayer(CustomLayer customLayer) {
        Object[] objArr = {customLayer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5edeb2f7379099be6cd912aee436efcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5edeb2f7379099be6cd912aee436efcb");
        } else {
            this.c.addLayer(customLayer);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerOrder(long j, float f, g gVar) {
        Object[] objArr = {new Long(j), Float.valueOf(f), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2015b73676d10c0b561c63b0f560c426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2015b73676d10c0b561c63b0f560c426");
        } else if (h.a(j)) {
            this.c.setLayerOrder(j, f, gVar.f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerInteractive(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb30d22a54f524512c76cc333c041b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb30d22a54f524512c76cc333c041b8");
        } else if (h.a(j)) {
            this.c.setLayerInteractive(j, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, boolean z) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023b8aaece6ddafdf5670f6b3e9b260c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023b8aaece6ddafdf5670f6b3e9b260c");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d135b8521673c5c0f2e68c8806f099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d135b8521673c5c0f2e68c8806f099");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, float f) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb48579a71cfef07e2ff54d991f0f297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb48579a71cfef07e2ff54d991f0f297");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, float[] fArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15efdc401c4f0c39a347e50b3cfd663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15efdc401c4f0c39a347e50b3cfd663");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, fArr);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a4660c046c2133abd4cbbedf166324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a4660c046c2133abd4cbbedf166324");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, boolean z, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439d0401e65b10012109a23e318e0852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439d0401e65b10012109a23e318e0852");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, z, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, int i2, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10423109937e7fc115052b3b2def7c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10423109937e7fc115052b3b2def7c2e");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, i2, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, float f, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975bdc6d48585d7f67447d2d949cecae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975bdc6d48585d7f67447d2d949cecae");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, f, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, float[] fArr, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), fArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c659532dc7cfc1d7e21360adfe545a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c659532dc7cfc1d7e21360adfe545a2");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, fArr, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperty(long j, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9693091cfefe0a264a7fc3fc583942db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9693091cfefe0a264a7fc3fc583942db");
        } else if (h.a(j)) {
            this.c.setLayerProperty(j, i, str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerPropertyByDataDriven(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a00f7966e01379757fb47c735a2638d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a00f7966e01379757fb47c735a2638d");
        } else if (h.a(j)) {
            this.c.setLayerPropertyByDataDriven(j, i, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerPropertyByDataDriven(long j, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde3a367bfb93246c0e24756307e423c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde3a367bfb93246c0e24756307e423c");
        } else if (h.a(j)) {
            this.c.setLayerPropertyByDataDriven(j, i, str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerVisibility(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30410058bf33e41bdeac6b63b14c6e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30410058bf33e41bdeac6b63b14c6e6");
        } else if (h.a(j)) {
            this.c.setLayerVisibility(j, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerMaxZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3d85198ac7177d4d627deb298e682f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3d85198ac7177d4d627deb298e682f");
        } else if (h.a(j)) {
            this.c.setLayerMaxZoom(j, (float) a(f));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerMinZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd12dc585094a18624c2bba83c259a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd12dc585094a18624c2bba83c259a90");
        } else if (h.a(j)) {
            this.c.setLayerMinZoom(j, (float) a(f));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setLayerProperties(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224bc4013b457b2e4bfecc58f6427f1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224bc4013b457b2e4bfecc58f6427f1f");
        } else if (h.a(j)) {
            this.c.setLayerProperties(j, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long createGeoJsonSource(String str, boolean z, i iVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffea2a030b1c58f72e7a0f092ae7fc5f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffea2a030b1c58f72e7a0f092ae7fc5f")).longValue() : createGeoJsonSource(str, z, iVar, 0.375d, true);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long createGeoJsonSource(String str, boolean z, i iVar, double d, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iVar, Double.valueOf(d), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56e9c8528bbd9b84438abb5090cccb9", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56e9c8528bbd9b84438abb5090cccb9")).longValue() : this.c.createGeojsonSource(str, z, iVar.d, d, z2);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addGeoJsonSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153059fa5217c6302935319394a53181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153059fa5217c6302935319394a53181");
        } else if (h.a(j)) {
            this.c.addGeojsonSource(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setGeoJsonSourceThreadMode(long j, i iVar) {
        Object[] objArr = {new Long(j), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ca66fda02320234d6d61b9e6c178c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ca66fda02320234d6d61b9e6c178c0");
        } else if (h.a(j)) {
            this.c.setGeojsonSourceThreadMode(j, iVar.d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeAndDestroyGeoJsonSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162e0c16a1efa8c43f92a96163d2f2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162e0c16a1efa8c43f92a96163d2f2fc");
        } else if (h.a(j)) {
            this.c.removeAndDestroyGeojsonSource(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long createImageSource(String str, LatLng[] latLngArr) {
        Object[] objArr = {str, latLngArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec874a1be3165bffd086cf849576604f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec874a1be3165bffd086cf849576604f")).longValue() : this.c.createImageSource(str, a(latLngArr));
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addImageSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf75f7b9684b57cacbeaa830e03b5f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf75f7b9684b57cacbeaa830e03b5f6");
        } else if (h.a(j)) {
            this.c.addImageSource(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeAndDestroyImageSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad615b298c02d88a4555c71fb19745b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad615b298c02d88a4555c71fb19745b");
        } else if (h.a(j)) {
            this.c.removeAndDestroyImageSource(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setImageToImageSource(long j, Bitmap bitmap) {
        Object[] objArr = {new Long(j), bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21f941ab3c8495974e67bfeea081528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21f941ab3c8495974e67bfeea081528");
        } else if (h.a(j)) {
            float density = bitmap.getDensity();
            if (density == 0.0f) {
                density = 160.0f;
            }
            float f = density / 160.0f;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            this.c.setImage(j, bitmap.getWidth(), bitmap.getHeight(), f, allocate.array());
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setCoordinateToImageSource(long j, LatLng[] latLngArr) {
        Object[] objArr = {new Long(j), latLngArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca5de07d3a844be3c9543feeaf58074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca5de07d3a844be3c9543feeaf58074");
        } else if (h.a(j)) {
            this.c.setImageCoord(j, a(latLngArr));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final long createRasterSource(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143ea9b645cd25ccf070c6e35b7228eb", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143ea9b645cd25ccf070c6e35b7228eb")).longValue() : this.c.createRasterSource(str, str2, i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addRasterSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a2fdcff5e160ee18d470bdacfdcfaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a2fdcff5e160ee18d470bdacfdcfaa");
        } else if (h.a(j)) {
            this.c.addRasterSource(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeAndDestroyRasterSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee9ad6f6d480f3514b60ea8d6d6d28e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee9ad6f6d480f3514b60ea8d6d6d28e");
        } else if (h.a(j)) {
            this.c.removeAndDestroyRasterSource(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setFeatureNum(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf2274552300e9011076071a6f5bc6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf2274552300e9011076071a6f5bc6e");
        } else if (h.a(j)) {
            this.c.setFeatureNum(j, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setFeatureGeometry(long j, int i, com.sankuai.meituan.mapsdk.core.render.model.c cVar, LatLng latLng) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), cVar, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82a6d22ae7e83f1d6969a282433a405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82a6d22ae7e83f1d6969a282433a405");
        } else if (h.a(j)) {
            this.c.setFeature(j, i, cVar.i, a(false, latLng));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setFeatureGeometry(long j, int i, com.sankuai.meituan.mapsdk.core.render.model.c cVar, List<LatLng> list) {
        boolean z = false;
        Object[] objArr = {new Long(j), Integer.valueOf(i), cVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574ea0753a8a61f578088ed79cf2e5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574ea0753a8a61f578088ed79cf2e5bb");
        } else if (h.a(j)) {
            this.c.setFeature(j, i, cVar.i, a(list, (cVar == com.sankuai.meituan.mapsdk.core.render.model.c.Polygon || cVar == com.sankuai.meituan.mapsdk.core.render.model.c.MultiPolygon) ? true : true));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setFeatureMultiGeometry(long j, int i, com.sankuai.meituan.mapsdk.core.render.model.c cVar, List<List<LatLng>> list) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), cVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad60b82c4edc27d5c015d4298f73c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad60b82c4edc27d5c015d4298f73c87");
        } else if (h.a(j)) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (List<LatLng> list2 : list) {
                double[] a2 = a(list2, cVar == com.sankuai.meituan.mapsdk.core.render.model.c.Polygon || cVar == com.sankuai.meituan.mapsdk.core.render.model.c.MultiPolygon);
                i2 += a2.length;
                arrayList.add(a2);
            }
            double[] dArr = new double[i2];
            int[] iArr = new int[arrayList.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                double[] dArr2 = (double[]) arrayList.get(i4);
                if (dArr2 != null) {
                    iArr[i4] = i3;
                    System.arraycopy(dArr2, 0, dArr, i3, dArr2.length);
                    i3 += dArr2.length;
                }
            }
            this.c.setFeature(j, i, cVar.i, dArr, iArr);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeFeature(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26aca48788453eeec8c640809654dde6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26aca48788453eeec8c640809654dde6");
        } else if (h.a(j)) {
            this.c.removeFeature(j, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addFeatureProperty(long j, int i, String str, boolean z) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2ee6f9a6a64484014673748548e7d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2ee6f9a6a64484014673748548e7d7");
        } else if (h.a(j)) {
            this.c.addFeatureProperty(j, i, str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addFeatureProperty(long j, int i, String str, double d) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c1f059db53e93948f1618597cc16e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c1f059db53e93948f1618597cc16e3");
        } else if (h.a(j)) {
            this.c.addFeatureProperty(j, i, str, d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addFeatureProperty(long j, int i, String str, double[] dArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49560a0019ef10ed81643fbb9c9d97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49560a0019ef10ed81643fbb9c9d97e");
        } else if (h.a(j)) {
            this.c.addFeatureProperty(j, i, str, dArr);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addFeatureProperty(long j, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7ac9ae08a9e4e0a6c62fe914e05c782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7ac9ae08a9e4e0a6c62fe914e05c782");
        } else if (h.a(j)) {
            this.c.addFeatureProperty(j, i, str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void refImages(long j, List<String> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322c98b5af4e805293c9aab0849c01ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322c98b5af4e805293c9aab0849c01ac");
        } else if (h.a(j)) {
            this.c.refImages(j, (String[]) list.toArray(new String[list.size()]));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setAutoMergePropertyKey(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe7e47b72d83dca5543fadf5f7e6e47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe7e47b72d83dca5543fadf5f7e6e47");
        } else if (h.a(j)) {
            this.c.setAutoMergePropertyKey(j, str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final CameraPosition h() {
        LatLng center;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ed85d1149bb8c50bfc2328eb3ce30e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ed85d1149bb8c50bfc2328eb3ce30e");
        }
        if (this.d != null) {
            center = getLatLngByScreenCoordinate(this.d);
        } else {
            center = getCenter();
        }
        return new CameraPosition(center, (float) getZoom(), (float) getPitch(), (float) getBearing());
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInUIThread
    public final LatLng getCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42102cfe7f1fc0d32be3d9cc4ebe7c2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42102cfe7f1fc0d32be3d9cc4ebe7c2d");
        }
        if (this.d != null) {
            return getLatLngByScreenCoordinate(this.d);
        }
        return a(this.c.getCenter());
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double getZoom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24d5c7dde8cf5bfc7eee941ce8c8442", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24d5c7dde8cf5bfc7eee941ce8c8442")).doubleValue() : this.c.fromRenderZoom(this.c.getZoom());
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double getBearing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a60f5a446567a73907372782caf32f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a60f5a446567a73907372782caf32f")).doubleValue();
        }
        double bearing = this.c.getBearing();
        Object[] objArr2 = {Double.valueOf(bearing)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5dfa5b11d7d453666f2c5223818dfb7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5dfa5b11d7d453666f2c5223818dfb7")).doubleValue();
        }
        if (bearing < -180.0d) {
            return f(bearing + 360.0d);
        }
        if (bearing > 180.0d) {
            return f(bearing - 360.0d);
        }
        return bearing <= 0.0d ? -bearing : 360.0d - bearing;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double getPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516bcc9126037b41cd956202dc09862c", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516bcc9126037b41cd956202dc09862c")).doubleValue() : this.c.getPitch();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double getMaxPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc225b07f64ec608db90c9a4f9cbddd8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc225b07f64ec608db90c9a4f9cbddd8")).doubleValue() : this.c.getMaxPitch();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final double getMinPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0541c956e6d9187f58ffe9464a5238b4", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0541c956e6d9187f58ffe9464a5238b4")).doubleValue() : this.c.getMinPitch();
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(CameraPosition cameraPosition, int i) {
        Object[] objArr = {cameraPosition, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feadaecc42aeae21c9693686aaed747d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feadaecc42aeae21c9693686aaed747d");
        } else {
            setCameraPosition(cameraPosition, null, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setCameraPosition(CameraPosition cameraPosition, float[] fArr, int i) {
        Object[] objArr = {cameraPosition, fArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1320ecb9ff81a9ab5c8c41f323081df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1320ecb9ff81a9ab5c8c41f323081df1");
        } else {
            this.c.setCameraOptions(a(cameraPosition, fArr), i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void cancelAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44ee856588b267e9f8a11d19cc2114b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44ee856588b267e9f8a11d19cc2114b");
        } else {
            this.c.cancelAnimation();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInUIThread
    public final CameraPosition cameraForLatLngBounds(LatLngBounds latLngBounds, int[] iArr, boolean z) {
        double[] dArr;
        boolean z2;
        int i;
        double[] cameraForLatLngBounds;
        Object[] objArr = {latLngBounds, iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4731038b6593da7b652fffd42a1383", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4731038b6593da7b652fffd42a1383");
        }
        double[] dArr2 = new double[4];
        if (iArr == null) {
            for (int i2 = 0; i2 < 4; i2++) {
                dArr2[i2] = 0.0d;
            }
        } else if (iArr.length == 4) {
            dArr2[0] = d.a(iArr[1]);
            dArr2[1] = d.a(iArr[0]);
            dArr2[2] = d.a(iArr[3]);
            dArr2[3] = d.a(iArr[2]);
        } else {
            for (int i3 = 0; i3 < 4; i3++) {
                if (iArr.length > 0) {
                    dArr2[i3] = d.a(iArr[0]);
                }
            }
        }
        double pitch = z ? 0.0d : getPitch();
        double g = z ? g(0.0d) : this.c.getBearing();
        NativeMap nativeMap = this.c;
        Object[] objArr2 = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        double d = pitch;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42e86fd6d3c5d660074c9aa7aab6fcce", RobustBitConfig.DEFAULT_VALUE)) {
            dArr = (double[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42e86fd6d3c5d660074c9aa7aab6fcce");
        } else {
            dArr = new double[4];
            Object[] objArr3 = {latLngBounds};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "add75ef9a744f0da8bebecb80ad33694", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "add75ef9a744f0da8bebecb80ad33694")).booleanValue();
            } else {
                z2 = latLngBounds != null && h.a(latLngBounds.southwest) && h.a(latLngBounds.northeast);
            }
            if (z2) {
                dArr[0] = latLngBounds.southwest.latitude;
                dArr[1] = latLngBounds.southwest.longitude;
                dArr[2] = latLngBounds.northeast.latitude;
                i = 3;
                dArr[3] = latLngBounds.northeast.longitude;
                cameraForLatLngBounds = nativeMap.cameraForLatLngBounds(dArr, dArr2, g);
                if (cameraForLatLngBounds == null && cameraForLatLngBounds.length == i) {
                    return new CameraPosition(new LatLng(cameraForLatLngBounds[0], cameraForLatLngBounds[1]), (float) f(cameraForLatLngBounds[2]), (float) d, (float) g);
                }
            }
        }
        i = 3;
        cameraForLatLngBounds = nativeMap.cameraForLatLngBounds(dArr, dArr2, g);
        return cameraForLatLngBounds == null ? null : null;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @Nullable
    @RunInUIThread
    public final LatLngBounds latLngBoundsForCamera(CameraPosition cameraPosition) {
        boolean z;
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dfbc4bb5dccacce626e5e8d4df72413", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dfbc4bb5dccacce626e5e8d4df72413");
        }
        Object[] objArr2 = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4ed79fe4f8fb1bb011c0aa62fe309260", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4ed79fe4f8fb1bb011c0aa62fe309260")).booleanValue();
        } else {
            z = (cameraPosition == null || !h.a(cameraPosition.target) || Float.isNaN(cameraPosition.zoom) || Float.isInfinite(cameraPosition.zoom) || Float.isNaN(cameraPosition.zoom) || Float.isInfinite(cameraPosition.zoom) || Float.isNaN(cameraPosition.zoom) || Float.isInfinite(cameraPosition.zoom)) ? false : true;
        }
        if (z) {
            double[] latLngBoundsForCamera = this.c.latLngBoundsForCamera(a(cameraPosition, (float[]) null));
            Object[] objArr3 = {latLngBoundsForCamera};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c691cd08e3bbc245cbb4fd119fb5aa51", RobustBitConfig.DEFAULT_VALUE)) {
                return (LatLngBounds) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c691cd08e3bbc245cbb4fd119fb5aa51");
            }
            if (latLngBoundsForCamera == null || latLngBoundsForCamera.length != 4) {
                return null;
            }
            return new LatLngBounds(new LatLng(latLngBoundsForCamera[0], latLngBoundsForCamera[1]), new LatLng(latLngBoundsForCamera[2], latLngBoundsForCamera[3]));
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void d(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2587b3b59352e778b13e98a5daff9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2587b3b59352e778b13e98a5daff9d");
        } else {
            setCameraOptionsRange(new double[]{a(d)}, com.sankuai.meituan.mapsdk.core.render.model.a.MaxZoom);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void e(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb4e58d673ee94c902b087a22e909b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb4e58d673ee94c902b087a22e909b8");
        } else {
            setCameraOptionsRange(new double[]{a(d)}, com.sankuai.meituan.mapsdk.core.render.model.a.MinZoom);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(@Nullable LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad58690d97a6d31191aa6b0cb46c9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad58690d97a6d31191aa6b0cb46c9d2");
        } else if (latLngBounds != null) {
            setCameraOptionsRange(new double[]{latLngBounds.southwest.latitude, latLngBounds.southwest.longitude, latLngBounds.northeast.latitude, latLngBounds.northeast.longitude}, com.sankuai.meituan.mapsdk.core.render.model.a.CenterBounds);
        } else {
            setCameraOptionsRange(null, com.sankuai.meituan.mapsdk.core.render.model.a.CenterBounds);
        }
    }

    @RunInUIThread
    private void setCameraOptionsRange(double[] dArr, com.sankuai.meituan.mapsdk.core.render.model.a aVar) {
        Object[] objArr = {dArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2548c000ef58d8f031ef386473284b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2548c000ef58d8f031ef386473284b");
            return;
        }
        this.c.setCameraOptionsRange(dArr, aVar.g);
        c.b("RenderEngine.setCameraOptionsRange: " + Arrays.toString(dArr) + " flag: " + aVar);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void moveBy(PointF pointF, int i) {
        Object[] objArr = {pointF, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908f3e57b1c17f9ce6677e2bdce4f5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908f3e57b1c17f9ce6677e2bdce4f5ab");
        } else {
            this.c.moveBy(d.a(pointF.x), d.a(pointF.y), i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setCameraEyeParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5a8ddea53ab0e2129e445d5fd953c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5a8ddea53ab0e2129e445d5fd953c9");
        } else {
            this.c.setCameraEyeParams(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addImage(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6657ee7c793f60bc3ee909a52766e4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6657ee7c793f60bc3ee909a52766e4b0");
            return;
        }
        float a2 = d.a();
        float density = bitmap.getDensity();
        if (density != 0.0f) {
            a2 = density / 160.0f;
        }
        float f = a2;
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        this.c.addImage(str, bitmap.getWidth(), bitmap.getHeight(), f, allocate.array());
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99499deb4f4e8cb692e51087fe5db3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99499deb4f4e8cb692e51087fe5db3fc");
        } else {
            this.c.removeImage(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setIndoorQueryBox(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0eff394521b34b7c33fa28a8d61f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0eff394521b34b7c33fa28a8d61f73");
        } else {
            this.c.setIndoorQueryBox(f, f2, f3, f4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setIndoor(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8862545212a56bd24f522c39222f7b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8862545212a56bd24f522c39222f7b50");
        } else {
            this.c.setIndoor(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setIndoorMask(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f678452a44426718004818f396b6aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f678452a44426718004818f396b6aba");
        } else {
            this.c.setIndoorMask(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setIndoorMaskColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0a84ea560cd57752be6e30444065dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0a84ea560cd57752be6e30444065dd");
        } else {
            this.c.setIndoorMaskColor(f(i));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void setIndoorFloor(long j, String str, int i) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea3c168a4ac0b98bbbd72c8f62aef3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea3c168a4ac0b98bbbd72c8f62aef3e");
        } else {
            this.c.setIndoorFloor(j, str, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void addHighlightBuilding(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e8d1ff93e6694399e63881aa25d322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e8d1ff93e6694399e63881aa25d322");
        } else {
            this.c.addHighlightBuilding(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeHighlightBuilding(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53043280901ef875481dbb74dae900a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53043280901ef875481dbb74dae900a6");
        } else {
            this.c.removeHighlightBuilding(j);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeHighlightBuilding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d34dba2a23b9fbf269b4b74859216f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d34dba2a23b9fbf269b4b74859216f8");
        } else {
            this.c.removeHighlightBuilding();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    public final void a(IndoorBuildingsObserver indoorBuildingsObserver) {
        Object[] objArr = {indoorBuildingsObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d238ae5deda92d20f70fbc29fdbd37b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d238ae5deda92d20f70fbc29fdbd37b");
        } else {
            this.c.setOnIndoorBuildings(indoorBuildingsObserver);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final int createOrSetScreenImage(int i, float[] fArr, String str, float[] fArr2, float[] fArr3, float[] fArr4) {
        Object[] objArr = {Integer.valueOf(i), fArr, str, fArr2, fArr3, fArr4};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee29666fd182a6b7dd6821ede8939c1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee29666fd182a6b7dd6821ede8939c1")).intValue() : this.c.createOrSetScreenImage(i, fArr, str, fArr2, fArr3, fArr4);
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final void removeScreenImage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679d3770a30b1859028bec2b782dbc5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679d3770a30b1859028bec2b782dbc5b");
        } else {
            this.c.removeScreenImage(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.render.a
    @RunInUIThread
    public final int queryScreenUi(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44146c88fb88a45ffa2db35307ffd6d0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44146c88fb88a45ffa2db35307ffd6d0")).intValue() : this.c.queryScreenUi(d.a(f), d.a(f2));
    }

    private static double[] a(LatLng... latLngArr) {
        Object[] objArr = {latLngArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "265233f765e7b9a2a60f2260896a9638", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "265233f765e7b9a2a60f2260896a9638") : a(true, latLngArr);
    }

    private static double[] a(boolean z, LatLng... latLngArr) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), latLngArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f522007979c84803ab1cdf0f1077292", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f522007979c84803ab1cdf0f1077292");
        }
        if (latLngArr.length == 0) {
            return new double[0];
        }
        double[] dArr = new double[latLngArr.length * 2];
        for (int i = 0; i < latLngArr.length; i++) {
            if (h.a(latLngArr[i])) {
                int i2 = i * 2;
                dArr[i2] = z ? latLngArr[i].latitude : latLngArr[i].longitude;
                dArr[i2 + 1] = z ? latLngArr[i].longitude : latLngArr[i].latitude;
            }
        }
        return dArr;
    }

    private static double[] a(@NonNull List<LatLng> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2427f55e51cabc010de0c00f4241f89", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2427f55e51cabc010de0c00f4241f89") : a(list, z, false);
    }

    private static double[] a(@NonNull List<LatLng> list, boolean z, boolean z2) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afae6a991e605d6698ce0044d067761b", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afae6a991e605d6698ce0044d067761b");
        }
        int size = (z ? list.size() + 1 : list.size()) * 2;
        double[] dArr = new double[size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i * 2;
            dArr[i2] = z2 ? list.get(i).latitude : list.get(i).longitude;
            dArr[i2 + 1] = z2 ? list.get(i).longitude : list.get(i).latitude;
        }
        if (z && size > 2) {
            dArr[size - 2] = z2 ? list.get(0).latitude : list.get(0).longitude;
            dArr[size - 1] = z2 ? list.get(0).longitude : list.get(0).latitude;
        }
        return dArr;
    }

    @Nullable
    private LatLng a(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af0813ad6d16008ad14ee1d0823b258b", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af0813ad6d16008ad14ee1d0823b258b");
        }
        if (dArr == null || dArr.length != 2) {
            return null;
        }
        return new LatLng(dArr[0], dArr[1]);
    }

    private double[] a(CameraPosition cameraPosition, float[] fArr) {
        Object[] objArr = {cameraPosition, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60bc9b70842c1443cbe06858829917a", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60bc9b70842c1443cbe06858829917a");
        }
        if (cameraPosition != null) {
            double a2 = a(cameraPosition.zoom >= 0.0f ? cameraPosition.zoom : getZoom());
            double[] dArr = new double[11];
            dArr[0] = cameraPosition.target == null ? Double.NaN : cameraPosition.target.latitude;
            dArr[1] = cameraPosition.target == null ? Double.NaN : cameraPosition.target.longitude;
            dArr[2] = fArr == null ? Double.NaN : d.a(fArr[1]);
            dArr[3] = fArr == null ? Double.NaN : d.a(fArr[0]);
            dArr[4] = fArr == null ? Double.NaN : d.a(fArr[3]);
            dArr[5] = fArr == null ? Double.NaN : d.a(fArr[2]);
            dArr[6] = this.d != null ? d.a(this.d.x) : Double.NaN;
            dArr[7] = this.d != null ? d.a(this.d.y) : Double.NaN;
            dArr[8] = Float.isNaN(cameraPosition.zoom) ? Double.NaN : a2;
            dArr[9] = Float.isNaN(cameraPosition.bearing) ? Double.NaN : g(cameraPosition.bearing);
            dArr[10] = Float.isNaN(cameraPosition.tilt) ? Double.NaN : b(cameraPosition.tilt, a2);
            return dArr;
        }
        return new double[11];
    }

    private double b(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd5edca320acf9797e7db1739cd8d8d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd5edca320acf9797e7db1739cd8d8d8")).doubleValue();
        }
        double d3 = 25.0d;
        if (d2 >= 19.0d) {
            d3 = 75.0d;
        } else if (d2 >= 18.0d) {
            d3 = 70.0d;
        } else if (d2 >= 16.0d) {
            d3 = 65.0d;
        } else if (d2 >= 15.0d) {
            d3 = 55.0d;
        } else if (d2 >= 13.0d) {
            d3 = 45.0d;
        } else if (d2 >= 11.0d) {
            d3 = 35.0d;
        }
        return Math.max(getMinPitch(), Math.min(Math.min(d, d3), getMaxPitch()));
    }

    public static float[] f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e712229285ba57af072324133d53a7a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e712229285ba57af072324133d53a7a8");
        }
        float alpha = Color.alpha(i) / 255.0f;
        return new float[]{(Color.red(i) / 255.0f) * alpha, (Color.green(i) / 255.0f) * alpha, (Color.blue(i) / 255.0f) * alpha, alpha};
    }

    public static String g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa429d93ab2efbc0aa5f562b7ba40cd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa429d93ab2efbc0aa5f562b7ba40cd9");
        }
        Color.alpha(i);
        return String.format(Locale.getDefault(), "rgba(%d, %d, %d, %f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Float.valueOf(Color.alpha(i) / 255.0f));
    }

    @Override // com.meituan.mtmap.rendersdk.QueryObserver
    public final void onQuery(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9832870495f84785a224ed49d0a855e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9832870495f84785a224ed49d0a855e6");
            return;
        }
        for (int i = 0; i < this.g.size(); i++) {
            this.g.get(i).onQuery(j, j2);
        }
    }
}
