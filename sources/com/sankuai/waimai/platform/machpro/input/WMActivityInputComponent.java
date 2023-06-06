package com.sankuai.waimai.platform.machpro.input;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.android.mrn.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.n;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.util.b;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMActivityInputComponent extends MPComponent<AppCompatEditText> {
    public static ChangeQuickRedirect a;

    public WMActivityInputComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45f7eda58ca739088014eeca2696875", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45f7eda58ca739088014eeca2696875");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public AppCompatEditText createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa33b1ed743c84144248d243a6f1f36", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppCompatEditText) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa33b1ed743c84144248d243a6f1f36");
        }
        AppCompatEditText appCompatEditText = new AppCompatEditText(this.mMachContext.getContext());
        appCompatEditText.setSingleLine(true);
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setEllipsize(TextUtils.TruncateAt.END);
        appCompatEditText.setGravity(8388627);
        appCompatEditText.setPadding(0, 0, 0, 0);
        appCompatEditText.setBackground(null);
        appCompatEditText.setTextSize(0, b.b(14.0f));
        Object[] objArr2 = {appCompatEditText, -15616};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c1229cbbb406bd266fbf26c719e6357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c1229cbbb406bd266fbf26c719e6357");
        } else if (Build.VERSION.SDK_INT > 28) {
            Object[] objArr3 = {appCompatEditText, -15616};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98c9a649a8e9112adc4051238b0e8cc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98c9a649a8e9112adc4051238b0e8cc8");
            } else {
                Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    textCursorDrawable.setColorFilter(new PorterDuffColorFilter(-15616, PorterDuff.Mode.SRC_IN));
                    appCompatEditText.setTextCursorDrawable(textCursorDrawable);
                }
            }
        } else if (Build.VERSION.SDK_INT != 28) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i = declaredField.getInt(appCompatEditText);
                if (i != 0) {
                    Drawable drawable = ContextCompat.getDrawable(appCompatEditText.getContext(), i);
                    drawable.setColorFilter(-15616, PorterDuff.Mode.SRC_IN);
                    Drawable[] drawableArr = {drawable, drawable};
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(appCompatEditText);
                    Field declaredField3 = ak.a(obj).getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawableArr);
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
        return appCompatEditText;
    }

    @JSMethod(methodName = "focus")
    @Keep
    public void focus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f3982d842de3ccdbc0e8f3786d2e905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f3982d842de3ccdbc0e8f3786d2e905");
        } else if (getView() != null) {
            getView().requestFocus();
            if (this.mMachContext.getContext() instanceof Activity) {
                n.a(getView(), (Activity) this.mMachContext.getContext());
            }
        }
    }

    @JSMethod(methodName = "isFocused")
    @Keep
    public boolean isFocused() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45164a74cc5796147b68a88fde7c5af6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45164a74cc5796147b68a88fde7c5af6")).booleanValue();
        }
        if (getView() != null) {
            return getView().isFocused();
        }
        return false;
    }

    @JSMethod(methodName = "value")
    @Keep
    public String value() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03c59ca06bfd22e18fe28fabacb06c5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03c59ca06bfd22e18fe28fabacb06c5") : getView() != null ? getView().getText().toString() : "";
    }

    @JSMethod(methodName = "setValue")
    @Keep
    public void setValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f6a4f68ac36390aac2edbea8427062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f6a4f68ac36390aac2edbea8427062");
        } else if (getView() != null) {
            getView().setText(str);
            if (str != null) {
                getView().setSelection(str.length());
            }
        }
    }
}
