package com.dianping.sdk.pike.knb;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AuthAggClientJsHandler extends BaseJsHandler {
    private static final String TAG = "AuthAggClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "QWQjOxLWiGS8p8LUiQL1j/Da99vebyojUcaoZbNYeE/RHQVdsPJ9NLfv8TBHVFj1gSN6EMXLIlrFJcOc/e1sjA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c13250f58cc68472f2fb761a08e3749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c13250f58cc68472f2fb761a08e3749");
            return;
        }
        try {
            i.a(TAG, "knb agg auth exec");
            String optString = jsBean().argsJson.optString("bzId");
            final a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "156e44864542e04f7163e8456e51adec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "156e44864542e04f7163e8456e51adec");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                com.dianping.sdk.pike.agg.a aVar = a.c.get(optString);
                if (aVar == null) {
                    jsCallbackErrorMsg("init agg client first");
                } else {
                    aVar.f = new com.dianping.sdk.pike.auth.b() { // from class: com.dianping.sdk.pike.knb.a.13
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.auth.b
                        public final void a(@Nullable Map<String, String> map) {
                            Object[] objArr3 = {map};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b2b3e0e58c115e5ca0bf935fbe041e27", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b2b3e0e58c115e5ca0bf935fbe041e27");
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("extra", b.a(map));
                            } catch (Exception e) {
                                i.a("KnbPikeAdapter", "parse extra error!", e);
                            }
                            this.jsCallback(jSONObject);
                        }

                        @Override // com.dianping.sdk.pike.auth.b
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "16ab602a6e65ca0257a9909621e2c907", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "16ab602a6e65ca0257a9909621e2c907");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    };
                }
            }
        } catch (Throwable th) {
            i.a(TAG, "knb agg auth client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
