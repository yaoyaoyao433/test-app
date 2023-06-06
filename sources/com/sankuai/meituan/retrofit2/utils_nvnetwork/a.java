package com.sankuai.meituan.retrofit2.utils_nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Request a(aj ajVar) throws IOException {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a94b035a903fe07d0359cbfc6d3b893", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a94b035a903fe07d0359cbfc6d3b893");
        }
        Request.Builder method = new Request.Builder().url(ajVar.b()).method(ajVar.c());
        if (!TextUtils.isEmpty(ajVar.h())) {
            method.catCommand(ajVar.h());
        }
        HashMap<String, String> hashMap = new HashMap<>();
        List<q> d = ajVar.d();
        if (d != null && d.size() > 0) {
            for (q qVar : d) {
                if ("post-fail-over".equals(qVar.a())) {
                    if ("true".equals(qVar.b())) {
                        method.isPostFailOver(true);
                    }
                } else if ("retrofit-mt-request-timeout".equals(qVar.a())) {
                    if (TextUtils.isEmpty(qVar.b())) {
                        continue;
                    } else {
                        try {
                            method.timeout(Integer.parseInt(qVar.b()));
                        } catch (NumberFormatException unused) {
                            throw new NumberFormatException("retrofit-mt-request-timeout set failed and its value should be int");
                        }
                    }
                } else if ("fail-over".equals(qVar.a())) {
                    if ("false".equals(qVar.b())) {
                        method.isFailOver(false);
                    }
                } else if (!"catCmd".equals(qVar.a())) {
                    b.a(hashMap, qVar.a(), qVar.b());
                }
            }
        }
        ak i = ajVar.i();
        if (i != null) {
            String contentType = i.contentType();
            if (!TextUtils.isEmpty(contentType)) {
                b.a(hashMap, "Content-Type", contentType);
            }
            long contentLength = i.contentLength();
            if (contentLength == -1) {
                b.a(hashMap, "Transfer-Encoding", "chunked");
                b.a(hashMap, "Content-Length");
            } else {
                b.a(hashMap, "Content-Length", Long.toString(contentLength));
                b.a(hashMap, "Transfer-Encoding");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            i.writeTo(byteArrayOutputStream);
            method.input((InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        }
        return method.headers(hashMap).build();
    }
}
