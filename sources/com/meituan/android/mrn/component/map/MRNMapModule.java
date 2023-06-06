package com.meituan.android.mrn.component.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ar;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.component.map.utils.h;
import com.meituan.android.mrn.component.map.view.childview.l;
import com.meituan.android.mrn.component.map.view.childview.tile.b;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.DynamicMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.Projection;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlay;
import com.sankuai.meituan.mapsdk.maps.model.VisibleRegion;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
@Keep
@SuppressLint({"nammu_check_error"})
/* loaded from: classes2.dex */
public class MRNMapModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    public b mrnMapExtraProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, boolean z);
    }

    public MRNMapModule(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6af87f5ec8e0c984ce490c1dc0b18a8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6af87f5ec8e0c984ce490c1dc0b18a8c");
        } else {
            this.mrnMapExtraProvider = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDynamicMapImage(final Context context, final com.meituan.android.mrn.component.map.view.map.c cVar, final String str, String str2, final int i, final int i2, final a aVar) {
        Object[] objArr = {context, cVar, str, str2, Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d970bc28fa1a16e40b72a221446aa6e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d970bc28fa1a16e40b72a221446aa6e6");
        } else if (context == null || cVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            aVar.a(str, false);
        } else {
            com.meituan.android.mrn.component.map.utils.c.a(context).a(str2, new Target() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.13
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5b316d2067da5758a23ff495d7177049", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5b316d2067da5758a23ff495d7177049");
                    } else {
                        aVar.a(str, false);
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    int a2;
                    Context context2;
                    int height;
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ed9c57cce57a6987468fc172708f0d1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ed9c57cce57a6987468fc172708f0d1c");
                    } else if (bitmap == null) {
                    } else {
                        if (i <= 0 || i2 <= 0) {
                            a2 = com.meituan.android.mrn.component.map.utils.b.a(context, bitmap.getWidth());
                            context2 = context;
                            height = bitmap.getHeight();
                        } else {
                            a2 = com.meituan.android.mrn.component.map.utils.b.a(context, i);
                            context2 = context;
                            height = i2;
                        }
                        try {
                            BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(str, com.meituan.android.mrn.component.map.utils.c.a(bitmap, a2, com.meituan.android.mrn.component.map.utils.b.a(context2, height)));
                            com.meituan.android.mrn.component.map.view.map.c cVar2 = cVar;
                            Object[] objArr3 = {fromBitmap};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                            if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect4, false, "e2f14358aaa5b02977e2f468b6cfc54b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect4, false, "e2f14358aaa5b02977e2f468b6cfc54b");
                            } else if (fromBitmap == null) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("addDynamicMapImage bitmapDescriptor is null"), "param");
                            } else {
                                DynamicMap dynamicMap = cVar2.C;
                                if (cVar2.a(dynamicMap)) {
                                    dynamicMap.addDynamicMapImage(fromBitmap);
                                }
                            }
                            aVar.a(str, true);
                        } catch (Exception unused) {
                            aVar.a(str, false);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.meituan.android.mrn.component.map.view.map.c getMapViewDelegate(NativeViewHierarchyManager nativeViewHierarchyManager, int i) {
        Object[] objArr = {nativeViewHierarchyManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c81fd3bec65ff83b277bc7e173140010", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.component.map.view.map.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c81fd3bec65ff83b277bc7e173140010") : getMapViewDelegate(getRealMapView(nativeViewHierarchyManager, i));
    }

    private com.meituan.android.mrn.component.map.view.map.c getMapViewDelegate(AbstractMapView abstractMapView) {
        Object[] objArr = {abstractMapView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5faf42fccf0930d4d265352d454b49a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.component.map.view.map.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5faf42fccf0930d4d265352d454b49a");
        }
        if (abstractMapView == null || !(abstractMapView instanceof com.meituan.android.mrn.component.map.view.map.a)) {
            return null;
        }
        return ((com.meituan.android.mrn.component.map.view.map.a) abstractMapView).getMapViewDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractMapView getRealMapView(NativeViewHierarchyManager nativeViewHierarchyManager, int i) {
        Object[] objArr = {nativeViewHierarchyManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3211a357b18dbc6a6921ff4faa5670ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractMapView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3211a357b18dbc6a6921ff4faa5670ee");
        }
        try {
            View d = nativeViewHierarchyManager.d(i);
            if (d instanceof AbstractMapView) {
                return (AbstractMapView) d;
            }
            if (d instanceof FrameLayout) {
                View childAt = ((ViewGroup) d).getChildAt(0);
                if (childAt instanceof AbstractMapView) {
                    return (AbstractMapView) childAt;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            com.meituan.android.mrn.component.map.utils.e.a(e, "other");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableArray queueToWritableArr(Queue<String> queue) {
        Object[] objArr = {queue};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea360c5ac45f0c39b5f927af8c6ea977", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea360c5ac45f0c39b5f927af8c6ea977");
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (queue != null && queue.size() != 0) {
            for (int i = 0; i < queue.size(); i++) {
                writableNativeArray.pushString(queue.peek());
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void addDynamicMapGeoJSON(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e31d08be25adf3d983613e1150bd4e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e31d08be25adf3d983613e1150bd4e76");
        } else if (readableMap == null || promise == null) {
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.8
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "07803e2f347afb6844fd031642aa3d87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "07803e2f347afb6844fd031642aa3d87");
                        return;
                    }
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "geoJSON") || !com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "geoJSONKey")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[addDynamicMapGeoJSON]: geoJSON or geoJSONKey is null" + readableMap.toString()), "param");
                            }
                            com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                            if (mapViewDelegate == null) {
                                promise.reject("-1", "[addDynamicMapGeoJSON]:MRNMapViewDelegate is null");
                                return;
                            }
                            if (readableMap.getMap("args").hasKey("jstimestamp")) {
                                mapViewDelegate.a("kDynamicMapAddOverlayToNativeBrigeTime", (long) readableMap.getMap("args").getDouble("jstimestamp"));
                            }
                            String string = readableMap.getMap("args").getString("geoJSONKey");
                            String string2 = readableMap.getMap("args").getString("geoJSON");
                            Object[] objArr3 = {string, string2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                            if (PatchProxy.isSupport(objArr3, mapViewDelegate, changeQuickRedirect4, false, "d5342decfd20c2ae368b384cf110905e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, mapViewDelegate, changeQuickRedirect4, false, "d5342decfd20c2ae368b384cf110905e");
                            } else {
                                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                                    DynamicMap dynamicMap = mapViewDelegate.C;
                                    if (mapViewDelegate.a(dynamicMap)) {
                                        dynamicMap.addDynamicMapGeoJSON(string, string2);
                                    }
                                }
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("setDynamicMapGeoJSON featureCollectionJson is null"), "param");
                            }
                            promise.resolve(0);
                            mapViewDelegate.a("kDynamicMapAddOverlayNativeTime", currentTimeMillis);
                            return;
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void addDynamicMapImages(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d716f5f38d8d309bd2b486067fba041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d716f5f38d8d309bd2b486067fba041");
        } else if (readableMap == null || promise == null) {
        } else {
            final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.11
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    int i;
                    int i2;
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "73ee43114101ef45df5b77508c2b259a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "73ee43114101ef45df5b77508c2b259a");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "imgs")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[addDynamicMapImages]: imgs is null" + readableMap.toString()), "param");
                            }
                            com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                            if (mapViewDelegate == null) {
                                promise.reject("-1", "[addDynamicMapImages]:MRNMapViewDelegate is null");
                                return;
                            }
                            ReadableArray array = readableMap.getMap("args").getArray("imgs");
                            int size = array.size();
                            if (size == 0) {
                                promise.resolve(new WritableNativeArray());
                                return;
                            }
                            final AtomicInteger atomicInteger = new AtomicInteger(size);
                            final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                            for (int i3 = 0; i3 < size; i3++) {
                                ReadableMap map = array.getMap(i3);
                                String string = map.hasKey("id") ? map.getString("id") : "";
                                String string2 = map.hasKey(Constants.TRAFFIC_URI) ? map.getString(Constants.TRAFFIC_URI) : "";
                                ReadableMap writableNativeMap = new WritableNativeMap();
                                if (map.hasKey(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
                                    writableNativeMap = map.getMap(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
                                }
                                if (writableNativeMap != null) {
                                    int i4 = writableNativeMap.hasKey("width") ? writableNativeMap.getInt("width") : 0;
                                    if (writableNativeMap.hasKey("height")) {
                                        i = i4;
                                        i2 = writableNativeMap.getInt("height");
                                        MRNMapModule.this.addDynamicMapImage(reactApplicationContext, mapViewDelegate, string, string2, i, i2, new a() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.11.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.meituan.android.mrn.component.map.MRNMapModule.a
                                            public final void a(String str, boolean z) {
                                                Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a319695bd6ca715f86995caacb91a179", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a319695bd6ca715f86995caacb91a179");
                                                    return;
                                                }
                                                if (z) {
                                                    concurrentLinkedQueue.add(str);
                                                }
                                                if (atomicInteger.decrementAndGet() == 0) {
                                                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                                                    writableNativeMap2.putArray("successIds", MRNMapModule.this.queueToWritableArr(concurrentLinkedQueue));
                                                    WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                                                    writableNativeMap3.putMap(APKStructure.Res_Type, (WritableMap) writableNativeMap2);
                                                    promise.resolve(writableNativeMap3);
                                                }
                                            }
                                        });
                                        mapViewDelegate.a("kDynamicMapAddResourceImagesNativeTime", currentTimeMillis);
                                    } else {
                                        i = i4;
                                    }
                                } else {
                                    i = 0;
                                }
                                i2 = 0;
                                MRNMapModule.this.addDynamicMapImage(reactApplicationContext, mapViewDelegate, string, string2, i, i2, new a() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.11.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.android.mrn.component.map.MRNMapModule.a
                                    public final void a(String str, boolean z) {
                                        Object[] objArr3 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a319695bd6ca715f86995caacb91a179", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a319695bd6ca715f86995caacb91a179");
                                            return;
                                        }
                                        if (z) {
                                            concurrentLinkedQueue.add(str);
                                        }
                                        if (atomicInteger.decrementAndGet() == 0) {
                                            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                                            writableNativeMap2.putArray("successIds", MRNMapModule.this.queueToWritableArr(concurrentLinkedQueue));
                                            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                                            writableNativeMap3.putMap(APKStructure.Res_Type, (WritableMap) writableNativeMap2);
                                            promise.resolve(writableNativeMap3);
                                        }
                                    }
                                });
                                mapViewDelegate.a("kDynamicMapAddResourceImagesNativeTime", currentTimeMillis);
                            }
                            return;
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void addMarkers(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07c41f4a0b77346e705b07f9a422472a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07c41f4a0b77346e705b07f9a422472a");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.4
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
            @Override // com.facebook.react.uimanager.ar
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void execute(com.facebook.react.uimanager.NativeViewHierarchyManager r12) {
                /*
                    Method dump skipped, instructions count: 371
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.map.MRNMapModule.AnonymousClass4.execute(com.facebook.react.uimanager.NativeViewHierarchyManager):void");
            }
        });
    }

    @ReactMethod
    public void addRipples(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5a310f1d17c55472aa1ee063166fba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5a310f1d17c55472aa1ee063166fba6");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.15
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                Object[] objArr2 = {nativeViewHierarchyManager};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3e07f10e57ccd922befabb0628f621f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3e07f10e57ccd922befabb0628f621f");
                    return;
                }
                try {
                    if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                        if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "ripples")) {
                            promise.resolve(0);
                            return;
                        }
                        int i = readableMap.getInt("tag");
                        ReadableArray array = readableMap.getMap("args").getArray("ripples");
                        com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, i);
                        if (mapViewDelegate == null) {
                            promise.reject("-1", "[addRipples]: MRNMapViewDelegate is null");
                            return;
                        }
                        List<l> a2 = com.meituan.android.mrn.component.map.utils.a.a(reactApplicationContext, mapViewDelegate.b, array);
                        Object[] objArr3 = {a2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                        if (PatchProxy.isSupport(objArr3, mapViewDelegate, changeQuickRedirect4, false, "537619e39a3245bc2c947ce3b7a825e6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, mapViewDelegate, changeQuickRedirect4, false, "537619e39a3245bc2c947ce3b7a825e6");
                        } else if (a2 != null && a2.size() != 0) {
                            if (mapViewDelegate.D == null) {
                                mapViewDelegate.D = new ArrayList();
                            }
                            mapViewDelegate.D.addAll(a2);
                            mapViewDelegate.g();
                        }
                        promise.resolve(com.meituan.android.mrn.component.map.utils.a.b(a2));
                        return;
                    }
                    Promise promise2 = promise;
                    promise2.reject("4", "params is error " + readableMap.toString());
                } catch (Exception e) {
                    promise.reject("4", e.getMessage());
                    com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                }
            }
        });
    }

    @ReactMethod
    public void calculateDistance(double d, double d2, double d3, double d4, Promise promise) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e8121cca6db1ff4c0d8ee951880d412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e8121cca6db1ff4c0d8ee951880d412");
        } else if (promise != null) {
            float[] fArr = new float[3];
            Location.distanceBetween(d, d2, d3, d4, fArr);
            promise.resolve(Float.valueOf(fArr[0]));
        }
    }

    @ReactMethod
    public void createDynamicMap(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f2a8d549065c073f4fe2c3d2b878f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f2a8d549065c073f4fe2c3d2b878f0");
        } else if (readableMap == null || promise == null) {
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.7
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a23e85aea0225e9849e7bad648cb99fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a23e85aea0225e9849e7bad648cb99fe");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "styleName")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: styleName is null" + readableMap.toString()), "param");
                                return;
                            } else if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "styleJSON")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: styleJSON is null" + readableMap.toString()), "param");
                                return;
                            } else if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "type")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: type is null" + readableMap.toString()), "param");
                                return;
                            } else {
                                com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                                if (mapViewDelegate == null) {
                                    promise.reject("-1", "[createDynamicMap]:MRNMapViewDelegate is null");
                                    return;
                                }
                                if (readableMap.getMap("args").hasKey("jstimestamp")) {
                                    mapViewDelegate.a("kDynamicMapInitToNativeBrigeTime", (long) readableMap.getMap("args").getDouble("jstimestamp"));
                                }
                                int i = readableMap.getMap("args").getInt("type");
                                String string = readableMap.getMap("args").getString("styleName");
                                String string2 = readableMap.getMap("args").getString("styleJSON");
                                if (!mapViewDelegate.a(string)) {
                                    promise.reject(ErrorCode.ERROR_CODE_RESPONSE_NULL, "[createDynamicMap]:create dynamic map fail");
                                    return;
                                }
                                if (i == 0) {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                                    if (PatchProxy.isSupport(objArr3, mapViewDelegate, changeQuickRedirect4, false, "f14a864c63e93e443f8798bb29e9e49a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, mapViewDelegate, changeQuickRedirect4, false, "f14a864c63e93e443f8798bb29e9e49a");
                                    } else {
                                        DynamicMap dynamicMap = mapViewDelegate.C;
                                        if (mapViewDelegate.a(dynamicMap)) {
                                            dynamicMap.initDynamicMap();
                                        }
                                    }
                                } else if (i == 1) {
                                    Object[] objArr4 = {string2};
                                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.map.view.map.c.a;
                                    if (PatchProxy.isSupport(objArr4, mapViewDelegate, changeQuickRedirect5, false, "e2063703d3c03758b336a34a67961f82", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, mapViewDelegate, changeQuickRedirect5, false, "e2063703d3c03758b336a34a67961f82");
                                    } else if (TextUtils.isEmpty(string2)) {
                                        com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("initDynamicMap styleJSON is null"), "param");
                                    } else {
                                        DynamicMap dynamicMap2 = mapViewDelegate.C;
                                        if (mapViewDelegate.a(dynamicMap2)) {
                                            dynamicMap2.initDynamicMap(string2);
                                        }
                                    }
                                }
                                promise.resolve(0);
                                mapViewDelegate.a("kDynamicMapInitNativeTime", currentTimeMillis);
                                return;
                            }
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void fromScreenPoint(final int i, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00590c1dd57d355d0e802248e402ae1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00590c1dd57d355d0e802248e402ae1e");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.21
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                Object[] objArr2 = {nativeViewHierarchyManager};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b23ddb6f07a8a82c734f1b6901c1bb25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b23ddb6f07a8a82c734f1b6901c1bb25");
                } else if (promise != null) {
                    AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                    if (realMapView == null) {
                        promise.reject("MRNMap", "[fromScreenPoint]:MRNMapView not found");
                        return;
                    }
                    String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                    MTMap map = realMapView.getMap();
                    if (map == null) {
                        Promise promise2 = promise;
                        promise2.reject("MRNMap", "[fromScreenPoint]:Map is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                        return;
                    }
                    PointF a2 = com.meituan.android.mrn.component.map.utils.a.a(readableMap);
                    if (a2 == null) {
                        Promise promise3 = promise;
                        promise3.reject("MRNMap", "[fromScreenPoint]:Point is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                        return;
                    }
                    Point point = new Point(com.meituan.android.mrn.component.map.utils.b.a(reactApplicationContext, a2.x), com.meituan.android.mrn.component.map.utils.b.a(reactApplicationContext, a2.y));
                    Projection projection = map.getProjection();
                    if (projection != null) {
                        promise.resolve(com.meituan.android.mrn.component.map.utils.a.a(projection.fromScreenLocation(point)));
                        return;
                    }
                    Promise promise4 = promise;
                    promise4.reject("MRNMap", "[fromScreenPoint]:projection is null , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                }
            }
        });
    }

    @ReactMethod
    public void getAllMarkers(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef62117113a0d57a1975162039a104e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef62117113a0d57a1975162039a104e");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.3
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    WritableMap a2;
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "045251aa1b872a7b4bd909d794902287", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "045251aa1b872a7b4bd909d794902287");
                    } else if (promise != null) {
                        if (readableMap == null) {
                            promise.reject("MRNMap", "[addMarkers]:batchedMarkers is not found");
                        } else if (!readableMap.hasKey("tag")) {
                            promise.reject("MRNMap", "[addMarkers]:tag is not found");
                        } else {
                            AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, readableMap.getInt("tag"));
                            if (realMapView == null) {
                                promise.reject("MRNMap", "[getAllMarkers]:MRNMapView is not valid");
                                return;
                            }
                            List<Marker> list = ((com.meituan.android.mrn.component.map.view.map.a) realMapView).getMapViewDelegate().B;
                            if (list == null || list.isEmpty() || (a2 = com.meituan.android.mrn.component.map.utils.a.a(list)) == null) {
                                return;
                            }
                            promise.resolve(a2);
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getAllRipples(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "402bdd5c6184670fcdbea0f1a64ff8e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "402bdd5c6184670fcdbea0f1a64ff8e9");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.18
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a077d7de38a45808d1c08931cb47403d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a077d7de38a45808d1c08931cb47403d");
                        return;
                    }
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                            if (mapViewDelegate == null) {
                                promise.reject("-1", "[getAllRipples]: MRNMapViewDelegate is null");
                                return;
                            } else {
                                promise.resolve(com.meituan.android.mrn.component.map.utils.a.b(mapViewDelegate.D));
                                return;
                            }
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getCamera(final int i, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73d9c9a34d67a6b55ab9446e88ffe10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73d9c9a34d67a6b55ab9446e88ffe10");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b9ddd7be91a512c46554e1effb59d5d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b9ddd7be91a512c46554e1effb59d5d");
                    } else if (promise != null) {
                        AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                        if (realMapView == null) {
                            promise.reject("MRNMap", "[getCamera]:MRNMapView not found");
                            return;
                        }
                        String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                        MTMap map = realMapView.getMap();
                        if (map == null) {
                            Promise promise2 = promise;
                            promise2.reject("MRNMap", "[getCamera]:Map is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                            return;
                        }
                        WritableMap a2 = com.meituan.android.mrn.component.map.utils.a.a(map.getCameraPosition());
                        if (a2 != null) {
                            promise.resolve(a2);
                            return;
                        }
                        Promise promise3 = promise;
                        promise3.reject("MRNMap", "[getCamera]:camera is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42fe95cf4e0d5be3f4739c52b81105e3", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42fe95cf4e0d5be3f4739c52b81105e3") : com.meituan.android.mrn.component.map.utils.d.a(getReactApplicationContext());
    }

    @ReactMethod
    public void getModuleByName(ReadableArray readableArray, Promise promise) {
        Method[] methods;
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5627c3d8465ced301e1d7f8c63569c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5627c3d8465ced301e1d7f8c63569c3");
            return;
        }
        try {
            Collection<NativeModule> nativeModules = getReactApplicationContext().getCatalystInstance().getNativeModules();
            if (readableArray != null && readableArray.size() != 0 && nativeModules != null && nativeModules.size() != 0) {
                NativeModule[] nativeModuleArr = (NativeModule[]) nativeModules.toArray(new NativeModule[0]);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                for (int i = 0; i < readableArray.size(); i++) {
                    String string = readableArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < nativeModules.size()) {
                                NativeModule nativeModule = nativeModuleArr[i2];
                                if (string.equals(nativeModule.getName())) {
                                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                                    writableNativeMap2.putInt("id", i2);
                                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                                    for (Method method : nativeModule.getClass().getMethods()) {
                                        if (((ReactMethod) method.getAnnotation(ReactMethod.class)) != null) {
                                            writableNativeArray.pushString(method.getName());
                                        }
                                    }
                                    writableNativeMap2.putArray("methods", (WritableArray) writableNativeArray);
                                    writableNativeMap.putMap(string, (WritableMap) writableNativeMap2);
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                promise.resolve(writableNativeMap);
                return;
            }
            promise.resolve(new WritableNativeMap());
        } catch (Exception e) {
            com.meituan.android.mrn.component.map.utils.e.a(e, "param");
            promise.resolve(new WritableNativeMap());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNMapModule";
    }

    @ReactMethod
    public void getUserLocation(final int i, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67e90ef8e4d6cafc4e6139bb426c07b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67e90ef8e4d6cafc4e6139bb426c07b5");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.23
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4277d19996fea45ad2d0b6b2efb869fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4277d19996fea45ad2d0b6b2efb869fe");
                    } else if (promise != null) {
                        AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                        if (realMapView == null) {
                            promise.reject("MRNMap", "[getUserLocation]:MRNMapView not found");
                            return;
                        }
                        String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                        MTMap map = realMapView.getMap();
                        if (map == null) {
                            Promise promise2 = promise;
                            promise2.reject("MRNMap", "[getUserLocation]:Map is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                            return;
                        }
                        MapLocation currentMapLocation = map.getCurrentMapLocation();
                        if (currentMapLocation != null) {
                            promise.resolve(com.meituan.android.mrn.component.map.utils.a.a(currentMapLocation));
                            return;
                        }
                        Location currentLocation = map.getCurrentLocation();
                        if (currentLocation != null) {
                            promise.resolve(com.meituan.android.mrn.component.map.utils.a.a(currentLocation));
                            return;
                        }
                        Promise promise3 = promise;
                        promise3.reject("MRNMap", "[getUserLocation]:Location is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getVisibleBounds(final int i, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c90819b1b079ba0356a89e8d742a1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c90819b1b079ba0356a89e8d742a1ce");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.22
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "678df83da09b0e6096c2e4b68ef72c9a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "678df83da09b0e6096c2e4b68ef72c9a");
                    } else if (promise == null) {
                    } else {
                        AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                        if (realMapView == null) {
                            promise.reject("MRNMap", "[getVisibleBounds]:MRNMapView not found");
                            return;
                        }
                        String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                        MTMap map = realMapView.getMap();
                        if (map == null) {
                            Promise promise2 = promise;
                            promise2.reject("MRNMap", "[getVisibleBounds]:Map is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                            return;
                        }
                        Projection projection = map.getProjection();
                        if (projection == null) {
                            Promise promise3 = promise;
                            promise3.reject("MRNMap", "[getVisibleBounds]:projection is null , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                            return;
                        }
                        VisibleRegion visibleRegion = projection.getVisibleRegion();
                        if (visibleRegion != null) {
                            promise.resolve(com.meituan.android.mrn.component.map.utils.a.a(visibleRegion.getLatLngBounds()));
                            return;
                        }
                        Promise promise4 = promise;
                        promise4.reject("MRNMap", "[getVisibleBounds]:VisibleRegion is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void isMarkerSelected(final int i, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65e0f58e1a83329a40748a9564aacb78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65e0f58e1a83329a40748a9564aacb78");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.24
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "072c699b0ae62469c4bf651a3ee8e19e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "072c699b0ae62469c4bf651a3ee8e19e");
                    } else if (promise != null) {
                        View d = nativeViewHierarchyManager.d(i);
                        if (d instanceof com.meituan.android.mrn.component.map.view.childview.f) {
                            promise.resolve(Boolean.valueOf(((com.meituan.android.mrn.component.map.view.childview.f) d).isSelected()));
                        } else {
                            promise.reject("MRNMap", "[isMarkerSelected]:MRNMarkerView not found");
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void meterPerPoint(final int i, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c9b1c369738f5447c7301b822e4edc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c9b1c369738f5447c7301b822e4edc4");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.19
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                Object[] objArr2 = {nativeViewHierarchyManager};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "201925831380d5967611aab7f7b75295", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "201925831380d5967611aab7f7b75295");
                } else if (promise != null) {
                    AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                    if (realMapView == null) {
                        promise.reject("MRNMap", "[meterPerPoint]:MRNMapView not found");
                        return;
                    }
                    String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                    MTMap map = realMapView.getMap();
                    if (map != null) {
                        promise.resolve(Float.valueOf(map.getScalePerPixel() * (reactApplicationContext.getResources() != null ? reactApplicationContext.getResources().getDisplayMetrics().density : 1.0f)));
                        return;
                    }
                    Promise promise2 = promise;
                    promise2.reject("MRNMap", "[meterPerPoint]:Map is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                }
            }
        });
    }

    @ReactMethod
    public void reloadTileOverlay(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adacc52f88e9fde381f3f33d94567fbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adacc52f88e9fde381f3f33d94567fbe");
        } else if (readableMap == null || promise == null) {
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.6
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    TileOverlay tileOverlay;
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8bb830c4aa5713d2ee443c30a3e73dc9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8bb830c4aa5713d2ee443c30a3e73dc9");
                        return;
                    }
                    try {
                        if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag")) {
                            Promise promise2 = promise;
                            promise2.reject("4", "params is error " + readableMap.toString());
                            return;
                        }
                        com.meituan.android.mrn.component.map.view.childview.tile.b bVar = null;
                        View d = nativeViewHierarchyManager.d(readableMap.getInt("tag"));
                        if (d != null && (d instanceof com.meituan.android.mrn.component.map.view.childview.tile.b)) {
                            bVar = (com.meituan.android.mrn.component.map.view.childview.tile.b) d;
                        }
                        com.meituan.android.mrn.component.map.view.childview.tile.b bVar2 = bVar;
                        if (bVar2 == null) {
                            promise.reject("-1", "tileOverlay not found");
                            return;
                        }
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.childview.tile.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect4, false, "82e9f0b80ec23708ec4e23cb60037b3d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect4, false, "82e9f0b80ec23708ec4e23cb60037b3d");
                        } else if (!bVar2.g && (tileOverlay = bVar2.d) != null) {
                            tileOverlay.reload();
                        }
                        promise.resolve(0);
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeAllMarkers(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f05c06a09cc9535f880644710d3b66a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f05c06a09cc9535f880644710d3b66a5");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.25
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f88ca5c0aaeb4189f483b0b4c69568c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f88ca5c0aaeb4189f483b0b4c69568c9");
                    } else if (promise != null) {
                        if (readableMap == null || !readableMap.hasKey("tag")) {
                            promise.resolve(Boolean.TRUE);
                            return;
                        }
                        AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, readableMap.getInt("tag"));
                        if (realMapView == null) {
                            promise.reject("MRNMap", "[removeAllMarkers]:MRNMapView is not valid");
                            return;
                        }
                        List<Marker> list = ((com.meituan.android.mrn.component.map.view.map.a) realMapView).getMapViewDelegate().B;
                        if (list != null && !list.isEmpty()) {
                            for (Marker marker : list) {
                                if (marker != null) {
                                    marker.remove();
                                }
                            }
                            list.clear();
                        }
                        promise.resolve(Boolean.TRUE);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeAllRipples(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ef1ae7c1df2e390ec9ed18b56a020fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ef1ae7c1df2e390ec9ed18b56a020fa");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.17
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a51c250602ac8c63df30a179a9a3e833", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a51c250602ac8c63df30a179a9a3e833");
                        return;
                    }
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                            if (mapViewDelegate == null) {
                                promise.reject("-1", "[removeAllRipples]: MRNMapViewDelegate is null");
                                return;
                            }
                            mapViewDelegate.h();
                            promise.resolve(0);
                            return;
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeDynamicMap(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b68b796f58a3c1de12a690265d3a610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b68b796f58a3c1de12a690265d3a610");
        } else if (readableMap == null || promise == null) {
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.10
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "99a2d0d00af820eca03471c39f9a8f23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "99a2d0d00af820eca03471c39f9a8f23");
                        return;
                    }
                    try {
                        if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag")) {
                            Promise promise2 = promise;
                            promise2.reject("4", "params is error " + readableMap.toString());
                            return;
                        }
                        com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                        if (mapViewDelegate == null) {
                            promise.reject("-1", "[removeDynamicMap]:MRNMapViewDelegate is null");
                            return;
                        }
                        String string = com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "geoJSONKey") ? readableMap.getMap("args").getString("geoJSONKey") : "mrnmap_geojson";
                        int i = com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "removeType") ? readableMap.getMap("args").getInt("removeType") : 0;
                        if (1 == i) {
                            Object[] objArr3 = {string};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                            if (PatchProxy.isSupport(objArr3, mapViewDelegate, changeQuickRedirect4, false, "1a6e4ca8c9427d56c7f0c6b3590a7297", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, mapViewDelegate, changeQuickRedirect4, false, "1a6e4ca8c9427d56c7f0c6b3590a7297");
                            } else {
                                DynamicMap dynamicMap = mapViewDelegate.C;
                                if (dynamicMap != null) {
                                    dynamicMap.removeDynamicMapGeoJSON(string);
                                }
                            }
                        } else if (i == 0) {
                            mapViewDelegate.f();
                        }
                        promise.resolve(0);
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeDynamicMapImages(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4747ab5ce6e1819f53daabfe3c1e3158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4747ab5ce6e1819f53daabfe3c1e3158");
        } else if (readableMap == null || promise == null) {
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.14
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1db16d87c106d3fc85f7dbde939db1ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1db16d87c106d3fc85f7dbde939db1ad");
                        return;
                    }
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "ids")) {
                                promise.resolve(0);
                                return;
                            }
                            int i = readableMap.getInt("tag");
                            ReadableArray array = readableMap.getMap("args").getArray("ids");
                            com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, i);
                            if (mapViewDelegate == null) {
                                promise.reject("-1", "[removeDynamicMapImages]: MRNMapViewDelegate is null");
                                return;
                            }
                            for (int i2 = 0; i2 < array.size(); i2++) {
                                String string = array.getString(i2);
                                Object[] objArr3 = {string};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                                if (PatchProxy.isSupport(objArr3, mapViewDelegate, changeQuickRedirect4, false, "95dc105c65c118e36daf84a9db4eace1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, mapViewDelegate, changeQuickRedirect4, false, "95dc105c65c118e36daf84a9db4eace1");
                                } else if (!TextUtils.isEmpty(string)) {
                                    DynamicMap dynamicMap = mapViewDelegate.C;
                                    if (mapViewDelegate.a(dynamicMap)) {
                                        dynamicMap.removeDynamicMapImage(string);
                                    }
                                }
                            }
                            promise.resolve(0);
                            return;
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeMarkers(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6b3ded5fe1519b5786d6f4eee67bcc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6b3ded5fe1519b5786d6f4eee67bcc3");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.2
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a5c9641b01c03c8accd8933022c5e51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a5c9641b01c03c8accd8933022c5e51");
                    } else if (promise != null && readableMap != null) {
                        if (!readableMap.hasKey("tag")) {
                            promise.reject("MRNMap", "[addMarkers]:tag is not found");
                            return;
                        }
                        int i = readableMap.getInt("tag");
                        if (readableMap.hasKey("args")) {
                            ReadableMap map = readableMap.getMap("args");
                            if (map == null) {
                                promise.resolve(Boolean.TRUE);
                                return;
                            } else if (map.hasKey("markerIds")) {
                                ReadableArray array = map.getArray("markerIds");
                                if (array == null || array.size() == 0) {
                                    promise.resolve(Boolean.TRUE);
                                    return;
                                }
                                ArrayList<Object> arrayList = array.toArrayList();
                                AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                                if (realMapView == null) {
                                    promise.reject("MRNMap", "[removeMarkers]:MRNMapView is not valid");
                                    return;
                                }
                                List<Marker> list = ((com.meituan.android.mrn.component.map.view.map.a) realMapView).getMapViewDelegate().B;
                                ArrayList arrayList2 = new ArrayList();
                                if (list != null && !list.isEmpty()) {
                                    for (Marker marker : list) {
                                        if (marker != null && arrayList.contains(marker.getId())) {
                                            marker.remove();
                                            arrayList2.add(marker);
                                        }
                                    }
                                    list.removeAll(arrayList2);
                                }
                            }
                        } else {
                            promise.reject("MRNMap", "[removeMarkers]:args is not valid");
                        }
                        promise.resolve(Boolean.TRUE);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeRipples(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0d5852c354a9bf0e87f421b171ec970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0d5852c354a9bf0e87f421b171ec970");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.16
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "882893c0b1867089184acd9ac9180e02", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "882893c0b1867089184acd9ac9180e02");
                        return;
                    }
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "rippleIds")) {
                                promise.resolve(0);
                                return;
                            }
                            int i = readableMap.getInt("tag");
                            ReadableArray array = readableMap.getMap("args").getArray("rippleIds");
                            com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, i);
                            if (mapViewDelegate == null) {
                                promise.reject("-1", "[removeRipples]: MRNMapViewDelegate is null");
                                return;
                            }
                            if (array != null) {
                                mapViewDelegate.a(com.meituan.android.mrn.component.map.utils.a.a(array));
                            }
                            promise.resolve(0);
                            return;
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void sendInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "813b4cd1e88a2878c62ae1fdb8276819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "813b4cd1e88a2878c62ae1fdb8276819");
        } else {
            com.meituan.android.mrn.component.map.utils.e.b(str, str2);
        }
    }

    @ReactMethod
    public void setTileUrl(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96a932f9b898d12d27e2b77d7ddc9086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96a932f9b898d12d27e2b77d7ddc9086");
        } else if (readableMap == null || promise == null) {
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.5
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56398083653695f6c328132c0ff299cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56398083653695f6c328132c0ff299cf");
                        return;
                    }
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args") && com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "id")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "url")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[setTileUrl]: params is error" + readableMap.toString()), "param");
                            }
                            int i = readableMap.getInt("tag");
                            ReadableMap map = readableMap.getMap("args");
                            int i2 = map.getInt("id");
                            String string = map.getString("url");
                            com.meituan.android.mrn.component.map.view.childview.tile.b bVar = null;
                            View d = nativeViewHierarchyManager.d(i);
                            if (d != null && (d instanceof com.meituan.android.mrn.component.map.view.childview.tile.b)) {
                                bVar = (com.meituan.android.mrn.component.map.view.childview.tile.b) d;
                            }
                            if (bVar == null) {
                                promise.reject("-1", "tileOverlay not found");
                                return;
                            }
                            Integer valueOf = Integer.valueOf(i2);
                            b.a aVar = new b.a() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.5.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.mrn.component.map.view.childview.tile.b.a
                                public final void a(boolean z, int i3, String str) {
                                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i3), str};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7fb88dfdced773ca2c8a7006d1420b19", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7fb88dfdced773ca2c8a7006d1420b19");
                                        return;
                                    }
                                    com.meituan.android.mrn.component.map.utils.e.a("MRNMap", "tileLoadCallback " + Thread.currentThread().getId() + " [" + z + CommonConstant.Symbol.COMMA + i3 + CommonConstant.Symbol.COMMA + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                    if (z) {
                                        promise.resolve(0);
                                    } else {
                                        promise.reject(String.valueOf(i3), str);
                                    }
                                }
                            };
                            Object[] objArr3 = {valueOf, string, aVar};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.childview.tile.b.a;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "5f0d60c8c8de4894724fbd93dbb70b86", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "5f0d60c8c8de4894724fbd93dbb70b86");
                            } else if (!bVar.g) {
                                if (valueOf == null) {
                                    com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("task id is null"), "param");
                                } else {
                                    if (TextUtils.isEmpty(string)) {
                                        com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("tileUrl is empty"), "param");
                                    }
                                    b.C0280b c0280b = bVar.f.get(valueOf);
                                    if (c0280b != null) {
                                        c0280b.c = string;
                                        c0280b.d = aVar;
                                        LockSupport.unpark(c0280b.b);
                                    }
                                }
                            }
                            promise.resolve(0);
                            return;
                        }
                        Promise promise2 = promise;
                        promise2.reject("4", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        Promise promise3 = promise;
                        promise3.reject("4", "[setTileUrl]: " + e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    public void takeSnapshot(final int i, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3624d2220ef5f588583504bd85eae147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3624d2220ef5f588583504bd85eae147");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.12
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                Object[] objArr2 = {nativeViewHierarchyManager};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c75464f7affe3050074162660333a43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c75464f7affe3050074162660333a43");
                } else if (promise != null) {
                    AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                    if (realMapView == null) {
                        promise.reject("MRNMap", "[takeSnapshot]:MRNMapView not found");
                        return;
                    }
                    final String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                    MTMap map = realMapView.getMap();
                    if (map != null) {
                        map.getMapScreenShot(new MTMap.OnMapScreenShotListener() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.12.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapScreenShotListener
                            public final void onMapScreenShot(Bitmap bitmap) {
                                FileOutputStream fileOutputStream;
                                File createTempFile;
                                Object[] objArr3 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "da06bf43788b5ea26e95bd18516311ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "da06bf43788b5ea26e95bd18516311ca");
                                    return;
                                }
                                if (bitmap == null) {
                                    Promise promise2 = promise;
                                    promise2.reject("MRNMap", "[takeSnapshot]:screen shot failed , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                }
                                FileOutputStream fileOutputStream2 = null;
                                File a2 = h.a(reactApplicationContext, (String) null);
                                if (!a2.exists()) {
                                    a2.mkdirs();
                                }
                                if (a2.exists() && !a2.isDirectory()) {
                                    Promise promise3 = promise;
                                    promise3.reject("MRNMap", "[takeSnapshot]:cache dir is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                }
                                try {
                                    try {
                                        createTempFile = File.createTempFile("MRNMapSnapshot", ".png", a2);
                                        fileOutputStream = new FileOutputStream(createTempFile);
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                }
                                try {
                                    if (bitmap != null) {
                                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                        promise.resolve(Uri.fromFile(createTempFile).toString());
                                    } else {
                                        Promise promise4 = promise;
                                        promise4.reject("MRNMap", "[takeSnapshot]:bitmap is null , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused) {
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fileOutputStream2 = fileOutputStream;
                                    promise.reject(e);
                                    com.meituan.android.mrn.component.map.utils.e.a(e, "other");
                                    if (fileOutputStream2 != null) {
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    throw th;
                                }
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapScreenShotListener
                            public final void onMapScreenShot(Bitmap bitmap, int i2) {
                            }
                        });
                        return;
                    }
                    Promise promise2 = promise;
                    promise2.reject("MRNMap", "[takeSnapshot]:Map is not valid , mapId[" + realMapId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                }
            }
        });
    }

    @ReactMethod
    public void toScreenPoint(final int i, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {Integer.valueOf(i), readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "083d38c9b3362cc02b4df17c17b6a1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "083d38c9b3362cc02b4df17c17b6a1f5");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.20
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                WritableMap writableNativeMap;
                Promise promise2;
                String str;
                StringBuilder sb;
                String sb2;
                Object[] objArr2 = {nativeViewHierarchyManager};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37d22a47603fb98df2bd8d5d9fd7c2b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37d22a47603fb98df2bd8d5d9fd7c2b9");
                } else if (promise != null) {
                    AbstractMapView realMapView = MRNMapModule.this.getRealMapView(nativeViewHierarchyManager, i);
                    if (realMapView == null) {
                        promise2 = promise;
                        str = "MRNMap";
                        sb2 = "[toScreenPoint]:MRNMapView not found";
                    } else {
                        String realMapId = MRNMapModule.this.getRealMapId(realMapView);
                        MTMap map = realMapView.getMap();
                        if (map == null) {
                            promise2 = promise;
                            str = "MRNMap";
                            sb = new StringBuilder("[toScreenPoint]:Map is not valid , mapId[");
                        } else {
                            LatLng b = com.meituan.android.mrn.component.map.utils.a.b(readableMap);
                            if (b == null) {
                                promise2 = promise;
                                str = "MRNMap";
                                sb = new StringBuilder("[toScreenPoint]:MRNLatLng is not valid , mapId[");
                            } else {
                                Projection projection = map.getProjection();
                                if (projection == null) {
                                    promise2 = promise;
                                    str = "MRNMap";
                                    sb = new StringBuilder("[toScreenPoint]:projection is null , mapId[");
                                } else {
                                    Point screenLocation = projection.toScreenLocation(b);
                                    if (screenLocation != null) {
                                        PointF pointF = new PointF();
                                        pointF.x = com.meituan.android.mrn.component.map.utils.b.a((Context) reactApplicationContext, screenLocation.x);
                                        pointF.y = com.meituan.android.mrn.component.map.utils.b.a((Context) reactApplicationContext, screenLocation.y);
                                        Promise promise3 = promise;
                                        Object[] objArr3 = {pointF};
                                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.utils.a.a;
                                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "b84416cc6e85cfd48bd75c7688a0fce6", RobustBitConfig.DEFAULT_VALUE)) {
                                            writableNativeMap = (WritableMap) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "b84416cc6e85cfd48bd75c7688a0fce6");
                                        } else {
                                            writableNativeMap = new WritableNativeMap();
                                            writableNativeMap.putDouble(Constants.GestureMoveEvent.KEY_X, pointF.x);
                                            writableNativeMap.putDouble(Constants.GestureMoveEvent.KEY_Y, pointF.y);
                                        }
                                        promise3.resolve(writableNativeMap);
                                        return;
                                    }
                                    promise2 = promise;
                                    str = "MRNMap";
                                    sb = new StringBuilder("[toScreenPoint]: convert error , mapId[");
                                }
                            }
                        }
                        sb.append(realMapId);
                        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                        sb2 = sb.toString();
                    }
                    promise2.reject(str, sb2);
                }
            }
        });
    }

    @ReactMethod
    public void updateFeature(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "421d5f8c6794b52954a5bc8066142a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "421d5f8c6794b52954a5bc8066142a2d");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.meituan.android.mrn.component.map.MRNMapModule.9
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "17541ce0108dc223994d4893f171f2fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "17541ce0108dc223994d4893f171f2fc");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "tag") && com.meituan.android.mrn.component.map.utils.a.a(readableMap, "args")) {
                            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "featureId")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: featureId is null" + readableMap.toString()), "param");
                                return;
                            } else if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "properyKey")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: properyKey is null" + readableMap.toString()), "param");
                                return;
                            } else if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "value")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: value is null" + readableMap.toString()), "param");
                                return;
                            } else if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap.getMap("args"), "geoJSONKey")) {
                                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("[createDynamicMap]: geoJSONKey is null" + readableMap.toString()), "param");
                                return;
                            } else {
                                com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = MRNMapModule.this.getMapViewDelegate(nativeViewHierarchyManager, readableMap.getInt("tag"));
                                if (mapViewDelegate == null) {
                                    promise.reject("-1", "[updateFeature]:MRNMapViewDelegate is null");
                                    return;
                                }
                                if (readableMap.getMap("args").hasKey("jstimestamp")) {
                                    mapViewDelegate.a("kDynamicMapUpdateToNativeBridgeTime", (long) readableMap.getMap("args").getDouble("jstimestamp"));
                                }
                                String string = readableMap.getMap("args").getString("featureId");
                                String string2 = readableMap.getMap("args").getString("properyKey");
                                String string3 = readableMap.getMap("args").getString("value");
                                String string4 = readableMap.getMap("args").getString("geoJSONKey");
                                Object[] objArr3 = {string, string2, string3, string4};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.map.c.a;
                                if (PatchProxy.isSupport(objArr3, mapViewDelegate, changeQuickRedirect4, false, "87700fec665596d58fde6c08305a7833", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, mapViewDelegate, changeQuickRedirect4, false, "87700fec665596d58fde6c08305a7833");
                                } else {
                                    if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string)) {
                                        DynamicMap dynamicMap = mapViewDelegate.C;
                                        if (mapViewDelegate.a(dynamicMap)) {
                                            dynamicMap.setDynamicMapFeature(string4, string, string2, string3);
                                        }
                                    }
                                    com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("updateFeature featureCollectionJson is null"), "param");
                                }
                                mapViewDelegate.a("kDynamicMapUpdateFeatureNativeTime", currentTimeMillis);
                                return;
                            }
                        }
                        Promise promise2 = promise;
                        promise2.reject("2", "params is error " + readableMap.toString());
                    } catch (Exception e) {
                        promise.reject("4", e.getMessage());
                        com.meituan.android.mrn.component.map.utils.e.a(e, "param");
                    }
                }
            });
        }
    }

    @ReactMethod
    @Deprecated
    public void getMapVersion(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a227b235ecc849e50a0b544d9a1cadc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a227b235ecc849e50a0b544d9a1cadc8");
        } else if (promise != null) {
            if (TextUtils.isEmpty("4.1207.1") || TextUtils.isEmpty(com.meituan.android.mrn.component.map.utils.d.a())) {
                promise.reject("MRNMap", "[getMapSDKVersion]:Map is not valid");
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("nativeMRNMapVersion", "4.1207.1");
            writableNativeMap.putString("mapSDKVersion", com.meituan.android.mrn.component.map.utils.d.a());
            promise.resolve(writableNativeMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getRealMapId(AbstractMapView abstractMapView) {
        Object[] objArr = {abstractMapView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b6e71c60bfeeb5f7b854fb8d182236d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b6e71c60bfeeb5f7b854fb8d182236d");
        }
        com.meituan.android.mrn.component.map.view.map.c mapViewDelegate = getMapViewDelegate(abstractMapView);
        return mapViewDelegate != null ? mapViewDelegate.y : "";
    }
}
