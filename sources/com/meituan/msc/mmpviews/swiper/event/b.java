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
public final class b extends i<b> {
    public static ChangeQuickRedirect a;
    private int c;
    private int d;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "onTransition";
    }

    public b(int i, int i2, int i3, View view) {
        super(i, view);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ccf9f4a43dfa978cb8f847abd1b58a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ccf9f4a43dfa978cb8f847abd1b58a0");
            return;
        }
        this.c = i2;
        this.d = i3;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dccccb69c36b2ec73238b0e58e034295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dccccb69c36b2ec73238b0e58e034295");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("dx", this.c);
        createMap.putInt("dy", this.d);
        rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "onTransition", createMap, e());
    }
}
