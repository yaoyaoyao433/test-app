package com.dianping.live.live.mrn;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.ReactInstanceManager;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.mrn.container.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveMRNFragment extends MRNBaseFragment {
    public static ChangeQuickRedirect a;
    private com.dianping.live.report.b b;

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94ca84fb97bbf5313e1ca9040449d9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94ca84fb97bbf5313e1ca9040449d9c");
        }
        View a2 = super.a(context);
        try {
            a2.setBackgroundColor(Color.parseColor("#00F0F0F0"));
        } catch (Exception unused) {
        }
        a2.setAlpha(0.0f);
        return a2;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aaa6f2016d1eaa097c7413ed5043285", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aaa6f2016d1eaa097c7413ed5043285");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "560bba56229247624d3fda6ed13bc4c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "560bba56229247624d3fda6ed13bc4c5");
        } else {
            n().a(new AnonymousClass1());
        }
        return onCreateView;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.live.live.mrn.MLiveMRNFragment$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements g.b {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.meituan.android.mrn.container.g.b
        public final void a(ReactInstanceManager reactInstanceManager) {
            Object[] objArr = {reactInstanceManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59d0b978c94659eb08de9a28e2e0b5e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59d0b978c94659eb08de9a28e2e0b5e3");
            } else {
                com.dianping.live.live.utils.c.a(new com.dianping.live.live.utils.d() { // from class: com.dianping.live.live.mrn.MLiveMRNFragment.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.live.live.utils.d
                    public final void a(Map<String, Object> map) {
                        Object[] objArr2 = {map};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6005505e62f76bdd5726293f1f9e6126", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6005505e62f76bdd5726293f1f9e6126");
                        } else if (map.containsKey("isOpen") && map.containsKey("js_fps") && map.containsKey("js_fps_period")) {
                            final boolean booleanValue = ((Boolean) map.get("isOpen")).booleanValue();
                            final boolean booleanValue2 = ((Boolean) map.get("js_fps")).booleanValue();
                            final int intValue = ((Integer) map.get("js_fps_period")).intValue();
                            if (MLiveMRNFragment.this.getActivity() != null) {
                                MLiveMRNFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.dianping.live.live.mrn.MLiveMRNFragment.1.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ReactInstanceManager l;
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8f919a0f69cddd30c6d2961e735a694", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8f919a0f69cddd30c6d2961e735a694");
                                            return;
                                        }
                                        if (booleanValue && booleanValue2 && MLiveMRNFragment.this.b == null && (l = MLiveMRNFragment.this.l()) != null) {
                                            MLiveMRNFragment.this.b = new com.dianping.live.report.b(com.facebook.react.modules.core.a.a(), l.getCurrentReactContext(), intValue);
                                            MLiveMRNFragment.this.b.a();
                                        }
                                        if (booleanValue || MLiveMRNFragment.this.b == null) {
                                            return;
                                        }
                                        MLiveMRNFragment.this.b.b();
                                    }
                                });
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e72089c8e8c3ab3e93b800161625ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e72089c8e8c3ab3e93b800161625ebd");
            return;
        }
        super.onResume();
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92257786f799af3fee4d6aed7072ecf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92257786f799af3fee4d6aed7072ecf4");
        } else {
            super.onPause();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fab4401cfd854b22c91ccb0793f6d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fab4401cfd854b22c91ccb0793f6d1a");
            return;
        }
        super.onStop();
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c856c63ab158c5fc245a57105e3c21a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c856c63ab158c5fc245a57105e3c21a");
            return;
        }
        super.onDestroy();
        com.dianping.live.report.d.b.f = null;
    }
}
