package com.sankuai.waimai.bussiness.order.confirm.extra;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    private boolean b;
    private WeakReference<Activity> c;

    public abstract boolean a(Context context);

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a146d6523f1447699d05d3329a91de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a146d6523f1447699d05d3329a91de");
        } else {
            this.c = new WeakReference<>(activity);
        }
    }

    public final void a() {
        if (this.c == null) {
            return;
        }
        this.b = true;
    }

    public final void b() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b79cc5ec0ab22e857d098e238dcbf04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b79cc5ec0ab22e857d098e238dcbf04");
        } else if (this.c == null || (activity = this.c.get()) == null || activity.isFinishing()) {
        } else {
            if (a((Context) activity) && !this.b) {
                activity.finish();
            }
            this.b = false;
        }
    }

    public final void c() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f86eb830e45d7af8857b278a0fc33d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f86eb830e45d7af8857b278a0fc33d");
        } else if (this.c == null || (activity = this.c.get()) == null || activity.isFinishing()) {
        } else {
            if (a((Context) activity)) {
                activity.finish();
            }
            this.c.clear();
        }
    }
}
