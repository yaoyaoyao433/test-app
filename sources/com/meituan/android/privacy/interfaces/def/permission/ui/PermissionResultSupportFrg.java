package com.meituan.android.privacy.interfaces.def.permission.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.def.permission.a;
import com.meituan.android.privacy.interfaces.def.permission.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PermissionResultSupportFrg extends Fragment {
    public static ChangeQuickRedirect a;
    private PermissionGuard b;
    private a c;
    private String d;
    private String e;
    private d f;
    private com.meituan.android.privacy.interfaces.def.permission.d g;
    private boolean h;
    private Handler i;
    private int j;

    public PermissionResultSupportFrg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1e97d1ff84c6cf93f08893d169612c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1e97d1ff84c6cf93f08893d169612c");
            return;
        }
        this.h = false;
        this.j = 1;
    }

    public static /* synthetic */ int a(PermissionResultSupportFrg permissionResultSupportFrg, int i) {
        permissionResultSupportFrg.j = 0;
        return 0;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b1dfe554a719e73f9f8c0626799f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b1dfe554a719e73f9f8c0626799f35");
            return;
        }
        super.onCreate(bundle);
        if (a()) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getString(PermissionGuard.PERMISSION_ID);
            this.e = arguments.getString("business_id");
        }
        this.b = PermissionGuard.a.a;
        this.c = this.b.getPermission(this.d);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9dbe94b35f9ba510296b1e49eb92d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9dbe94b35f9ba510296b1e49eb92d48");
        } else if (this.c == null) {
            a(-8);
        } else {
            this.i = new Handler() { // from class: com.meituan.android.privacy.interfaces.def.permission.ui.PermissionResultSupportFrg.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(@NonNull Message message) {
                    Object[] objArr3 = {message};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2901a1df8ad29f039bdc7f9823b9f94e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2901a1df8ad29f039bdc7f9823b9f94e");
                    } else {
                        PermissionResultSupportFrg.a(PermissionResultSupportFrg.this, 0);
                    }
                }
            };
            this.g.a(this, this.c.b(), 1001);
        }
    }

    private boolean a() {
        return this.f == null || this.g == null;
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb8442f472271ddea635a5b95986941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb8442f472271ddea635a5b95986941");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (a()) {
                return;
            }
            if (getActivity() == null || getActivity().isDestroyed() || getActivity().isFinishing()) {
                a(-17);
                return;
            }
            if (this.i != null) {
                this.i.removeCallbacksAndMessages(null);
            }
            this.g.a(this, i, strArr, iArr);
            if (k.a(getActivity(), strArr, iArr, this.b)) {
                this.b.dispatchGrant(this.d, 2);
                a(2);
                return;
            }
            a(-10);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57d91487f29e00d7a0be5c3c4c814c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57d91487f29e00d7a0be5c3c4c814c1");
            return;
        }
        this.h = true;
        this.g.a(getActivity(), this.e, this.d, this.f, i, this.j);
        b();
    }

    private void b() {
        FragmentManager supportFragmentManager;
        Fragment findFragmentByTag;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cabae0d4959d75a46572338640e7e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cabae0d4959d75a46572338640e7e8e");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (findFragmentByTag = (supportFragmentManager = activity.getSupportFragmentManager()).findFragmentByTag("permissionV4FraTag")) == null) {
            return;
        }
        supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0cdc773cac44d3c9dbdb8f0632784af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0cdc773cac44d3c9dbdb8f0632784af");
            return;
        }
        if (!this.h && this.f != null && this.g != null) {
            this.g.a(getActivity(), this.e, this.d, this.f, -17, this.j);
        }
        if (this.i != null) {
            this.i.removeCallbacksAndMessages(null);
            this.i = null;
        }
        super.onDestroy();
    }
}
