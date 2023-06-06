package com.meituan.android.privacy.impl.permission;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.privacy.impl.config.d;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.def.permission.Sys;
import com.meituan.android.privacy.interfaces.def.permission.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PermissionGuardDialogActivity extends PermissionGuardDialogBaseAct {
    public static ChangeQuickRedirect a;
    private boolean t;

    public PermissionGuardDialogActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c546203e400cfcb17ea5d38c7efad8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c546203e400cfcb17ea5d38c7efad8b");
        } else {
            this.t = false;
        }
    }

    public static void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d318c8cc532c68260868763a8182b928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d318c8cc532c68260868763a8182b928");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("imeituan://www.meituan.com/permission/dialog"));
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
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a33cf0eab9e968b458a94595f582f74c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a33cf0eab9e968b458a94595f582f74c");
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
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9433b390c28a025318b9a20b601a801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9433b390c28a025318b9a20b601a801");
            return;
        }
        com.meituan.android.privacy.impl.config.d a2 = com.meituan.android.privacy.impl.config.d.a(this);
        String str2 = this.q;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.privacy.impl.config.d.a;
        d.a a3 = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b5da70eeed70742bfaf30bb687171a4c", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b5da70eeed70742bfaf30bb687171a4c") : a2.c.a(str2);
        if (a3 != null) {
            this.g.setText(a3.b);
            TextView textView = this.i;
            String f = this.n.f();
            Object[] objArr4 = {f};
            ChangeQuickRedirect changeQuickRedirect4 = d.a.a;
            if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "f723e96b6a4f9fec2a9946a9c5e7768d", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "f723e96b6a4f9fec2a9946a9c5e7768d");
            } else {
                str = (a3.c == null || a3.c.size() <= 0 || !a3.c.containsKey(f)) ? "" : a3.c.get(f);
            }
            textView.setText(str);
        }
        this.h.setText(this.n.e);
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
        boolean z;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fbc43a75ea07eb011b29fa2515e6ef", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fbc43a75ea07eb011b29fa2515e6ef");
            return;
        }
        int id = view.getId();
        if (id == R.id.refuse_tv) {
            a(-9, false);
            a(a.b.intValue());
            a(true);
        } else if (id != R.id.agree_tv) {
            if (id == R.id.select_layout) {
                if (!this.t) {
                    this.t = true;
                    this.l.setImageDrawable(getResources().getDrawable(R.drawable.icon_checked));
                    return;
                }
                this.t = false;
                this.l.setImageDrawable(getResources().getDrawable(R.drawable.icon_unchecked));
            }
        } else {
            if (this.n == null) {
                a(-8, false);
                z = true;
            } else {
                z = false;
            }
            if (this.n.b() == null) {
                a(2, false);
                z = true;
            }
            a(a.c.intValue());
            if (z) {
                a(true);
                return;
            }
            a(false);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2ea7f3610e6562e118a6b48b8d74229", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2ea7f3610e6562e118a6b48b8d74229");
                return;
            }
            d a2 = d.a();
            String[] b = this.n.b();
            Object[] objArr3 = {this, b, 1001};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f96afe0577a3ec7022926e629f702aa0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f96afe0577a3ec7022926e629f702aa0");
                return;
            }
            Sys sys = a2.c;
            Object[] objArr4 = {this, b, 1001};
            ChangeQuickRedirect changeQuickRedirect4 = Sys.c;
            if (PatchProxy.isSupport(objArr4, sys, changeQuickRedirect4, false, "1ca50b66c84a7325b6dca54efe1ac504", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, sys, changeQuickRedirect4, false, "1ca50b66c84a7325b6dca54efe1ac504");
            } else {
                ActivityCompat.requestPermissions(this, b, 1001);
            }
        }
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4045ce45bad25a795ce27424ec537d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4045ce45bad25a795ce27424ec537d35");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.privacy.impl.permission.PermissionGuardDialogActivity.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adc7c78befb92d8b25f2e665abcacede", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adc7c78befb92d8b25f2e665abcacede");
                    } else {
                        a.a(PermissionGuardDialogActivity.this.getApplicationContext()).a(PermissionGuardDialogActivity.this.q).a(PermissionGuardDialogActivity.this.n.f(), Integer.valueOf(i));
                    }
                }
            });
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4fce959568062d828031d7b922b25e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4fce959568062d828031d7b922b25e1");
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (k.a(this, strArr, iArr, this.m)) {
            a(2, true);
        } else {
            a(-10, true);
        }
    }
}
