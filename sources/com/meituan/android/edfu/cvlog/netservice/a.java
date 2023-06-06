package com.meituan.android.edfu.cvlog.netservice;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0220521064c18ee85f3147701a92a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0220521064c18ee85f3147701a92a7");
        }
        aj request = aVar.request();
        Object[] objArr2 = {16};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db38cd16f5ee5d908ea3085480aaa144", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db38cd16f5ee5d908ea3085480aaa144");
        } else {
            str = "";
            for (int i = 0; i < 16; i++) {
                str = str + String.valueOf((int) (Math.random() * 10.0d));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        return aVar.a(request.a().b("appId", "433ad9c91bbde9cd7df34d53616eb8e0").b("Authorization", a(str, sb2)).b(DeviceInfo.TM, sb2).b("nonce", str).a());
    }

    private String a(String str, String str2) throws UnsupportedEncodingException {
        byte[] digest;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8442614e9f0ce67cbf240a4e69924494", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8442614e9f0ce67cbf240a4e69924494");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", "433ad9c91bbde9cd7df34d53616eb8e0");
        hashMap.put(DeviceInfo.TM, str2);
        hashMap.put("nonce", str);
        String[] strArr = (String[]) hashMap.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArr) {
            sb.append(str3);
            sb.append((String) hashMap.get(str3));
        }
        sb.append("zx8T3goaYPD9q1LxV51JeQaZS/VbczRq5Mqdkdn7gS6oxiR8AtxYuwefP2gkeneu kjziK3QW/CJnLNWfVs4mhJMHKCB4GjhZ6Djw00yt/V7I6gZ5UHdWenkrs8UE8pfL 2Nbx13uIrvBtk2IBaEeB5iwNMlZwNphVcdSTXA4AOr0=");
        byte[] bytes = sb.toString().getBytes("UTF-8");
        Object[] objArr2 = {bytes};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9a477e743ddc7d52bb838b57db6e6bd7", RobustBitConfig.DEFAULT_VALUE)) {
            digest = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9a477e743ddc7d52bb838b57db6e6bd7");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            digest = (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7bb7c11b257645f409d62c955f5c6580", RobustBitConfig.DEFAULT_VALUE) ? (MessageDigest) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7bb7c11b257645f409d62c955f5c6580") : c.a("MD5")).digest(bytes);
        }
        return new String(d.a(digest));
    }
}
