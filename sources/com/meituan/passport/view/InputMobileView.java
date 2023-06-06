package com.meituan.passport.view;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.aa;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class InputMobileView extends RelativeLayout implements com.meituan.passport.clickaction.c<Mobile>, com.meituan.passport.module.a {
    public static ChangeQuickRedirect a;
    public String b;
    private PassportEditText c;
    private String d;
    private TextButton e;
    private com.meituan.passport.country.phonecontroler.c f;
    private TextWatcher g;
    private PassportEditText.d h;
    private View.OnClickListener i;
    private c j;
    private b k;
    private q l;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        Mobile a();

        void a(Mobile mobile);
    }

    public InputMobileView(Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b5ae68c5f31c68353692dd4fa22da2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b5ae68c5f31c68353692dd4fa22da2");
        }
    }

    public InputMobileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5031e9e277d1229df29b0e2e8ed2a793", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5031e9e277d1229df29b0e2e8ed2a793");
        }
    }

    public InputMobileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188724298c26517fa8524310c4d2e3c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188724298c26517fa8524310c4d2e3c1");
            return;
        }
        this.b = "";
        this.l = q.a(context, "homepage_passport", 2);
        aa.a(context, "homepage_passport", "passport");
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.passport_input_mobile, (ViewGroup) this, true);
            this.c = (PassportEditText) inflate.findViewById(R.id.passport_mobile_phone);
            this.e = (TextButton) inflate.findViewById(R.id.passport_country_code);
            ((PassportClearTextView) inflate.findViewById(R.id.passport_mobile_delete)).setControlerView(this.c);
            Utils.a(this.c, context.getString(R.string.passport_please_enter_phone), 18);
            this.c.addTextChangedListener(new TextWatcher() { // from class: com.meituan.passport.view.InputMobileView.1
                public static ChangeQuickRedirect a;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00dc7f368ccf7b025480928c208937c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00dc7f368ccf7b025480928c208937c3");
                    } else if (InputMobileView.this.g != null) {
                        InputMobileView.this.g.beforeTextChanged(charSequence, i2, i3, i4);
                    }
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f4756225c175e34577a2dd79853d94b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f4756225c175e34577a2dd79853d94b");
                    } else if (InputMobileView.this.g != null) {
                        InputMobileView.this.g.onTextChanged(charSequence, i2, i3, i4);
                    }
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37012e3829dcb6e6eda0a892311af307", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37012e3829dcb6e6eda0a892311af307");
                        return;
                    }
                    if (InputMobileView.this.g != null) {
                        InputMobileView.this.g.afterTextChanged(editable);
                    }
                    if (InputMobileView.this.h != null) {
                        InputMobileView.this.h.a(editable);
                    }
                }
            });
            this.e.setBeforeClickActionListener(com.meituan.passport.view.a.a(this));
            this.e.setClickAction(com.meituan.passport.view.b.a(this));
            a();
            PassportEditText passportEditText = this.c;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.view.c.a;
            passportEditText.setEnableControler(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7f0a88b23961fdb2470aa2f589d89d16", RobustBitConfig.DEFAULT_VALUE) ? (PassportEditText.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7f0a88b23961fdb2470aa2f589d89d16") : new com.meituan.passport.view.c(this));
        }
    }

    public static /* synthetic */ void b(InputMobileView inputMobileView, View view) {
        Object[] objArr = {inputMobileView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c480abecc0879601db30aefecb3b5fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c480abecc0879601db30aefecb3b5fd6");
        } else {
            Utils.b(inputMobileView.getContext(), inputMobileView.c);
        }
    }

    public static /* synthetic */ void a(InputMobileView inputMobileView, View view) {
        Object[] objArr = {inputMobileView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0657a022475fff8b974fe0fdc4355075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0657a022475fff8b974fe0fdc4355075");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, inputMobileView, changeQuickRedirect2, false, "e8622a8cd2effa1ffcbcd55d0ea554c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, inputMobileView, changeQuickRedirect2, false, "e8622a8cd2effa1ffcbcd55d0ea554c3");
            return;
        }
        if (inputMobileView.i != null) {
            inputMobileView.i.onClick(inputMobileView.e);
        }
        inputMobileView.b = inputMobileView.c.getText().toString().replace(StringUtil.SPACE, "");
        if (inputMobileView.k != null) {
            inputMobileView.k.a();
        }
    }

    public final void setHintTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594a288ad9b6102e143a5e0d28ebe964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594a288ad9b6102e143a5e0d28ebe964");
        } else if (getContext() != null) {
            Utils.a(this.c, getContext().getString(R.string.passport_please_enter_phone), i);
        }
    }

    public final void setHintTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c71a27161b664ab32218532a529cc17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c71a27161b664ab32218532a529cc17");
        } else if (this.c != null) {
            this.c.setHintTextColor(i);
        }
    }

    public final void setLeftTextSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29acb33f90d9571385ee3485303d1d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29acb33f90d9571385ee3485303d1d5");
        } else if (this.e != null) {
            this.e.setTextSize(1, f);
        }
    }

    public final void setLeftTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2911639a8be8469d8589632e9ea96583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2911639a8be8469d8589632e9ea96583");
        } else if (this.e != null) {
            this.e.setTextColor(i);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542072815981a15f68f6a2a640ba1e43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542072815981a15f68f6a2a640ba1e43");
            return;
        }
        q qVar = this.l;
        String b2 = qVar.b(str + "_code", "");
        if (TextUtils.isEmpty(b2)) {
            return;
        }
        this.d = b2.replace("+", "");
        q qVar2 = this.l;
        qVar2.b(getClass().getName() + "_country");
        q qVar3 = this.l;
        qVar3.b(getClass().getName() + "_code");
        b();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58de8fbf6e62c691e008c358f63ada4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58de8fbf6e62c691e008c358f63ada4f");
            return;
        }
        if (this.j != null && this.j.a() != null) {
            this.d = this.j.a().countryCode;
            if (this.d != null) {
                this.d = this.d.replace("+", "");
            }
            this.b = this.j.a().number;
        } else {
            this.d = "86";
        }
        b();
    }

    @SuppressLint({"SetTextI18n"})
    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb3f2d281b5e6dba59db00ac78a4064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb3f2d281b5e6dba59db00ac78a4064");
            return;
        }
        int i = 86;
        if (!TextUtils.equals("", this.d)) {
            try {
                i = Integer.parseInt(this.d);
            } catch (Exception unused) {
            }
        }
        TextButton textButton = this.e;
        textButton.setText("+" + i);
        this.f = com.meituan.passport.c.a().a(i);
        this.c.setText(this.f.a(this.b));
        this.g = this.f.a(this.c);
        this.c.requestFocus();
        this.c.setSelection(this.c.length());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.passport.clickaction.c
    public final Mobile getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1384dd2f3ee364b536b8684c54805b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mobile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1384dd2f3ee364b536b8684c54805b26");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3e83909d683f0bf3449c13aa73e8da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3e83909d683f0bf3449c13aa73e8da6");
        } else {
            this.b = this.c.getText().toString().replace(StringUtil.SPACE, "");
            if (this.j != null) {
                this.j.a(new Mobile(this.b, this.d));
            }
        }
        Mobile mobile = new Mobile();
        mobile.countryCode = this.d.replace("+", "");
        mobile.number = this.b;
        return mobile;
    }

    @Override // com.meituan.passport.module.a
    public final void a(com.meituan.passport.module.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560518a81e4edb014c5e45d8398679b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560518a81e4edb014c5e45d8398679b4");
        } else {
            this.c.a(bVar);
        }
    }

    public final void setTextChangeListener(PassportEditText.d dVar) {
        this.h = dVar;
    }

    public final void setDataSource(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d2ddd7840e61d9f2b8c633a6bc1811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d2ddd7840e61d9f2b8c633a6bc1811");
            return;
        }
        this.j = cVar;
        a();
    }

    public final void setChooseCountryListener(b bVar) {
        this.k = bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class CountryInfoBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private a b;
        private q c;

        public CountryInfoBroadcastReceiver(Context context, a aVar) {
            Object[] objArr = {context, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26e9091e0b9f564431c4e56c7fa4d7d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26e9091e0b9f564431c4e56c7fa4d7d");
                return;
            }
            if (context != null) {
                this.c = q.a(context.getApplicationContext(), "homepage_passport", 2);
                aa.a(context.getApplicationContext(), "homepage_passport", "passport");
            }
            this.b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            CountryData countryData;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91d4d8092d268e7135e916bb8eed5da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91d4d8092d268e7135e916bb8eed5da");
            } else if (context == null || intent == null || intent.getAction() == null || this.c == null || !TextUtils.equals(intent.getAction(), CountryData.COUNTRY_INFO) || (extras = intent.getExtras()) == null) {
            } else {
                try {
                    countryData = (CountryData) new Gson().fromJson(extras.getString("data"), (Class<Object>) CountryData.class);
                } catch (Exception e) {
                    com.meituan.passport.utils.m.a(e);
                    countryData = null;
                }
                if (countryData == null) {
                    return;
                }
                String code = countryData.getCode();
                String name = countryData.getName();
                String from = countryData.getFrom();
                this.c.a(from + "_country", name);
                this.c.a(from + "_code", code);
                if (this.b != null) {
                    this.b.a(from);
                }
            }
        }
    }

    public static /* synthetic */ boolean a(InputMobileView inputMobileView, Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, inputMobileView, changeQuickRedirect, false, "b9a40f5c593a6fa23877da85a8dfa12b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, inputMobileView, changeQuickRedirect, false, "b9a40f5c593a6fa23877da85a8dfa12b")).booleanValue() : inputMobileView.f.a() <= editable.toString().replace(StringUtil.SPACE, "").length();
    }
}
