package com.meituan.android.recce.views.textinput;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.infer.annotation.a;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.text.j;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.meituan.android.recce.events.d;
import com.meituan.android.recce.events.f;
import com.meituan.android.recce.mrn.uimanager.b;
import com.meituan.android.recce.props.gens.ChangeText;
import com.meituan.android.recce.props.gens.EndEditing;
import com.meituan.android.recce.props.gens.SubmitEditing;
import com.meituan.android.recce.utils.c;
import com.meituan.android.recce.views.base.RecceUIManagerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceTextInputManager extends ReactTextInputManager implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean supportBlurEvent;
    private boolean supportEndEditEvent;
    private boolean supportFocusEvent;
    private boolean supportSubmitEvent;
    private boolean supportTextChangeEvent;

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RecceTextInput";
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends RecceTextInputShadowNode> getShadowNodeClass() {
        return RecceTextInputShadowNode.class;
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    public RecceTextInputShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5216213fd78dbe785da7f2cf053babe3", RobustBitConfig.DEFAULT_VALUE) ? (RecceTextInputShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5216213fd78dbe785da7f2cf053babe3") : new RecceTextInputShadowNode();
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager
    public RecceTextInputShadowNode createShadowNodeInstance(@Nullable j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab693c6d1f2b6c67f7fb4484eb7c210a", RobustBitConfig.DEFAULT_VALUE) ? (RecceTextInputShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab693c6d1f2b6c67f7fb4484eb7c210a") : new RecceTextInputShadowNode(jVar);
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    @NonNull
    public RecceEditText createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88814cc7559361de734e42b268b6c8be", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecceEditText) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88814cc7559361de734e42b268b6c8be");
        }
        RecceEditText recceEditText = new RecceEditText(aoVar);
        recceEditText.setInputType(recceEditText.getInputType() & (-131073));
        recceEditText.setReturnKeyType("done");
        recceEditText.setFocusableInTouchMode(true);
        return recceEditText;
    }

    @Override // com.facebook.react.views.textinput.ReactTextInputManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, ReactEditText reactEditText) {
        Object[] objArr = {aoVar, reactEditText};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f52e0cc911e641251218df5b7221e84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f52e0cc911e641251218df5b7221e84a");
            return;
        }
        RecceEditText recceEditText = (RecceEditText) reactEditText;
        handleTextChange(recceEditText);
        handleFocusChange(recceEditText);
        handleEditorAction(recceEditText);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public RecceTextInputVisitor getVisitor(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5386266e7d503b123d2f7c0c24682cfc", RobustBitConfig.DEFAULT_VALUE) ? (RecceTextInputVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5386266e7d503b123d2f7c0c24682cfc") : new RecceTextInputVisitor(this, (RecceEditText) view);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.b
    public void recceOnAfterUpdateTransaction(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b131724dc87e864d27dde6fc783fa57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b131724dc87e864d27dde6fc783fa57");
        } else {
            onAfterUpdateTransaction((ReactEditText) ((RecceEditText) view));
        }
    }

    public void setSupportBlurEvent(boolean z) {
        this.supportBlurEvent = z;
    }

    public void setSupportEndEditEvent(boolean z) {
        this.supportEndEditEvent = z;
    }

    public void setSupportFocusEvent(boolean z) {
        this.supportFocusEvent = z;
    }

    public void setSupportSubmitEvent(boolean z) {
        this.supportSubmitEvent = z;
    }

    public void setSupportTextChangeEvent(boolean z) {
        this.supportTextChangeEvent = z;
    }

    private void handleTextChange(final RecceEditText recceEditText) {
        Object[] objArr = {recceEditText};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7a0fec4958c2b2552572f715fc0824a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7a0fec4958c2b2552572f715fc0824a");
        } else {
            recceEditText.addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.recce.views.textinput.RecceTextInputManager.1
                public static ChangeQuickRedirect changeQuickRedirect;
                private String mPreviousText;

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                }

                {
                    RecceTextInputManager.this = this;
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    Object[] objArr2 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f1252e2bcfb63598e911d0171d6d3cde", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f1252e2bcfb63598e911d0171d6d3cde");
                    } else {
                        this.mPreviousText = charSequence.toString();
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    Object[] objArr2 = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "87dee9387a700b1a15889c39ce04afa3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "87dee9387a700b1a15889c39ce04afa3");
                    } else if (RecceTextInputManager.this.supportTextChangeEvent) {
                        if (i3 == 0 && i2 == 0) {
                            return;
                        }
                        a.a(this.mPreviousText);
                        String substring = charSequence.toString().substring(i, i + i3);
                        String substring2 = this.mPreviousText.substring(i, i + i2);
                        if (i3 == i2 && substring.equals(substring2)) {
                            return;
                        }
                        RecceUIManagerUtils.getRecceEventDispatcher(recceEditText).a(f.a(recceEditText.getId(), 107, ChangeText.LOWER_CASE_NAME, new c.a().a("text", recceEditText.getText()).a()));
                    }
                }
            });
        }
    }

    private void handleFocusChange(RecceEditText recceEditText) {
        Object[] objArr = {recceEditText};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb776d7614f719c15cbb81f35ab1926a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb776d7614f719c15cbb81f35ab1926a");
        } else {
            recceEditText.setOnFocusChangeListener(RecceTextInputManager$$Lambda$1.lambdaFactory$(this, recceEditText));
        }
    }

    public static /* synthetic */ void lambda$handleFocusChange$0(RecceTextInputManager recceTextInputManager, RecceEditText recceEditText, View view, boolean z) {
        Object[] objArr = {recceTextInputManager, recceEditText, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33acb7e925138a8ac1a55ad81c3acaed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33acb7e925138a8ac1a55ad81c3acaed");
            return;
        }
        d recceEventDispatcher = RecceUIManagerUtils.getRecceEventDispatcher(recceEditText);
        if (z) {
            if (recceTextInputManager.supportFocusEvent) {
                recceEventDispatcher.a(f.a(recceEditText.getId(), 105, "focus"));
                return;
            }
            return;
        }
        if (recceTextInputManager.supportBlurEvent) {
            recceEventDispatcher.a(f.a(recceEditText.getId(), 106, "blur"));
        }
        if (recceTextInputManager.supportEndEditEvent) {
            recceEventDispatcher.a(f.a(recceEditText.getId(), 108, EndEditing.LOWER_CASE_NAME, new c.a().a("text", recceEditText.getText()).a()));
        }
    }

    private void handleEditorAction(final RecceEditText recceEditText) {
        Object[] objArr = {recceEditText};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cee6769324b815b536f394aa7aeccf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cee6769324b815b536f394aa7aeccf1");
        } else {
            recceEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.meituan.android.recce.views.textinput.RecceTextInputManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    RecceTextInputManager.this = this;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e6982f59c2599488b4adb551f51ce3a3", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e6982f59c2599488b4adb551f51ce3a3")).booleanValue();
                    }
                    if ((i & 255) != 0 || i == 0) {
                        boolean blurOnSubmit = recceEditText.getBlurOnSubmit();
                        boolean z = (recceEditText.getInputType() & 131072) != 0;
                        if (RecceTextInputManager.this.supportSubmitEvent) {
                            RecceUIManagerUtils.getRecceEventDispatcher(recceEditText).a(f.a(recceEditText.getId(), 109, SubmitEditing.LOWER_CASE_NAME, new c.a().a("text", recceEditText.getText()).a()));
                        }
                        if (blurOnSubmit) {
                            recceEditText.clearFocus();
                        }
                        return blurOnSubmit || !z || i == 5 || i == 7;
                    }
                    return true;
                }
            });
        }
    }
}
