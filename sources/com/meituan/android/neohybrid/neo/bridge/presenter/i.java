package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.neo.nsf.NSFBean;
import com.meituan.android.neohybrid.neo.nsf.c;
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
    public static final String n = "i";
    private ConcurrentHashMap<String, String> o;

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String k() {
        return NSFConfig.NEO_NSF;
    }

    public i(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc191d829b0c57b2ee647e82f12f388b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc191d829b0c57b2ee647e82f12f388b");
            return;
        }
        this.o = new ConcurrentHashMap<>();
        a(aVar, str, str2, str3);
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671aeeeeca17f30ec73dc209157842ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671aeeeeca17f30ec73dc209157842ee");
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

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        return n;
    }

    private String b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424a465459c0763e9f8755ec7b851676", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424a465459c0763e9f8755ec7b851676");
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
            com.meituan.android.neohybrid.neo.nsf.a.b(this.g, key);
            com.meituan.android.neohybrid.neo.report.d.a(this.g, "b_pay_w1cprd71_sc", (Map<String, Object>) new com.meituan.android.neohybrid.neo.report.a().a(KnbConstants.PARAMS_SCENE, "refresh").a("data_source", "network").b);
            com.meituan.android.neohybrid.neo.nsf.a.a(this.g).a(key, this.g.f().nsfConfig().getNsfParams(), new c.b() { // from class: com.meituan.android.neohybrid.neo.bridge.presenter.i.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.neohybrid.neo.nsf.c.b
                public final boolean b(String str, JSONObject jSONObject) {
                    Object[] objArr2 = {str, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8baa71b74beb001ba006a5373e03a1f", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8baa71b74beb001ba006a5373e03a1f")).booleanValue();
                    }
                    com.meituan.android.neohybrid.neo.report.d.a(i.this.g, "b_pay_5b9me55y_sc", (Map<String, Object>) new com.meituan.android.neohybrid.neo.report.a().a(KnbConstants.PARAMS_SCENE, "refresh").a("data_source", "network").b);
                    return i.this.g.b(str, jSONObject);
                }

                @Override // com.meituan.android.neohybrid.neo.nsf.c.b
                public final boolean a(String str, int i, String str2) {
                    Object[] objArr2 = {str, 3000, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c43bb3256c5dd3eac58175144b2b4c86", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c43bb3256c5dd3eac58175144b2b4c86")).booleanValue();
                    }
                    com.meituan.android.neohybrid.neo.report.d.a(i.this.g, "b_pay_qardg8z8_sc", (Map<String, Object>) com.meituan.android.neohybrid.neo.report.a.c(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, 3000).a("error_message", str2).a(KnbConstants.PARAMS_SCENE, "refresh").a("data_source", "network").b);
                    return i.this.g.a(str, 3000, str2);
                }
            }, null, this.g.f().nsfConfig().isNsfSaved());
        }
        JSONObject a2 = com.meituan.android.neohybrid.neo.nsf.a.a(this.g, key);
        if (a2 != null && a2.length() > 0) {
            return new NeoBridgeBean(0, "", a2, a(false)).toString();
        }
        if (TextUtils.isEmpty(this.f)) {
            return a("NsfBridgeManager.exec: callbackId is null.");
        }
        if (this.o == null) {
            this.o = new ConcurrentHashMap<>();
        }
        this.o.put(this.f, key);
        if (!com.meituan.android.neohybrid.neo.nsf.a.a(e(), key, this)) {
            return a("NsfBridgeManager.exec: fetchResponse error.");
        }
        return i();
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.a
    public void onCallbackSucc(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872230eb79db205ce87d97668de9c9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872230eb79db205ce87d97668de9c9c1");
        } else if (!TextUtils.isEmpty(str) && jSONObject != null && !com.meituan.android.paybase.utils.i.a(this.o)) {
            for (Map.Entry<String, String> entry : this.o.entrySet()) {
                if (!TextUtils.isEmpty(entry.getValue()) && str.contains(entry.getValue())) {
                    a(entry.getKey(), jSONObject);
                    this.o.remove(entry.getKey());
                    return;
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsf.c.a
    public void onCallbackFail(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f145665cee219775202f676d4f1a0fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f145665cee219775202f676d4f1a0fc0");
            return;
        }
        a("NsfBridgeManager.onCallbackFail: errCode=" + i + " and errMsg=" + str);
    }
}
