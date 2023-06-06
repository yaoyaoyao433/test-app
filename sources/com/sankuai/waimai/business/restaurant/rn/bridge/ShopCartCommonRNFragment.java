package com.sankuai.waimai.business.restaurant.rn.bridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopCartCommonRNFragment extends MRNBaseFragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect a;
    protected boolean b;
    Map<String, String> c;
    private boolean g;
    private com.sankuai.waimai.platform.widget.emptylayout.d h;
    private com.sankuai.waimai.platform.widget.emptylayout.d i;

    public ShopCartCommonRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33fa5b5aa92180d5cc1f3499f1e0af70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33fa5b5aa92180d5cc1f3499f1e0af70");
            return;
        }
        this.b = false;
        this.g = false;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02e5036a9f659a5671292bd08ce10cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02e5036a9f659a5671292bd08ce10cf");
            return;
        }
        super.onAttach(context);
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a048cbc899a4492675bdd0b073ff95bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a048cbc899a4492675bdd0b073ff95bd");
        } else {
            super.onAttach(activity);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8540b7a13c3bc0c4995da1ecc8a4f500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8540b7a13c3bc0c4995da1ecc8a4f500");
            return;
        }
        this.h = new com.sankuai.waimai.platform.widget.emptylayout.d(LayoutInflater.from(getContext()), (ViewGroup) null);
        this.h.b(com.sankuai.waimai.platform.widget.emptylayout.d.j, R.string.mrn_common_error, 0, R.string.wm_rn_page_close, new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.ShopCartCommonRNFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9d0f66e7b7483bc9d4990e7253483a0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9d0f66e7b7483bc9d4990e7253483a0");
                } else {
                    ShopCartCommonRNFragment.this.getActivity().finish();
                }
            }
        });
        this.i = new com.sankuai.waimai.platform.widget.emptylayout.d(LayoutInflater.from(getContext()), (ViewGroup) null);
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8464126b5a0947befa8f4bfafbc50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8464126b5a0947befa8f4bfafbc50b");
            return;
        }
        super.onStart();
        a(true);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03519323640be099bf4c0fa2e62121e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03519323640be099bf4c0fa2e62121e6");
            return;
        }
        super.onStop();
        a(false);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fd1c3881704c92779e307b1ff46dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fd1c3881704c92779e307b1ff46dff");
            return;
        }
        this.b = z;
        b(z);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f290a0037453bcbaeaf4e2c481e48d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f290a0037453bcbaeaf4e2c481e48d");
            return;
        }
        super.onHiddenChanged(z);
        b(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6a0027e905da48a02116a29cd19d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6a0027e905da48a02116a29cd19d38");
            return;
        }
        super.setUserVisibleHint(z);
        b(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0b4a180b1d947566bb7153272097e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0b4a180b1d947566bb7153272097e6");
        } else {
            b(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87fcebf6c70edafbc897aa3b14d59df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87fcebf6c70edafbc897aa3b14d59df9");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        b(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d029a9f5036084a14d294215b37bfd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d029a9f5036084a14d294215b37bfd2");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42fae6236a73057cd1edb5e429f32114", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42fae6236a73057cd1edb5e429f32114");
        }
        this.i.c(R.string.mrn_common_loading);
        return a(this.i);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e05137832e90899fa0eaedcc2625c254", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e05137832e90899fa0eaedcc2625c254");
        }
        this.h.c(getResources().getString(R.string.mrn_common_error));
        return a(this.h);
    }

    private void b(boolean z) {
        boolean q;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04279d17ece5dc6a0f9033dfc6fb1ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04279d17ece5dc6a0f9033dfc6fb1ac");
        } else if (z == this.g || (q = q()) == this.g) {
        } else {
            this.g = q;
        }
    }

    private boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f453a10eb87495727d70cc63dfd29ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f453a10eb87495727d70cc63dfd29ae")).booleanValue();
        }
        return this.b && super.isVisible() && getUserVisibleHint();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        String string;
        String string2;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93593677139d2137c70702056c96a797", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93593677139d2137c70702056c96a797");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4abd993a2b9c7b2a422826b45ac87868", RobustBitConfig.DEFAULT_VALUE)) {
            string = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4abd993a2b9c7b2a422826b45ac87868");
        } else {
            string = getArguments().getString("mrn_biz");
            if (aa.a(string)) {
                string = "supermarket";
            }
        }
        String p = p();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0f34e5171b8e0b0ce005144523756d8", RobustBitConfig.DEFAULT_VALUE)) {
            string2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0f34e5171b8e0b0ce005144523756d8");
        } else {
            string2 = getArguments().getString("mrn_component");
            if (aa.a(string2)) {
                string2 = p();
            }
        }
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("mrn_biz", string).appendQueryParameter("mrn_entry", p).appendQueryParameter("mrn_component", string2);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        Map hashMap = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3fe9afa8276e67ffe47b65c1d9c20f29", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3fe9afa8276e67ffe47b65c1d9c20f29") : new HashMap();
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (this.c != null && this.c.size() > 0) {
            hashMap.putAll(this.c);
        }
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8559fafefd8ca29ac97740d45ff53bf3", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8559fafefd8ca29ac97740d45ff53bf3")).booleanValue();
        } else if (getArguments().getInt("jump_from") == 1) {
            z = true;
        }
        if (z) {
            builder.appendQueryParameter("poi_id", getArguments().getString("poi_id"));
            builder.appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, getArguments().getString(FoodDetailNetWorkPreLoader.URI_POI_STR));
            builder.appendQueryParameter("poi_search_placeholder", getArguments().getString("poi_search_placeholder"));
        }
        return builder.build();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636edd57522f2a3d635bf8f107e16bd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636edd57522f2a3d635bf8f107e16bd3");
        }
        List<i> d = super.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.ShopCartCommonRNFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df2bce1c71d7627ae489368f6122393d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df2bce1c71d7627ae489368f6122393d") : ShopCartCommonRNFragment.this.a(reactApplicationContext);
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "520347ce7ca1150099ece63facb8946d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "520347ce7ca1150099ece63facb8946d") : ShopCartCommonRNFragment.this.b(reactApplicationContext);
            }
        });
        if (com.sankuai.waimai.foundation.utils.b.a(d)) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601f22daf4038af2547e31db44353e96", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601f22daf4038af2547e31db44353e96") : getArguments().getString("mrn_entry");
    }

    public List<NativeModule> a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b455c9962d0ba7c46fdaf408347479f2", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b455c9962d0ba7c46fdaf408347479f2") : Collections.emptyList();
    }

    public List<ViewManager> b(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893dbf2683694e182ec94d45e6d41e71", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893dbf2683694e182ec94d45e6d41e71") : Collections.emptyList();
    }

    private View a(com.sankuai.waimai.platform.widget.emptylayout.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0959a186a03916c3bb1dd55a557eb05d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0959a186a03916c3bb1dd55a557eb05d");
        }
        View a2 = dVar.a();
        try {
            if (a2.getParent() != null) {
                ((ViewGroup) a2.getParent()).removeView(a2);
            }
        } catch (Exception unused) {
        }
        return a2;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.facebook.react.modules.core.b
    public final void r_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f2b58d7fb6c1af31c9610de05bc25e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f2b58d7fb6c1af31c9610de05bc25e4");
        } else if (getActivity() != null) {
            getActivity().finish();
        }
    }
}
