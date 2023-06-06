package com.sankuai.waimai.reactnative.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.monitor.impl.m;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.lang.reflect.Field;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNBaseFragment extends MRNBaseFragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect i;
    private boolean a;
    public Activity j;
    protected boolean k;
    public boolean l;

    public void a(boolean z) {
    }

    public boolean as_() {
        return false;
    }

    public WMRNBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b66e66250c315d4581855bfd7420b21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b66e66250c315d4581855bfd7420b21");
            return;
        }
        this.k = false;
        this.l = false;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6436e22820c931d24834351b23b281b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6436e22820c931d24834351b23b281b");
            return;
        }
        super.onAttach(context);
        c(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c0017731f527d602e10a7153743af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c0017731f527d602e10a7153743af0");
            return;
        }
        super.onAttach(activity);
        this.j = activity;
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d69a6ac21e4aa4eceeeb3cafdab3e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d69a6ac21e4aa4eceeeb3cafdab3e5f");
            return;
        }
        super.onDetach();
        c(false);
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (Exception e) {
            a.b(e);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b571a62d66a292e76bcb7fe2b8f5eaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b571a62d66a292e76bcb7fe2b8f5eaec");
            return;
        }
        super.onCreate(bundle);
        this.j = getActivity();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5b03032724f90d6b7ecb8fd9fa8098", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5b03032724f90d6b7ecb8fd9fa8098") : LayoutInflater.from(context).inflate(R.layout.wm_rn_fragment_progressview, (ViewGroup) null);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8f3d5cab2e34768d6baf1310546665", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8f3d5cab2e34768d6baf1310546665");
        }
        this.a = true;
        if (as_()) {
            return super.c(context);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_rn_fragment_errorview, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.btn_info)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d9e0a7111102614e2154fdfd6ae380f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d9e0a7111102614e2154fdfd6ae380f");
                } else {
                    WMRNBaseFragment.this.getActivity().finish();
                }
            }
        });
        return inflate;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.facebook.react.modules.core.b
    public final void r_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f8bdfe8fcc7e6f5f475085307c10e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f8bdfe8fcc7e6f5f475085307c10e4");
        } else if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae4472a1dd417aa4aa41e5a107179af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae4472a1dd417aa4aa41e5a107179af");
            return;
        }
        super.onPause();
        new m(11, b.a, com.sankuai.waimai.platform.b.A().c()).a("platform", "android").a("bundle_name", a()).a("rn.render.failure.rate", Collections.singletonList(Float.valueOf(this.a ? 1.0f : 0.0f))).a();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de0fe6e3c15af8a42402c773c88e14d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de0fe6e3c15af8a42402c773c88e14d");
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6639454aaa220e8a30d25eb044eadb2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6639454aaa220e8a30d25eb044eadb2b");
            return;
        }
        super.onStart();
        b(true);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3257a6e137919d92802e2d5960f736bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3257a6e137919d92802e2d5960f736bd");
        } else {
            super.onResume();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8d38945a7aef6c5aa5a5c7b1e9a0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8d38945a7aef6c5aa5a5c7b1e9a0a1");
            return;
        }
        super.onStop();
        b(false);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e72359223b870922d2ca6549f68690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e72359223b870922d2ca6549f68690");
            return;
        }
        this.k = z;
        c(z);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9aeb2db1645c7fd753195b34de5e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9aeb2db1645c7fd753195b34de5e17");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6875ebd6d800163a893a0b75bcbb9d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6875ebd6d800163a893a0b75bcbb9d92");
            return;
        }
        super.onHiddenChanged(z);
        c(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b26ae4a88d6648dd04ea8b8f1b61efe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b26ae4a88d6648dd04ea8b8f1b61efe5");
            return;
        }
        super.setUserVisibleHint(z);
        c(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cac41271b3fe053eb66137c648db83f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cac41271b3fe053eb66137c648db83f");
        } else {
            c(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198f9688edf9908dfd2ae34ea2bc2486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198f9688edf9908dfd2ae34ea2bc2486");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        c(false);
    }

    private boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fcd28124aba18871f18b7ee1b295fa1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fcd28124aba18871f18b7ee1b295fa1")).booleanValue();
        }
        return this.k && super.isVisible() && getUserVisibleHint();
    }

    private void c(boolean z) {
        boolean q;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232c10f43c0cb439b59a60e96ac33d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232c10f43c0cb439b59a60e96ac33d9e");
        } else if (z == this.l || (q = q()) == this.l) {
        } else {
            this.l = q;
            a(this.l);
        }
    }
}
