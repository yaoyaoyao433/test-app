package com.meituan.msc.modules.service;

import android.support.annotation.Nullable;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.m;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.o;
import com.meituan.msc.modules.manager.p;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.ApiProvider;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static String a(String str, DioFile dioFile, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, dioFile, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9e4743470e07ef64f253b6b4f93db79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9e4743470e07ef64f253b6b4f93db79");
        }
        m.a b = m.b(dioFile);
        if (b.b != null) {
            if (valueCallback instanceof o) {
                ((o) valueCallback).a(new IOException(str + "#evaluateJsFile readContent failed", b.b));
            }
            return null;
        }
        return b.a;
    }

    public static String a(Collection<DioFile> collection, com.meituan.msc.modules.engine.h hVar, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {collection, hVar, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "645c75afcd5c8d785f84f5a40c6db043", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "645c75afcd5c8d785f84f5a40c6db043");
        }
        StringBuilder sb = new StringBuilder();
        for (DioFile dioFile : collection) {
            if (dioFile.c()) {
                String a2 = a("MSCFileUtils", dioFile, valueCallback);
                if (a2 != null) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(a2);
                } else {
                    com.meituan.msc.modules.exception.c cVar = hVar.q;
                    cVar.handleException(new p("file " + dioFile.e() + " content is null, abort evaluateJsFile"));
                }
            }
        }
        return sb.toString();
    }

    public static String a(String[] strArr, String str, com.meituan.msc.modules.engine.h hVar, b bVar) {
        Object[] objArr = {strArr, str, hVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15ad892837248d57f0350a51a8e9d393", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15ad892837248d57f0350a51a8e9d393");
        }
        if (hVar == null) {
            return null;
        }
        if (strArr == null) {
            hVar.q.handleException(new p("AppService#importScripts Error: files null"));
            return null;
        }
        JSONObject a2 = ab.a(str);
        boolean optBoolean = a2.optBoolean(ApiProvider.TYPE_COMBO, false);
        if (a2.optBoolean("withoutEval", false)) {
            return a(strArr, true, hVar, bVar);
        }
        if (optBoolean) {
            try {
            } catch (Exception e) {
                hVar.q.handleException(e);
            }
            if (!DebugHelper.b) {
                a(strArr, false, hVar, bVar);
                return null;
            }
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            a(new String[]{strArr[i]}, false, hVar, bVar);
        }
        return null;
    }

    private static String a(final String[] strArr, boolean z, final com.meituan.msc.modules.engine.h hVar, b bVar) {
        Object[] objArr = {strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0), hVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b847946aeadd4974cfb978b1c083c8b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b847946aeadd4974cfb978b1c083c8b8");
        }
        List<DioFile> a2 = hVar.r.a(strArr);
        String a3 = com.meituan.msc.modules.update.d.a(strArr);
        if (z) {
            return a(a2, hVar, (ValueCallback<String>) null);
        }
        if (bVar != null) {
            bVar.a(a2, a3, new o() { // from class: com.meituan.msc.modules.service.g.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "516a3996f930ab547f6201bd52298add", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "516a3996f930ab547f6201bd52298add");
                    } else {
                        PackageLoadReporter.a(com.meituan.msc.modules.engine.h.this).a(1, "files", strArr);
                    }
                }

                @Override // com.meituan.msc.modules.engine.o
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ecda8198ae88fc04dfddf6ecc902947", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ecda8198ae88fc04dfddf6ecc902947");
                        return;
                    }
                    com.meituan.msc.modules.engine.h.this.q.handleException(exc);
                    PackageLoadReporter.a(com.meituan.msc.modules.engine.h.this).a(0, "files", strArr, -1, exc != null ? exc.toString() : "");
                }
            });
        }
        return null;
    }
}
