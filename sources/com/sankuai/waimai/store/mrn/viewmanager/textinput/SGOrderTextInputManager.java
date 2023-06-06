package com.sankuai.waimai.store.mrn.viewmanager.textinput;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.d;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.l;
import com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGOrderTextInputManager extends SimpleViewManager<SGOrderTextInput> {
    private static final int ADD_TAG = 3;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final String REACT_CLASS = "SMOrderInput";
    private static final int REMOVE_TAG = 4;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    @SuppressLint({"ClickableViewAccessibility"})
    public SGOrderTextInput createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b92c5940edcd8ddaa0e6758831c97194", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGOrderTextInput) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b92c5940edcd8ddaa0e6758831c97194");
        }
        final SGOrderTextInput sGOrderTextInput = (SGOrderTextInput) LayoutInflater.from(aoVar).inflate(R.layout.wm_sc_mrn_order_textinput_layout, (ViewGroup) null);
        sGOrderTextInput.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        sGOrderTextInput.setFocusable(true);
        sGOrderTextInput.setFocusableInTouchMode(true);
        sGOrderTextInput.setGravity(51);
        sGOrderTextInput.setLines(4);
        sGOrderTextInput.setInputType(131073);
        sGOrderTextInput.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInputManager.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b54a4021fae9f5d859bd82a5156aa332", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b54a4021fae9f5d859bd82a5156aa332")).booleanValue();
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        if (sGOrderTextInput.isFocused()) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            break;
                        }
                        break;
                    case 1:
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }
                return false;
            }
        });
        sGOrderTextInput.setTagChangedListener(new SGOrderTextInput.a() { // from class: com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInputManager.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInput.a
            public final void a(List<String> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "08ff72103f49881f8d16671fc08c8975", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "08ff72103f49881f8d16671fc08c8975");
                } else if (sGOrderTextInput.getContext() instanceof ReactContext) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putArray("tagList", Arguments.fromList(list));
                    ((RCTEventEmitter) ((ReactContext) sGOrderTextInput.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(sGOrderTextInput.getId(), "onTagChanged", createMap);
                }
            }

            @Override // com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInput.a
            public final void a(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b53b18b651d7be797155ef19656e2468", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b53b18b651d7be797155ef19656e2468");
                } else if (sGOrderTextInput.getContext() instanceof ReactContext) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("text", str);
                    createMap.putInt("realCount", i);
                    ((RCTEventEmitter) ((ReactContext) sGOrderTextInput.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(sGOrderTextInput.getId(), "onTextChanged", createMap);
                }
            }

            @Override // com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInput.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b29ec149b97049aa3f337053ba03b0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b29ec149b97049aa3f337053ba03b0c");
                } else if (sGOrderTextInput.getContext() instanceof ReactContext) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("code", i);
                    ((RCTEventEmitter) ((ReactContext) sGOrderTextInput.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(sGOrderTextInput.getId(), "onErrorToast", createMap);
                }
            }
        });
        sGOrderTextInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInputManager.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a9d56eeb3beb7643e38dc3a07a49df3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a9d56eeb3beb7643e38dc3a07a49df3c");
                } else if (sGOrderTextInput.getContext() instanceof ReactContext) {
                    ((RCTEventEmitter) ((ReactContext) sGOrderTextInput.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(sGOrderTextInput.getId(), z ? "onFocus" : "onBlur", null);
                }
            }
        });
        return sGOrderTextInput;
    }

    @ReactProp(name = "textAlignVertical")
    public void setTextAlignVertical(SGOrderTextInput sGOrderTextInput, @Nullable String str) {
        Object[] objArr = {sGOrderTextInput, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38e3238b191259fe417eae9941b53fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38e3238b191259fe417eae9941b53fc7");
        } else if ("top".equals(str)) {
            sGOrderTextInput.setGravity(48);
        } else if ("bottom".equals(str)) {
            sGOrderTextInput.setGravity(80);
        } else if ("center".equals(str)) {
            sGOrderTextInput.setGravity(16);
        }
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(SGOrderTextInput sGOrderTextInput, @Nullable Integer num) {
        Object[] objArr = {sGOrderTextInput, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aad0d8c7cf444ad652918f747aa41295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aad0d8c7cf444ad652918f747aa41295");
        } else if (num == null) {
            sGOrderTextInput.setTextColor(d.a(sGOrderTextInput.getContext()));
        } else {
            sGOrderTextInput.setTextColor(num.intValue());
        }
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(SGOrderTextInput sGOrderTextInput, boolean z) {
        Object[] objArr = {sGOrderTextInput, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7c0a90cca8c3feaf6befde5adfa7ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7c0a90cca8c3feaf6befde5adfa7ff5");
        } else {
            sGOrderTextInput.setEnabled(z);
        }
    }

    @ReactProp(defaultInt = 1, name = NumberOfLines.LOWER_CASE_NAME)
    public void setNumLines(SGOrderTextInput sGOrderTextInput, int i) {
        Object[] objArr = {sGOrderTextInput, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecd0ea3330c16e0c2d051ab72ff6b97c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecd0ea3330c16e0c2d051ab72ff6b97c");
        } else {
            sGOrderTextInput.setLines(i);
        }
    }

    @ReactProp(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(SGOrderTextInput sGOrderTextInput, float f) {
        Object[] objArr = {sGOrderTextInput, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d1c764e41fcac9880a36dc90eb9373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d1c764e41fcac9880a36dc90eb9373");
        } else {
            sGOrderTextInput.setTextSize(2, f);
        }
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceHolder(SGOrderTextInput sGOrderTextInput, String str) {
        Object[] objArr = {sGOrderTextInput, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f15ef2b7ff4a41188c7496b30d85f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f15ef2b7ff4a41188c7496b30d85f66");
        } else {
            sGOrderTextInput.setHint(str);
        }
    }

    @ReactProp(name = "tagColor")
    public void setTagColor(SGOrderTextInput sGOrderTextInput, String str) {
        Object[] objArr = {sGOrderTextInput, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be8d99c30b32e17b5a1ca24b1fe18543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be8d99c30b32e17b5a1ca24b1fe18543");
        } else {
            sGOrderTextInput.setTagColor(str);
        }
    }

    @ReactProp(name = "maxCount")
    public void setMaxCount(SGOrderTextInput sGOrderTextInput, int i) {
        Object[] objArr = {sGOrderTextInput, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe89aff85edf58358ab19d8f3379d90b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe89aff85edf58358ab19d8f3379d90b");
        } else {
            sGOrderTextInput.setMaxCount(i);
        }
    }

    @ReactProp(name = "textColorHint")
    public void setTextColorHint(SGOrderTextInput sGOrderTextInput, String str) {
        Object[] objArr = {sGOrderTextInput, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a20bb1b935226bca99868a4afdcadbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a20bb1b935226bca99868a4afdcadbc");
        } else {
            sGOrderTextInput.setHintTextColor(com.sankuai.shangou.stone.util.d.a(str, -7829368));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@Nonnull SGOrderTextInput sGOrderTextInput, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {sGOrderTextInput, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ecab4def2f371679f581cca78b2bc54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ecab4def2f371679f581cca78b2bc54");
            return;
        }
        switch (i) {
            case 1:
                sGOrderTextInput.requestFocus();
                l.a(sGOrderTextInput, sGOrderTextInput.getContext());
                return;
            case 2:
                sGOrderTextInput.clearFocus();
                l.b(sGOrderTextInput, sGOrderTextInput.getContext());
                return;
            case 3:
                if (readableArray == null || readableArray.size() <= 0) {
                    return;
                }
                String string = readableArray.getString(0);
                Object[] objArr2 = {string};
                ChangeQuickRedirect changeQuickRedirect3 = SGOrderTextInput.a;
                if (PatchProxy.isSupport(objArr2, sGOrderTextInput, changeQuickRedirect3, false, "712505979a8323fa271ecf54adae49b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, sGOrderTextInput, changeQuickRedirect3, false, "712505979a8323fa271ecf54adae49b3");
                    return;
                } else if (TextUtils.isEmpty(string) || sGOrderTextInput.e.containsKey(string)) {
                    return;
                } else {
                    if (sGOrderTextInput.length() > 0 && sGOrderTextInput.getText() != null && sGOrderTextInput.getText().toString().charAt(sGOrderTextInput.length() - 1) != '\n') {
                        sGOrderTextInput.append("\n");
                    }
                    sGOrderTextInput.c = true;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(sGOrderTextInput.d);
                    sGOrderTextInput.e.put(string, foregroundColorSpan);
                    spannableStringBuilder.setSpan(foregroundColorSpan, 0, string.length(), 33);
                    sGOrderTextInput.append(spannableStringBuilder);
                    sGOrderTextInput.setSelection(sGOrderTextInput.getText().length());
                    if (sGOrderTextInput.b != null) {
                        sGOrderTextInput.b.a(new ArrayList(sGOrderTextInput.e.keySet()));
                        return;
                    }
                    return;
                }
            case 4:
                if (readableArray == null || readableArray.size() <= 0) {
                    return;
                }
                sGOrderTextInput.a(readableArray.getString(0));
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c6b85b5e60c6546d7d7edc0b4a22000", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c6b85b5e60c6546d7d7edc0b4a22000") : c.a("focus", 1, "blur", 2, "addTag", 3, "removeTag", 4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e11b1a35f3cfcb4bbd28939b64e5f309", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e11b1a35f3cfcb4bbd28939b64e5f309") : c.b().a("onTagChanged", c.a("phasedRegistrationNames", c.a("bubbled", "onTagChanged"))).a("onTextChanged", c.a("phasedRegistrationNames", c.a("bubbled", "onTextChanged"))).a("onFocus", c.a("phasedRegistrationNames", c.a("bubbled", "onFocus"))).a("onBlur", c.a("phasedRegistrationNames", c.a("bubbled", "onBlur"))).a("onErrorToast", c.a("phasedRegistrationNames", c.a("bubbled", "onErrorToast"))).a();
    }
}
