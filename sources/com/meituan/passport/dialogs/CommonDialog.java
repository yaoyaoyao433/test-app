package com.meituan.passport.dialogs;

import android.graphics.Color;
import android.os.Build;
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
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CommonDialog extends DialogFragment {
    public static ChangeQuickRedirect a;
    private View.OnClickListener b;
    private View.OnClickListener c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private int h;
    private int i;
    private String j;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Expect {
        public static final int CANCEL = 1;
        public static final int CONTINUE = 2;
    }

    public CommonDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8141d0023de54b6e330476f969285bbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8141d0023de54b6e330476f969285bbf");
            return;
        }
        this.g = false;
        this.h = 0;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b6c449825d37f7b0f8d077d8be46c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b6c449825d37f7b0f8d077d8be46c5");
            return;
        }
        super.onCreate(bundle);
        if (ab.a() == 3) {
            setStyle(0, R.style.OperatorLoginDialogTheme);
        } else {
            setStyle(0, R.style.PassportDialogFragment);
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1c9346e46fd8b5f59f6db7a780030d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1c9346e46fd8b5f59f6db7a780030d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63501ef86e1ad8dc12696cedf9387494", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63501ef86e1ad8dc12696cedf9387494");
        }
        if (getDialog() != null) {
            getDialog().setOnKeyListener(new com.meituan.passport.listener.a(this));
        }
        return layoutInflater.inflate(R.layout.passport_dialog, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9946a04e8d3f137394088204891a228d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9946a04e8d3f137394088204891a228d");
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
            if (arguments.containsKey("imageRes")) {
                this.i = arguments.getInt("imageRes", -1);
            }
            if (arguments.containsKey("title")) {
                this.j = arguments.getString("title", null);
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
        textView2.setOnClickListener(b.a(this));
        TextView textView3 = (TextView) view.findViewById(R.id.passport_warning_agree);
        if (this.h == 1) {
            textView3.setTextColor(Color.parseColor("#999999"));
        } else if (this.h == 2) {
            textView3.setTextColor(Color.parseColor("#999999"));
        }
        textView3.setText(this.e);
        if (this.e != null) {
            textView3.setContentDescription(this.e.concat(getString(R.string.passport_accessibility_button)));
        }
        textView3.setOnClickListener(c.a(this));
        ImageView imageView = (ImageView) view.findViewById(R.id.passport_warning_image);
        if (this.i != -1 && this.i != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(this.i);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView4 = (TextView) view.findViewById(R.id.passport_warning_title);
        if (TextUtils.isEmpty(this.j)) {
            textView4.setVisibility(8);
            return;
        }
        textView4.setVisibility(0);
        textView4.setText(this.j);
    }

    public static /* synthetic */ void b(CommonDialog commonDialog, View view) {
        Object[] objArr = {commonDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab3b55c11c15e9d3bffa61fca4facbea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab3b55c11c15e9d3bffa61fca4facbea");
            return;
        }
        if (commonDialog.c != null) {
            commonDialog.c.onClick(view);
        }
        commonDialog.dismissAllowingStateLoss();
    }

    public static /* synthetic */ void a(CommonDialog commonDialog, View view) {
        Object[] objArr = {commonDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53ae77fbcea91eb5ad5e2ca235c629cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53ae77fbcea91eb5ad5e2ca235c629cc");
            return;
        }
        if (commonDialog.b != null) {
            commonDialog.b.onClick(view);
        }
        commonDialog.dismissAllowingStateLoss();
    }
}
