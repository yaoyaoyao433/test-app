package com.sankuai.waimai.drug.order.confirm.mrn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.business.order.api.pay.a {
    public static ChangeQuickRedirect a;
    private BroadcastReceiver b;

    @Override // com.sankuai.waimai.business.order.api.pay.a
    public final void a(final a.InterfaceC0754a interfaceC0754a) {
        Object[] objArr = {interfaceC0754a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2549f739cc6f4073be9934b827ef2e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2549f739cc6f4073be9934b827ef2e10");
        } else if (interfaceC0754a.aT_() == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("med_submit_order");
            if (this.b == null) {
                this.b = new BroadcastReceiver() { // from class: com.sankuai.waimai.drug.order.confirm.mrn.MedicarePayWayHelper$1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        Object[] objArr2 = {context, intent};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1859072cfdc1dddc2737e43156a0f460", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1859072cfdc1dddc2737e43156a0f460");
                            return;
                        }
                        String action = intent.getAction();
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            return;
                        }
                        String string = extras.getString("data");
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        try {
                            if (TextUtils.equals(action, "med_submit_order")) {
                                interfaceC0754a.a(new JSONObject(string));
                            }
                        } catch (JSONException e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                };
                interfaceC0754a.aT_().registerReceiver(this.b, intentFilter);
            }
        }
    }

    @Override // com.sankuai.waimai.business.order.api.pay.a
    public final void b(a.InterfaceC0754a interfaceC0754a) {
        Object[] objArr = {interfaceC0754a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba508275db5c933d783666512f84b032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba508275db5c933d783666512f84b032");
        } else if (interfaceC0754a.aT_() == null || this.b == null) {
        } else {
            interfaceC0754a.aT_().unregisterReceiver(this.b);
        }
    }
}
