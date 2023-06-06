package com.dianping.logreportswitcher.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static HashMap<String, String> a(Context context, com.dianping.logreportswitcher.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d13261ae866dc42f0226efc7049a6bc", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d13261ae866dc42f0226efc7049a6bc");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (bVar != null) {
            hashMap.put("unionId", TextUtils.isEmpty(bVar.b()) ? StringUtil.NULL : bVar.b());
        }
        try {
            hashMap.put("versionName", a(context));
        } catch (Exception e) {
            com.dianping.logreportswitcher.d.a("APPUtils", e);
        }
        return hashMap;
    }

    private static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce50d23eb503464a7a2b7439309e1d74", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce50d23eb503464a7a2b7439309e1d74");
        }
        if (context == null) {
            return "";
        }
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_NAME");
            return string == null ? "" : string;
        } catch (Exception unused) {
            return "";
        }
    }
}
