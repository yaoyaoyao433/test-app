package com.dianping.picassocontroller.module;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picassocontroller.annotation.PCSBMethod;
import com.dianping.picassocontroller.annotation.PCSBModule;
import com.dianping.picassocontroller.annotation.PCSModel;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.widget.PickerViewDialog;
import com.dianping.picassocontroller.widget.WheelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@PCSBModule(name = "picker", stringify = true)
/* loaded from: classes.dex */
public class PickerModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private SimpleDateFormat dateFormatter;
    private SimpleDateFormat timeFormatter;

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class DateTimePickerArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String max;
        public String min;
        public String preset;
    }

    /* compiled from: ProGuard */
    @Keep
    @PCSModel
    /* loaded from: classes.dex */
    public static class PickerArgument {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int index;
        public String[] items;
        public int[] multiIndex;
        public String[][] multiItems;
        public String title;
    }

    public PickerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9df1c543f689dade50c5acae3ef10e66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9df1c543f689dade50c5acae3ef10e66");
            return;
        }
        this.dateFormatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        this.timeFormatter = new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.getDefault());
    }

    @Keep
    @PCSBMethod(name = "pickDate")
    public void pickDate(b bVar, JSONObject jSONObject, final com.dianping.picassocontroller.bridge.b bVar2) {
        Date parse;
        Object[] objArr = {bVar, jSONObject, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2077739c602837f2adc2f57d439a1ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2077739c602837f2adc2f57d439a1ec");
            return;
        }
        DateTimePickerArgument dateTimePickerArgument = new DateTimePickerArgument();
        dateTimePickerArgument.preset = jSONObject.optString("preset");
        dateTimePickerArgument.min = jSONObject.optString("min");
        dateTimePickerArgument.max = jSONObject.optString("max");
        Calendar calendar = Calendar.getInstance();
        if (!TextUtils.isEmpty(dateTimePickerArgument.preset) && (parse = this.dateFormatter.parse(dateTimePickerArgument.preset, new ParsePosition(0))) != null) {
            calendar.setTime(parse);
        }
        Date parse2 = !TextUtils.isEmpty(dateTimePickerArgument.min) ? this.dateFormatter.parse(dateTimePickerArgument.min, new ParsePosition(0)) : null;
        Date parse3 = TextUtils.isEmpty(dateTimePickerArgument.max) ? null : this.dateFormatter.parse(dateTimePickerArgument.max, new ParsePosition(0));
        DatePickerDialog datePickerDialog = new DatePickerDialog(bVar.b(), 2131558953, new DatePickerDialog.OnDateSetListener() { // from class: com.dianping.picassocontroller.module.PickerModule.1
            public static ChangeQuickRedirect a;

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                Object[] objArr2 = {datePicker, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7cdf780c59ec10d56c5e0ce4942f41e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7cdf780c59ec10d56c5e0ce4942f41e8");
                    return;
                }
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(i, i2, i3);
                bVar2.a(new JSONBuilder().put("date", PickerModule.this.dateFormatter.format(calendar2.getTime())).toJSONObject());
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        if (parse3 != null) {
            datePicker.setMaxDate(parse3.getTime());
        }
        if (parse2 != null) {
            datePicker.setMinDate(parse2.getTime());
        }
        datePickerDialog.setCancelable(false);
        datePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.dianping.picassocontroller.module.PickerModule.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "007e7ac2f2fd7d190966232e8913d507", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "007e7ac2f2fd7d190966232e8913d507");
                } else {
                    bVar2.a(null);
                }
            }
        });
        datePickerDialog.show();
    }

    @Keep
    @PCSBMethod(name = "pickTime")
    public void pickTime(b bVar, JSONObject jSONObject, final com.dianping.picassocontroller.bridge.b bVar2) {
        Date parse;
        Object[] objArr = {bVar, jSONObject, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cb669b696e320439d05ff8879e523d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cb669b696e320439d05ff8879e523d5");
            return;
        }
        DateTimePickerArgument dateTimePickerArgument = new DateTimePickerArgument();
        dateTimePickerArgument.preset = jSONObject.optString("preset");
        dateTimePickerArgument.min = jSONObject.optString("min");
        dateTimePickerArgument.max = jSONObject.optString("max");
        Calendar calendar = Calendar.getInstance();
        if (!TextUtils.isEmpty(dateTimePickerArgument.preset) && (parse = this.timeFormatter.parse(dateTimePickerArgument.preset, new ParsePosition(0))) != null) {
            calendar.setTime(parse);
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(bVar.b(), 2131558954, new TimePickerDialog.OnTimeSetListener() { // from class: com.dianping.picassocontroller.module.PickerModule.3
            public static ChangeQuickRedirect a;

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                Object[] objArr2 = {timePicker, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e1fa8d722922f2226c20c1370dc940a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e1fa8d722922f2226c20c1370dc940a0");
                    return;
                }
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, i);
                calendar2.set(12, i2);
                bVar2.a(new JSONBuilder().put("date", PickerModule.this.timeFormatter.format(calendar2.getTime())).toJSONObject());
            }
        }, calendar.get(11), calendar.get(12), false);
        timePickerDialog.setCancelable(false);
        timePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.dianping.picassocontroller.module.PickerModule.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2fd9968e09bbad15e9c779c095e158ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2fd9968e09bbad15e9c779c095e158ce");
                } else {
                    bVar2.a(null);
                }
            }
        });
        timePickerDialog.show();
    }

    @Keep
    @PCSBMethod(name = "pick")
    public void pick(b bVar, JSONObject jSONObject, final com.dianping.picassocontroller.bridge.b bVar2) {
        Object[] objArr = {bVar, jSONObject, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acff989983efae1c6975a470d3f0fae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acff989983efae1c6975a470d3f0fae5");
            return;
        }
        PickerArgument pickerArgument = new PickerArgument();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                String[] strArr = new String[optJSONArray.length()];
                for (int i = 0; i < strArr.length; i++) {
                    strArr[i] = optJSONArray.optString(i);
                }
                pickerArgument.items = strArr;
            }
            pickerArgument.index = jSONObject.optInt("index");
            pickerArgument.title = jSONObject.optString("title");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("multiItems");
            if (optJSONArray2 != null) {
                String[][] strArr2 = new String[optJSONArray2.length()];
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i2);
                    if (optJSONArray3 != null) {
                        strArr2[i2] = new String[optJSONArray3.length()];
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            strArr2[i2][i3] = optJSONArray3.optString(i3);
                        }
                    }
                }
                pickerArgument.multiItems = strArr2;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("multiIndex");
            if (optJSONArray4 != null) {
                int[] iArr = new int[optJSONArray4.length()];
                for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                    iArr[i4] = optJSONArray4.optInt(i4);
                }
                pickerArgument.multiIndex = iArr;
            }
            final PickerViewDialog pickerViewDialog = new PickerViewDialog(bVar.b(), 3);
            final boolean z = true;
            Object[] objArr2 = {pickerArgument, bVar2};
            ChangeQuickRedirect changeQuickRedirect3 = PickerViewDialog.a;
            if (PatchProxy.isSupport(objArr2, pickerViewDialog, changeQuickRedirect3, false, "7de8022a97670326c65cc335676030b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pickerViewDialog, changeQuickRedirect3, false, "7de8022a97670326c65cc335676030b0");
            } else {
                z = (pickerArgument.multiItems == null || pickerArgument.multiItems.length <= 0) ? false : false;
                ((TextView) pickerViewDialog.findViewById(R.id.tv_picker_title)).setText(pickerArgument.title);
                pickerViewDialog.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.widget.PickerViewDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "31c239ae9a9b603842671e4604888c5c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "31c239ae9a9b603842671e4604888c5c");
                            return;
                        }
                        pickerViewDialog.cancel();
                        bVar2.a(null);
                    }
                });
                pickerViewDialog.findViewById(R.id.btn_confirm).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.widget.PickerViewDialog.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "680f0bde5e8140ccc4f51d4d2e0d0039", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "680f0bde5e8140ccc4f51d4d2e0d0039");
                            return;
                        }
                        int[] iArr2 = new int[pickerViewDialog.c.size()];
                        for (int i5 = 0; i5 < pickerViewDialog.c.size(); i5++) {
                            iArr2[i5] = ((WheelView) pickerViewDialog.c.get(i5)).getCurrentItem();
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            if (z) {
                                JSONArray jSONArray = new JSONArray();
                                for (int i6 : iArr2) {
                                    jSONArray.put(i6);
                                }
                                jSONObject2.put("multiIndex", jSONArray);
                            } else if (iArr2.length > 0) {
                                jSONObject2.put("index", iArr2[0]);
                            }
                            bVar2.a(jSONObject2);
                        } catch (Exception unused) {
                        }
                        pickerViewDialog.dismiss();
                    }
                });
                if (z) {
                    for (int i5 = 0; i5 < pickerArgument.multiItems.length; i5++) {
                        WheelView a = pickerViewDialog.a(new PickerViewDialog.a(pickerArgument.multiItems[i5]));
                        if (pickerArgument.multiIndex != null && i5 < pickerArgument.multiIndex.length) {
                            a.setCurrentItem(pickerArgument.multiIndex[i5]);
                        }
                    }
                } else {
                    pickerViewDialog.a(new PickerViewDialog.a(pickerArgument.items)).setCurrentItem(pickerArgument.index);
                }
            }
            pickerViewDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
