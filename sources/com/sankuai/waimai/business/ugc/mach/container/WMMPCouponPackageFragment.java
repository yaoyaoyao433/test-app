package com.sankuai.waimai.business.ugc.mach.container;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.router.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMPCouponPackageFragment extends MPBaseFragment {
    public static ChangeQuickRedirect a;
    public View.OnClickListener b;
    private d c;
    private String d;

    public WMMPCouponPackageFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23fc59bfd74db0aeaf79aff477e7f673", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23fc59bfd74db0aeaf79aff477e7f673");
        } else {
            this.b = new View.OnClickListener() { // from class: com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4e801776a486c06c3576980697aa8dc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4e801776a486c06c3576980697aa8dc");
                    } else if (WMMPCouponPackageFragment.this.getActivity() != null) {
                        WMMPCouponPackageFragment.this.getActivity().finish();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        IWMLivePreloadManager iWMLivePreloadManager;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9f877e0b05d48e60462051038ca35f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9f877e0b05d48e60462051038ca35f");
            return;
        }
        super.onCreate(bundle);
        Map<String, String> k = k();
        if (k == null || k.isEmpty() || !e() || (iWMLivePreloadManager = (IWMLivePreloadManager) a.a(IWMLivePreloadManager.class, IWMLivePreloadManager.LIVE_PRELOAD_SERVICE_KEY)) == null) {
            return;
        }
        iWMLivePreloadManager.preload(getContext(), k);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3617ffdfe0cd1d86cab42936310b93a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3617ffdfe0cd1d86cab42936310b93a");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.c = new d(getActivity().getLayoutInflater(), null) { // from class: com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.emptylayout.d
            public final d a(int i, String str, String str2, String str3, View.OnClickListener onClickListener) {
                Object[] objArr2 = {Integer.valueOf(i), str, str2, str3, onClickListener};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cca643438e8c5df92f517a9ce0d4bc22", RobustBitConfig.DEFAULT_VALUE)) {
                    return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cca643438e8c5df92f517a9ce0d4bc22");
                }
                this.X = i;
                this.Y = "信号可能跑到外星球了哦~";
                this.Z = str2;
                this.aa = "返回";
                this.ab = WMMPCouponPackageFragment.this.b;
                return this;
            }
        };
        ay_().addView(this.c.a(), new FrameLayout.LayoutParams(-1, -1));
        return onCreateView;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IWMLivePreloadManager iWMLivePreloadManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bbe7930fde4c9c9424a296c2c7de049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bbe7930fde4c9c9424a296c2c7de049");
            return;
        }
        super.onDestroy();
        Map<String, String> k = k();
        if (k == null || k.isEmpty() || !e() || (iWMLivePreloadManager = (IWMLivePreloadManager) a.a(IWMLivePreloadManager.class, IWMLivePreloadManager.LIVE_PRELOAD_SERVICE_KEY)) == null) {
            return;
        }
        iWMLivePreloadManager.cancelPreload(k);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ecbfdde2a3d7d8daff86b96ee781f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ecbfdde2a3d7d8daff86b96ee781f5e");
        } else if (this.c != null) {
            this.c.d();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74b0eb752e23d9fadd5ed1d987b5635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74b0eb752e23d9fadd5ed1d987b5635");
        } else if (this.c == null || !this.c.j()) {
        } else {
            this.c.h();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0467e73703426660e5b85e0c580ecd47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0467e73703426660e5b85e0c580ecd47");
            return;
        }
        if (this.c != null) {
            this.c.d("");
        }
        DovePageMonitor.a(getActivity(), 20005);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b88697f121e4c6b7148821f73acdb4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b88697f121e4c6b7148821f73acdb4c");
        } else if (this.c == null || !this.c.j()) {
        } else {
            this.c.h();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b3d345377dc14c0b8ae700083b1141", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b3d345377dc14c0b8ae700083b1141") : this.c.a();
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80426db501868785ffde3bef326cefcd", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80426db501868785ffde3bef326cefcd") : this.c.a();
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09de35eaccbec06c18a2b64c0dc63544", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09de35eaccbec06c18a2b64c0dc63544")).booleanValue();
        }
        if (TextUtils.isEmpty(this.d)) {
            ABStrategy strategy = ABTestManager.getInstance(b.a).getStrategy("wm-sqs-live-preload", null);
            this.d = strategy != null ? strategy.expName : "A";
        }
        return ErrorCode.ERROR_TYPE_B.equals(this.d);
    }

    private Map<String, String> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac59b71fd55213c4b7e94af64c15fb30", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac59b71fd55213c4b7e94af64c15fb30");
        }
        if (getActivity() == null) {
            return null;
        }
        String b = f.b(getActivity().getIntent(), IWMLivePreloadManager.PARAM_LIVE_ID, IWMLivePreloadManager.PARAM_LIVE_ID);
        String b2 = f.b(getActivity().getIntent(), IWMLivePreloadManager.PARAM_SRC, IWMLivePreloadManager.PARAM_SRC);
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IWMLivePreloadManager.PARAM_BIZ, "waimaisqs");
        hashMap.put(IWMLivePreloadManager.PARAM_LIVE_ID, b);
        hashMap.put(IWMLivePreloadManager.PARAM_SRC, b2);
        return hashMap;
    }
}
