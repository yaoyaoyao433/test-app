package com.meituan.android.mrn.event;

import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h extends com.meituan.android.mrn.utils.event.b {
    public static ChangeQuickRedirect a;
    protected int b;
    protected WeakReference<ReactContext> c;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679f1b6a05f551bb2e8eef5ec9e594ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679f1b6a05f551bb2e8eef5ec9e594ed");
        } else {
            this.b = -1;
        }
    }

    public final ReactContext a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21e9124afb0c6af91ed1b0c3617d6ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21e9124afb0c6af91ed1b0c3617d6ab");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.get();
    }

    public final int b() {
        return this.b;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7626260cd07c8739e8875dc8eb32726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7626260cd07c8739e8875dc8eb32726");
        } else {
            this.c = new WeakReference<>(reactContext);
        }
    }
}
