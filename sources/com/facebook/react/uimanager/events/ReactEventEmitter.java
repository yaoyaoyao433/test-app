package com.facebook.react.uimanager.events;

import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactEventEmitter implements RCTEventEmitter {
    private static final String TAG = "ReactEventEmitter";
    private final SparseArray<RCTEventEmitter> mEventEmitters = new SparseArray<>();
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mEventEmitters.put(i, rCTEventEmitter);
    }

    public void unregister(int i) {
        this.mEventEmitters.remove(i);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, @Nullable WritableMap writableMap) {
        RCTEventEmitter eventEmitter = getEventEmitter(i);
        if (eventEmitter != null) {
            eventEmitter.receiveEvent(i, str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        com.facebook.infer.annotation.a.a(writableArray.size() > 0);
        RCTEventEmitter eventEmitter = getEventEmitter(writableArray.getMap(0).getInt("target"));
        if (eventEmitter != null) {
            eventEmitter.receiveTouches(str, writableArray, writableArray2);
        }
    }

    @Nullable
    private RCTEventEmitter getEventEmitter(int i) {
        int a = com.facebook.react.uimanager.common.a.a(i);
        RCTEventEmitter rCTEventEmitter = this.mEventEmitters.get(a);
        if (rCTEventEmitter == null) {
            com.facebook.common.logging.a.b(TAG, "Unable to find event emitter for reactTag: %d - uiManagerType: %d", Integer.valueOf(i), Integer.valueOf(a));
            if (this.mReactContext.hasActiveCatalystInstance()) {
                return (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            }
            ReactSoftException.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context for reactTag: " + i + " - uiManagerType: " + a + " - No active Catalyst instance!"));
            return rCTEventEmitter;
        }
        return rCTEventEmitter;
    }
}
