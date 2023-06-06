package com.sankuai.waimai.store.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.v;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGCommonRNFragment extends MRNBaseFragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect c;
    private final String a;
    private final String b;
    protected Activity g;
    protected boolean h;
    protected boolean i;
    public Map<String, String> j;

    public void a(boolean z) {
    }

    public SGCommonRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ecc96057392034ed3c629fa3e91e2fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ecc96057392034ed3c629fa3e91e2fb");
            return;
        }
        this.a = "containerViewDidAppear";
        this.b = "containerViewDidDisappear";
        this.h = false;
        this.i = false;
    }

    public static SGCommonRNFragment b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcac634373e59e375b6b1c86e61a9dc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGCommonRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcac634373e59e375b6b1c86e61a9dc9");
        }
        Bundle bundle = new Bundle();
        SGCommonRNFragment sGCommonRNFragment = new SGCommonRNFragment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        sGCommonRNFragment.setArguments(bundle);
        return sGCommonRNFragment;
    }

    @Nullable
    public static Bundle b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a86e1c392bdf7f230ba1be38b96f43c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a86e1c392bdf7f230ba1be38b96f43c5");
        }
        if (intent == null || intent.getData() == null) {
            return null;
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("mrn_biz");
        String queryParameter2 = data.getQueryParameter("mrn_entry");
        String queryParameter3 = data.getQueryParameter("mrn_component");
        Bundle bundle = new Bundle();
        bundle.putString("mrn_biz", queryParameter);
        bundle.putString("mrn_entry", queryParameter2);
        bundle.putString("mrn_component", queryParameter3);
        return bundle;
    }

    public static SGCommonRNFragment a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a23c91e74009fa8ccfdb0a2439664d64", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGCommonRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a23c91e74009fa8ccfdb0a2439664d64");
        }
        SGCommonRNFragment sGCommonRNFragment = new SGCommonRNFragment();
        sGCommonRNFragment.setArguments(b(str));
        return sGCommonRNFragment;
    }

    public static Bundle b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74fd4f34fd363b9cc6d5d18e939c7530", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74fd4f34fd363b9cc6d5d18e939c7530");
        }
        Bundle bundle = new Bundle();
        try {
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        if (t.a(str)) {
            return bundle;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Bundle bundle2 = new Bundle();
        for (String str2 : queryParameterNames) {
            if (!t.a(str2)) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!t.a(queryParameter)) {
                    if ("mrn_biz".equals(str2)) {
                        bundle.putString("mrn_biz", queryParameter);
                    } else if ("mrn_entry".equals(str2)) {
                        bundle.putString("mrn_entry", queryParameter);
                    } else if ("mrn_component".equals(str2)) {
                        bundle.putString("mrn_component", queryParameter);
                    } else {
                        bundle2.putString(str2, queryParameter);
                    }
                }
            }
        }
        bundle.putBundle("bundleParams", bundle2);
        return bundle;
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37010393dc0b0d883d6d640d15173aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37010393dc0b0d883d6d640d15173aa7");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBundle("bundleParams", bundle);
        }
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8664dc97a775f0d68a39dc116d2b510a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8664dc97a775f0d68a39dc116d2b510a");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (bundle2 = arguments.getBundle("bundleParams")) == null) {
            return;
        }
        bundle2.putAll(bundle);
    }

    public final String a(String str, String str2) {
        Bundle bundle;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "365ca4484aa0f25ff22c62153a8bd1ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "365ca4484aa0f25ff22c62153a8bd1ab");
        }
        Bundle arguments = getArguments();
        return (arguments == null || (bundle = arguments.getBundle("bundleParams")) == null) ? str2 : bundle.getString(str);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989f00d91a2a93028d2ffd2439d5439f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989f00d91a2a93028d2ffd2439d5439f");
            return;
        }
        super.onAttach(context);
        c(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ebfb18a678e578ccff28ffb284e931d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ebfb18a678e578ccff28ffb284e931d");
            return;
        }
        super.onAttach(activity);
        this.g = activity;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b3e57e0879a529835a52447e2efb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b3e57e0879a529835a52447e2efb7c");
            return;
        }
        super.onCreate(bundle);
        this.g = getActivity();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d54a51a88fa1587aa89253564073ce98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d54a51a88fa1587aa89253564073ce98");
            return;
        }
        super.onStart();
        b(true);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7308f4e73678d7d97ffc01556487e30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7308f4e73678d7d97ffc01556487e30b");
            return;
        }
        super.onStop();
        b(false);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16df176383a508f72aa2cb3afae3527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16df176383a508f72aa2cb3afae3527");
            return;
        }
        this.h = z;
        c(z);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b971c48fc9d3d910e13138ddc4c6494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b971c48fc9d3d910e13138ddc4c6494");
            return;
        }
        super.onHiddenChanged(z);
        c(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f9c672abb29f5e623e1109436e4900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f9c672abb29f5e623e1109436e4900");
            return;
        }
        super.setUserVisibleHint(z);
        c(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f41757ed4a5b741eccaae9b509831d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f41757ed4a5b741eccaae9b509831d");
        } else {
            c(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9635417edf75d76b611ae4b5059da0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9635417edf75d76b611ae4b5059da0c");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        c(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943ef190bb46de40518e282ac5e9ce32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943ef190bb46de40518e282ac5e9ce32");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbb56873edb88f623decbecdbdd6670", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbb56873edb88f623decbecdbdd6670");
        }
        return v.c ? super.a(context) : LayoutInflater.from(context).inflate(R.layout.wm_st_common_mrn_loading_layout, (ViewGroup) null);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0a81f7d77ef605d6fa0ceffa648fbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0a81f7d77ef605d6fa0ceffa648fbd");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_st_common_mrn_error_layout, (ViewGroup) null);
        if (v.c) {
            return super.c(context);
        }
        ((TextView) inflate.findViewById(R.id.btn_info)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.base.SGCommonRNFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29c5abd826ce869ddc6156b7fba6f62c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29c5abd826ce869ddc6156b7fba6f62c");
                } else {
                    SGCommonRNFragment.this.getActivity().finish();
                }
            }
        });
        return inflate;
    }

    private void c(boolean z) {
        boolean s;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4265317e248a31bcbefd29915a5e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4265317e248a31bcbefd29915a5e10");
        } else if (z == this.i || (s = s()) == this.i) {
        } else {
            this.i = s;
            a(this.i);
        }
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85fe0690456167327439537f2dd23a7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85fe0690456167327439537f2dd23a7e")).booleanValue();
        }
        return this.h && super.isVisible() && getUserVisibleHint();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public Uri m() {
        String string;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "585aa49a1a54f25ce24376d2a41c5707", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "585aa49a1a54f25ce24376d2a41c5707");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b12f21331fe9becc1b340655a27309d8", RobustBitConfig.DEFAULT_VALUE)) {
            string = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b12f21331fe9becc1b340655a27309d8");
        } else {
            string = getArguments() != null ? getArguments().getString("mrn_biz") : "";
            if (t.a(string)) {
                string = "supermarket";
            }
        }
        String p = p();
        String q = q();
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("mrn_biz", string).appendQueryParameter("mrn_entry", p).appendQueryParameter("mrn_component", q);
        Map<String, String> r = r();
        if (r == null) {
            r = new HashMap<>();
        }
        if (this.j != null && this.j.size() > 0) {
            r.putAll(this.j);
        }
        if (!r.isEmpty()) {
            for (Map.Entry<String, String> entry : r.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        Bundle bundle = getArguments() != null ? getArguments().getBundle("bundleParams") : null;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                builder.appendQueryParameter(str, bundle.getString(str));
            }
        }
        return builder.build();
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a01023b4d2aa2f869e6d3104a2ddef5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a01023b4d2aa2f869e6d3104a2ddef5") : getArguments() != null ? getArguments().getString("mrn_entry") : "";
    }

    public final String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ebc7a50048b11ef75cecb17a1060190", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ebc7a50048b11ef75cecb17a1060190");
        }
        String string = getArguments() != null ? getArguments().getString("mrn_component") : "";
        return t.a(string) ? p() : string;
    }

    public Map<String, String> r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7d3676fcbc481fa9ebc91f3ab04403", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7d3676fcbc481fa9ebc91f3ab04403") : new HashMap();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.facebook.react.modules.core.b
    public final void r_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc1a25fbbc1f96f547ebf553b36d006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc1a25fbbc1f96f547ebf553b36d006");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }
}
