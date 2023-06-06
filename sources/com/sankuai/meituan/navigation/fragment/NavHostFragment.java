package com.sankuai.meituan.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.b;
import com.sankuai.meituan.navigation.c;
import com.sankuai.meituan.navigation.common.Navigator;
import com.sankuai.meituan.navigation.common.d;
import com.sankuai.meituan.navigation.common.h;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NavHostFragment extends Fragment {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.navigation.a b;
    private boolean c;

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74bb358adb8ca0442500ddf16352b7c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74bb358adb8ca0442500ddf16352b7c1");
            return;
        }
        super.onAttach(context);
        if (this.c) {
            b().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2;
        int i;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32246f142650b029fd1e22e7b920cb64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32246f142650b029fd1e22e7b920cb64");
            return;
        }
        super.onCreate(bundle);
        this.b = new com.sankuai.meituan.navigation.a(a());
        h hVar = this.b.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        hVar.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe8d5a9b394fa817bd482b9b9457bc6a", RobustBitConfig.DEFAULT_VALUE) ? (Navigator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe8d5a9b394fa817bd482b9b9457bc6a") : new a(a(), getChildFragmentManager(), getId()));
        d dVar = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.c = true;
                b().beginTransaction().setPrimaryNavigationFragment(this).commit();
            }
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            com.sankuai.meituan.navigation.a aVar = this.b;
            Object[] objArr3 = {bundle2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.navigation.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b5c2f7de1b1a35271f41e976f3bd14d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b5c2f7de1b1a35271f41e976f3bd14d2");
                return;
            } else if (bundle2 != null) {
                aVar.d = bundle2.getInt("android-support-nav:controller:graphId");
                aVar.e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                aVar.f = bundle2.getIntArray("android-support-nav:controller:backStackIds");
                if (aVar.d != 0) {
                    aVar.a(aVar.d);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        Bundle arguments = getArguments();
        int i2 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
        if (i2 != 0) {
            this.b.a(i2);
            return;
        }
        com.sankuai.meituan.navigation.a aVar2 = this.b;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.navigation.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "45ed450ac19877a546e033b049cf9a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "45ed450ac19877a546e033b049cf9a35");
            return;
        }
        b b = aVar2.b();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b.a;
        if (PatchProxy.isSupport(objArr5, b, changeQuickRedirect5, false, "e3fd180591f45ce4d809bf4b09b109c9", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (d) PatchProxy.accessDispatch(objArr5, b, changeQuickRedirect5, false, "e3fd180591f45ce4d809bf4b09b109c9");
        } else {
            c cVar = b.b;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = c.a;
            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "e78bab3aca34a6ed9490ae2658834347", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (d) PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "e78bab3aca34a6ed9490ae2658834347");
            } else {
                Bundle bundle3 = cVar.b.getApplicationInfo().metaData;
                if (bundle3 != null && (i = bundle3.getInt("android.nav.graph")) != 0) {
                    dVar = cVar.a(i);
                }
            }
        }
        if (dVar != null) {
            Object[] objArr7 = {dVar};
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.meituan.navigation.a.a;
            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "e4c4e7a3f7d00b35e43a67cd03ef181f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "e4c4e7a3f7d00b35e43a67cd03ef181f");
                return;
            }
            aVar2.c = dVar;
            aVar2.d = 0;
            aVar2.c();
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfcabb6aa34232b2ba33e0b779b6ac2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfcabb6aa34232b2ba33e0b779b6ac2c");
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(getId());
        return frameLayout;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd94df2c2fe01fbee134059d5dbfc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd94df2c2fe01fbee134059d5dbfc85");
            return;
        }
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        if (view.getParent() != null) {
            view = (View) view.getParent();
        }
        com.sankuai.meituan.navigation.a aVar = this.b;
        Object[] objArr2 = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.navigation.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "32fb81e3b4a786af4699f963177df3d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "32fb81e3b4a786af4699f963177df3d7");
        } else {
            view.setTag(R.id.nav_controller_view_tag, aVar);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Object[] objArr = {context, attributeSet, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b42f9774c90a46d99e1076203bec81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b42f9774c90a46d99e1076203bec81");
            return;
        }
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.navGraph, R.attr.defaultNavHost});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        if (resourceId != 0) {
            Object[] objArr2 = {Integer.valueOf(resourceId)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cc6df1ab75b7e2c2e7545a08ea4ecb4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cc6df1ab75b7e2c2e7545a08ea4ecb4");
            } else if (this.b == null) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("android-support-nav:fragment:graphId", resourceId);
                setArguments(arguments);
            } else {
                this.b.a(resourceId);
            }
        }
        if (z) {
            this.c = true;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Bundle bundle2;
        int i = 0;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857755faab2c604ff00dc9614457b59c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857755faab2c604ff00dc9614457b59c");
            return;
        }
        super.onSaveInstanceState(bundle);
        com.sankuai.meituan.navigation.a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.navigation.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2ff11749db3d18375b98952502dc8668", RobustBitConfig.DEFAULT_VALUE)) {
            bundle2 = (Bundle) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2ff11749db3d18375b98952502dc8668");
        } else {
            Bundle bundle3 = null;
            if (aVar.d != 0) {
                bundle3 = new Bundle();
                bundle3.putInt("android-support-nav:controller:graphId", aVar.d);
            }
            ArrayList<String> arrayList = new ArrayList<>();
            Bundle bundle4 = new Bundle();
            for (Map.Entry<String, Navigator<? extends com.sankuai.meituan.navigation.common.c>> entry : aVar.h.d.entrySet()) {
                String key = entry.getKey();
                if (entry.getValue().b() != null) {
                    arrayList.add(key);
                    bundle4.putBundle(key, entry.getValue().b());
                }
            }
            if (!arrayList.isEmpty()) {
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                bundle4.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                bundle3.putBundle("android-support-nav:controller:navigatorState", bundle4);
            }
            if (!aVar.g.isEmpty()) {
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                int[] iArr = new int[aVar.g.size()];
                for (com.sankuai.meituan.navigation.common.c cVar : aVar.g) {
                    iArr[i] = cVar.d;
                    i++;
                }
                bundle3.putIntArray("android-support-nav:controller:backStackIds", iArr);
            }
            bundle2 = bundle3;
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.c) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @NonNull
    private Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f18b41ba1c7665e8204f785ff84db4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f18b41ba1c7665e8204f785ff84db4f");
        }
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @NonNull
    private FragmentManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f454f919cda8570528af5c10cf3230", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f454f919cda8570528af5c10cf3230");
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }
}
