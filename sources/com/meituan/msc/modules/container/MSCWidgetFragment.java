package com.meituan.msc.modules.container;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCWidgetFragment extends LifecycleFragment implements r, z {
    public static ChangeQuickRedirect g;
    protected com.meituan.msc.modules.container.b h;
    protected View i;
    public Bundle j;
    public Intent k;
    protected b l;
    private Set<String> m;
    private z n;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    @Override // com.meituan.msc.modules.container.r
    public final boolean a() {
        return false;
    }

    @Override // com.meituan.msc.modules.container.r
    public final boolean d() {
        return false;
    }

    @Override // com.meituan.msc.modules.container.r
    public final boolean e() {
        return false;
    }

    @Override // com.meituan.msc.modules.container.r
    @Nullable
    public final /* synthetic */ Activity c() {
        return super.getActivity();
    }

    public static MSCWidgetFragment a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2dcafce315ba4c04489a56033412ac3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCWidgetFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2dcafce315ba4c04489a56033412ac3");
        }
        a aVar = new a();
        aVar.c = str;
        aVar.d = str2;
        return a(aVar);
    }

    @Override // com.meituan.msc.modules.container.r
    @Nullable
    public final Map<String, String> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e3a0f790a47d0e7f9b408ee77e0ad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e3a0f790a47d0e7f9b408ee77e0ad1");
        }
        if (this.h == null) {
            return null;
        }
        return this.h.j();
    }

    public static MSCWidgetFragment a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b81d357a6c63931bbad8696f58dcf4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCWidgetFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b81d357a6c63931bbad8696f58dcf4a");
        }
        MSCWidgetFragment mSCWidgetFragment = new MSCWidgetFragment();
        mSCWidgetFragment.setArguments(aVar.a());
        return mSCWidgetFragment;
    }

    @Override // com.meituan.msc.modules.container.r
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e64ff651d3fb2b163532cf04361842c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e64ff651d3fb2b163532cf04361842c");
        }
        if (this.h == null) {
            return null;
        }
        return this.h.i();
    }

    @Override // com.meituan.msc.modules.container.r
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a02520e522067ae223857d6099d275", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a02520e522067ae223857d6099d275");
        }
        if (this.h == null) {
            return null;
        }
        return this.h.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        @LayoutRes
        public int f;

        public final a a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3969b291f932bdc7f369bedeeae5b5aa", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3969b291f932bdc7f369bedeeae5b5aa");
            }
            if (map == null) {
                return this;
            }
            this.e = ab.b(map);
            return this;
        }

        public final Bundle a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9e93d400acf7d17ba7da5b6cf22ed3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9e93d400acf7d17ba7da5b6cf22ed3");
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.b)) {
                bundle.putString("mscWidgetPath", this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                bundle.putString("appId", this.c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                bundle.putString("targetPath", this.d);
            }
            if (this.e != null) {
                bundle.putString("mscWidgetData", this.e);
            }
            if (this.f != 0) {
                bundle.putInt("mscWidgetLoading", this.f);
            }
            return bundle;
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73705349aa511ca95613f8c30f08ca4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73705349aa511ca95613f8c30f08ca4a");
            return;
        }
        super.onCreate(bundle);
        this.j = bundle;
        MSCEnvHelper.onMSCContainerCreate(getContext());
        MSCEnvHelper.ensureFullInited();
    }

    @Override // com.meituan.msc.modules.container.LazyFragment
    public final View a(FragmentActivity fragmentActivity, ViewGroup viewGroup, LayoutInflater layoutInflater, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, viewGroup, layoutInflater, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8b37c69697a72a42785f8fcfe6f7964", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8b37c69697a72a42785f8fcfe6f7964");
        }
        if (TextUtils.isEmpty(k())) {
            this.i = layoutInflater.inflate(R.layout.msc_load_error, viewGroup, false);
            ((TextView) this.i.findViewById(R.id.load_fail_detail_info)).setText("启动参数错误，请检查业务AppID");
            return this.i;
        }
        this.h = new com.meituan.msc.modules.container.b();
        this.h.a(this);
        this.h.a(k());
        this.h.a(SystemClock.elapsedRealtime());
        this.h.a(bundle);
        this.h.b(this.j);
        this.i = layoutInflater.inflate(R.layout.msc_main_activity, viewGroup, false);
        return this.i;
    }

    @Override // com.meituan.msc.modules.container.LazyFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe76cf903b5b6eb23e8b3c7d4a8f861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe76cf903b5b6eb23e8b3c7d4a8f861");
            return;
        }
        super.b();
        if (this.h != null) {
            if (this.h.h()) {
                this.h.e(this.j);
            }
            this.h.d(this.j);
        }
    }

    @Override // com.meituan.msc.modules.container.LazyFragment
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5336a8a4754945928482a571540f3ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5336a8a4754945928482a571540f3ab2");
            return;
        }
        super.n();
        if (this.h != null) {
            this.h.o();
        }
    }

    @Override // com.meituan.msc.modules.container.LazyFragment
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c131dcd248e593aa24ccfba190d52f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c131dcd248e593aa24ccfba190d52f7f");
            return;
        }
        super.m();
        if (this.h != null) {
            this.h.n();
        }
    }

    @Override // com.meituan.msc.modules.container.r
    public final View g() {
        return this.i;
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac35272968beea597b269bac14bc551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac35272968beea597b269bac14bc551");
            return;
        }
        super.onDestroyView();
        if (this.h != null) {
            this.h.r();
            this.h = null;
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf91d8992cbf0188cb9a85f78075549c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf91d8992cbf0188cb9a85f78075549c");
            return;
        }
        super.onStart();
        if (this.h != null) {
            this.h.f();
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7086089ac3039a832fb10fed15f11a3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7086089ac3039a832fb10fed15f11a3a");
        } else {
            super.onResume();
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, com.meituan.msc.modules.container.LazyFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc1d26621162d1c31224b81c2e4dbcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc1d26621162d1c31224b81c2e4dbcf");
        } else {
            super.onPause();
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9753bb9b3e6bb76e7ffe9bd355b53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9753bb9b3e6bb76e7ffe9bd355b53d");
            return;
        }
        super.onStop();
        if (this.h != null) {
            this.h.g();
        }
    }

    @Override // com.meituan.msc.modules.container.LifecycleFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e83970abf6da7dda2d0fb15a12f2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e83970abf6da7dda2d0fb15a12f2c3");
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976d3c8756466e62f0787e64c861f8c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976d3c8756466e62f0787e64c861f8c1");
            return;
        }
        if (this.h != null) {
            this.h.f(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.meituan.msc.modules.container.r
    public Intent getIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d306c8c3f5530bffc6b6a84d278426", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d306c8c3f5530bffc6b6a84d278426");
        }
        Bundle arguments = getArguments();
        if (this.k == null) {
            this.k = new Intent();
            if (arguments != null && arguments.containsKey("mscWidgetPath")) {
                try {
                    this.k.setData(Uri.parse(arguments.getString("mscWidgetPath")));
                } catch (Exception unused) {
                }
            }
            if (arguments != null) {
                this.k.putExtras(arguments);
            }
        }
        return this.k;
    }

    @Override // com.meituan.msc.modules.container.r
    public Window getWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbf8929edc2515da4893e0770f190a86", RobustBitConfig.DEFAULT_VALUE)) {
            return (Window) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbf8929edc2515da4893e0770f190a86");
        }
        if (getActivity() != null) {
            return getActivity().getWindow();
        }
        return null;
    }

    @Override // com.meituan.msc.modules.container.r
    public final Intent a(@NonNull String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7290c52dcfc1b63c1c06e37d50e3d4e5", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7290c52dcfc1b63c1c06e37d50e3d4e5") : com.meituan.msc.modules.container.b.a(str, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85f6170a4b8b1276f4bb55a98c248371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85f6170a4b8b1276f4bb55a98c248371");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.h != null) {
            this.h.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4357b224196d17c80d15b89bbe4b67ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4357b224196d17c80d15b89bbe4b67ff");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (this.h != null) {
                this.h.a(i, strArr, iArr);
            }
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94fe19427212ae639419191cf6723cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94fe19427212ae639419191cf6723cc5");
            return;
        }
        super.onLowMemory();
        Object[] objArr2 = {80};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90a729112d1ff76aebd89c57a74fd7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90a729112d1ff76aebd89c57a74fd7f1");
        } else if (this.h != null) {
            this.h.a(80);
        }
    }

    @Override // com.meituan.msc.modules.container.r
    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c165da7d27b885ad5c0395ece740839", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c165da7d27b885ad5c0395ece740839") : com.meituan.msc.modules.container.b.a(getIntent());
    }

    @Override // com.meituan.msc.modules.container.r
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4561ebf33e17464e5788fcb08ce455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4561ebf33e17464e5788fcb08ce455");
        } else {
            this.h.l();
        }
    }

    @Override // com.meituan.msc.modules.container.r
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17f814d649f658296fce8ebd6706f8d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17f814d649f658296fce8ebd6706f8d") : this.h.d();
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1739cfe122a3ccae4fd6b9fcd5df4275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1739cfe122a3ccae4fd6b9fcd5df4275");
        } else {
            this.h.a(map);
        }
    }

    public final void a(Set<String> set, z zVar) {
        this.m = set;
        this.n = zVar;
    }

    @Override // com.meituan.msc.modules.container.z
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66ea77ce4b7a1040e13b2071851ae14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66ea77ce4b7a1040e13b2071851ae14");
        } else if (this.n != null) {
            this.n.a(str, map);
        }
    }

    @Nullable
    public final View o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f045674e0a3a021494e43e3b8cb5e626", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f045674e0a3a021494e43e3b8cb5e626");
        }
        if (getArguments() != null && getArguments().containsKey("mscWidgetLoading")) {
            try {
                return getLayoutInflater().inflate(getArguments().getInt("mscWidgetLoading"), (ViewGroup) null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final b p() {
        return this.l;
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e945becd07dd2756813d92fea339550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e945becd07dd2756813d92fea339550");
        } else if (this.l != null) {
            com.meituan.msc.modules.reporter.g.d("MSCWidgetFragment", "UpdateManage widget applyUpdate notify reOpen to native, appId: ", k());
        }
    }

    @Override // com.meituan.msc.modules.container.r
    public <T extends View> T findViewById(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6ff9d87d1a6c097e68336b3da61643", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6ff9d87d1a6c097e68336b3da61643");
        }
        View view = this.i;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }
}
