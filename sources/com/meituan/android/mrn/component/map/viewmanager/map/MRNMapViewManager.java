package com.meituan.android.mrn.component.map.viewmanager.map;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.mrn.component.map.utils.b;
import com.meituan.android.mrn.component.map.utils.e;
import com.meituan.android.mrn.component.map.view.childview.f;
import com.meituan.android.mrn.component.map.view.childview.g;
import com.meituan.android.mrn.component.map.view.map.a;
import com.meituan.android.mrn.component.map.view.map.c;
import com.meituan.android.mrn.component.map.view.map.d;
import com.meituan.android.mrn.component.map.viewmanager.SizeReportingShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode;
import com.sankuai.meituan.mapsdk.maps.model.TrafficStyle;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"nammu_check_error"})
/* loaded from: classes2.dex */
public abstract class MRNMapViewManager extends ViewGroupManager<ViewGroup> {
    private static final int COMMAND_FIT_ALL_ELEMENT = 1;
    private static final int COMMAND_FIT__ELEMENTS = 9;
    private static final int COMMAND_MOVE_TO_MAP_CENTER_POINT = 12;
    private static final int COMMAND_RAPTOR_SEND_INFO = 13;
    private static final int COMMAND_SET_BOUNDS = 3;
    private static final int COMMAND_SET_CAMERA = 2;
    private static final int COMMAND_SET_CENTER = 4;
    private static final int COMMAND_SET_LIMIT_BOUNDS = 10;
    private static final int COMMAND_SET_MAP_CENTER_POINT = 11;
    private static final int COMMAND_SET_MAP_STYLE_COLOR = 14;
    private static final int COMMAND_ZOOM_BY = 8;
    private static final int COMMAND_ZOOM_IN = 5;
    private static final int COMMAND_ZOOM_OUT = 6;
    private static final int COMMAND_ZOOM_TO = 7;
    public static final String EVENT_ON_ANIMATE_CAMRERA = "onAnimateCamera";
    public static final String EVENT_ON_AOI_PRESS = "onMapAOIPress";
    public static final String EVENT_ON_BATCHEDMARKER_PRESS = "onBatchedMarkerPress";
    public static final String EVENT_ON_CAMERA_CHANGE = "onCameraChange";
    public static final String EVENT_ON_MAP_LONG_PRESS = "onMapLongPress";
    public static final String EVENT_ON_MAP_PRESS = "onMapPress";
    public static final String EVENT_ON_MAP_READY = "onMapReady";
    public static final String EVENT_ON_MAP_STABLE = "onMapStable";
    public static final String EVENT_ON_MARKER_PRESS = "onMarkerPress";
    public static final String EVENT_ON_PERFORMANCE = "onPerformance";
    public static final String EVENT_ON_POI_PRESS = "onMapPOIPress";
    public static final String EVENT_ON_UPDATE_USER_LOCATION = "onUpdateUserLocation";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, Object> mInitPropsMap;
    private WeakReference<ao> mReactContext;

    private String getBusinessKey(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0143894b09e6b2464297fef5973b84d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0143894b09e6b2464297fef5973b84d7");
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                return (String) hashMap.get("setBusinessKey");
            } catch (Exception e) {
                e.a(e, "[getBusinessKey] invoke error");
                e.printStackTrace();
            }
        }
        return null;
    }

    private String getBusinessTag(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d06541a2be976aa45dca78a1e36a2507", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d06541a2be976aa45dca78a1e36a2507");
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                return (String) hashMap.get("setBusinessTag");
            } catch (Exception e) {
                e.a(e, "[getBusinessTag] invoke error");
                e.printStackTrace();
            }
        }
        return null;
    }

    private c<?> getDelegate(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a6b6027aaca00012f2e2430fe260a08", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a6b6027aaca00012f2e2430fe260a08");
        }
        if (!(viewGroup instanceof FrameLayout) || viewGroup.getChildCount() != 1) {
            if (viewGroup instanceof a) {
                return ((a) viewGroup).getMapViewDelegate();
            }
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt instanceof a) {
            return ((a) childAt).getMapViewDelegate();
        }
        return null;
    }

    private void initOtherProps(@Nonnull ViewGroup viewGroup, HashMap<String, Object> hashMap) {
        Method[] methods;
        String name;
        Object obj;
        Object[] objArr = {viewGroup, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "659305d52221c870e4864a320e3b7a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "659305d52221c870e4864a320e3b7a5b");
        } else if (viewGroup != null && hashMap != null && !hashMap.isEmpty()) {
            for (Method method : getClass().getMethods()) {
                if (method.toString().contains(getClass().getPackage().getName()) && (obj = hashMap.get((name = method.getName()))) != null) {
                    try {
                        method.invoke(this, viewGroup, obj);
                    } catch (Exception e) {
                        e.a(e, "[initOtherProps] " + name + " invoke error value is" + obj.toString());
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private boolean interceptPropsInit(Object obj) {
        int i = 0;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4370b166a1d701efcf5afc8e7b4b44e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4370b166a1d701efcf5afc8e7b4b44e")).booleanValue();
        }
        HashMap<String, Object> hashMap = this.mInitPropsMap;
        if (hashMap == null || obj == null) {
            return false;
        }
        String str = null;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    String methodName = stackTraceElement.getMethodName();
                    if (MRNMapViewManager.class.getName().equals(className) && !"interceptPropsInit".equals(methodName)) {
                        str = methodName;
                        break;
                    }
                }
                i++;
            }
        }
        if (str != null) {
            hashMap.put(str, obj);
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ViewGroup viewGroup, View view, int i) {
        Object[] objArr = {viewGroup, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e9e1d04289473332718949b7f32a8c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e9e1d04289473332718949b7f32a8c9");
        } else if (getDelegate(viewGroup) != null) {
            getDelegate(viewGroup).a(view, i);
        }
    }

    @Nonnull
    public abstract AbstractMapView createMapView(ao aoVar, String str, String str2, d dVar, String str3);

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance(@Nonnull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0e60d490eb43b807a6ccf5a63109dae", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0e60d490eb43b807a6ccf5a63109dae") : new SizeReportingShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public ViewGroup createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb047a280343e1f4b901897f5214705", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb047a280343e1f4b901897f5214705");
        }
        this.mInitPropsMap = new HashMap<>();
        this.mReactContext = new WeakReference<>(aoVar);
        FrameLayout frameLayout = new FrameLayout(aoVar);
        frameLayout.setBackgroundColor(aoVar.getResources().getColor(17170445));
        e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "createViewInstance: " + Integer.toHexString(frameLayout.hashCode()));
        return frameLayout;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0f4916be39ec94ca1d81b90a6ab8222", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0f4916be39ec94ca1d81b90a6ab8222") : com.facebook.react.common.c.b().a("fitAllElement", 1).a("setCamera", 2).a("setBounds", 3).a("setCenter", 4).a("zoomIn", 5).a("zoomOut", 6).a("zoomTo", 7).a("zoomBy", 8).a("fitElements", 9).a("setLimitBounds", 10).a("setMapCenterPoint", 11).a("moveToMapCenterPoint", 12).a("raptorSendInfo", 13).a("applyMapColorStyle", 14).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f4d898b874a56f1fcc969d67dc969fa", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f4d898b874a56f1fcc969d67dc969fa") : com.facebook.react.common.c.b().a(EVENT_ON_MAP_READY, com.facebook.react.common.c.a("registrationName", EVENT_ON_MAP_READY)).a(EVENT_ON_MAP_STABLE, com.facebook.react.common.c.a("registrationName", EVENT_ON_MAP_STABLE)).a(EVENT_ON_CAMERA_CHANGE, com.facebook.react.common.c.a("registrationName", EVENT_ON_CAMERA_CHANGE)).a(EVENT_ON_MAP_PRESS, com.facebook.react.common.c.a("registrationName", EVENT_ON_MAP_PRESS)).a(EVENT_ON_MAP_LONG_PRESS, com.facebook.react.common.c.a("registrationName", EVENT_ON_MAP_LONG_PRESS)).a("onMarkerPress", com.facebook.react.common.c.a("registrationName", "onMarkerPress")).a(EVENT_ON_UPDATE_USER_LOCATION, com.facebook.react.common.c.a("registrationName", EVENT_ON_UPDATE_USER_LOCATION)).a(EVENT_ON_POI_PRESS, com.facebook.react.common.c.a("registrationName", EVENT_ON_POI_PRESS)).a(EVENT_ON_AOI_PRESS, com.facebook.react.common.c.a("registrationName", EVENT_ON_AOI_PRESS)).a(EVENT_ON_PERFORMANCE, com.facebook.react.common.c.a("registrationName", EVENT_ON_PERFORMANCE)).a(EVENT_ON_BATCHEDMARKER_PRESS, com.facebook.react.common.c.a("registrationName", EVENT_ON_BATCHEDMARKER_PRESS)).a(EVENT_ON_ANIMATE_CAMRERA, com.facebook.react.common.c.a("registrationName", EVENT_ON_ANIMATE_CAMRERA)).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98e4f4b2aa677ab83595f8594305cb68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98e4f4b2aa677ab83595f8594305cb68");
            return;
        }
        super.onAfterUpdateTransaction((MRNMapViewManager) viewGroup);
        if (viewGroup.getChildCount() <= 0 || !(viewGroup.getChildAt(0) instanceof AbstractMapView)) {
            ao aoVar = this.mReactContext.get();
            if (aoVar == null) {
                e.a(new IllegalArgumentException("mReactContext WeakReference get is null"), "param");
                return;
            }
            e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "onAfterUpdateTransaction: " + Integer.toHexString(viewGroup.hashCode()));
            HashMap<String, Object> hashMap = this.mInitPropsMap;
            this.mInitPropsMap = null;
            AbstractMapView createMapView = createMapView(aoVar, getBusinessKey(hashMap), getBusinessTag(hashMap), getMapViewOptions(hashMap), String.valueOf(viewGroup.getId()));
            createMapView.setId(viewGroup.getId());
            initOtherProps(createMapView, hashMap);
            viewGroup.addView(createMapView);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@Nonnull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8398998ffcab337bc63cb7e99d3a3e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8398998ffcab337bc63cb7e99d3a3e2a");
            return;
        }
        super.onDropViewInstance((MRNMapViewManager) viewGroup);
        e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "onDropViewInstance: " + Integer.toHexString(viewGroup.hashCode()));
        c<?> delegate = getDelegate(viewGroup);
        if (delegate != null) {
            delegate.b();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e82b58bca2f034149e5c3ceafc0e161a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e82b58bca2f034149e5c3ceafc0e161a");
            return;
        }
        super.removeAllViews(viewGroup);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @ReactProp(name = "compassEnabled")
    public void setCompassEnabled(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "195a29d9708f023623dd19bc122826b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "195a29d9708f023623dd19bc122826b8");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setCompassEnabled(z);
        }
    }

    @ReactProp(defaultBoolean = true, name = "gestureScaleByMapCenter")
    public void setGestureScaleByMapCenter(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da57399b757a8639924b88d0d425f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da57399b757a8639924b88d0d425f45");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setGestureScaleByMapCenter(z);
        }
    }

    @ReactProp(defaultBoolean = true, name = "inertiaScaleEnabled")
    public void setInertiaScaleEnabled(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed4bcdc3431ae7bd30e31fb2970107a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed4bcdc3431ae7bd30e31fb2970107a");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setInertiaScaleEnabled(z);
        }
    }

    @ReactProp(name = "initialProps")
    public void setInitialProps(ViewGroup viewGroup, ReadableMap readableMap) {
        Object[] objArr = {viewGroup, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "473ad306a99a273f412492d2081edb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "473ad306a99a273f412492d2081edb5e");
        } else {
            interceptPropsInit(readableMap);
        }
    }

    @ReactProp(name = "mapLogoPosition")
    public void setLogPosition(ViewGroup viewGroup, String str) {
        UiSettings uISettings;
        char c;
        int i = 2;
        Object[] objArr = {viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54e3e30e7ccaeb16cfc3be20d2808159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54e3e30e7ccaeb16cfc3be20d2808159");
        } else if (interceptPropsInit(str) || (uISettings = getUISettings(getDelegate(viewGroup))) == null || TextUtils.isEmpty(str)) {
        } else {
            int hashCode = str.hashCode();
            if (hashCode == -1682792238) {
                if (str.equals("bottomLeft")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -621290831) {
                if (hashCode == 1781909088 && str.equals("bottomCenter")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("bottomRight")) {
                    c = 2;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i >= 0) {
                uISettings.setLogoPosition(i);
            }
        }
    }

    @ReactProp(name = "mapCenterPoint")
    public void setMapCenterPoint(ViewGroup viewGroup, ReadableMap readableMap) {
        Object[] objArr = {viewGroup, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce18e379c1a4930d57ab92e4bf0d368d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce18e379c1a4930d57ab92e4bf0d368d");
        } else if (interceptPropsInit(readableMap) || getDelegate(viewGroup) == null) {
        } else {
            getDelegate(viewGroup).b(readableMap);
        }
    }

    @ReactProp(name = "mapStyle")
    public void setMapStyle(ViewGroup viewGroup, ReadableMap readableMap) {
        Object[] objArr = {viewGroup, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3114948934843d62fe7d7f0c64b0f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3114948934843d62fe7d7f0c64b0f2");
        } else if (interceptPropsInit(readableMap) || getDelegate(viewGroup) == null) {
        } else {
            getDelegate(viewGroup).a(readableMap);
        }
    }

    @ReactProp(name = "rotateGesturesEnabled")
    public void setRotateGesturesEnabled(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b330b72c2e9fd2b2237e8b5b454fca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b330b72c2e9fd2b2237e8b5b454fca3");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setRotateGesturesEnabled(z);
        }
    }

    @ReactProp(name = "scaleControlsEnabled")
    public void setScaleControlsEnabled(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b25a5553ad63d87ee213ed89829430a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b25a5553ad63d87ee213ed89829430a1");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setScaleControlsEnabled(z);
        }
    }

    @ReactProp(name = "mapScalePosition")
    public void setScalePosition(ViewGroup viewGroup, String str) {
        UiSettings uISettings;
        char c;
        int i = 2;
        Object[] objArr = {viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53f4ef01859f92c273f54b5be899b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53f4ef01859f92c273f54b5be899b52");
        } else if (interceptPropsInit(str) || (uISettings = getUISettings(getDelegate(viewGroup))) == null || TextUtils.isEmpty(str)) {
        } else {
            int hashCode = str.hashCode();
            if (hashCode == -1682792238) {
                if (str.equals("bottomLeft")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -621290831) {
                if (hashCode == 1781909088 && str.equals("bottomCenter")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("bottomRight")) {
                    c = 2;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i >= 0) {
                uISettings.setScaleViewPosition(i);
            }
        }
    }

    @ReactProp(name = "scaleViewOffset")
    public void setScalePositionWithMarigin(ViewGroup viewGroup, ReadableMap readableMap) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b5f4c7840f15bd41acef4e627484ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b5f4c7840f15bd41acef4e627484ef0");
        } else if (!interceptPropsInit(readableMap) && (uISettings = getUISettings(getDelegate(viewGroup))) != null && com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_X) && com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_Y)) {
            uISettings.setScaleViewPositionWithMargin(0, 0, -b.a(viewGroup.getContext(), (int) readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y)), b.a(viewGroup.getContext(), (int) readableMap.getDouble(Constants.GestureMoveEvent.KEY_X)), 0);
        }
    }

    @ReactProp(name = "scrollGestureEnable")
    public void setScrollGestureEnable(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b36def1d669ca267106048b37817aab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b36def1d669ca267106048b37817aab3");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setScrollGesturesEnabled(z);
        }
    }

    @ReactProp(name = "tiltGesturesEnabled")
    public void setTiltGesturesEnabled(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e2580cb1cbf037e8e0c212f876ff4fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e2580cb1cbf037e8e0c212f876ff4fa");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setTiltGesturesEnabled(z);
        }
    }

    @ReactProp(name = "zoomGestureEnable")
    public void setZoomGestureEnable(ViewGroup viewGroup, boolean z) {
        UiSettings uISettings;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1aba1f25306245ad5e13a8600f48c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1aba1f25306245ad5e13a8600f48c19");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (uISettings = getUISettings(getDelegate(viewGroup))) == null) {
        } else {
            uISettings.setZoomGesturesEnabled(z);
        }
    }

    @ReactProp(name = "zoomMode")
    public void setZoomMode(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0740d0902b0b630250297e9fda06163f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0740d0902b0b630250297e9fda06163f");
        } else {
            interceptPropsInit(Integer.valueOf(i));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ViewGroup viewGroup, Object obj) {
        Object[] objArr = {viewGroup, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5485a02a201458a32ec24bae1d9b810e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5485a02a201458a32ec24bae1d9b810e");
        } else if (getDelegate(viewGroup) != null) {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "07e60cc42f7998972639831d328627c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "07e60cc42f7998972639831d328627c2");
                return;
            }
            delegate.w = true;
            delegate.c();
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27a1c76bcdc2f8049d06e5980b199cde", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27a1c76bcdc2f8049d06e5980b199cde")).intValue();
        }
        if (getDelegate(viewGroup) != null) {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "d8c1d3f6cf4f635371720a3d3185f641", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "d8c1d3f6cf4f635371720a3d3185f641")).intValue();
            }
            if (delegate.A) {
                return 0;
            }
            return delegate.f.size();
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(ViewGroup viewGroup, int i) {
        Object obj;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0e4fc0ab5917adcb4e252f54afacb01", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0e4fc0ab5917adcb4e252f54afacb01");
        }
        if (getDelegate(viewGroup) != null) {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "9d68a74542b344dc6b16a4371506f688", RobustBitConfig.DEFAULT_VALUE)) {
                obj = PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "9d68a74542b344dc6b16a4371506f688");
            } else if (delegate.A) {
                return null;
            } else {
                obj = delegate.f.get(i);
            }
            return (View) obj;
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(ViewGroup viewGroup, int i) {
        com.meituan.android.mrn.component.map.view.childview.d remove;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92b6c19f1b51812442a820298d008a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92b6c19f1b51812442a820298d008a0d");
        } else if (getDelegate(viewGroup) != null) {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "45c929384629f225ba9958b67788c179", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "45c929384629f225ba9958b67788c179");
            } else if (delegate.A || i > delegate.f.size() - 1 || (remove = delegate.f.remove(i)) == null) {
            } else {
                if (remove instanceof f) {
                    delegate.g.remove(((f) remove).getMarker());
                    delegate.e.removeView((View) remove);
                }
                if (remove instanceof g) {
                    String str = null;
                    try {
                        str = ((g) remove).getPolygonId();
                    } catch (Exception unused) {
                    }
                    if (str != null) {
                        delegate.h.remove(str);
                    }
                }
                remove.a(delegate.d.getMap());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean, byte] */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@Nonnull ViewGroup viewGroup, int i, @Nullable ReadableArray readableArray) {
        IllegalArgumentException illegalArgumentException;
        String str;
        long j;
        int i2;
        IllegalArgumentException illegalArgumentException2;
        String str2;
        Object[] objArr = {viewGroup, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d221af856e7c19415c13ea6a8411783d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d221af856e7c19415c13ea6a8411783d");
            return;
        }
        final c<?> delegate = getDelegate(viewGroup);
        if (delegate == null) {
            return;
        }
        try {
            switch (i) {
                case 1:
                    delegate.a(readableArray);
                    return;
                case 2:
                    Object[] objArr2 = {readableArray};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "a81e8eefbad5301c24ab3d073e375e44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "a81e8eefbad5301c24ab3d073e375e44");
                        return;
                    }
                    if (readableArray != null && readableArray.size() >= 2) {
                        ReadableMap map = readableArray.getMap(0);
                        boolean z = readableArray.getBoolean(1);
                        Object[] objArr3 = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr3, delegate, changeQuickRedirect4, false, "7e56996edfc7327aabf2121355d3811f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, delegate, changeQuickRedirect4, false, "7e56996edfc7327aabf2121355d3811f");
                            return;
                        } else if (delegate.b != null) {
                            if (map == null) {
                                illegalArgumentException = new IllegalArgumentException("setCamera must have camera parameter");
                                str = "param";
                            } else if (com.meituan.android.mrn.component.map.utils.a.a(map, "center")) {
                                LatLng b = com.meituan.android.mrn.component.map.utils.a.b(map.getMap("center"));
                                if (b != null) {
                                    float f = com.meituan.android.mrn.component.map.utils.a.a(map, "zoom") ? (float) map.getDouble("zoom") : 0.0f;
                                    float f2 = com.meituan.android.mrn.component.map.utils.a.a(map, "tilt") ? (float) map.getDouble("tilt") : Float.NaN;
                                    float f3 = com.meituan.android.mrn.component.map.utils.a.a(map, "bearing") ? (float) map.getDouble("bearing") : Float.NaN;
                                    delegate.a(f == 0.0f ? CameraUpdateFactory.newLatLng(b) : (Float.isNaN(f2) && Float.isNaN(f3)) ? CameraUpdateFactory.newLatLngZoom(b, f) : CameraUpdateFactory.newCameraPosition(new CameraPosition(b, f, f2, f3)), z);
                                    return;
                                }
                                illegalArgumentException = new IllegalArgumentException("setCamera: must contains center");
                                str = "param";
                            } else {
                                illegalArgumentException = new IllegalArgumentException("camera must have center parameter");
                                str = "param";
                            }
                            e.a(illegalArgumentException, str);
                            return;
                        } else {
                            return;
                        }
                    }
                    e.a(new IllegalArgumentException("setCamera must have two parameter"), "param");
                    return;
                case 3:
                    if (readableArray == null || readableArray.size() <= 0) {
                        e.a(new IllegalArgumentException("setBounds must have parameter"), "param");
                        return;
                    }
                    ReadableMap map2 = readableArray.getMap(0);
                    Object[] objArr4 = {map2};
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr4, delegate, changeQuickRedirect5, false, "2b88e11403de1f0aaa0de184e45c0668", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, delegate, changeQuickRedirect5, false, "2b88e11403de1f0aaa0de184e45c0668");
                        return;
                    }
                    if (map2 != null && delegate.b != null && delegate.d != 0 && delegate.c != null) {
                        long j2 = com.meituan.android.mrn.component.map.utils.a.a(map2, DeviceInfo.TM) ? (long) map2.getDouble(DeviceInfo.TM) : 0L;
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("setBoundsJSToNative", currentTimeMillis - j2);
                            e.a("qcs_lbs", "qcs_lbs_mrnmap_log", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                        delegate.a("setBoundsJSToNative", "setBounds JS到Native时间", j2, currentTimeMillis);
                        LatLngBounds c = com.meituan.android.mrn.component.map.utils.a.a(map2, "bounds") ? com.meituan.android.mrn.component.map.utils.a.c(map2.getMap("bounds")) : null;
                        if (c == null) {
                            e.a(new IllegalArgumentException("setBounds must have LatLngBounds"), "param");
                            return;
                        }
                        ?? r8 = com.meituan.android.mrn.component.map.utils.a.a(map2, "animate") ? map2.getBoolean("animate") : 1;
                        int a = com.meituan.android.mrn.component.map.utils.a.a(map2, "paddingLeft") ? b.a(delegate.c, (float) map2.getDouble("paddingLeft")) : 0;
                        int a2 = com.meituan.android.mrn.component.map.utils.a.a(map2, "paddingTop") ? b.a(delegate.c, (float) map2.getDouble("paddingTop")) : 0;
                        if (com.meituan.android.mrn.component.map.utils.a.a(map2, "paddingRight")) {
                            j = j2;
                            i2 = b.a(delegate.c, (float) map2.getDouble("paddingRight"));
                        } else {
                            j = j2;
                            i2 = 0;
                        }
                        CameraUpdate newLatLngBoundsRect = CameraUpdateFactory.newLatLngBoundsRect(c, a, i2, a2, com.meituan.android.mrn.component.map.utils.a.a(map2, "paddingBottom") ? b.a(delegate.c, (float) map2.getDouble("paddingBottom")) : 0);
                        if (newLatLngBoundsRect != null) {
                            final long j3 = j;
                            Object[] objArr5 = {newLatLngBoundsRect, Byte.valueOf((byte) r8), new Long(j3)};
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr5, delegate, changeQuickRedirect6, false, "ce013cde760ab61e12b0867e2dffc40d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, delegate, changeQuickRedirect6, false, "ce013cde760ab61e12b0867e2dffc40d");
                                return;
                            }
                            if (delegate.v && delegate.w) {
                                CameraUpdate a3 = delegate.a(newLatLngBoundsRect);
                                if (r8 == 0) {
                                    delegate.b.moveCamera(a3);
                                    delegate.a(j3, System.currentTimeMillis());
                                    return;
                                }
                                CameraUpdateMessage cameraUpdateMessage = a3.getCameraUpdateMessage();
                                final CameraUpdateMessage cameraUpdateMessage2 = new CameraUpdateMessage();
                                cameraUpdateMessage2.zoom = cameraUpdateMessage.zoom;
                                cameraUpdateMessage2.latLngBounds = cameraUpdateMessage.latLngBounds;
                                delegate.b.animateCamera(a3, new MTMap.CancelableCallback() { // from class: com.meituan.android.mrn.component.map.view.map.c.15
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
                                    public final void onCancel() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "9a7c790433091e3c9f6826434dd3aba5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "9a7c790433091e3c9f6826434dd3aba5");
                                            return;
                                        }
                                        delegate.a(j3, System.currentTimeMillis());
                                        c.a(delegate, "setBounds", 2, cameraUpdateMessage2);
                                    }

                                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
                                    public final void onFinish() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "9dfb51cda71d719cb1212c9b23e79bfc", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "9dfb51cda71d719cb1212c9b23e79bfc");
                                            return;
                                        }
                                        delegate.a(j3, System.currentTimeMillis());
                                        c.a(delegate, "setBounds", 1, cameraUpdateMessage2);
                                    }
                                });
                                return;
                            }
                            c.a aVar = new c.a();
                            aVar.a = 2;
                            aVar.c = newLatLngBoundsRect;
                            aVar.d = r8;
                            delegate.x.add(aVar);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    if (readableArray == null || readableArray.size() <= 1) {
                        e.a(new IllegalArgumentException("setCenter must have two parameters"), "param");
                        return;
                    }
                    ReadableMap map3 = readableArray.getMap(0);
                    boolean z2 = readableArray.getBoolean(1);
                    Object[] objArr6 = {map3, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect7 = c.a;
                    if (PatchProxy.isSupport(objArr6, delegate, changeQuickRedirect7, false, "1595e54c94cfec27f82113297d72a05c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, delegate, changeQuickRedirect7, false, "1595e54c94cfec27f82113297d72a05c");
                        return;
                    }
                    if (map3 != null && delegate.b != null) {
                        LatLng b2 = com.meituan.android.mrn.component.map.utils.a.b(map3);
                        if (b2 == null) {
                            e.a(new IllegalArgumentException("setCenter: must contains center"), "param");
                            return;
                        } else {
                            delegate.a(CameraUpdateFactory.newLatLng(b2), z2);
                            return;
                        }
                    }
                    return;
                case 5:
                    if (readableArray == null || readableArray.size() <= 0) {
                        e.a(new IllegalArgumentException("zoomIn must have parameter"), "param");
                        return;
                    }
                    boolean z3 = readableArray.getBoolean(0);
                    Object[] objArr7 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect8 = c.a;
                    if (PatchProxy.isSupport(objArr7, delegate, changeQuickRedirect8, false, "ce429de9a9f831b6abfe79699a82fbf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, delegate, changeQuickRedirect8, false, "ce429de9a9f831b6abfe79699a82fbf7");
                        return;
                    } else if (delegate.b != null) {
                        delegate.a(CameraUpdateFactory.zoomIn(), z3);
                        return;
                    } else {
                        return;
                    }
                case 6:
                    if (readableArray == null || readableArray.size() <= 0) {
                        e.a(new IllegalArgumentException("zoomOut must have parameter"), "param");
                        return;
                    }
                    boolean z4 = readableArray.getBoolean(0);
                    Object[] objArr8 = {Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect9 = c.a;
                    if (PatchProxy.isSupport(objArr8, delegate, changeQuickRedirect9, false, "a48ec81bc4e6107ba7ce2a0f2daa2429", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, delegate, changeQuickRedirect9, false, "a48ec81bc4e6107ba7ce2a0f2daa2429");
                        return;
                    } else if (delegate.b != null) {
                        delegate.a(CameraUpdateFactory.zoomOut(), z4);
                        return;
                    } else {
                        return;
                    }
                case 7:
                    if (readableArray == null || readableArray.size() <= 1) {
                        e.a(new IllegalArgumentException("zoomTo must have two parameters"), "param");
                        return;
                    }
                    float f4 = (float) readableArray.getDouble(0);
                    boolean z5 = readableArray.getBoolean(1);
                    Object[] objArr9 = {Float.valueOf(f4), Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect10 = c.a;
                    if (PatchProxy.isSupport(objArr9, delegate, changeQuickRedirect10, false, "638d7e3db7f4e0c5066bcf212fae6384", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, delegate, changeQuickRedirect10, false, "638d7e3db7f4e0c5066bcf212fae6384");
                        return;
                    } else if (delegate.b != null) {
                        delegate.a(CameraUpdateFactory.zoomTo(f4), z5);
                        return;
                    } else {
                        return;
                    }
                case 8:
                    if (readableArray == null || readableArray.size() <= 1) {
                        e.a(new IllegalArgumentException("zoomBy must have two parameters"), "param");
                        return;
                    }
                    float f5 = (float) readableArray.getDouble(0);
                    boolean z6 = readableArray.getBoolean(1);
                    Object[] objArr10 = {Float.valueOf(f5), Byte.valueOf(z6 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect11 = c.a;
                    if (PatchProxy.isSupport(objArr10, delegate, changeQuickRedirect11, false, "809706bd99124d6d2b11abab07d0b5a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, delegate, changeQuickRedirect11, false, "809706bd99124d6d2b11abab07d0b5a8");
                        return;
                    } else if (delegate.b != null) {
                        delegate.a(CameraUpdateFactory.zoomBy(f5), z6);
                        return;
                    } else {
                        return;
                    }
                case 9:
                    delegate.b(readableArray);
                    return;
                case 10:
                    if (readableArray != null && readableArray.size() > 0) {
                        ReadableMap map4 = readableArray.getMap(0);
                        Object[] objArr11 = {map4};
                        ChangeQuickRedirect changeQuickRedirect12 = c.a;
                        if (PatchProxy.isSupport(objArr11, delegate, changeQuickRedirect12, false, "d4b0cb3c0ef579005043c360e1393ef9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, delegate, changeQuickRedirect12, false, "d4b0cb3c0ef579005043c360e1393ef9");
                            return;
                        }
                        if (delegate.b != null && delegate.d != 0) {
                            LatLngBounds c2 = com.meituan.android.mrn.component.map.utils.a.a(map4, "bounds") ? com.meituan.android.mrn.component.map.utils.a.c(map4.getMap("bounds")) : null;
                            if (c2 == null) {
                                delegate.b.setRestrictBounds(null, null);
                                return;
                            }
                            RestrictBoundsFitMode restrictBoundsFitMode = RestrictBoundsFitMode.FIT_WIDTH;
                            if (com.meituan.android.mrn.component.map.utils.a.a(map4, "fitMode") && map4.getInt("fitMode") == 1) {
                                restrictBoundsFitMode = RestrictBoundsFitMode.FIT_HEIGHT;
                            }
                            delegate.b.setRestrictBounds(c2, restrictBoundsFitMode);
                            return;
                        }
                        return;
                    }
                    illegalArgumentException2 = new IllegalArgumentException("setBounds must have parameter");
                    str2 = "param";
                    break;
                    break;
                case 11:
                    if (readableArray != null && readableArray.size() > 0) {
                        delegate.b(readableArray.getMap(0));
                        return;
                    }
                    illegalArgumentException2 = new IllegalArgumentException("setMapCenterPoint must have parameter");
                    str2 = "param";
                    break;
                    break;
                case 12:
                    if (readableArray != null && readableArray.size() > 1) {
                        delegate.a(readableArray.getMap(0), readableArray.getBoolean(1));
                        return;
                    }
                    illegalArgumentException2 = new IllegalArgumentException("moveToMapCenterPoint must have parameter");
                    str2 = "param";
                    break;
                case 13:
                    if (readableArray == null || readableArray.size() <= 0) {
                        e.a(new IllegalArgumentException("raptorSendInfo must have parameter"), "param");
                        return;
                    }
                    Object[] objArr12 = {readableArray};
                    ChangeQuickRedirect changeQuickRedirect13 = c.a;
                    if (PatchProxy.isSupport(objArr12, delegate, changeQuickRedirect13, false, "0347657a6573075d62a56bcbe41ad796", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, delegate, changeQuickRedirect13, false, "0347657a6573075d62a56bcbe41ad796");
                        return;
                    } else if (delegate.b != null) {
                        if (readableArray != null && readableArray.size() >= 2) {
                            e.a(com.meituan.android.mrn.component.map.utils.a.a(readableArray.getString(0)), delegate.E);
                            return;
                        }
                        e.a(new IllegalArgumentException("raptorSendInfo must have two parameter"), "param");
                        return;
                    } else {
                        return;
                    }
                case 14:
                    if (readableArray == null) {
                        e.a(new IllegalArgumentException("applyMapColorStyle must have parameter"), "param");
                        return;
                    }
                    Object[] objArr13 = {readableArray};
                    ChangeQuickRedirect changeQuickRedirect14 = c.a;
                    if (PatchProxy.isSupport(objArr13, delegate, changeQuickRedirect14, false, "9f4bb83da4bb4174071b8a3e14c342cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, delegate, changeQuickRedirect14, false, "9f4bb83da4bb4174071b8a3e14c342cf");
                        return;
                    } else if (delegate.b == null || delegate.c == null || readableArray.size() <= 1) {
                        return;
                    } else {
                        delegate.b.setMapStyleColor(readableArray.getString(0), readableArray.getBoolean(1));
                        return;
                    }
                default:
                    return;
            }
            e.a(illegalArgumentException2, str2);
        } catch (Exception e) {
            e.a(e, "param");
        }
    }

    @ReactProp(name = "businessKey")
    public void setBusinessKey(ViewGroup viewGroup, String str) {
        Object[] objArr = {viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14faed8f6e1b26b28799c884d967cad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14faed8f6e1b26b28799c884d967cad1");
            return;
        }
        interceptPropsInit(str);
        if (getDelegate(viewGroup) != null) {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "030bc1b1befe853828dfef81c913581c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "030bc1b1befe853828dfef81c913581c");
            } else {
                delegate.E.put("mapKey", str);
            }
        }
    }

    @ReactProp(name = "businessTag")
    public void setBusinessTag(ViewGroup viewGroup, String str) {
        Object[] objArr = {viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "466e5cf5d10ef3d538169d2537bb5e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "466e5cf5d10ef3d538169d2537bb5e27");
            return;
        }
        interceptPropsInit(str);
        if (getDelegate(viewGroup) != null) {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "56f2e6ebd8a0526e19195ad26dc4e6ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "56f2e6ebd8a0526e19195ad26dc4e6ff");
                return;
            }
            delegate.i = str;
            delegate.d();
            delegate.e();
        }
    }

    @ReactProp(name = "minZoomLevel")
    public void setMinZoomLevel(ViewGroup viewGroup, float f) {
        c<?> delegate;
        Object[] objArr = {viewGroup, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66d4575c4c08aaec1479600d56a00bdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66d4575c4c08aaec1479600d56a00bdf");
        } else if (interceptPropsInit(Float.valueOf(f)) || (delegate = getDelegate(viewGroup)) == null || delegate.b == null) {
        } else {
            delegate.b.setMinZoomLevel(f);
        }
    }

    @ReactProp(name = "maxZoomLevel")
    public void setMaxZoomLevel(ViewGroup viewGroup, float f) {
        c<?> delegate;
        Object[] objArr = {viewGroup, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dffda624f99479d161d109166294aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dffda624f99479d161d109166294aae");
        } else if (interceptPropsInit(Float.valueOf(f)) || (delegate = getDelegate(viewGroup)) == null || delegate.b == null) {
        } else {
            delegate.b.setMaxZoomLevel(f);
        }
    }

    @ReactProp(defaultBoolean = true, name = "building3dEnabled")
    public void setBuilding3dEnabled(ViewGroup viewGroup, boolean z) {
        c<?> delegate;
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b55f810cf1a9de55ff236d569d2e9747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b55f810cf1a9de55ff236d569d2e9747");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || (delegate = getDelegate(viewGroup)) == null || delegate.b == null) {
        } else {
            delegate.b.show3dBuilding(z);
        }
    }

    @ReactProp(name = "userLocation")
    public void setUseLocation(ViewGroup viewGroup, ReadableMap readableMap) {
        int i;
        int i2 = 1;
        Object[] objArr = {viewGroup, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a5dadeaf40b6661dc2792af373b7b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a5dadeaf40b6661dc2792af373b7b3d");
        } else if (interceptPropsInit(readableMap) || getDelegate(viewGroup) == null) {
        } else {
            final c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {readableMap};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "77b41a17a1b92ad4f277c4bb34b8a75e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "77b41a17a1b92ad4f277c4bb34b8a75e");
            } else if (readableMap == null || delegate.b == null || delegate.c == null) {
            } else {
                if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap, "enable")) {
                    e.a(new IllegalArgumentException("userLocation must has key enable"), "param");
                    return;
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "useSensorBearing")) {
                    delegate.t = readableMap.getBoolean("useSensorBearing");
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "trackingMode")) {
                    int i3 = readableMap.getInt("trackingMode");
                    Object[] objArr3 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (!PatchProxy.isSupport(objArr3, delegate, changeQuickRedirect4, false, "2116d49df03c3611cd760ffa5ced09a8", RobustBitConfig.DEFAULT_VALUE)) {
                        switch (i3) {
                            case 1:
                                if (delegate.t) {
                                    i2 = 5;
                                }
                                i = i2;
                                break;
                            case 2:
                                i2 = delegate.t ? 4 : 0;
                                i = i2;
                                break;
                            case 3:
                                i2 = delegate.t ? 6 : 3;
                                i = i2;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                    } else {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, delegate, changeQuickRedirect4, false, "2116d49df03c3611cd760ffa5ced09a8")).intValue();
                    }
                    delegate.u = i;
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "showAccuracyCircle")) {
                    delegate.n = readableMap.getBoolean("showAccuracyCircle");
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "accuracyCircleRadiusCeiling")) {
                    delegate.o = (float) readableMap.getDouble("accuracyCircleRadiusCeiling");
                }
                delegate.p = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "accuracyCircleFillColor") ? readableMap.getInt("accuracyCircleFillColor") : c.k;
                delegate.q = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "accuracyCircleStrokeColor") ? readableMap.getInt("accuracyCircleStrokeColor") : c.l;
                delegate.r = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "accuracyCircleStrokeWidth") ? b.a(delegate.c, (float) readableMap.getDouble("accuracyCircleStrokeWidth")) : 0.0f;
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "zIndex")) {
                    delegate.s = readableMap.getInt("zIndex");
                }
                delegate.m = readableMap.getBoolean("enable");
                if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap, RemoteMessageConst.Notification.ICON)) {
                    delegate.d();
                    return;
                }
                String string = readableMap.getString(RemoteMessageConst.Notification.ICON);
                if (string == null || string.length() <= 0) {
                    delegate.d();
                    return;
                }
                final int a = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "iconWidth") ? b.a(delegate.c, (float) readableMap.getDouble("iconWidth")) : Integer.MIN_VALUE;
                final int a2 = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "iconHeight") ? b.a(delegate.c, (float) readableMap.getDouble("iconHeight")) : Integer.MIN_VALUE;
                com.meituan.android.mrn.component.map.utils.c.a(delegate.c).a(string, new Target() { // from class: com.meituan.android.mrn.component.map.view.map.c.17
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                        Object[] objArr4 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "dde71953a40a0a62787a5e8f3b803877", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "dde71953a40a0a62787a5e8f3b803877");
                            return;
                        }
                        com.meituan.android.mrn.component.map.utils.e.a(new HashMap<String, Float>() { // from class: com.meituan.android.mrn.component.map.view.map.c.17.2
                            {
                                AnonymousClass17.this = this;
                                put("MTMapMRNImageLoaderLocation", Float.valueOf(0.0f));
                            }
                        }, delegate.E);
                        delegate.d();
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr4 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "6931cb9148f99e9410f8760a290cb33b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "6931cb9148f99e9410f8760a290cb33b");
                            return;
                        }
                        if (bitmap != null) {
                            delegate.K = BitmapDescriptorFactory.fromBitmap(com.meituan.android.mrn.component.map.utils.c.a(bitmap, a, a2));
                        }
                        com.meituan.android.mrn.component.map.utils.e.a(new HashMap<String, Float>() { // from class: com.meituan.android.mrn.component.map.view.map.c.17.1
                            {
                                AnonymousClass17.this = this;
                                put("MTMapMRNImageLoaderLocation", Float.valueOf(1.0f));
                            }
                        }, delegate.E);
                        delegate.d();
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }
                });
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = "pressToShowCallout")
    public void setClickToShowInfoWindow(ViewGroup viewGroup, boolean z) {
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "672246dd397d059b2e0ff07f2f05b5c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "672246dd397d059b2e0ff07f2f05b5c8");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || getDelegate(viewGroup) == null) {
        } else {
            getDelegate(viewGroup).j = z;
        }
    }

    @ReactProp(name = "traffic")
    public void setTraffic(ViewGroup viewGroup, ReadableMap readableMap) {
        Object[] objArr = {viewGroup, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84bfbfa9640de184737981959da2e78e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84bfbfa9640de184737981959da2e78e");
        } else if (interceptPropsInit(readableMap) || getDelegate(viewGroup) == null) {
        } else {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {readableMap};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "4040302c68a0fd4fbf4b7fac911f41f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "4040302c68a0fd4fbf4b7fac911f41f4");
            } else if (readableMap == null || delegate.b == null) {
            } else {
                if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap, "enable")) {
                    e.a(new IllegalArgumentException("traffic must has key enable"), "param");
                    return;
                }
                TrafficStyle trafficStyle = new TrafficStyle();
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "smoothColor")) {
                    trafficStyle.setSmoothColor(readableMap.getInt("smoothColor"));
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "slowColor")) {
                    trafficStyle.setSlowColor(readableMap.getInt("slowColor"));
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "congestedColor")) {
                    trafficStyle.setCongestedColor(readableMap.getInt("congestedColor"));
                }
                if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "seriousCongestedColor")) {
                    trafficStyle.setSeriousCongestedColor(readableMap.getInt("seriousCongestedColor"));
                }
                delegate.b.setTrafficStyle(trafficStyle);
                delegate.z = readableMap.getBoolean("enable");
                delegate.b.setTrafficEnabled(delegate.z);
            }
        }
    }

    @ReactProp(name = "firstRenderTime")
    public void setFSToNativeTime(ViewGroup viewGroup, double d) {
        Object[] objArr = {viewGroup, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "451fd7532312a6a8e7107df0f9fc963a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "451fd7532312a6a8e7107df0f9fc963a");
        } else if (interceptPropsInit(Double.valueOf(d)) || getDelegate(viewGroup) == null) {
        } else {
            final c<?> delegate = getDelegate(viewGroup);
            final long currentTimeMillis = System.currentTimeMillis() - ((long) d);
            Object[] objArr2 = {new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "8dbc5421a6f8febb64e403cef0c4dbf0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "8dbc5421a6f8febb64e403cef0c4dbf0");
            } else if (delegate.b == null || delegate.c == null) {
            } else {
                e.a(new HashMap<String, Float>() { // from class: com.meituan.android.mrn.component.map.view.map.c.20
                    {
                        put("MTMapMRNFSToNativeTime", Float.valueOf((float) currentTimeMillis));
                    }
                }, delegate.E);
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = "pressToDeselectMarker")
    public void setClickToDeselectMarker(ViewGroup viewGroup, boolean z) {
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65abda851e97215952b4e8c6837dfc6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65abda851e97215952b4e8c6837dfc6b");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || getDelegate(viewGroup) == null) {
        } else {
            c<?> delegate = getDelegate(viewGroup);
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, delegate, changeQuickRedirect3, false, "ab767491cc852e9eb43e8adeb396d1ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, delegate, changeQuickRedirect3, false, "ab767491cc852e9eb43e8adeb396d1ad");
            } else if (delegate.b != null) {
                delegate.b.clickToDeselectMarker(z);
            }
        }
    }

    @ReactProp(name = "disableCacheCommand")
    public void setDisableCacheCommand(ViewGroup viewGroup, boolean z) {
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "671e5d4da170164dec922253082200a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "671e5d4da170164dec922253082200a8");
        } else if (interceptPropsInit(Boolean.valueOf(z)) || getDelegate(viewGroup) == null) {
        } else {
            getDelegate(viewGroup).v = z;
        }
    }

    private UiSettings getUISettings(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63a2ed640ff85c1cc47ec333a00608f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (UiSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63a2ed640ff85c1cc47ec333a00608f1");
        }
        if (cVar == null || cVar.b == null) {
            return null;
        }
        return cVar.b.getUiSettings();
    }

    private d getMapViewOptions(HashMap<String, Object> hashMap) {
        ac acVar;
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c3b28ed2dd58d6dd393ab467ccee0d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c3b28ed2dd58d6dd393ab467ccee0d7");
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        try {
            d dVar = new d();
            ReadableMap readableMap = (ReadableMap) hashMap.get("setInitialProps");
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, WmChooseMediaModule.TYPE_CAMERA)) {
                ReadableMap map = readableMap.getMap(WmChooseMediaModule.TYPE_CAMERA);
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.component.map.utils.a.a;
                dVar.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "9b126ae0ce9c3a9671b8ed83a0ee5aff", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "9b126ae0ce9c3a9671b8ed83a0ee5aff") : (map != null && com.meituan.android.mrn.component.map.utils.a.a(map, "center") && com.meituan.android.mrn.component.map.utils.a.a(map, "zoom")) ? (com.meituan.android.mrn.component.map.utils.a.a(map, "tilt") && com.meituan.android.mrn.component.map.utils.a.a(map, "bearing")) ? new CameraPosition(com.meituan.android.mrn.component.map.utils.a.b(map.getMap("center")), (float) map.getDouble("zoom"), (float) map.getDouble("tilt"), (float) map.getDouble("bearing")) : new CameraPosition(com.meituan.android.mrn.component.map.utils.a.b(map.getMap("center")), (float) map.getDouble("zoom")) : null;
            }
            if (hashMap.containsKey("setZoomMode")) {
                switch (((Integer) hashMap.get("setZoomMode")).intValue()) {
                    case 0:
                        acVar = ac.MEITUAN;
                        break;
                    case 1:
                        acVar = ac.TENCENT;
                        break;
                    case 2:
                        acVar = ac.AMAP;
                        break;
                    default:
                        acVar = null;
                        break;
                }
                dVar.a = acVar;
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "useOverseasMap")) {
                dVar.c = readableMap.getBoolean("useOverseasMap");
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "basemapSourceType")) {
                dVar.d = readableMap.getInt("basemapSourceType");
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "initialStyle")) {
                dVar.e = readableMap.getString("initialStyle");
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "mapStyle")) {
                ReadableMap map2 = readableMap.getMap("mapStyle");
                if (com.meituan.android.mrn.component.map.utils.a.a(map2, com.meituan.metrics.common.Constants.TRAFFIC_URI)) {
                    dVar.f = map2.getString(com.meituan.metrics.common.Constants.TRAFFIC_URI);
                }
            }
            return dVar;
        } catch (Exception e) {
            e.a(e, "[getInitProps] invoke error");
            e.printStackTrace();
            return null;
        }
    }
}
