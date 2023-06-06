package com.sankuai.waimai.ugc.creator.framework;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Lifecycle {
    public static ChangeQuickRedirect w;
    protected String x;
    int y;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface State {
    }

    @CallSuper
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f223cefa4e45d039b20fe566e0e511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f223cefa4e45d039b20fe566e0e511");
        }
    }

    @CallSuper
    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39c5c4ea2258aaad6ce2c8bba54feca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39c5c4ea2258aaad6ce2c8bba54feca");
        }
    }

    @CallSuper
    public void a(e eVar) {
    }

    @CallSuper
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588835b7c445e0fbe24d6d318cbde975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588835b7c445e0fbe24d6d318cbde975");
        }
    }

    @CallSuper
    public void b(int i, int i2) {
    }

    @CallSuper
    public void bM_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6917f8efedbf068836609bd4baadbee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6917f8efedbf068836609bd4baadbee0");
        }
    }

    @CallSuper
    public void bN_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "471cb444c37efeccdefb0bba36baee3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "471cb444c37efeccdefb0bba36baee3c");
        }
    }

    @CallSuper
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a6c1427bcc51cbe00acc1bd7659c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a6c1427bcc51cbe00acc1bd7659c0f");
        }
    }

    @CallSuper
    public void y() {
    }

    @CallSuper
    public void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f540f8a6e7f40c147cf09207c1a42d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f540f8a6e7f40c147cf09207c1a42d6");
        }
    }

    public Lifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac16218491e0050b1cdc00ee369914b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac16218491e0050b1cdc00ee369914b");
            return;
        }
        this.x = getClass().getSimpleName();
        this.y = 0;
    }

    public final boolean E() {
        return this.y > 0;
    }

    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48fa4922b6e3f2f83942040fdcd5383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48fa4922b6e3f2f83942040fdcd5383");
        } else if (i < 0 || i > 4) {
        } else {
            if (i > this.y) {
                while (i > this.y) {
                    int i2 = this.y;
                    int i3 = i2 + 1;
                    this.y = i3;
                    switch (i2) {
                        case 0:
                            a(eVar);
                            break;
                        case 1:
                            a(eVar.d);
                            y();
                            break;
                        case 2:
                            bM_();
                            break;
                        case 3:
                            a();
                            break;
                        default:
                            c("SyncState: mState = " + this.y);
                            break;
                    }
                    b(i2, i3);
                }
            } else if (i < this.y) {
                while (i < this.y) {
                    int i4 = this.y;
                    int i5 = i4 - 1;
                    b(i4, i5);
                    this.y = i5;
                    switch (i4) {
                        case 1:
                            z();
                            break;
                        case 2:
                            b();
                            break;
                        case 3:
                            bN_();
                            break;
                        case 4:
                            o();
                            break;
                        default:
                            c("sync state: mState = " + this.y);
                            break;
                    }
                }
            }
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c44fef25a24d9b2c390f9dd2747a9ec", RobustBitConfig.DEFAULT_VALUE)) {
            throw new IllegalStateException(str);
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c44fef25a24d9b2c390f9dd2747a9ec");
    }
}
