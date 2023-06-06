package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.im.group.model.ExitUserGroupEvent;
import com.sankuai.waimai.store.util.al;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGGroupbModule extends ReactContextBaseJavaModule {
    public static final String TAG = "SGGroupbModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNGroup";
    }

    public SGGroupbModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "462150ecbd5c08e9be4b0f89c5ece6cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "462150ecbd5c08e9be4b0f89c5ece6cf");
        }
    }

    @ReactMethod
    public void switchDisturb(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4a978f512aa7028a823dc77a1c3cbd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4a978f512aa7028a823dc77a1c3cbd7");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGGroupbModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b04e4b80a412aa8778ebb411cc2cb0b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b04e4b80a412aa8778ebb411cc2cb0b4");
                        return;
                    }
                    try {
                        new StringBuilder("switchDisturb: 更新免打扰状态").append(str2);
                        com.sankuai.waimai.store.im.group.manager.a.a().a(str, "1".equals(str2));
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void switchAtMeRemindStatus(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4d4c895db580650a3cf235570050cf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4d4c895db580650a3cf235570050cf0");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGGroupbModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cfc1f89d077e516ce0643273fd5f06e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cfc1f89d077e516ce0643273fd5f06e5");
                        return;
                    }
                    try {
                        new StringBuilder("switchAtMeDisturb: 更新AtMe免打扰状态").append(str2);
                        com.sankuai.waimai.store.im.group.manager.a.a().a(str, Integer.parseInt(str2));
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void exitGroup(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "559f5b9b25f2e6ab4ad14af9ef3607b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "559f5b9b25f2e6ab4ad14af9ef3607b2");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGGroupbModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e26d1922b19c1a61891e2654373b2549", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e26d1922b19c1a61891e2654373b2549");
                        return;
                    }
                    try {
                        SessionId a2 = SessionId.a(r.a(str, 0L), 0L, 2, (short) 0, (short) 1029);
                        if (a2 != null) {
                            IMClient.a().a(a2, false, new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.waimai.store.mrn.SGGroupbModule.3.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.base.callback.Callback
                                public final /* synthetic */ void onSuccess(Object obj) {
                                    Object[] objArr3 = {(Void) obj};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c6b16a3b9d8196dbfba54fe4cf987a56", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c6b16a3b9d8196dbfba54fe4cf987a56");
                                        return;
                                    }
                                    com.sankuai.shangou.stone.util.log.a.b(SGGroupbModule.TAG, "group exitGroup#onSuccess,退出群聊删除本地会话成功", new Object[0]);
                                    ExitUserGroupEvent exitUserGroupEvent = new ExitUserGroupEvent();
                                    exitUserGroupEvent.groupId = str;
                                    com.meituan.android.bus.a.a().c(exitUserGroupEvent);
                                }

                                @Override // com.sankuai.xm.base.callback.Callback
                                public final void onFailure(int i, String str2) {
                                    Object[] objArr3 = {Integer.valueOf(i), str2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4a39272e3592076cf3a2873718b9843e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4a39272e3592076cf3a2873718b9843e");
                                    } else {
                                        com.sankuai.shangou.stone.util.log.a.b(SGGroupbModule.TAG, "group exitGroup#onFailure,退出群聊删除本地会话失败", new Object[0]);
                                    }
                                }
                            });
                        }
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }
}
