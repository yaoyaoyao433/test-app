package com.meituan.mmp.lib.api.device;

import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ClipboardModule extends ServiceApi {
    @SupportApiNames
    public static final String[] API_NAMES = {"setClipboardData", "getClipboardData"};
    public static ChangeQuickRedirect a = null;
    private static String h = "mmp_clipboardModule";

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdde2288ab4dd662a66681a3770a91f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdde2288ab4dd662a66681a3770a91f");
            return;
        }
        com.meituan.android.clipboard.a.a(getContext());
        if ("setClipboardData".equals(str)) {
            String token = getToken(jSONObject);
            String optString = jSONObject.optString("data");
            Object[] objArr2 = {token, optString, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81dad5b334a1d2a7eb2b7b65f5e39bc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81dad5b334a1d2a7eb2b7b65f5e39bc8");
                return;
            }
            if (optString == null) {
                optString = "";
            }
            try {
                com.meituan.android.clipboard.a.a(token, "content_copied_to_clipboard", optString, h, new com.meituan.android.clipboard.b() { // from class: com.meituan.mmp.lib.api.device.ClipboardModule.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.clipboard.b
                    public final void onSuccess() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "678f9638bb32f49e79b39b4674b70c61", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "678f9638bb32f49e79b39b4674b70c61");
                        } else {
                            iApiCallback.onSuccess(null);
                        }
                    }

                    @Override // com.meituan.android.clipboard.b
                    public final void onFail(int i, Exception exc) {
                        Object[] objArr3 = {Integer.valueOf(i), exc};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75f2c1e12cf015dcc8b0ee674dcac3e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75f2c1e12cf015dcc8b0ee674dcac3e1");
                        } else {
                            iApiCallback.onFail(AbsApi.codeJson(-1, exc != null ? exc.toString() : ""));
                        }
                    }
                });
            } catch (Exception e) {
                iApiCallback.onFail(codeJson(-1, e.toString()));
            }
        } else if ("getClipboardData".equals(str)) {
            String token2 = getToken(jSONObject);
            Object[] objArr3 = {token2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ddb661f49a101a1f1f5d3fbe35f2c80c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ddb661f49a101a1f1f5d3fbe35f2c80c");
                return;
            }
            CharSequence a2 = com.meituan.android.clipboard.a.a(token2, h, new com.meituan.android.clipboard.b() { // from class: com.meituan.mmp.lib.api.device.ClipboardModule.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.clipboard.b
                public final void onSuccess() {
                }

                @Override // com.meituan.android.clipboard.b
                public final void onFail(int i, Exception exc) {
                    Object[] objArr4 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "945b6f112be2cadcccd7c515337fcb8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "945b6f112be2cadcccd7c515337fcb8d");
                    } else {
                        iApiCallback.onFail(AbsApi.codeJson(-1, exc != null ? exc.toString() : ""));
                    }
                }
            });
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("data", a2);
                iApiCallback.onSuccess(jSONObject2);
            } catch (JSONException e2) {
                String str2 = h;
                com.meituan.mmp.lib.trace.b.d(str2, "getClipboardData assemble result exception!" + e2);
                iApiCallback.onFail(codeJson(-1, e2.toString()));
            }
        }
    }
}
