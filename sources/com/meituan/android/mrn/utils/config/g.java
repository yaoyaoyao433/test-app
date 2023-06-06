package com.meituan.android.mrn.utils.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    final Type b;
    final Object c;
    final List<e> d;
    private final String e;
    private final b f;
    private boolean g;
    private Object h;

    public g(@NonNull Type type, @Nullable String str, @NonNull Object obj, @NonNull List<e> list, @NonNull b bVar) {
        Object[] objArr = {type, str, obj, list, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc562304dbba75faf60e696e22e67a9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc562304dbba75faf60e696e22e67a9f");
            return;
        }
        this.g = false;
        this.h = null;
        this.b = type;
        this.e = str;
        this.c = obj;
        this.d = list;
        this.f = bVar;
    }

    public final Object a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2e37e942932605825894d7061e4184", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2e37e942932605825894d7061e4184");
        }
        if (this.f.a && this.g) {
            return this.h;
        }
        for (e eVar : this.d) {
            if (eVar.b()) {
                Object e = eVar.e();
                if (this.f.b == null || this.f.b.a(e)) {
                    this.g = true;
                    this.h = e;
                    return e;
                }
            }
        }
        return this.c;
    }
}
