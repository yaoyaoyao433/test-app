package com.meituan.android.mrn.services;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.module.MRNContainerControlModule;
import com.meituan.android.mrn.module.MRNMonitorModule;
import com.meituan.android.mrn.module.MRNViewModule;
import com.meituan.android.mrn.module.MRNWarmUpModule;
import com.meituan.android.mrn.module.jshandler.MRNInfoJsHandler;
import com.meituan.android.mrn.module.jshandler.RequestJSHandler;
import com.meituan.android.mrn.module.jshandler.StatisticsJsHandler;
import com.meituan.android.mrn.module.jshandler.pageRouter.OpenUrlWithResultCustomHandler;
import com.meituan.android.mrn.module.jshandler.pageRouter.PageCloseJsHandler;
import com.meituan.android.mrn.services.c;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.p;
import com.meituan.android.mrn.utils.r;
import com.meituan.android.mrn.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes2.dex */
public class KNBCompatJsHandler {
    private static final String CONTAINER_CONTROL = "MRN.setContainerLoading";
    private static final String MRN_ROOT_VIEW = "MRN.setView";
    private static final String PAGE_MONITOR = "MRN.startMonitorFps";
    private static final int SIZE = 0;
    private static final int START_LOADING = 0;
    private static final int STOP_LOADING = 1;
    private static final int VISIBLE = 1;
    private static final String WARM_UP_NAME = "MRN.warmUpByBundleNames";
    private static final String WARM_UP_TAG = "MRN.warmUpByTags";
    public static ChangeQuickRedirect changeQuickRedirect;
    private MRNContainerControlModule containerCtrlModule;
    private MRNMonitorModule monitorModule;
    private k mrnInstance;
    private MRNViewModule viewModule;
    private MRNWarmUpModule warmUpModule;

    public KNBCompatJsHandler(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4faf4424419d110e8a7dfe152f0ce662", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4faf4424419d110e8a7dfe152f0ce662");
            return;
        }
        this.viewModule = new MRNViewModule(reactApplicationContext);
        this.containerCtrlModule = new MRNContainerControlModule(reactApplicationContext);
        this.monitorModule = new MRNMonitorModule(reactApplicationContext);
        this.warmUpModule = new MRNWarmUpModule(reactApplicationContext);
    }

    @Deprecated
    public boolean processCompatJsHandler(String str, String str2) {
        JSONObject optJSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "099a358f9c36453848185d8fe16c4a5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "099a358f9c36453848185d8fe16c4a5d")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
        } catch (JSONException e) {
            p.a("[KNBCompatJsHandler@processCompatJsHandler]", e, String.format("method:%s params:%s", str, str2));
        }
        if (CONTAINER_CONTROL.equals(str)) {
            JSONObject optJSONObject2 = new JSONObject(str2).optJSONObject("params");
            if (optJSONObject2 == null) {
                return false;
            }
            int optInt = optJSONObject2.optInt("type", -1);
            if (optInt == 0) {
                this.containerCtrlModule.startLoading();
            } else if (optInt == 1) {
                this.containerCtrlModule.stopLoading();
            }
            return true;
        } else if (MRN_ROOT_VIEW.equals(str)) {
            JSONObject optJSONObject3 = new JSONObject(str2).optJSONObject("params");
            if (optJSONObject3 == null) {
                return false;
            }
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("data");
            int optInt2 = optJSONObject4.optInt("childId");
            int optInt3 = optJSONObject4.optInt("width");
            int optInt4 = optJSONObject4.optInt("height");
            int optInt5 = optJSONObject4.optInt("visibleState", -1);
            int optInt6 = optJSONObject3.optInt("type", -1);
            if (optInt6 == 0) {
                this.viewModule.setViewSize(optInt2, optInt3, optInt4);
            } else if (optInt6 == 1) {
                this.viewModule.setViewVisible(optInt2, optInt5);
            }
            return true;
        } else if (PAGE_MONITOR.equals(str)) {
            JSONObject optJSONObject5 = new JSONObject(str2).optJSONObject("params");
            if (optJSONObject5 == null) {
                return false;
            }
            this.monitorModule.startMonitorFps(optJSONObject5.optString("pageName"));
            return true;
        } else if (WARM_UP_TAG.equals(str)) {
            JSONObject optJSONObject6 = new JSONObject(str2).optJSONObject("params");
            if (optJSONObject6 == null) {
                return false;
            }
            this.warmUpModule.warmUpByTags(g.a(optJSONObject6.optJSONArray("tags")));
            return true;
        } else if (WARM_UP_NAME.equals(str)) {
            JSONObject optJSONObject7 = new JSONObject(str2).optJSONObject("params");
            if (optJSONObject7 == null) {
                return false;
            }
            this.warmUpModule.warmUpByBundleNames(g.a(optJSONObject7.optJSONArray("bundleNames")));
            return true;
        } else {
            if (PageCloseJsHandler.KEY.equals(str) && (optJSONObject = new JSONObject(str2).optJSONObject("params")) != null && !optJSONObject.has("id") && optJSONObject.has("rootTag")) {
                v.a(optJSONObject.optInt("rootTag"));
                return true;
            }
            return false;
        }
    }

    @Deprecated
    public String appendCompatParam(ReactApplicationContext reactApplicationContext, String str, String str2) {
        Object[] objArr = {reactApplicationContext, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "988bd50c8ee4c75ba0f37fd213274398", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "988bd50c8ee4c75ba0f37fd213274398");
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            k a = r.a(reactApplicationContext);
            String str3 = "";
            if (a != null && a.i != null) {
                str3 = a.i.c + a.i.f;
            }
            if (TextUtils.isEmpty(str3) && a != null && a.k != null) {
                str3 = a.k;
            }
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            jSONObject.put("__biz_id", str3);
            if (RequestJSHandler.KEY.equals(str)) {
                if (optJSONObject != null) {
                    optJSONObject.put("originalParams", g.c(optJSONObject));
                    if (a != null && a.i != null) {
                        String str4 = a.i.c;
                        String str5 = a.i.f;
                        optJSONObject.put("rn_bundle_name", str4);
                        optJSONObject.put("rn_bundle_version", str5);
                        optJSONObject.put("rn_bundle_component_name", a.l);
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                        optJSONObject.put("params", optJSONObject2);
                    }
                    optJSONObject2.put("rn_bundle_version", com.meituan.android.mrn.module.utils.b.a(a));
                }
                return jSONObject.toString();
            } else if (MRNInfoJsHandler.KEY.equals(str)) {
                jSONObject.put("mrnInfo", com.meituan.android.mrn.module.utils.b.a(reactApplicationContext));
                return jSONObject.toString();
            } else if (StatisticsJsHandler.KEY.equals(str)) {
                JSONObject optJSONObject3 = optJSONObject != null ? optJSONObject.optJSONObject("data") : null;
                JSONObject optJSONObject4 = optJSONObject3 != null ? optJSONObject3.optJSONObject("param") : null;
                if (optJSONObject4 == null) {
                    optJSONObject4 = new JSONObject();
                    optJSONObject3.put("param", optJSONObject4);
                }
                addMRNSign(reactApplicationContext, optJSONObject4);
                return jSONObject.toString();
            } else {
                return jSONObject.toString();
            }
        } catch (Throwable th) {
            p.a("[KNBCompatJsHandler@appendCompatParam]", th, String.format("method:%s params:%s", str, str2));
            return str2;
        }
    }

    @Deprecated
    public void preInvoke(ReactApplicationContext reactApplicationContext, String str, String str2, String str3, Callback callback) {
        Object[] objArr = {reactApplicationContext, str, str2, str3, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a363ecae953367ae8b3cb4ff4361b921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a363ecae953367ae8b3cb4ff4361b921");
        } else if (reactApplicationContext == null || TextUtils.isEmpty(str) || !OpenUrlWithResultCustomHandler.KEY.equals(str)) {
        } else {
            com.meituan.android.mrn.container.c.a(reactApplicationContext.getCurrentActivity(), new c.a(callback, str3));
        }
    }

    private void addMRNSign(ReactApplicationContext reactApplicationContext, JSONObject jSONObject) {
        Object[] objArr = {reactApplicationContext, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "370c2cf33d168e59c9aaf51243e4ff88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "370c2cf33d168e59c9aaf51243e4ff88");
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            Object opt = jSONObject.opt("custom");
            if (opt instanceof JSONObject) {
                jSONObject2 = (JSONObject) opt;
            } else if (opt == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("custom", jSONObject2);
            }
            if (jSONObject2 != null) {
                jSONObject2.put("from_mrn", "1");
                ensureMRNInstance(reactApplicationContext);
                if (this.mrnInstance == null || this.mrnInstance.i == null) {
                    return;
                }
                jSONObject2.put("mrn_bundle_name", this.mrnInstance.i.c);
                jSONObject2.put("mrn_bundle_version", this.mrnInstance.i.f);
            }
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("[KNBCompatJsHandler@addMRNSign]", th);
        }
    }

    private void ensureMRNInstance(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1bcad56713b37b251022c03e7e6210d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1bcad56713b37b251022c03e7e6210d");
        } else if (this.mrnInstance == null) {
            this.mrnInstance = r.a(reactApplicationContext);
        }
    }
}
