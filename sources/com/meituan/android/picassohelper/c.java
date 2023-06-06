package com.meituan.android.picassohelper;

import android.content.Context;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b52f631d834d87a79271be246e3d3806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b52f631d834d87a79271be246e3d3806");
        } else if (b) {
        } else {
            synchronized (c.class) {
                if (b) {
                    return;
                }
                Picasso.a(context, DioFile.class, InputStream.class, new b());
                b = true;
            }
        }
    }
}
