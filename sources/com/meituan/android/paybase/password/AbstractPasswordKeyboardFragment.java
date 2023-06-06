package com.meituan.android.paybase.password;

import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView;
import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractPasswordKeyboardFragment extends PayBaseFragment implements View.OnClickListener, SafeKeyBoardView.a, SafePasswordView.b {
    public static ChangeQuickRedirect b;
    private SafeKeyBoardView a;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    protected TextView c;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    protected TextView d;
    private SafePasswordView e;
    private TextView f;
    private String g;

    public abstract void b(String str);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f675f099cd5800984afd3e3692c87a93", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f675f099cd5800984afd3e3692c87a93");
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225ccf6bc927e6b01e47155bd819a053", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225ccf6bc927e6b01e47155bd819a053") : layoutInflater.inflate(R.layout.paybase__password_keyboard, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5160d43b207a465a490a1473c6cd7e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5160d43b207a465a490a1473c6cd7e32");
            return;
        }
        super.onViewCreated(view, bundle);
        this.c = (TextView) view.findViewById(R.id.top_message);
        this.d = (TextView) view.findViewById(R.id.sub_message);
        this.a = (SafeKeyBoardView) view.findViewById(R.id.safe_keyboard);
        this.e = (SafePasswordView) view.findViewById(R.id.safe_password);
        this.f = (TextView) view.findViewById(R.id.error_tip);
        this.a.setListener(this);
        this.e.setListener(this);
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.b
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c54de77cd77fbca601a71eb334d59d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c54de77cd77fbca601a71eb334d59d8");
        } else if (z) {
            b(str);
        }
    }

    @Override // com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09dc9dad0d231ea8ffb3234ee2194976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09dc9dad0d231ea8ffb3234ee2194976");
        } else if (this.e.d()) {
        } else {
            f();
            this.e.a(str);
        }
    }

    @Override // com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be014dc84c41ede770fa842752fe6700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be014dc84c41ede770fa842752fe6700");
        } else if (this.e.d()) {
        } else {
            f();
            this.e.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d497cbdf1f046c92d56f6b64ba66e400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d497cbdf1f046c92d56f6b64ba66e400");
        } else {
            this.e.b();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bfcad26c4aecc2bfe6f9c828140a0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bfcad26c4aecc2bfe6f9c828140a0e6");
        } else {
            this.e.c();
        }
    }

    public final void a_(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acd632c2a09bc6db43fcf8de79b7fcd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acd632c2a09bc6db43fcf8de79b7fcd9");
            return;
        }
        this.g = str;
        if (this.f == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f.setText(this.g);
        this.f.setTextColor(getResources().getColor(R.color.paybase__text_color_3));
        this.f.setVisibility(0);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255dc3d97a563f3e8a0dc866651fdd74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255dc3d97a563f3e8a0dc866651fdd74");
        } else if (this.f == null || TextUtils.isEmpty(str)) {
        } else {
            this.f.setText(str);
            this.f.setTextColor(getResources().getColor(R.color.paybase__serious_error_text_color));
            this.f.setVisibility(0);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2e86a91026db657aff6c170464e3f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2e86a91026db657aff6c170464e3f4");
        } else if (this.f == null || this.f.getVisibility() != 0) {
        } else {
            if (TextUtils.isEmpty(this.g)) {
                this.f.setVisibility(4);
                return;
            }
            this.f.setText(this.g);
            this.f.setTextColor(getResources().getColor(R.color.paybase__text_color_3));
        }
    }

    public final void a(SafePasswordView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d0def1d9c798b38c09e5e66bfbe08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d0def1d9c798b38c09e5e66bfbe08b");
        } else {
            this.e.setOnAnimationFinish(aVar);
        }
    }
}
