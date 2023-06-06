package com.meituan.android.paycommon.lib.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.meituan.android.neohybrid.container.NeoBaseFragment;
import com.meituan.android.paybase.common.analyse.b;
import com.meituan.android.paybase.common.analyse.cat.a;
import com.meituan.android.paybase.downgrading.c;
import com.meituan.android.paybase.downgrading.d;
import com.meituan.android.paybase.wasmtest.Wasm3Simple;
import com.meituan.android.paycommon.lib.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HalfPageMarketingDialogFragment extends NeoBaseFragment {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4ac07a50f8b84bf17119c65685bb4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4ac07a50f8b84bf17119c65685bb4c");
            return;
        }
        super.y_();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - i.b()));
        hashMap.put("trans_id", !TextUtils.isEmpty(b.b) ? b.b : "-999");
        hashMap.put("tradeNo", !TextUtils.isEmpty(i.a()) ? i.a() : "-999");
        i.a("b_pay_around_marketing_halfpage_dialog_success_sc", (HashMap<String, Object>) hashMap);
        i.a("pay_around_marketing_halfpage_dialog_success", (Map<String, Object>) null);
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f27b843358df87fed7ed8609fbc31fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f27b843358df87fed7ed8609fbc31fd");
        } else if (context != null) {
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.meituan.android.pay.fragment.MTHalfPageHomeFragment.close.action"));
        }
        c cVar = d.a().b;
        if (cVar == null || !cVar.p) {
            return;
        }
        Wasm3Simple.a(getContext());
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2687bc3caa97d1273ef3959a3ba778de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2687bc3caa97d1273ef3959a3ba778de");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("error_message", str);
        hashMap.put("trans_id", !TextUtils.isEmpty(b.b) ? b.b : "-999");
        hashMap.put("tradeNo", !TextUtils.isEmpty(i.a()) ? i.a() : "-999");
        i.a("b_pay_around_marketing_halfpage_dialog_fail_sc", (HashMap<String, Object>) hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i));
        i.a("pay_around_marketing_halfpage_dialog_fail", (Map<String, Object>) hashMap2);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7077bb45ad4ea71f703a243050922d97", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7077bb45ad4ea71f703a243050922d97")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a(jSONObject.optInt(Constant.KEY_RESULT_CODE), jSONObject.optString("errorMessage"));
            } catch (JSONException unused) {
                a.a("HalfPageMarketingDialogFragment", "finishDowngrade");
                a(2, str);
            }
        }
        return super.a(str);
    }
}
