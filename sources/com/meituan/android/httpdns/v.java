package com.meituan.android.httpdns;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static DnsRecord a(String str, String str2) {
        DnsRecord dnsRecord;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c923f49840e4787b64e96fd48f2f7f9", 6917529027641081856L)) {
            return (DnsRecord) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c923f49840e4787b64e96fd48f2f7f9");
        }
        try {
            if (x.a(str) || x.a(str2) || (dnsRecord = (DnsRecord) new Gson().fromJson(str, (Class<Object>) DnsRecord.class)) == null || !"success".equals(dnsRecord.getState()) || !str2.equals(dnsRecord.getDomain())) {
                return null;
            }
            dnsRecord.setExpireTime(System.currentTimeMillis() + (dnsRecord.getTtl() * 1000));
            return dnsRecord;
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }
}
