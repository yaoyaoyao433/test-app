package com.sankuai.eh.component.web.titans;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.web.module.c;
import com.sankuai.eh.component.web.module.j;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHMTWebFragment extends Fragment implements com.sankuai.eh.component.service.spi.a {
    public static ChangeQuickRedirect a;
    private j b;
    private c c;
    private MetricsSpeedMeterTask d;

    public static EHMTWebFragment a(c cVar, Bundle bundle) {
        Object[] objArr = {cVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a06ce7b98222aba152750819c22079d", RobustBitConfig.DEFAULT_VALUE)) {
            return (EHMTWebFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a06ce7b98222aba152750819c22079d");
        }
        EHMTWebFragment eHMTWebFragment = new EHMTWebFragment();
        eHMTWebFragment.setArguments(bundle);
        eHMTWebFragment.c = cVar;
        return eHMTWebFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11a5d82d5c96cffd842468b4d8f8a06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11a5d82d5c96cffd842468b4d8f8a06");
            return;
        }
        this.d = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_router");
        d.a("step_beforeFGCreate");
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f87159583d31f9b2c4d63de6ec2db0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f87159583d31f9b2c4d63de6ec2db0b");
        } else {
            this.b = new a(KNBWebCompactFactory.getKNBCompact(1, getActivity()), this.c);
        }
        this.b.a(getContext(), getArguments());
        this.d.recordStep("onCreate");
        d.a("step_FGCreate");
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2533e51870ea048cadf1268375468ca5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2533e51870ea048cadf1268375468ca5");
        }
        try {
            view = this.b.a(layoutInflater, viewGroup);
        } catch (InflateException | ClassCastException e) {
            com.dianping.codelog.b.b(a.class, "onCreteView exception", e.getMessage());
            com.sankuai.meituan.android.ui.widget.a.a(getActivity(), "手机环境异常,请稍后重试", -1);
            getActivity().finish();
            view = null;
        }
        if (this.d != null) {
            this.d.recordStep("onCreateView");
        }
        d.a("step_FGCreateView");
        return view;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3987775b88fff3f1fcbce9ce007bce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3987775b88fff3f1fcbce9ce007bce");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b.a(view, bundle);
        if (this.d != null) {
            this.d.recordStep("onViewCreated");
        }
        d.a("step_FGViewCreated");
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da244619f54e80b1d294463b92b22949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da244619f54e80b1d294463b92b22949");
            return;
        }
        super.onActivityCreated(bundle);
        if (getArguments() != null && getArguments().getBundle("saveState") != null) {
            this.b.a(getArguments().getBundle("saveState"));
        } else {
            this.b.a(bundle);
        }
        if (this.d != null) {
            h.a(this.d.recordStep("onActivityCreated"));
        }
        d.a("step_FGCreated");
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538588ab6ffb56b7a838d77cc1769cca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538588ab6ffb56b7a838d77cc1769cca");
            return;
        }
        super.onStart();
        this.b.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b801d4cc06874cda2e25d5b7e74b284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b801d4cc06874cda2e25d5b7e74b284");
            return;
        }
        super.onResume();
        this.b.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f9a15d47bb8d1756c98800f151a750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f9a15d47bb8d1756c98800f151a750");
            return;
        }
        super.onPause();
        this.b.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e02a48d92e3e765997d4fa5ecce2946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e02a48d92e3e765997d4fa5ecce2946");
            return;
        }
        super.onStop();
        this.b.e();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c1f7e1433135c6c1445e73daaa9af8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c1f7e1433135c6c1445e73daaa9af8");
            return;
        }
        this.b.j();
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb7836b8e319758ee5fc0b9a74690c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb7836b8e319758ee5fc0b9a74690c6");
            return;
        }
        super.onDestroy();
        this.b.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5e2eddc11f8ab10e28e3f347af7953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5e2eddc11f8ab10e28e3f347af7953");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b714457c767e4de8382efe5ac83193cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b714457c767e4de8382efe5ac83193cb");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.b.a(i, strArr, iArr);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0996e718d46200d8cfd405552db108e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0996e718d46200d8cfd405552db108e2")).booleanValue();
        }
        if (this.b != null) {
            this.b.g();
            return true;
        }
        return false;
    }

    @Override // com.sankuai.eh.component.service.spi.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17438d6e93e56235b1d94f4ce7280040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17438d6e93e56235b1d94f4ce7280040");
            return;
        }
        try {
            com.sankuai.eh.component.web.plugins.j.a(getActivity());
        } catch (Exception e) {
            d.a(e);
        }
    }
}
