package com.meituan.msi.api.component.picker.dialog;

import android.app.Activity;
import android.widget.NumberPicker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DatePickerDialog extends BasePickerDialog {
    public static ChangeQuickRedirect e;
    private NumberPicker f;
    private NumberPicker g;
    private NumberPicker h;
    private NumberPicker.OnValueChangeListener i;
    private NumberPicker.OnValueChangeListener j;

    public DatePickerDialog(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a92bf8aef976b3c597d30b3d8148f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a92bf8aef976b3c597d30b3d8148f1");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msi.api.component.picker.bean.DatePickerParam r21) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.component.picker.dialog.DatePickerDialog.a(com.meituan.msi.api.component.picker.bean.DatePickerParam):void");
    }
}
