package com.sankuai.waimai.drug.order.confirm.rocks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.store.knb.manager.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"drug_order_confirm_logic_block_style_1"}, viewModel = C0938a.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.b<C0938a, com.sankuai.waimai.business.order.api.confirm.block.a> implements a.InterfaceC1215a {
    public static ChangeQuickRedirect f;
    private final b g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.order.confirm.rocks.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0938a extends com.meituan.android.cube.pga.viewmodel.a<String> {
    }

    public a(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6374052f977b28e1ef43bc66dd459ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6374052f977b28e1ef43bc66dd459ce");
            return;
        }
        this.g = new b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bf1040a79bbc962ffd8e68aff576ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bf1040a79bbc962ffd8e68aff576ebb");
        } else if (l() != null) {
            l().registerReceiver(this.g, new IntentFilter("med_dtp_upload_prescription_action"));
        }
        com.meituan.android.cube.pga.common.b<b.a> g = F().g();
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.drug.order.confirm.rocks.b.a;
        g.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "65e0cb5772c07848751488ea61d50460", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.action.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "65e0cb5772c07848751488ea61d50460") : new com.sankuai.waimai.drug.order.confirm.rocks.b(this));
    }

    public static /* synthetic */ void a(a aVar, b.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "457b76297c7e302839741ac470bc9e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "457b76297c7e302839741ac470bc9e97");
            return;
        }
        int i = aVar2.a;
        int i2 = aVar2.b;
        Intent intent = aVar2.c;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5c2c548b0b5a88be4a33eba53b2a2349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5c2c548b0b5a88be4a33eba53b2a2349");
        } else if (i == 1001 && i2 == -1 && intent != null) {
            aVar.b(f.a(intent, "resultData"));
        }
    }

    @Override // com.sankuai.waimai.store.knb.manager.a.InterfaceC1215a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5ae1abe001706c2d1c90f9f986fa16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5ae1abe001706c2d1c90f9f986fa16");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE);
                String optString2 = jSONObject.optString("common_key");
                String optString3 = jSONObject.optString(optString2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(optString2, optString3);
                HashMap hashMap = new HashMap();
                hashMap.put(optString, jSONObject2.toString());
                HashMap hashMap2 = new HashMap();
                hashMap2.put("model_input_map", hashMap);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("data", hashMap2);
                hashMap3.put("isUpdate", 1);
                F().p().a((com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>>) i.a(1, hashMap3));
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d53343fc743f19928e9ddddfb9ff495", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d53343fc743f19928e9ddddfb9ff495");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5724f96ba9b6ec8677534f99af5b60cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5724f96ba9b6ec8677534f99af5b60cf");
            } else if (!"med_dtp_upload_prescription_action".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            } else {
                a.this.b(extras.getString("data"));
            }
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88580ed5f8de60e058f79953ba36f37d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88580ed5f8de60e058f79953ba36f37d");
            return;
        }
        super.bE_();
        if (l() != null) {
            try {
                l().unregisterReceiver(this.g);
            } catch (Exception unused) {
            }
        }
    }
}
