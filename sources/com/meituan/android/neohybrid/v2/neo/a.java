package com.meituan.android.neohybrid.v2.neo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    public com.meituan.android.neohybrid.v2.core.a b;
    protected boolean c;

    public void a(int i, int i2, Intent intent) {
    }

    public void a(@Nullable Bundle bundle) {
    }

    public void a(View view) {
    }

    public void a(com.meituan.android.neohybrid.neo.n nVar) {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public abstract String h();

    public final void a(com.meituan.android.neohybrid.v2.core.a aVar) {
        if (this.b == null) {
            this.b = aVar;
        }
    }

    public final void a() {
        this.b = null;
    }

    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf70143c189a2259fe6f4076feda6fa5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf70143c189a2259fe6f4076feda6fa5")).booleanValue();
        }
        if (z) {
            if (this.b == null || this.b.f() == null) {
                this.c = true;
                return true;
            }
            return false;
        }
        return false;
    }

    public final com.meituan.android.neohybrid.v2.core.a i() {
        return this.b;
    }

    public final NeoConfig j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73573e2ede28408cb1570130116ab4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (NeoConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73573e2ede28408cb1570130116ab4f");
        }
        if (this.b != null) {
            return this.b.f();
        }
        return null;
    }

    public final Activity k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d27dbb477fa6acef368a219c3b58759", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d27dbb477fa6acef368a219c3b58759");
        }
        if (this.b != null) {
            return this.b.d();
        }
        return null;
    }
}
