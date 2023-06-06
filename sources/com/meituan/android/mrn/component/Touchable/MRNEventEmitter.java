package com.meituan.android.mrn.component.Touchable;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface MRNEventEmitter extends RCTEventEmitter {
    public static final String TAG = "MRNEventEmitter";

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    void receiveEvent(int i, String str, @Nullable WritableMap writableMap);

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}
