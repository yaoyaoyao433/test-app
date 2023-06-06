package com.meituan.msc.modules.container.fusion;

import android.content.Context;
import com.meituan.msc.modules.container.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends t {
    public static ChangeQuickRedirect c = null;
    public static boolean d = true;
    public static Class e;
    private static Boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc26c4a94078d2707403bd173c56518b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc26c4a94078d2707403bd173c56518b");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    @Override // com.meituan.msc.modules.container.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r22, android.content.Intent r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.container.fusion.d.a(android.content.Context, android.content.Intent, boolean):boolean");
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ce7c2620e99414fdda8c726b974f7a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ce7c2620e99414fdda8c726b974f7a7")).booleanValue();
        }
        if (f.booleanValue()) {
            if (e == null) {
                try {
                    e = Class.forName("com.sankuai.meituan.mbc.dsp.DspActivity");
                } catch (ClassNotFoundException unused) {
                }
            }
            if (e != null) {
                return context.getClass().isAssignableFrom(e);
            }
        }
        return false;
    }
}
