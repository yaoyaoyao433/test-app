package com.meituan.msc.modules.page.render.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.dianping.titans.utils.Constants;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ag;
import com.meituan.msc.common.utils.ai;
import com.meituan.msc.common.utils.as;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.devtools.DebugHelper;
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
public final class p {
    public static ChangeQuickRedirect a;

    @SuppressLint({"SdCardPath"})
    public static Object a(Context context, IFileModule iFileModule, String str, com.meituan.msc.common.resource.b bVar) {
        Object[] objArr = {context, iFileModule, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f44aaa725ff9507a30ef884cbc4beab5", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f44aaa725ff9507a30ef884cbc4beab5");
        }
        if (URLUtil.isNetworkUrl(str) || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (DebugHelper.b) {
                if (str.startsWith("mtlocalfile://" + ag.a(context))) {
                    return a(iFileModule, str, ai.a(str), new DioFile(str.substring(14)), bVar);
                }
            }
            if (str.startsWith("file://")) {
                return b(context, iFileModule, str, bVar);
            }
            String b = r.b(str, iFileModule);
            if (b != null) {
                Object[] objArr2 = {context, iFileModule, str, b, bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d514b7e0a6314dd53055c45fd2dea282", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d514b7e0a6314dd53055c45fd2dea282");
                }
                DioFile dioFile = new DioFile(b);
                if (!com.meituan.msc.common.utils.p.a(dioFile, iFileModule.d())) {
                    throw new a();
                }
                if (dioFile.c() || dioFile.k()) {
                    return a(iFileModule, str, "image/*", dioFile, bVar);
                }
                return null;
            }
            return null;
        } catch (a unused) {
            return a(403, (String) null, (InputStream) null, bVar);
        }
    }

    private static Object b(Context context, IFileModule iFileModule, String str, com.meituan.msc.common.resource.b bVar) throws a {
        InputStream a2;
        Object[] objArr = {context, iFileModule, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4bef99fff359a8be719e7733262ff61", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4bef99fff359a8be719e7733262ff61");
        }
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return null;
        }
        int indexOf = str.indexOf("??");
        if (indexOf > 0) {
            com.meituan.msc.modules.reporter.g.b("WebViewFileFilter", "load file in combo mode: ", str);
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
                InputStream a3 = a(context, iFileModule, path + trim);
                if (a3 != null) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(new StringBufferInputStream("\n"));
                    }
                    arrayList.add(a3);
                }
            }
            final Iterator it = arrayList.iterator();
            a2 = new as(new Enumeration<InputStream>() { // from class: com.meituan.msc.modules.page.render.webview.p.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Enumeration
                public final /* synthetic */ InputStream nextElement() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53ac82afbe3a3a6ba48f62b9cab62976", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53ac82afbe3a3a6ba48f62b9cab62976") : (InputStream) it.next();
                }

                @Override // java.util.Enumeration
                public final boolean hasMoreElements() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3aae5ed6522a2955448bddc67436efa5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3aae5ed6522a2955448bddc67436efa5")).booleanValue() : it.hasNext();
                }
            });
        } else {
            a2 = a(context, iFileModule, path);
        }
        return a(200, ai.a(str), a2, bVar);
    }

    @Nullable
    private static InputStream a(Context context, IFileModule iFileModule, String str) throws a {
        DioFile b;
        boolean z = false;
        Object[] objArr = {context, iFileModule, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "094db244011d430e536e733a46b5ae21", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "094db244011d430e536e733a46b5ae21");
        }
        try {
            Trace.beginSection("getFileResource: " + str);
            if (str.startsWith("/data/user/")) {
                b = new DioFile(str);
            } else {
                String a2 = r.a(str.substring(1), iFileModule);
                if (a2 != null) {
                    b = new DioFile(a2);
                } else {
                    b = iFileModule.b(str);
                    z = true;
                }
            }
            if (b == null) {
                return null;
            }
            if (!z && !com.meituan.msc.common.utils.p.a(b, iFileModule.d())) {
                throw new a();
            }
            if (b.j()) {
                return null;
            }
            if (b.c() || b.k()) {
                return b.b();
            }
            return null;
        } catch (IOException e) {
            com.meituan.msc.modules.reporter.g.a(e);
            return null;
        } finally {
            Trace.endSection();
        }
    }

    private static Object a(IFileModule iFileModule, String str, String str2, DioFile dioFile, com.meituan.msc.common.resource.b bVar) {
        Object[] objArr = {iFileModule, str, str2, dioFile, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09117b70ecb7f3751075fd040ff931d8", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09117b70ecb7f3751075fd040ff931d8");
        }
        if (dioFile.c() || dioFile.k()) {
            try {
                return a(200, str2, dioFile.b(), bVar);
            } catch (IOException e) {
                com.meituan.msc.modules.reporter.g.a(e);
                return null;
            }
        }
        return null;
    }

    private static Object a(int i, String str, InputStream inputStream, com.meituan.msc.common.resource.b bVar) {
        Object[] objArr = {Integer.valueOf(i), str, inputStream, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        HashMap hashMap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f0b80b30168ef2d4f4308248946d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f0b80b30168ef2d4f4308248946d0f");
        }
        if (i == 403 || inputStream == null) {
            str = Constants.MIME_TYPE_HTML;
            inputStream = new InputStream() { // from class: com.meituan.msc.modules.page.render.webview.p.2
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
