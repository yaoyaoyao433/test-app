package com.meituan.passport.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PassportPasswordEye extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    public EditText b;

    public PassportPasswordEye(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11ef9c5e5def170fad4b5b745e7cc1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11ef9c5e5def170fad4b5b745e7cc1a");
        }
    }

    public PassportPasswordEye(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e49bf49d37a22dbb1d4cdfd429923f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e49bf49d37a22dbb1d4cdfd429923f");
        }
    }

    public PassportPasswordEye(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ebacb9b437cda771c9407f75fa880a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ebacb9b437cda771c9407f75fa880a3");
            return;
        }
        setOnClickListener(i.a(this));
        setTag(0);
        setContentDescription(context.getString(R.string.passport_accessibility_pwd_eye_hide_pwd));
    }

    public static /* synthetic */ void a(PassportPasswordEye passportPasswordEye, View view) {
        Object[] objArr = {passportPasswordEye, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93de5e55df9877152388860e274bfb10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93de5e55df9877152388860e274bfb10");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, passportPasswordEye, changeQuickRedirect2, false, "42be05863688a69f29bd52b65daf65d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, passportPasswordEye, changeQuickRedirect2, false, "42be05863688a69f29bd52b65daf65d7");
            return;
        }
        Context context = passportPasswordEye.getContext();
        if (context != null) {
            if (((Integer) passportPasswordEye.getTag()).intValue() == 0) {
                passportPasswordEye.setTag(1);
                passportPasswordEye.setContentDescription(context.getString(R.string.passport_accessibility_pwd_eye_show_pwd));
            } else {
                passportPasswordEye.setTag(0);
                passportPasswordEye.setContentDescription(context.getString(R.string.passport_accessibility_pwd_eye_hide_pwd));
            }
            passportPasswordEye.a();
        }
    }

    public final void setControlerView(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69df7a7537e0ee8ba0e48619f64cce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69df7a7537e0ee8ba0e48619f64cce2");
            return;
        }
        this.b = editText;
        a();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b131d3f181a105cc5a62c760fc6932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b131d3f181a105cc5a62c760fc6932");
            return;
        }
        Integer num = (Integer) getTag();
        if (num == null) {
            num = 0;
        }
        switch (num.intValue()) {
            case 0:
                setSelected(false);
                if (this.b != null) {
                    this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    if (TextUtils.isEmpty(this.b.getText())) {
                        return;
                    }
                    this.b.setSelection(this.b.getText().length());
                    return;
                }
                return;
            case 1:
                setSelected(true);
                if (this.b != null) {
                    this.b.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    if (TextUtils.isEmpty(this.b.getText())) {
                        return;
                    }
                    this.b.setSelection(this.b.getText().length());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
