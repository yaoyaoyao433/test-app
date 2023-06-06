package com.meituan.mmp.lib;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPWidgetFragment extends LifecycleFragment implements o {
    public static ChangeQuickRedirect h;
    private static final List<String> s = com.meituan.mmp.lib.utils.h.a("widgetPath", "targetPath", "checkUpdateUrl", "fallbackUrl");
    protected com.meituan.mmp.lib.a i;
    protected View j;
    protected Uri k;
    public Bundle l;
    public boolean m;
    protected Map<String, Object> n;
    protected Set<String> o;
    protected a p;
    protected b q;
    View r;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    @Override // com.meituan.mmp.lib.o
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.mmp.lib.o
    public final boolean f() {
        return false;
    }

    public MMPWidgetFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463cd171dd81450f5d0ca2328b95c9c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463cd171dd81450f5d0ca2328b95c9c9");
        } else {
            this.i = new com.meituan.mmp.lib.a();
        }
    }

    @Override // com.meituan.mmp.lib.o
    @Nullable
    public final /* synthetic */ Activity e() {
        return super.getActivity();
    }

    public static MMPWidgetFragment a(Uri uri, @Nullable Bundle bundle) {
        Object[] objArr = {uri, null};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36a19d1d951b937724a51c00eafc089b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPWidgetFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36a19d1d951b937724a51c00eafc089b");
        }
        MMPWidgetFragment mMPWidgetFragment = new MMPWidgetFragment();
        mMPWidgetFragment.k = uri;
        Bundle bundle2 = new Bundle();
        if (uri != null) {
            bundle2.putString("mmpWidgetOriginUrlPath", uri.toString());
        }
        mMPWidgetFragment.setArguments(bundle2);
        return mMPWidgetFragment;
    }

    @Override // com.meituan.mmp.lib.LifecycleFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4626e7815547fe8bc7f2021ba756c95f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4626e7815547fe8bc7f2021ba756c95f");
            return;
        }
        super.onCreate(bundle);
        this.l = bundle;
        MMPEnvHelper.onMMPContainerCreate(getContext());
        MMPEnvHelper.ensureFullInited();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bbf878e90254f631ab465ece9fc03dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bbf878e90254f631ab465ece9fc03dd");
        } else if (DebugHelper.b() && a("appId")) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                for (String str : s) {
                    arguments.remove(str);
                }
            }
            Uri.Builder clearQuery = this.k.buildUpon().clearQuery();
            for (String str2 : this.k.getQueryParameterNames()) {
                if (!s.contains(str2)) {
                    clearQuery.appendQueryParameter(str2, this.k.getQueryParameter(str2));
                }
            }
            this.k = clearQuery.build();
            for (String str3 : s) {
                a(str3);
            }
        }
        this.i.a(this);
        this.i.a(o());
        this.i.a(bundle);
        AppBrandMonitor appBrandMonitor = AppBrandMonitor.e;
        String o = o();
        Object[] objArr3 = {o, this};
        ChangeQuickRedirect changeQuickRedirect3 = AppBrandMonitor.a;
        if (PatchProxy.isSupport(objArr3, appBrandMonitor, changeQuickRedirect3, false, "bdb703db14869988f04b489a32d673ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, appBrandMonitor, changeQuickRedirect3, false, "bdb703db14869988f04b489a32d673ea");
            return;
        }
        AppBrandMonitor.c cVar = new AppBrandMonitor.c(o, this);
        appBrandMonitor.d.remove(cVar);
        appBrandMonitor.d.add(cVar);
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3b40912c144f1c3792570f1763f4d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3b40912c144f1c3792570f1763f4d3");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.i != null) {
            this.i.a(configuration);
        }
    }

    @Override // com.meituan.mmp.lib.LazyFragment
    @Nullable
    public final View a(FragmentActivity fragmentActivity, ViewGroup viewGroup, LayoutInflater layoutInflater, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, viewGroup, layoutInflater, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa0906e927e7a07e69d79cfdbc663b30", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa0906e927e7a07e69d79cfdbc663b30");
        }
        if (TextUtils.isEmpty(o())) {
            q qVar = q.LAUNCH_ERROR;
            bb.b("启动参数错误，请携带AppId", new Object[0]);
            return new FrameLayout(getContext());
        }
        this.j = layoutInflater.inflate(R.layout.hera_main_activity, viewGroup, false);
        return this.j;
    }

    public final View g() {
        return this.j;
    }

    @Override // com.meituan.mmp.lib.LazyFragment
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e738d3e1f027cfb76a700d83538f4ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e738d3e1f027cfb76a700d83538f4ce");
            return;
        }
        super.a();
        this.m = true;
        this.i.b(this.l);
    }

    @Override // com.meituan.mmp.lib.LazyFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f8d1fe58cded67fb405c19d00fbb77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f8d1fe58cded67fb405c19d00fbb77");
            return;
        }
        super.onResume();
        if (this.m) {
            this.i.l();
        }
    }

    @Override // com.meituan.mmp.lib.LazyFragment
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13550eb36222749c435964b99f4b15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13550eb36222749c435964b99f4b15b");
            return;
        }
        super.onPause();
        if (this.m) {
            this.i.m();
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f871ce5181d1c66ed32a56ec85a9a0b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f871ce5181d1c66ed32a56ec85a9a0b9");
            return;
        }
        super.onDestroy();
        if (this.m) {
            this.i.q();
        }
    }

    @Override // com.meituan.mmp.lib.o
    public <T extends View> T findViewById(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea027e16b2f4dbb376e316eff8fa001", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea027e16b2f4dbb376e316eff8fa001");
        }
        if (this.j != null) {
            return (T) this.j.findViewById(i);
        }
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9dc2ccd83e6c89ffcbb26621d52ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9dc2ccd83e6c89ffcbb26621d52ffe");
        } else if (this.m) {
            this.i.c(bundle);
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // com.meituan.mmp.lib.o
    public Intent getIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbd65641532e7d881cd04d27c0028a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbd65641532e7d881cd04d27c0028a6");
        }
        Intent intent = new Intent();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null) {
            intent.putExtras(arguments);
            str = arguments.getString("mmpWidgetOriginUrlPath");
        }
        if (this.k != null) {
            intent.setData(this.k);
        } else if (!TextUtils.isEmpty(str)) {
            intent.setData(Uri.parse(str));
        }
        return intent;
    }

    @Override // com.meituan.mmp.lib.o
    public final Intent a(@NonNull String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc301963ce2ab40ee0343bb95697a0a2", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc301963ce2ab40ee0343bb95697a0a2") : com.meituan.mmp.lib.a.a(str, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22bd1c6cad67f174c0b692515de98240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22bd1c6cad67f174c0b692515de98240");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (!this.m) {
            com.meituan.android.privacy.aop.a.f();
            return;
        }
        this.i.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db418653a85e7b21244a4d2ebfe489a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db418653a85e7b21244a4d2ebfe489a");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (this.m) {
                this.i.a(i, strArr, iArr);
            }
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd91c11da720ec441ecf9500adf43d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd91c11da720ec441ecf9500adf43d43");
            return;
        }
        super.onLowMemory();
        Object[] objArr2 = {80};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea4a414a3d2641f7e57a55cab33bbc9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea4a414a3d2641f7e57a55cab33bbc9b");
        } else if (this.m) {
            this.i.a(80);
        }
    }

    private String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3839a2024199613cbc249650330d584", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3839a2024199613cbc249650330d584") : this.i.i();
    }

    @Override // com.meituan.mmp.lib.o
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3754db7ede93f936656efe2d3a936677", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3754db7ede93f936656efe2d3a936677");
        }
        String b2 = this.i.b("widgetPath");
        return b2 != null ? b2 : this.i.j();
    }

    public final void a(Map<String, Object> map) {
        this.n = map;
    }

    public final Map<String, Object> h() {
        return this.n;
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50f5bf886151fec7ddd5e5a88ffc2f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50f5bf886151fec7ddd5e5a88ffc2f9a");
        } else {
            this.i.a(map);
        }
    }

    public final void a(Set<String> set, a aVar) {
        this.o = set;
        this.p = aVar;
    }

    public final Set<String> i() {
        return this.o;
    }

    public final a j() {
        return this.p;
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc430679b4b86701b35524d19ba8b8de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc430679b4b86701b35524d19ba8b8de");
        } else if (this.q != null) {
            com.meituan.mmp.lib.trace.b.b("MMPWidgetFragment", String.format("UpdateManage widget applyUpdate notify reOpen to native, appId: %s", o()));
        }
    }

    public final b m() {
        return this.q;
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa45422a2d75abfa9b22c8af6bcf1f55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa45422a2d75abfa9b22c8af6bcf1f55")).booleanValue();
        }
        String b2 = com.meituan.mmp.lib.utils.z.b(getActivity().getIntent(), str);
        if (b2 != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString(str, b2);
            setArguments(arguments);
            return true;
        }
        return false;
    }

    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c73ce8590b27fad33da33551161b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c73ce8590b27fad33da33551161b0f");
        }
        Bundle extras = getIntent().getExtras();
        return extras == null ? "" : extras.getString("backgroundColor", "");
    }
}
