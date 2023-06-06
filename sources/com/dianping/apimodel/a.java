package com.dianping.apimodel;

import android.os.Build;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.titans.utils.Constants;
import com.dianping.util.h;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static byte[] a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f6db956e20d186c98bba3cdcbd189a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f6db956e20d186c98bba3cdcbd189a5");
        }
        if (inputStream == null) {
            return new byte[10];
        }
        try {
            if (inputStream.markSupported()) {
                inputStream.mark(0);
            }
            int available = inputStream.available();
            if (available <= 0) {
                available = 4096;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(available);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            if (inputStream.markSupported()) {
                inputStream.reset();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Request a(Request request) {
        String str;
        String str2;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76fcf29baf631de7f96dc98764707135", RobustBitConfig.DEFAULT_VALUE)) {
            return (Request) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76fcf29baf631de7f96dc98764707135");
        }
        String str4 = "MApi 1.0 (com.dianping.v1 9.1.6 null null; Android " + Build.VERSION.RELEASE + CommonConstant.Symbol.BRACKET_RIGHT;
        if (request.g != null) {
            str3 = request.g.get("Content-Encoding");
            str2 = request.g.get("Content-Type");
            str = request.g.get("User-Agent");
        } else {
            str = str4;
            str2 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        String str5 = str3;
        if (TextUtils.isEmpty(str2)) {
            str2 = Constants.MIME_TYPE_HTML;
        }
        try {
            return request.a().url(MTGuard.requestSignatureForBabel(request.f, request.d, str, str5, str2, a(request.i))).build();
        } catch (Exception e) {
            h.b(e.toString());
            return request;
        }
    }

    public static List<com.dianping.apache.http.a> a() {
        byte[] bArr;
        com.dianping.apache.http.message.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd1164d5afba7343890ed77bcc388a21", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd1164d5afba7343890ed77bcc388a21");
        }
        try {
            bArr = MTGuard.userIdentification();
        } catch (Exception e) {
            h.b(e.toString());
            bArr = null;
        }
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            aVar = new com.dianping.apache.http.message.a("siua", new String(bArr));
        } else {
            aVar = new com.dianping.apache.http.message.a("siua", "");
        }
        arrayList.add(aVar);
        return arrayList;
    }
}
