package com.sankuai.waimai.ugc.creator.framework;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseFragment extends Fragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect c;
    private d a;
    protected boolean d;
    protected boolean e;

    public abstract b b();

    public BaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f9c35b2cc6ca9583c54782f1605864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f9c35b2cc6ca9583c54782f1605864");
            return;
        }
        this.d = false;
        this.e = false;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48824de401223acb32671dce3b7f45b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48824de401223acb32671dce3b7f45b3");
            return;
        }
        super.onCreate(bundle);
        this.a = new d() { // from class: com.sankuai.waimai.ugc.creator.framework.BaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.framework.c
            public final b a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09bd8a5a919c91edcfe13bbec2f2fc25", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09bd8a5a919c91edcfe13bbec2f2fc25") : BaseFragment.this.b();
            }
        };
        this.a.c(getActivity(), bundle);
        this.a.a(getActivity(), bundle);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349db822f570e4207fa896710058c7a3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349db822f570e4207fa896710058c7a3") : this.a.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d18805477a3d3b79ab9d110025c5be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d18805477a3d3b79ab9d110025c5be");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982a603281a1471bb81297188a8c2657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982a603281a1471bb81297188a8c2657");
            return;
        }
        super.onAttach(context);
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4e89e9e9599b98883f3d4cfd4a6ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4e89e9e9599b98883f3d4cfd4a6ff2");
            return;
        }
        super.onResume();
        this.a.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df8a9228c5c5cfd43ee5e27b20ceffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df8a9228c5c5cfd43ee5e27b20ceffb");
            return;
        }
        super.onStart();
        this.a.c();
        a(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e4b848ad12d6b950d946f9465cad3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e4b848ad12d6b950d946f9465cad3c");
            return;
        }
        this.a.e();
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9788969de0324418cfd37f38f92c3e1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9788969de0324418cfd37f38f92c3e1e");
            return;
        }
        this.a.f();
        super.onStop();
        a(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2508e4dcb96936e2a75f8cf42444dfe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2508e4dcb96936e2a75f8cf42444dfe2");
            return;
        }
        super.onDetach();
        b(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c5a065a4a53b7bc0c7ab14d984ca865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c5a065a4a53b7bc0c7ab14d984ca865");
            return;
        }
        this.a.h();
        super.onDestroyView();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4804bdc1dde64ab10898bd578a9c8c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4804bdc1dde64ab10898bd578a9c8c06");
            return;
        }
        this.a.g();
        super.onDestroy();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3655ab9a5115b4e25f1faf8ce446488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3655ab9a5115b4e25f1faf8ce446488");
        } else {
            b(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da56a0f8093194ecc92b1f4cd8d3bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da56a0f8093194ecc92b1f4cd8d3bb6");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        b(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f12c0e60322170ecce2da472f2d642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f12c0e60322170ecce2da472f2d642");
            return;
        }
        super.onHiddenChanged(z);
        b(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89662475a4eceac2ad59d4b88691daf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89662475a4eceac2ad59d4b88691daf7");
            return;
        }
        super.setUserVisibleHint(z);
        b(z);
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "830a5c0901b74e893adc29e0cb0f8759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "830a5c0901b74e893adc29e0cb0f8759");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.a.a(bundle);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506b2cb7dbe492d50d9bf7721b055dfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506b2cb7dbe492d50d9bf7721b055dfd");
            return;
        }
        this.d = z;
        b(z);
    }

    private void b(boolean z) {
        boolean a;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bdf48b4020c08debba993886a00e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bdf48b4020c08debba993886a00e76");
        } else if (z == this.e || (a = a()) == this.e) {
        } else {
            this.e = a;
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774318d0d320754d8de9a82154f39c58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774318d0d320754d8de9a82154f39c58")).booleanValue();
        }
        return this.d && super.isVisible() && getUserVisibleHint();
    }

    public final boolean a(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4133b84b5ce6be98e01bc3ab608a7dca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4133b84b5ce6be98e01bc3ab608a7dca")).booleanValue() : this.a.a(bVar);
    }
}
