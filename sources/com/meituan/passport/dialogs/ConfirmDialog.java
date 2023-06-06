package com.meituan.passport.dialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.ag;
import com.meituan.passport.utils.SpannableHelper;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ConfirmDialog extends DialogFragment {
    public static ChangeQuickRedirect a;
    View.OnClickListener b;
    View.OnClickListener c;
    View.OnClickListener d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private int k;
    private int l;
    private boolean m;
    private String n;
    private boolean o;
    private com.meituan.passport.listener.a p;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Expect {
        public static final int AGREE = 2;
        public static final int CLICK = 3;
        public static final int REJECT = 1;
    }

    public ConfirmDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940f1ef013d59b5efb1610ee708db7f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940f1ef013d59b5efb1610ee708db7f4");
        } else {
            this.k = 0;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f693a4ee72d1b18b38ab304c4d9d222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f693a4ee72d1b18b38ab304c4d9d222");
            return;
        }
        this.m = Utils.c();
        super.onCreate(bundle);
        if (ab.a() == 3) {
            setStyle(0, R.style.OperatorLoginDialogTheme);
        } else {
            setStyle(0, R.style.PassportDialogFragment);
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments.containsKey("title")) {
                this.e = arguments.getString("title");
            }
            if (arguments.containsKey("message")) {
                this.f = arguments.getString("message");
            }
            if (arguments.containsKey("messageResourceId")) {
                this.g = arguments.getInt("messageResourceId", -1);
            }
            if (arguments.containsKey("agreeButtonText")) {
                this.h = arguments.getString("agreeButtonText", getString(R.string.passport_elder_agree));
            } else {
                this.h = getString(R.string.passport_elder_agree);
            }
            if (arguments.containsKey("rejectButtonText")) {
                this.i = arguments.getString("rejectButtonText", getString(R.string.passport_elder_reject));
            } else {
                this.i = getString(R.string.passport_elder_reject);
            }
            if (arguments.containsKey("clickButtonText")) {
                this.j = arguments.getString("clickButtonText", getString(R.string.passport_elder_agree));
            } else {
                this.j = getString(R.string.passport_elder_agree);
            }
            this.k = arguments.getInt("expect", 0);
            this.l = arguments.getInt("layout", R.layout.passport_fragment_elder_privacy_agreement_dialog);
            this.n = arguments.getString("operatorType", "-1");
            this.o = arguments.getBoolean("hasAgreement", false);
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d3063fdfceb93300c127eb57d2e926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d3063fdfceb93300c127eb57d2e926");
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666bd5dab64a506e81f8c623a5aca8f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666bd5dab64a506e81f8c623a5aca8f5");
        }
        if (getDialog() != null) {
            this.p = new com.meituan.passport.listener.a(this);
            getDialog().setOnKeyListener(this.p);
        }
        return layoutInflater.inflate(this.l, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0725e43ea325b2a6297ece7294869c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0725e43ea325b2a6297ece7294869c54");
            return;
        }
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.passport_privacy_agreement_message);
        TextView textView2 = (TextView) view.findViewById(R.id.passport_privacy_agreement_title);
        if (!TextUtils.isEmpty(this.e)) {
            textView2.setVisibility(0);
            textView2.setText(this.e);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = Utils.a(getContext(), 6.0f);
            textView.setLayoutParams(layoutParams);
            if (ab.a() == 1) {
                textView.setTextSize(16.0f);
            } else {
                textView.setTextSize(14.0f);
            }
        }
        if (!TextUtils.isEmpty(this.f)) {
            textView.setText(this.f);
        } else if (-1 != this.g) {
            textView.setText(this.g);
        }
        if (this.m && this.o && textView != null && textView.getText() != null) {
            textView.setText(Utils.a(getContext(), textView.getText().toString(), this.n));
        }
        textView.setMovementMethod(ag.a());
        SpannableHelper.a(textView);
        TextView textView3 = (TextView) view.findViewById(R.id.passport_privacy_agreement_reject);
        textView3.setText(this.i);
        if (this.i != null) {
            textView3.setContentDescription(this.i.concat(getString(R.string.passport_accessibility_button)));
        }
        textView3.setOnClickListener(d.a(this));
        TextView textView4 = (TextView) view.findViewById(R.id.passport_privacy_agreement_agree);
        TextView textView5 = (TextView) view.findViewById(R.id.passport_privacy_agreement_click);
        if (this.k == 1) {
            textView3.setTextColor(Utils.a((Context) getActivity(), 2));
            textView4.setTextColor(Utils.b(getActivity(), 2));
        } else if (this.k == 2) {
            textView4.setTextColor(Utils.a((Context) getActivity(), 2));
            textView3.setTextColor(Utils.b(getActivity(), 2));
        } else if (this.k == 3) {
            textView4.setVisibility(4);
            textView3.setVisibility(4);
            textView5.setVisibility(0);
            textView5.setTextColor(Utils.a((Context) getActivity(), 1));
        }
        textView4.setText(this.h);
        if (this.h != null) {
            textView4.setContentDescription(this.h.concat(getString(R.string.passport_accessibility_button)));
        }
        textView4.setOnClickListener(e.a(this));
        textView5.setText(this.j);
        textView5.setOnClickListener(f.a(this));
    }

    public static /* synthetic */ void c(ConfirmDialog confirmDialog, View view) {
        Object[] objArr = {confirmDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3fe6bbe815382c9e3b5131b8d2981df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3fe6bbe815382c9e3b5131b8d2981df");
            return;
        }
        if (confirmDialog.b != null) {
            confirmDialog.b.onClick(view);
        }
        if (confirmDialog.p != null) {
            confirmDialog.p.a();
        }
    }

    public static /* synthetic */ void b(ConfirmDialog confirmDialog, View view) {
        Object[] objArr = {confirmDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bccb4289bee58ec1318b237fac26521c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bccb4289bee58ec1318b237fac26521c");
            return;
        }
        if (confirmDialog.c != null) {
            confirmDialog.c.onClick(view);
        }
        if (confirmDialog.p != null) {
            confirmDialog.p.a();
        }
    }

    public static /* synthetic */ void a(ConfirmDialog confirmDialog, View view) {
        Object[] objArr = {confirmDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bbf72c1b989ebd98994cf265f296e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bbf72c1b989ebd98994cf265f296e90");
            return;
        }
        if (confirmDialog.d != null) {
            confirmDialog.d.onClick(view);
        }
        if (confirmDialog.p != null) {
            confirmDialog.p.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public int d;
        public String e;
        public String f;
        public String g;
        public View.OnClickListener h;
        public View.OnClickListener i;
        public View.OnClickListener j;
        public int k;
        public int l;
        public String m;
        public boolean n;

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33507d521e7edeadd25f7ba38ee1b79d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33507d521e7edeadd25f7ba38ee1b79d") : new a();
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d8ca26a53581bda32590bcb4b259ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d8ca26a53581bda32590bcb4b259ac");
                return;
            }
            this.d = -1;
            this.k = 0;
            this.l = R.layout.passport_fragment_elder_privacy_agreement_dialog;
        }

        public final ConfirmDialog b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d2309c26b152b4a5da85032daf4120a", RobustBitConfig.DEFAULT_VALUE)) {
                return (ConfirmDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d2309c26b152b4a5da85032daf4120a");
            }
            ConfirmDialog confirmDialog = new ConfirmDialog();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.b)) {
                bundle.putString("title", this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                bundle.putString("message", this.c);
            }
            if (-1 != this.d) {
                bundle.putInt("messageResourceId", this.d);
            }
            if (!TextUtils.isEmpty(this.e)) {
                bundle.putString("agreeButtonText", this.e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                bundle.putString("rejectButtonText", this.f);
            }
            if (!TextUtils.isEmpty(this.g)) {
                bundle.putString("clickButtonText", this.g);
            }
            if (!TextUtils.isEmpty(this.m)) {
                bundle.putString("operatorType", this.m);
            }
            bundle.putBoolean("hasAgreement", this.n);
            bundle.putInt("expect", this.k);
            bundle.putInt("layout", this.l);
            confirmDialog.setArguments(bundle);
            confirmDialog.c = this.h;
            confirmDialog.b = this.i;
            confirmDialog.d = this.j;
            return confirmDialog;
        }
    }
}
