package com.meituan.android.cube.core;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final List<f> b;
    final f c;

    public c(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd8f482a943f0dddde02ae604559a66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd8f482a943f0dddde02ae604559a66");
            return;
        }
        this.b = new ArrayList();
        this.c = fVar;
    }

    public final <T extends f> void a(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc1f1a868bb82b95942e93eb2467713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc1f1a868bb82b95942e93eb2467713");
        } else if (t.h()) {
        } else {
            this.b.add(t);
            if (t instanceof h) {
                return;
            }
            b bC_ = this.c.bC_();
            f fVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            t.a(bC_, PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "04f7dc84d40dd0db9203117456a06dd2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "04f7dc84d40dd0db9203117456a06dd2")).intValue() : fVar.c.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> boolean a(@NonNull List<T> list, f fVar, Class<T> cls, boolean z) {
        Object[] objArr = {list, fVar, cls, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4f03b50b67caf0e92c1d4149dbc458", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4f03b50b67caf0e92c1d4149dbc458")).booleanValue();
        }
        if (cls.isInstance(fVar)) {
            list.add(fVar);
            if (z) {
                return true;
            }
        }
        if (!fVar.n().isEmpty()) {
            for (f fVar2 : fVar.n()) {
                if (a(list, fVar2, cls, z)) {
                    return true;
                }
            }
        }
        return false;
    }
}
