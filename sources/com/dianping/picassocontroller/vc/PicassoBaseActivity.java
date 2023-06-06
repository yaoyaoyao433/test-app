package com.dianping.picassocontroller.vc;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.picasso.PicassoView;
import com.dianping.picassocontroller.widget.BaseNavBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class PicassoBaseActivity extends Activity implements android.arch.lifecycle.f {
    public static ChangeQuickRedirect b;
    private android.arch.lifecycle.g a;
    protected g c;

    public String a() {
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd289db468955edd97b7bd577165639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd289db468955edd97b7bd577165639");
            return;
        }
        super.onCreate(bundle);
        this.a = new android.arch.lifecycle.g(this);
        this.a.a(d.a.ON_CREATE);
        this.a.a(d.b.CREATED);
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public android.arch.lifecycle.d getLifecycle() {
        return this.a;
    }

    public final void a(String str, JSONObject jSONObject) {
        String a;
        boolean z = false;
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d80fda2bed700aac4afd7390ab34551b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d80fda2bed700aac4afd7390ab34551b");
            return;
        }
        this.c = new g(this, str, new Point(), jSONObject);
        this.c.i = "__for_playground_only__";
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        g gVar = this.c;
        Object[] objArr2 = {frameLayout};
        ChangeQuickRedirect changeQuickRedirect2 = g.m;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "ca101a258cc83b520f11940412cdd365", RobustBitConfig.DEFAULT_VALUE)) {
            View view = (View) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "ca101a258cc83b520f11940412cdd365");
        } else {
            View inflate = LayoutInflater.from(gVar.b()).inflate(R.layout.layout_pcs_base, frameLayout);
            PicassoView picassoView = (PicassoView) inflate.findViewById(R.id.picasso_view);
            picassoView.setAllowResize(false);
            picassoView.setAutoAdjust(true);
            gVar.a(picassoView);
            gVar.x = (BaseNavBar) inflate.findViewById(R.id.pcs_nav);
        }
        this.c.d();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a3602915df3ee8e61cd77d2d57c4e91", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a3602915df3ee8e61cd77d2d57c4e91")).booleanValue();
        } else if (!TextUtils.isEmpty(a())) {
            z = true;
        }
        if (!z || (a = a()) == null) {
            return;
        }
        com.dianping.picassocontroller.debug.c.a().a(a);
    }

    @Override // android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b9c44336a26ed2fb9b9bfa257fcb7e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b9c44336a26ed2fb9b9bfa257fcb7e4");
            return;
        }
        super.onStart();
        this.a.a(d.a.ON_START);
        this.a.a(d.b.STARTED);
    }

    @Override // android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87c4fe55029acb810413fce58e650cbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87c4fe55029acb810413fce58e650cbe");
            return;
        }
        super.onResume();
        this.c.j();
        this.a.a(d.a.ON_RESUME);
        this.a.a(d.b.RESUMED);
    }

    @Override // android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34eaa6b9af0442fbc5854df6ac831c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34eaa6b9af0442fbc5854df6ac831c28");
            return;
        }
        super.onPause();
        g gVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.m;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "863e9eb0e62e97d67295995b8431cc7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "863e9eb0e62e97d67295995b8431cc7a");
        } else {
            com.dianping.picassocontroller.jse.b.a(gVar, "dispatchOnDisappear", new Object[0]);
        }
        this.a.a(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d770ff06c659ae1b63066c3700750dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d770ff06c659ae1b63066c3700750dea");
            return;
        }
        super.onStop();
        this.a.a(d.a.ON_STOP);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d440f207a8b1841ded15b0a6818625a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d440f207a8b1841ded15b0a6818625a");
            return;
        }
        this.c.a("dispatchOnBackPressed", new Object[0]);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969e4d8f97cbfb6c94a1048a58f0b10a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969e4d8f97cbfb6c94a1048a58f0b10a");
            return;
        }
        super.onDestroy();
        this.c.e();
        this.c.x = null;
        this.a.a(d.a.ON_DESTROY);
        this.a.a(d.b.DESTROYED);
    }

    public final String a(String str) {
        Uri data;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8085198de7e2101286f111a34497d4a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8085198de7e2101286f111a34497d4a3");
        }
        String a = com.sankuai.waimai.platform.utils.f.a(getIntent(), str);
        return (!TextUtils.isEmpty(a) || (data = getIntent().getData()) == null) ? a : data.getQueryParameter(str);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced9243998381f277bfe63b2e13a34d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced9243998381f277bfe63b2e13a34d9");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        this.c.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }
}
