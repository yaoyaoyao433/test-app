package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.coredata.bean.TTMessage;
import com.sankuai.xm.coredata.processor.a;
import com.sankuai.xm.im.message.bean.Receipt;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMTTReceiveModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private a.b mTTMessageListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMIMTTReceiver";
    }

    @ReactMethod
    public void unregisterTTReceiveMessageListener(Promise promise) {
    }

    public SGIMTTReceiveModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aa77cc018c577e842d65a07fffde22e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aa77cc018c577e842d65a07fffde22e");
        }
    }

    @ReactMethod
    public void registerTTReceiveMessageListener(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6efaed65ad3925406236105582dab5ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6efaed65ad3925406236105582dab5ea");
            return;
        }
        if (this.mTTMessageListener == null) {
            this.mTTMessageListener = new a.b() { // from class: com.sankuai.waimai.store.mrn.SGIMTTReceiveModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.coredata.processor.a.b
                public final void a(int i, TTMessage tTMessage) {
                }

                @Override // com.sankuai.xm.coredata.processor.a.b
                public final void a(List<TTMessage> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4f832d180aa829312d973c3258edbef0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4f832d180aa829312d973c3258edbef0");
                    } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                        for (TTMessage tTMessage : list) {
                            if (tTMessage != null && tTMessage.getData() != null) {
                                try {
                                    String str = new String(tTMessage.getData());
                                    WritableMap createMap = Arguments.createMap();
                                    createMap.putString("message", str);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(tTMessage.getFromUid());
                                    createMap.putString("pubUid", sb.toString());
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(tTMessage.getMsgId());
                                    createMap.putString("msgId", sb2.toString());
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(tTMessage.getCts());
                                    createMap.putString(Receipt.STAMP, sb3.toString());
                                    createMap.putString("uuid", tTMessage.getMsgUuid());
                                    com.sankuai.waimai.store.mrn.shopcartbridge.a.a(SGIMTTReceiveModule.this.getReactApplicationContext(), "SGIMTTEvent", createMap);
                                } catch (Exception e) {
                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                    com.sankuai.waimai.store.base.log.a.a(e);
                                }
                            }
                        }
                    }
                }
            };
        }
        com.sankuai.xm.d.d().a(this.mTTMessageListener);
    }
}
