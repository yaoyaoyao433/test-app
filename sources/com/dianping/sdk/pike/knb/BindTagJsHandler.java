package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.nvtunnelkit.utils.f;
import com.dianping.sdk.pike.c;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BindTagJsHandler extends BaseJsHandler {
    private static final String TAG = "BindTagJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "OOb/kaJc7YLwutZNn4L6iHh5BTJScIwefPoZaGgsJsFeXdeo3K2Xuw/guJqiiEJrWyzFIIArRTs4mNTynKewCg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "243342898a3a83c8832ab646ca0c6757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "243342898a3a83c8832ab646ca0c6757");
            return;
        }
        try {
            i.a(TAG, "knb bind tag exec");
            String optString = jsBean().argsJson.optString("bzId");
            String optString2 = jsBean().argsJson.optString("tag");
            final a a = a.a();
            Object[] objArr2 = {optString, optString2, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "eaca7bd995f143b93696d49fc2d92fb7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "eaca7bd995f143b93696d49fc2d92fb7");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    com.dianping.sdk.pike.a aVar = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.9
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "10a68960872a8b476449c0b5120a4fc3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "10a68960872a8b476449c0b5120a4fc3");
                            } else {
                                this.jsCallback();
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f21f7c771e6a161ff7fd50611feb455d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f21f7c771e6a161ff7fd50611feb455d");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    };
                    Object[] objArr3 = {optString2, aVar};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect4, false, "6d04462265e2e253bf44da14bccd13d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect4, false, "6d04462265e2e253bf44da14bccd13d0");
                        return;
                    } else if (dVar.a(aVar)) {
                        if (f.a(optString2)) {
                            dVar.a(aVar, -22, "bind tag is null.");
                            return;
                        } else {
                            dVar.b(optString2, true, aVar);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                jsCallbackErrorMsg("start client first");
            }
        } catch (Throwable th) {
            i.a(TAG, "knb bind tag ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
