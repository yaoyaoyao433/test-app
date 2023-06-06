package com.meituan.msc.modules.apploader;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "LaunchInfo")
/* loaded from: classes3.dex */
public final class c extends k {
    public static ChangeQuickRedirect a;
    public static boolean b;
    private static final String c = "Android " + Build.VERSION.RELEASE;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[Catch: JSONException -> 0x010d, TryCatch #0 {JSONException -> 0x010d, blocks: (B:7:0x0020, B:9:0x002a, B:11:0x0030, B:19:0x003f, B:21:0x0059, B:27:0x007a, B:29:0x008d, B:31:0x00a6, B:33:0x00b9, B:36:0x00f0, B:34:0x00c4, B:30:0x0098, B:35:0x00d3, B:22:0x0060, B:25:0x006c), top: B:41:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: JSONException -> 0x010d, TryCatch #0 {JSONException -> 0x010d, blocks: (B:7:0x0020, B:9:0x002a, B:11:0x0030, B:19:0x003f, B:21:0x0059, B:27:0x007a, B:29:0x008d, B:31:0x00a6, B:33:0x00b9, B:36:0x00f0, B:34:0x00c4, B:30:0x0098, B:35:0x00d3, B:22:0x0060, B:25:0x006c), top: B:41:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: JSONException -> 0x010d, TryCatch #0 {JSONException -> 0x010d, blocks: (B:7:0x0020, B:9:0x002a, B:11:0x0030, B:19:0x003f, B:21:0x0059, B:27:0x007a, B:29:0x008d, B:31:0x00a6, B:33:0x00b9, B:36:0x00f0, B:34:0x00c4, B:30:0x0098, B:35:0x00d3, B:22:0x0060, B:25:0x006c), top: B:41:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3 A[Catch: JSONException -> 0x010d, TryCatch #0 {JSONException -> 0x010d, blocks: (B:7:0x0020, B:9:0x002a, B:11:0x0030, B:19:0x003f, B:21:0x0059, B:27:0x007a, B:29:0x008d, B:31:0x00a6, B:33:0x00b9, B:36:0x00f0, B:34:0x00c4, B:30:0x0098, B:35:0x00d3, B:22:0x0060, B:25:0x006c), top: B:41:0x0020 }] */
    @com.meituan.msc.modules.manager.MSCMethod(isSync = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object baseInfo() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.apploader.c.baseInfo():java.lang.Object");
    }

    @MSCMethod(isSync = true)
    public final Object hornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c78b0d1217f00eeaf6573de4b0070e87", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c78b0d1217f00eeaf6573de4b0070e87");
        }
        if (!b) {
            return new JSONObject();
        }
        try {
            return new JSONObject(Horn.accessCache("msc_fe_framework"));
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    @MSCMethod(isSync = true)
    public final Object getMSCAppState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7990bdc5c4964db686f0121c7ba119", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7990bdc5c4964db686f0121c7ba119");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.meituan.msc.modules.engine.e eVar = this.q;
            jSONObject.put("state", (eVar == null || !eVar.a()) ? "background" : "foreground");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbdfa51d7ace71e4890fd698c650e886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbdfa51d7ace71e4890fd698c650e886");
            return;
        }
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("system", c);
        jSONObject.put("platform", "android");
        jSONObject.put("SDKVersion", "2.2.3");
        jSONObject.put("mscSDKVersion", "1.0.1.18.23.2");
        if (!TextUtils.isEmpty(MSCEnvHelper.getEnvInfo().getAppCode())) {
            jSONObject.put("app", MSCEnvHelper.getEnvInfo().getAppCode());
        }
        jSONObject.put("V8", 1);
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53c68d0c093bd226153754df1c4c7c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53c68d0c093bd226153754df1c4c7c36");
            return;
        }
        Horn.register("msc_fe_framework", new HornCallback() { // from class: com.meituan.msc.modules.apploader.c.1
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
            }
        });
        b = true;
    }
}
