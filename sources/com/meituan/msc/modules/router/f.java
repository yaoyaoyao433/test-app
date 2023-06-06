package com.meituan.msc.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.msc.modules.container.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends t {
    public static ChangeQuickRedirect c;
    public List<a> d;

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628ce9b75e990d3b1cb46a31cad86150", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628ce9b75e990d3b1cb46a31cad86150");
        } else {
            this.d = new ArrayList();
        }
    }

    @Override // com.meituan.msc.modules.container.t
    public final boolean a(Context context, Intent intent, boolean z) {
        Uri data;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5748ce5368f784c42916516697a429f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5748ce5368f784c42916516697a429f1")).booleanValue();
        }
        if ((z || com.meituan.msc.common.process.a.f() || com.meituan.msc.common.process.a.STANDARD.c()) && (data = intent.getData()) != null && data.isHierarchical()) {
            for (a aVar : this.d) {
                if (aVar.a() && a(data, aVar.b) && aVar.a(context, data, intent, z)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean a(Uri uri, Uri uri2) {
        Object[] objArr = {uri, uri2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38df33b50c228a5111c554d82d2ea5e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38df33b50c228a5111c554d82d2ea5e2")).booleanValue() : uri2.getPath().equalsIgnoreCase(uri.getPath()) && uri2.getHost().equalsIgnoreCase(uri.getHost()) && uri2.getScheme().equalsIgnoreCase(uri.getScheme());
    }
}
