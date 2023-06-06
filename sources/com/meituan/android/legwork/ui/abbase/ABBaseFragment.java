package com.meituan.android.legwork.ui.abbase;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.android.legwork.ui.base.BaseFragment;
import com.meituan.android.legwork.utils.b;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ABBaseFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    protected a b;
    private final String c;
    private JSONObject d;
    private View e;
    private Dialog f;
    private View k;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(@ColorRes int i);

        void c();

        Intent d();
    }

    public abstract void a(View view, Bundle bundle);

    public abstract void b();

    public abstract String e();

    public ABBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1f8dc291acb4eb3ebb62fae54c6671", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1f8dc291acb4eb3ebb62fae54c6671");
        } else {
            this.c = "ABBaseFragment";
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17cb2bef82b4087ecd358b2e1ec6971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17cb2bef82b4087ecd358b2e1ec6971");
            return;
        }
        super.onAttach(context);
        if (context instanceof a) {
            this.b = (a) context;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53d74310a9b6fbcf3fd116473bbb97b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53d74310a9b6fbcf3fd116473bbb97b7");
            return;
        }
        super.onDetach();
        this.b = null;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775c9f0bd25e0e469eb69ccac132a004", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775c9f0bd25e0e469eb69ccac132a004");
        }
        this.e = layoutInflater.inflate(R.layout.legwork_fragment_ab_base_layout, viewGroup, false);
        this.k = layoutInflater.inflate(R.layout.legwork_fragment_ab_main_b, (ViewGroup) null);
        ViewStub viewStub = (ViewStub) this.e.findViewById(R.id.legwork_container);
        ViewGroup viewGroup2 = (ViewGroup) viewStub.getParent();
        int indexOfChild = viewGroup2.indexOfChild(viewStub);
        viewGroup2.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            viewGroup2.addView(this.k, indexOfChild, layoutParams);
        } else {
            viewGroup2.addView(this.k, indexOfChild);
        }
        Object[] objArr2 = {this.e};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbcc9bed2be1e64417e1018dc43a4f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbcc9bed2be1e64417e1018dc43a4f07");
        }
        a(this.k, bundle);
        return this.e;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc93f0ea338ba80ee4f156d8d7a85dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc93f0ea338ba80ee4f156d8d7a85dce");
            return;
        }
        super.onActivityCreated(bundle);
        b();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153d25cc71a294ecfc6e75f641173806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153d25cc71a294ecfc6e75f641173806");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408c9f9f98067737ce68a470853120ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408c9f9f98067737ce68a470853120ad");
        } else if (this.b == null) {
        } else {
            this.b.c();
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseFragment
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c723290dca5c8f48b3213a3c561320e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c723290dca5c8f48b3213a3c561320e7");
        } else if (this.f == null || !this.f.isShowing()) {
        } else {
            try {
                this.f.dismiss();
            } catch (Exception e) {
                x.e("ABBaseFragment.showProgressDialog()", "dismissProgressDialog fail，exception msg:", e);
            }
        }
    }

    public final Map a(Map<String, Object> map) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a8eb7a36f9a2f813ba229c8bd86486", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a8eb7a36f9a2f813ba229c8bd86486");
        }
        HashMap hashMap = new HashMap();
        if (this.d == null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("strategy", b.b);
                jSONObject.put(e(), jSONObject2);
            } catch (JSONException e) {
                x.e("ABBaseFragment.mergeABTestParams()", "exception msg:", e);
                x.a(e);
            }
            this.d = jSONObject;
        }
        hashMap.put("abtest", this.d);
        return hashMap;
    }
}
