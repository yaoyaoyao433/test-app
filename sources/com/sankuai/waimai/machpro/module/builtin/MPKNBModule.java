package com.sankuai.waimai.machpro.module.builtin;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.CommonJsHost;
import com.dianping.titans.js.JsCallback;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBInitCallback;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.waimai.mach.js.knb.KNBBridgeStrategy;
import com.sankuai.waimai.mach.manager_new.common.e;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.instance.b;
import com.sankuai.waimai.machpro.module.MPModule;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPKNBModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static WeakHashMap<Activity, List<BridgeManager>> sBridgeMaintains = new WeakHashMap<>();
    private static volatile boolean isInited = false;

    public MPKNBModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7711c2e0af26b96b7b15fd0bb9dafe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7711c2e0af26b96b7b15fd0bb9dafe5");
        } else {
            mPContext.getInstance().a(new b() { // from class: com.sankuai.waimai.machpro.module.builtin.MPKNBModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.instance.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2d275a433faefddb1382762438d4ca1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2d275a433faefddb1382762438d4ca1");
                        return;
                    }
                    super.a();
                    synchronized (KNBBridgeStrategy.class) {
                        Activity activity = null;
                        if (MPKNBModule.this.getMachContext() != null && (MPKNBModule.this.getMachContext().getContext() instanceof Activity)) {
                            activity = (Activity) MPKNBModule.this.getMachContext().getContext();
                        }
                        if (MPKNBModule.sBridgeMaintains.containsKey(activity)) {
                            for (BridgeManager bridgeManager : (List) MPKNBModule.sBridgeMaintains.get(activity)) {
                                if (bridgeManager != null) {
                                    bridgeManager.destory();
                                }
                            }
                            MPKNBModule.sBridgeMaintains.remove(activity);
                        }
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "invoke")
    public void invoke(String str, String str2, String str3, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, str2, str3, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18d4a8ed21307abdb9bde87a415cd7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18d4a8ed21307abdb9bde87a415cd7d0");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Activity activity = null;
            if (getMachContext() != null && (getMachContext().getContext() instanceof Activity)) {
                activity = (Activity) getMachContext().getContext();
            }
            Activity activity2 = activity;
            if (activity2 == null) {
                return;
            }
            e.a(new AnonymousClass2(activity2, mPJSCallBack, str3, str, str2), "mach_pro_knb");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.machpro.module.builtin.MPKNBModule$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass2 extends e.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ MPJSCallBack c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public AnonymousClass2(Activity activity, MPJSCallBack mPJSCallBack, String str, String str2, String str3) {
            this.b = activity;
            this.c = mPJSCallBack;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // com.sankuai.waimai.mach.manager_new.common.e.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bfbbaf2c780c53dcc4c0c2c44bd3fe7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bfbbaf2c780c53dcc4c0c2c44bd3fe7");
                return;
            }
            if (!MPKNBModule.isInited) {
                boolean unused = MPKNBModule.isInited = true;
                KNBInitCallback initCallback = KNBWebManager.getInitCallback();
                if (initCallback != null) {
                    initCallback.init(this.b);
                    KNBWebManager.setInitCallback(null);
                }
            }
            BridgeManager bridgeManager = new BridgeManager(new a(this.b), new JsCallback() { // from class: com.sankuai.waimai.machpro.module.builtin.MPKNBModule.2.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.titans.js.JsCallback
                public final void jsCallback(final JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4579d8fae021db6af0f2cf267e5cca0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4579d8fae021db6af0f2cf267e5cca0");
                    } else {
                        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.module.builtin.MPKNBModule.2.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88d5590b6a29f192c4fcc87edf0ee322", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88d5590b6a29f192c4fcc87edf0ee322");
                                } else if (AnonymousClass2.this.c != null) {
                                    MachMap machMap = new MachMap();
                                    machMap.put("callbackId", AnonymousClass2.this.d);
                                    machMap.put("result", jSONObject.toString());
                                    AnonymousClass2.this.c.invoke(machMap);
                                }
                            }
                        });
                    }
                }
            });
            bridgeManager.invoke(this.e, this.f, this.d, JsHandler.Source.MACH);
            if (MPKNBModule.this.getMachContext() == null || !(MPKNBModule.this.getMachContext().getContext() instanceof Activity)) {
                return;
            }
            MPKNBModule.addMaintain((Activity) MPKNBModule.this.getMachContext().getContext(), bridgeManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void addMaintain(Activity activity, BridgeManager bridgeManager) {
        synchronized (MPKNBModule.class) {
            Object[] objArr = {activity, bridgeManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "689b53d58c3a779cbbde3702455ff682", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "689b53d58c3a779cbbde3702455ff682");
                return;
            }
            if (!sBridgeMaintains.containsKey(activity)) {
                sBridgeMaintains.put(activity, new ArrayList());
            }
            sBridgeMaintains.get(activity).add(bridgeManager);
        }
    }

    public static synchronized void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        synchronized (MPKNBModule.class) {
            Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e58b07d4ab209cd1c3a934e98a2d6cf4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e58b07d4ab209cd1c3a934e98a2d6cf4");
            } else if (activity != null) {
                List<BridgeManager> list = sBridgeMaintains.get(activity);
                if (!com.sankuai.waimai.machpro.util.b.c((List) list)) {
                    for (BridgeManager bridgeManager : list) {
                        bridgeManager.onActivityResult(i, i2, intent);
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends CommonJsHost {
        public static ChangeQuickRedirect a;

        @Override // com.dianping.titans.js.CommonJsHost, com.dianping.titans.js.JsHost
        public final void getCapture(String str, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        }

        public a(@NonNull Activity activity) {
            super(activity);
            Object[] objArr = {MPKNBModule.this, activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f60c0dbfe9576fff7982cdb4bccc82f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f60c0dbfe9576fff7982cdb4bccc82f");
            }
        }

        @Override // com.dianping.titans.js.CommonJsHost, com.dianping.titans.js.JsHost
        public final JSONObject getResult() {
            JSONObject jSONObject;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1eab8f12fb1edee6cbda30985ecd800", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1eab8f12fb1edee6cbda30985ecd800");
            }
            JSONObject a2 = this.activity instanceof com.sankuai.waimai.machpro.i18n.a ? ((com.sankuai.waimai.machpro.i18n.a) this.activity).a() : null;
            if (a2 == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (Exception unused) {
                }
                try {
                    jSONObject.put(Constant.KEY_RESULT_CODE, 0);
                    return jSONObject;
                } catch (Exception unused2) {
                    a2 = jSONObject;
                    com.sankuai.waimai.machpro.util.a.a("MPKNBModule--getResult异常！");
                    return a2;
                }
            }
            return a2;
        }
    }
}
