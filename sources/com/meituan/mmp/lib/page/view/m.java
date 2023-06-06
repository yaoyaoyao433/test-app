package com.meituan.mmp.lib.page.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.dianping.titans.utils.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.utils.ai;
import com.meituan.mmp.lib.utils.av;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;

    @SuppressLint({"SdCardPath"})
    public static Object a(Context context, com.meituan.mmp.lib.config.a aVar, String str, com.meituan.mmp.lib.resource.b bVar) {
        DioFile a2;
        Object a3;
        Object[] objArr = {context, aVar, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37083109c0e6505557cbb2ba33953d18", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37083109c0e6505557cbb2ba33953d18");
        }
        if (URLUtil.isNetworkUrl(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        com.meituan.mmp.lib.trace.b.b("interceptResource", str);
        ab.b("interceptResource " + str);
        try {
            if (DebugHelper.c) {
                if (str.startsWith("mtlocalfile://" + ay.a(context))) {
                    return a(aVar, str, ai.a(str), new DioFile(str.substring(14)), bVar);
                }
            }
            if (str.startsWith("file://")) {
                return b(context, aVar, str, bVar);
            }
            if (str.startsWith("wdfile://")) {
                Object[] objArr2 = {context, aVar, str, bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "446aa979b0f83745fab9e50bd33e7562", RobustBitConfig.DEFAULT_VALUE)) {
                    String substring = str.substring(9);
                    if (!TextUtils.isEmpty(substring) && (a2 = a(context, aVar, substring)) != null) {
                        if (!q.a(a2, aVar.e(context))) {
                            throw new a();
                        }
                        if (a2.c() || a2.k()) {
                            a3 = a(aVar, str, "image/*", a2, bVar);
                        }
                    }
                    return obj;
                }
                a3 = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "446aa979b0f83745fab9e50bd33e7562");
                obj = a3;
                return obj;
            }
            return null;
        } catch (a unused) {
            return a(403, (String) null, (InputStream) null, bVar, str);
        } finally {
            ab.b();
        }
    }

    private static DioFile a(Context context, com.meituan.mmp.lib.config.a aVar, String str) {
        String absolutePath;
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f46985805a745f758337e83f4e193275", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f46985805a745f758337e83f4e193275");
        }
        if (str.startsWith("tmp_")) {
            absolutePath = aVar.c(context);
        } else if (str.startsWith("store_")) {
            absolutePath = aVar.a(context);
        } else {
            absolutePath = str.startsWith("usr/") ? aVar.e(context).getAbsolutePath() : null;
        }
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        return new DioFile(absolutePath, str);
    }

    private static Object b(Context context, com.meituan.mmp.lib.config.a aVar, String str, com.meituan.mmp.lib.resource.b bVar) throws a {
        InputStream b;
        Object[] objArr = {context, aVar, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d81d0bf15ea7c22f03ddce98152b8da", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d81d0bf15ea7c22f03ddce98152b8da");
        }
        String path = Uri.parse(str).getPath();
        com.meituan.mmp.lib.trace.b.b("WebViewFileFilter", "load file" + path);
        if (path == null) {
            return null;
        }
        int indexOf = str.indexOf("??");
        if (indexOf > 0) {
            com.meituan.mmp.lib.trace.b.b("WebViewFileFilter", "load file in combo mode: " + str);
            String[] split = str.substring(indexOf + 2).split(CommonConstant.Symbol.COMMA);
            ArrayList arrayList = new ArrayList();
            if (!path.endsWith("/")) {
                path = path + "/";
            }
            for (String str2 : split) {
                String trim = str2.trim();
                if (trim.startsWith("/")) {
                    trim = trim.substring(1);
                }
                InputStream b2 = b(context, aVar, path + trim);
                if (b2 != null) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(new StringBufferInputStream("\n"));
                    }
                    arrayList.add(b2);
                }
            }
            final Iterator it = arrayList.iterator();
            b = new av(new Enumeration<InputStream>() { // from class: com.meituan.mmp.lib.page.view.m.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Enumeration
                public final /* synthetic */ InputStream nextElement() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a43e7cec96edc677cb78d841677640a", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a43e7cec96edc677cb78d841677640a") : (InputStream) it.next();
                }

                @Override // java.util.Enumeration
                public final boolean hasMoreElements() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "116ba8669b106b882b69302bc2f5c354", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "116ba8669b106b882b69302bc2f5c354")).booleanValue() : it.hasNext();
                }
            });
        } else {
            b = b(context, aVar, path);
        }
        return a(200, ai.a(str), b, bVar, str);
    }

    private static InputStream b(Context context, com.meituan.mmp.lib.config.a aVar, String str) throws a {
        DioFile a2;
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45f397ac25a0c618a82bd6cd57d74a40", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45f397ac25a0c618a82bd6cd57d74a40");
        }
        try {
            Trace.beginSection("getFileResource: " + str);
            if (str.startsWith("/data/user/")) {
                a2 = new DioFile(str);
            } else {
                if (!str.startsWith("/usr/") && !str.startsWith("/tmp_") && !str.startsWith("/store_")) {
                    a2 = aVar.a(context, str);
                }
                a2 = a(context, aVar, str.substring(1));
                if (a2 == null) {
                    return null;
                }
            }
            if (!q.a(a2, aVar.e(context)) && !q.a(a2, ay.b(context))) {
                throw new a();
            }
            if (a2.j()) {
                return null;
            }
            if (a2.c() || a2.k()) {
                return a2.b();
            }
            return null;
        } catch (IOException e) {
            s.a(null, a2.g(), e, null, aVar.c());
            com.meituan.mmp.lib.trace.b.a(e);
            return null;
        } finally {
            Trace.endSection();
        }
    }

    private static Object a(com.meituan.mmp.lib.config.a aVar, String str, String str2, DioFile dioFile, com.meituan.mmp.lib.resource.b bVar) {
        Object[] objArr = {aVar, str, str2, dioFile, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dce5a9c0b3367acdbc648d7e7bed4c37", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dce5a9c0b3367acdbc648d7e7bed4c37");
        }
        if (dioFile.c() || dioFile.k()) {
            try {
                try {
                    ab.a("getInputStream: " + str);
                    InputStream b = dioFile.b();
                    ab.a();
                    return a(200, str2, b, bVar, str);
                } catch (IOException e) {
                    s.a(null, dioFile.g(), e, null, aVar.c());
                    com.meituan.mmp.lib.trace.b.a(e);
                    ab.a();
                    return null;
                }
            } catch (Throwable th) {
                ab.a();
                throw th;
            }
        }
        return null;
    }

    private static Object a(int i, String str, InputStream inputStream, com.meituan.mmp.lib.resource.b bVar, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, inputStream, bVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        HashMap hashMap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cd8c72b27fde977e1d6f2f011362bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cd8c72b27fde977e1d6f2f011362bfb");
        }
        if (i == 403 || inputStream == null) {
            com.meituan.mmp.lib.trace.b.d("getResourceError", str2);
            str = Constants.MIME_TYPE_HTML;
            inputStream = new InputStream() { // from class: com.meituan.mmp.lib.page.view.m.2
                @Override // java.io.InputStream
                public final int read() throws IOException {
                    return -1;
                }
            };
        }
        if (Build.VERSION.SDK_INT >= 21) {
            hashMap = new HashMap();
            hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
            hashMap.put("Pragma", "no-cache");
            hashMap.put("Expires", "0");
        }
        return bVar.a(str, hashMap, inputStream);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
        public a() {
        }
    }
}
