package com.meituan.android.paycommon.lib.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OptionView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private EditText b;
    private boolean c;

    public static /* synthetic */ boolean a(OptionView optionView, boolean z) {
        optionView.c = true;
        return true;
    }

    public OptionView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee42c8903c7d4e902c4903cc6995a2fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee42c8903c7d4e902c4903cc6995a2fe");
        }
    }

    public OptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d1bdaaf76db82c1c608b5b226bc0ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d1bdaaf76db82c1c608b5b226bc0ab");
        }
    }

    public final void a(String str, String[] strArr, String str2) {
        Object[] objArr = {str, strArr, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4350c13d720a4616a8a28cc786a6e56d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4350c13d720a4616a8a28cc786a6e56d");
        } else if (strArr == null || strArr.length == 0) {
        } else {
            setBackgroundResource(17170443);
            setOrientation(1);
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            View mainView = getMainView();
            addView(mainView);
            TextView textView = (TextView) mainView.findViewWithTag("option_view_title");
            textView.setText(str);
            textView.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            this.b = (EditText) mainView.findViewWithTag("option_view_edit");
            if (TextUtils.isEmpty(str2)) {
                str2 = strArr[0];
            }
            this.b.setText(str2);
            ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), 17367050, strArr);
            Spinner spinner = (Spinner) mainView.findViewWithTag("option_view_spinner");
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.meituan.android.paycommon.lib.settings.OptionView.1
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                /* JADX WARN: Type inference failed for: r11v1, types: [android.widget.Adapter] */
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af1fac9ac610a1883a19dd99d78cf89a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af1fac9ac610a1883a19dd99d78cf89a");
                    } else if (!OptionView.this.c) {
                        OptionView.a(OptionView.this, true);
                    } else {
                        OptionView.this.setCurrentOption((String) adapterView.getAdapter().getItem(i));
                    }
                }
            });
        }
    }

    public String getCurrentOption() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099153be5943b86213cecf14dd616f51", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099153be5943b86213cecf14dd616f51");
        }
        if (this.b != null) {
            return this.b.getText().toString();
        }
        return null;
    }

    public void setCurrentOption(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aafe88c5e6c68be74cb9bd984dc6831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aafe88c5e6c68be74cb9bd984dc6831");
        } else {
            this.b.setText(str);
        }
    }

    private View getMainView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80815a753682988e2ef48e7894efdcb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80815a753682988e2ef48e7894efdcb9");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(getContext());
        textView.setTag("option_view_title");
        textView.setVisibility(0);
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(getContext());
        editText.setTag("option_view_edit");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        editText.setLayoutParams(layoutParams);
        linearLayout2.addView(editText);
        Spinner spinner = new Spinner(getContext());
        spinner.setTag("option_view_spinner");
        spinner.setLayoutParams(new LinearLayout.LayoutParams(50, -1));
        linearLayout2.addView(spinner);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }
}
