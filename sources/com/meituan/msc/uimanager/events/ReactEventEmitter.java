package com.meituan.msc.uimanager.events;

import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactSoftException;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactEventEmitter implements RCTEventEmitter {
    private static final String TAG = "ReactEventEmitter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final SparseArray<RCTEventEmitter> mEventEmitters;
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1805d94443d31927be0e60c1eabd1fe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1805d94443d31927be0e60c1eabd1fe2");
            return;
        }
        this.mEventEmitters = new SparseArray<>();
        this.mReactContext = reactApplicationContext;
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {Integer.valueOf(i), rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bec7c8bb710eb838af64b831529f0f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bec7c8bb710eb838af64b831529f0f2");
        } else {
            this.mEventEmitters.put(i, rCTEventEmitter);
        }
    }

    public void unregister(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef06d80af29d8ef82a45113941824cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef06d80af29d8ef82a45113941824cfe");
        } else {
            this.mEventEmitters.remove(i);
        }
    }

    @Override // com.meituan.msc.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, int i2, String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d8754c9c111228277bb036e80f3bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d8754c9c111228277bb036e80f3bef");
            return;
        }
        RCTEventEmitter eventEmitter = getEventEmitter(i2);
        if (eventEmitter != null) {
            eventEmitter.receiveEvent(getPageId(), i2, str, writableMap, null);
        }
    }

    @Override // com.meituan.msc.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, int i2, String str, @Nullable WritableMap writableMap, View view) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, writableMap, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ca9baad005b2f88c888983ac97e66b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ca9baad005b2f88c888983ac97e66b3");
            return;
        }
        RCTEventEmitter eventEmitter = getEventEmitter(i2);
        if (eventEmitter != null) {
            eventEmitter.receiveEvent(getPageId(), i2, str, writableMap, null);
        }
    }

    @Override // com.meituan.msc.uimanager.events.RCTEventEmitter
    public void receiveTouches(int i, String str, WritableArray writableArray, WritableArray writableArray2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, writableArray, writableArray2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "247d11d5d94609d71f4109b210c9be7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "247d11d5d94609d71f4109b210c9be7f");
            return;
        }
        com.facebook.infer.annotation.a.a(writableArray.size() > 0);
        int i2 = writableArray.getMap(0).getInt("target");
        RCTEventEmitter eventEmitter = getEventEmitter(i2);
        if (eventEmitter != null) {
            eventEmitter.receiveTouches(getPageId(), str, writableArray, writableArray2, z);
            if (!z || i2 == 1) {
                return;
            }
            this.mReactContext.getUIManagerModule().c.a(1, str);
        }
    }

    @Override // com.meituan.msc.uimanager.events.RCTEventEmitter
    public int getPageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58461f18eac50c302843b87abe05f80a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58461f18eac50c302843b87abe05f80a")).intValue() : this.mReactContext.getRuntimeDelegate().getPageId();
    }

    @Nullable
    private RCTEventEmitter getEventEmitter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb89746d755593465bd79cf47f1f9095", RobustBitConfig.DEFAULT_VALUE)) {
            return (RCTEventEmitter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb89746d755593465bd79cf47f1f9095");
        }
        RCTEventEmitter rCTEventEmitter = this.mEventEmitters.get(1);
        if (rCTEventEmitter == null) {
            com.meituan.msc.modules.reporter.g.a(TAG, String.format("Unable to find event emitter for reactTag: %d - uiManagerType: %d", Integer.valueOf(i), 1));
            if (this.mReactContext.hasActiveCatalystInstance()) {
                return (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            }
            ReactSoftException.logSoftException(TAG, new com.meituan.msc.exception.b("Cannot get RCTEventEmitter from Context for reactTag: " + i + " - uiManagerType: 1 - No active Catalyst instance!"));
            return rCTEventEmitter;
        }
        return rCTEventEmitter;
    }
}
