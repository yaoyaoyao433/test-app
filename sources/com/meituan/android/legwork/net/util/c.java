package com.meituan.android.legwork.net.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.o;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdb0997818b12d1d7a92d3f456e00684", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdb0997818b12d1d7a92d3f456e00684");
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        for (Map.Entry<String, String> entry : a.a(parse).entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                buildUpon.appendQueryParameter(key, entry.getValue());
            }
        }
        return buildUpon.toString();
    }

    public static aj a(aj ajVar) {
        aj ajVar2;
        Exception e;
        String g;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86a49c9b639716247aa1048c5828c06b", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86a49c9b639716247aa1048c5828c06b");
        }
        if (ajVar != null) {
            try {
            } catch (Exception e2) {
                ajVar2 = ajVar;
                e = e2;
            }
            if (TextUtils.equals("true", ajVar.a("Legwork-Fingerprint"))) {
                ajVar2 = ajVar.a().c("Legwork-Fingerprint").a();
                try {
                    g = com.meituan.android.legwork.common.hostInfo.b.e().g();
                } catch (Exception e3) {
                    e = e3;
                    x.e("RequestHelper.addFingerPrint()", "addFingerPrint failed, exception msg:", e);
                    x.a(e);
                    ajVar = ajVar2;
                    b(ajVar);
                    return ajVar;
                }
                if (TextUtils.isEmpty(g)) {
                    x.e("RequestHelper.addFingerPrint()", "生成指纹为空");
                    return ajVar2;
                }
                String c = ajVar2.c();
                if (TextUtils.equals(c, "GET")) {
                    Uri.Builder buildUpon = Uri.parse(ajVar2.b()).buildUpon();
                    buildUpon.appendQueryParameter(FingerprintManager.TAG, g);
                    ajVar = ajVar2.a().b(buildUpon.toString()).a();
                } else {
                    if (TextUtils.equals(c, "POST")) {
                        o.a aVar = new o.a();
                        ak i = ajVar2.i();
                        if (!a(i) && !(i instanceof o)) {
                            if (com.meituan.android.legwork.a.b) {
                                ab.a("requestBody is not FormBody");
                            }
                            x.e("RequestHelper.addFingerPrint()", "requestBody is not FormBody");
                        }
                        if (i instanceof o) {
                            o oVar = (o) i;
                            for (int i2 = 0; i2 < oVar.a(); i2++) {
                                aVar.b(oVar.a(i2), oVar.c(i2));
                            }
                        }
                        aVar.a(FingerprintManager.TAG, g);
                        ajVar = ajVar2.a().a(aVar.a()).a();
                    }
                    ajVar = ajVar2;
                }
            }
        }
        b(ajVar);
        return ajVar;
    }

    public static void b(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eec6c76d382223b49b2fcf553e88daa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eec6c76d382223b49b2fcf553e88daa9");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("url: ");
            sb.append(ajVar.b());
            sb.append(";");
            ak i = ajVar.i();
            if (i instanceof o) {
                sb.append("request body: ");
                for (int i2 = 0; i2 < ((o) i).a(); i2++) {
                    sb.append(((o) i).b(i2));
                    sb.append("=");
                    sb.append(((o) i).d(i2));
                    if (i2 < ((o) i).a() - 1) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
            }
            if (ajVar.b().contains("report/metrics")) {
                return;
            }
            String a2 = ajVar.a("M-TraceId");
            x.d("RequestHelper.logRequest()", "traceId: " + a2 + ",API request: " + sb.toString());
        } catch (Exception e) {
            x.e("RequestHelper.logRequest()", "print request log failed, exception msg: ", e);
            x.a(e);
        }
    }

    private static boolean a(ak akVar) {
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e9b257dd01ef8f16e2119d0d26ddd6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e9b257dd01ef8f16e2119d0d26ddd6f")).booleanValue();
        }
        if (akVar != null) {
            try {
                if (akVar.contentLength() != 0) {
                    return false;
                }
            } catch (Exception e) {
                x.a(e);
                return true;
            }
        }
        return true;
    }
}
