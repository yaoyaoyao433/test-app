package com.facebook.react.uimanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
/* compiled from: ProGuard */
@ReactPropertyHolder
/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends af> extends BaseJavaModule {
    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(@NonNull ao aoVar, @NonNull T t) {
    }

    @NonNull
    protected abstract T createViewInstance(@NonNull ao aoVar);

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    @Nullable
    protected bb<T> getDelegate() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, @Nullable int[] iArr) {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(@NonNull T t) {
    }

    public void onDropViewInstance(@NonNull T t) {
    }

    @Deprecated
    public void receiveCommand(@NonNull T t, int i, @Nullable ReadableArray readableArray) {
    }

    public void receiveCommand(@NonNull T t, String str, @Nullable ReadableArray readableArray) {
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(@NonNull T t, Object obj);

    @Nullable
    public Object updateLocalData(@NonNull T t, ag agVar, ag agVar2) {
        return null;
    }

    @Nullable
    public Object updateState(@NonNull T t, ag agVar, @Nullable an anVar) {
        return null;
    }

    public void updateProperties(@NonNull T t, ag agVar) {
        bb<T> delegate;
        if (com.facebook.react.config.a.c && (delegate = getDelegate()) != null) {
            bc.a(delegate, t, agVar);
        } else {
            bc.a(this, t, agVar);
        }
        onAfterUpdateTransaction(t);
    }

    @NonNull
    private final T createView(@NonNull ao aoVar, com.facebook.react.touch.a aVar) {
        return createView(aoVar, null, null, aVar);
    }

    @NonNull
    public T createView(@NonNull ao aoVar, @Nullable ag agVar, @Nullable an anVar, com.facebook.react.touch.a aVar) {
        T createViewInstance = createViewInstance(aoVar, agVar, anVar);
        if (createViewInstance instanceof com.facebook.react.touch.d) {
            ((com.facebook.react.touch.d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    @NonNull
    protected T createViewInstance(@NonNull ao aoVar, @Nullable ag agVar, @Nullable an anVar) {
        Object updateState;
        T createViewInstance = createViewInstance(aoVar);
        addEventEmitters(aoVar, createViewInstance);
        if (agVar != null) {
            updateProperties(createViewInstance, agVar);
        }
        if (anVar != null && (updateState = updateState(createViewInstance, agVar, anVar)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    public Map<String, String> getNativeProps() {
        return bc.a((Class<? extends ViewManager>) getClass(), (Class<? extends af>) getShadowNodeClass());
    }
}
