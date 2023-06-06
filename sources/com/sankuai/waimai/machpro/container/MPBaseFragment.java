package com.sankuai.waimai.machpro.container;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPBaseFragment extends Fragment implements b {
    public static ChangeQuickRedirect f;
    private FrameLayout a;
    private FrameLayout b;
    private View c;
    private View d;
    private String e;
    public a g;
    public com.sankuai.waimai.mach.manager.cache.c h;
    public String i;
    private MachMap j;
    private HashMap<String, com.sankuai.waimai.mach.manager.cache.c> k;
    private d l;

    public MachMap a() {
        return null;
    }

    public void a(CacheException cacheException) {
    }

    public static /* synthetic */ a a(MPBaseFragment mPBaseFragment, a aVar) {
        mPBaseFragment.g = null;
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Uri data;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f5441a73fb4f537842318cbae795b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f5441a73fb4f537842318cbae795b4");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "049123563ff7675f2975bd6ef2b6178f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "049123563ff7675f2975bd6ef2b6178f");
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.e = arguments.getString("bundle_name");
                Serializable a = com.sankuai.waimai.platform.utils.f.a(arguments, "bundle_params");
                if (a instanceof MachMap) {
                    this.j = (MachMap) a;
                }
            }
            if (TextUtils.isEmpty(this.e) && getActivity() != null && getActivity().getIntent() != null && (data = getActivity().getIntent().getData()) != null) {
                this.e = data.getQueryParameter("mach_bundle_name");
            }
        }
        this.i = ErrorCode.generateRandomPageId();
        if (com.sankuai.waimai.machpro.f.a().i.i) {
            this.g = com.sankuai.waimai.machpro.debug.a.a(this);
            if (this.g == null) {
                this.g = new g(this);
            }
        } else {
            this.g = new g(this);
        }
        this.g.c(this.i);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40b2a63c26d380baed0c04a9a118736", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40b2a63c26d380baed0c04a9a118736");
        }
        this.a = new FrameLayout(getActivity());
        if (com.sankuai.waimai.machpro.f.a().i.j) {
            this.b = new FrameLayout(getActivity());
            this.a.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
            com.sankuai.waimai.machpro.debug.a.a(this, this.a, this.e);
        } else {
            this.b = this.a;
        }
        return this.a;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Set<String> queryParameterNames;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57a7a55144a508c66ea7c4167f20570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57a7a55144a508c66ea7c4167f20570");
            return;
        }
        super.onActivityCreated(bundle);
        if (getActivity() != null && getActivity().getIntent() != null) {
            Uri data = getActivity().getIntent().getData();
            if (data != null) {
                this.l = com.sankuai.waimai.machpro.f.a().c(data.toString());
            }
            if (this.l == null) {
                this.l = new f();
            }
            MachMap machMap = new MachMap();
            if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null && queryParameterNames.size() > 0) {
                MachMap machMap2 = new MachMap();
                for (String str : queryParameterNames) {
                    machMap2.put(str, data.getQueryParameter(str));
                }
                machMap.put("schemeParams", machMap2);
                if (this.g != null) {
                    this.g.c(machMap);
                }
            }
            machMap.put(NetLogConstants.Details.SCHEME, data == null ? null : data.toString());
        }
        if (this.g != null) {
            this.g.a();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e235a86b1a12c84b25c1c05d22a35c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e235a86b1a12c84b25c1c05d22a35c0");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.g != null) {
            this.g.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0f27fe77c7cc189d8ef678a39732c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0f27fe77c7cc189d8ef678a39732c5");
            return;
        }
        super.onStart();
        if (this.g != null) {
            this.g.c();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f8a3908d168855e0abcaeadb4be5a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f8a3908d168855e0abcaeadb4be5a9");
            return;
        }
        super.onResume();
        if (this.g != null) {
            this.g.d();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d874d3c14485efbc2caa51e88c98cdf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d874d3c14485efbc2caa51e88c98cdf1");
            return;
        }
        super.onPause();
        if (this.g != null) {
            this.g.e();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final FrameLayout ay_() {
        return this.b;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final String az_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4d10588e9aeeb36fd89426fca8fc65", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4d10588e9aeeb36fd89426fca8fc65") : com.sankuai.waimai.machpro.util.b.f(this.e);
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final Context aA_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1272d6539d153bd54dc6588d8ef54e64", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1272d6539d153bd54dc6588d8ef54e64") : getActivity();
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final MachMap d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3594562066883e5193eaf596f603c04", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3594562066883e5193eaf596f603c04");
        }
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b0da53b24a3554efa7112b4ac67e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b0da53b24a3554efa7112b4ac67e35");
            return;
        }
        if (this.c == null) {
            this.c = b();
        }
        if (this.l != null) {
            this.l.a();
        }
        if (this.c != null) {
            if (this.c.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            this.a.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2e4591acc32d889257a1479234b042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2e4591acc32d889257a1479234b042");
            return;
        }
        if (this.l != null) {
            this.l.b();
        }
        if (this.c != null && (this.c.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        this.c = null;
    }

    public void a(com.sankuai.waimai.mach.manager.cache.c cVar) {
        this.h = cVar;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc238ca774e27e201799ef511650434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc238ca774e27e201799ef511650434");
        } else if (com.sankuai.waimai.machpro.f.a().i.i) {
            com.sankuai.waimai.machpro.debug.a.a(this.a, th, this.h, this.k);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void b(com.sankuai.waimai.mach.manager.cache.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5374c9dad2116c02e2301543df0f61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5374c9dad2116c02e2301543df0f61");
        } else if (cVar == null) {
        } else {
            if (this.k == null) {
                this.k = new HashMap<>();
            }
            this.k.put(cVar.d, cVar);
        }
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d20be5dfd1da20e6e3f0672fa95307a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d20be5dfd1da20e6e3f0672fa95307a");
            return;
        }
        if (this.d == null) {
            this.d = c();
        }
        if (this.l != null) {
            this.l.c();
        }
        if (this.d != null) {
            if (this.d.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.d.getParent()).removeView(this.d);
            }
            this.a.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef3cfcd5095ef379e766a467f499aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef3cfcd5095ef379e766a467f499aaa");
            return;
        }
        if (this.l != null) {
            this.l.d();
        }
        if (this.d != null && (this.d.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        }
        this.d = null;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final String j() {
        return this.e;
    }

    public View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca93953cad99d6a37ed0464939e8653", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca93953cad99d6a37ed0464939e8653");
        }
        if (getActivity() == null) {
            return null;
        }
        return this.l.a(getActivity());
    }

    public View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670f982febc41398072156ba8df3ecaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670f982febc41398072156ba8df3ecaf");
        }
        if (getActivity() == null) {
            return null;
        }
        return this.l.a(getActivity(), this.g);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b896a27c8d92f70ed67754df5c2f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b896a27c8d92f70ed67754df5c2f39");
            return;
        }
        super.onStop();
        if (this.g != null) {
            this.g.f();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9cf3e7e17fecf3d47102b1801923476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9cf3e7e17fecf3d47102b1801923476");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.container.MPBaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a4335be63dc12c7daf7e0e474dddb90", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a4335be63dc12c7daf7e0e474dddb90");
                } else if (MPBaseFragment.this.g != null) {
                    MPBaseFragment.this.g.g();
                    MPBaseFragment.a(MPBaseFragment.this, null);
                }
            }
        });
    }
}
