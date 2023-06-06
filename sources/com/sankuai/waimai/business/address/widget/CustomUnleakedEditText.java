package com.sankuai.waimai.business.address.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.RequiresApi;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class CustomUnleakedEditText extends EditText {
    public static ChangeQuickRedirect a;
    private static Field c;
    private ArrayList<TextWatcher> b;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mParent");
            c = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public CustomUnleakedEditText(Context context) {
        super(context.getApplicationContext());
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b227c3cbda9807f7b7e26e9061b23c25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b227c3cbda9807f7b7e26e9061b23c25");
        } else {
            this.b = null;
        }
    }

    public CustomUnleakedEditText(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b815c3bf328b4ad5728c17d598c67fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b815c3bf328b4ad5728c17d598c67fa");
        } else {
            this.b = null;
        }
    }

    public CustomUnleakedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context.getApplicationContext(), attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ebfa59623a204bda2b3bd61f4be199", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ebfa59623a204bda2b3bd61f4be199");
        } else {
            this.b = null;
        }
    }

    @RequiresApi(api = 21)
    public CustomUnleakedEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context.getApplicationContext(), attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51dc3abb136d93e3d3cc5883524ffaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51dc3abb136d93e3d3cc5883524ffaf");
        } else {
            this.b = null;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313f8b80718fb68e8f8708702fd753ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313f8b80718fb68e8f8708702fd753ff");
            return;
        }
        try {
            if (c != null) {
                c.set(this, null);
            }
        } catch (Exception unused) {
        }
        a();
        setOnClickListener(null);
        setOnEditorActionListener(null);
        setOnTouchListener(null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        Object[] objArr = {textWatcher};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56daf598dfd06657d43b79a7869306e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56daf598dfd06657d43b79a7869306e9");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        int indexOf;
        Object[] objArr = {textWatcher};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8abf83b4735735d7a6038747af20286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8abf83b4735735d7a6038747af20286");
            return;
        }
        if (this.b != null && (indexOf = this.b.indexOf(textWatcher)) >= 0) {
            this.b.remove(indexOf);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5875f36e80f484379427ae926686a3dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5875f36e80f484379427ae926686a3dd");
        } else if (this.b != null) {
            Iterator<TextWatcher> it = this.b.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            this.b.clear();
            this.b = null;
        }
    }
}
