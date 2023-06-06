package com.meituan.android.mrn.component.list.event;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends com.facebook.react.uimanager.events.b<j> {
    public static ChangeQuickRedirect a;
    private WritableArray b;
    private WritableArray c;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onViewableItemsChanged";
    }

    public j(int i, WritableArray writableArray, WritableArray writableArray2) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), writableArray, writableArray2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a09034919cbed7e2a89e7160950e19b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a09034919cbed7e2a89e7160950e19b");
            return;
        }
        this.b = writableArray;
        this.c = writableArray2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ed4ad6d1d6a7fc324d3a621c8fea09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ed4ad6d1d6a7fc324d3a621c8fea09");
            return;
        }
        int e = e();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa84693363e01e6af2814ba48ab4f754", RobustBitConfig.DEFAULT_VALUE)) {
            createMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa84693363e01e6af2814ba48ab4f754");
        } else {
            createMap = Arguments.createMap();
            createMap.putArray("viewableItems", this.b);
            createMap.putArray("changed", this.c);
        }
        rCTEventEmitter.receiveEvent(e, "onViewableItemsChanged", createMap);
    }
}
