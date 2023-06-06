package com.meituan.msc.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @Nullable
    private d b;
    private View c;

    public e(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5549577b591605efacbad315f0f92fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5549577b591605efacbad315f0f92fc");
        } else {
            this.c = view;
        }
    }

    private d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c82e539d72d302fb2e2451c7d0775d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c82e539d72d302fb2e2451c7d0775d");
        }
        if (this.b == null) {
            this.b = new d(this.c.getContext());
            Drawable background = this.c.getBackground();
            ViewCompat.setBackground(this.c, null);
            if (background == null) {
                ViewCompat.setBackground(this.c, this.b);
            } else {
                ViewCompat.setBackground(this.c, new LayerDrawable(new Drawable[]{this.b, background}));
            }
        }
        return this.b;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c430950e2f32557c01155c8b72fb003d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c430950e2f32557c01155c8b72fb003d");
        } else if (i == 0 && this.b == null) {
        } else {
            a().a(i);
        }
    }

    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03dc1ad1e0698b9b020d2d854e14e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03dc1ad1e0698b9b020d2d854e14e4e");
        } else {
            a().a(i, f);
        }
    }

    public final void a(int i, float f, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b89bc507bcd1ad106c25045d313891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b89bc507bcd1ad106c25045d313891");
        } else {
            a().a(i, f, f2);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a0b7ccb55bea1395d6726b0f5027c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a0b7ccb55bea1395d6726b0f5027c2");
        } else {
            a().a(f);
        }
    }

    public final void a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab01f005567c438fcb613c1f35339d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab01f005567c438fcb613c1f35339d9e");
        } else {
            a().a(f, i);
        }
    }

    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41741244746c55694f0f6624662e5e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41741244746c55694f0f6624662e5e50");
        } else {
            a().a(str);
        }
    }
}
