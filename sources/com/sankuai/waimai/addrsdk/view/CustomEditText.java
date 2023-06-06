package com.sankuai.waimai.addrsdk.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class CustomEditText extends EditText {
    public static ChangeQuickRedirect a;
    private static Field b;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mParent");
            b = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    public CustomEditText(Context context) {
        super(context.getApplicationContext());
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe710389ed4ce799777bc82727b8b28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe710389ed4ce799777bc82727b8b28");
        }
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7604c759af8559e5dc22e71183a92d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7604c759af8559e5dc22e71183a92d");
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d3a5d41dfe2f70cc6d101a213d0e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d3a5d41dfe2f70cc6d101a213d0e6d");
            return;
        }
        try {
            if (b != null) {
                b.set(this, null);
            }
        } catch (Throwable unused) {
        }
        setOnFocusChangeListener(null);
        super.onDetachedFromWindow();
    }
}
