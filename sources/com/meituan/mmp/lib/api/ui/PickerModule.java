package com.meituan.mmp.lib.api.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.Space;
import android.widget.TextView;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.interfaces.c;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.msi.api.component.picker.bean.DatePickerParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PickerModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    private NumberPicker i;
    private NumberPicker j;
    private NumberPicker k;
    private NumberPicker[] l;
    private NumberPicker.OnValueChangeListener m;
    private NumberPicker.OnValueChangeListener n;
    private View o;
    private View p;
    private Dialog q;
    private SimpleDateFormat r;
    private String s;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e9a8907a301c7100d1077f56b8f444", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e9a8907a301c7100d1077f56b8f444") : new String[]{"showPickerView", "showDatePickerView", "showMultiPickerView", "updateMultiPickerView"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        int i;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21267d0e20742e99d07a299507b4374e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21267d0e20742e99d07a299507b4374e");
            return;
        }
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1538334289) {
                if (hashCode != 119255651) {
                    if (hashCode != 172924720) {
                        if (hashCode == 1630368510 && str.equals("showDatePickerView")) {
                            c = 1;
                        }
                    } else if (str.equals("showPickerView")) {
                        c = 0;
                    }
                } else if (str.equals("updateMultiPickerView")) {
                    c = 3;
                }
            } else if (str.equals("showMultiPickerView")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8593c5c3a055525fbb978c59407bcaed", RobustBitConfig.DEFAULT_VALUE)) {
                        final JSONArray jSONArray = jSONObject.getJSONArray("array");
                        int i2 = jSONObject.getInt("current");
                        a(1, (String) null);
                        if (!b(iApiCallback, jSONArray)) {
                            this.i.setDisplayedValues(b(jSONArray));
                            this.i.setMaxValue(jSONArray.length() - 1);
                            this.i.setValue(i2);
                            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68038e5d2543c5278b5e02698930f099", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68038e5d2543c5278b5e02698930f099");
                                        return;
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        int value = PickerModule.this.i.getValue();
                                        jSONObject2.put("index", value);
                                        jSONObject2.put("value", jSONArray.getString(value));
                                        iApiCallback.onSuccess(jSONObject2);
                                        PickerModule.this.q.dismiss();
                                    } catch (JSONException unused) {
                                        iApiCallback.onFail();
                                        PickerModule.this.q.dismiss();
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8593c5c3a055525fbb978c59407bcaed");
                        break;
                    }
                    break;
                case 1:
                    Object[] objArr3 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = h;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "65cdf3a5f08975bdc5d7d71f46f1da40", RobustBitConfig.DEFAULT_VALUE)) {
                        String string = jSONObject.getString(JsBridgeResult.ARG_KEY_LOCATION_MODE);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("range");
                        String optString = jSONObject2.optString("start");
                        String optString2 = jSONObject2.optString("end");
                        String string2 = jSONObject.getString("current");
                        if ("time".equals(string)) {
                            this.r = new SimpleDateFormat(Utils.SHORT_DATE_FORMAT, Locale.getDefault());
                            Object[] objArr4 = {optString, optString2, string2, iApiCallback};
                            ChangeQuickRedirect changeQuickRedirect4 = h;
                            if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "501b9d18ef7c80b0a9caddfb7fe83fb0", RobustBitConfig.DEFAULT_VALUE)) {
                                a(2, CommonConstant.Symbol.COLON);
                                final Calendar calendar = Calendar.getInstance();
                                SimpleDateFormat simpleDateFormat = this.r;
                                if (TextUtils.isEmpty(optString)) {
                                    optString = "00:00";
                                }
                                calendar.setTime(simpleDateFormat.parse(optString));
                                final Calendar calendar2 = Calendar.getInstance();
                                SimpleDateFormat simpleDateFormat2 = this.r;
                                if (TextUtils.isEmpty(optString2)) {
                                    optString2 = "23:59";
                                }
                                calendar2.setTime(simpleDateFormat2.parse(optString2));
                                Calendar calendar3 = Calendar.getInstance();
                                calendar3.setTime(this.r.parse(string2));
                                if (calendar2.before(calendar) || calendar3.before(calendar) || calendar3.after(calendar2)) {
                                    iApiCallback.onFail();
                                }
                                final NumberPicker.Formatter formatter = new NumberPicker.Formatter() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.10
                                    public static ChangeQuickRedirect a;

                                    @Override // android.widget.NumberPicker.Formatter
                                    public final String format(int i3) {
                                        Object[] objArr5 = {Integer.valueOf(i3)};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b955e472275a116fde818e26e14dc626", RobustBitConfig.DEFAULT_VALUE)) {
                                            return (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b955e472275a116fde818e26e14dc626");
                                        }
                                        StringBuilder sb = i3 < 10 ? new StringBuilder("0") : new StringBuilder();
                                        sb.append(i3);
                                        return sb.toString();
                                    }
                                };
                                this.i.setFormatter(formatter);
                                this.j.setFormatter(formatter);
                                this.i.setMaxValue(calendar2.get(11));
                                this.i.setMinValue(calendar.get(11));
                                this.i.setValue(calendar3.get(11));
                                this.m = new NumberPicker.OnValueChangeListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.11
                                    public static ChangeQuickRedirect a;

                                    @Override // android.widget.NumberPicker.OnValueChangeListener
                                    public final void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                                        Object[] objArr5 = {numberPicker, Integer.valueOf(i3), Integer.valueOf(i4)};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b87a87b0b6b2d521d9b9678b44bb219a", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b87a87b0b6b2d521d9b9678b44bb219a");
                                            return;
                                        }
                                        int i5 = i4 == calendar2.get(11) ? calendar2.get(12) : 59;
                                        int i6 = i4 == calendar.get(11) ? calendar.get(12) : 0;
                                        PickerModule.this.j.setMaxValue(i5);
                                        PickerModule.this.j.setMinValue(i6);
                                    }
                                };
                                this.i.setOnValueChangedListener(this.m);
                                this.m.onValueChange(this.i, 0, calendar3.get(11));
                                this.j.setValue(calendar3.get(12));
                                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr5 = {view};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f4fc5173cf31dca1256ef179ec118903", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f4fc5173cf31dca1256ef179ec118903");
                                            return;
                                        }
                                        JSONObject jSONObject3 = new JSONObject();
                                        try {
                                            String format = formatter.format(PickerModule.this.i.getValue());
                                            String format2 = formatter.format(PickerModule.this.j.getValue());
                                            jSONObject3.put("value", format + CommonConstant.Symbol.COLON + format2);
                                            iApiCallback.onSuccess(jSONObject3);
                                            PickerModule.this.q.dismiss();
                                        } catch (JSONException unused) {
                                            iApiCallback.onFail();
                                            PickerModule.this.q.dismiss();
                                        }
                                    }
                                });
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "501b9d18ef7c80b0a9caddfb7fe83fb0");
                                break;
                            }
                        } else if ("date".equals(string)) {
                            String string3 = jSONObject.getString("fields");
                            if (DatePickerParam.FIELD_MONTH.equals(string3)) {
                                this.r = new SimpleDateFormat("yyyy-MM", Locale.getDefault());
                                i = 2;
                            } else if (DatePickerParam.FIELD_DAY.equals(string3)) {
                                this.r = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                                i = 3;
                            } else {
                                if (DatePickerParam.FIELD_YEAR.equals(string3)) {
                                    this.r = new SimpleDateFormat("yyyy", Locale.getDefault());
                                } else {
                                    this.r = new SimpleDateFormat("yyyy", Locale.getDefault());
                                }
                                i = 1;
                            }
                            Object[] objArr5 = {Integer.valueOf(i), optString, optString2, string2};
                            ChangeQuickRedirect changeQuickRedirect5 = h;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6a5c7e20f5ce24d6ddf5dc7eb25062fd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6a5c7e20f5ce24d6ddf5dc7eb25062fd");
                            } else {
                                a(i, (String) null);
                                final Calendar calendar4 = Calendar.getInstance();
                                SimpleDateFormat simpleDateFormat3 = this.r;
                                if (TextUtils.isEmpty(optString)) {
                                    optString = "1-01-01";
                                }
                                calendar4.setTime(simpleDateFormat3.parse(optString));
                                final Calendar calendar5 = Calendar.getInstance();
                                SimpleDateFormat simpleDateFormat4 = this.r;
                                if (TextUtils.isEmpty(optString2)) {
                                    optString2 = "9999-12-31";
                                }
                                calendar5.setTime(simpleDateFormat4.parse(optString2));
                                Calendar calendar6 = Calendar.getInstance();
                                calendar6.setTime(this.r.parse(string2));
                                this.i.setMaxValue(calendar5.get(1));
                                this.i.setMinValue(calendar4.get(1));
                                this.i.setValue(calendar6.get(1));
                                if (i > 1) {
                                    this.j.setFormatter(new NumberPicker.Formatter() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.6
                                        public static ChangeQuickRedirect a;

                                        @Override // android.widget.NumberPicker.Formatter
                                        public final String format(int i3) {
                                            Object[] objArr6 = {Integer.valueOf(i3)};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "94e95c337445edc8f21ee2260bdb5015", RobustBitConfig.DEFAULT_VALUE)) {
                                                return (String) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "94e95c337445edc8f21ee2260bdb5015");
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(i3 + 1);
                                            return sb.toString();
                                        }
                                    });
                                    this.m = new NumberPicker.OnValueChangeListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.7
                                        public static ChangeQuickRedirect a;

                                        @Override // android.widget.NumberPicker.OnValueChangeListener
                                        public final void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                                            Object[] objArr6 = {numberPicker, Integer.valueOf(i3), Integer.valueOf(i4)};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f6e9f4a3f6780ac7ce6a6318d65ce18a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f6e9f4a3f6780ac7ce6a6318d65ce18a");
                                                return;
                                            }
                                            int i5 = i4 == calendar5.get(1) ? calendar5.get(2) : 11;
                                            int i6 = i4 == calendar4.get(1) ? calendar4.get(2) : 0;
                                            PickerModule.this.j.setMaxValue(i5);
                                            PickerModule.this.j.setMinValue(i6);
                                            if (PickerModule.this.n != null) {
                                                PickerModule.this.n.onValueChange(PickerModule.this.j, PickerModule.this.j.getValue(), PickerModule.this.j.getValue());
                                            }
                                        }
                                    };
                                    this.i.setOnValueChangedListener(this.m);
                                    this.m.onValueChange(this.i, 0, calendar6.get(1));
                                    this.j.setValue(calendar6.get(2));
                                    if (i > 2) {
                                        this.n = new NumberPicker.OnValueChangeListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.8
                                            public static ChangeQuickRedirect a;

                                            @Override // android.widget.NumberPicker.OnValueChangeListener
                                            public final void onValueChange(NumberPicker numberPicker, int i3, int i4) {
                                                Object[] objArr6 = {numberPicker, Integer.valueOf(i3), Integer.valueOf(i4)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "52adfec1e65f231e10f7d941ebe4771a", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "52adfec1e65f231e10f7d941ebe4771a");
                                                    return;
                                                }
                                                int value = PickerModule.this.i.getValue();
                                                int i5 = (value == calendar5.get(1) && i4 == calendar5.get(2)) ? calendar5.get(5) : -1;
                                                int i6 = (value == calendar4.get(1) && i4 == calendar4.get(2)) ? calendar4.get(5) : -1;
                                                if (i5 == -1 || i6 == -1) {
                                                    Calendar calendar7 = Calendar.getInstance();
                                                    calendar7.set(1, value);
                                                    calendar7.set(2, i4);
                                                    if (i5 == -1) {
                                                        i5 = calendar7.getActualMaximum(5);
                                                    }
                                                    if (i6 == -1) {
                                                        i6 = 1;
                                                    }
                                                }
                                                PickerModule.this.k.setMaxValue(i5);
                                                PickerModule.this.k.setMinValue(i6);
                                            }
                                        };
                                        this.j.setOnValueChangedListener(this.n);
                                        this.n.onValueChange(this.j, 0, calendar6.get(2));
                                        this.k.setValue(calendar6.get(5));
                                    }
                                }
                            }
                            Object[] objArr6 = {iApiCallback};
                            ChangeQuickRedirect changeQuickRedirect6 = h;
                            if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eab5ae5ba165fd28e17295325c32e569", RobustBitConfig.DEFAULT_VALUE)) {
                                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.9
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr7 = {view};
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c707fc896913027001f5fe796fa2e935", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c707fc896913027001f5fe796fa2e935");
                                            return;
                                        }
                                        JSONObject jSONObject3 = new JSONObject();
                                        try {
                                            Calendar calendar7 = Calendar.getInstance();
                                            calendar7.set(1, PickerModule.this.i.getValue());
                                            if (PickerModule.this.j != null) {
                                                calendar7.set(2, PickerModule.this.j.getValue());
                                            }
                                            if (PickerModule.this.k != null) {
                                                calendar7.set(5, PickerModule.this.k.getValue());
                                            }
                                            jSONObject3.put("value", PickerModule.this.r.format(calendar7.getTime()));
                                            iApiCallback.onSuccess(jSONObject3);
                                            PickerModule.this.q.dismiss();
                                        } catch (JSONException unused) {
                                            iApiCallback.onFail();
                                            PickerModule.this.q.dismiss();
                                        }
                                    }
                                });
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eab5ae5ba165fd28e17295325c32e569");
                                break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "65cdf3a5f08975bdc5d7d71f46f1da40");
                        break;
                    }
                    break;
                case 2:
                    Object[] objArr7 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect7 = h;
                    if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bf34270583cf8249e57532ae098db6ab", RobustBitConfig.DEFAULT_VALUE)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("array");
                        JSONArray jSONArray3 = jSONObject.getJSONArray("current");
                        if (jSONObject.has("arrayKey")) {
                            this.s = jSONObject.getString("arrayKey");
                        } else {
                            this.s = null;
                        }
                        int length = jSONArray2.length();
                        if (length != jSONArray3.length()) {
                            iApiCallback.onFail();
                        }
                        a(length, jSONArray3, jSONArray2, iApiCallback);
                        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.5
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr8 = {view};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "5893029f0b79fdd48093542888318a86", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "5893029f0b79fdd48093542888318a86");
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    JSONArray jSONArray4 = new JSONArray();
                                    for (NumberPicker numberPicker : PickerModule.this.l) {
                                        jSONArray4.put(numberPicker.getValue());
                                    }
                                    jSONObject3.put("current", jSONArray4);
                                    iApiCallback.onSuccess(jSONObject3);
                                    PickerModule.this.q.dismiss();
                                } catch (JSONException unused) {
                                    iApiCallback.onFail();
                                    PickerModule.this.q.dismiss();
                                }
                            }
                        });
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bf34270583cf8249e57532ae098db6ab");
                        break;
                    }
                case 3:
                    Object[] objArr8 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect8 = h;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3f4b7976862b0066f72845d3a86202d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3f4b7976862b0066f72845d3a86202d9");
                        break;
                    } else {
                        int i3 = jSONObject.getInt("column");
                        int i4 = jSONObject.getInt("current");
                        JSONArray jSONArray4 = jSONObject.getJSONArray("array");
                        if (this.l != null && i3 > 0 && i3 < this.l.length) {
                            if (!b(iApiCallback, jSONArray4) && !a(iApiCallback, jSONArray4)) {
                                NumberPicker numberPicker = this.l[i3];
                                numberPicker.setMaxValue(0);
                                if (TextUtils.isEmpty(this.s)) {
                                    numberPicker.setDisplayedValues(b(jSONArray4));
                                } else {
                                    numberPicker.setDisplayedValues(a(jSONArray4));
                                }
                                numberPicker.setMaxValue(jSONArray4.length() - 1);
                                if (i4 >= 0 && i4 < jSONArray4.length()) {
                                    numberPicker.setValue(i4);
                                }
                                iApiCallback.onSuccess(null);
                                break;
                            }
                        }
                        iApiCallback.onFail(new JSONObject("{\"errMsg\":\"fail:invalid data. \"}"));
                    }
                    break;
            }
            this.q.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Object[] objArr9 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "564cfb3458de1c557d8efb0ffa06f5f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "564cfb3458de1c557d8efb0ffa06f5f4");
                    } else {
                        iApiCallback.onCancel();
                    }
                }
            });
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.ui.PickerModule.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr9 = {view};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "2969eaaca113bb2856750b33bc2109a0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "2969eaaca113bb2856750b33bc2109a0");
                        return;
                    }
                    iApiCallback.onCancel();
                    PickerModule.this.q.dismiss();
                }
            });
        } catch (ParseException | JSONException unused) {
            iApiCallback.onFail();
            if (this.q != null) {
                this.q.dismiss();
            }
        }
    }

    private boolean a(IApiCallback iApiCallback, JSONArray jSONArray) {
        Object[] objArr = {iApiCallback, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9bd193d88ca8f323c14abe8b017c06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9bd193d88ca8f323c14abe8b017c06")).booleanValue();
        }
        if (!TextUtils.isEmpty(this.s)) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (jSONArray.opt(i) instanceof JSONObject) {
                    if (!((JSONObject) jSONArray.opt(i)).has(this.s)) {
                        iApiCallback.onFail(a("fail:invalid data.", new Object[0]));
                        return true;
                    }
                } else {
                    iApiCallback.onFail(a("fail:invalid data.", new Object[0]));
                    return true;
                }
            }
            return false;
        }
        int length2 = jSONArray.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (!(jSONArray.opt(i2) instanceof String)) {
                iApiCallback.onFail(a("fail:invalid data.", new Object[0]));
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "004cd60507f0d33c8250edb8a9f80e05", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "004cd60507f0d33c8250edb8a9f80e05");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", String.format(str, objArr));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private String[] a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a5a6ce578226675a79a60320647910", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a5a6ce578226675a79a60320647910");
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            if (jSONArray.opt(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                if (jSONObject.has(this.s)) {
                    strArr[i] = jSONObject.optString(this.s);
                }
            }
        }
        return strArr;
    }

    private boolean b(IApiCallback iApiCallback, JSONArray jSONArray) throws JSONException {
        Object[] objArr = {iApiCallback, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16aacca31930aae6357a35ebf6e4ee21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16aacca31930aae6357a35ebf6e4ee21")).booleanValue();
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            iApiCallback.onFail(new JSONObject("{\"errMsg\":\"fail:invalid data. \"}"));
            return true;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements NumberPicker.OnValueChangeListener {
        public static ChangeQuickRedirect a;
        public int b;
        public c c;

        public a(int i, c cVar) {
            Object[] objArr = {Integer.valueOf(i), cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8247db39258dd1ececc6688b7c4840c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8247db39258dd1ececc6688b7c4840c9");
                return;
            }
            this.b = i;
            this.c = cVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
            Object[] objArr = {numberPicker, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa87481725a974ea4195ad88ff3c4b1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa87481725a974ea4195ad88ff3c4b1b");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("column", this.b);
                jSONObject.put("current", i2);
                this.c.a("onMultiPickerViewChange", jSONObject, 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void a(int i, JSONArray jSONArray, JSONArray jSONArray2, IApiCallback iApiCallback) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), jSONArray, jSONArray2, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901742c7ba5be082d8482ad83884853c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901742c7ba5be082d8482ad83884853c");
            return;
        }
        this.l = new NumberPicker[i];
        if (this.q != null) {
            this.q.dismiss();
        }
        this.q = new Dialog(getActivity());
        this.q.requestWindowFeature(1);
        this.q.show();
        this.q.setContentView(R.layout.mmp_picker);
        this.q.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
        WindowManager.LayoutParams attributes = this.q.getWindow().getAttributes();
        attributes.height = -2;
        attributes.width = -1;
        attributes.gravity = 80;
        this.q.getWindow().setAttributes(attributes);
        LinearLayout linearLayout = (LinearLayout) this.q.findViewById(R.id.ll_pickers);
        for (int i2 = 0; i2 < i; i2++) {
            NumberPicker numberPicker = new NumberPicker(getContext());
            numberPicker.setDescendantFocusability(393216);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.weight = 1.0f;
            linearLayout.addView(numberPicker, layoutParams);
            if (i2 != i - 1) {
                linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(p.d(5), -2));
            }
            a(numberPicker);
            a(numberPicker, Color.parseColor("#FFC300"));
            JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
            if (b(iApiCallback, jSONArray2)) {
                return;
            }
            numberPicker.setDisplayedValues(b(jSONArray3));
            numberPicker.setMaxValue(jSONArray3.length() - 1);
            numberPicker.setValue(jSONArray.getInt(i2));
            numberPicker.setOnValueChangedListener(new a(i2, this.d));
            this.l[i2] = numberPicker;
        }
        this.o = this.q.findViewById(R.id.mmp_cancel);
        this.p = this.q.findViewById(R.id.mmp_ok);
    }

    private static String[] b(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e31766809b7fae0e947d159eeabd8408", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e31766809b7fae0e947d159eeabd8408");
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67ae8a6edc81301072bf3a191842724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67ae8a6edc81301072bf3a191842724");
            return;
        }
        if (this.q != null) {
            this.q.dismiss();
        }
        this.q = new Dialog(getActivity());
        this.q.requestWindowFeature(1);
        this.q.show();
        this.q.setContentView(R.layout.mmp_picker);
        this.q.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
        WindowManager.LayoutParams attributes = this.q.getWindow().getAttributes();
        attributes.height = -2;
        attributes.width = -1;
        attributes.gravity = 80;
        this.q.getWindow().setAttributes(attributes);
        this.i = (NumberPicker) this.q.findViewById(R.id.mmp_picker1);
        this.i.setVisibility(0);
        a(this.i);
        a(this.i, Color.parseColor("#FFC300"));
        if (i > 1) {
            TextView textView = (TextView) this.q.findViewById(R.id.mmp_mum_dot1);
            this.j = (NumberPicker) this.q.findViewById(R.id.mmp_picker2);
            a(this.j);
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
            this.j.setVisibility(0);
            a(this.j, Color.parseColor("#FFC300"));
        }
        if (i > 2) {
            TextView textView2 = (TextView) this.q.findViewById(R.id.mmp_mum_dot2);
            this.k = (NumberPicker) this.q.findViewById(R.id.mmp_picker3);
            a(this.k);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str);
                textView2.setVisibility(0);
            }
            this.k.setVisibility(0);
            a(this.k, Color.parseColor("#FFC300"));
        }
        this.o = this.q.findViewById(R.id.mmp_cancel);
        this.p = this.q.findViewById(R.id.mmp_ok);
    }

    private void a(NumberPicker numberPicker) {
        Object[] objArr = {numberPicker};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30c15a614e97b01b6b44c825d3976d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30c15a614e97b01b6b44c825d3976d8");
        } else if (numberPicker == null) {
        } else {
            try {
                Field declaredField = NumberPicker.class.getDeclaredField("mInputText");
                declaredField.setAccessible(true);
                ((EditText) declaredField.get(numberPicker)).setFilters(new InputFilter[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(NumberPicker numberPicker, int i) {
        Field[] declaredFields;
        Object[] objArr = {numberPicker, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a2467bb052d6124958f37c36a39b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a2467bb052d6124958f37c36a39b85");
            return;
        }
        for (Field field : NumberPicker.class.getDeclaredFields()) {
            if (field.getName().equals("mSelectionDivider")) {
                field.setAccessible(true);
                try {
                    field.set(numberPicker, new ColorDrawable(i));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}
