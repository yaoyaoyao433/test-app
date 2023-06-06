package com.meituan.android.mercury.msc.adaptor.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends com.meituan.met.mercury.load.core.f {
    public static ChangeQuickRedirect a;

    public e(short s, String str) {
        this(s, str, null);
        Object[] objArr = {Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c152a07f940b0ab91eceb1c645f593", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c152a07f940b0ab91eceb1c645f593");
        }
    }

    private e(short s, String str, Throwable th) {
        super(s, "errCode:" + ((int) s) + ",errMsg: " + str, th);
        Object[] objArr = {Short.valueOf(s), str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e5d495d1749e1ed1aaa9365dddc45f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e5d495d1749e1ed1aaa9365dddc45f");
        }
    }

    public static e a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ceb20546a3703dae30b00189bcf744a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ceb20546a3703dae30b00189bcf744a");
        }
        if (exc instanceof e) {
            return (e) exc;
        }
        if (exc instanceof com.meituan.met.mercury.load.core.f) {
            com.meituan.met.mercury.load.core.f fVar = (com.meituan.met.mercury.load.core.f) exc;
            return new e((short) fVar.c, fVar.getMessage());
        }
        return new e((short) -1, exc.toString(), exc);
    }
}
