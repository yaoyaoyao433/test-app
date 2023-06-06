package com.meituan.android.privacy.impl.permission;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppGuardPermissionDialogAct extends PermissionGuardDialogBaseAct {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d6628312b8443966b34353f99ca3651", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d6628312b8443966b34353f99ca3651");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("imeituan://www.meituan.com/appguard/dialog"));
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("business_id", str);
            intent.putExtra(PermissionGuard.PERMISSION_ID, str2);
            intent.putExtra("activity_id", System.identityHashCode(activity));
            intent.setFlags(y.a);
            intent.setPackage(activity.getPackageName());
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.android.privacy.impl.permission.PermissionGuardDialogBaseAct
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2526773a654aa78d382312fa953a1ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2526773a654aa78d382312fa953a1ede");
            return;
        }
        try {
            this.p = com.sankuai.waimai.platform.utils.f.a(getIntent(), PermissionGuard.PERMISSION_ID);
            this.q = com.sankuai.waimai.platform.utils.f.a(getIntent(), "business_id");
            this.r = com.sankuai.waimai.platform.utils.f.a(getIntent(), "activity_id", -1);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
        this.s = d.a().a(this.r);
        if (this.s == null) {
            finish();
            return;
        }
        this.m = PermissionGuard.a.a;
        this.n = this.m.getPermission(this.p);
        com.meituan.android.privacy.interfaces.config.a a2 = com.meituan.android.privacy.impl.config.d.a(this).a(this.p);
        String str = "";
        try {
            str = getResources().getString(getPackageManager().getPackageInfo(getPackageName(), 128).applicationInfo.labelRes);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.g.setText(str);
        this.h.setText(a2.d);
        this.i.setText(a2.e);
        if (this.m.getInitConfig() != null) {
            this.m.getInitConfig();
            ImageView imageView = this.j;
            Resources resources = getResources();
            this.m.getInitConfig();
            imageView.setImageDrawable(resources.getDrawable(R.drawable.wm_ic_launcher));
        }
    }

    @Override // com.meituan.android.privacy.impl.permission.PermissionGuardDialogBaseAct, android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5fdf637e57ea816f6b50fe0cf2c9b06", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5fdf637e57ea816f6b50fe0cf2c9b06");
            return;
        }
        super.onClick(view);
        int id = view.getId();
        if (id == R.id.refuse_tv) {
            a(-10, false);
            a(a.b.intValue());
            a(true);
        } else if (id == R.id.agree_tv) {
            a(2, false);
            a(a.c.intValue());
            a(true);
        }
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347efbe9761a6ba1d1bc053612dad85e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347efbe9761a6ba1d1bc053612dad85e");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.privacy.impl.permission.AppGuardPermissionDialogAct.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01b4e53c290f99d60d5342e82aebaff0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01b4e53c290f99d60d5342e82aebaff0");
                    } else {
                        a.a(AppGuardPermissionDialogAct.this.getApplicationContext()).b(AppGuardPermissionDialogAct.this.p).a(AppGuardPermissionDialogAct.this.n.f(), Integer.valueOf(i));
                    }
                }
            });
        }
    }
}
