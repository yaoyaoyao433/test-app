package com.dianping.gcmrnmodule.wrapperviews.events;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class r extends com.facebook.react.uimanager.events.b<r> {
    public static ChangeQuickRedirect a;
    private long b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return com.alipay.sdk.widget.d.p;
    }

    public r(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94dfa6314398112dcd746ab695812438", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94dfa6314398112dcd746ab695812438");
        } else {
            this.b = -1L;
        }
    }

    public r(int i, long j) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b389204ed2015382d217bf486f6f303", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b389204ed2015382d217bf486f6f303");
            return;
        }
        this.b = -1L;
        this.b = j;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f674367d4ea8f9844cf5b9b29cdbfd98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f674367d4ea8f9844cf5b9b29cdbfd98");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (this.b != -1) {
            writableNativeMap.putString("refreshId", String.valueOf(this.b));
        }
        rCTEventEmitter.receiveEvent(e(), a(), writableNativeMap);
    }
}
