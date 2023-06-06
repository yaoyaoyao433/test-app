package com.meituan.android.cube.core;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    View b;
    Context c;
    ViewGroup d;
    f e;
    boolean f;

    public d(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8ff4e0fa462bf06b0ae6eafe77a355", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8ff4e0fa462bf06b0ae6eafe77a355");
        } else {
            this.e = fVar;
        }
    }

    public final <T extends f> T a(@NonNull ViewGroup viewGroup, @NonNull T t, boolean z) {
        Object[] objArr = {viewGroup, t, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949cbdc802a59822a3d99ecf2f5fc8fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949cbdc802a59822a3d99ecf2f5fc8fa");
        }
        if (viewGroup.getChildCount() <= 0 || !z) {
            t.d.d = viewGroup;
            t.d.f = z;
            return t;
        }
        return null;
    }
}
