package com.dianping.judas;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.app.d;
import android.support.v7.app.h;
import android.support.v7.app.i;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GAAppCompatActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private AppCompatDelegate b;

    @Override // android.support.v7.app.AppCompatActivity
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f880bf64100df44871377b130a7b5f31", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppCompatDelegate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f880bf64100df44871377b130a7b5f31");
        }
        if (this.b == null) {
            Window window = getWindow();
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                dVar = new i(this, window, this);
            } else if (i >= 14) {
                dVar = new h(this, window, this);
            } else {
                dVar = new d(this, window, this);
            }
            this.b = dVar;
        }
        return this.b;
    }
}
