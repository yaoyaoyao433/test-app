package com.dianping.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
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
public class e extends k {
    public static ChangeQuickRedirect b;
    private HashMap<String, String> a;
    private String d;

    public e(HashMap<String, String> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05a16f6ad201e3d99caa2f607a2312f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05a16f6ad201e3d99caa2f607a2312f6");
            return;
        }
        this.a = hashMap;
        this.d = str;
    }

    private String b() throws UnsupportedEncodingException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1bd2ae6de9ac6ebc5e3f888b059fd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1bd2ae6de9ac6ebc5e3f888b059fd3");
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
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

    @Override // com.dianping.util.k
    public final InputStream a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc32bba5d76c7b4815125dd4edc31775", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc32bba5d76c7b4815125dd4edc31775");
        }
        try {
            return new ByteArrayInputStream(b().getBytes(this.d));
        } catch (UnsupportedCharsetException e) {
            throw new IOException(e.getMessage());
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163c71ce8ed0e2949ca5864309132640", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163c71ce8ed0e2949ca5864309132640");
        }
        try {
            return b();
        } catch (Exception unused) {
            return "";
        }
    }
}
