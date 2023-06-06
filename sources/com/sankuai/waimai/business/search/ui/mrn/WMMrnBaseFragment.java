package com.sankuai.waimai.business.search.ui.mrn;

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
import java.lang.reflect.Field;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMrnBaseFragment extends MRNBaseFragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect k;
    private boolean a;
    private boolean b;
    Activity l;
    protected boolean m;

    public WMMrnBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5875e8a2dd7c65f28b07131819eebae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5875e8a2dd7c65f28b07131819eebae");
            return;
        }
        this.m = false;
        this.a = false;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a697ef331aef2002d8cbdc321ed217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a697ef331aef2002d8cbdc321ed217");
            return;
        }
        super.onAttach(context);
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0c23a9e13f89c894df7fc0cf41819a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0c23a9e13f89c894df7fc0cf41819a");
            return;
        }
        super.onAttach(activity);
        this.l = activity;
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24b40ccb05a6c79dfebf4073e6aa4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24b40ccb05a6c79dfebf4073e6aa4e7");
            return;
        }
        super.onDetach();
        b(false);
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab0da5b827c727d059021ca85c94025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab0da5b827c727d059021ca85c94025");
            return;
        }
        super.onCreate(bundle);
        this.l = getActivity();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cc6d7f645110e3790509299f5f8360", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cc6d7f645110e3790509299f5f8360") : LayoutInflater.from(context).inflate(R.layout.wm_rn_fragment_progressview, (ViewGroup) null);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e48195a91787c162a5108eb200f3d76", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e48195a91787c162a5108eb200f3d76");
        }
        this.b = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_nox_common_mrn_errorview, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.btn_info)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.mrn.WMMrnBaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6ad6b5b615b3dcec0fae0017a2fc3de", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6ad6b5b615b3dcec0fae0017a2fc3de");
                } else {
                    WMMrnBaseFragment.this.getActivity().finish();
                }
            }
        });
        return inflate;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bea8bad6ac2ee427043d28bced6c4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bea8bad6ac2ee427043d28bced6c4c8");
            return;
        }
        super.onPause();
        new m(11, b.a, com.sankuai.waimai.platform.b.A().c()).a("platform", "android").a("bundle_name", a()).a("rn.render.failure.rate", Collections.singletonList(Float.valueOf(this.b ? 1.0f : 0.0f))).a();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd0eb03b75dc286cbece77c7110cfeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd0eb03b75dc286cbece77c7110cfeb");
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c179020e044302d5a31652ea3426d75a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c179020e044302d5a31652ea3426d75a");
            return;
        }
        super.onStart();
        a(true);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa81670d2cf00dfb48bed5907a78418c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa81670d2cf00dfb48bed5907a78418c");
        } else {
            super.onResume();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06855c34ebee212e807c01cda63383fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06855c34ebee212e807c01cda63383fb");
            return;
        }
        super.onStop();
        a(false);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7f7865b34acd965e369f26e26521c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7f7865b34acd965e369f26e26521c7");
            return;
        }
        this.m = z;
        b(z);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc60cbf5cf3c03e97d5d881763a26b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc60cbf5cf3c03e97d5d881763a26b0");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc02b3a008aec3757dd0cd447165e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc02b3a008aec3757dd0cd447165e4e");
            return;
        }
        super.onHiddenChanged(z);
        b(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eaae8c40b3ae267e8c48bab0d2f7ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eaae8c40b3ae267e8c48bab0d2f7ac9");
            return;
        }
        super.setUserVisibleHint(z);
        b(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cba66af5f8994ff16fc8252c811cfbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cba66af5f8994ff16fc8252c811cfbc");
        } else {
            b(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d069f48fa0ffc2af0ba380fd6a61af1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d069f48fa0ffc2af0ba380fd6a61af1c");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        b(false);
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691c53b7ae93a0a6abd443db3efb90c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691c53b7ae93a0a6abd443db3efb90c8")).booleanValue();
        }
        return this.m && super.isVisible() && getUserVisibleHint();
    }

    private void b(boolean z) {
        boolean p;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69cab0ebe62b4dbfe11073ab03eb9aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69cab0ebe62b4dbfe11073ab03eb9aa");
        } else if (z == this.a || (p = p()) == this.a) {
        } else {
            this.a = p;
        }
    }
}
