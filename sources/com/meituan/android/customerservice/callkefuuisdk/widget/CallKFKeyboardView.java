package com.meituan.android.customerservice.callkefuuisdk.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.android.customerservice.kit.widget.AutoFitTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallKFKeyboardView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private AutoFitTextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;

    public CallKFKeyboardView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b46beaf710c41398d1e7fcab81752211", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b46beaf710c41398d1e7fcab81752211");
        } else {
            a();
        }
    }

    public CallKFKeyboardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7402758d645cf34914c8f90bb4070a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7402758d645cf34914c8f90bb4070a");
        } else {
            a();
        }
    }

    public CallKFKeyboardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01dafce712fc10def989def52dcdb228", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01dafce712fc10def989def52dcdb228");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "155abc5d2a6b045628c4808f82bb1aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "155abc5d2a6b045628c4808f82bb1aeb");
            return;
        }
        inflate(getContext(), R.layout.cs_voip_view_keyboard, this);
        this.b = (AutoFitTextView) findViewById(R.id.tv_number_input);
        this.c = (TextView) findViewById(R.id.tv_number_one);
        this.d = (TextView) findViewById(R.id.tv_number_two);
        this.e = (TextView) findViewById(R.id.tv_number_three);
        this.f = (TextView) findViewById(R.id.tv_number_four);
        this.g = (TextView) findViewById(R.id.tv_number_five);
        this.h = (TextView) findViewById(R.id.number_six);
        this.i = (TextView) findViewById(R.id.tv_number_seven);
        this.j = (TextView) findViewById(R.id.tv_number_eight);
        this.k = (TextView) findViewById(R.id.tv_number_nine);
        this.l = (TextView) findViewById(R.id.tv_number_asterisk);
        this.m = (TextView) findViewById(R.id.tv_number_zero);
        this.n = (TextView) findViewById(R.id.tv_number_sign);
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c89c90a8efe0de43da60ff0e556e189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c89c90a8efe0de43da60ff0e556e189");
            return;
        }
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        this.f.setOnClickListener(onClickListener);
        this.g.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.j.setOnClickListener(onClickListener);
        this.k.setOnClickListener(onClickListener);
        this.l.setOnClickListener(onClickListener);
        this.m.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
    }

    public TextView getNumberInput() {
        return this.b;
    }

    public void setInputText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03af11b96d52341a14106805df843555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03af11b96d52341a14106805df843555");
        } else {
            this.b.setText(charSequence);
        }
    }
}
