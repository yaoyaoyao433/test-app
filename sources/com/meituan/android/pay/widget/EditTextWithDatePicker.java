package com.meituan.android.pay.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.pay.utils.j;
import com.meituan.android.paybase.utils.ai;
import com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog;
import com.meituan.android.paybase.widgets.wheelview.WheelViewDatePickerDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EditTextWithDatePicker extends EditTextWithClearAndHelpButton implements WheelViewChooseDialog.b {
    public static ChangeQuickRedirect a;
    private WheelViewChooseDialog n;

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton
    public final void a(View view, boolean z) {
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton
    public final boolean b() {
        return false;
    }

    public EditTextWithDatePicker(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a3fe1920cee35f254a63a37720126a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a3fe1920cee35f254a63a37720126a");
        } else {
            d();
        }
    }

    public EditTextWithDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18cd2474a6e7f13fce2fbd34791f980", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18cd2474a6e7f13fce2fbd34791f980");
        } else {
            d();
        }
    }

    public EditTextWithDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844f984450be5fc80d9ca9e521213aba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844f984450be5fc80d9ca9e521213aba");
        } else {
            d();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa9e71fc5f898a9a084c08f04f311a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa9e71fc5f898a9a084c08f04f311a1");
            return;
        }
        setOnFocusChangeListener(this);
        setRawInputType(0);
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton
    public final boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a61428aaead8d4840438edc79a427c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a61428aaead8d4840438edc79a427c")).booleanValue();
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        if (!this.e) {
            if (motionEvent.getX() > (getWidth() - getPaddingRight()) - this.d.getIntrinsicWidth()) {
                if (this.k != null) {
                    j.a(this.k, this);
                }
            } else {
                e();
            }
        } else if (motionEvent.getX() > (getWidth() - getPaddingRight()) - this.c.getIntrinsicWidth()) {
            setText("");
            c();
        } else if (isFocusable()) {
            e();
        }
        if (this.j != null) {
            this.j.a();
        }
        if (this.f != null) {
            this.f.a(this, true);
        }
        return false;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0aeab5f8390adf327256f14740053ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0aeab5f8390adf327256f14740053ab");
            return;
        }
        if (this.n == null) {
            this.n = new WheelViewDatePickerDialog(getContext(), this);
        }
        this.n.show();
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72abd147edd5e3b900d7854d70c974f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72abd147edd5e3b900d7854d70c974f");
            return;
        }
        super.onFocusChange(view, z);
        if (z) {
            ai.a(view);
        }
    }

    @Override // com.meituan.android.pay.widget.EditTextWithClearAndHelpButton, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c37b7aacb1c554e07b75c370ab9140", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c37b7aacb1c554e07b75c370ab9140")).booleanValue() : super.onTouch(view, motionEvent);
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.WheelViewChooseDialog.b
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d15b55c46cacd8a06728278b009bc0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d15b55c46cacd8a06728278b009bc0c");
            return;
        }
        int parseInt = Integer.parseInt(obj.toString());
        int parseInt2 = Integer.parseInt(obj2.toString());
        StringBuilder sb = new StringBuilder();
        if (parseInt < 10) {
            sb.append("0" + parseInt);
        } else {
            sb.append(parseInt);
        }
        sb.append("/");
        sb.append(parseInt2 % 100);
        setText(sb.toString());
    }
}
