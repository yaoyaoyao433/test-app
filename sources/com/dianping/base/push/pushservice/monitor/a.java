package com.dianping.base.push.pushservice.monitor;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;

    public abstract void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3);

    public a(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f617d8f36882e9716791656d92e7fa4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f617d8f36882e9716791656d92e7fa4b");
        }
    }
}
