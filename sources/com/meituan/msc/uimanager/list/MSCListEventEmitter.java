package com.meituan.msc.uimanager.list;

import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.uimanager.events.ReactEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCListEventEmitter extends ReactEventEmitter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactEventEmitter hostEventEmitter;
    protected c uiImplementation;

    public MSCListEventEmitter(ReactApplicationContext reactApplicationContext, c cVar, ReactEventEmitter reactEventEmitter) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext, cVar, reactEventEmitter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0316002b50b1edef1aa9b04d65a8322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0316002b50b1edef1aa9b04d65a8322");
            return;
        }
        this.hostEventEmitter = reactEventEmitter;
        this.uiImplementation = cVar;
    }

    @Override // com.meituan.msc.uimanager.events.ReactEventEmitter
    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {Integer.valueOf(i), rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b23b10ddcbde86d209ca0333a920071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b23b10ddcbde86d209ca0333a920071");
        } else {
            this.hostEventEmitter.register(i, rCTEventEmitter);
        }
    }

    @Override // com.meituan.msc.uimanager.events.ReactEventEmitter
    public void unregister(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b29529db9c3d69333916b380fe69964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b29529db9c3d69333916b380fe69964");
        } else {
            this.hostEventEmitter.unregister(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    @Override // com.meituan.msc.uimanager.events.ReactEventEmitter, com.meituan.msc.uimanager.events.RCTEventEmitter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiveEvent(int r25, int r26, java.lang.String r27, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.WritableMap r28, android.view.View r29) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.list.MSCListEventEmitter.receiveEvent(int, int, java.lang.String, com.meituan.msc.jse.bridge.WritableMap, android.view.View):void");
    }

    @Override // com.meituan.msc.uimanager.events.ReactEventEmitter, com.meituan.msc.uimanager.events.RCTEventEmitter
    public void receiveTouches(int i, String str, WritableArray writableArray, WritableArray writableArray2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, writableArray, writableArray2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec842c586696e8dad24cc5585f55bd52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec842c586696e8dad24cc5585f55bd52");
            return;
        }
        g.d("[MSCListEventEmitter@receiveTouches]", "event: ", str);
        this.hostEventEmitter.receiveTouches(i, str, writableArray, writableArray2, z);
    }

    @Override // com.meituan.msc.uimanager.events.ReactEventEmitter, com.meituan.msc.uimanager.events.RCTEventEmitter
    public int getPageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b1a3c187651bfd4fe5c43af02591801", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b1a3c187651bfd4fe5c43af02591801")).intValue() : this.hostEventEmitter.getPageId();
    }
}
