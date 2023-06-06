package com.sankuai.xm.imui.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.x;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.theme.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BaseActivity extends AppCompatActivity implements c.a {
    public static ChangeQuickRedirect a;
    protected a b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void onActivityResult(int i, int i2, Intent intent);
    }

    @Override // com.sankuai.xm.imui.theme.c.a
    public void a(com.sankuai.xm.imui.theme.b bVar) {
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acf758c05580ef7584e8ac6465d7bc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acf758c05580ef7584e8ac6465d7bc4");
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 21) {
            AppCompatDelegate.a(true);
        }
        String name = getClass().getName();
        int a2 = com.sankuai.xm.imui.common.report.b.a(name);
        com.sankuai.xm.imui.common.report.b.a(com.sankuai.xm.imui.common.report.b.a(name), name);
        com.sankuai.xm.log.c.b("ui_active", "%s::onCreate::%s %s", name, Integer.valueOf(a2), name);
        if (!IMUIManager.a().p()) {
            d.b("IM is not init yet", new Object[0]);
            finish();
        }
        c.a().a(this);
        getResources();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7222625a26e4c2647e8819e71dc4b752", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7222625a26e4c2647e8819e71dc4b752");
        } else {
            super.attachBaseContext(com.sankuai.xm.base.util.locale.a.a(context, com.sankuai.xm.base.util.locale.b.a(context).a()));
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511d2107cea15877f6037c4c337a2652", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511d2107cea15877f6037c4c337a2652");
            return;
        }
        super.onDestroy();
        c.a().b(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6744967c5e5901701c53e7e27c6a3631", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6744967c5e5901701c53e7e27c6a3631");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (this.b != null) {
            this.b.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStateNotSaved() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426af538a78b6a970b8a0842dfb3c040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426af538a78b6a970b8a0842dfb3c040");
            return;
        }
        super.onStateNotSaved();
        x.a(getFragmentManager(), "noteStateNotSaved", (Class[]) null, (Object[]) null);
    }
}
