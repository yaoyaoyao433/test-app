package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public class ReactMarker {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i, long j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i);
    }

    @DoNotStrip
    public static void addListener(MarkerListener markerListener) {
        Object[] objArr = {markerListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e92972ccb475dd9f448cf48e02b172a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e92972ccb475dd9f448cf48e02b172a");
        } else if (sListeners.contains(markerListener)) {
        } else {
            sListeners.add(markerListener);
        }
    }

    @DoNotStrip
    public static void removeListener(MarkerListener markerListener) {
        Object[] objArr = {markerListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f1c8f2ba8f7d9746daa29281bfb7cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f1c8f2ba8f7d9746daa29281bfb7cd2");
        } else {
            sListeners.remove(markerListener);
        }
    }

    @DoNotStrip
    public static void clearMarkerListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4726611ec65d754ad43723e4bef8bb68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4726611ec65d754ad43723e4bef8bb68");
        } else {
            sListeners.clear();
        }
    }

    @DoNotStrip
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        Object[] objArr = {fabricMarkerListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64b2f059d136359e3b3c47506bb8c1d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64b2f059d136359e3b3c47506bb8c1d7");
        } else if (sFabricMarkerListeners.contains(fabricMarkerListener)) {
        } else {
            sFabricMarkerListeners.add(fabricMarkerListener);
        }
    }

    @DoNotStrip
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        Object[] objArr = {fabricMarkerListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "429bc5e3bd6a3ff8d86b5e6341fab3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "429bc5e3bd6a3ff8d86b5e6341fab3b9");
        } else {
            sFabricMarkerListeners.remove(fabricMarkerListener);
        }
    }

    @DoNotStrip
    public static void clearFabricMarkerListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9daebcc2918cec29e2a51a970c5c14d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9daebcc2918cec29e2a51a970c5c14d4");
        } else {
            sFabricMarkerListeners.clear();
        }
    }

    @DoNotStrip
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i, long j) {
        Object[] objArr = {reactMarkerConstants, str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b03b88c56cc06c9a3966fce2ceb24fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b03b88c56cc06c9a3966fce2ceb24fd");
            return;
        }
        for (FabricMarkerListener fabricMarkerListener : sFabricMarkerListeners) {
            fabricMarkerListener.logFabricMarker(reactMarkerConstants, str, i, j);
        }
    }

    @DoNotStrip
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i) {
        Object[] objArr = {reactMarkerConstants, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e44c5e1ce9bb3163a29b9f982d84d3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e44c5e1ce9bb3163a29b9f982d84d3a3");
        } else {
            logFabricMarker(reactMarkerConstants, str, i, -1L);
        }
    }

    @DoNotStrip
    public static void logMarker(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9af119ff9fed5885e7d6f8fd6f81f245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9af119ff9fed5885e7d6f8fd6f81f245");
        } else {
            logMarker(str, (String) null);
        }
    }

    @DoNotStrip
    public static void logMarker(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74de67c1c51e524bcff9545f0a37f8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74de67c1c51e524bcff9545f0a37f8cc");
        } else {
            logMarker(str, (String) null, i);
        }
    }

    @DoNotStrip
    public static void logMarker(String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "523f07b17fa49c017670c3db5522f2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "523f07b17fa49c017670c3db5522f2ba");
        } else {
            logMarker(str, str2, 0);
        }
    }

    @DoNotStrip
    public static void logMarker(String str, @Nullable String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59c5f7662078ae2d072f1c30a1ac415c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59c5f7662078ae2d072f1c30a1ac415c");
        } else {
            logMarker(ReactMarkerConstants.valueOf(str), str2, i);
        }
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        Object[] objArr = {reactMarkerConstants};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "927ca5cfcf9da23550900f5e8b7ff6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "927ca5cfcf9da23550900f5e8b7ff6cb");
        } else {
            logMarker(reactMarkerConstants, (String) null, 0);
        }
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        Object[] objArr = {reactMarkerConstants, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f9ffea436c13fe13c9ac9b8a3c7232a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f9ffea436c13fe13c9ac9b8a3c7232a");
        } else {
            logMarker(reactMarkerConstants, (String) null, i);
        }
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str) {
        Object[] objArr = {reactMarkerConstants, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c104634dad98dbcfcd5c3a3a77c319ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c104634dad98dbcfcd5c3a3a77c319ed");
        } else {
            logMarker(reactMarkerConstants, str, 0);
        }
    }

    @DoNotStrip
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i) {
        Object[] objArr = {reactMarkerConstants, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c6c779288ad6b2811284f77643023e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c6c779288ad6b2811284f77643023e1");
            return;
        }
        logFabricMarker(reactMarkerConstants, str, i);
        for (MarkerListener markerListener : sListeners) {
            markerListener.logMarker(reactMarkerConstants, str, i);
        }
    }
}
