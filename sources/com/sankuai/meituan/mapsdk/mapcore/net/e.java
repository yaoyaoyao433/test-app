package com.sankuai.meituan.mapsdk.mapcore.net;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static Context b;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea1558460ccfec0b55d503d4db81e6ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea1558460ccfec0b55d503d4db81e6ec");
        } else {
            b = context != null ? context.getApplicationContext() : null;
        }
    }

    public static Map<String, Object> a(@NonNull String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e190c482e8e210c7f8ca99b15c6391a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e190c482e8e210c7f8ca99b15c6391a6");
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("platinfo", "platform=Android&version=4.1207.11&product=meituan");
        StringBuilder sb = new StringBuilder("ts=");
        sb.append(System.currentTimeMillis());
        sb.append("&packageName=");
        sb.append(f.a(b));
        sb.append("&SHA1=");
        sb.append(f.b(b));
        sb.append("&brand=");
        sb.append(Build.BRAND);
        sb.append("&model=");
        sb.append(Build.MODEL);
        sb.append("&manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append("&device=");
        sb.append(Build.DEVICE);
        sb.append("&sdkInt=");
        sb.append(Build.VERSION.SDK_INT);
        if (!TextUtils.isEmpty(str3) && (Platform.MRN.toString().toLowerCase().equals(str2) || Platform.MSI.toString().toLowerCase().equals(str2))) {
            sb.append("&biz=");
            sb.append(str3);
        }
        arrayMap.put("X-INFO", a.a(sb.toString(), a.a(str)));
        return arrayMap;
    }
}
