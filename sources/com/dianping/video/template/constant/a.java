package com.dianping.video.template.constant;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    public static ChangeQuickRedirect a;
    private int b;

    public a(int i) {
        super("error message = " + i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6131ed8aa42b398c39bee463ea9d6106", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6131ed8aa42b398c39bee463ea9d6106");
        } else {
            this.b = i;
        }
    }

    public a(int i, String str) {
        super(str);
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8f1d1eefdbd1a63bdb893b37715113", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8f1d1eefdbd1a63bdb893b37715113");
        } else {
            this.b = i;
        }
    }
}
