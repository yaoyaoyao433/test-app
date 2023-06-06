package com.meituan.android.privacy.interfaces.def.permission.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.def.permission.a;
import com.meituan.android.privacy.interfaces.def.permission.d;
import com.meituan.android.privacy.interfaces.def.permission.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PermissionResultFrg extends Fragment {
    public static ChangeQuickRedirect a;
    private PermissionGuard b;
    private a c;
    private d d;
    private String e;
    private String f;
    private com.meituan.android.privacy.interfaces.d g;
    private boolean h;
    private Handler i;
    private int j;

    public PermissionResultFrg() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57047c1ab7e7193f3eeb9dd16ba5e5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57047c1ab7e7193f3eeb9dd16ba5e5a");
            return;
        }
        this.h = false;
        this.j = 0;
    }

    public static /* synthetic */ int a(PermissionResultFrg permissionResultFrg, int i) {
        permissionResultFrg.j = 1;
        return 1;
    }

    @RequiresApi(api = 23)
    public static void a(Activity activity, String str, String str2, com.meituan.android.privacy.interfaces.d dVar, d dVar2) {
        Object[] objArr = {activity, str, str2, dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "541411c09d8543245a72c07093188e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "541411c09d8543245a72c07093188e5b");
            return;
        }
        PermissionResultFrg permissionResultFrg = new PermissionResultFrg();
        Bundle bundle = new Bundle();
        bundle.putString(PermissionGuard.PERMISSION_ID, str2);
        bundle.putString("business_id", str);
        bundle.putLong("activity_id", System.identityHashCode(activity));
        permissionResultFrg.setArguments(bundle);
        permissionResultFrg.g = dVar;
        permissionResultFrg.d = dVar2;
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            if (dVar != null) {
                dVar2.a(activity, str, str2, dVar, -17, 0);
                return;
            }
            return;
        }
        Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("permissionFraTag");
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.add(permissionResultFrg, "permissionFraTag");
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    @RequiresApi(api = 23)
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b59ae0ce0a66fd6e4655b076f7b612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b59ae0ce0a66fd6e4655b076f7b612");
            return;
        }
        super.onCreate(bundle);
        if (a()) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getString(PermissionGuard.PERMISSION_ID);
            this.f = arguments.getString("business_id");
        }
        this.b = PermissionGuard.a.a;
        this.c = this.b.getPermission(this.e);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45dc3fd730905f37b2c672c8ffb489ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45dc3fd730905f37b2c672c8ffb489ff");
        } else if (this.c == null) {
            a(-8);
        } else {
            this.i = new Handler() { // from class: com.meituan.android.privacy.interfaces.def.permission.ui.PermissionResultFrg.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(@NonNull Message message) {
                    Object[] objArr3 = {message};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2bed1d5cf1e24dfb619e4e3e61ecfba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2bed1d5cf1e24dfb619e4e3e61ecfba");
                    } else {
                        PermissionResultFrg.a(PermissionResultFrg.this, 1);
                    }
                }
            };
            this.i.sendEmptyMessageDelayed(0, 500L);
            this.d.a(this, this.c.b(), 1001);
        }
    }

    private boolean a() {
        return this.g == null || this.d == null;
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ced19c83074505328f5b713a255534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ced19c83074505328f5b713a255534");
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
            this.d.a(this, i, strArr, iArr);
            if (k.a(getActivity(), strArr, iArr, this.b)) {
                this.b.dispatchGrant(this.e, 2);
                a(2);
                return;
            }
            a(-10);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d81cfe9d5708e94f798b3246acda660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d81cfe9d5708e94f798b3246acda660");
            return;
        }
        this.h = true;
        this.d.a(getActivity(), this.f, this.e, this.g, i, this.j);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677de7587b100d0d5c03fc5ff98a5636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677de7587b100d0d5c03fc5ff98a5636");
            return;
        }
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("permissionFraTag");
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a03d7f69267de1cda1f09c554c2e7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a03d7f69267de1cda1f09c554c2e7fa");
            return;
        }
        if (!this.h && this.g != null && this.d != null) {
            this.d.a(getActivity(), this.f, this.e, this.g, -17, this.j);
        }
        if (this.i != null) {
            this.i.removeCallbacksAndMessages(null);
            this.i = null;
        }
        super.onDestroy();
    }
}
