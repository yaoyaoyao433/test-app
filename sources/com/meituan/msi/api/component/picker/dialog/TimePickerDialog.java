package com.meituan.msi.api.component.picker.dialog;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.NumberPicker;
import com.meituan.msi.api.component.picker.bean.TimePickerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TimePickerDialog extends BasePickerDialog {
    public static ChangeQuickRedirect e;
    private final SimpleDateFormat f;
    private NumberPicker g;
    private NumberPicker h;
    private final NumberPicker.Formatter i;

    public TimePickerDialog(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e74fb2055fb9688a35933db7235c83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e74fb2055fb9688a35933db7235c83");
            return;
        }
        this.f = new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.getDefault());
        this.i = new NumberPicker.Formatter() { // from class: com.meituan.msi.api.component.picker.dialog.TimePickerDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.NumberPicker.Formatter
            public final String format(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8974d1fa6750d726ac6615fc79b8105", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8974d1fa6750d726ac6615fc79b8105");
                }
                if (i < 10) {
                    return "0" + i;
                }
                return String.valueOf(i);
            }
        };
    }

    public final void a(TimePickerParam timePickerParam) throws IllegalArgumentException {
        Object[] objArr = {timePickerParam};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670436413685364dcbf3e04b11a334e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670436413685364dcbf3e04b11a334e2");
        } else if (timePickerParam == null) {
            throw new IllegalArgumentException("param is null");
        } else {
            if (timePickerParam.range == null) {
                throw new IllegalArgumentException("range is null");
            }
            String str = timePickerParam.range.start;
            String str2 = timePickerParam.range.end;
            String str3 = timePickerParam.current;
            Object[] objArr2 = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42c396ac143d5157d4b8b52606fa53a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42c396ac143d5157d4b8b52606fa53a7");
            } else {
                NumberPicker[] a = a(2, CommonConstant.Symbol.COLON);
                this.g = a[0];
                this.h = a[1];
                final Calendar calendar = Calendar.getInstance();
                final Calendar calendar2 = Calendar.getInstance();
                Calendar calendar3 = Calendar.getInstance();
                try {
                    SimpleDateFormat simpleDateFormat = this.f;
                    if (TextUtils.isEmpty(str)) {
                        str = "00:00";
                    }
                    calendar.setTime(simpleDateFormat.parse(str));
                    SimpleDateFormat simpleDateFormat2 = this.f;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "23:59";
                    }
                    calendar2.setTime(simpleDateFormat2.parse(str2));
                    calendar3.setTime(this.f.parse(str3));
                    if (calendar2.before(calendar) || calendar3.before(calendar) || calendar3.after(calendar2)) {
                        throw new IllegalArgumentException("range error");
                    }
                    this.g.setFormatter(this.i);
                    this.h.setFormatter(this.i);
                    this.g.setMaxValue(calendar2.get(11));
                    this.g.setMinValue(calendar.get(11));
                    this.g.setValue(calendar3.get(11));
                    NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener() { // from class: com.meituan.msi.api.component.picker.dialog.TimePickerDialog.2
                        public static ChangeQuickRedirect a;

                        @Override // android.widget.NumberPicker.OnValueChangeListener
                        public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
                            Object[] objArr3 = {numberPicker, Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b63be4bea88641854e9e01cfa14c4d6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b63be4bea88641854e9e01cfa14c4d6");
                                return;
                            }
                            int i3 = i2 == calendar2.get(11) ? calendar2.get(12) : 59;
                            int i4 = i2 == calendar.get(11) ? calendar.get(12) : 0;
                            TimePickerDialog.this.h.setMaxValue(i3);
                            TimePickerDialog.this.h.setMinValue(i4);
                        }
                    };
                    this.g.setOnValueChangedListener(onValueChangeListener);
                    onValueChangeListener.onValueChange(this.g, 0, calendar3.get(11));
                    this.h.setValue(calendar3.get(12));
                } catch (ParseException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9c1c8f81adb948b349516c87c37432a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9c1c8f81adb948b349516c87c37432a");
            } else {
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.component.picker.dialog.TimePickerDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d7f7d0e01516b6e52fdf76303bef6945", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d7f7d0e01516b6e52fdf76303bef6945");
                        } else if (TimePickerDialog.this.g == null || TimePickerDialog.this.h == null) {
                        } else {
                            HashMap hashMap = new HashMap();
                            String format = TimePickerDialog.this.i.format(TimePickerDialog.this.g.getValue());
                            String format2 = TimePickerDialog.this.i.format(TimePickerDialog.this.h.getValue());
                            hashMap.put("value", format + CommonConstant.Symbol.COLON + format2);
                            if (TimePickerDialog.this.d != null) {
                                TimePickerDialog.this.d.a(hashMap);
                            }
                            TimePickerDialog.this.dismiss();
                        }
                    }
                });
            }
            super.show();
        }
    }
}
