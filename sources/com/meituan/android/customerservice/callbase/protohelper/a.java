package com.meituan.android.customerservice.callbase.protohelper;

import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.utils.CallHandleWorker;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.pike.PikeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements PikeClient.d {
    public static ChangeQuickRedirect a;
    c b;
    public PikeClient c;
    private CallHandleWorker d;

    public a(c cVar, PikeClient pikeClient) {
        Object[] objArr = {cVar, pikeClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f9e1075a96b15848dc1c3b668ca919", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f9e1075a96b15848dc1c3b668ca919");
            return;
        }
        this.b = null;
        this.d = CallHandleWorker.getInstance();
        this.b = cVar;
        this.c = pikeClient;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0102c1c7e94137fe4fe0f5b6aefca446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0102c1c7e94137fe4fe0f5b6aefca446");
        } else {
            this.c.a(this);
        }
    }

    @Override // com.meituan.android.pike.PikeClient.d
    public final void a(final com.meituan.android.pike.message.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11629ba9250b3e2f422fdfd6a5a7e8d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11629ba9250b3e2f422fdfd6a5a7e8d1");
        } else if (aVar == null || TextUtils.isEmpty(aVar.c)) {
            CallLog.error("CallProtoHandler", "Call receive the empty message");
        } else {
            this.d.post(new Runnable() { // from class: com.meituan.android.customerservice.callbase.protohelper.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b2f8b08a3610884a46e94dcabf64f0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b2f8b08a3610884a46e94dcabf64f0a");
                        return;
                    }
                    try {
                        String string = new JSONObject(aVar.c).getString("method");
                        if (a.this.b != null) {
                            a.this.b.a(string, aVar.c);
                        }
                    } catch (JSONException e) {
                        CallLog.error("CallProtoHandler", "Pike receive error " + e.getMessage());
                    }
                }
            });
        }
    }
}
