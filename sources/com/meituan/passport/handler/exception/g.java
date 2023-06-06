package com.meituan.passport.handler.exception;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends com.meituan.passport.handler.exception.a {
    public static ChangeQuickRedirect c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);
    }

    public g(FragmentActivity fragmentActivity, a aVar) {
        super(fragmentActivity, (com.meituan.passport.converter.b) null);
        Object[] objArr = {fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b5373cd982d65373f652587aab3f32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b5373cd982d65373f652587aab3f32");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.meituan.passport.handler.exception.a
    public final ApiException a(ApiException apiException) {
        String b;
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da599d2ea473e1819f982a758a5c7352", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da599d2ea473e1819f982a758a5c7352");
        }
        if (apiException == null || b() == null || TextUtils.isEmpty(apiException.data)) {
            return apiException;
        }
        if (apiException.code == 101190) {
            b = c(apiException.data);
        } else if (apiException.code != 121048 && apiException.code != 121060) {
            return apiException;
        } else {
            b = b(apiException.data);
        }
        if (this.d != null) {
            this.d.a(b);
        }
        return null;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f964d79303e1410be86e2e1504dac6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f964d79303e1410be86e2e1504dac6");
        }
        Map<String, String> d = d(str);
        if (d.size() > 0 && d.containsKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
            return d.get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
        }
        if (str.contains(OtherVerifyTypeConstants.REQUEST_CODE)) {
            try {
                return new JsonParser().parse(str).getAsJsonObject().get(OtherVerifyTypeConstants.REQUEST_CODE).getAsString();
            } catch (Exception e) {
                m.a(e);
                return null;
            }
        }
        return null;
    }

    private String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8bc4724198ef46ff93b2adb506406f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8bc4724198ef46ff93b2adb506406f3");
        }
        try {
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            if (asJsonObject == null || !asJsonObject.has(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                return null;
            }
            return asJsonObject.get(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY).getAsString();
        } catch (Exception e) {
            m.a(e);
            return null;
        }
    }

    private Map<String, String> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488c884815e37fd917509c283332990a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488c884815e37fd917509c283332990a");
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            try {
                String[] split = str.split("\\?", 2);
                if (split.length >= 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split[1]);
                    if (sb.toString().contains("&")) {
                        String[] split2 = sb.toString().split("&");
                        for (String str2 : split2) {
                            String[] split3 = str2.toString().split("=");
                            if (split3.length <= 1) {
                                hashMap.put(URLDecoder.decode(split3[0], "UTF-8"), "");
                            } else {
                                hashMap.put(URLDecoder.decode(split3[0], "UTF-8"), URLDecoder.decode(split3[1], "UTF-8"));
                            }
                        }
                    } else {
                        String[] split4 = sb.toString().split("=");
                        if (split4.length <= 1) {
                            hashMap.put(URLDecoder.decode(split4[0], "UTF-8"), "");
                        } else {
                            hashMap.put(URLDecoder.decode(split4[0], "UTF-8"), URLDecoder.decode(split4[1], "UTF-8"));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
