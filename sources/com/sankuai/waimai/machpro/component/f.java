package com.sankuai.waimai.machpro.component;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private static final int c = ViewConfiguration.getDoubleTapTimeout();
    boolean b;
    private MPComponent d;
    private long e;
    private long f;
    private Handler g;
    private Runnable h;

    public f(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba898430346253f72cb03519cbe116a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba898430346253f72cb03519cbe116a");
            return;
        }
        this.h = new Runnable() { // from class: com.sankuai.waimai.machpro.component.f.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "694cdbd4e1027ee1cf124ffc88620b86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "694cdbd4e1027ee1cf124ffc88620b86");
                } else {
                    f.this.a();
                }
            }
        };
        this.d = mPComponent;
        this.g = new Handler(Looper.getMainLooper());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c06fd8e89bb6a6be8fb4e4c3c8696c3a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c06fd8e89bb6a6be8fb4e4c3c8696c3a");
        } else if (!this.b) {
            a();
        } else {
            this.e = this.f;
            this.f = System.currentTimeMillis();
            if (this.f - this.e < c) {
                this.f = 0L;
                this.e = 0L;
                this.g.removeCallbacks(this.h);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "625878a0b844f901b7fdd838c8dde8c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "625878a0b844f901b7fdd838c8dde8c0");
                    return;
                } else if (this.d != null) {
                    this.d.dispatchEvent("doubleClick", null);
                    return;
                } else {
                    return;
                }
            }
            this.g.postDelayed(this.h, c + 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a558b06561d79b95b31d767b371f461d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a558b06561d79b95b31d767b371f461d");
        } else if (this.d != null) {
            this.d.dispatchEvent("click", null);
            if (this.d.isAccessibilityClick()) {
                this.d.dispatchEvent("accessibilityClick", null);
            }
        }
    }
}
