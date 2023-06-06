package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.event.autorunner.c;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ObserveAutoRunnerJsHandler extends AbstractAutoRunnerJsHandler {
    public static final String ACTION_PARAM_NAME = "action";
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_BUNDLE_ID = "bundle_id";
    public static final String PARAM_NAME_OBSERVER_KEY = "observerKey";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aadc34d4e393c25bfba8b454c966064", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aadc34d4e393c25bfba8b454c966064");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new b(jSONObject.optString("biz"), jSONObject.optString("bundle_id"), jSONObject.optString("observerKey"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a1e0912c4b853fe1aa51d05eb504812", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a1e0912c4b853fe1aa51d05eb504812")).booleanValue();
        }
        b bVar = (b) baseParamBean;
        if (bVar == null || TextUtils.isEmpty(bVar.mBiz) || TextUtils.isEmpty(bVar.c)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "031f73d6c09f6c8aec8bf7fc14bf1541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "031f73d6c09f6c8aec8bf7fc14bf1541");
            return;
        }
        b bVar = (b) baseParamBean;
        AlitaAutoRunManager b2 = c.a().b(bVar.mBiz);
        a aVar = new a(bVar, new WeakReference(this));
        b2.a(aVar);
        addObserver(bVar.mBiz, bVar.b, bVar.c, aVar);
        jsCallback();
        HashMap hashMap = new HashMap();
        hashMap.put("method", "observeAutoRunner");
        hashMap.put("params", bVar);
        com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends AlitaAutoRunManager.b {
        public static ChangeQuickRedirect b;
        private WeakReference<ObserveAutoRunnerJsHandler> c;
        private b d;

        public a(b bVar, WeakReference<ObserveAutoRunnerJsHandler> weakReference) {
            Object[] objArr = {bVar, weakReference};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc87acf0eb7752abcec9637af5ed0a35", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc87acf0eb7752abcec9637af5ed0a35");
                return;
            }
            this.d = bVar;
            this.c = weakReference;
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
        public final void b(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
            Object[] objArr = {str, str2, alitaJSValue};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf8682c68d5bfa89b10791fbc7bd685", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf8682c68d5bfa89b10791fbc7bd685");
            } else if (!TextUtils.isEmpty(str) && str.equals(this.d.b) && this.d.c != null && this == AbstractAutoRunnerJsHandler.getObserver(this.d.c) && alitaJSValue != null && (alitaJSValue.getValue() instanceof String)) {
                try {
                    JSONObject jSONObject = new JSONObject((String) alitaJSValue.getValue());
                    jSONObject.put("action", "alitaARJSBundleCallBack");
                    jSONObject.put("bundle_id", str);
                    jSONObject.put("observerKey", this.d.c);
                    JsHandlerFactory.publish(jSONObject);
                } catch (Exception e) {
                    a(-100003, e.getMessage());
                }
            } else {
                a(-100003, "错误的返回值格式");
            }
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
        public final void b(@NonNull String str, @Nullable Exception exc) {
            Object[] objArr = {str, exc};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dec8e23a1164a006946ceb3988a81d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dec8e23a1164a006946ceb3988a81d2");
                return;
            }
            a(-190000, exc != null ? exc.getMessage() : "其他未定义错误类型");
            StringBuilder sb = new StringBuilder(" alita-jsbridge ObserveAutoRunnerJsHandler execInner failt: ret:");
            sb.append(exc != null ? exc.getMessage() : "");
            com.sankuai.waimai.alita.core.utils.c.a("Alita-JSSDK", sb.toString());
        }

        private void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a521a0a3364d9261a078ea6f5ce4a20e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a521a0a3364d9261a078ea6f5ce4a20e");
            } else if (this.c != null) {
                ObserveAutoRunnerJsHandler observeAutoRunnerJsHandler = this.c.get();
                if (observeAutoRunnerJsHandler != null) {
                    observeAutoRunnerJsHandler.jsCallbackError(i, str);
                }
            } else {
                com.sankuai.waimai.alita.core.utils.c.a("Alita-JSSDK", "alita-jsbridge ObserveAutoRunnerJsHandler callBackError observer finalize");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractAlitaJsHandler.BaseParamBean {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;

        public b(String str, String str2, String str3) {
            super(str);
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ee2a375c8d6184477aed4e56cf3961", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ee2a375c8d6184477aed4e56cf3961");
                return;
            }
            this.b = str2;
            this.c = str3;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b55abbe7655c7dee16ee16d82d626f0", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b55abbe7655c7dee16ee16d82d626f0");
            }
            return "SubscribeARObserverParams{mBundleId='" + this.b + "', mObserverKey='" + this.c + "', mBiz='" + this.mBiz + "'}";
        }
    }
}
