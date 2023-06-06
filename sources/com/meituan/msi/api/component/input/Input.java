package com.meituan.msi.api.component.input;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.msi.annotations.MsiComponent;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.component.IMsiComponent;
import com.meituan.msi.context.h;
import com.meituan.msi.dispather.e;
import com.meituan.msi.util.d;
import com.meituan.msi.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MsiComponent(name = "MSIInput", property = InputParam.class)
/* loaded from: classes3.dex */
public class Input extends c implements IMsiComponent<InputParam> {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private InputParam C;
    private boolean D;
    private int z;

    @Override // com.meituan.msi.api.component.input.c
    public boolean getConfirm() {
        return false;
    }

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ View a(String str, String str2, InputParam inputParam, MsiContext msiContext) {
        InputParam inputParam2 = inputParam;
        Object[] objArr = {str, str2, inputParam2, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0244bfcb74427c309e51359b9f846ffa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0244bfcb74427c309e51359b9f846ffa");
        }
        a(str, str2, inputParam2, msiContext.getEventDispatcher(), msiContext.getPageContext(), msiContext.getActivityContext());
        return this;
    }

    @Override // com.meituan.msi.component.IMsiComponent
    public final /* synthetic */ boolean a(String str, String str2, InputParam inputParam) {
        InputParam inputParam2 = inputParam;
        Object[] objArr = {str, str2, inputParam2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519989ec17cec97ddcc49b7fa6f994ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519989ec17cec97ddcc49b7fa6f994ab")).booleanValue();
        }
        a(inputParam2);
        return true;
    }

    public static /* synthetic */ void a(Input input, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, input, changeQuickRedirect, false, "6a433d1abba51a3333ed47a5608a660a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, input, changeQuickRedirect, false, "6a433d1abba51a3333ed47a5608a660a");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", input.getValue());
            jSONObject.put("height", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (input.u != null) {
            input.u.a("onFocus", jSONObject);
        }
        if (input.A) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, input, changeQuickRedirect2, false, "16ea9bd07aa4689eff3183dea801402e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, input, changeQuickRedirect2, false, "16ea9bd07aa4689eff3183dea801402e");
            } else if (input.x == null) {
                com.meituan.msi.log.a.a("keyBoardProvider is null");
            } else {
                Rect rect = new Rect();
                input.getGlobalVisibleRect(rect);
                int a2 = rect.bottom + input.a(input.z);
                f.a(input.w.a());
                input.x.a(a2 - (f.b() - i), i, a2 <= input.x.b());
            }
        }
    }

    public static /* synthetic */ boolean a(Input input, boolean z) {
        input.D = true;
        return true;
    }

    public static /* synthetic */ void c(Input input) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, input, changeQuickRedirect, false, "f1ac437f2f0ca623b0cc583b2ad0a47b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, input, changeQuickRedirect, false, "f1ac437f2f0ca623b0cc583b2ad0a47b");
            return;
        }
        input.clearFocus();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", input.getValue());
            jSONObject.put("cursor", input.getCursor());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (input.u != null) {
            input.u.a("onBlur", jSONObject);
        }
    }

    public Input() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c1eec6116ead8a329ef2392cdbf9d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c1eec6116ead8a329ef2392cdbf9d6");
            return;
        }
        this.z = 0;
        this.A = true;
        this.B = false;
        this.D = true;
        setSingleLine();
        setBackground(null);
    }

    public final void a(String str, String str2, InputParam inputParam, e eVar, h hVar, com.meituan.msi.context.a aVar) {
        Object[] objArr = {str, str2, inputParam, eVar, hVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4ff7dc08492970c4110e038a1c93e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4ff7dc08492970c4110e038a1c93e1");
            return;
        }
        a(str, str2, eVar, hVar, aVar);
        setId(Integer.valueOf(str).intValue());
        a();
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.meituan.msi.api.component.input.Input.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98cc1d82dea60f8a04b48a3a475bf65b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98cc1d82dea60f8a04b48a3a475bf65b")).booleanValue();
                }
                if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                    if (Input.this.B) {
                        Input.this.c();
                        return true;
                    }
                    Input.this.c();
                }
                return false;
            }
        });
        Object[] objArr2 = {inputParam};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "629a622c285444071fc5264bcffb98ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "629a622c285444071fc5264bcffb98ab");
            return;
        }
        a(inputParam);
        setPadding(0, 0, 0, 0);
        this.g = true;
    }

    public final void a(InputParam inputParam) {
        Object[] objArr = {inputParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0f9e70f3528e0417af27ceff6ec38f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0f9e70f3528e0417af27ceff6ec38f");
        } else if (inputParam == null) {
        } else {
            setCommonProperties(inputParam);
            if (inputParam.fontSize != null) {
                this.s = (float) inputParam.fontSize.doubleValue();
                if (inputParam.unitPx != null && inputParam.unitPx.booleanValue()) {
                    setTextSize(0, this.s);
                } else {
                    setTextSize(1, this.s);
                }
            }
        }
    }

    public InputParam getInputParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9284a02dc523463f273ffd94a9e5b2d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9284a02dc523463f273ffd94a9e5b2d3");
        }
        if (this.C == null) {
            this.C = new InputParam();
        }
        return this.C;
    }

    public void setCommonProperties(InputParam inputParam) {
        boolean z = true;
        Object[] objArr = {inputParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a79292c25ce62e32201edd92c766d84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a79292c25ce62e32201edd92c766d84");
            return;
        }
        String str = inputParam.type;
        if ("text".equals(str)) {
            setInputType(1);
            setImeOptions(6);
        } else if ("digit".equals(str)) {
            setInputType(8194);
            setImeOptions(6);
        } else if ("number".equals(str) || "idcard".equals(str)) {
            setInputType(2);
            setImeOptions(6);
        }
        if (inputParam.backgroundColor != null) {
            setBackgroundColor(d.b(inputParam.backgroundColor));
        }
        if (inputParam.placeholderStyle != null) {
            if (inputParam.placeholderStyle.backgroundColor != null) {
                setBackgroundColor(d.b(inputParam.placeholderStyle.backgroundColor));
            }
            if (inputParam.placeholderStyle.color != null) {
                setHintTextColor(d.b(inputParam.placeholderStyle.color));
            }
        }
        if (inputParam.confirmType != null) {
            setImeOptions(a(inputParam.confirmType));
        }
        if (inputParam.value != null && !TextUtils.equals(getValue(), inputParam.value)) {
            setText(inputParam.value);
        }
        if (inputParam.placeholder != null) {
            setHint(inputParam.placeholder);
        }
        if (inputParam.fontStyle != null) {
            String str2 = inputParam.fontStyle;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1178781136) {
                if (hashCode != -1039745817) {
                    if (hashCode == 3029637 && str2.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)) {
                        c = 0;
                    }
                } else if (str2.equals("normal")) {
                    c = 2;
                }
            } else if (str2.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC)) {
                c = 1;
            }
            switch (c) {
                case 0:
                    setTypeface(Typeface.defaultFromStyle(1));
                    break;
                case 1:
                    setTypeface(Typeface.defaultFromStyle(2));
                    break;
                case 2:
                    setTypeface(Typeface.defaultFromStyle(0));
                    break;
            }
        }
        if (inputParam.color != null) {
            try {
                setTextColor(Integer.valueOf(inputParam.color).intValue());
            } catch (Exception unused) {
                setTextColor(d.b(inputParam.color));
            }
        }
        try {
            if (!TextUtils.isEmpty(getText())) {
                if (inputParam.cursor != null && inputParam.cursor.intValue() >= 0 && inputParam.cursor.intValue() < getText().length()) {
                    setSelection(inputParam.cursor.intValue());
                }
                setSelection(getText().length());
            }
            if (inputParam.selectionStart.intValue() != 0 || inputParam.selectionEnd.intValue() != 0) {
                int intValue = inputParam.selectionStart.intValue();
                int intValue2 = inputParam.selectionEnd.intValue();
                Object[] objArr2 = {Integer.valueOf(intValue), Integer.valueOf(intValue2)};
                ChangeQuickRedirect changeQuickRedirect2 = c.b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aa90c5a57266b98084f1c9c5d4f3421", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aa90c5a57266b98084f1c9c5d4f3421")).booleanValue();
                } else {
                    if (intValue2 >= intValue) {
                        int length = length();
                        if (intValue <= length) {
                            if (intValue2 <= length) {
                                if (intValue >= 0) {
                                    if (intValue2 < 0) {
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    setSelection(inputParam.selectionStart.intValue(), inputParam.selectionEnd.intValue());
                }
            }
        } catch (Exception e) {
            com.meituan.msi.log.a.a(e.getMessage());
        }
        String str3 = inputParam.textAlign;
        if (TextUtils.equals(str3, "center")) {
            setGravity(17);
        } else if (TextUtils.equals(str3, "left")) {
            setGravity(19);
        } else if (TextUtils.equals(str3, "right")) {
            setGravity(21);
        }
        if (inputParam.password != null && inputParam.password.booleanValue()) {
            setInputType(128);
            setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (inputParam.disabled != null && inputParam.disabled.booleanValue()) {
            setEnabled(false);
        }
        if (inputParam.cursorSpacing != null && inputParam.cursorSpacing.intValue() >= 0) {
            this.z = inputParam.cursorSpacing.intValue();
        }
        if (inputParam.adjustPosition != null) {
            this.A = inputParam.adjustPosition.booleanValue();
        }
        if (inputParam.confirmHold != null) {
            this.B = inputParam.confirmHold.booleanValue();
        }
        if (inputParam.maxlength != null) {
            setInputFilter(inputParam.maxlength.intValue());
        }
        if (inputParam.focus == null || !inputParam.focus.booleanValue()) {
            return;
        }
        c.postDelayed(new Runnable() { // from class: com.meituan.msi.api.component.input.Input.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8702860370379a98b0d75376bbfc7761", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8702860370379a98b0d75376bbfc7761");
                } else {
                    this.requestFocus();
                }
            }
        }, 100L);
    }

    @Override // com.meituan.msi.api.component.input.c
    public int getInputHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee8d05c0b598144ddbe9581baea1c52", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee8d05c0b598144ddbe9581baea1c52")).intValue() : getMeasuredHeight();
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ebb4af91b22e0146e4365ec33b3dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ebb4af91b22e0146e4365ec33b3dcf");
        } else {
            super.setSingleLine(true);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(final View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e08b8007978365b63b9d08e3b4d62c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e08b8007978365b63b9d08e3b4d62c9");
            return;
        }
        this.h = z;
        if (z) {
            if (this.x == null) {
                d();
            }
            final Context context = getContext();
            Object[] objArr2 = {view, context};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "61b5c654b2247aa5a55d135a71ada84b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "61b5c654b2247aa5a55d135a71ada84b");
            } else if (view.requestFocus()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.msi.api.component.input.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cba42c9b48912b697191e29133f0e59c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cba42c9b48912b697191e29133f0e59c");
                        } else {
                            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 1);
                        }
                    }
                });
            }
        }
        if (z) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", getValue());
            jSONObject.put("cursor", getCursor());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.u != null) {
            this.u.a("onBlur", jSONObject);
        }
    }

    @Override // com.meituan.msi.api.component.input.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa29208df5f5dd6329ea7dca570a079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa29208df5f5dd6329ea7dca570a079");
        } else if (this.x != null) {
            com.meituan.msi.log.a.a("input: success to register KeyBoardProvider");
            this.x.a(new com.meituan.msi.page.d() { // from class: com.meituan.msi.api.component.input.Input.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.page.d
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31e4ad5e21e8e327fff43cec330ef773", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31e4ad5e21e8e327fff43cec330ef773");
                        return;
                    }
                    if (Input.this.u != null) {
                        MSIBaseInputEvent mSIBaseInputEvent = new MSIBaseInputEvent();
                        mSIBaseInputEvent.value = Input.this.getValue();
                        mSIBaseInputEvent.height = i;
                        mSIBaseInputEvent.viewId = Input.this.k;
                        Input.this.u.a("onKeyboardHeightChange", mSIBaseInputEvent);
                    }
                    if (Input.this.h) {
                        Input.a(Input.this, i);
                    }
                    if (i <= 0 && Input.this.D) {
                        Input.c(Input.this);
                    }
                    Input.a(Input.this, true);
                }
            });
        } else {
            com.meituan.msi.log.a.a("input: failed to register KeyBoardProvider");
        }
    }

    public void setInputFilter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3d51403ad12847c72f5b6ad8e86e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3d51403ad12847c72f5b6ad8e86e48");
        } else {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter((i < 0 || i > 9999) ? Integer.MAX_VALUE : Integer.MAX_VALUE)});
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f9a985811e2aa91bee5af328160210", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f9a985811e2aa91bee5af328160210")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.D = false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
