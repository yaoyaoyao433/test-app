package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.aidata.cep.js.CepCallJsManager;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class u implements ICashier {
    public static ChangeQuickRedirect o;
    private long a;
    private String b;
    private String c;
    private String d;
    private Object e;
    private int f;
    public String p;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Map<String, String> map);
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public PayBaseActivity.a a(int i) {
        return null;
    }

    public abstract void a(String str, Map<String, Object> map);

    @Override // com.meituan.android.cashier.common.h
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ccf465750dd5cdb2be881fe49dc64af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ccf465750dd5cdb2be881fe49dc64af");
        }
    }

    public void b(boolean z) {
    }

    @Override // com.meituan.android.cashier.common.h
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9979ea862ac199a18c9d8427baea8791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9979ea862ac199a18c9d8427baea8791");
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public boolean h() {
        return false;
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public abstract String i();

    public void j() {
    }

    public void onRequestException(int i, Exception exc) {
    }

    public void onRequestFinal(int i) {
    }

    public void onRequestStart(int i) {
    }

    public void onRequestSucc(int i, Object obj) {
    }

    private String a(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71181370e60ce0f77b540a2de0e6edfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71181370e60ce0f77b540a2de0e6edfe");
        }
        if (com.meituan.android.paybase.utils.i.a(map)) {
            return "";
        }
        Object obj = map.get(str);
        return obj instanceof String ? (String) obj : "";
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final void b(String str, Map<String, Object> map) {
        Object[] objArr = {null, map};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba90d101ab1ce6d90a50d14cd4cebc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba90d101ab1ce6d90a50d14cd4cebc7");
            return;
        }
        this.f = 0;
        this.a = System.currentTimeMillis();
        this.e = map.get("cashier_router_start_time");
        HashMap hashMap = new HashMap();
        hashMap.put("cashier_type", i());
        hashMap.put(KnbConstants.PARAMS_SCENE, "start");
        this.b = a(map, "flow_source");
        this.c = a(map, "from_cashier");
        this.d = a(map, "from_product_type");
        this.p = a(map, CepCallJsManager.JS_PARAM_CEP_UNIQUE_ID);
        a(hashMap);
        q.b("b_pay_8ou0rbhz_mv", hashMap, this.p);
        q.a("pay_sla_start_recorded_by_cashier_router", hashMap, (List<Float>) null, this.p);
        a((String) null, map);
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4ba73fdc3eba9b015da6e8d4f55264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4ba73fdc3eba9b015da6e8d4f55264");
        } else if (map == null) {
        } else {
            if (!TextUtils.isEmpty(this.b)) {
                map.put("flow_source", this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                map.put("from_cashier", this.c);
            }
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            map.put("from_product_type", this.d);
        }
    }

    public final void a(boolean z, Map<String, Object> map) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6674f0f266e7e5c0803934a2a6e9f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6674f0f266e7e5c0803934a2a6e9f9c");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("cashier_type", i());
        map.put("duration", Long.valueOf(System.currentTimeMillis() - this.a));
        Object obj = map.get("hybrid_cashier_tti");
        long longValue = obj == null ? 0L : ((Long) obj).longValue();
        if (longValue > 0 && (this.e instanceof Long) && ((Long) this.e).longValue() > 0) {
            map.put("hybrid_cashier_duration", Long.valueOf(longValue - this.a));
            map.put("hybrid_cashier_duration_route", Long.valueOf(longValue - ((Long) this.e).longValue()));
        }
        if ((TextUtils.isEmpty(this.c) || TextUtils.equals("empty", this.c)) && this.e != null && (this.e instanceof Long)) {
            map.put("duration_from_router", Long.valueOf(System.currentTimeMillis() - ((Long) this.e).longValue()));
        }
        map.put(KnbConstants.PARAMS_SCENE, z ? "success" : "fail");
        int i = this.f + 1;
        this.f = i;
        map.put("sla_end_count", Integer.valueOf(i));
        a(map);
        q.b("b_pay_8ou0rbhz_mv", map, this.p);
        if (z) {
            q.a("pay_sla_success_recorded_by_cashier_router", map, (List<Float>) null, this.p);
        } else {
            q.a("pay_sla_failed_recorded_by_cashier_router", map, (List<Float>) null, this.p);
        }
        if (z) {
            j();
        }
    }

    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc5d5ab6ee1c5eb66eeec963cae0a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc5d5ab6ee1c5eb66eeec963cae0a75");
        } else if (aVar != null) {
            aVar.a(null);
        }
    }
}
