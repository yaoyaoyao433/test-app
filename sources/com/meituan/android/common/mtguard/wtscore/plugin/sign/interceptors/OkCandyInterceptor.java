package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.t;
import com.squareup.okhttp.u;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import okio.c;
/* loaded from: classes2.dex */
public class OkCandyInterceptor implements t {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public OkCandyInterceptor() {
    }

    public OkCandyInterceptor(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b81350fb93cf33d9b994251d0bd117", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b81350fb93cf33d9b994251d0bd117");
        } else {
            this.mContext = context;
        }
    }

    @Override // com.squareup.okhttp.t
    public z intercept(t.a aVar) throws IOException {
        byte[] bArr;
        URI a;
        u contentType;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dfceadef76e2c45877455038f9f3941", 6917529027641081856L)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dfceadef76e2c45877455038f9f3941");
        }
        x a2 = aVar.a();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String a3 = a2.a("User-Agent");
        String str = "";
        y yVar = a2.d;
        if (yVar != null && (contentType = yVar.contentType()) != null) {
            str = contentType.toString();
        }
        if (TextUtils.isEmpty(str)) {
            str = a2.a("Content-Type");
        }
        String str2 = str;
        initOriginalHeaders(hashMap2, a2);
        if (a2.b.equalsIgnoreCase("post")) {
            c cVar = new c();
            a2.d.writeTo(cVar);
            byte[] r = cVar.r();
            a = a.a(this.mContext, a2.b(), r, a3, str2, hashMap, hashMap2);
            a2 = a2.f().a("POST", y.create(a2.d.contentType(), r)).a();
        } else if (a2.b.equalsIgnoreCase("get")) {
            a = a.a(this.mContext, a2.b(), a3, str2, hashMap, hashMap2);
        } else {
            y yVar2 = a2.d;
            if (yVar2 == null || yVar2.contentLength() <= 0) {
                bArr = null;
            } else {
                c cVar2 = new c();
                a2.d.writeTo(cVar2);
                bArr = cVar2.r();
            }
            a = a.a(this.mContext, a2.b(), bArr, a3, str2, hashMap, a2.b, hashMap2);
        }
        if (a == null) {
            return aVar.a(a2);
        }
        x.a a4 = a2.f().a(URI.create(a.toASCIIString()).toURL());
        for (Map.Entry entry : hashMap.entrySet()) {
            a4.b((String) entry.getKey());
            a4.b((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar.a(a4.a());
    }

    private void initOriginalHeaders(Map<String, String> map, x xVar) {
        Object[] objArr = {map, xVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9a776434aff2a2ece4a9af809032d52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9a776434aff2a2ece4a9af809032d52");
            return;
        }
        int length = xVar.c.a.length / 2;
        for (int i = 0; i < length; i++) {
            map.put(xVar.c.a(i), xVar.c.b(i));
        }
    }
}
