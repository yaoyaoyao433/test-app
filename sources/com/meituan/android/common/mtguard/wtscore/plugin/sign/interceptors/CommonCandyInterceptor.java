package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URI;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class CommonCandyInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public CommonCandyInterceptor() {
    }

    public CommonCandyInterceptor(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9fe61e5c022c8ac307c42bd6a66895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9fe61e5c022c8ac307c42bd6a66895");
        } else {
            this.mContext = context;
        }
    }

    public String getRequestSignature(String str, URI uri, String str2, String str3, String str4, byte[] bArr) {
        Object obj;
        Object[] objArr = {str, uri, str2, str3, str4, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0663490210a64ece6739562eb6598cd", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0663490210a64ece6739562eb6598cd");
        } else {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (str3 != null) {
                hashMap.put("Content-Encoding", str3);
            }
            if (str.equalsIgnoreCase("post")) {
                a.a(this.mContext, uri, bArr, str2, str4, hashMap2, hashMap);
            } else if (str.equalsIgnoreCase("get")) {
                a.a(this.mContext, uri, str2, str4, hashMap2, hashMap);
            } else {
                a.a(this.mContext, uri, bArr, str2, str4, hashMap2, str, hashMap);
            }
            if (!hashMap2.containsKey(MTGConfigs.c)) {
                return null;
            }
            obj = hashMap2.get(MTGConfigs.c);
        }
        return (String) obj;
    }
}
