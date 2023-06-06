package com.sankuai.waimai.ugc.creator.framework;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseFullScreenDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect b;
    private d a;
    protected String c;

    public abstract b a();

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ccc71c73be6e72d4f912ab6b67cf52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ccc71c73be6e72d4f912ab6b67cf52");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.UGCFullScreenDialogFragment);
        this.a = new d() { // from class: com.sankuai.waimai.ugc.creator.framework.BaseFullScreenDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.framework.c
            public final b a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e5dfc8cd5fde6b91feb21d33ef22b90", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e5dfc8cd5fde6b91feb21d33ef22b90") : BaseFullScreenDialogFragment.this.a();
            }
        };
        this.a.c(getActivity(), bundle);
        this.a.a(getActivity(), bundle);
        this.c = getClass().getSimpleName() + System.currentTimeMillis();
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c9b84a5a8b5609a796947307fe01e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c9b84a5a8b5609a796947307fe01e7");
        }
        View b2 = this.a.b();
        Window window = getDialog().getWindow();
        if (window != null) {
            com.sankuai.waimai.ugc.creator.utils.e.a(window, b2);
        }
        return b2;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3df393fcdf17921814fa229f95db5ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3df393fcdf17921814fa229f95db5ce");
            return;
        }
        super.onStart();
        this.a.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c09b70faf7ed5769232a3bd3e7f485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c09b70faf7ed5769232a3bd3e7f485");
            return;
        }
        super.onResume();
        this.a.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecd69a979e0e5fad0a48dc5ed05d3776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecd69a979e0e5fad0a48dc5ed05d3776");
            return;
        }
        this.a.e();
        super.onPause();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e40620f5e6f01eba993aa1da9358e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e40620f5e6f01eba993aa1da9358e1");
            return;
        }
        this.a.f();
        super.onStop();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1217b391fe794812bec070232834374a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1217b391fe794812bec070232834374a");
            return;
        }
        this.a.h();
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c22fdd81b6b02023a4da7d095916e6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c22fdd81b6b02023a4da7d095916e6c8");
            return;
        }
        this.a.g();
        super.onDestroy();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523d6f65c56188019842cccf50334dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523d6f65c56188019842cccf50334dfc");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.a.a(bundle);
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5621d630f17285f55fd9aeb4832dda57", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5621d630f17285f55fd9aeb4832dda57")).booleanValue() : getDialog() != null && getDialog().isShowing();
    }
}
