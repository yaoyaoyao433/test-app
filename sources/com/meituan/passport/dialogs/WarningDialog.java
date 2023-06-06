package com.meituan.passport.dialogs;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class WarningDialog extends DialogFragment {
    public static ChangeQuickRedirect a;
    View.OnClickListener b;
    View.OnClickListener c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private int h;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Expect {
        public static final int CANCEL = 1;
        public static final int CONTINUE = 2;
    }

    public WarningDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32bf7e0d2ed4c52b318438f30db1ef82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32bf7e0d2ed4c52b318438f30db1ef82");
            return;
        }
        this.g = false;
        this.h = 0;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6ce140bbf62cd7f4088107b06d2611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6ce140bbf62cd7f4088107b06d2611");
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.PassportDialogFragment);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e400a9a9d663fead44c18418924fb7de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e400a9a9d663fead44c18418924fb7de");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0c5c3fc5ccbb66fb3d096ce3be9aca", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0c5c3fc5ccbb66fb3d096ce3be9aca") : layoutInflater.inflate(R.layout.passport_fragment_warning, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3e3fd219fba5c24c0356223399f7dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3e3fd219fba5c24c0356223399f7dd");
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments.containsKey("message")) {
                this.d = arguments.getString("message");
            }
            if (arguments.containsKey("continueButtonText")) {
                this.e = arguments.getString("continueButtonText", getString(R.string.passport_continue));
            } else {
                this.e = getString(R.string.passport_continue);
            }
            if (arguments.containsKey("cancelButtonText")) {
                this.f = arguments.getString("cancelButtonText", getString(R.string.passport_cancel));
            } else {
                this.f = getString(R.string.passport_cancel);
            }
            this.g = arguments.getBoolean("Small", false);
            this.h = arguments.getInt("Expect", 0);
        }
        if (this.g) {
            view.findViewById(R.id.passport_warning_bg).setPadding(Utils.a(getContext(), 50.0f), Utils.a(getContext(), 105.0f), Utils.a(getContext(), 50.0f), Utils.a(getContext(), 105.0f));
        }
        TextView textView = (TextView) view.findViewById(R.id.passport_warning_message);
        textView.setText(this.d);
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setBreakStrategy(0);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.passport_warning_cancel);
        textView2.setText(this.f);
        if (this.f != null) {
            textView2.setContentDescription(this.f.concat(getString(R.string.passport_accessibility_button)));
        }
        textView2.setOnClickListener(t.a(this));
        TextView textView3 = (TextView) view.findViewById(R.id.passport_warning_agree);
        if (this.h == 1) {
            textView2.setTextColor(Utils.a((Context) getActivity(), 1));
            textView3.setTextColor(Utils.b(getActivity(), 1));
        } else if (this.h == 2) {
            textView3.setTextColor(Utils.a((Context) getActivity(), 1));
            textView2.setTextColor(Utils.b(getActivity(), 1));
        }
        textView3.setText(this.e);
        if (this.e != null) {
            textView3.setContentDescription(this.e.concat(getString(R.string.passport_accessibility_button)));
        }
        textView3.setOnClickListener(u.a(this));
    }

    public static /* synthetic */ void b(WarningDialog warningDialog, View view) {
        Object[] objArr = {warningDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c3cb1be3bd12b20c6f3789a1648ef13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c3cb1be3bd12b20c6f3789a1648ef13");
            return;
        }
        if (warningDialog.c != null) {
            warningDialog.c.onClick(view);
        }
        warningDialog.dismissAllowingStateLoss();
    }

    public static /* synthetic */ void a(WarningDialog warningDialog, View view) {
        Object[] objArr = {warningDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5be676fac042e92e29a3165b297239ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5be676fac042e92e29a3165b297239ca");
            return;
        }
        if (warningDialog.b != null) {
            warningDialog.b.onClick(view);
        }
        warningDialog.dismissAllowingStateLoss();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public View.OnClickListener e;
        public View.OnClickListener f;
        boolean g;
        public int h;

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c25446f355696ca042b04d26daf3454", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c25446f355696ca042b04d26daf3454") : new a();
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c69c4d799fed81c6390c0e836918628", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c69c4d799fed81c6390c0e836918628");
                return;
            }
            this.g = false;
            this.h = 0;
        }

        public final WarningDialog b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc66d68d36d2a2c81488fb6dafdfe6bb", RobustBitConfig.DEFAULT_VALUE)) {
                return (WarningDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc66d68d36d2a2c81488fb6dafdfe6bb");
            }
            WarningDialog warningDialog = new WarningDialog();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.b)) {
                bundle.putString("message", this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                bundle.putString("continueButtonText", this.c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                bundle.putString("cancelButtonText", this.d);
            }
            bundle.putBoolean("Small", this.g);
            bundle.putInt("Expect", this.h);
            warningDialog.setArguments(bundle);
            warningDialog.b = this.e;
            warningDialog.c = this.f;
            return warningDialog;
        }
    }
}
