package com.sankuai.waimai.reactnative.tag;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.mach.tag.c;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.platform.widget.tag.virtualtag.g;
import com.sankuai.waimai.reactnative.tag.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNDynamicTagViewManager extends SimpleViewManager<a> {
    private static final String PROP_CONSTRAINT_WIDTH = "constraintWidth";
    private static final String PROP_LINE_SPACE = "lineSpace";
    private static final String PROP_NATIVE_DYNAMIC_INFO = "nativeDynamicInfo";
    private static final String PROP_NUMBER_OF_LINES = "numberOfLines";
    private static final String PROP_TAGS_INFO = "tagsInfo";
    private static final String PROP_TAG_SPACE = "tagSpace";
    private static final String PROP_UUID = "uuid";
    private static final String REACT_CLASS = "WMRNDynamicTag";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da3e5fa09ada8f2df8619ada2d125771", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da3e5fa09ada8f2df8619ada2d125771");
        }
        a aVar = new a(aoVar);
        aVar.setAdapter(new g(aoVar, null));
        aVar.setMaxLines(1);
        return aVar;
    }

    @ReactProp(name = "tagInfos")
    public void setTagInfoList(@Nullable a aVar, @Nullable String str) {
        List emptyList;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c2c5d9736538d94ad25c11d40e5dfcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c2c5d9736538d94ad25c11d40e5dfcd");
        } else if (aVar == null) {
        } else {
            try {
                emptyList = (List) k.a().fromJson(str, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.reactnative.tag.WMRNDynamicTagViewManager.1
                }.getType());
            } catch (Exception unused) {
                emptyList = Collections.emptyList();
            }
            com.sankuai.waimai.platform.widget.tag.virtualtag.a<?> adapter = aVar.getAdapter();
            if (adapter instanceof g) {
                ((g) adapter).b(com.sankuai.waimai.platform.widget.tag.util.a.a(aVar.getContext(), emptyList));
                adapter.notifyChanged();
            }
            aVar.measure(View.MeasureSpec.makeMeasureSpec(aVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(aVar.getHeight(), 1073741824));
        }
    }

    @ReactProp(name = "data")
    public void seData(@Nullable final a aVar, @Nullable ReadableMap readableMap) {
        List emptyList;
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27edc2a9c12f35a79fce6d098761455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27edc2a9c12f35a79fce6d098761455");
        } else if (aVar == null || readableMap == null) {
        } else {
            String string = readableMap.hasKey(PROP_TAGS_INFO) ? readableMap.getString(PROP_TAGS_INFO) : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            int i = readableMap.hasKey("numberOfLines") ? readableMap.getInt("numberOfLines") : 1;
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            int i2 = readableMap.hasKey(PROP_LINE_SPACE) ? readableMap.getInt(PROP_LINE_SPACE) : 4;
            int i3 = readableMap.hasKey(PROP_TAG_SPACE) ? readableMap.getInt(PROP_TAG_SPACE) : 4;
            int i4 = readableMap.hasKey(PROP_CONSTRAINT_WIDTH) ? readableMap.getInt(PROP_CONSTRAINT_WIDTH) : 0;
            final String string2 = readableMap.hasKey("uuid") ? readableMap.getString("uuid") : "";
            String string3 = readableMap.hasKey(PROP_NATIVE_DYNAMIC_INFO) ? readableMap.getString(PROP_NATIVE_DYNAMIC_INFO) : "";
            aVar.setMaxLines(i);
            aVar.setTagSpace(com.sankuai.waimai.foundation.utils.g.a(aVar.getContext(), i3));
            aVar.setLineSpace(com.sankuai.waimai.foundation.utils.g.a(aVar.getContext(), i2));
            try {
                emptyList = (List) k.a().fromJson(string, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.reactnative.tag.WMRNDynamicTagViewManager.2
                }.getType());
            } catch (Exception unused) {
                emptyList = Collections.emptyList();
            }
            c cVar = null;
            try {
                Map<String, Object> map = JsonUtil.toMap(new JSONObject(string3));
                if (map != null && !map.isEmpty()) {
                    c cVar2 = new c();
                    try {
                        cVar2.c = Integer.parseInt(String.valueOf(map.get("nativeTagHeight")));
                        cVar2.a = Float.parseFloat(String.valueOf(map.get("nativeBorderWidth")));
                        cVar2.b = Float.parseFloat(String.valueOf(map.get("nativeSubTagBorderWidth")));
                    } catch (Exception unused2) {
                    }
                    cVar = cVar2;
                }
            } catch (Exception unused3) {
            }
            com.sankuai.waimai.platform.widget.tag.virtualtag.a<?> adapter = aVar.getAdapter();
            if (adapter instanceof g) {
                ((g) adapter).b(com.sankuai.waimai.platform.widget.tag.util.a.a(aVar.getContext(), emptyList, cVar));
                adapter.notifyChanged();
            }
            aVar.setMeasuredSizeListener(new a.InterfaceC1123a() { // from class: com.sankuai.waimai.reactnative.tag.WMRNDynamicTagViewManager.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.reactnative.tag.a.InterfaceC1123a
                public final void a(int i5, int i6) {
                    Object[] objArr2 = {Integer.valueOf(i5), Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6031c183287d01f16093fcc9b933eca2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6031c183287d01f16093fcc9b933eca2");
                    } else if (aVar.getContext() instanceof ao) {
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        com.sankuai.waimai.platform.widget.tag.virtualtag.a<?> adapter2 = aVar.getAdapter();
                        writableNativeMap.putBoolean("has_more", adapter2 instanceof g ? ((g) adapter2).d : false);
                        float f = aVar.getContext().getResources().getDisplayMetrics().density;
                        writableNativeMap.putDouble("width", i5 / f);
                        writableNativeMap.putDouble("height", i6 / f);
                        writableNativeMap.putString("uuid", string2);
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) ((ao) aVar.getContext()).getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("resizeTagView", writableNativeMap);
                    }
                }
            });
            if (i4 <= 0) {
                aVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                aVar.measure(View.MeasureSpec.makeMeasureSpec(com.sankuai.waimai.foundation.utils.g.a(aVar.getContext(), i4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
    }
}
