package com.sankuai.waimai.router;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.d;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.router.service.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static f b;
    private static Context c;
    private static b d;

    public static void a(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f08bb6f7948f95fb2dcbf70e7b111753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f08bb6f7948f95fb2dcbf70e7b111753");
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            d.d("初始化方法init应该在主线程调用", new Object[0]);
        }
        if (b == null) {
            b = fVar;
            c = fVar.f.getApplicationContext();
            return;
        }
        d.d("请勿重复初始化UriRouter", new Object[0]);
    }

    @Deprecated
    public static void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eda536770fbd5b0fb2557f068c3f6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eda536770fbd5b0fb2557f068c3f6be");
        } else {
            c = context.getApplicationContext();
        }
    }

    public static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bb4d0aa9737d72b39a6ea82ad269174", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bb4d0aa9737d72b39a6ea82ad269174");
        }
        if (c != null) {
            return c;
        }
        if (b != null) {
            c = b.f.getApplicationContext();
        }
        return c;
    }

    public static f c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62ed416cf47c61009a6e202ef8a7561b", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62ed416cf47c61009a6e202ef8a7561b");
        }
        if (b == null) {
            if (d != null) {
                b = d();
            } else {
                throw new RuntimeException("请先调用init初始化UriRouter");
            }
        }
        return b;
    }

    private static f d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db2a5bcfb62b7d4e0832599d1f4e3444", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db2a5bcfb62b7d4e0832599d1f4e3444");
        }
        c = d.a;
        return new com.sankuai.waimai.router.common.a(d.a, d.b, d.c);
    }

    public static void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ee76b9008812efd2e662386b0cb97b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ee76b9008812efd2e662386b0cb97b6");
        } else {
            c().b(jVar);
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5440437e70c9116d9bc2b78cd7762c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5440437e70c9116d9bc2b78cd7762c3b");
        } else {
            c().b(new j(context, str));
        }
    }

    public static <I, T extends I> T a(Class<I> cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1b82632728a17d09bf2afea99ea633a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1b82632728a17d09bf2afea99ea633a") : (T) e.a(cls).a(str);
    }

    public static <I, T extends I> T a(Class<I> cls, String str, Context context) {
        Object[] objArr = {cls, str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3c67141619a3fea64c37f32caae4973", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3c67141619a3fea64c37f32caae4973") : (T) e.a(cls).a(str, context);
    }

    public static <I, T extends I> List<T> a(Class<I> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0da7e51669fe1276e5650a4cd1d0747d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0da7e51669fe1276e5650a4cd1d0747d") : e.a(cls).a();
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "030602fcf932ba0f02b9754e0ae21a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "030602fcf932ba0f02b9754e0ae21a35");
        } else {
            c = com.meituan.android.singleton.b.a;
        }
    }
}
