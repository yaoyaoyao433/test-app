package com.sankuai.xm.imui.session;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.g;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.session.entity.SessionParams;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class SessionDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;
    public SessionId b;
    public SessionParams c;
    public SessionFragment d;
    private String e;

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0b6856a2974599f669270667d3ea6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0b6856a2974599f669270667d3ea6b");
            return;
        }
        super.onCreate(bundle);
        SessionActivity.a((Activity) null);
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bb488233a900741f5ab8336f3fb4d7", 6917529027641081856L)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bb488233a900741f5ab8336f3fb4d7");
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return onCreateDialog;
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52df27661d2764f2f11d31fd63bc482", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52df27661d2764f2f11d31fd63bc482");
        }
        View inflate = layoutInflater.inflate(R.layout.xm_sdk_dialog_session, viewGroup, false);
        if (inflate != null) {
            inflate.setFocusableInTouchMode(true);
            inflate.requestFocus();
            inflate.setOnKeyListener(new View.OnKeyListener() { // from class: com.sankuai.xm.imui.session.SessionDialogFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    Object[] objArr2 = {view, Integer.valueOf(i), keyEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7150c490b7793e8f3ddf20bb3a6d310", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7150c490b7793e8f3ddf20bb3a6d310")).booleanValue();
                    }
                    if (keyEvent.getAction() == 0 && i == 4) {
                        SessionDialogFragment.this.dismissAllowingStateLoss();
                        return true;
                    }
                    return false;
                }
            });
        }
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        SessionProvider a2;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ea75867f8841a8081ad7696b8bfdff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ea75867f8841a8081ad7696b8bfdff");
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.b == null || this.c == null) {
            com.sankuai.xm.imui.common.util.d.c("SessionDialogFragment::onViewCreated we wont create dialog view when there is no valid sessionId or session params.", new Object[0]);
            dismissAllowingStateLoss();
            return;
        }
        int a3 = k.a(view.getContext());
        int i = a3 / 2;
        float f = this.c.s;
        View findViewById = view.findViewById(R.id.xm_sdk_placeholder);
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i2 == 0) {
            findViewById.getLayoutParams().height = k.a(view.getContext(), 80.0f);
        } else {
            int i3 = f > 1.0f ? (int) f : f < -1.0f ? ((int) f) + a3 : i2 > 0 ? (int) (a3 * f) : (int) (a3 * (f + 1.0f));
            if (i3 < i) {
                i3 = i;
            }
            findViewById.getLayoutParams().height = a3 - i3;
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.SessionDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8008de8808f74d2aca9c912d876aea2", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8008de8808f74d2aca9c912d876aea2");
                } else {
                    SessionDialogFragment.this.dismissAllowingStateLoss();
                }
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        this.d = (SessionFragment) childFragmentManager.findFragmentById(R.id.xm_sdk_session);
        this.e = com.sankuai.xm.imui.b.a().h();
        if (this.d == null && (a2 = IMUIManager.a().a(this.e)) != null) {
            this.d = a2.createSessionFragment();
        }
        if (this.d == null) {
            this.d = new SessionFragment();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("SessionId", this.b);
        bundle2.putString("ActivityId", this.e);
        bundle2.putParcelable("SessionParams", this.c);
        this.d.setArguments(bundle2);
        this.d.u = new com.sankuai.xm.imui.session.presenter.b(this.d);
        childFragmentManager.beginTransaction().replace(R.id.xm_sdk_session, this.d).commitNowAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cfad9b039ced8a3192187c984ddd14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cfad9b039ced8a3192187c984ddd14");
            return;
        }
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setWindowAnimations(R.style.xm_sdk_dialog_UpToDownDismissAnim);
        }
        super.onPause();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public final void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63c85de9ad0aa7524839644ec1d9729", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63c85de9ad0aa7524839644ec1d9729");
            return;
        }
        this.d = null;
        Dialog dialog = getDialog();
        super.onDestroyView();
        dismissAllowingStateLoss();
        ActivityUtils.c(getActivity());
        g.a((Object) dialog);
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcca8bd22c51162878f3d745fc21701f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcca8bd22c51162878f3d745fc21701f");
            return;
        }
        IMUIManager.a().a(this.e, (SessionProvider) null);
        com.sankuai.xm.imui.b.a().a(this.b, this.e);
        super.onDestroy();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f16b0c9582ab150e5ab1c5f085e13f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f16b0c9582ab150e5ab1c5f085e13f0");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            dismissAllowingStateLoss();
        } else {
            m.e().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.SessionDialogFragment.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0b67a6e3950c22fc22e53693a39d9a6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0b67a6e3950c22fc22e53693a39d9a6");
                    } else {
                        SessionDialogFragment.this.dismissAllowingStateLoss();
                    }
                }
            }));
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c673dd4c5ffc0c1e92da78c69da00ecc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c673dd4c5ffc0c1e92da78c69da00ecc");
            return;
        }
        try {
            super.dismissAllowingStateLoss();
        } catch (Throwable th) {
            com.sankuai.xm.imui.common.util.d.a(th, "SessionDialogFragment::dismissAllowingStateLoss.", new Object[0]);
        }
    }

    public final void a(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a5ca7823dc851a3ee035bec1cea4b27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a5ca7823dc851a3ee035bec1cea4b27");
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(this, str);
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Nullable
    public static SessionDialogFragment a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ad5150b67b51fe50a6566fef91f1ebb", 6917529027641081856L)) {
            return (SessionDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ad5150b67b51fe50a6566fef91f1ebb");
        }
        Activity a2 = ActivityUtils.a(context);
        if (a2 instanceof FragmentActivity) {
            return (SessionDialogFragment) ((FragmentActivity) a2).getSupportFragmentManager().findFragmentByTag("xm_sdk_session_dialog_fragment");
        }
        return null;
    }
}
