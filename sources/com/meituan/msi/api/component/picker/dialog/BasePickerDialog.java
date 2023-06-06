package com.meituan.msi.api.component.picker.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
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
import com.google.gson.JsonElement;
import com.meituan.msi.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BasePickerDialog extends Dialog {
    public static ChangeQuickRedirect a;
    protected View b;
    protected View c;
    protected a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(Map<String, Object> map);

        void b(Map<String, Object> map);
    }

    public BasePickerDialog(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be05c2517cd20e86b394574eb94c854", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be05c2517cd20e86b394574eb94c854");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f57d1d8f14cc5c5d771ac4b183fce415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f57d1d8f14cc5c5d771ac4b183fce415");
            return;
        }
        requestWindowFeature(1);
        setContentView(R.layout.msi_picker);
        getWindow().setBackgroundDrawable(new ColorDrawable(-1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.width = -1;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        this.c = findViewById(R.id.msi_picker_cancel);
        this.b = findViewById(R.id.msi_picker_ok);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.api.component.picker.dialog.BasePickerDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0ae7451642e9e5690fb9525750847e6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0ae7451642e9e5690fb9525750847e6");
                } else {
                    BasePickerDialog.this.cancel();
                }
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.msi.api.component.picker.dialog.BasePickerDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b894784c8abe958ee8f54d8e910e9cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b894784c8abe958ee8f54d8e910e9cc");
                } else if (BasePickerDialog.this.d != null) {
                    BasePickerDialog.this.d.a();
                }
            }
        });
    }

    public final NumberPicker[] a(int i, String str) {
        NumberPicker numberPicker;
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a58771d86abb7aa71d8a20fbd2b570", RobustBitConfig.DEFAULT_VALUE)) {
            return (NumberPicker[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a58771d86abb7aa71d8a20fbd2b570");
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.msi_ll_pickers);
        linearLayout.removeAllViews();
        NumberPicker[] numberPickerArr = new NumberPicker[i];
        int i3 = 0;
        while (i3 < i) {
            NumberPicker numberPicker2 = new NumberPicker(getContext());
            numberPicker2.setDescendantFocusability(393216);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.weight = 1.0f;
            linearLayout.addView(numberPicker2, layoutParams);
            if (i3 != i - 1) {
                if (TextUtils.isEmpty(str)) {
                    linearLayout.addView(new Space(getContext()), new LinearLayout.LayoutParams(f.a(5), -2));
                } else {
                    TextView textView = new TextView(getContext());
                    textView.setTextSize(18.0f);
                    textView.setTextColor(-16777216);
                    textView.setText(str);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    linearLayout.addView(textView, layoutParams2);
                }
            }
            Object[] objArr2 = new Object[i2];
            objArr2[0] = numberPicker2;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4001d17258d554fc790266909144ec94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4001d17258d554fc790266909144ec94");
                numberPicker = numberPicker2;
            } else {
                try {
                    Field declaredField = NumberPicker.class.getDeclaredField("mInputText");
                    try {
                        declaredField.setAccessible(true);
                        numberPicker = numberPicker2;
                    } catch (Exception e) {
                        e = e;
                        numberPicker = numberPicker2;
                    }
                    try {
                        ((EditText) declaredField.get(numberPicker)).setFilters(new InputFilter[0]);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        a(numberPicker, getContext().getResources().getColor(R.color.msi_picker_divider));
                        numberPickerArr[i3] = numberPicker;
                        i3++;
                        i2 = 1;
                    }
                } catch (Exception e3) {
                    e = e3;
                    numberPicker = numberPicker2;
                }
            }
            a(numberPicker, getContext().getResources().getColor(R.color.msi_picker_divider));
            numberPickerArr[i3] = numberPicker;
            i3++;
            i2 = 1;
        }
        return numberPickerArr;
    }

    private void a(NumberPicker numberPicker, int i) {
        Field[] declaredFields;
        Object[] objArr = {numberPicker, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736600a8eaf779fff30863ef983c921b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736600a8eaf779fff30863ef983c921b");
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

    public static String[] a(List<JsonElement> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b75f2b6e789e7817d0c0bdc1bc16aac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b75f2b6e789e7817d0c0bdc1bc16aac");
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i).getAsString();
        }
        return strArr;
    }

    public final void a(a aVar) {
        this.d = aVar;
    }
}
