package com.meituan.mmp.lib.service;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.engine.v;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.lib.utils.o;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.ApiProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    private static String a(String str, DioFile dioFile, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, dioFile, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a148bf81592fae7a7025b41ae37a5ad0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a148bf81592fae7a7025b41ae37a5ad0");
        }
        o.a b = o.b(dioFile);
        if (b.b != null) {
            if (valueCallback instanceof v) {
                ((v) valueCallback).a(new IOException(str + "#evaluateJsFile readContent failed", b.b));
            }
            return null;
        }
        return b.a;
    }

    public static String a(String[] strArr, String str, com.meituan.mmp.lib.config.a aVar, a aVar2) {
        Object[] objArr = {strArr, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3632d0dc8c26e16801f434dccba79f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3632d0dc8c26e16801f434dccba79f8c");
        }
        if (aVar == null) {
            com.meituan.mmp.lib.trace.b.e("AppService#importScripts Error: mAppConfig null. ");
            return null;
        } else if (strArr == null) {
            com.meituan.mmp.lib.trace.b.e("AppService#importScripts Error: files null");
            return null;
        } else {
            JSONObject b = ac.b(str);
            boolean optBoolean = b.optBoolean(ApiProvider.TYPE_COMBO, false);
            if (b.optBoolean("withoutEval", false)) {
                return a(strArr, true, aVar, aVar2);
            }
            if (optBoolean) {
                try {
                } catch (Throwable th) {
                    com.meituan.mmp.lib.trace.b.a(th);
                }
                if (!DebugHelper.d) {
                    a(strArr, false, aVar, aVar2);
                    return null;
                }
            }
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                a(new String[]{strArr[i]}, false, aVar, aVar2);
            }
            return null;
        }
    }

    private static List<DioFile> a(String[] strArr, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {strArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c5b4fe6a2b5b893d2b9f299a6ec3183", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c5b4fe6a2b5b893d2b9f299a6ec3183");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                DioFile a2 = aVar.a(MMPEnvHelper.getContext(), str);
                if (a2 == null || !a2.c()) {
                    com.meituan.mmp.lib.trace.b.d("MPFileUtils", "importScripts not exist! " + str);
                    if (a2 != null) {
                        com.meituan.mmp.lib.trace.b.d("MPFileUtils", "DioFile: " + a2.g());
                    }
                } else {
                    com.meituan.mmp.lib.trace.b.b("AppService", "importScripts: " + str + " -> " + a2.toString());
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public static String a(Collection<DioFile> collection, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {collection, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "006a0a788eef46d324e468b6822a3be4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "006a0a788eef46d324e468b6822a3be4");
        }
        StringBuilder sb = new StringBuilder();
        for (DioFile dioFile : collection) {
            if (dioFile.c()) {
                String a2 = a("MPFileUtils", dioFile, valueCallback);
                if (a2 == null) {
                    com.meituan.mmp.lib.trace.b.e("file " + dioFile.e() + " content is null, abort evaluateJsFile");
                } else {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(a2);
                }
            }
        }
        return sb.toString();
    }

    private static String a(String[] strArr, boolean z, final com.meituan.mmp.lib.config.a aVar, a aVar2) {
        final String str;
        Object[] objArr = {strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f460deee9f8b564275ded6ab3f55b45b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f460deee9f8b564275ded6ab3f55b45b");
        }
        List<DioFile> a2 = a(strArr, aVar);
        if (strArr.length > 1) {
            str = "/??" + TextUtils.join(CommonConstant.Symbol.COMMA, strArr);
            com.meituan.mmp.lib.trace.b.b("MPFileUtils", "importScriptsWithCombo: " + str);
        } else {
            str = strArr[0];
        }
        if (z) {
            return a(a2, (ValueCallback<String>) null);
        }
        aVar.h.a("importScripts: " + str);
        if (aVar2 != null) {
            aVar2.a(a2, str, new v() { // from class: com.meituan.mmp.lib.service.d.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd01bfe56de904c66b9453f5f59059fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd01bfe56de904c66b9453f5f59059fd");
                        return;
                    }
                    h hVar = aVar.h;
                    hVar.d("importScripts: " + str);
                }

                @Override // com.meituan.mmp.lib.engine.v
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dbebc3a08b8648b231e9a554be163bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dbebc3a08b8648b231e9a554be163bd");
                        return;
                    }
                    if (exc instanceof IOException) {
                        s.a(null, str, exc, null, aVar.c());
                    }
                    h hVar = aVar.h;
                    hVar.d("importScripts: " + str);
                }
            });
        }
        return null;
    }
}
