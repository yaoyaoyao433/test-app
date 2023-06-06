package com.sankuai.waimai.platform.net.netdiagnosis;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.platform.net.util.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "537099dce791d94ce570dfbdba2e1588", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "537099dce791d94ce570dfbdba2e1588")).booleanValue();
        }
        String path = TextUtils.isEmpty(str) ? "" : Uri.parse(str).getPath();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(f.c);
            sb.append(f.a);
            if (TextUtils.isEmpty(path)) {
                path = "v7/loadInfo";
            }
            sb.append(path);
            return ((IBizApi) new ar.a().a(f.c).a(i.a("okhttp")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a().a(IBizApi.class)).getLoadInfo(sb.toString()).a().b() == 200;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }
}
