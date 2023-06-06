package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.v2.neo.nsf.NSFBean;
import com.meituan.android.neohybrid.v2.neo.nsf.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class i extends b implements c.a {
    public static ChangeQuickRedirect a = null;
    public static final String o = "i";
    private ConcurrentHashMap<String, String> p;

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return NSFConfig.NEO_NSF;
    }

    public i(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7126ea0400d7e00d48b78ee182f4bee4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7126ea0400d7e00d48b78ee182f4bee4");
            return;
        }
        this.p = new ConcurrentHashMap<>();
        a(aVar, str, str2, str3);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1035a9f11fea1600a8f884495ecd5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1035a9f11fea1600a8f884495ecd5b");
        }
        if (TextUtils.isEmpty(this.c)) {
            return a("NsfBridgeManager.exec: action is null.");
        }
        if (this.c.equals("hybrid_fetch")) {
            return b(false);
        }
        if (this.c.equals("hybrid_refresh")) {
            return b(true);
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }

    private String b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53529805363e45d26eca6df3df64dd02", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53529805363e45d26eca6df3df64dd02");
        }
        if (this.d == null || e() == null) {
            return a("NsfBridgeManager.exec: mJsData or getNeoCompat is null.");
        }
        NeoBridgeBean neoBridgeBean = (NeoBridgeBean) com.meituan.android.neohybrid.util.gson.b.a().fromJson(this.d, (Class<Object>) NeoBridgeBean.class);
        if (neoBridgeBean == null || neoBridgeBean.data == null) {
            return a("NsfBridgeManager.exec: neoBridgeBean is null.");
        }
        NSFBean nSFBean = (NSFBean) com.meituan.android.neohybrid.util.gson.b.a().fromJson(neoBridgeBean.data.toString(), (Class<Object>) NSFBean.class);
        if (nSFBean == null) {
            return a("NsfBridgeManager.exec: nsfBean is null.");
        }
        String key = nSFBean.getKey();
        if (z) {
            com.meituan.android.neohybrid.v2.neo.nsf.a.b(this.h, key);
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.h, "b_pay_w1cprd71_sc", (Map<String, Object>) new com.meituan.android.neohybrid.neo.report.a().a(KnbConstants.PARAMS_SCENE, "refresh").a("data_source", "network").b);
            com.meituan.android.neohybrid.v2.neo.nsf.a.a(this.h).a(key, this.h.f().nsfConfig().getNsfParams(), new c.b() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.i.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.b
                public final boolean a(String str, JSONObject jSONObject) {
                    Object[] objArr2 = {str, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13c84be7b1305a4bd3dda9e8d2db552d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13c84be7b1305a4bd3dda9e8d2db552d")).booleanValue();
                    }
                    com.meituan.android.neohybrid.v2.neo.report.a.a(i.this.h, "b_pay_5b9me55y_sc", (Map<String, Object>) new com.meituan.android.neohybrid.neo.report.a().a(KnbConstants.PARAMS_SCENE, "refresh").a("data_source", "network").b);
                    return i.this.h.b(str, jSONObject);
                }

                @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.b
                public final boolean a(String str, int i, String str2) {
                    Object[] objArr2 = {str, 3000, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a7f1c8f9bb10adda08c32cebf9a13d9", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a7f1c8f9bb10adda08c32cebf9a13d9")).booleanValue();
                    }
                    com.meituan.android.neohybrid.v2.neo.report.a.a(i.this.h, "b_pay_qardg8z8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, 3000).a("error_message", str2).a(KnbConstants.PARAMS_SCENE, "refresh").a("data_source", "network").b);
                    return i.this.h.a(str, 3000, str2);
                }
            }, null, this.h.f().nsfConfig().isNsfSaved());
        }
        JSONObject a2 = com.meituan.android.neohybrid.v2.neo.nsf.a.a(this.h, key);
        if (a2 != null && a2.length() > 0) {
            return new NeoBridgeBean(0, "", a2, a(false)).toString();
        }
        if (TextUtils.isEmpty(this.f)) {
            return a("NsfBridgeManager.exec: callbackId is null.");
        }
        if (this.p == null) {
            this.p = new ConcurrentHashMap<>();
        }
        this.p.put(this.f, key);
        if (!com.meituan.android.neohybrid.v2.neo.nsf.a.a(e(), key, this)) {
            return a("NsfBridgeManager.exec: fetchResponse error.");
        }
        return i();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.a
    public final void b(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8702632e62daa8e1297dcd9a2e0f3e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8702632e62daa8e1297dcd9a2e0f3e0f");
        } else if (!TextUtils.isEmpty(str) && jSONObject != null && !com.meituan.android.paybase.utils.i.a(this.p)) {
            for (Map.Entry<String, String> entry : this.p.entrySet()) {
                if (!TextUtils.isEmpty(entry.getValue()) && str.contains(entry.getValue())) {
                    a(entry.getKey(), jSONObject);
                    this.p.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.nsf.c.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994325dc21fc0965b87042a17ff87370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994325dc21fc0965b87042a17ff87370");
            return;
        }
        a("NsfBridgeManager.onCallbackFail: errCode=" + i + " and errMsg=" + str);
    }
}
