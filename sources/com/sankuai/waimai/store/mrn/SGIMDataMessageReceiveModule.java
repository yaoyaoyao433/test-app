package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.coredata.processor.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMDataMessageReceiveModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.InterfaceC1380a onReceiveDataMsgListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMIMDataMessageReceiver";
    }

    @ReactMethod
    public void unregisterDataMessageReceiveMessageListener(Promise promise) {
    }

    public SGIMDataMessageReceiveModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f2f19a1e71ae97288d19bcfe601581f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f2f19a1e71ae97288d19bcfe601581f");
        }
    }

    @ReactMethod
    public void registerDataMessageReceiveMessageListener(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1748b50d7f7c7fb83f3a5b8d4aa0eb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1748b50d7f7c7fb83f3a5b8d4aa0eb7c");
            return;
        }
        if (this.onReceiveDataMsgListener == null) {
            this.onReceiveDataMsgListener = new a.InterfaceC1380a() { // from class: com.sankuai.waimai.store.mrn.SGIMDataMessageReceiveModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.coredata.processor.a.InterfaceC1380a
                public final void a(int i, DataMessage dataMessage) {
                }

                @Override // com.sankuai.xm.coredata.processor.a.InterfaceC1380a
                public final void a(List<DataMessage> list, boolean z) {
                    Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bd72ffc37b6dd1a506d75c9ba120db40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bd72ffc37b6dd1a506d75c9ba120db40");
                    } else if (com.sankuai.shangou.stone.util.a.a((List) list) > 0) {
                        try {
                            WritableArray createArray = Arguments.createArray();
                            for (DataMessage dataMessage : list) {
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("dataJSON", new String(dataMessage.getData()));
                                createMap.putInt("type", dataMessage.getType());
                                StringBuilder sb = new StringBuilder();
                                sb.append(dataMessage.getMsgId());
                                createMap.putString("msgId", sb.toString());
                                createArray.pushMap(createMap);
                            }
                            ReactApplicationContext reactApplicationContext = SGIMDataMessageReceiveModule.this.getReactApplicationContext();
                            Object[] objArr3 = {reactApplicationContext, "SGIMDataMessageEvent", createArray};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "9630b32960cc0ef3db80bbb86f73fddc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "9630b32960cc0ef3db80bbb86f73fddc");
                            } else if (reactApplicationContext != null && reactApplicationContext != null) {
                                try {
                                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("SGIMDataMessageEvent", createArray);
                                } catch (Exception e) {
                                    com.dianping.judas.util.a.a(e);
                                }
                            }
                        } catch (Exception e2) {
                            com.sankuai.shangou.stone.util.log.a.a(e2);
                            com.sankuai.waimai.store.base.log.a.a(e2);
                        }
                    }
                }
            };
        }
        com.sankuai.xm.d.d().a(this.onReceiveDataMsgListener);
    }
}
