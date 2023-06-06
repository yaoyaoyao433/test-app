package com.sankuai.waimai.business.restaurant.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Lifecycle {
    public static ChangeQuickRedirect f;
    private boolean a;
    int g;
    i h;
    public a i;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface State {
    }

    @CallSuper
    public void a(int i, int i2) {
    }

    public Lifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da936cef3b2e0a1992d15aa1087e9df8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da936cef3b2e0a1992d15aa1087e9df8");
            return;
        }
        this.g = 0;
        this.a = false;
    }

    public final Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4dd186b429590d3528dfee11a6c7862", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4dd186b429590d3528dfee11a6c7862");
        }
        if (this.h == null) {
            return null;
        }
        return this.h.b;
    }

    public final Activity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e49a384ad76235d32dad0567521fc63", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e49a384ad76235d32dad0567521fc63");
        }
        Context b = b();
        if (b instanceof Activity) {
            return (Activity) b;
        }
        return null;
    }

    @Nullable
    public final <T extends f> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea485c089b32c92ba993d653fd65d34", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea485c089b32c92ba993d653fd65d34");
        }
        if (this.h == null) {
            return null;
        }
        return (T) this.h.a((Class<f>) cls);
    }

    public final boolean d() {
        return this.g > 0;
    }

    public final void a(i iVar, a aVar, int i) {
        Object[] objArr = {iVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64417f22814146d6eba800310ef3c790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64417f22814146d6eba800310ef3c790");
        } else if (i < 0 || i > 4) {
        } else {
            if (i > this.g) {
                while (i > this.g) {
                    int i2 = this.g;
                    int i3 = i2 + 1;
                    this.a = false;
                    switch (i2) {
                        case 0:
                            a(iVar, aVar);
                            break;
                        case 1:
                            a(iVar.d);
                            break;
                        case 2:
                            e();
                            break;
                        case 3:
                            f();
                            break;
                        default:
                            a("SyncState: mState = " + this.g);
                            break;
                    }
                    if (!this.a) {
                        a("生命周期方法需要调用super");
                        return;
                    } else {
                        this.g = i3;
                        a(i2, i3);
                    }
                }
            } else if (i < this.g) {
                while (i < this.g) {
                    int i4 = this.g;
                    int i5 = i4 - 1;
                    a(i4, i5);
                    this.g = i5;
                    this.a = false;
                    switch (i4) {
                        case 1:
                            i();
                            break;
                        case 2:
                            aB_();
                            break;
                        case 3:
                            h();
                            break;
                        case 4:
                            g();
                            break;
                        default:
                            a("sync state: mState = " + this.g);
                            break;
                    }
                    if (!this.a) {
                        a("生命周期方法需要调用super");
                    }
                }
            }
        }
    }

    @CallSuper
    public void a(i iVar, a aVar) {
        this.h = iVar;
        this.i = aVar;
        this.a = true;
    }

    @CallSuper
    private void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8490c51702f34973df24f3eb27a4fa5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8490c51702f34973df24f3eb27a4fa5d");
            return;
        }
        this.h.a(this);
        this.a = true;
    }

    @CallSuper
    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d3f98d739443d3f9a95392c14d7bb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d3f98d739443d3f9a95392c14d7bb5");
        } else {
            this.a = true;
        }
    }

    @CallSuper
    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3a3093f4e9590f8bba26c892044c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3a3093f4e9590f8bba26c892044c6c");
        } else {
            this.a = true;
        }
    }

    @CallSuper
    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84ee6e63faaeebc856ae6ec78083611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84ee6e63faaeebc856ae6ec78083611");
        } else {
            this.a = true;
        }
    }

    @CallSuper
    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e3f20aaf30b8def391803258676853", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e3f20aaf30b8def391803258676853");
        } else {
            this.a = true;
        }
    }

    @CallSuper
    public void aB_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2818d1ce1432c1c12008b4ea901f517e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2818d1ce1432c1c12008b4ea901f517e");
            return;
        }
        this.h.b(this);
        this.a = true;
    }

    @CallSuper
    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d7239c39524088d8f493ff17f351f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d7239c39524088d8f493ff17f351f2");
            return;
        }
        this.h = null;
        this.i = null;
        this.a = true;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c818645dab0aa1f7ea1402954ff8bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c818645dab0aa1f7ea1402954ff8bfe");
        } else {
            com.sankuai.waimai.foundation.core.exception.a.b(new RuntimeException(str));
        }
    }
}
