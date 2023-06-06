package com.meituan.mtmap.rendersdk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.mtmap.rendersdk.style.layer.CustomLayer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NativeMap {
    private static final String CACHE_DIR = "md_map.db";
    public static final int CLASS_2008 = 2008;
    public static final int CLASS_2009 = 2009;
    public static final int CLASS_2010 = 2010;
    public static final int CLASS_2011 = 2011;
    public static final int CLASS_2012 = 2012;
    public static final int CLASS_2013 = 2013;
    public static final int CLASS_2014 = 2014;
    public static final int CLASS_2015 = 2015;
    public static final int CLASS_2016 = 2016;
    public static final int CLASS_UNKNOWN = -1;
    public static final int DEVICEINFO_UNKNOWN = -1;
    private static final long MB = 1048576;
    private static final int MHZ_IN_KHZ = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile Integer mYearCategory;
    private PointF centerPointF;
    private boolean destroyed;
    private IZoomUtil iZoomUtil;
    private DynamicMapObserver mDynamicMapObserver;
    private IndoorBuildingsObserver mIndoorBuildingsObserver;
    private MapObserver mObserver;
    private double[] mPadding;
    private float mPixelRatio;
    private QueryObserver mQueryObserver;
    private long nativePtr;
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.meituan.mtmap.rendersdk.NativeMap.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5073e9247a1d800bff635fc72e59640", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5073e9247a1d800bff635fc72e59640")).booleanValue();
            }
            try {
                String name = file.getName();
                if (name.startsWith(Constants.CPU)) {
                    for (int i = 3; i < name.length(); i++) {
                        if (!Character.isDigit(name.charAt(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Throwable th) {
                SdkExceptionHandler.handleException(th);
            }
            return false;
        }
    };
    private static final int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors();
    public static String GIT_REVISION_SHORT = "";
    public static String SDK_EVENTS_USER_AGENT = "";
    public static String SDK_VERSION_STRING = "";

    private static native void nativeAddBaseUrl(String str, String str2);

    private native void nativeAddCustomLayer(long j, String str);

    private native void nativeAddDynamicMapGeoJSON(String str, String str2, String str3);

    private native void nativeAddDynamicMapGeoJSONWithSize(String str, String str2, String str3, int i);

    private native void nativeAddFeatureBooleanProperty(long j, int i, String str, boolean z);

    private native void nativeAddFeatureDoubleArrayProperty(long j, int i, String str, double[] dArr);

    private native void nativeAddFeatureDoubleProperty(long j, int i, String str, double d);

    private native void nativeAddFeatureStringProperty(long j, int i, String str, String str2);

    private native void nativeAddGeojsonSource(long j);

    private native void nativeAddHighlightBuilding(long j);

    private native void nativeAddImage2(String str, int i, int i2, float f, byte[] bArr);

    private native void nativeAddImageSource(long j);

    private native void nativeAddLayer2(long j);

    private native void nativeAddRasterSource(long j);

    private static native void nativeAddStyleUrl(String str, String str2);

    private static native void nativeAddUrlParameters(String str, String str2);

    private native void nativeApplyColorStyle(String str, boolean z);

    private native void nativeApplyMapStyle(String str, boolean z);

    private native void nativeApplyMapStyle2(String str);

    private native void nativeApplyMapStyleFromBuffer(String str);

    private native double[] nativeCameraForLatLngBounds(double[] dArr, double[] dArr2, double d);

    private native void nativeCancelAnimation();

    private static native boolean nativeCheckPolygonContainsPoint(double[] dArr, double[] dArr2);

    private static native boolean nativeCheckVersion(String str);

    private static native boolean nativeClearOfflineData(String str);

    private static native boolean nativeClearPartOfflineData(String str, long j);

    private native long nativeCopyLayer(long j, String str, String str2);

    private native long nativeCreateAndAddArrow(float f, int i);

    private native long nativeCreateGeojsonSource(String str, boolean z, int i, double d, boolean z2);

    private native long nativeCreateImageSource(String str, double[] dArr);

    private native long nativeCreateLayer(String str, String str2);

    private native int nativeCreateOrSetScreenImage(int i, float[] fArr, String str, float[] fArr2, float[] fArr3, float[] fArr4);

    private native void nativeCreateOrUpdateDynamicMap(String str);

    private native void nativeCreateOrUpdateOfflineDynamicMap(String str, String str2);

    private native long nativeCreateRasterSource(String str, String str2, int i);

    private native void nativeCreateRoadCrossing(String str);

    private native void nativeDestroy();

    private native void nativeDestroyDynamicMap(String str);

    private native void nativeDestroyFeatures(long j);

    private native void nativeDestroyRoadCrossing();

    private native void nativeDisableWeather();

    private native void nativeEnableEventListener();

    private native String nativeGenImageID();

    private static native String nativeGetBaseStyleName(int i);

    private static native int nativeGetBaseStyleNum();

    private static native String nativeGetBaseStyleUrl(String str);

    private native double nativeGetBearing2();

    private native double[] nativeGetCameraEye();

    private native double[] nativeGetCenter();

    private static native String nativeGetDefaultStylesName();

    private native boolean nativeGetFeatureBooleanProperty(long j, int i, String str);

    private native double nativeGetFeatureDoubleProperty(long j, int i, String str);

    private native long nativeGetFeatureLongProperty(long j, int i, String str);

    private native int nativeGetFeatureNum(long j);

    private native int nativeGetFeaturePropertyType(long j, int i, String str);

    private native String nativeGetFeatureStringProperty(long j, int i, String str);

    private native int nativeGetFeatureType(long j, int i);

    private native String nativeGetGeojsonSourceID(long j);

    private static native double nativeGetGlobalMaxPitch();

    private static native double nativeGetGlobalMinPitch();

    private static native double[] nativeGetHexagonBoundsByLatLng(double d, double d2, double d3, double d4, double d5);

    private static native int nativeGetHostType();

    private native double[] nativeGetLatLngByScrnCoord(double[] dArr);

    private static native float[] nativeGetMatrix(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    private native double nativeGetMaxPitch();

    private static native double nativeGetMercatorRatio(double d);

    private static native double nativeGetMetersPerPixelAtLatitude2(double d, double d2);

    private native double nativeGetMinPitch();

    private native double nativeGetPitch2();

    private static native double nativeGetProjectedMetersPerPixel2(double d);

    private native long nativeGetRenderFrameNum();

    private native double[] nativeGetScrnCoordByLatLng(double[] dArr);

    private native double[] nativeGetScrnCoordByLatLngAndCamera(double[] dArr, double[] dArr2);

    private native int nativeGetSkyHeight();

    private static native double nativeGetSphericalDistance(double[] dArr);

    private static native String nativeGetVersion();

    private native double nativeGetZoom2();

    private native void nativeInitialize(NativeMap nativeMap, float f, String str, int i, int[] iArr, String str2, boolean z, int i2, int i3, byte[] bArr, String str3);

    private native double[] nativeLatLngBoundsForCamera(double[] dArr);

    private static native double[] nativeLatLngForProjectedMeters(double[] dArr);

    private native void nativeMoveBy2(double d, double d2, int i);

    private native String nativeOutputFuncCallRecordList();

    private static native double[] nativeProject(double[] dArr, double d);

    private static native double[] nativeProjectedMetersForLatLng(double[] dArr);

    private native long nativeQueryRenderedFeaturesByOrder(double d, double d2, double d3, double d4);

    private native long nativeQueryRenderedFeaturesOfBox(double[] dArr);

    private native long nativeQueryRenderedFeaturesOfPoint(double[] dArr);

    private native long nativeQueryRenderedFeaturesOfRegion(double[] dArr);

    private native int nativeQueryScreenUi(double d, double d2);

    private native byte[] nativeReadStillImage(int i, int i2, int i3, int i4);

    private native void nativeRecordDynamicMap(String str, long j);

    private native void nativeRefImages(long j, String[] strArr);

    private native void nativeRefreshFrame(boolean z);

    private native void nativeReloadBaseSource2();

    private native void nativeReloadSource(String str);

    private native void nativeRemoveAndDestroyArrow(long j);

    private native void nativeRemoveAndDestroyGeojsonSource(long j);

    private native void nativeRemoveAndDestroyImageSource(long j);

    private native void nativeRemoveAndDestroyLayer(long j);

    private native void nativeRemoveAndDestroyRasterSource(long j);

    private native void nativeRemoveDynamicMapFeature(String str, String str2, long j);

    private native void nativeRemoveDynamicMapGeoJSON(String str, String str2);

    private native void nativeRemoveDynamicMapGeoJSONs(String str);

    private native void nativeRemoveFeature(long j, int i);

    private native void nativeRemoveHighlightBuilding(long j);

    private native void nativeRemoveHighlightBuildings();

    private native void nativeRemoveImage2(String str);

    private native void nativeRemoveLayer(String str);

    private native void nativeRemoveScreenImage(int i);

    private static native void nativeRemoveStyleUrl(String str);

    private native void nativeRender2();

    private native void nativeRender3(boolean z);

    private native void nativeRequireUpdate2();

    private native void nativeResetDynamicMapFeature(String str, long j);

    private native void nativeResetDynamicMapFeatureOfGeojson(String str, String str2, long j);

    private native void nativeResetDynamicMapFeatures(String str);

    private native void nativeSetArrowFeature(long j, int i, double[] dArr);

    private native void nativeSetArrowFeatureNum(long j, int i);

    private native void nativeSetArrowLayerBooleanProperty(long j, int i, boolean z);

    private native void nativeSetArrowLayerFloatArrayProperty(long j, int i, float[] fArr);

    private native void nativeSetArrowLayerFloatProperty(long j, int i, float f);

    private native void nativeSetArrowLayerIntProperty(long j, int i, int i2);

    private native void nativeSetArrowLayerMaxZoom(long j, float f, String str);

    private native void nativeSetArrowLayerMinZoom(long j, float f, String str);

    private native void nativeSetArrowLayerOrder(long j, float f, int i, String str);

    private native void nativeSetArrowLayerStringProperty(long j, int i, String str);

    private native void nativeSetArrowLayerVisibility(long j, boolean z, String str);

    private native void nativeSetArrowWidth(long j, float f);

    private native void nativeSetAutoMergePropertyKey(long j, String str);

    private native void nativeSetCameraEyeParams(String str);

    private native void nativeSetCameraOptionGroup(double[] dArr);

    private native void nativeSetCameraOptions(double[] dArr, int i, double[] dArr2);

    private native void nativeSetCameraOptionsRange(double[] dArr, int i);

    private native void nativeSetDebugTileBorder2(boolean z, String str);

    private native void nativeSetDebugTileState(boolean z);

    private native void nativeSetDynamicMapFeature(String str, long j, String str2, String str3);

    private native void nativeSetDynamicMapFeatureOfGeojson(String str, String str2, long j, String str3, String str4);

    private native void nativeSetDynamicMapGeoJSON2(String str, String str2);

    private native void nativeSetDynamicMapImages(String str, String[] strArr);

    private native void nativeSetFeature(long j, int i, int i2, double[] dArr, int[] iArr);

    private native void nativeSetFeatureNum(long j, int i);

    private native void nativeSetGeojsonSourceThreadMode(long j, int i);

    private native void nativeSetGeojsonSourceUrl(long j, String str);

    private static native void nativeSetHostType(int i);

    private native void nativeSetImage(long j, int i, int i2, float f, byte[] bArr);

    private native void nativeSetImageCoord(long j, double[] dArr);

    private native void nativeSetIndoor(boolean z);

    private native void nativeSetIndoorFloor(long j, String str, int i);

    private native void nativeSetIndoorMask(boolean z);

    private native void nativeSetIndoorMaskColor(float[] fArr);

    private native void nativeSetIndoorQueryBox(float f, float f2, float f3, float f4);

    private native void nativeSetLayerBooleanProperty(long j, int i, boolean z, String str);

    private native void nativeSetLayerFloatArrayProperty(long j, int i, float[] fArr, String str);

    private native void nativeSetLayerFloatProperty(long j, int i, float f, String str);

    private native void nativeSetLayerIntProperty(long j, int i, int i2, String str);

    private native void nativeSetLayerInteractive(long j, boolean z);

    private native void nativeSetLayerMaxZoom(long j, float f, String str);

    private native void nativeSetLayerMinZoom(long j, float f, String str);

    private native void nativeSetLayerOrder(long j, float f, int i, String str);

    private native void nativeSetLayerProperties(long j, String str);

    private native void nativeSetLayerPropertyByDataDriven(long j, int i, String str, String str2);

    private native void nativeSetLayerStringProperty(long j, int i, String str, String str2);

    private native void nativeSetLayerVisibility(long j, boolean z, String str);

    private native void nativeSetMapSize(float f, float f2);

    private native void nativeSetMaxFps2(int i);

    private native void nativeSetOnDynamicMapLoaded(String str);

    private native void nativeSetOnIndoorBuildings(boolean z);

    private native void nativeSetPause(boolean z);

    private native void nativeSetPause2(boolean z);

    private native void nativeSetPreloadParentTileLevel(int i);

    private native void nativeSetRasterForeign(boolean z);

    private native void nativeSetRoadBackgroundColor(float[] fArr);

    private native void nativeSetRoadBlock(boolean z);

    private native void nativeSetRoadCasingColor(float[] fArr);

    private native void nativeSetRoadCrossingID(String str);

    private native void nativeSetRoadSource(String str);

    private native void nativeSetRoadTraffic(boolean z);

    private native void nativeSetSourceLayer(long j, String str);

    private native void nativeSetTileCacheRatio(String str, float f);

    private native void nativeSetTileCacheType(String str, int i);

    private native void nativeSetTrafficColor2(int i, float[] fArr);

    private native void nativeSetTrafficLineSource(boolean z);

    private native void nativeSetTrafficStyle(String str);

    private native void nativeSetWeatherAutoUpdate(boolean z);

    private native void nativeSetWeatherIntensity(float f);

    private native void nativeSetWeatherType(int i);

    private native void nativeShow3dBuilding(boolean z);

    private native void nativeShowRoadStyle(boolean z);

    private native void nativeShowTrafficLight(boolean z);

    private static native void nativeSoLoadedTest();

    private static native double[] nativeUnproject(double[] dArr, double d);

    private native void nativeUnsetLayerProperties(long j, String str);

    private native void nativeUnsetLayerProperty(long j, int i, String str);

    @Deprecated
    public void setCenterPointF(PointF pointF) {
        this.centerPointF = pointF;
    }

    public static int getNumberOfCPUCores() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4cccfaffc2feffb5befbcb68f6ccdfd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4cccfaffc2feffb5befbcb68f6ccdfd")).intValue();
        }
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromCPUFileList();
            }
            return coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return -1;
        }
    }

    private static int getCoresFromFileInfo(String str) {
        FileInputStream fileInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9fe38e8ddce5d404bd57be9e8a585b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9fe38e8ddce5d404bd57be9e8a585b7")).intValue();
        }
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
        } catch (IOException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            int coresFromFileString = getCoresFromFileString(readLine);
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return coresFromFileString;
        } catch (IOException unused3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused4) {
                }
            }
            return -1;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static int getCoresFromFileString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d48f826aeedf0459570fc395ceab2329", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d48f826aeedf0459570fc395ceab2329")).intValue();
        }
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getCoresFromCPUFileList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcab7eec4a207bbba8e241c9f195c308", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcab7eec4a207bbba8e241c9f195c308")).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0;
        }
    }

    public static int getCPUMaxFreqKHz() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ece56a98946742cc8a605fc9f3e0c2f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ece56a98946742cc8a605fc9f3e0c2f5")).intValue();
        }
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                try {
                    File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                    if (file.exists() && file.canRead()) {
                        byte[] bArr = new byte[128];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            fileInputStream.read(bArr);
                            int i4 = 0;
                            while (Character.isDigit(bArr[i4]) && i4 < 128) {
                                i4++;
                            }
                            Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4)));
                            if (valueOf.intValue() > i2) {
                                i2 = valueOf.intValue();
                            }
                        } catch (NumberFormatException unused) {
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                        fileInputStream.close();
                    }
                } catch (IOException unused2) {
                    return -1;
                }
            } catch (Throwable th2) {
                th = th2;
                i = i2;
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (parseFileForValue <= i2) {
                    parseFileForValue = i2;
                }
                try {
                    return parseFileForValue;
                } catch (Throwable th3) {
                    th = th3;
                    i = parseFileForValue;
                    SdkExceptionHandler.handleException(th);
                    return i;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i2;
    }

    @TargetApi(16)
    public static long getTotalMemory(Context context) {
        FileInputStream fileInputStream;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55a53c9ec5c4d98e027c3e7b7c75689d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55a53c9ec5c4d98e027c3e7b7c75689d")).longValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
                return memoryInfo.totalMem;
            }
            long j = -1;
            try {
                fileInputStream = new FileInputStream("/proc/meminfo");
            } catch (IOException unused) {
            }
            try {
                j = parseFileForValue("MemTotal", fileInputStream) * 1024;
                fileInputStream.close();
                return j;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            SdkExceptionHandler.handleException(th2);
            return 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int parseFileForValue(java.lang.String r12, java.io.FileInputStream r13) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mtmap.rendersdk.NativeMap.changeQuickRedirect
            java.lang.String r11 = "38e306d294afd1bb40451331f2348cb3"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L26:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            int r13 = r13.read(r0)     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
        L2e:
            if (r8 >= r13) goto L60
            r1 = r0[r8]     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
            r2 = 10
            if (r1 == r2) goto L38
            if (r8 != 0) goto L5a
        L38:
            r1 = r0[r8]     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
            if (r1 != r2) goto L3e
            int r8 = r8 + 1
        L3e:
            r1 = r8
        L3f:
            if (r1 >= r13) goto L5a
            int r2 = r1 - r8
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
            char r4 = r12.charAt(r2)     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
            if (r3 != r4) goto L5a
            int r3 = r12.length()     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
            int r3 = r3 - r9
            if (r2 != r3) goto L57
            int r12 = extractValue(r0, r1)     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L60
            return r12
        L57:
            int r1 = r1 + 1
            goto L3f
        L5a:
            int r8 = r8 + r9
            goto L2e
        L5c:
            r12 = move-exception
            com.meituan.mtmap.rendersdk.SdkExceptionHandler.handleException(r12)
        L60:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtmap.rendersdk.NativeMap.parseFileForValue(java.lang.String, java.io.FileInputStream):int");
    }

    private static int extractValue(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "965b874f34dce26d5ab1fe04a8bc8294", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "965b874f34dce26d5ab1fe04a8bc8294")).intValue();
        }
        while (i < bArr.length && bArr[i] != 10) {
            try {
                if (Character.isDigit(bArr[i])) {
                    int i2 = i + 1;
                    while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                        i2++;
                    }
                    return Integer.parseInt(new String(bArr, 0, i, i2 - i));
                }
                i++;
            } catch (Throwable th) {
                SdkExceptionHandler.handleException(th);
                return -1;
            }
        }
        return -1;
    }

    public static synchronized int getYear(Context context) {
        synchronized (NativeMap.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d00db2fb810543b9ea3298ab589c0216", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d00db2fb810543b9ea3298ab589c0216")).intValue();
            }
            if (mYearCategory == null) {
                mYearCategory = Integer.valueOf(categorizeByYear2016Method(context));
            }
            return mYearCategory.intValue();
        }
    }

    private static void conditionallyAdd(ArrayList<Integer> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "959cce81cc60a0743786ac2366ed662a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "959cce81cc60a0743786ac2366ed662a");
        } else if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    private static int categorizeByYear2016Method(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd4ac5a4772c535a9ce0f9932cd5bba7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd4ac5a4772c535a9ce0f9932cd5bba7")).intValue();
        }
        long totalMemory = getTotalMemory(context);
        if (totalMemory == -1) {
            return categorizeByYear2014Method(context);
        }
        if (totalMemory <= 805306368) {
            return getNumberOfCPUCores() <= 1 ? 2009 : 2010;
        } else if (totalMemory <= 1073741824) {
            return getCPUMaxFreqKHz() < 1300000 ? 2011 : 2012;
        } else if (totalMemory <= 1610612736) {
            return getCPUMaxFreqKHz() < 1800000 ? 2012 : 2013;
        } else if (totalMemory <= 2147483648L) {
            return 2013;
        } else {
            if (totalMemory <= 3221225472L) {
                return 2014;
            }
            return totalMemory <= 5368709120L ? 2015 : 2016;
        }
    }

    private static int categorizeByYear2014Method(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d66383c033b9ef32f251765f42f5504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d66383c033b9ef32f251765f42f5504")).intValue();
        }
        ArrayList arrayList = new ArrayList();
        conditionallyAdd(arrayList, getNumCoresYear());
        conditionallyAdd(arrayList, getClockSpeedYear());
        conditionallyAdd(arrayList, getRamYear(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
    }

    private static int getNumCoresYear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ef38e9ce6ecfd19221379adc258d0b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ef38e9ce6ecfd19221379adc258d0b4")).intValue();
        }
        int numberOfCPUCores = getNumberOfCPUCores();
        if (numberOfCPUCores <= 0) {
            return -1;
        }
        if (numberOfCPUCores == 1) {
            return 2008;
        }
        return numberOfCPUCores <= 3 ? 2011 : 2012;
    }

    private static int getClockSpeedYear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab2c2fda886c2caf1712730ff24cf4df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab2c2fda886c2caf1712730ff24cf4df")).intValue();
        }
        long cPUMaxFreqKHz = getCPUMaxFreqKHz();
        if (cPUMaxFreqKHz == -1) {
            return -1;
        }
        if (cPUMaxFreqKHz <= 528000) {
            return 2008;
        }
        if (cPUMaxFreqKHz <= 620000) {
            return 2009;
        }
        if (cPUMaxFreqKHz <= 1020000) {
            return 2010;
        }
        if (cPUMaxFreqKHz <= 1220000) {
            return 2011;
        }
        if (cPUMaxFreqKHz <= 1520000) {
            return 2012;
        }
        return cPUMaxFreqKHz <= 2020000 ? 2013 : 2014;
    }

    private static int getRamYear(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3368140c3ad47a50b906c08748740a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3368140c3ad47a50b906c08748740a5")).intValue();
        }
        long totalMemory = getTotalMemory(context);
        if (totalMemory <= 0) {
            return -1;
        }
        if (totalMemory <= 201326592) {
            return 2008;
        }
        if (totalMemory <= 304087040) {
            return 2009;
        }
        if (totalMemory <= 536870912) {
            return 2010;
        }
        if (totalMemory <= 1073741824) {
            return 2011;
        }
        if (totalMemory <= 1610612736) {
            return 2012;
        }
        return totalMemory <= 2147483648L ? 2013 : 2014;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum MapChangeEvent {
        UPDATE,
        ERROR,
        RENDER_MAP_END,
        RENDER_FRAME_END,
        CAMERA_CHANGING,
        CAMERA_CHANGED,
        CAMERA_WILL_CHANGE,
        STYLE_LOADED,
        STYLE_FIRST_RENDER,
        RENDER_MAP_PARTIAL,
        STYLE_LOADED_ERROR,
        ON_MAIN_FRAME_CALLBACK,
        ON_RASTER_INTERNAL_CALLBACK,
        ON_RASTER_FOREIGN_CALLBACK;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        MapChangeEvent() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26df266bb9a21e0058c4aa842ef69c5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26df266bb9a21e0058c4aa842ef69c5");
            }
        }

        public static MapChangeEvent valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51cac8795fb84fdcde15de55ac58dee3", RobustBitConfig.DEFAULT_VALUE) ? (MapChangeEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51cac8795fb84fdcde15de55ac58dee3") : (MapChangeEvent) Enum.valueOf(MapChangeEvent.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MapChangeEvent[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93979f64478a09a8dfb718c8aad644d2", RobustBitConfig.DEFAULT_VALUE) ? (MapChangeEvent[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93979f64478a09a8dfb718c8aad644d2") : (MapChangeEvent[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum ToggleName {
        DEBUG_TILE_BORDER;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ToggleName() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb71e8eecc22a7c8d918e2fcda99767b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb71e8eecc22a7c8d918e2fcda99767b");
            }
        }

        public static ToggleName valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9716074960f7d34ab23a8d2d4f0f7da2", RobustBitConfig.DEFAULT_VALUE) ? (ToggleName) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9716074960f7d34ab23a8d2d4f0f7da2") : (ToggleName) Enum.valueOf(ToggleName.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ToggleName[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd97f03d8013a8dd9bd7dcd11af7d8f8", RobustBitConfig.DEFAULT_VALUE) ? (ToggleName[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd97f03d8013a8dd9bd7dcd11af7d8f8") : (ToggleName[]) values().clone();
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, int[] iArr) {
        this(f, context, str, mapObserver, (QueryObserver) null, iArr, "");
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "541e27c0f44b56430a83075e60eceae3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "541e27c0f44b56430a83075e60eceae3");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, int[] iArr, String str2) {
        this(f, context, str, mapObserver, (QueryObserver) null, iArr, str2);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, iArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dab19142452c5076878838dabcda5c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dab19142452c5076878838dabcda5c5");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, IZoomUtil iZoomUtil, int[] iArr) {
        this(f, context, str, mapObserver, null, iZoomUtil, iArr, "");
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, iZoomUtil, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a6422d321998aad69de9ebb307c0b5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a6422d321998aad69de9ebb307c0b5b");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, IZoomUtil iZoomUtil, int[] iArr, String str2) {
        this(f, context, str, mapObserver, null, iZoomUtil, iArr, str2);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, iZoomUtil, iArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d74c1dc969a85f84c6ed2a18b7c20709", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d74c1dc969a85f84c6ed2a18b7c20709");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, int[] iArr) {
        this(f, context, str, mapObserver, queryObserver, null, iArr, "");
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "451d2f3e6eb74bfb082b1bf0fa1df2ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "451d2f3e6eb74bfb082b1bf0fa1df2ff");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, int[] iArr, String str2) {
        this(f, context, str, mapObserver, queryObserver, null, iArr, str2);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2a7bd871ed87c60e6c0e168252c30da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2a7bd871ed87c60e6c0e168252c30da");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, IZoomUtil iZoomUtil, int[] iArr, String str2) {
        this(f, context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, true);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b7f3ad3c9681e8c47fc9f796eab6a4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b7f3ad3c9681e8c47fc9f796eab6a4a");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, IZoomUtil iZoomUtil, int[] iArr, String str2, boolean z) {
        this(f, context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, z, 0);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8f3eb724594040666a64f022ec9b51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8f3eb724594040666a64f022ec9b51");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, IZoomUtil iZoomUtil, int[] iArr, String str2, boolean z, int i) {
        this(f, context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, z, i, 0);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4502ec12e40b4f55416270de27a8f3f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4502ec12e40b4f55416270de27a8f3f1");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, IZoomUtil iZoomUtil, int[] iArr, String str2, boolean z, int i, int i2) {
        this(f, context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, z, i, i2, null, null);
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17f091da1a514ecd3de77bc13e4cd154", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17f091da1a514ecd3de77bc13e4cd154");
        }
    }

    public NativeMap(float f, Context context, String str, MapObserver mapObserver, QueryObserver queryObserver, IZoomUtil iZoomUtil, int[] iArr, String str2, boolean z, int i, int i2, byte[] bArr, String str3) {
        Object[] objArr = {Float.valueOf(f), context, str, mapObserver, queryObserver, iZoomUtil, iArr, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), bArr, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "473ba50f7474419c375c0385b58108b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "473ba50f7474419c375c0385b58108b3");
            return;
        }
        this.nativePtr = 0L;
        this.destroyed = false;
        this.mPadding = new double[4];
        try {
            this.mObserver = mapObserver;
            this.mQueryObserver = queryObserver;
            this.mPixelRatio = context.getResources().getDisplayMetrics().density;
            this.iZoomUtil = iZoomUtil;
            InnerInitializer.initInnerSDK(context);
            int i3 = getYear(context) <= 2013 ? 1 : 4;
            if (InnerInitializer.canNativeBeUsed("NativeMap.NativeMap")) {
                nativeInitialize(this, f, str, i3, iArr, str2, z, i, i2, bArr, str3);
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public static void setHttpHeaders(String str, String str2, String str3) {
        GIT_REVISION_SHORT = str;
        SDK_EVENTS_USER_AGENT = str2;
        SDK_VERSION_STRING = str3;
    }

    private boolean isDestroyedOn(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "365a70df9ebe23cce59312d0cf8e676e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "365a70df9ebe23cce59312d0cf8e676e")).booleanValue();
        }
        if (!InnerInitializer.canNativeBeUsed(str) || this.nativePtr == 0) {
            this.destroyed = true;
        } else if (this.destroyed && !TextUtils.isEmpty(str)) {
            String.format("You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", str);
        }
        return this.destroyed;
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a27084c1efdd54873784ea68e813662f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a27084c1efdd54873784ea68e813662f");
            return;
        }
        try {
            if (isDestroyedOn("destroy")) {
                return;
            }
            nativeDestroy();
            this.destroyed = true;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void onInvalidate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "306d18565d9882724c58392777dbbb25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "306d18565d9882724c58392777dbbb25");
        } else if (this.mObserver != null) {
            this.mObserver.onUpdate();
        }
    }

    public void onMapChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22e72ae3f185be374f2eec8d6d78069b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22e72ae3f185be374f2eec8d6d78069b");
        } else if (this.mObserver != null) {
            this.mObserver.onMapChange(i);
        }
    }

    public void onMapChange(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35327ad9ad559f82af69ce260f595224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35327ad9ad559f82af69ce260f595224");
        } else if (this.mObserver != null) {
            this.mObserver.onMapChange(i, str, i2);
        }
    }

    public void onQuery(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8db509f97c65ca68c458ea7848aead0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8db509f97c65ca68c458ea7848aead0a");
        } else if (this.mQueryObserver != null) {
            this.mQueryObserver.onQuery(j, j2);
        }
    }

    public void onDynamicMapLoaded(String str, long[] jArr) {
        Object[] objArr = {str, jArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d6a2ff0bee9c72a44fadc36f85d03c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d6a2ff0bee9c72a44fadc36f85d03c2");
        } else if (this.mDynamicMapObserver != null) {
            this.mDynamicMapObserver.onLoaded(str, jArr);
        }
    }

    public void onIndoorBuildings(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4fd8027f1e34e3b30dc3719684c6ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4fd8027f1e34e3b30dc3719684c6ace");
        } else if (this.mIndoorBuildingsObserver != null) {
            this.mIndoorBuildingsObserver.onIndoorBuildings(j);
        }
    }

    public double toRenderZoom(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60cb81845538341b12862f3b06b7b7ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60cb81845538341b12862f3b06b7b7ac")).doubleValue();
        }
        if (this.iZoomUtil != null) {
            try {
                return this.iZoomUtil.toRenderZoom(d);
            } catch (Throwable th) {
                SdkExceptionHandler.handleException(th);
                return d;
            }
        }
        return d;
    }

    public double fromRenderZoom(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91c938dd78cf42eab0a6399c114e208d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91c938dd78cf42eab0a6399c114e208d")).doubleValue();
        }
        if (this.iZoomUtil != null) {
            try {
                return this.iZoomUtil.fromRenderZoom(d);
            } catch (Throwable th) {
                SdkExceptionHandler.handleException(th);
                return d;
            }
        }
        return d;
    }

    public void addLayer(@NonNull CustomLayer customLayer) {
        Object[] objArr = {customLayer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2327163dc544b1e4ce92ed871fbb638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2327163dc544b1e4ce92ed871fbb638");
            return;
        }
        try {
            if (!isDestroyedOn("addLayer") && customLayer.getNativePtr() != 0) {
                nativeAddCustomLayer(customLayer.getNativePtr(), null);
            }
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    @Deprecated
    public void removeLayer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdf55b5f04a12f4caeaf9b39542384ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdf55b5f04a12f4caeaf9b39542384ba");
            return;
        }
        try {
            if (isDestroyedOn("removeLayer")) {
                return;
            }
            nativeRemoveLayer(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void show3dBuilding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "145c9b75201034b3bd40eda9030da1a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "145c9b75201034b3bd40eda9030da1a8");
            return;
        }
        try {
            if (isDestroyedOn("show3dBuilding")) {
                return;
            }
            nativeShow3dBuilding(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void showTrafficLight(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "212168226aca9c7b4fc51424bc6f01f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "212168226aca9c7b4fc51424bc6f01f2");
            return;
        }
        try {
            if (isDestroyedOn("showTrafficLight")) {
                return;
            }
            nativeShowTrafficLight(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setMapSize(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fa801608f8fd1c6b9823fc7f2b16124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fa801608f8fd1c6b9823fc7f2b16124");
            return;
        }
        try {
            if (isDestroyedOn("setMapSize")) {
                return;
            }
            nativeSetMapSize(f, f2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setCameraOptions(double[] dArr, int i) {
        Object[] objArr = {dArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4cf38dec33980985f33200efad8d492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4cf38dec33980985f33200efad8d492");
            return;
        }
        try {
            if (isDestroyedOn("setCameraOptions")) {
                return;
            }
            nativeSetCameraOptions(dArr, i, null);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setCameraOptions(double[] dArr, int i, double[] dArr2) {
        Object[] objArr = {dArr, Integer.valueOf(i), dArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e15ea08b988b996bb8ec302ed7dc6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e15ea08b988b996bb8ec302ed7dc6d");
            return;
        }
        try {
            if (isDestroyedOn("setCameraOptions")) {
                return;
            }
            nativeSetCameraOptions(dArr, i, dArr2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setCameraOptionGroup(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99e059f968a609e574732a46519eb4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99e059f968a609e574732a46519eb4b4");
            return;
        }
        try {
            if (isDestroyedOn("setCameraOptionGroup")) {
                return;
            }
            nativeSetCameraOptionGroup(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setCameraEyeParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c09ade7d74ed7418580ed0fc214be1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c09ade7d74ed7418580ed0fc214be1e");
            return;
        }
        try {
            if (isDestroyedOn("setCameraEyeParams")) {
                return;
            }
            nativeSetCameraEyeParams(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public double[] getCameraEye() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a696bcd52f847dd0463d43d7e86cad8", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a696bcd52f847dd0463d43d7e86cad8");
        }
        try {
            if (isDestroyedOn("getCameraEye")) {
                return new double[0];
            }
            return nativeGetCameraEye();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public double[] getCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6959112c77dafde67321e1d88091da33", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6959112c77dafde67321e1d88091da33");
        }
        try {
            if (isDestroyedOn("getCenter")) {
                return new double[0];
            }
            return nativeGetCenter();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public double getZoom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64de77defc5a3709090f08a90303b86e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64de77defc5a3709090f08a90303b86e")).doubleValue();
        }
        try {
            if (isDestroyedOn("getZoom")) {
                return Double.NaN;
            }
            return nativeGetZoom2();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return Double.NaN;
        }
    }

    public double getBearing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51ac4946fe8ea53285dbc5bfb6840f23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51ac4946fe8ea53285dbc5bfb6840f23")).doubleValue();
        }
        try {
            if (isDestroyedOn("getBearing")) {
                return Double.NaN;
            }
            return nativeGetBearing2();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return Double.NaN;
        }
    }

    public double getPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df7941b47c0f10fe2b48627acbe936eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df7941b47c0f10fe2b48627acbe936eb")).doubleValue();
        }
        try {
            if (isDestroyedOn("getPitch")) {
                return Double.NaN;
            }
            return nativeGetPitch2();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return Double.NaN;
        }
    }

    public void setCameraOptionsRange(double[] dArr, int i) {
        Object[] objArr = {dArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98752f0a6193a256b74ed77adc0627bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98752f0a6193a256b74ed77adc0627bb");
            return;
        }
        try {
            if (isDestroyedOn("setCameraOptionsRange")) {
                return;
            }
            nativeSetCameraOptionsRange(dArr, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void cancelAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31154f86b23a7dcdd3954fa944cfba53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31154f86b23a7dcdd3954fa944cfba53");
            return;
        }
        try {
            if (isDestroyedOn("cancelAnimation")) {
                return;
            }
            nativeCancelAnimation();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void moveBy(double d, double d2, int i) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3353a6458d5308cf19f140bc91fbd28d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3353a6458d5308cf19f140bc91fbd28d");
            return;
        }
        try {
            if (isDestroyedOn("moveBy")) {
                return;
            }
            nativeMoveBy2(d, d2, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public double[] getScrnCoordByLatLng(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cc4fc6928fa4a235dff1d723eb94936", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cc4fc6928fa4a235dff1d723eb94936");
        }
        try {
            if (isDestroyedOn("getScrnCoordByLatLng")) {
                return new double[0];
            }
            return nativeGetScrnCoordByLatLng(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public double[] getLatLngByScrnCoord(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccee07a2ac9a129586612b6575f7bf4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccee07a2ac9a129586612b6575f7bf4a");
        }
        try {
            if (isDestroyedOn("getLatLngByScrnCoord")) {
                return new double[0];
            }
            return nativeGetLatLngByScrnCoord(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public double[] getScrnCoordByLatLngAndCamera(double[] dArr, double[] dArr2) {
        Object[] objArr = {dArr, dArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30a0222d3754c1e7b8b533964cb1123a", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30a0222d3754c1e7b8b533964cb1123a");
        }
        try {
            if (isDestroyedOn("getScrnCoordByLatLngAndCamera")) {
                return new double[0];
            }
            return nativeGetScrnCoordByLatLngAndCamera(dArr, dArr2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public double[] latLngBoundsForCamera(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c03db6a229d5a2cc180bd5878081c970", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c03db6a229d5a2cc180bd5878081c970");
        }
        try {
            if (isDestroyedOn("latLngBoundsForCamera")) {
                return new double[0];
            }
            return nativeLatLngBoundsForCamera(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public double[] cameraForLatLngBounds(double[] dArr, double[] dArr2) {
        Object[] objArr = {dArr, dArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878e3c6d86f01f8efb67f31a1bd5884a", RobustBitConfig.DEFAULT_VALUE) ? (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878e3c6d86f01f8efb67f31a1bd5884a") : cameraForLatLngBounds(dArr, dArr2, Double.NaN);
    }

    public double[] cameraForLatLngBounds(double[] dArr, double[] dArr2, double d) {
        Object[] objArr = {dArr, dArr2, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ade6df1d6735032af90714f42f2648ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ade6df1d6735032af90714f42f2648ed");
        }
        try {
            if (isDestroyedOn("cameraForLatLngBounds")) {
                return new double[0];
            }
            return nativeCameraForLatLngBounds(dArr, dArr2, d);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new double[0];
        }
    }

    public void applyMapStyle(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc70f52e431c1e37235b7dd1be8ab3c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc70f52e431c1e37235b7dd1be8ab3c6");
            return;
        }
        try {
            if (isDestroyedOn("applyMapStyle")) {
                return;
            }
            nativeApplyMapStyle(str, z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void applyColorStyle(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e98f614534e33d2ae1ef54fb596f556a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e98f614534e33d2ae1ef54fb596f556a");
            return;
        }
        try {
            if (isDestroyedOn("applyMapStyle")) {
                return;
            }
            nativeApplyColorStyle(str, z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void applyMapStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c05f5c6be2b2fe005303db1f8d83517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c05f5c6be2b2fe005303db1f8d83517");
            return;
        }
        try {
            if (isDestroyedOn("applyMapStyle")) {
                return;
            }
            nativeApplyMapStyle2(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void applyMapStyleFromBuffer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e8203b215d795c696bbf20c0599e1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e8203b215d795c696bbf20c0599e1be");
            return;
        }
        try {
            if (isDestroyedOn("applyMapStyleFromBuffer")) {
                return;
            }
            nativeApplyMapStyleFromBuffer(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public String genImageID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f3e26f0bef76dd29669560c40cb7e63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f3e26f0bef76dd29669560c40cb7e63");
        }
        try {
            if (isDestroyedOn("genImageID")) {
                return null;
            }
            return nativeGenImageID();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return null;
        }
    }

    public void addImage(String str, int i, int i2, float f, byte[] bArr) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25b522a9dd033f960d1fba46636f148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25b522a9dd033f960d1fba46636f148");
            return;
        }
        try {
            if (isDestroyedOn("addImage2")) {
                return;
            }
            nativeAddImage2(str, i, i2, f, bArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b398151ccfbd01b946e5592dbb3319b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b398151ccfbd01b946e5592dbb3319b");
            return;
        }
        try {
            if (isDestroyedOn("removeImage")) {
                return;
            }
            nativeRemoveImage2(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setMaxFps(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd09ae2e9345bbd2075133c2b74d7c5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd09ae2e9345bbd2075133c2b74d7c5d");
            return;
        }
        try {
            if (isDestroyedOn("setMaxFps")) {
                return;
            }
            nativeSetMaxFps2(i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setPause(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e50eb457cae83502b044b05d2acf6fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e50eb457cae83502b044b05d2acf6fd5");
            return;
        }
        try {
            if (isDestroyedOn("setPause")) {
                return;
            }
            nativeSetPause2(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void render() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ab89d81940377c78cc69a1404facc9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ab89d81940377c78cc69a1404facc9a");
            return;
        }
        try {
            if (isDestroyedOn("render")) {
                return;
            }
            nativeRender2();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void render(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e196ec0da31509532074dfb74b5a50d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e196ec0da31509532074dfb74b5a50d");
            return;
        }
        try {
            if (isDestroyedOn("nativeRender3")) {
                return;
            }
            nativeRender3(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void requireUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0774f23912f15a73458038c188dfa726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0774f23912f15a73458038c188dfa726");
            return;
        }
        try {
            if (isDestroyedOn("requireUpdate")) {
                return;
            }
            nativeRequireUpdate2();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public int getSkyHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf1508002f2bad339ffda6c4cb64816a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf1508002f2bad339ffda6c4cb64816a")).intValue();
        }
        try {
            if (isDestroyedOn("getSkyHeight")) {
                return 0;
            }
            return nativeGetSkyHeight();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0;
        }
    }

    public byte[] readStillImage(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b51da65a21691b78fcdae995358938f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b51da65a21691b78fcdae995358938f");
        }
        try {
            if (isDestroyedOn("readStillImage")) {
                return new byte[0];
            }
            return nativeReadStillImage(i, i2, i3, i4);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new byte[0];
        }
    }

    public void reloadBaseSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dd6ec3d732d36d4b336ca0b1a38f038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dd6ec3d732d36d4b336ca0b1a38f038");
            return;
        }
        try {
            if (isDestroyedOn("reloadBaseSource2")) {
                return;
            }
            nativeReloadBaseSource2();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void reloadSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97f45af70b970b33c6cb4a948ea645cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97f45af70b970b33c6cb4a948ea645cb");
            return;
        }
        try {
            if (isDestroyedOn("reloadSource")) {
                return;
            }
            nativeReloadSource(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long queryRenderedFeaturesByOrder(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "633ed1617c63d541425f0151ee19ee95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "633ed1617c63d541425f0151ee19ee95")).longValue();
        }
        try {
            if (isDestroyedOn("nativeQueryRenderedFeaturesByOrder")) {
                return 0L;
            }
            return nativeQueryRenderedFeaturesByOrder(d, d2, d3, d4);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public long queryRenderedFeaturesOfPoint(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1f9e371e0d8e66cb31d2064322b81e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1f9e371e0d8e66cb31d2064322b81e8")).longValue();
        }
        try {
            if (isDestroyedOn("nativeQueryRenderedFeaturesOfPoint")) {
                return 0L;
            }
            return nativeQueryRenderedFeaturesOfPoint(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public long queryRenderedFeaturesOfBox(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9438fe54b6d891302479f3022583dea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9438fe54b6d891302479f3022583dea")).longValue();
        }
        try {
            if (isDestroyedOn("nativeQueryRenderedFeaturesOfBox")) {
                return 0L;
            }
            return nativeQueryRenderedFeaturesOfBox(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public long queryRenderedFeaturesOfRegion(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8719175c8b8078bdad2f256fac292c63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8719175c8b8078bdad2f256fac292c63")).longValue();
        }
        try {
            if (isDestroyedOn("nativeQueryRenderedFeaturesOfRegion")) {
                return 0L;
            }
            return nativeQueryRenderedFeaturesOfRegion(dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public int queryScreenUi(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98a90296fcfd5bb034b3374911243295", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98a90296fcfd5bb034b3374911243295")).intValue();
        }
        try {
            if (isDestroyedOn("nativeQueryScreenUi")) {
                return 0;
            }
            return nativeQueryScreenUi(d, d2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0;
        }
    }

    public int getFeatureNum(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22834c1bde4139d9584b329136d45c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22834c1bde4139d9584b329136d45c0a")).intValue();
        }
        try {
            if (isDestroyedOn("getFeatureNum")) {
                return 0;
            }
            return nativeGetFeatureNum(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0;
        }
    }

    public int getFeatureType(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7961bd907d17751769b194b1e2208bd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7961bd907d17751769b194b1e2208bd9")).intValue();
        }
        try {
            if (isDestroyedOn("getFeatureType")) {
                return 6;
            }
            return nativeGetFeatureType(j, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 6;
        }
    }

    public int getFeaturePropertyType(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb68b89a68ba7801c574f9f5c80f9baf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb68b89a68ba7801c574f9f5c80f9baf")).intValue();
        }
        try {
            if (isDestroyedOn("getFeaturePropertyType")) {
                return 0;
            }
            return nativeGetFeaturePropertyType(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0;
        }
    }

    public String getFeatureStringProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8894292c132c8ab21b594862876cbd65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8894292c132c8ab21b594862876cbd65");
        }
        try {
            return isDestroyedOn("getFeatureProperty") ? "" : nativeGetFeatureStringProperty(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return "";
        }
    }

    public long getFeatureLongProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b8c549035f3c12222f75acfb4f5b89c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b8c549035f3c12222f75acfb4f5b89c")).longValue();
        }
        try {
            if (isDestroyedOn("getFeatureProperty")) {
                return 0L;
            }
            return nativeGetFeatureLongProperty(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public boolean getFeatureBooleanProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "322339c7021f69a276ab54d618a14b88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "322339c7021f69a276ab54d618a14b88")).booleanValue();
        }
        try {
            if (isDestroyedOn("getFeatureProperty")) {
                return false;
            }
            return nativeGetFeatureBooleanProperty(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return false;
        }
    }

    public double getFeatureDoubleProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80d4a8d77c7b564d01e9eafb9398df04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80d4a8d77c7b564d01e9eafb9398df04")).doubleValue();
        }
        try {
            if (isDestroyedOn("getFeatureProperty")) {
                return Double.NaN;
            }
            return nativeGetFeatureDoubleProperty(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return Double.NaN;
        }
    }

    public void destroyFeatures(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f0461540bab30d087973a3fa4e071a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f0461540bab30d087973a3fa4e071a");
            return;
        }
        try {
            if (isDestroyedOn("destroyFeatures")) {
                return;
            }
            nativeDestroyFeatures(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setIndoor(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c76a44b7c1d4dcf09dafa1c7ca3351e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c76a44b7c1d4dcf09dafa1c7ca3351e");
            return;
        }
        try {
            if (isDestroyedOn("setIndoor")) {
                return;
            }
            nativeSetIndoor(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setIndoorMask(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d26e23ee1b79113f936148a45d43e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d26e23ee1b79113f936148a45d43e87");
            return;
        }
        try {
            if (isDestroyedOn("setIndoorMask")) {
                return;
            }
            nativeSetIndoorMask(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setIndoorMaskColor(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "078414a90a53f278676f224246747663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "078414a90a53f278676f224246747663");
            return;
        }
        try {
            if (isDestroyedOn("setIndoorMaskColor")) {
                return;
            }
            nativeSetIndoorMaskColor(fArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setIndoorFloor(long j, String str, int i) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98b25e6a304c50627aa52519e472efca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98b25e6a304c50627aa52519e472efca");
            return;
        }
        try {
            if (isDestroyedOn("setIndoorFloor")) {
                return;
            }
            nativeSetIndoorFloor(j, str, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setOnIndoorBuildings(IndoorBuildingsObserver indoorBuildingsObserver) {
        boolean z = true;
        Object[] objArr = {indoorBuildingsObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e43c94b4dbb9fa05033608d8f4be4e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e43c94b4dbb9fa05033608d8f4be4e3c");
            return;
        }
        try {
            this.mIndoorBuildingsObserver = indoorBuildingsObserver;
            if (indoorBuildingsObserver == null) {
                z = false;
            }
            nativeSetOnIndoorBuildings(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setIndoorQueryBox(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4d0b41c6460e640084b1e229bf28723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4d0b41c6460e640084b1e229bf28723");
            return;
        }
        try {
            if (isDestroyedOn("setIndoorQueryBox")) {
                return;
            }
            nativeSetIndoorQueryBox(f, f2, f3, f4);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addHighlightBuilding(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b69512073403ea399a7b3fa6f58727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b69512073403ea399a7b3fa6f58727");
            return;
        }
        try {
            if (isDestroyedOn("addHighlightBuildingr")) {
                return;
            }
            nativeAddHighlightBuilding(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeHighlightBuilding(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dbc3cbebc15d9e06b7ec22d27e9e600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dbc3cbebc15d9e06b7ec22d27e9e600");
            return;
        }
        try {
            if (isDestroyedOn("removeHighlightBuilding")) {
                return;
            }
            nativeRemoveHighlightBuilding(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeHighlightBuilding() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4dfbdeee443c0dbc4f4d104d4c8c018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4dfbdeee443c0dbc4f4d104d4c8c018");
            return;
        }
        try {
            if (isDestroyedOn("removeHighlightBuilding")) {
                return;
            }
            nativeRemoveHighlightBuildings();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setRoadTraffic(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baf766ad63b4b95b4ab1cea5fcbd5e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baf766ad63b4b95b4ab1cea5fcbd5e06");
            return;
        }
        try {
            if (isDestroyedOn("setRoadTraffic")) {
                return;
            }
            nativeSetRoadTraffic(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setRoadBackgroundColor(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d1900eccb5da7a1b5e56c732e9310c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d1900eccb5da7a1b5e56c732e9310c0");
            return;
        }
        try {
            if (isDestroyedOn("setRoadBackgroundColor")) {
                return;
            }
            nativeSetRoadBackgroundColor(fArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setRoadCasingColor(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0bad0571fd7f927ff271ea2def4af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0bad0571fd7f927ff271ea2def4af7");
            return;
        }
        try {
            if (isDestroyedOn("setRoadCasingColor")) {
                return;
            }
            nativeSetRoadCasingColor(fArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setTrafficColor(int i, float[] fArr) {
        Object[] objArr = {Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb4496e4880367fb18cb111fc94b0f1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb4496e4880367fb18cb111fc94b0f1e");
            return;
        }
        try {
            if (isDestroyedOn("setTrafficColor")) {
                return;
            }
            nativeSetTrafficColor2(i, fArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setRoadSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a26f5091b9037d552a0aa4a0ced32fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a26f5091b9037d552a0aa4a0ced32fa");
            return;
        }
        try {
            if (isDestroyedOn("setRoadSource")) {
                return;
            }
            nativeSetRoadSource(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void showRoadStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "322a63a43f8b337454468a752ec25d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "322a63a43f8b337454468a752ec25d5e");
            return;
        }
        try {
            if (isDestroyedOn("showRoadStyle")) {
                return;
            }
            nativeShowRoadStyle(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setTrafficStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0361d0993ac429d081635851051a8748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0361d0993ac429d081635851051a8748");
            return;
        }
        try {
            if (isDestroyedOn("setTrafficStyle")) {
                return;
            }
            nativeSetTrafficStyle(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setTrafficLineSource(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c4fd7a75b7955fff1af818527553e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c4fd7a75b7955fff1af818527553e5");
            return;
        }
        try {
            if (isDestroyedOn("setTrafficLineSource")) {
                return;
            }
            nativeSetTrafficLineSource(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void createOrUpdateDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdabbb67181e888f75362dbd513fad06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdabbb67181e888f75362dbd513fad06");
            return;
        }
        try {
            if (isDestroyedOn("createDynamicMap")) {
                return;
            }
            nativeCreateOrUpdateDynamicMap(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void createOrUpdateDynamicMap(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "035a3823c6dc488babb21906d8e6fd09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "035a3823c6dc488babb21906d8e6fd09");
            return;
        }
        try {
            if (isDestroyedOn("createDynamicMap")) {
                return;
            }
            nativeCreateOrUpdateOfflineDynamicMap(str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void destroyDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194d21ac704527ac285fe9cf82a89e39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194d21ac704527ac285fe9cf82a89e39");
            return;
        }
        try {
            if (isDestroyedOn("destroyDynamicMap")) {
                return;
            }
            nativeDestroyDynamicMap(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    @Deprecated
    public void setDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8441bffd522a6de04b76ffa40d33611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8441bffd522a6de04b76ffa40d33611");
            return;
        }
        try {
            if (isDestroyedOn("setDynamicMapGeoJSON")) {
                return;
            }
            nativeSetDynamicMapGeoJSON2(str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addDynamicMapGeoJSON(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c299537a6da41e6ee0e35f1687479c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c299537a6da41e6ee0e35f1687479c5");
            return;
        }
        try {
            if (isDestroyedOn("addDynamicMapGeoJSON")) {
                return;
            }
            nativeAddDynamicMapGeoJSON(str, str2, str3);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addDynamicMapGeoJSONWithSize(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38008424f4025c79ca2204adb2a82ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38008424f4025c79ca2204adb2a82ebb");
            return;
        }
        try {
            if (isDestroyedOn("addDynamicMapGeoJSONWithSize")) {
                return;
            }
            nativeAddDynamicMapGeoJSONWithSize(str, str2, str3, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0725abee6123d3ca89bb9d390fcdee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0725abee6123d3ca89bb9d390fcdee9");
            return;
        }
        try {
            if (isDestroyedOn("removeDynamicMapGeoJSON")) {
                return;
            }
            nativeRemoveDynamicMapGeoJSON(str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    @Deprecated
    public void removeDynamicMapGeoJSON(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77d6ba7431dc43ed97862cdc161bdfa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77d6ba7431dc43ed97862cdc161bdfa8");
            return;
        }
        try {
            if (isDestroyedOn("removeDynamicMapGeoJSON")) {
                return;
            }
            nativeRemoveDynamicMapGeoJSONs(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    @Deprecated
    public void setDynamicMapFeature(String str, long j, String str2, String str3) {
        Object[] objArr = {str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b59f4e508cf09ada1d49bc06b6096747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b59f4e508cf09ada1d49bc06b6096747");
            return;
        }
        try {
            if (isDestroyedOn("setDynamicMapFeature")) {
                return;
            }
            nativeSetDynamicMapFeature(str, j, str2, str3);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setDynamicMapFeature(String str, String str2, long j, String str3, String str4) {
        Object[] objArr = {str, str2, new Long(j), str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39e892f3790753a19ef3a209d06871fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39e892f3790753a19ef3a209d06871fe");
            return;
        }
        try {
            if (isDestroyedOn("setDynamicMapFeature")) {
                return;
            }
            nativeSetDynamicMapFeatureOfGeojson(str, str2, j, str3, str4);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    @Deprecated
    public void resetDynamicMapFeature(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43657ca4ba0bc8ae0003d630566f18ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43657ca4ba0bc8ae0003d630566f18ab");
            return;
        }
        try {
            if (isDestroyedOn("resetDynamicMapFeature")) {
                return;
            }
            nativeResetDynamicMapFeature(str, j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void resetDynamicMapFeature(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "616b82dc0a29d1942d8e3b8fa62d9a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "616b82dc0a29d1942d8e3b8fa62d9a2a");
            return;
        }
        try {
            if (isDestroyedOn("resetDynamicMapFeature")) {
                return;
            }
            nativeResetDynamicMapFeatureOfGeojson(str, str2, j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void resetDynamicMapFeatures(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b2b15fa1dd9b63a8f593131fa898008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b2b15fa1dd9b63a8f593131fa898008");
            return;
        }
        try {
            if (isDestroyedOn("resetDynamicMapFeatures")) {
                return;
            }
            nativeResetDynamicMapFeatures(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeDynamicMapFeature(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35357899e0293325df743a2881bc0d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35357899e0293325df743a2881bc0d64");
            return;
        }
        try {
            if (isDestroyedOn("removeDynamicMapFeature")) {
                return;
            }
            nativeRemoveDynamicMapFeature(str, str2, j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setDynamicMapImages(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd128a5dc2d74fd50b4df27ef5fcba29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd128a5dc2d74fd50b4df27ef5fcba29");
            return;
        }
        try {
            if (isDestroyedOn("setDynamicImages")) {
                return;
            }
            nativeSetDynamicMapImages(str, strArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setOnDynamicMapLoaded(String str, DynamicMapObserver dynamicMapObserver) {
        Object[] objArr = {str, dynamicMapObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ae673eec0060a6597f2822948d9319f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ae673eec0060a6597f2822948d9319f");
            return;
        }
        try {
            this.mDynamicMapObserver = dynamicMapObserver;
            nativeSetOnDynamicMapLoaded(str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void recordDynamicMap(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37d697ee5eef138cb3e0e5107fd9f697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37d697ee5eef138cb3e0e5107fd9f697");
            return;
        }
        try {
            if (isDestroyedOn("recordDynamicMap")) {
                return;
            }
            nativeRecordDynamicMap(str, j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long createLayer(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7557b7e1efa0d19f310f30ea2bc364c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7557b7e1efa0d19f310f30ea2bc364c")).longValue();
        }
        try {
            if (isDestroyedOn("createLayer")) {
                return 0L;
            }
            return nativeCreateLayer(str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public void setSourceLayer(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e1a027ecd06774baade8e817cd0d257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e1a027ecd06774baade8e817cd0d257");
            return;
        }
        try {
            if (isDestroyedOn("setSourceLayer")) {
                return;
            }
            nativeSetSourceLayer(j, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerVisibility(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c57e16869a1151c555cfbd66a1b3c20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c57e16869a1151c555cfbd66a1b3c20");
        } else {
            setLayerVisibility(j, z, null);
        }
    }

    public void setLayerVisibility(long j, boolean z, String str) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f2a744a313e8daec739061cee58fce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f2a744a313e8daec739061cee58fce7");
            return;
        }
        try {
            if (isDestroyedOn("setLayerVisibility")) {
                return;
            }
            nativeSetLayerVisibility(j, z, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerOrder(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d96efa8a357c3d8ad24537bdf9600875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d96efa8a357c3d8ad24537bdf9600875");
        } else {
            setLayerOrder(j, f, 0, null);
        }
    }

    public void setLayerOrder(long j, float f, int i) {
        Object[] objArr = {new Long(j), Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e15293ae78f70b7bbfb11df6748c158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e15293ae78f70b7bbfb11df6748c158");
        } else {
            setLayerOrder(j, f, i, null);
        }
    }

    public void setLayerOrder(long j, float f, int i, String str) {
        Object[] objArr = {new Long(j), Float.valueOf(f), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0641ec0e21470927dc55fc0217a13265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0641ec0e21470927dc55fc0217a13265");
            return;
        }
        try {
            if (isDestroyedOn("setLayerOrder")) {
                return;
            }
            nativeSetLayerOrder(j, f, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerInteractive(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c5f983caff78dbb5884272aa100bb8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c5f983caff78dbb5884272aa100bb8c");
            return;
        }
        try {
            if (isDestroyedOn("setLayerInteractive")) {
                return;
            }
            nativeSetLayerInteractive(j, z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setTileCacheType(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "097432e8315f86dd1c3de7e03af48373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "097432e8315f86dd1c3de7e03af48373");
            return;
        }
        try {
            if (isDestroyedOn("setTileCacheType")) {
                return;
            }
            nativeSetTileCacheType(str, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setTileCacheRatio(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e783433d0409a62c54acad02febd4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e783433d0409a62c54acad02febd4e");
            return;
        }
        try {
            if (isDestroyedOn("setTileCacheRatio")) {
                return;
            }
            nativeSetTileCacheRatio(str, f);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerMinZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cac917449ca8beac79734280f7adfd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cac917449ca8beac79734280f7adfd7");
        } else {
            setLayerMinZoom(j, f, null);
        }
    }

    public void setLayerMinZoom(long j, float f, String str) {
        Object[] objArr = {new Long(j), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5ef8008df800dbb3900b55a9e626a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5ef8008df800dbb3900b55a9e626a21");
            return;
        }
        try {
            if (isDestroyedOn("setLayerMinZoom")) {
                return;
            }
            nativeSetLayerMinZoom(j, f, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerMaxZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df6dc5c3beb6fcac944d544089760ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df6dc5c3beb6fcac944d544089760ee7");
        } else {
            setLayerMaxZoom(j, f, null);
        }
    }

    public void setLayerMaxZoom(long j, float f, String str) {
        Object[] objArr = {new Long(j), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13dff7cc0847d830819bf5986d06b3de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13dff7cc0847d830819bf5986d06b3de");
            return;
        }
        try {
            if (isDestroyedOn("setLayerMaxZoom")) {
                return;
            }
            nativeSetLayerMaxZoom(j, f, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerProperty(long j, int i, boolean z) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ed843ca86044e7ec0c4cefb4ff32264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ed843ca86044e7ec0c4cefb4ff32264");
        } else {
            setLayerProperty(j, i, z, (String) null);
        }
    }

    public void setLayerProperty(long j, int i, boolean z, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10e2551c82e4daa2743046b90ff6a1ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10e2551c82e4daa2743046b90ff6a1ff");
            return;
        }
        try {
            if (isDestroyedOn("setLayerProperty")) {
                return;
            }
            nativeSetLayerBooleanProperty(j, i, z, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerProperty(long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "706ea9da8b70580d86c9609c67d5fe99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "706ea9da8b70580d86c9609c67d5fe99");
        } else {
            setLayerProperty(j, i, i2, (String) null);
        }
    }

    public void setLayerProperty(long j, int i, int i2, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb6ae3ff2753fd2557e0e320e6876430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb6ae3ff2753fd2557e0e320e6876430");
            return;
        }
        try {
            if (isDestroyedOn("setLayerProperty")) {
                return;
            }
            nativeSetLayerIntProperty(j, i, i2, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerProperty(long j, int i, float f) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b801f8c19304fb2e56b749870cac70b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b801f8c19304fb2e56b749870cac70b2");
        } else {
            setLayerProperty(j, i, f, (String) null);
        }
    }

    public void setLayerProperty(long j, int i, float f, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a0af5ca703112fa113b361c8b1624bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a0af5ca703112fa113b361c8b1624bc");
            return;
        }
        try {
            if (isDestroyedOn("setLayerProperty")) {
                return;
            }
            nativeSetLayerFloatProperty(j, i, f, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerProperty(long j, int i, float[] fArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3457a0eb3daa83864a3c70614cc84f77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3457a0eb3daa83864a3c70614cc84f77");
        } else {
            setLayerProperty(j, i, fArr, (String) null);
        }
    }

    public void setLayerProperty(long j, int i, float[] fArr, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), fArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a947c927a3c3505772fb07d476aa39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a947c927a3c3505772fb07d476aa39");
            return;
        }
        try {
            if (isDestroyedOn("setLayerProperty")) {
                return;
            }
            nativeSetLayerFloatArrayProperty(j, i, fArr, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1763a154ebd528714f28c24974a8af22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1763a154ebd528714f28c24974a8af22");
        } else {
            setLayerProperty(j, i, str, (String) null);
        }
    }

    public void setLayerProperty(long j, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7478b569a95da89702ecce78b63d4f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7478b569a95da89702ecce78b63d4f73");
            return;
        }
        try {
            if (isDestroyedOn("setLayerProperty")) {
                return;
            }
            nativeSetLayerStringProperty(j, i, str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerPropertyByDataDriven(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec168a04712093edec46744405d47b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec168a04712093edec46744405d47b6e");
        } else {
            setLayerPropertyByDataDriven(j, i, str, null);
        }
    }

    public void setLayerPropertyByDataDriven(long j, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a68051fff4f6a609618440ccfc66d1b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a68051fff4f6a609618440ccfc66d1b0");
            return;
        }
        try {
            if (isDestroyedOn("setLayerPropertyByDataDriven")) {
                return;
            }
            nativeSetLayerPropertyByDataDriven(j, i, str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setLayerProperties(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b649be0d0838153c94618876ccb50205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b649be0d0838153c94618876ccb50205");
            return;
        }
        try {
            if (isDestroyedOn("setLayerProperties")) {
                return;
            }
            nativeSetLayerProperties(j, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void unsetLayerProperty(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0194dc7416c8570620d9cb7744984c96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0194dc7416c8570620d9cb7744984c96");
        } else {
            unsetLayerProperty(j, i, null);
        }
    }

    public void unsetLayerProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed4cfc8d37fd1fb115cf34c74ae476fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed4cfc8d37fd1fb115cf34c74ae476fa");
            return;
        }
        try {
            if (isDestroyedOn("unsetLayerProperty")) {
                return;
            }
            nativeUnsetLayerProperty(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void unsetLayerProperty(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5640d925601a3dad558786015479d4b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5640d925601a3dad558786015479d4b3");
        } else {
            unsetLayerProperty(j, (String) null);
        }
    }

    public void unsetLayerProperty(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8ebb5409c8d58e7c60e0f81e2f71208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8ebb5409c8d58e7c60e0f81e2f71208");
            return;
        }
        try {
            if (isDestroyedOn("unsetLayerProperty")) {
                return;
            }
            nativeUnsetLayerProperties(j, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addLayer(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfd91c0f2a45fdae852b402056fda0da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfd91c0f2a45fdae852b402056fda0da");
            return;
        }
        try {
            if (isDestroyedOn("addLayer")) {
                return;
            }
            nativeAddLayer2(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeAndDestroyLayer(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "980d42f711e2e27cdb97d5bf8b3c3d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "980d42f711e2e27cdb97d5bf8b3c3d74");
            return;
        }
        try {
            if (isDestroyedOn("removeAndDestroyLayer")) {
                return;
            }
            nativeRemoveAndDestroyLayer(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long copyLayer(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8971e96744c6ee6933cf88dc03c4e62d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8971e96744c6ee6933cf88dc03c4e62d")).longValue();
        }
        try {
            if (isDestroyedOn("copyLayer")) {
                return 0L;
            }
            return nativeCopyLayer(j, str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public long createGeojsonSource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fb98799d669813c990d5c2417d986a3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fb98799d669813c990d5c2417d986a3")).longValue() : createGeojsonSource(str, true, 2, 0.375d, true);
    }

    public long createGeojsonSource(String str, boolean z, int i, double d, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Double.valueOf(d), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61ce359e88cbc4e3e2021ae5aeffd863", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61ce359e88cbc4e3e2021ae5aeffd863")).longValue();
        }
        try {
            if (isDestroyedOn("createGeojsonSource")) {
                return 0L;
            }
            return nativeCreateGeojsonSource(str, z, i, d, z2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public String getGeojsonSourceID(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16654f790100495bdb782e5e502302ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16654f790100495bdb782e5e502302ce");
        }
        try {
            return isDestroyedOn("getGeojsonSourceID") ? "" : nativeGetGeojsonSourceID(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return "";
        }
    }

    public void addGeojsonSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac92959b02a3d40d5baa82443f28149c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac92959b02a3d40d5baa82443f28149c");
            return;
        }
        try {
            if (isDestroyedOn("addGeojsonSource")) {
                return;
            }
            nativeAddGeojsonSource(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeAndDestroyGeojsonSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cfb042af7b8e1ac734d0e25b97fb438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cfb042af7b8e1ac734d0e25b97fb438");
            return;
        }
        try {
            if (isDestroyedOn("removeAndDestroyGeojsonSource")) {
                return;
            }
            nativeRemoveAndDestroyGeojsonSource(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setGeojsonSourceUrl(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dcb71cede467d356e959ae29645ada4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dcb71cede467d356e959ae29645ada4");
            return;
        }
        try {
            if (isDestroyedOn("setGeojsonSourceUrl")) {
                return;
            }
            nativeSetGeojsonSourceUrl(j, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void refImages(long j, String[] strArr) {
        Object[] objArr = {new Long(j), strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "368473f6af2ab8bf187c89fa741df804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "368473f6af2ab8bf187c89fa741df804");
            return;
        }
        try {
            if (isDestroyedOn("refImages")) {
                return;
            }
            nativeRefImages(j, strArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setGeojsonSourceThreadMode(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8fd3c89c5f7948b717bc764e32a429e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8fd3c89c5f7948b717bc764e32a429e");
            return;
        }
        try {
            if (isDestroyedOn("setGeojsonSourceThreadMode")) {
                return;
            }
            nativeSetGeojsonSourceThreadMode(j, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setFeatureNum(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9324068de74198eeb8942ef6a5144414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9324068de74198eeb8942ef6a5144414");
            return;
        }
        try {
            if (isDestroyedOn("setFeatureNum")) {
                return;
            }
            nativeSetFeatureNum(j, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setFeature(long j, int i, int i2, double[] dArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29f2bdd505137af8e7e848654f1d8c8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29f2bdd505137af8e7e848654f1d8c8c");
        } else {
            setFeature(j, i, i2, dArr, null);
        }
    }

    public void setFeature(long j, int i, int i2, double[] dArr, int[] iArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), dArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea0f57505cea7b3cc495bf2e5a50ff5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea0f57505cea7b3cc495bf2e5a50ff5a");
            return;
        }
        try {
            if (isDestroyedOn("setFeature")) {
                return;
            }
            nativeSetFeature(j, i, i2, dArr, iArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeFeature(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac95b7e0d5fcd555db64eee02fce03f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac95b7e0d5fcd555db64eee02fce03f5");
            return;
        }
        try {
            if (isDestroyedOn("removeFeature")) {
                return;
            }
            nativeRemoveFeature(j, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addFeatureProperty(long j, int i, String str, boolean z) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af095591b905426ff3ecd5a726039788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af095591b905426ff3ecd5a726039788");
            return;
        }
        try {
            if (isDestroyedOn("addFeatureProperty")) {
                return;
            }
            nativeAddFeatureBooleanProperty(j, i, str, z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addFeatureProperty(long j, int i, String str, double d) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85845909588f2715c5de30a237475f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85845909588f2715c5de30a237475f54");
            return;
        }
        try {
            if (isDestroyedOn("addFeatureProperty")) {
                return;
            }
            nativeAddFeatureDoubleProperty(j, i, str, d);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addFeatureProperty(long j, int i, String str, double[] dArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c42d97bef9b874230475575768bc46bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c42d97bef9b874230475575768bc46bc");
            return;
        }
        try {
            if (isDestroyedOn("addFeatureProperty")) {
                return;
            }
            nativeAddFeatureDoubleArrayProperty(j, i, str, dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void addFeatureProperty(long j, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4c271049ec862f8fdc6518ad9a7aae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4c271049ec862f8fdc6518ad9a7aae8");
            return;
        }
        try {
            if (isDestroyedOn("addFeatureProperty")) {
                return;
            }
            nativeAddFeatureStringProperty(j, i, str, str2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setAutoMergePropertyKey(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15037482ef38dc6b4d5fa3120f444a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15037482ef38dc6b4d5fa3120f444a92");
            return;
        }
        try {
            if (isDestroyedOn("setAutoMergePropertyKey")) {
                return;
            }
            nativeSetAutoMergePropertyKey(j, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setDebugTileBorder(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11a864fa693bef43c142dbbc682b94a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11a864fa693bef43c142dbbc682b94a8");
        } else {
            setDebugTileBorder(z, "sankuai");
        }
    }

    public void setDebugTileBorder(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "367c4e8c3b32f4dc0b35c569d999f337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "367c4e8c3b32f4dc0b35c569d999f337");
            return;
        }
        try {
            if (isDestroyedOn("setDebugTileBorder")) {
                return;
            }
            nativeSetDebugTileBorder2(z, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setDebugTileState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d88bcf7d366217aa83b6dae327b0a33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d88bcf7d366217aa83b6dae327b0a33f");
            return;
        }
        try {
            if (isDestroyedOn("setDebugTileState")) {
                return;
            }
            nativeSetDebugTileState(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long createImageSource(String str, double[] dArr) {
        Object[] objArr = {str, dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0af50b7b3f94649821d2bacc30e5b87", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0af50b7b3f94649821d2bacc30e5b87")).longValue();
        }
        try {
            if (isDestroyedOn("createImageSource")) {
                return 0L;
            }
            return nativeCreateImageSource(str, dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public void addImageSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "913169939cda50b1926d2b2d779baeb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "913169939cda50b1926d2b2d779baeb5");
            return;
        }
        try {
            if (isDestroyedOn("addImageSource")) {
                return;
            }
            nativeAddImageSource(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeAndDestroyImageSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a5901c4e2c0a10aa8dcd77fccc73a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a5901c4e2c0a10aa8dcd77fccc73a0d");
            return;
        }
        try {
            if (isDestroyedOn("removeAndDestroyImageSource")) {
                return;
            }
            nativeRemoveAndDestroyImageSource(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setImageCoord(long j, double[] dArr) {
        Object[] objArr = {new Long(j), dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97f30faedfb740ce87c5914c4d8e1597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97f30faedfb740ce87c5914c4d8e1597");
            return;
        }
        try {
            if (isDestroyedOn("setImageCoord")) {
                return;
            }
            nativeSetImageCoord(j, dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setImage(long j, int i, int i2, float f, byte[] bArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc8198619144fd8caef8a4d524cd0343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc8198619144fd8caef8a4d524cd0343");
            return;
        }
        try {
            if (isDestroyedOn("setImage")) {
                return;
            }
            nativeSetImage(j, i, i2, f, bArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long createRasterSource(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7b48d587f688d7e841d22980cef03ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7b48d587f688d7e841d22980cef03ee")).longValue();
        }
        try {
            if (isDestroyedOn("createRasterSource")) {
                return 0L;
            }
            return nativeCreateRasterSource(str, str2, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public void addRasterSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed378103ab66f26347f9c3cb49a60b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed378103ab66f26347f9c3cb49a60b82");
            return;
        }
        try {
            if (isDestroyedOn("addRasterSource")) {
                return;
            }
            nativeAddRasterSource(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void removeAndDestroyRasterSource(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee7248e5e3b8d172ab2c239cf18bf535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee7248e5e3b8d172ab2c239cf18bf535");
            return;
        }
        try {
            if (isDestroyedOn("removeAndDestroyRasterSource")) {
                return;
            }
            nativeRemoveAndDestroyRasterSource(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setRasterForeign(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b836c60953688473af77893bd6aeb937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b836c60953688473af77893bd6aeb937");
            return;
        }
        try {
            if (isDestroyedOn("setRasterForeign")) {
                return;
            }
            nativeSetRasterForeign(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public long createAndAddArrow(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc25a53c6e2512562c04724e3846f86a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc25a53c6e2512562c04724e3846f86a")).longValue();
        }
        try {
            if (isDestroyedOn("createAndAddArrow")) {
                return 0L;
            }
            return nativeCreateAndAddArrow(f, 2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public long createAndAddArrow(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dc278fcfad429691f302ca43d4604c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dc278fcfad429691f302ca43d4604c5")).longValue();
        }
        try {
            if (isDestroyedOn("createAndAddArrow")) {
                return 0L;
            }
            return nativeCreateAndAddArrow(f, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return 0L;
        }
    }

    public void removeAndDestroyArrow(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ac79e8ad30306334fc2802c4bdbf524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ac79e8ad30306334fc2802c4bdbf524");
            return;
        }
        try {
            if (isDestroyedOn("removeAndDestroyArrow")) {
                return;
            }
            nativeRemoveAndDestroyArrow(j);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowFeatureNum(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17817fd24b87a755a9bfbdb38873a207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17817fd24b87a755a9bfbdb38873a207");
            return;
        }
        try {
            if (isDestroyedOn("setFeatureNum")) {
                return;
            }
            nativeSetArrowFeatureNum(j, i);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowFeature(long j, int i, double[] dArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c87d84d5cacc4ebd2b30b99ceae8d1b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c87d84d5cacc4ebd2b30b99ceae8d1b5");
            return;
        }
        try {
            if (isDestroyedOn("setArrowFeature")) {
                return;
            }
            nativeSetArrowFeature(j, i, dArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowWidth(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12887be0f6784576fe46d8dcd2b256ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12887be0f6784576fe46d8dcd2b256ce");
            return;
        }
        try {
            if (isDestroyedOn("setArrowWidth")) {
                return;
            }
            nativeSetArrowWidth(j, f);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerProperty(long j, int i, boolean z) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72cb5b763ad7523dcab89a4142072fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72cb5b763ad7523dcab89a4142072fcc");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerProperty")) {
                return;
            }
            nativeSetArrowLayerBooleanProperty(j, i, z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerProperty(long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb92f15dfd8f4baa787bebe40e85338a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb92f15dfd8f4baa787bebe40e85338a");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerProperty")) {
                return;
            }
            nativeSetArrowLayerIntProperty(j, i, i2);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerProperty(long j, int i, float f) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbcb107684a65d2c6f15d1227d900fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbcb107684a65d2c6f15d1227d900fbc");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerProperty")) {
                return;
            }
            nativeSetArrowLayerFloatProperty(j, i, f);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerProperty(long j, int i, float[] fArr) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb2f3308794414f8d5dafe306726b503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb2f3308794414f8d5dafe306726b503");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerProperty")) {
                return;
            }
            nativeSetArrowLayerFloatArrayProperty(j, i, fArr);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerProperty(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f7ac840b2d6db3c209d02752f4f9bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f7ac840b2d6db3c209d02752f4f9bbb");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerProperty")) {
                return;
            }
            nativeSetArrowLayerStringProperty(j, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerOrder(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89f3d5f9844e5359d1717c9d338c53c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89f3d5f9844e5359d1717c9d338c53c7");
        } else {
            setArrowLayerOrder(j, f, 0);
        }
    }

    public void setArrowLayerOrder(long j, float f, int i) {
        Object[] objArr = {new Long(j), Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b84ea122b0ea081e400444d6aba7c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b84ea122b0ea081e400444d6aba7c2e");
        } else {
            setArrowLayerOrder(j, f, i, null);
        }
    }

    public void setArrowLayerOrder(long j, float f, int i, String str) {
        Object[] objArr = {new Long(j), Float.valueOf(f), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5811f4160cef2bd0214842b6009332c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5811f4160cef2bd0214842b6009332c2");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerOrder")) {
                return;
            }
            nativeSetArrowLayerOrder(j, f, i, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerVisibility(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2353b5c5c4ba884815fc675cdb40ba3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2353b5c5c4ba884815fc675cdb40ba3c");
        } else {
            setArrowLayerVisibility(j, z, null);
        }
    }

    public void setArrowLayerVisibility(long j, boolean z, String str) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d9153480b9d4ac1de2f42a3dd546acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d9153480b9d4ac1de2f42a3dd546acd");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerVisibility")) {
                return;
            }
            nativeSetArrowLayerVisibility(j, z, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerMinZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "583af9778af06d534a3335a81ca65572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "583af9778af06d534a3335a81ca65572");
        } else {
            setArrowLayerMinZoom(j, f, null);
        }
    }

    public void setArrowLayerMinZoom(long j, float f, String str) {
        Object[] objArr = {new Long(j), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fca89a37312c5bd2923cd5b9aefbfa65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fca89a37312c5bd2923cd5b9aefbfa65");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerMinZoom")) {
                return;
            }
            nativeSetArrowLayerMinZoom(j, f, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void setArrowLayerMaxZoom(long j, float f) {
        Object[] objArr = {new Long(j), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "349f4132c973d7dc957f9105df02557b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "349f4132c973d7dc957f9105df02557b");
        } else {
            setArrowLayerMaxZoom(j, f, null);
        }
    }

    public void setArrowLayerMaxZoom(long j, float f, String str) {
        Object[] objArr = {new Long(j), Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1db3c2cc2807ece59099619940cefcbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1db3c2cc2807ece59099619940cefcbe");
            return;
        }
        try {
            if (isDestroyedOn("setArrowLayerMaxZoom")) {
                return;
            }
            nativeSetArrowLayerMaxZoom(j, f, str);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public void createRoadCrossing(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e429eea2d7ca0036f9169227e0773bb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e429eea2d7ca0036f9169227e0773bb1");
            return;
        }
        try {
            nativeCreateRoadCrossing(str);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void destroyRoadCrossing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e269e7065a5d8034dec5fdbaee0cf27a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e269e7065a5d8034dec5fdbaee0cf27a");
            return;
        }
        try {
            nativeDestroyRoadCrossing();
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void setRoadCrossingID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db05ba7447d7af4f8c9ec382e358e678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db05ba7447d7af4f8c9ec382e358e678");
            return;
        }
        try {
            nativeSetRoadCrossingID(str);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public int createOrSetScreenImage(int i, float[] fArr, String str, float[] fArr2, float[] fArr3, float[] fArr4) {
        Object[] objArr = {Integer.valueOf(i), fArr, str, fArr2, fArr3, fArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cccd000d8eb4517fce6775d52509364f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cccd000d8eb4517fce6775d52509364f")).intValue();
        }
        try {
            if (isDestroyedOn("createOrSetScreenImage")) {
                return 0;
            }
            return nativeCreateOrSetScreenImage(i, fArr, str, fArr2, fArr3, fArr4);
        } catch (Throwable th) {
            String.format("%s", th);
            return 0;
        }
    }

    public void removeScreenImage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "205cb46713804776f6d23395fe491c08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "205cb46713804776f6d23395fe491c08");
            return;
        }
        try {
            nativeRemoveScreenImage(i);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void setRoadBlock(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "949775c4cfd3a05127a98521593c04b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "949775c4cfd3a05127a98521593c04b0");
            return;
        }
        try {
            if (isDestroyedOn("setRoadBlock")) {
                return;
            }
            nativeSetRoadBlock(z);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
        }
    }

    public String outputFuncCallRecordList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3a57c96e653a3d819421d06bdfe323e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3a57c96e653a3d819421d06bdfe323e");
        }
        try {
            return isDestroyedOn("outputFuncCallRecordList") ? "" : nativeOutputFuncCallRecordList();
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return "";
        }
    }

    public double getMaxPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e45de385c4d5cddd19ed8bc771b17734", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e45de385c4d5cddd19ed8bc771b17734")).doubleValue();
        }
        try {
            return nativeGetMaxPitch();
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public double getMinPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73d9dbc6d2a1aa5810e62eb0434ca5fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73d9dbc6d2a1aa5810e62eb0434ca5fa")).doubleValue();
        }
        try {
            return nativeGetMinPitch();
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public void enableEventListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1f1994328ac43f30901e633af7c0e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1f1994328ac43f30901e633af7c0e2e");
            return;
        }
        try {
            if (isDestroyedOn("enableEventListener")) {
                return;
            }
            nativeEnableEventListener();
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void setWeatherType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f156b64be42ff554838a954df729ac76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f156b64be42ff554838a954df729ac76");
            return;
        }
        try {
            if (isDestroyedOn("setWeatherType")) {
                return;
            }
            nativeSetWeatherType(i);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void disableWeather() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7244f7ab3882c4ec860b4e4379655ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7244f7ab3882c4ec860b4e4379655ad7");
            return;
        }
        try {
            if (isDestroyedOn("disableWeather")) {
                return;
            }
            nativeDisableWeather();
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void setWeatherIntensity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "959cf7ff7a2100296b0ced840656f4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "959cf7ff7a2100296b0ced840656f4af");
            return;
        }
        try {
            if (isDestroyedOn("setWeatherIntensity")) {
                return;
            }
            nativeSetWeatherIntensity(f);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void setWeatherAutoUpdate(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "394789b54ad3d224ad345b33872043d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "394789b54ad3d224ad345b33872043d1");
            return;
        }
        try {
            if (isDestroyedOn("setWeatherAutoUpdate")) {
                return;
            }
            nativeSetWeatherAutoUpdate(z);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void setPreloadParentTileLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cebe36d8f1927646a34ee63ee34cd0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cebe36d8f1927646a34ee63ee34cd0d");
            return;
        }
        try {
            if (isDestroyedOn("setPreloadParentTileLevel")) {
                return;
            }
            nativeSetPreloadParentTileLevel(i);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public void refreshFrame(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b162210f5c0aac8f4e9bcf7c82d06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b162210f5c0aac8f4e9bcf7c82d06f");
            return;
        }
        try {
            if (isDestroyedOn("refreshFrame")) {
                return;
            }
            nativeRefreshFrame(z);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public long getRenderFrameNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1613f1e22005305e40df51e698cd15c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1613f1e22005305e40df51e698cd15c0")).longValue();
        }
        try {
            if (isDestroyedOn("getRenderFrameNum")) {
                return 0L;
            }
            return nativeGetRenderFrameNum();
        } catch (Throwable th) {
            String.format("%s", th);
            return 0L;
        }
    }

    public static boolean clearOfflineData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c54b1bdc70c6a653fe455c21b82e0af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c54b1bdc70c6a653fe455c21b82e0af")).booleanValue();
        }
        try {
            return nativeClearOfflineData(str);
        } catch (Throwable th) {
            String.format("%s", th);
            return false;
        }
    }

    public static boolean clearPartOfflineData(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62a41ce82e10c63bde5f2747673afde1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62a41ce82e10c63bde5f2747673afde1")).booleanValue();
        }
        try {
            return nativeClearPartOfflineData(str, j);
        } catch (Throwable th) {
            String.format("%s", th);
            return false;
        }
    }

    public static void addStyleUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d029c60d083e8992c1d2f008657a75bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d029c60d083e8992c1d2f008657a75bc");
            return;
        }
        try {
            nativeAddStyleUrl(str, str2);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public static void removeStyleUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb3dbe833f02df73d029a71af9c241b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb3dbe833f02df73d029a71af9c241b6");
            return;
        }
        try {
            nativeRemoveStyleUrl(str);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public static void setHostType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95f5de26319cd0642ebe2d26423435f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95f5de26319cd0642ebe2d26423435f8");
            return;
        }
        try {
            nativeSetHostType(i);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public static int getHostType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0447fbf632b3ca691a7850e6ca8cc13", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0447fbf632b3ca691a7850e6ca8cc13")).intValue();
        }
        try {
            return nativeGetHostType();
        } catch (Throwable th) {
            String.format("%s", th);
            return -1;
        }
    }

    public static void addBaseUrl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b7fa33592d28e41b7468c927dc241ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b7fa33592d28e41b7468c927dc241ca");
            return;
        }
        try {
            nativeAddBaseUrl(str, str2);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public static void addUrlParameters(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc7b46c69601ad251be1a97f0305c9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc7b46c69601ad251be1a97f0305c9d4");
            return;
        }
        try {
            nativeAddUrlParameters(str, str2);
        } catch (Throwable th) {
            String.format("%s", th);
        }
    }

    public static String getDefaultStylesName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36a7e82342cc1d9c66655e5aa121ed61", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36a7e82342cc1d9c66655e5aa121ed61");
        }
        try {
            return nativeGetDefaultStylesName();
        } catch (Throwable th) {
            String.format("%s", th);
            return "";
        }
    }

    public static double[] projectedMetersForLatLng(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85023dfb72512589d88589302a7fb28c", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85023dfb72512589d88589302a7fb28c");
        }
        try {
            return nativeProjectedMetersForLatLng(dArr);
        } catch (Throwable th) {
            String.format("%s", th);
            return new double[]{0.0d, 0.0d};
        }
    }

    public static double[] latLngForProjectedMeters(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8eddf353b5e95e192e53d0162bcd849c", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8eddf353b5e95e192e53d0162bcd849c");
        }
        try {
            return nativeLatLngForProjectedMeters(dArr);
        } catch (Throwable th) {
            String.format("%s", th);
            return new double[]{0.0d, 0.0d};
        }
    }

    public static double getMetersPerPixelAtLatitude(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16bee1b7ac19e901722fa77a5fec959f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16bee1b7ac19e901722fa77a5fec959f")).doubleValue();
        }
        try {
            return nativeGetMetersPerPixelAtLatitude2(d, d2);
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public static double getProjectedMetersPerPixel(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d363ab9c5235a34c55bd45c2606b1343", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d363ab9c5235a34c55bd45c2606b1343")).doubleValue();
        }
        try {
            return nativeGetProjectedMetersPerPixel2(d);
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public static double getMercatorRatio(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3be030a22cf6b168511f4fc57a2c6f88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3be030a22cf6b168511f4fc57a2c6f88")).doubleValue();
        }
        try {
            return nativeGetMercatorRatio(d);
        } catch (Throwable th) {
            String.format("%s", th);
            return 1.0d;
        }
    }

    public static double[] project(double[] dArr, double d) {
        Object[] objArr = {dArr, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c325457bdf7654db378fec4b868a398", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c325457bdf7654db378fec4b868a398");
        }
        try {
            return nativeProject(dArr, d);
        } catch (Throwable th) {
            String.format("%s", th);
            return new double[]{0.0d, 0.0d};
        }
    }

    public static double[] unproject(double[] dArr, double d) {
        Object[] objArr = {dArr, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "178fa18408b9eb2b89f0f075fddfff76", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "178fa18408b9eb2b89f0f075fddfff76");
        }
        try {
            return nativeUnproject(dArr, d);
        } catch (Throwable th) {
            String.format("%s", th);
            return new double[]{0.0d, 0.0d};
        }
    }

    public static double[] getHexagonBoundsByLatLng(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b32f1a8cecb073f36f949a8ad1db4a04", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b32f1a8cecb073f36f949a8ad1db4a04");
        }
        try {
            return nativeGetHexagonBoundsByLatLng(d, d2, d3, d4, 0.0d);
        } catch (Throwable th) {
            String.format("%s", th);
            return new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
        }
    }

    public static double[] getHexagonBoundsByLatLng(double d, double d2, double d3, double d4, double d5) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bc44687918cece9ad57e50f01ada15d", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bc44687918cece9ad57e50f01ada15d");
        }
        try {
            return nativeGetHexagonBoundsByLatLng(d, d2, d3, d4, d5);
        } catch (Throwable th) {
            String.format("%s", th);
            return new double[]{0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
        }
    }

    public static String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c97956cb6f4cbc6dc505c0e47354b15", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c97956cb6f4cbc6dc505c0e47354b15");
        }
        try {
            return nativeGetVersion();
        } catch (Throwable th) {
            String.format("%s", th);
            return "";
        }
    }

    public static boolean checkVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d96d14754ec6e4c58bb73b42b0d8f16d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d96d14754ec6e4c58bb73b42b0d8f16d")).booleanValue();
        }
        try {
            return nativeCheckVersion(str);
        } catch (Throwable th) {
            String.format("%s", th);
            return false;
        }
    }

    public static int getBaseStyleNum() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d6ecd83c19c21d094567544717f5238", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d6ecd83c19c21d094567544717f5238")).intValue();
        }
        try {
            return nativeGetBaseStyleNum();
        } catch (Throwable th) {
            String.format("%s", th);
            return 0;
        }
    }

    public static String getBaseStyleName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f436c61ff83989f301a0aaed544283c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f436c61ff83989f301a0aaed544283c6");
        }
        try {
            return nativeGetBaseStyleName(i);
        } catch (Throwable th) {
            String.format("%s", th);
            return "";
        }
    }

    public static String getBaseStyleUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "651c03585fc2143ba3557e9c7b6178ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "651c03585fc2143ba3557e9c7b6178ff");
        }
        try {
            return nativeGetBaseStyleUrl(str);
        } catch (Throwable th) {
            String.format("%s", th);
            return "";
        }
    }

    public static double getGlobalMaxPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "575ef02d2fb9706d46a89af537f2aaea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "575ef02d2fb9706d46a89af537f2aaea")).doubleValue();
        }
        try {
            return nativeGetGlobalMaxPitch();
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public static double getGlobalMinPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75aa410ac8df52a7f6823fa80b9016f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75aa410ac8df52a7f6823fa80b9016f4")).doubleValue();
        }
        try {
            return nativeGetGlobalMinPitch();
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public static double getSphericalDistance(double[] dArr) {
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c0d3d3e8f80bc1a9eb672310392d912", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c0d3d3e8f80bc1a9eb672310392d912")).doubleValue();
        }
        try {
            return nativeGetSphericalDistance(dArr);
        } catch (Throwable th) {
            String.format("%s", th);
            return 0.0d;
        }
    }

    public static boolean checkPolygonContainsPoint(double[] dArr, double[] dArr2) {
        Object[] objArr = {dArr, dArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a3b96b980ead2a168264c07a191316e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a3b96b980ead2a168264c07a191316e")).booleanValue();
        }
        try {
            return nativeCheckPolygonContainsPoint(dArr, dArr2);
        } catch (Throwable th) {
            String.format("%s", th);
            return false;
        }
    }

    public static float[] getMatrix(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        Object[] objArr = {fArr, fArr2, fArr3, fArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afa48238e0bdac2529228efc01906a04", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afa48238e0bdac2529228efc01906a04");
        }
        try {
            return nativeGetMatrix(fArr, fArr2, fArr3, fArr4);
        } catch (Throwable th) {
            String.format("%s", th);
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
    }

    public static boolean isSoLoaded() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19ac4ce216705b8f3e26daf46020f722", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19ac4ce216705b8f3e26daf46020f722")).booleanValue();
        }
        try {
            nativeSoLoadedTest();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
