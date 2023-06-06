package com.unionpay;

import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class r implements ac {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.unionpay.ac
    public final void a(String str, ad adVar) {
        String b;
        String b2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                UPUtils.a(this.a, jSONObject.getString(next), next);
            }
            if (adVar != null) {
                b2 = UPPayWapActivity.b("0", "success", null);
                adVar.a(b2);
            }
        } catch (Exception e) {
            if (adVar != null) {
                b = UPPayWapActivity.b("1", e.getMessage(), null);
                adVar.a(b);
            }
        }
    }
}
