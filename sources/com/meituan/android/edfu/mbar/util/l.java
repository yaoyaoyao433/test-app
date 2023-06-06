package com.meituan.android.edfu.mbar.util;

import com.meituan.android.edfu.mbar.camera.decode.MBarResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public boolean d;
    public List<MBarResult> e;
    public final String f;
    public int g;
    private final a h;
    private final long i;

    public l(String str, a aVar) {
        this(str, aVar, System.currentTimeMillis());
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05e7fcbd88f756aea535e7bd61bbdc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05e7fcbd88f756aea535e7bd61bbdc2");
        }
    }

    private l(String str, a aVar, long j) {
        Object[] objArr = {str, aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9591ec791adab965628fa5f569bcab7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9591ec791adab965628fa5f569bcab7");
            return;
        }
        this.f = str;
        this.h = aVar;
        this.i = j;
    }

    public final String a() {
        return this.f;
    }

    public final String toString() {
        return this.f;
    }
}
