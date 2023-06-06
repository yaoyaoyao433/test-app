package com.meituan.passport.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PassportMobileInputView extends RelativeLayout implements com.meituan.passport.clickaction.c<Mobile>, com.meituan.passport.module.a {
    public static ChangeQuickRedirect a;
    public TextWatcher b;
    private PassportEditText c;
    private TextButton d;
    private com.meituan.passport.country.phonecontroler.c e;
    private TextWatcher f;
    private a g;
    private TextWatcher h;
    private View.OnClickListener i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(View view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public PassportMobileInputView(Context context) {
        this(context, null, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87efe4061d68be2c9aecb100a03227fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87efe4061d68be2c9aecb100a03227fd");
        }
    }

    public PassportMobileInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33b3274b6344321a0c3ec360e326fe8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33b3274b6344321a0c3ec360e326fe8");
        }
    }

    public PassportMobileInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799ad1b1359f9739a5635a6f2be41a43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799ad1b1359f9739a5635a6f2be41a43");
            return;
        }
        this.b = new TextWatcher() { // from class: com.meituan.passport.view.PassportMobileInputView.1
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75240f78ac107bc07e9c8149425f8e63", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75240f78ac107bc07e9c8149425f8e63");
                    return;
                }
                if (PassportMobileInputView.this.f != null) {
                    PassportMobileInputView.this.f.beforeTextChanged(charSequence, i2, i3, i4);
                }
                if (PassportMobileInputView.this.h != null) {
                    PassportMobileInputView.this.h.beforeTextChanged(charSequence, i2, i3, i4);
                }
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "095470aa75b185fc0cda1dd84486413f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "095470aa75b185fc0cda1dd84486413f");
                    return;
                }
                if (PassportMobileInputView.this.f != null) {
                    PassportMobileInputView.this.f.onTextChanged(charSequence, i2, i3, i4);
                }
                if (PassportMobileInputView.this.h != null) {
                    PassportMobileInputView.this.h.onTextChanged(charSequence, i2, i3, i4);
                }
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fefc1d868b733e8ce48649514adae86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fefc1d868b733e8ce48649514adae86");
                    return;
                }
                if (PassportMobileInputView.this.f != null) {
                    PassportMobileInputView.this.f.afterTextChanged(editable);
                }
                if (PassportMobileInputView.this.h != null) {
                    PassportMobileInputView.this.h.afterTextChanged(editable);
                }
            }
        };
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47c17c70182e0d93494ab5a5ba235afe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47c17c70182e0d93494ab5a5ba235afe");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.passport_input_mobile, (ViewGroup) this, true);
        this.c = (PassportEditText) inflate.findViewById(R.id.passport_mobile_phone);
        this.d = (TextButton) inflate.findViewById(R.id.passport_country_code);
        PassportClearTextView passportClearTextView = (PassportClearTextView) inflate.findViewById(R.id.passport_mobile_delete);
        if (ab.a() == 1) {
            passportClearTextView.setImageResource(R.drawable.passport_password_close_elder);
            passportClearTextView.setPadding(Utils.a(context, 5.0f), Utils.a(context, 11.5f), Utils.a(context, 5.0f), Utils.a(context, 11.5f));
        }
        passportClearTextView.setControlerView(this.c);
        Utils.a(this.c, context.getString(R.string.passport_please_enter_phone), 18);
        this.c.addTextChangedListener(this.b);
        this.d.setClickAction(g.a(this));
    }

    public static /* synthetic */ void a(PassportMobileInputView passportMobileInputView, View view) {
        Object[] objArr = {passportMobileInputView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72435d525dc5a6305f0759316d1f9061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72435d525dc5a6305f0759316d1f9061");
            return;
        }
        Utils.b(passportMobileInputView.getContext(), passportMobileInputView.c);
        if (passportMobileInputView.g != null) {
            passportMobileInputView.g.a(view);
        }
        if (passportMobileInputView.i != null) {
            passportMobileInputView.i.onClick(view);
        }
    }

    public void setHintTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754a7374cf7f04787fdc49a9298e2db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754a7374cf7f04787fdc49a9298e2db2");
        } else if (getContext() != null) {
            Utils.a(this.c, getContext().getString(R.string.passport_please_enter_phone), i);
        }
    }

    public void setLeftTextSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3393aa221272dc1c86960911994b522b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3393aa221272dc1c86960911994b522b");
        } else {
            this.d.setTextSize(1, f);
        }
    }

    public void setHintTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb95146fdb2bfee7c0e2fdebbb85b885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb95146fdb2bfee7c0e2fdebbb85b885");
        } else if (this.c != null) {
            this.c.setHintTextColor(i);
        }
    }

    public void setLeftTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b4beac96f9816464de9ed11162c3b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b4beac96f9816464de9ed11162c3b3");
        } else if (this.d != null) {
            this.d.setTextColor(i);
        }
    }

    public void setCountryCodeChooseListener(a aVar) {
        this.g = aVar;
    }

    public void setMobileInputTextWatcher(TextWatcher textWatcher) {
        this.h = textWatcher;
    }

    public void setContryCodeClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void a(String str, String str2) {
        Resources resources;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cdcca097ade321892dbdca223d7ae4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cdcca097ade321892dbdca223d7ae4a");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "86";
        }
        if (getContext() == null || (resources = getContext().getResources()) == null) {
            return;
        }
        this.d.setText(resources.getString(R.string.passport_plus_sign, b(str)));
        this.e = com.meituan.passport.c.a().a(a(str));
        this.f = this.e.a(this.c);
        this.c.setText(this.e.a(str2));
        this.c.requestFocus();
        this.c.setSelection(this.c.length());
        this.c.setEnableControler(h.a(this));
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9a875d48d768d06c486d8cad2025565", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9a875d48d768d06c486d8cad2025565")).intValue() : NumberUtils.parseInt(str, 86);
    }

    public String getCountryCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a948018e60a8cdb5e03ae1ffe4b9052", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a948018e60a8cdb5e03ae1ffe4b9052") : b(this.d.getText().toString());
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b6964882545d5f3c27f253ccfa9a3a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b6964882545d5f3c27f253ccfa9a3a") : (TextUtils.isEmpty(str) || TextUtils.isEmpty(str.trim())) ? "86" : str.replace("+", "").trim();
    }

    public String getPhoneNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dddbd6723e2cf15bfbd9818bc09da1e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dddbd6723e2cf15bfbd9818bc09da1e") : this.c.getText().toString().replace(StringUtil.SPACE, "");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.passport.clickaction.c
    public Mobile getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932d0fa8f41c1ef5789e77d6d3f4f183", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mobile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932d0fa8f41c1ef5789e77d6d3f4f183");
        }
        Mobile mobile = new Mobile();
        mobile.countryCode = getCountryCode();
        mobile.number = getPhoneNumber();
        return mobile;
    }

    @Override // com.meituan.passport.module.a
    public final void a(com.meituan.passport.module.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f78d91620cfc1e72dd68109b7b97f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f78d91620cfc1e72dd68109b7b97f4");
        } else {
            this.c.a(bVar);
        }
    }

    public static /* synthetic */ boolean a(PassportMobileInputView passportMobileInputView, Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, passportMobileInputView, changeQuickRedirect, false, "8cb47424eb66f0de86808a57ebf1435f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, passportMobileInputView, changeQuickRedirect, false, "8cb47424eb66f0de86808a57ebf1435f")).booleanValue() : passportMobileInputView.e.a() <= editable.toString().replace(StringUtil.SPACE, "").length();
    }
}
