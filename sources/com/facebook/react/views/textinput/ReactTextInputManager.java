package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.au;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.q;
import com.facebook.react.views.text.r;
import com.meituan.android.mrn.utils.ak;
import com.meituan.android.recce.props.gens.AutoCorrect;
import com.meituan.android.recce.props.gens.AutoFocus;
import com.meituan.android.recce.props.gens.BlurOnSubmit;
import com.meituan.android.recce.props.gens.BorderBottomColor;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderLeftColor;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderRightColor;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.android.recce.props.gens.CaretHidden;
import com.meituan.android.recce.props.gens.DisableFullscreenUI;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.KeyboardType;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.MaxLength;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.common.StringUtil;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactTextInputManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextInputManager extends BaseViewManager<ReactEditText, LayoutShadowNode> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final int UNSET = -1;
    @Nullable
    protected com.facebook.react.views.text.j mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(ReactEditText reactEditText, @Nullable Integer num) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactEditText createViewInstance(ao aoVar) {
        ReactEditText reactEditText = new ReactEditText(aoVar);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType("done");
        return reactEditText;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    public ReactBaseTextShadowNode createShadowNodeInstance(@Nullable com.facebook.react.views.text.j jVar) {
        return new ReactTextInputShadowNode(jVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return com.facebook.react.common.c.b().a("topSubmitEditing", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).a("topEndEditing", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).a("topTextInput", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onTextInput", "captured", "onTextInputCapture"))).a("topFocus", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onFocus", "captured", "onFocusCapture"))).a("topBlur", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onBlur", "captured", "onBlurCapture"))).a("topKeyPress", com.facebook.react.common.c.a("phasedRegistrationNames", com.facebook.react.common.c.a("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.b().a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.c.a("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, int i, @Nullable ReadableArray readableArray) {
        switch (i) {
            case 1:
                receiveCommand(reactEditText, "focus", readableArray);
                return;
            case 2:
                receiveCommand(reactEditText, "blur", readableArray);
                return;
            case 3:
                return;
            case 4:
                receiveCommand(reactEditText, "setTextAndSelection", readableArray);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, String str, @Nullable ReadableArray readableArray) {
        char c2;
        switch (str.hashCode()) {
            case -1699362314:
                if (str.equals("blurTextInput")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1427010500:
                if (str.equals("setTextAndSelection")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1690703013:
                if (str.equals("focusTextInput")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                reactEditText.requestFocusFromJS();
                return;
            case 2:
            case 3:
                reactEditText.clearFocusFromJS();
                return;
            case 4:
                int i = readableArray.getInt(0);
                if (i == -1) {
                    return;
                }
                String string = readableArray.getString(1);
                int i2 = readableArray.getInt(2);
                int i3 = readableArray.getInt(3);
                if (i3 == -1) {
                    i3 = i2;
                }
                reactEditText.maybeSetTextFromJS(getReactTextUpdate(string, i, i2, i3));
                reactEditText.maybeSetSelection(i, i2, i3);
                return;
            default:
                return;
        }
    }

    private com.facebook.react.views.text.i getReactTextUpdate(String str, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) r.a(str, r.UNSET));
        return new com.facebook.react.views.text.i(spannableStringBuilder, i, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, i2, i3);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactEditText reactEditText, Object obj) {
        if (obj instanceof com.facebook.react.views.text.i) {
            com.facebook.react.views.text.i iVar = (com.facebook.react.views.text.i) obj;
            int i = (int) iVar.d;
            int i2 = (int) iVar.e;
            int i3 = (int) iVar.f;
            int i4 = (int) iVar.g;
            if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
                if (i == -1) {
                    i = reactEditText.getPaddingLeft();
                }
                if (i2 == -1) {
                    i2 = reactEditText.getPaddingTop();
                }
                if (i3 == -1) {
                    i3 = reactEditText.getPaddingRight();
                }
                if (i4 == -1) {
                    i4 = reactEditText.getPaddingBottom();
                }
                reactEditText.setPadding(i, i2, i3, i4);
            }
            if (iVar.c) {
                o.a(iVar.a, reactEditText);
            }
            reactEditText.maybeSetTextFromState(iVar);
            reactEditText.maybeSetSelection(iVar.b, iVar.j, iVar.k);
        }
    }

    @ReactProp(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(ReactEditText reactEditText, float f) {
        reactEditText.setFontSize(f);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(ReactEditText reactEditText, String str) {
        reactEditText.setFontFamily(str);
    }

    @ReactProp(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(ReactEditText reactEditText, float f) {
        reactEditText.setMaxFontSizeMultiplier(f);
    }

    @ReactProp(name = FontWeight.LOWER_CASE_NAME)
    public void setFontWeight(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setFontWeight(str);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setFontStyle(str);
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(ReactEditText reactEditText, boolean z) {
        reactEditText.setIncludeFontPadding(z);
    }

    @ReactProp(name = "importantForAutofill")
    public void setImportantForAutofill(ReactEditText reactEditText, @Nullable String str) {
        int i;
        if ("no".equals(str)) {
            i = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i = 8;
        } else if ("yes".equals(str)) {
            i = 1;
        } else {
            i = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(reactEditText, i);
    }

    private void setImportantForAutofill(ReactEditText reactEditText, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        reactEditText.setImportantForAutofill(i);
    }

    private void setAutofillHints(ReactEditText reactEditText, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        reactEditText.setAutofillHints(strArr);
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setSelectionWatcher(new c(reactEditText));
        } else {
            reactEditText.setSelectionWatcher(null);
        }
    }

    @ReactProp(name = BlurOnSubmit.LOWER_CASE_NAME)
    public void setBlurOnSubmit(ReactEditText reactEditText, @Nullable Boolean bool) {
        reactEditText.setBlurOnSubmit(bool);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setContentSizeWatcher(new a(reactEditText));
        } else {
            reactEditText.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(ReactEditText reactEditText, boolean z) {
        if (z) {
            reactEditText.setScrollWatcher(new b(reactEditText));
        } else {
            reactEditText.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(ReactEditText reactEditText, boolean z) {
        reactEditText.setOnKeyPress(z);
    }

    @ReactProp(defaultFloat = 0.0f, name = LetterSpacing.LOWER_CASE_NAME)
    public void setLetterSpacing(ReactEditText reactEditText, float f) {
        reactEditText.setLetterSpacingPt(f);
    }

    @ReactProp(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(ReactEditText reactEditText, boolean z) {
        reactEditText.setAllowFontScaling(z);
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceholder(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setHint(str);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num == null) {
            reactEditText.setHintTextColor(com.facebook.react.views.text.d.a(reactEditText.getContext(), 16842906));
        } else {
            reactEditText.setHintTextColor(num.intValue());
        }
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num == null) {
            reactEditText.setHighlightColor(com.facebook.react.views.text.d.b(reactEditText.getContext()));
        } else {
            reactEditText.setHighlightColor(num.intValue());
        }
        setCursorColor(reactEditText, num);
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public void setCursorColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable textCursorDrawable = reactEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable.setColorFilter(new BlendModeColorFilter(num.intValue(), BlendMode.SRC_IN));
                reactEditText.setTextCursorDrawable(textCursorDrawable);
            }
        } else if (Build.VERSION.SDK_INT == 28) {
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i = declaredField.getInt(reactEditText);
                if (i == 0) {
                    return;
                }
                Drawable drawable = ContextCompat.getDrawable(reactEditText.getContext(), i);
                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                Drawable[] drawableArr = {drawable, drawable};
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(reactEditText);
                Field declaredField3 = ak.a(obj).getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                declaredField3.set(obj, drawableArr);
            } catch (IllegalAccessException unused) {
            } catch (NoSuchFieldException unused2) {
            }
        }
    }

    @ReactProp(defaultBoolean = false, name = CaretHidden.LOWER_CASE_NAME)
    public void setCaretHidden(ReactEditText reactEditText, boolean z) {
        reactEditText.setCursorVisible(!z);
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(ReactEditText reactEditText, final boolean z) {
        reactEditText.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return z;
            }
        });
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setSelectAllOnFocus(z);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num != null) {
            reactEditText.setTextColor(num.intValue());
            return;
        }
        ColorStateList a2 = com.facebook.react.views.text.d.a(reactEditText.getContext(), 16842904);
        if (a2 != null) {
            reactEditText.setTextColor(a2);
            return;
        }
        Context context = reactEditText.getContext();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Could not get default text color from View Context: ");
        sb.append(context != null ? context.getClass().getCanonicalName() : StringUtil.NULL);
        ReactSoftException.logSoftException(str, new IllegalStateException(sb.toString()));
    }

    @ReactProp(name = TextAlign.LOWER_CASE_NAME)
    public void setTextAlign(ReactEditText reactEditText, @Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                reactEditText.setJustificationMode(1);
            }
            reactEditText.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            reactEditText.setJustificationMode(0);
        }
        if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            reactEditText.setGravityHorizontal(0);
        } else if ("left".equals(str)) {
            reactEditText.setGravityHorizontal(3);
        } else if ("right".equals(str)) {
            reactEditText.setGravityHorizontal(5);
        } else if ("center".equals(str)) {
            reactEditText.setGravityHorizontal(1);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
        }
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(ReactEditText reactEditText, @Nullable String str) {
        if (str == null || FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            reactEditText.setGravityVertical(0);
        } else if ("top".equals(str)) {
            reactEditText.setGravityVertical(48);
        } else if ("bottom".equals(str)) {
            reactEditText.setGravityVertical(80);
        } else if ("center".equals(str)) {
            reactEditText.setGravityVertical(16);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlignVertical: " + str);
        }
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setCompoundDrawablesWithIntrinsicBounds(com.facebook.react.views.imagehelper.a.a().a(reactEditText.getContext(), str), 0, 0, 0);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(ReactEditText reactEditText, int i) {
        reactEditText.setCompoundDrawablePadding(i);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(ReactEditText reactEditText, boolean z) {
        reactEditText.setEnabled(z);
    }

    @ReactProp(defaultInt = 1, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumLines(ReactEditText reactEditText, int i) {
        reactEditText.setLines(i);
    }

    @ReactProp(name = MaxLength.LOWER_CASE_NAME)
    public void setMaxLength(ReactEditText reactEditText, @Nullable Integer num) {
        InputFilter[] filters = reactEditText.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < filters.length; i++) {
                    if (!(filters[i] instanceof InputFilter.LengthFilter)) {
                        linkedList.add(filters[i]);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z = false;
            for (int i2 = 0; i2 < filters.length; i2++) {
                if (filters[i2] instanceof InputFilter.LengthFilter) {
                    filters[i2] = new InputFilter.LengthFilter(num.intValue());
                    z = true;
                }
            }
            if (z) {
                inputFilterArr = filters;
            } else {
                inputFilterArr = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
            }
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        reactEditText.setFilters(inputFilterArr);
    }

    @ReactProp(name = "autoCompleteType")
    public void setTextContentType(ReactEditText reactEditText, @Nullable String str) {
        if (str == null) {
            setImportantForAutofill(reactEditText, 2);
        } else if ("username".equals(str)) {
            setAutofillHints(reactEditText, "username");
        } else if ("password".equals(str)) {
            setAutofillHints(reactEditText, "password");
        } else if ("email".equals(str)) {
            setAutofillHints(reactEditText, "emailAddress");
        } else if ("name".equals(str)) {
            setAutofillHints(reactEditText, "name");
        } else if ("tel".equals(str)) {
            setAutofillHints(reactEditText, "phone");
        } else if ("street-address".equals(str)) {
            setAutofillHints(reactEditText, "postalAddress");
        } else if ("postal-code".equals(str)) {
            setAutofillHints(reactEditText, "postalCode");
        } else if ("cc-number".equals(str)) {
            setAutofillHints(reactEditText, "creditCardNumber");
        } else if ("cc-csc".equals(str)) {
            setAutofillHints(reactEditText, "creditCardSecurityCode");
        } else if ("cc-exp".equals(str)) {
            setAutofillHints(reactEditText, "creditCardExpirationDate");
        } else if ("cc-exp-month".equals(str)) {
            setAutofillHints(reactEditText, "creditCardExpirationMonth");
        } else if ("cc-exp-year".equals(str)) {
            setAutofillHints(reactEditText, "creditCardExpirationYear");
        } else if ("off".equals(str)) {
            setImportantForAutofill(reactEditText, 2);
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid autoCompleteType: " + str);
        }
    }

    @ReactProp(name = AutoCorrect.LOWER_CASE_NAME)
    public void setAutoCorrect(ReactEditText reactEditText, @Nullable Boolean bool) {
        int i;
        if (bool != null) {
            i = bool.booleanValue() ? 32768 : 524288;
        } else {
            i = 0;
        }
        updateStagedInputTypeFlag(reactEditText, 557056, i);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(ReactEditText reactEditText, boolean z) {
        updateStagedInputTypeFlag(reactEditText, z ? 0 : 131072, z ? 131072 : 0);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(ReactEditText reactEditText, boolean z) {
        updateStagedInputTypeFlag(reactEditText, z ? 0 : 144, z ? 128 : 0);
        checkPasswordType(reactEditText);
    }

    @ReactProp(name = "autoCapitalize")
    public void setAutoCapitalize(ReactEditText reactEditText, Dynamic dynamic) {
        int i = 16384;
        if (dynamic.getType() == ReadableType.Number) {
            i = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String asString = dynamic.asString();
            if (asString.equals("none")) {
                i = 0;
            } else if (asString.equals("characters")) {
                i = 4096;
            } else if (asString.equals("words")) {
                i = 8192;
            } else {
                asString.equals("sentences");
            }
        }
        updateStagedInputTypeFlag(reactEditText, AUTOCAPITALIZE_FLAGS, i);
    }

    @ReactProp(name = KeyboardType.LOWER_CASE_NAME)
    public void setKeyboardType(ReactEditText reactEditText, @Nullable String str) {
        int i;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i = 8194;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            i = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i = 3;
        } else {
            i = KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : 1;
        }
        updateStagedInputTypeFlag(reactEditText, 15, i);
        checkPasswordType(reactEditText);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(ReactEditText reactEditText, String str) {
        reactEditText.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = DisableFullscreenUI.LOWER_CASE_NAME)
    public void setDisableFullscreenUI(ReactEditText reactEditText, boolean z) {
        reactEditText.setDisableFullscreenUI(z);
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(ReactEditText reactEditText, String str) {
        reactEditText.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(ReactEditText reactEditText, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        if (i == 0) {
            reactEditText.setBorderRadius(f);
        } else {
            reactEditText.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = BorderStyle.LOWER_CASE_NAME)
    public void setBorderStyle(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setBorderStyle(str);
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setShowSoftInputOnFocus(z);
    }

    @ReactProp(defaultBoolean = false, name = AutoFocus.LOWER_CASE_NAME)
    public void setAutoFocus(ReactEditText reactEditText, boolean z) {
        reactEditText.setAutoFocus(z);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME})
    public void setBorderWidth(ReactEditText reactEditText, int i, float f) {
        if (!com.facebook.yoga.b.a(f)) {
            f = w.a(f);
        }
        reactEditText.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", BorderLeftColor.LOWER_CASE_NAME, BorderRightColor.LOWER_CASE_NAME, BorderTopColor.LOWER_CASE_NAME, BorderBottomColor.LOWER_CASE_NAME})
    public void setBorderColor(ReactEditText reactEditText, int i, Integer num) {
        reactEditText.setBorderColor(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & ViewCompat.MEASURED_SIZE_MASK, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactEditText reactEditText) {
        super.onAfterUpdateTransaction((ReactTextInputManager) reactEditText);
        reactEditText.maybeUpdateTypeface();
        reactEditText.commitStagedInputType();
    }

    private static void checkPasswordType(ReactEditText reactEditText) {
        if ((reactEditText.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (reactEditText.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(reactEditText, 128, 16);
    }

    private static void updateStagedInputTypeFlag(ReactEditText reactEditText, int i, int i2) {
        reactEditText.setStagedInputType(((~i) & reactEditText.getStagedInputType()) | i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.react.uimanager.events.c getEventDispatcher(ReactContext reactContext, ReactEditText reactEditText) {
        return au.a(reactContext, reactEditText.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d implements TextWatcher {
        private com.facebook.react.uimanager.events.c b;
        private ReactEditText c;
        private String d = null;

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        public d(ReactContext reactContext, ReactEditText reactEditText) {
            this.b = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.c = reactEditText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.d = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            JavaOnlyArray javaOnlyArray;
            int i5 = i2;
            if (this.c.mDisableTextDiffing) {
                return;
            }
            if (i3 == 0 && i5 == 0) {
                return;
            }
            com.facebook.infer.annotation.a.a(this.d);
            int i6 = i + i3;
            String substring = charSequence.toString().substring(i, i6);
            int i7 = i + i5;
            String substring2 = this.d.substring(i, i7);
            if (i3 == i5 && substring.equals(substring2)) {
                return;
            }
            JavaOnlyMap javaOnlyMap = this.c.mAttributedString;
            if (javaOnlyMap == null || !javaOnlyMap.hasKey("fragments")) {
                i4 = i;
            } else {
                String charSequence2 = charSequence.subSequence(i, i6).toString();
                String string = javaOnlyMap.getString("string");
                StringBuilder sb = new StringBuilder();
                sb.append(string.substring(0, i));
                sb.append(charSequence2);
                sb.append(string.length() > i7 ? string.substring(i7) : "");
                javaOnlyMap.putString("string", sb.toString());
                JavaOnlyArray javaOnlyArray2 = (JavaOnlyArray) javaOnlyMap.getArray("fragments");
                int i8 = i5;
                String str = charSequence2;
                boolean z = false;
                int i9 = 0;
                int i10 = i;
                int i11 = 0;
                while (i11 < javaOnlyArray2.size() && !z) {
                    JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) javaOnlyArray2.getMap(i11);
                    String string2 = javaOnlyMap2.getString("string");
                    int length = string2.length() + i9;
                    if (length >= i10) {
                        int i12 = i10 - i9;
                        int length2 = string2.length() - i12;
                        javaOnlyArray = javaOnlyArray2;
                        javaOnlyMap2.putString("string", string2.substring(0, i12) + str + string2.substring(i12 + Math.min(i8, length2)));
                        if (length2 < i8) {
                            i10 += length2;
                            i8 -= length2;
                            str = "";
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        javaOnlyArray = javaOnlyArray2;
                    }
                    i11++;
                    i9 = length;
                    javaOnlyArray2 = javaOnlyArray;
                }
                i5 = i8;
                i4 = i10;
            }
            if (this.c.mStateWrapper != null && javaOnlyMap != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (int i13 = 0; i13 < javaOnlyMap.getArray("fragments").size(); i13++) {
                    ReadableMap map = javaOnlyMap.getArray("fragments").getMap(i13);
                    WritableNativeMap writableNativeMap3 = new WritableNativeMap();
                    writableNativeMap3.putDouble("reactTag", map.getInt("reactTag"));
                    writableNativeMap3.putString("string", map.getString("string"));
                    writableNativeArray.pushMap((WritableMap) writableNativeMap3);
                }
                writableNativeMap2.putString("string", javaOnlyMap.getString("string"));
                writableNativeMap2.putArray("fragments", (WritableArray) writableNativeArray);
                writableNativeMap.putInt("mostRecentEventCount", this.c.incrementAndGetEventCounter());
                writableNativeMap.putMap("textChanged", (WritableMap) writableNativeMap2);
            }
            this.b.a(new com.facebook.react.views.textinput.d(this.c.getId(), charSequence.toString(), this.c.incrementAndGetEventCounter()));
            this.b.a(new g(this.c.getId(), substring, substring2, i4, i4 + i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ao aoVar, final ReactEditText reactEditText) {
        reactEditText.addTextChangedListener(new d(aoVar, reactEditText));
        reactEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                com.facebook.react.uimanager.events.c eventDispatcher = ReactTextInputManager.getEventDispatcher(aoVar, reactEditText);
                if (z) {
                    eventDispatcher.a(new h(reactEditText.getId()));
                    return;
                }
                eventDispatcher.a(new e(reactEditText.getId()));
                eventDispatcher.a(new f(reactEditText.getId(), reactEditText.getText().toString()));
            }
        });
        reactEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if ((i & 255) != 0 || i == 0) {
                    boolean blurOnSubmit = reactEditText.getBlurOnSubmit();
                    boolean isMultiline = reactEditText.isMultiline();
                    ReactTextInputManager.getEventDispatcher(aoVar, reactEditText).a(new l(reactEditText.getId(), reactEditText.getText().toString()));
                    if (blurOnSubmit) {
                        reactEditText.clearFocus();
                    }
                    return blurOnSubmit || !isMultiline || i == 5 || i == 7;
                }
                return true;
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements com.facebook.react.views.textinput.a {
        private ReactEditText b;
        private com.facebook.react.uimanager.events.c c;
        private int d = 0;
        private int e = 0;

        public a(ReactEditText reactEditText) {
            this.b = reactEditText;
            this.c = ((UIManagerModule) au.a(reactEditText).getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        @Override // com.facebook.react.views.textinput.a
        public final void a() {
            int width = this.b.getWidth();
            int height = this.b.getHeight();
            if (this.b.getLayout() != null) {
                width = this.b.getCompoundPaddingLeft() + this.b.getLayout().getWidth() + this.b.getCompoundPaddingRight();
                height = this.b.getCompoundPaddingTop() + this.b.getLayout().getHeight() + this.b.getCompoundPaddingBottom();
            }
            if (width == this.d && height == this.e) {
                return;
            }
            this.e = height;
            this.d = width;
            this.c.a(new com.facebook.react.views.textinput.b(this.b.getId(), w.c(width), w.c(height)));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c implements n {
        private ReactEditText b;
        private com.facebook.react.uimanager.events.c c;
        private int d;
        private int e;

        public c(ReactEditText reactEditText) {
            this.b = reactEditText;
            this.c = ReactTextInputManager.getEventDispatcher(au.a(reactEditText), reactEditText);
        }

        @Override // com.facebook.react.views.textinput.n
        public final void a(int i, int i2) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            if (this.d == min && this.e == max) {
                return;
            }
            this.c.a(new k(this.b.getId(), min, max));
            this.d = min;
            this.e = max;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements m {
        private ReactEditText b;
        private com.facebook.react.uimanager.events.c c;
        private int d;
        private int e;

        public b(ReactEditText reactEditText) {
            this.b = reactEditText;
            this.c = ReactTextInputManager.getEventDispatcher(au.a(reactEditText), reactEditText);
        }

        @Override // com.facebook.react.views.textinput.m
        public final void a(int i, int i2, int i3, int i4) {
            if (this.d == i && this.e == i2) {
                return;
            }
            this.c.a(com.facebook.react.views.scroll.h.a(this.b.getId(), com.facebook.react.views.scroll.i.SCROLL, i, i2, 0.0f, 0.0f, 0, 0, this.b.getWidth(), this.b.getHeight()));
            this.d = i;
            this.e = i2;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedViewConstants() {
        return com.facebook.react.common.c.a("AutoCapitalizationType", com.facebook.react.common.c.a("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ReactEditText reactEditText, int i, int i2, int i3, int i4) {
        reactEditText.setPadding(i, i2, i3, i4);
    }

    protected EditText createInternalEditText(ao aoVar) {
        return new EditText(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactEditText reactEditText, ag agVar, @Nullable an anVar) {
        ReadableNativeMap a2 = anVar.a();
        if (!a2.getBoolean("hasThemeData")) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ReactContext a3 = au.a(reactEditText);
            if (a3 instanceof ao) {
                EditText createInternalEditText = createInternalEditText((ao) a3);
                writableNativeMap.putNull("textChanged");
                writableNativeMap.putDouble("themePaddingStart", w.c(ViewCompat.getPaddingStart(createInternalEditText)));
                writableNativeMap.putDouble("themePaddingEnd", w.c(ViewCompat.getPaddingEnd(createInternalEditText)));
                writableNativeMap.putDouble("themePaddingTop", w.c(createInternalEditText.getPaddingTop()));
                writableNativeMap.putDouble("themePaddingBottom", w.c(createInternalEditText.getPaddingBottom()));
            } else {
                String str = TAG;
                StringBuilder sb = new StringBuilder("ReactContext is not a ThemedReactContent: ");
                sb.append(a3 != null ? a3.getClass().getName() : StringUtil.NULL);
                ReactSoftException.logSoftException(str, new IllegalStateException(sb.toString()));
            }
        }
        ReadableNativeMap map = a2.getMap("attributedString");
        ReadableNativeMap map2 = a2.getMap("paragraphAttributes");
        Spannable a4 = q.a(reactEditText.getContext(), map, this.mReactTextViewManagerCallback);
        int a5 = com.facebook.react.views.text.m.a(map2.getString("textBreakStrategy"));
        reactEditText.mStateWrapper = anVar;
        com.facebook.react.views.text.i iVar = new com.facebook.react.views.text.i(a4, a2.getInt("mostRecentEventCount"), false, com.facebook.react.views.text.m.a(agVar), a5, com.facebook.react.views.text.m.b(agVar));
        iVar.m = map;
        return iVar;
    }
}
