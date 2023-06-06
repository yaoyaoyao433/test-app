package com.dianping.sdk.pike.knb;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AuthClientJsHandler extends BaseJsHandler {
    private static final String TAG = "AuthClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "rGm92qWQSpXEqR3O/LhmAsFVWBq2MT4yqAWheIhbSUlolMOXDYgz963L63o/HVjTiINfVjLJucUO7g0fRr69RQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ddd9701b96f6a25ae6a90f6b6a19ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ddd9701b96f6a25ae6a90f6b6a19ee");
            return;
        }
        try {
            i.a(TAG, "knb auth exec");
            String optString = jsBean().argsJson.optString("bzId");
            final a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "5fe95754de7571ce103792425b905864", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "5fe95754de7571ce103792425b905864");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar == null) {
                    jsCallbackErrorMsg("init client first");
                } else {
                    dVar.f = new com.dianping.sdk.pike.auth.b() { // from class: com.dianping.sdk.pike.knb.a.6
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.auth.b
                        public final void a(@Nullable Map<String, String> map) {
                            Object[] objArr3 = {map};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fe9649db14b18b8440ba2f7d077e7acc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fe9649db14b18b8440ba2f7d077e7acc");
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
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1794b2643cbf05c90808bdf969903f40", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1794b2643cbf05c90808bdf969903f40");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    };
                }
            }
        } catch (Throwable th) {
            i.a(TAG, "knb auth client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
