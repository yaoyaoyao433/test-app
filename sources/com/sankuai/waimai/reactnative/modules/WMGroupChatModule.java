package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.manager.f;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMGroupChatModule extends ReactContextBaseJavaModule {
    public static final String TAG = "WMGroupModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMRNGroup";
    }

    public WMGroupChatModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6deb0c0da5164e65a0bda6030f5174ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6deb0c0da5164e65a0bda6030f5174ba");
        }
    }

    @ReactMethod
    public void switchDisturb(final String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8f58155e14a246217039370e5f6520d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8f58155e14a246217039370e5f6520d");
        } else {
            l.b(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMGroupChatModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "36625b96e337d244a69df117e9bcfb68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "36625b96e337d244a69df117e9bcfb68");
                        return;
                    }
                    try {
                        f.a().a(str, z ? 1 : 0);
                    } catch (Exception unused) {
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void exitGroup(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7707ebe8232a0dfc345aacd44097326f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7707ebe8232a0dfc345aacd44097326f");
        } else {
            l.b(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMGroupChatModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0ee29557cb67c51fffae91aa59d621a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0ee29557cb67c51fffae91aa59d621a3");
                        return;
                    }
                    try {
                        SessionId a2 = SessionId.a(r.a(str, 0L), 0L, 2, (short) 0, (short) 1036);
                        if (a2 != null) {
                            IMClient.a().a(a2, true, new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.waimai.reactnative.modules.WMGroupChatModule.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.base.callback.Callback
                                public final /* synthetic */ void onSuccess(Object obj) {
                                    Object[] objArr3 = {(Void) obj};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0ffe1c2c7aba0c677a21bbfa73ecf74c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0ffe1c2c7aba0c677a21bbfa73ecf74c");
                                        return;
                                    }
                                    com.sankuai.waimai.foundation.utils.log.a.c(WMGroupChatModule.TAG, "group exitGroup#onSuccess,退出群聊删除本地会话成功", new Object[0]);
                                    com.sankuai.waimai.imbase.model.a aVar = new com.sankuai.waimai.imbase.model.a();
                                    aVar.a = str;
                                    com.meituan.android.bus.a.a().c(aVar);
                                }

                                @Override // com.sankuai.xm.base.callback.Callback
                                public final void onFailure(int i, String str2) {
                                    Object[] objArr3 = {Integer.valueOf(i), str2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "52a275a212c4765f8b2db7f004226d88", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "52a275a212c4765f8b2db7f004226d88");
                                    } else {
                                        com.sankuai.waimai.foundation.utils.log.a.c(WMGroupChatModule.TAG, "group exitGroup#onFailure,退出群聊删除本地会话失败", new Object[0]);
                                    }
                                }
                            });
                        }
                    } catch (Exception unused) {
                    }
                }
            }, "");
        }
    }
}
