package com.meituan.android.yoda.fragment;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.bean.Prompt;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.interfaces.j;
import com.meituan.android.yoda.model.b;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.aa;
import com.meituan.android.yoda.util.o;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseFragment extends Fragment implements b.InterfaceC0379b {
    public static ChangeQuickRedirect a;
    protected Handler b;
    protected String c;
    protected String d;
    protected String e;
    protected com.meituan.android.yoda.data.a f;
    public IYodaVerifyListener g;
    public com.meituan.android.yoda.interfaces.f<Integer> h;
    public com.meituan.android.yoda.interfaces.i i;
    protected com.meituan.android.yoda.interfaces.h<YodaResult> j;
    public boolean k;
    int l;
    public com.meituan.android.yoda.config.verify.a m;
    com.meituan.android.yoda.monitor.a n;
    private b.c o;
    private Error p;
    private long q;
    private String r;
    private boolean s;
    private String t;

    public View a(@NonNull View view, @IdRes int i, String str, com.meituan.android.yoda.interfaces.e eVar) {
        return null;
    }

    public abstract void a(boolean z);

    public abstract void b(String str);

    public abstract void b(String str, Error error);

    public abstract void b(String str, String str2);

    public abstract void c(String str, int i, @Nullable Bundle bundle);

    public abstract void d(String str, int i, @Nullable Bundle bundle);

    public abstract String e();

    public abstract void f();

    public abstract int g();

    public void h(String str) {
    }

    public BaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736db2da454953b1c025a88a2d7db4af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736db2da454953b1c025a88a2d7db4af");
            return;
        }
        this.o = new b.c();
        this.b = new Handler();
        this.p = null;
        this.q = 0L;
        this.s = true;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e8b249afcc5a01744e4cc5b717339b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e8b249afcc5a01744e4cc5b717339b");
            return;
        }
        super.onCreate(bundle);
        this.c = getClass().getSimpleName();
        this.d = getArguments().getString(OtherVerifyTypeConstants.REQUEST_CODE);
        d(this.d);
        this.t = this.c + this.d;
        this.n = new com.meituan.android.yoda.monitor.b(getRequestCode(), com.meituan.android.yoda.util.b.a(getActivity()));
        this.f = com.meituan.android.yoda.data.b.a(this.d);
        if (c()) {
            String str = this.c;
            com.meituan.android.yoda.monitor.log.a.a(str, "onCreate, activity is finishing. requestCode = " + this.d, true);
        } else if (this.f == null) {
            x.a(getActivity(), x.a((int) R.string.yoda_quit_and_retry));
            b.a.a().a("mCallPackage is null", this, null);
            String str2 = this.c;
            com.meituan.android.yoda.monitor.log.a.a(str2, "onCreate, page data context error. requestCode = " + this.d, true);
        } else {
            this.e = String.valueOf(this.f.c.data.get("action"));
            this.r = AppUtil.generatePageInfoKey(this);
            Statistics.addPageInfo(this.r, e());
            e(this.e).a(this.l).f(e()).g(this.r);
            if (getParentFragment() == null) {
                setRetainInstance(true);
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) getActivity().getSystemService("accessibility");
            if (accessibilityManager != null) {
                this.k = accessibilityManager.isTouchExplorationEnabled();
            }
            String str3 = this.c;
            com.meituan.android.yoda.monitor.log.a.a(str3, "onCreate, savedInstanceState = " + bundle + ", requestCode = " + this.d, true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc6cf21ebdfcda6dd971106b155cc81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc6cf21ebdfcda6dd971106b155cc81");
            return;
        }
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onViewCreated, requestCode = " + this.d, true);
        j();
        super.onViewCreated(view, bundle);
        l();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e6a93e430b1425503640b9b5bd9f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e6a93e430b1425503640b9b5bd9f01");
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfef639b913c2cdcff2b830abef21ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfef639b913c2cdcff2b830abef21ffe");
            return;
        }
        super.onHiddenChanged(z);
        a(!z ? 1 : 0);
        if (!z) {
            l();
        }
        if (z) {
            k();
        } else {
            j();
        }
        if (z || this.p == null) {
            return;
        }
        d();
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff17fbd8e578cb12f42c0756003d9348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff17fbd8e578cb12f42c0756003d9348");
        } else {
            super.setUserVisibleHint(z);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2e8b056d6e1d94a805655bf9baa816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2e8b056d6e1d94a805655bf9baa816");
            return;
        }
        super.onPause();
        k();
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onPause, requestCode = " + this.d, true);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73f5558eb530f6404629c6375d69d0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73f5558eb530f6404629c6375d69d0c");
            return;
        }
        super.onDestroyView();
        k();
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onDestroyView, requestCode = " + this.d, true);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364a016c70c33f76818fb65e31b5bb00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364a016c70c33f76818fb65e31b5bb00");
            return;
        }
        super.onDestroy();
        f();
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onDestroy, requestCode = " + this.d, true);
    }

    public final void a(Bundle bundle, @NonNull IYodaVerifyListener iYodaVerifyListener, com.meituan.android.yoda.interfaces.f<Integer> fVar, com.meituan.android.yoda.config.verify.a aVar, int i) {
        Object[] objArr = {bundle, iYodaVerifyListener, fVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7eb6f582e63229e4de97d409037fc92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7eb6f582e63229e4de97d409037fc92");
            return;
        }
        setArguments(bundle);
        this.g = iYodaVerifyListener;
        this.h = fVar;
        this.l = i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.i = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9185e8c2a0b6ea08a9eca5a89b69d9c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.yoda.interfaces.i) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9185e8c2a0b6ea08a9eca5a89b69d9c") : new com.meituan.android.yoda.interfaces.i() { // from class: com.meituan.android.yoda.fragment.BaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.i
            public final void a(String str, int i2, @Nullable Bundle bundle2) {
                Object[] objArr3 = {str, Integer.valueOf(i2), bundle2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e3f691947218737ba9c016395fe7c9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e3f691947218737ba9c016395fe7c9a");
                } else {
                    BaseFragment.this.a(str, i2, bundle2);
                }
            }

            @Override // com.meituan.android.yoda.interfaces.i
            public final void b(String str, int i2, @Nullable Bundle bundle2) {
                Object[] objArr3 = {str, Integer.valueOf(i2), null};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e715397d483541f5acb6664bf7583fb7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e715397d483541f5acb6664bf7583fb7");
                } else {
                    BaseFragment.this.b(str, i2, null);
                }
            }

            @Override // com.meituan.android.yoda.interfaces.i
            public final void a(String str, String str2) {
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25177d71cf89bbb203efdd8a61525eb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25177d71cf89bbb203efdd8a61525eb9");
                } else {
                    BaseFragment.this.a(str, str2);
                }
            }

            @Override // com.meituan.android.yoda.interfaces.i
            public final void a(String str, Error error) {
                Object[] objArr3 = {str, error};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab5c4e26de877790b242debdd2be613c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab5c4e26de877790b242debdd2be613c");
                } else {
                    BaseFragment.this.a(str, error);
                }
            }
        };
        this.j = new com.meituan.android.yoda.callbacks.f(iYodaVerifyListener, this.i, true);
        this.m = aVar;
    }

    public void a(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d89402e817de8ade89f662a8cdf8ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d89402e817de8ade89f662a8cdf8ebb");
            return;
        }
        com.meituan.android.yoda.network.a a2 = com.meituan.android.yoda.network.a.a();
        a2.a(this.c + " info", this.l, this.e, this.d, String.valueOf(this.f != null ? this.f.e : 0), this.k, hashMap, hVar);
    }

    public void b(HashMap<String, String> hashMap, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c69abc9dffa2ce04c1207d38f0ee1df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c69abc9dffa2ce04c1207d38f0ee1df");
            return;
        }
        com.meituan.android.yoda.network.a a2 = com.meituan.android.yoda.network.a.a();
        a2.b(this.c + " verify", this.l, this.e, this.d, String.valueOf(this.f != null ? this.f.e : 0), this.k, hashMap, hVar);
    }

    public void a(HashMap<String, String> hashMap, File file, String str, com.meituan.android.yoda.interfaces.h<YodaResult> hVar) {
        Object[] objArr = {hashMap, file, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b483479e1dab499e6f2c25ed53a984f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b483479e1dab499e6f2c25ed53a984f");
            return;
        }
        com.meituan.android.yoda.network.a a2 = com.meituan.android.yoda.network.a.a();
        a2.a(this.c + " verify", this.l, this.e, this.d, String.valueOf(this.f != null ? this.f.e : 0), file, str, this.k, hashMap, hVar);
    }

    public final void a(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2a4af792c390d210b9a6796d87dac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2a4af792c390d210b9a6796d87dac5");
            return;
        }
        String str2 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str2, "handleVerifyListSwitch, requestCode = " + str + ", listIndex = " + i, true);
        c(str, i, bundle);
        if (getActivity() instanceof j) {
            ((j) getActivity()).a(str, i, bundle);
        }
    }

    public final void b(String str, int i, @Nullable Bundle bundle) {
        Object[] objArr = {str, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e625e80277ddc78fbac3923c82992c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e625e80277ddc78fbac3923c82992c5");
            return;
        }
        String str2 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str2, "handleNextVerify, requestCode = " + str + ", nextType = " + i, true);
        d(str, i, bundle);
        if (getActivity() instanceof j) {
            ((j) getActivity()).b(str, i, bundle);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18383ac996748716fe1c90c6e197d061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18383ac996748716fe1c90c6e197d061");
            return;
        }
        String str3 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str3, "handleVerifySuccess, requestCode = " + str + ", responseCode = " + str2, true);
        b(str, str2);
        this.g.onSuccess(str, str2);
    }

    public final void a(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73725873c7892a315c4a77aaec01b14d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73725873c7892a315c4a77aaec01b14d");
            return;
        }
        String str2 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str2, "handleVerifyError, requestCode = " + str + ", error = " + error.toString(), true);
        com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(this.d);
        if (com.meituan.android.yoda.config.a.b(error) && a2.f.b()) {
            a(error.requestCode);
        } else {
            b(str, error);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87821638e08a045b267b0a580e4c60a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87821638e08a045b267b0a580e4c60a5");
            return;
        }
        String str2 = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str2, "handleProtectedVerify, requestCode = " + str, true);
        b(str);
        if (getActivity() instanceof j) {
            com.meituan.android.yoda.monitor.report.b.a(this.d, str);
            ((j) getActivity()).a(str);
        }
    }

    public boolean a(String str, Error error, boolean z) {
        Object[] objArr = {str, error, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08abd8356cf19d9cd66f2930c69b73b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08abd8356cf19d9cd66f2930c69b73b5")).booleanValue();
        }
        if (error != null && this.g != null) {
            if (com.meituan.android.yoda.config.a.a(error.code, this.d)) {
                a(error);
                a(a.a(this, str, error), 1500L);
                return true;
            } else if (!z) {
                this.p = error;
                d();
                return true;
            }
        }
        a(error);
        return false;
    }

    public static /* synthetic */ void a(BaseFragment baseFragment, String str, Error error) {
        Object[] objArr = {baseFragment, str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "509627dc6ee203e177716ff5238f8d19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "509627dc6ee203e177716ff5238f8d19");
        } else {
            baseFragment.g.onError(str, error);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6096550101da2f0e09d443b1121611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6096550101da2f0e09d443b1121611");
        } else if (this.h != null) {
            this.h.a(0);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c270d8213089472fd2c494db097a507d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c270d8213089472fd2c494db097a507d");
        } else if (this.h != null) {
            this.h.a(1);
        }
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f44242bc4ef4ccf74e9c1733018b49d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f44242bc4ef4ccf74e9c1733018b49d")).booleanValue() : y.a((Activity) getActivity());
    }

    public boolean c(String str, Error error) {
        Object[] objArr = {str, error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e737860b08c60c26f81c0e0aa7c4e16c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e737860b08c60c26f81c0e0aa7c4e16c")).booleanValue();
        }
        if (error == null || !com.meituan.android.yoda.config.a.b(error.code)) {
            return false;
        }
        a(error);
        return true;
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32137334d065ad960cbf9ddb324b02f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32137334d065ad960cbf9ddb324b02f");
        } else {
            this.b.post(runnable);
        }
    }

    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d9a5ba5a8ddb6a219d4bb2ce8d9c26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d9a5ba5a8ddb6a219d4bb2ce8d9c26");
        } else {
            this.b.postDelayed(runnable, j);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2635d51f9d98f59c9e191d3ffb738c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2635d51f9d98f59c9e191d3ffb738c9b");
        } else if (isAdded() && this.p != null) {
            if (this.p.code == 1210000) {
                this.p.message = x.a((int) R.string.yoda_net_check_error_tips);
            }
            InfoErrorFragment.i(this.p.message);
            InfoErrorFragment.b(this.l);
            this.i.b(this.d, 2147483642, null);
        }
    }

    public void a(Error error) {
        Object[] objArr = {error};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7678adbf40876c82ee792f718c0dea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7678adbf40876c82ee792f718c0dea1");
        } else if (error != null && TextUtils.isEmpty(error.requestCode)) {
            if (com.meituan.android.yoda.config.a.a(error)) {
                x.a(getActivity(), (int) R.string.yoda_error_net);
            } else {
                x.a(getActivity(), error.message);
            }
        }
    }

    public void a(Button button) {
        Object[] objArr = {button};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d46569fa3f638c9efd00b99c5a4a67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d46569fa3f638c9efd00b99c5a4a67");
        } else if (button == null) {
        } else {
            if (com.meituan.android.yoda.config.ui.d.a().r()) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                try {
                    String p = com.meituan.android.yoda.config.ui.d.a().p();
                    int b = x.b(p, 2);
                    if (b != -1) {
                        stateListDrawable.addState(new int[]{16842919, 16842910}, new ColorDrawable(b));
                        stateListDrawable.addState(new int[]{-16842910}, new ColorDrawable(x.b(p, 3)));
                        stateListDrawable.addState(new int[]{-16842919, 16842910}, new ColorDrawable(x.b(p, 1)));
                        button.setBackground(stateListDrawable);
                    }
                } catch (Exception e) {
                    String str = this.c;
                    com.meituan.android.yoda.monitor.log.a.a(str, "configBusinessUIVerifyBtn exception " + e.getMessage(), true);
                }
            }
            if (com.meituan.android.yoda.config.ui.d.a().s()) {
                int b2 = x.b(com.meituan.android.yoda.config.ui.d.a().q(), 3);
                if (button.isEnabled()) {
                    return;
                }
                button.setTextColor(b2);
            }
        }
    }

    public final com.meituan.android.yoda.interfaces.h<YodaResult> h() {
        return this.j;
    }

    public final void a(b.InterfaceC0379b interfaceC0379b, String str) {
        Object[] objArr = {interfaceC0379b, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9651de87cf08e522f7c0b6cfb8c6fc01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9651de87cf08e522f7c0b6cfb8c6fc01");
        } else if (interfaceC0379b != null) {
            interfaceC0379b.d(this.d).c(str).a(this.l).e(this.e).g(this.r).f(e());
        }
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a3a4156670311c2add3659807080c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a3a4156670311c2add3659807080c2");
        }
        b.c cVar = this.o;
        cVar.b = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getBid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a5df2727cf5ada6679775f59a74ae2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a5df2727cf5ada6679775f59a74ae2") : this.o.getBid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ba1bae16640085be60df12418c3b2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ba1bae16640085be60df12418c3b2a");
        }
        b.c cVar = this.o;
        cVar.c = i;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public int getConfirmType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a8efd73f77f30d5c6138aeecc906bd5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a8efd73f77f30d5c6138aeecc906bd5")).intValue() : this.o.getConfirmType();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba11158cb22e2736bd86028b04ff67e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba11158cb22e2736bd86028b04ff67e");
        }
        b.c cVar = this.o;
        cVar.d = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86037a03f218dedef20674986fc6b5e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86037a03f218dedef20674986fc6b5e2") : this.o.getRequestCode();
    }

    private b.InterfaceC0379b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2352793d3ae3aebfb3ebe9c8a795c222", RobustBitConfig.DEFAULT_VALUE) ? (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2352793d3ae3aebfb3ebe9c8a795c222") : this.o.a(j);
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public long getPageDuration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484be5f59def78ada6f9457abb3011d1", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484be5f59def78ada6f9457abb3011d1")).longValue() : this.o.getPageDuration();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afad605ec548a1a880280545b14f0b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afad605ec548a1a880280545b14f0b0");
        }
        b.c cVar = this.o;
        cVar.e = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc4519e57fba67cdfa5bb686bd29aee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc4519e57fba67cdfa5bb686bd29aee") : this.o.getAction();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f983a6d8dbb7edbca1b408d6085f2ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f983a6d8dbb7edbca1b408d6085f2ab");
        }
        b.c cVar = this.o;
        cVar.f = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc10944d43fbf64cd6ae880d74026731", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc10944d43fbf64cd6ae880d74026731") : this.o.getPageCid();
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public final b.InterfaceC0379b g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31f34e105fbd95a6337965c07595fa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.InterfaceC0379b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31f34e105fbd95a6337965c07595fa4");
        }
        b.c cVar = this.o;
        cVar.g = str;
        return cVar;
    }

    @Override // com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getPageInfoKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0fee04993eb7302706d69b28a93c61", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0fee04993eb7302706d69b28a93c61") : this.o.getPageInfoKey();
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484cfee9f4e3414f7653012891347dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484cfee9f4e3414f7653012891347dbe");
            return;
        }
        com.meituan.android.yoda.plugins.c b = com.meituan.android.yoda.plugins.d.a().b();
        String a2 = com.meituan.android.yoda.help.a.a(b != null ? b.getNetEnv() : 1, 108);
        aa.a(getActivity(), com.meituan.android.yoda.help.a.a(a2, this.d).getString("wenview_url", a2));
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04cdf2c1015b9dcbc4febedde0d8564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04cdf2c1015b9dcbc4febedde0d8564");
        } else if (this.s) {
            this.s = false;
            this.q = System.currentTimeMillis();
            com.meituan.android.yoda.model.b.a(this).a(this.r, e());
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543bae024fd9b6d12798b83895edf0ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543bae024fd9b6d12798b83895edf0ab");
        } else if (this.s) {
        } else {
            this.s = true;
            a(System.currentTimeMillis() - this.q);
            com.meituan.android.yoda.model.b.a(this).b(this.r, e());
        }
    }

    private void l() {
        com.meituan.android.yoda.interfaces.c b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ad6fdef9ae17e6c01fdd068ffa1778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ad6fdef9ae17e6c01fdd068ffa1778");
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof com.meituan.android.yoda.callbacks.c) || (b = ((com.meituan.android.yoda.callbacks.c) activity).b()) == null) {
            return;
        }
        b.b(g());
    }

    public final Prompt a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e20bd381291e087c44f3e94709dde6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Prompt) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e20bd381291e087c44f3e94709dde6");
        }
        try {
            if (obj == null) {
                com.meituan.android.yoda.monitor.log.a.a(this.c, "parseStr Prompt error: null", true);
                return null;
            }
            Gson gson = new Gson();
            return (Prompt) gson.fromJson(gson.toJson(obj), new TypeToken<Prompt>() { // from class: com.meituan.android.yoda.fragment.BaseFragment.2
            }.getType());
        } catch (Exception e) {
            String str = this.c;
            com.meituan.android.yoda.monitor.log.a.a(str, "parseStr Prompt error: " + obj.toString(), true);
            e.printStackTrace();
            return null;
        }
    }

    public static boolean b(Error error) {
        return error != null && error.code == 1210000;
    }

    public final void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117325122631fd437f213819a0d6c12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117325122631fd437f213819a0d6c12d");
        } else if (this.n == null || TextUtils.isEmpty(str)) {
        } else {
            String str3 = this.t;
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + str2;
            }
            this.n.a(str, str3);
        }
    }

    public final void a(String str, String str2, boolean z, int i) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6ccf93d7d3469f13575388a07da468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6ccf93d7d3469f13575388a07da468");
        } else if (this.n == null || TextUtils.isEmpty(str)) {
        } else {
            String str3 = this.t;
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + str2;
            }
            this.n.a(str, str3, z, i, "");
        }
    }

    public final void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4168a07c58a41a89839bcea00ba6d76f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4168a07c58a41a89839bcea00ba6d76f");
        } else if (this.n == null || TextUtils.isEmpty(str)) {
        } else {
            String str3 = this.t;
            if (!TextUtils.isEmpty(str2)) {
                str3 = str3 + str2;
            }
            this.n.b(str, str3);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767631822d39210659768e209c38aa71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767631822d39210659768e209c38aa71");
            return;
        }
        int i = this.l;
        o a2 = o.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        if (i == (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7e6ca6ad8942344846c96cb39b4363cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7e6ca6ad8942344846c96cb39b4363cb")).intValue() : o.a.a())) {
            j();
        }
        super.onResume();
        String str = this.c;
        com.meituan.android.yoda.monitor.log.a.a(str, "onResume, requestCode = " + this.d, true);
    }
}
