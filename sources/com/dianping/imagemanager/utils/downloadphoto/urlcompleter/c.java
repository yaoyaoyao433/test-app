package com.dianping.imagemanager.utils.downloadphoto.urlcompleter;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.imagemanager.utils.downloadphoto.urlcompleter.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c766ce3d7df4da252768ac418741d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c766ce3d7df4da252768ac418741d7");
        }
        if (TextUtils.isEmpty(str) || Build.VERSION.SDK_INT < 17 || "Nokia_X".equals(Build.MODEL) || str.toLowerCase(Locale.getDefault()).contains(".webp")) {
            return str;
        }
        return str + ".webp";
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.urlcompleter.a
    public final String a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6d24e185eeaf861f00aa23eec1d198", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6d24e185eeaf861f00aa23eec1d198");
        }
        if (TextUtils.isEmpty(str) || i < 0 || i2 < 0) {
            return str;
        }
        if (str.contains("/w.h")) {
            return str.replace("/w.h", String.format("/%d.%d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (Pattern.compile("/\\d+\\.\\d+(\\.\\w+)?/").matcher(str).find() || Pattern.compile("(@|%40|\\||%7C)\\d+w_\\d+h").matcher(str).find()) {
            return str;
        }
        String str2 = (str.indexOf(64) >= 0 || str.indexOf("%40") >= 0) ? "|%dw_%dh_1e_1l" : "@%dw_%dh_1e_1l";
        return str + String.format(str2, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
