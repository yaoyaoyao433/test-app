package com.dianping.nvnetwork.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends o {
    public static ChangeQuickRedirect a;
    public HashMap<String, String> b;
    private String d;

    public f(HashMap<String, String> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e03dfebce12eb38ea2a552b2f93f1f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e03dfebce12eb38ea2a552b2f93f1f8");
            return;
        }
        this.b = hashMap;
        this.d = str;
    }

    public f(HashMap<String, String> hashMap) {
        this(hashMap, CommonConstant.Encoding.ISO88591);
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b26b2e967ba9db63689f6d4022c13890", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b26b2e967ba9db63689f6d4022c13890");
        }
    }

    public f(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593ea304bc0be645cc0ca5b64d1e1499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593ea304bc0be645cc0ca5b64d1e1499");
            return;
        }
        int length = strArr.length / 2;
        HashMap<String, String> hashMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            hashMap.put(strArr[i2], strArr[i2 + 1]);
        }
        this.b = hashMap;
        this.d = CommonConstant.Encoding.ISO88591;
    }

    private String b() throws UnsupportedEncodingException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d28f119ceedeb3984b8af7f54f6c52", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d28f119ceedeb3984b8af7f54f6c52");
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(entry.getKey());
            sb.append('=');
            if (entry.getValue() != null) {
                sb.append(URLEncoder.encode(entry.getValue(), this.d));
            }
        }
        return sb.toString();
    }

    @Override // com.dianping.nvnetwork.util.o
    public final InputStream a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b88cb64ace4915c1e31a2988f6a096", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b88cb64ace4915c1e31a2988f6a096");
        }
        try {
            return new ByteArrayInputStream(b().getBytes(this.d));
        } catch (UnsupportedCharsetException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64a1e57cf964c15f285ca16f9eec2ec", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64a1e57cf964c15f285ca16f9eec2ec");
        }
        try {
            return b();
        } catch (Exception unused) {
            return "";
        }
    }
}
