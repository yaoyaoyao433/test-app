package com.sankuai.waimai.store.mach;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGMachBridgeReportMetric;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"report"};
    private final int c;
    private final int d;
    private final Context e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        @SerializedName("key")
        public final String a;
        @SerializedName("isSucceed")
        public final boolean b;
        @SerializedName(SnifferDBHelper.COLUMN_LOG)
        public final String c;
        @SerializedName("tags")
        public final Map<String, String> d;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmsmRaptorReport";
    }

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59468d2b0f4b6a527033ed7814d45f87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59468d2b0f4b6a527033ed7814d45f87");
            return;
        }
        this.c = 0;
        this.d = 1;
        this.e = context;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        return b;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2e421ce5b44a8b008d31816165a9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2e421ce5b44a8b008d31816165a9ee");
        } else if (t.a(str)) {
            a(str3, aVar, 1);
        } else {
            char c = 65535;
            if (str.hashCode() == -934521548 && str.equals("report")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            Object[] objArr2 = {str2, str3, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4babf58c0227c2c23a1f13259415d4e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4babf58c0227c2c23a1f13259415d4e7");
            } else if (t.a(str2)) {
                a(str3, aVar, 1);
            } else if (!j.h().a(SCConfigPath.SM_MACH_RAPTOR_REPORT, false)) {
                a(str3, aVar, 1);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String optString = jSONObject.optString("key");
                    boolean optBoolean = jSONObject.optBoolean("isSucceed");
                    String optString2 = jSONObject.optString(SnifferDBHelper.COLUMN_LOG);
                    Object[] objArr3 = {Byte.valueOf(optBoolean ? (byte) 1 : (byte) 0), str2, optString, optString2, str3, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a422abd40271c7e2728113082ef7736", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a422abd40271c7e2728113082ef7736");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.foundation.core.common.a.a().e());
                    hashMap.put(SnifferDBHelper.COLUMN_LOG, optString2);
                    String a2 = i.a(hashMap);
                    a aVar2 = (a) i.a(str2, new TypeToken<a>() { // from class: com.sankuai.waimai.store.mach.f.1
                    }.getType());
                    if (aVar2 != null && aVar2.d != null) {
                        hashMap.putAll(aVar2.d);
                    }
                    if (TextUtils.isEmpty(optString)) {
                        a(str3, aVar, 1);
                        return;
                    }
                    com.sankuai.waimai.store.util.monitor.b.a().a(new SGMachBridgeReportMetric(optString)).a(a2).a(hashMap).a(optBoolean).a();
                    a(str3, aVar, 0);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void a(String str, com.sankuai.waimai.mach.jsv8.a aVar, int i) {
        Object[] objArr = {str, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c973eb76e523dc582e7fe2d60fa1ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c973eb76e523dc582e7fe2d60fa1ea1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(i));
        aVar.a(str, i.a(hashMap));
    }
}
