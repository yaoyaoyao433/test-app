package com.facebook.react.views.swiperefresh;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import com.BV.LinearGradient.LinearGradientManager;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.au;
import com.facebook.react.uimanager.bb;
import com.facebook.react.viewmanagers.c;
import com.facebook.react.viewmanagers.d;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<ReactSwipeRefreshLayout> implements d<ReactSwipeRefreshLayout> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final bb<ReactSwipeRefreshLayout> mDelegate = new c(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public void setNativeRefreshing(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactSwipeRefreshLayout createViewInstance(ao aoVar) {
        return new ReactSwipeRefreshLayout(aoVar);
    }

    @Override // com.facebook.react.viewmanagers.d
    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.d
    @ReactProp(customType = "ColorArray", name = LinearGradientManager.PROP_COLORS)
    public void setColors(ReactSwipeRefreshLayout reactSwipeRefreshLayout, @Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int[] iArr = new int[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                if (readableArray.getType(i) == ReadableType.Map) {
                    iArr[i] = ColorPropConverter.getColor(readableArray.getMap(i), reactSwipeRefreshLayout.getContext()).intValue();
                } else {
                    iArr[i] = readableArray.getInt(i);
                }
            }
            reactSwipeRefreshLayout.setColorSchemeColors(iArr);
            return;
        }
        reactSwipeRefreshLayout.setColorSchemeColors(new int[0]);
    }

    @Override // com.facebook.react.viewmanagers.d
    @ReactProp(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(ReactSwipeRefreshLayout reactSwipeRefreshLayout, Integer num) {
        reactSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // com.facebook.react.viewmanagers.d
    public void setSize(ReactSwipeRefreshLayout reactSwipeRefreshLayout, int i) {
        reactSwipeRefreshLayout.setSize(i);
    }

    @ReactProp(name = JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
    public void setSize(ReactSwipeRefreshLayout reactSwipeRefreshLayout, Dynamic dynamic) {
        if (dynamic.isNull()) {
            reactSwipeRefreshLayout.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            reactSwipeRefreshLayout.setSize(dynamic.asInt());
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals("default")) {
                reactSwipeRefreshLayout.setSize(1);
            } else if (asString.equals("large")) {
                reactSwipeRefreshLayout.setSize(0);
            } else {
                throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + asString);
            }
        } else {
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
    }

    @Override // com.facebook.react.viewmanagers.d
    @ReactProp(name = "refreshing")
    public void setRefreshing(ReactSwipeRefreshLayout reactSwipeRefreshLayout, boolean z) {
        reactSwipeRefreshLayout.setRefreshing(z);
    }

    @Override // com.facebook.react.viewmanagers.d
    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(ReactSwipeRefreshLayout reactSwipeRefreshLayout, float f) {
        reactSwipeRefreshLayout.setProgressViewOffset(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ao aoVar, final ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        reactSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager.1
            @Override // android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
            public void onRefresh() {
                com.facebook.react.uimanager.events.c a = au.a(aoVar, reactSwipeRefreshLayout.getId());
                if (a != null) {
                    a.a(new a(reactSwipeRefreshLayout.getId()));
                }
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull ReactSwipeRefreshLayout reactSwipeRefreshLayout, String str, @Nullable ReadableArray readableArray) {
        if (((str.hashCode() == 513968928 && str.equals("setNativeRefreshing")) ? (char) 0 : (char) 65535) == 0 && readableArray != null) {
            setRefreshing(reactSwipeRefreshLayout, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return com.facebook.react.common.c.a("SIZE", com.facebook.react.common.c.a("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.b().a("topRefresh", com.facebook.react.common.c.a("registrationName", com.alipay.sdk.widget.d.p)).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bb<ReactSwipeRefreshLayout> getDelegate() {
        return this.mDelegate;
    }
}
