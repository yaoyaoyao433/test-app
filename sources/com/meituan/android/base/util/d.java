package com.meituan.android.base.util;

import android.content.UriMatcher;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final Uri b = new Uri.Builder().scheme("imeituan").authority("www.meituan.com").build();
    private static final UriMatcher c;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        uriMatcher.addURI("www.meituan.com", "homeinn/reserveinfo", 1);
    }

    public static Uri.Builder a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "569e6c0da808b33c8c378112ba7a9182", RobustBitConfig.DEFAULT_VALUE) ? (Uri.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "569e6c0da808b33c8c378112ba7a9182") : b.buildUpon();
    }
}
