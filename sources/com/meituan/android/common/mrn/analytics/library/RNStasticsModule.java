package com.meituan.android.common.mrn.analytics.library;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.meituan.android.common.mrn.analytics.library.Protocol;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNStasticsModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final NativeStasticsProxy mStasticsProxy;
    private final ReactApplicationContext reactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeStasticsProxy.MODULE_NAME;
    }

    public RNStasticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "accc206901aa048ffd22542d2dc17e99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "accc206901aa048ffd22542d2dc17e99");
            return;
        }
        this.reactContext = reactApplicationContext;
        this.mStasticsProxy = NativeStasticsProxy.getInstance();
    }

    @ReactMethod
    public void pageView(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9885367bc8f2cd2ec3dd46f6f529c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9885367bc8f2cd2ec3dd46f6f529c48");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.pageView(parseEvent.pageInfoKey, parseEvent.category, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void pageDisappear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d04eda9852a2eef03e19bb21175c43a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d04eda9852a2eef03e19bb21175c43a5");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.pageDisappear(parseEvent.pageInfoKey, parseEvent.category, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void moduleClick(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93e3ee2b67074375f1ea8f154aefdf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93e3ee2b67074375f1ea8f154aefdf2");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.moduleClick(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void moduleView(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7663cb576aa2516748fc906547757e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7663cb576aa2516748fc906547757e4");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.moduleView(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void moduleEdit(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ddde15a261d27450ae6f75bae44d5d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ddde15a261d27450ae6f75bae44d5d6");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.moduleEdit(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void moduleViewList(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ff1ae4013fd2fa5aac93ad84194ff3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ff1ae4013fd2fa5aac93ad84194ff3f");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.moduleViewList(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void pay(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9defd6c4d7ab997851193a751adb80ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9defd6c4d7ab997851193a751adb80ae");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.pay(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.orderid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void order(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "382284dc67dc6c3c1f5dbe36f8d90aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "382284dc67dc6c3c1f5dbe36f8d90aa6");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.order(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.orderid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void systemCheck(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fa55ac64e3f4f2ed7cad753bc4bc5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fa55ac64e3f4f2ed7cad753bc4bc5ad");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.systemCheck(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void setTag(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a33e8b908bf799aed29953880662dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a33e8b908bf799aed29953880662dce");
            return;
        }
        Protocol.TagBean parseTag = Protocol.parseTag(readableMap);
        if (parseTag != null) {
            this.mStasticsProxy.setTag(parseTag.key, parseTag.value);
        }
    }

    @ReactMethod
    public void moduleExpose(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bc913b8bf4fdcda0327f83c372e3d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bc913b8bf4fdcda0327f83c372e3d9f");
            return;
        }
        Protocol.EventBean parseEvent = Protocol.parseEvent(readableMap);
        if (parseEvent != null) {
            this.mStasticsProxy.moduleExposure(parseEvent.pageInfoKey, parseEvent.category, parseEvent.bid, parseEvent.cid, parseEvent.containerId, parseEvent.mreq_id, parseEvent.vallab);
        }
    }

    @ReactMethod
    public void moduleDisappear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e74dfe1db761f57b231600b080b529d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e74dfe1db761f57b231600b080b529d");
            return;
        }
        ReadableArray array = readableMap.getArray("dataList");
        for (int i = 0; i < array.size(); i++) {
            Protocol.ExposureBean parseExposure = Protocol.parseExposure(array.getMap(i));
            if (parseExposure != null) {
                this.mStasticsProxy.moduleDisappear(parseExposure.containerId, parseExposure.mreq_id, parseExposure.mduration, parseExposure.mduration_total, parseExposure.mduration_cnt);
            }
        }
    }

    @ReactMethod
    public void mrnContainerReleased(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee458320ef68beff892d6f71f62a6da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee458320ef68beff892d6f71f62a6da9");
        } else if (readableMap.hasKey("containerID") && ReadableType.String == readableMap.getType("containerID")) {
            this.mStasticsProxy.mrnContainerReleased(readableMap.getString("containerID"));
        }
    }
}
