package com.meituan.msc.mmpviews.swiper.event;

import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.uimanager.events.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends i<a> {
    public static ChangeQuickRedirect a;
    private int c;
    private String d;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "onAnimationfinish";
    }

    public a(int i, int i2, String str, View view) {
        super(i, view);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2623ed920ef4d50e6f99bebfbee12c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2623ed920ef4d50e6f99bebfbee12c");
            return;
        }
        this.c = i2;
        this.d = str;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac82ad3808114cc5a6471a93bb10638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac82ad3808114cc5a6471a93bb10638");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("current", this.c);
        createMap.putString("source", this.d);
        rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "onAnimationfinish", createMap, e());
    }
}
