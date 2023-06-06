package com.meituan.roodesign.widgets.internal;

import android.graphics.PorterDuff;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, b bVar);
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        Object[] objArr = {Integer.valueOf(i), mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "344ed5944c11f981b24f5b3bfce31618", RobustBitConfig.DEFAULT_VALUE)) {
            return (PorterDuff.Mode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "344ed5944c11f981b24f5b3bfce31618");
        }
        if (i != 3) {
            if (i != 5) {
                if (i == 9) {
                    return PorterDuff.Mode.SRC_ATOP;
                }
                switch (i) {
                    case 14:
                        return PorterDuff.Mode.MULTIPLY;
                    case 15:
                        return PorterDuff.Mode.SCREEN;
                    case 16:
                        return PorterDuff.Mode.ADD;
                    default:
                        return mode;
                }
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;

        public b(@NonNull b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1e87a7b96f8db55b6300f0c28165c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1e87a7b96f8db55b6300f0c28165c4");
                return;
            }
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
        }
    }
}
