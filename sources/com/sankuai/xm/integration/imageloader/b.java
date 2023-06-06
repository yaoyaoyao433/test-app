package com.sankuai.xm.integration.imageloader;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static IImageModelLoader b;

    public static IImageModelLoader a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "586b76b2b9a3a7bcef9cb8f9292dd77d", 6917529027641081856L)) {
            return (IImageModelLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "586b76b2b9a3a7bcef9cb8f9292dd77d");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = (IImageModelLoader) m.a(IImageModelLoader.class);
                }
                if (b == null) {
                    throw new NullPointerException("see " + new String(Base64.decode("aHR0cHM6Ly9kZXZlbG9wZXJzLnNhbmt1YWkuY29tL210L3htL3htLWFuZHJvaWQtc2RrLWRvYy9sYXRlc3Qvd2lraS9jb25maWcvI180", 0)) + " for details");
                }
            }
        }
        return b;
    }

    public static e a(@NonNull String str) {
        Uri a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d9b3ff4b95296363743be7b7951ea23", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d9b3ff4b95296363743be7b7951ea23");
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.startsWith("/")) {
            a2 = com.sankuai.xm.integration.imageloader.utils.a.a(str);
        } else {
            Uri parse = Uri.parse(str);
            a2 = parse.getScheme() == null ? com.sankuai.xm.integration.imageloader.utils.a.a(str) : parse;
        }
        return new e(a2);
    }

    public static e a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45d96f3f6241f67ba1721c7826ba1af8", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45d96f3f6241f67ba1721c7826ba1af8") : new e(uri);
    }

    public static e a(Context context, @DrawableRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95d6c3780826c8af6f961e47a123f72e", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95d6c3780826c8af6f961e47a123f72e") : new e(com.sankuai.xm.integration.imageloader.utils.a.a(context, i));
    }
}
