package com.sankuai.waimai.platform.net.interceptor.okhttp;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.af;
import com.squareup.okhttp.p;
import com.squareup.okhttp.s;
import com.squareup.okhttp.t;
import com.squareup.okhttp.u;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements t {
    public static ChangeQuickRedirect a;
    private u b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f9925255187f5c82911022c5b176b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f9925255187f5c82911022c5b176b0");
        } else {
            this.b = u.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0261  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // com.squareup.okhttp.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.squareup.okhttp.z intercept(com.squareup.okhttp.t.a r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.interceptor.okhttp.c.intercept(com.squareup.okhttp.t$a):com.squareup.okhttp.z");
    }

    private HashMap<String, String> a(x xVar, x.a aVar) {
        Object[] objArr = {xVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b00e765a97ce2d5aa99c33d513767bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b00e765a97ce2d5aa99c33d513767bc");
        }
        List<String> a2 = com.sankuai.waimai.platform.net.e.a();
        HashMap<String, String> hashMap = null;
        if (com.sankuai.waimai.foundation.utils.d.a(a2) || xVar.c == null) {
            return null;
        }
        for (String str : a2) {
            String a3 = xVar.c.a(str);
            if (!TextUtils.isEmpty(a3)) {
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                }
                hashMap.put(str, a3);
                aVar.b(str);
            }
        }
        return hashMap;
    }

    private y a(y yVar, List<Map<String, String>> list) {
        Object[] objArr = {yVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ae17cd8dca624b9158528b47744b86", RobustBitConfig.DEFAULT_VALUE)) {
            return (y) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ae17cd8dca624b9158528b47744b86");
        }
        if (this.b.equals(yVar.contentType()) || a(yVar)) {
            p pVar = new p();
            for (Map<String, String> map : list) {
                if (map != null && !map.isEmpty()) {
                    Object[] objArr2 = {pVar, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2b8590779e8f2ec9cb1ebc5ed8f4f893", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2b8590779e8f2ec9cb1ebc5ed8f4f893");
                    } else if (map != null && !map.isEmpty()) {
                        for (String str : map.keySet()) {
                            String str2 = map.get(str);
                            if (pVar.b.b > 0) {
                                pVar.b.h(38);
                            }
                            s.a(pVar.b, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true, true);
                            pVar.b.h(61);
                            s.a(pVar.b, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true, true);
                        }
                    }
                }
            }
            String b = b(yVar);
            String b2 = b(y.create(p.a, pVar.b.u()));
            u uVar = this.b;
            return y.create(uVar, b2 + "&" + b);
        }
        return yVar;
    }

    private void a(Uri.Builder builder, List<Map<String, String>> list) {
        Object[] objArr = {builder, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6f5462496226b1daefe58b617d466a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6f5462496226b1daefe58b617d466a");
            return;
        }
        for (Map<String, String> map : list) {
            if (map != null && !map.isEmpty()) {
                af.a(builder, map);
            }
        }
    }

    private static boolean a(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "288e8a90ad497dddd273fa6581ce950d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "288e8a90ad497dddd273fa6581ce950d")).booleanValue();
        }
        try {
            return yVar.contentLength() == 0;
        } catch (Exception unused) {
            return true;
        }
    }

    private static String b(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "599736a6f0e0dc4f95681df773e6e86d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "599736a6f0e0dc4f95681df773e6e86d");
        }
        if (yVar != null) {
            try {
                if (yVar.contentLength() <= 0) {
                    return "";
                }
                okio.c cVar = new okio.c();
                yVar.writeTo(cVar);
                return cVar.p();
            } catch (IOException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                return "";
            }
        }
        return "";
    }
}
