package com.sankuai.waimai.platform.widget.popup;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNPopupFragment extends MRNBaseFragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect a;
    a b;
    private Activity c;
    private View g;
    private View h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public static MRNPopupFragment a(String str, String str2, String str3, Bundle... bundleArr) {
        Object[] objArr = {str, str2, str3, bundleArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "702a610fa77a43b936a9761dc922ce66", RobustBitConfig.DEFAULT_VALUE)) {
            return (MRNPopupFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "702a610fa77a43b936a9761dc922ce66");
        }
        Bundle bundle = new Bundle();
        MRNPopupFragment mRNPopupFragment = new MRNPopupFragment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        for (int i = 0; i <= 0; i++) {
            Bundle bundle2 = bundleArr[0];
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
        mRNPopupFragment.setArguments(bundle);
        return mRNPopupFragment;
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, final boolean z, int i2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678ab76d7ea6b9c9900f2ee13fb81716", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678ab76d7ea6b9c9900f2ee13fb81716");
        }
        if (getArguments() == null) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.platform.widget.popup.MRNPopupFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "935ab6b3fc4a4b7edbf397794e2aac71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "935ab6b3fc4a4b7edbf397794e2aac71");
                } else if (MRNPopupFragment.this.b != null) {
                    MRNPopupFragment.this.b.a(z);
                }
            }
        });
        return loadAnimation;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e2f8a138fab9264bbf6a72ab7e07a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e2f8a138fab9264bbf6a72ab7e07a2");
            return;
        }
        super.onAttach(activity);
        this.c = activity;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef22f6cb0ac579eb797702d597f11b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef22f6cb0ac579eb797702d597f11b23");
            return;
        }
        super.onCreate(bundle);
        this.c = getActivity();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84acea639c5b40d2dbe8fc4e1262221c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84acea639c5b40d2dbe8fc4e1262221c");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.g != null) {
            this.g.setVisibility(8);
        }
        if (onCreateView != null && getArguments() != null && getArguments().containsKey("arg_background_color")) {
            onCreateView.setBackgroundColor(getArguments().getInt("arg_background_color"));
        }
        return onCreateView;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c1cc84c4a6a0c269a5f9740649f5de", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c1cc84c4a6a0c269a5f9740649f5de");
        }
        this.g = LayoutInflater.from(context).inflate(R.layout.wm_common_mrn_popup_loading_loading_view, (ViewGroup) null);
        return this.g;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0dde27c6fbdc069443685bb8a3db0a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0dde27c6fbdc069443685bb8a3db0a8");
        }
        this.h = new View(context);
        this.h.setVisibility(8);
        return this.h;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a446d2ee64446e1f7e0f7ae98495860d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a446d2ee64446e1f7e0f7ae98495860d");
        } else {
            super.i();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4e1bc9f2a7e9e82af8687b17a5c76b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4e1bc9f2a7e9e82af8687b17a5c76b");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.e("MRNPopupFragment", "showErrorView", new Object[0]);
        if (this.h != null) {
            this.h.setVisibility(8);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d37bf09fa997b51eaae4154bcee7a30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d37bf09fa997b51eaae4154bcee7a30");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.e("MRNPopupFragment", "showRootView", new Object[0]);
        super.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636c7d015cb951cd74cd13e03303d43e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636c7d015cb951cd74cd13e03303d43e");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d9597055ca1b9679b5043ec09d30dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d9597055ca1b9679b5043ec09d30dd");
        }
        Uri.Builder builder = new Uri.Builder();
        if (getArguments() != null) {
            for (String str : getArguments().keySet()) {
                builder.appendQueryParameter(str, String.valueOf(getArguments().get(str)));
            }
        }
        return builder.build();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fab0c56dd00bd02c738ac5dbae7848", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fab0c56dd00bd02c738ac5dbae7848");
        }
        List<i> d = super.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.platform.widget.popup.MRNPopupFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            @NonNull
            public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68933821520c0f85bed4b02861a00b59", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68933821520c0f85bed4b02861a00b59");
                }
                MRNPopupFragment mRNPopupFragment = MRNPopupFragment.this;
                Object[] objArr3 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect3 = MRNPopupFragment.a;
                return PatchProxy.isSupport(objArr3, mRNPopupFragment, changeQuickRedirect3, false, "8a48f5faa2fcf187c5d1fbcffd3dbf80", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, mRNPopupFragment, changeQuickRedirect3, false, "8a48f5faa2fcf187c5d1fbcffd3dbf80") : Collections.emptyList();
            }

            @Override // com.facebook.react.i
            @NonNull
            public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f87c6f7e7d3d459fc946c3e319845a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f87c6f7e7d3d459fc946c3e319845a0");
                }
                MRNPopupFragment mRNPopupFragment = MRNPopupFragment.this;
                Object[] objArr3 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect3 = MRNPopupFragment.a;
                return PatchProxy.isSupport(objArr3, mRNPopupFragment, changeQuickRedirect3, false, "7fdb60e9db0ae0709a4414cb930023d1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, mRNPopupFragment, changeQuickRedirect3, false, "7fdb60e9db0ae0709a4414cb930023d1") : Collections.emptyList();
            }
        });
        if (d != null) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498172a9d19eebf8cc0e846b01546fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498172a9d19eebf8cc0e846b01546fbf");
        } else {
            view.removeOnAttachStateChangeListener(this);
        }
    }
}
