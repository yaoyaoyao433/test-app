package com.dianping.picasso.creator;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.InputModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.PicassoInputView;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.command.CommandViewInterface;
import com.dianping.picasso.view.command.InputViewCommandModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InputViewWrapper extends BaseViewWrapper<PicassoInputView, InputModel> implements CommandViewInterface {
    private static final int DEFAULT_HIT_COLOR = Color.rgb(193, 193, 193);
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoInputView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67903fe3c50510f5d7ecca8289e87b42", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoInputView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67903fe3c50510f5d7ecca8289e87b42");
        }
        PicassoInputView picassoInputView = new PicassoInputView(context);
        picassoInputView.setPadding(0, 0, 0, 0);
        return picassoInputView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(PicassoInputView picassoInputView, PicassoView picassoView, InputModel inputModel, InputModel inputModel2) {
        ?? r11;
        int i;
        int i2;
        int i3 = 3;
        Object[] objArr = {picassoInputView, picassoView, inputModel, inputModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70eece397d1d6b4525d1412718f81ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70eece397d1d6b4525d1412718f81ca9");
            return;
        }
        picassoInputView.setInUpdating(true);
        if (inputModel.editable) {
            i = 2;
            i2 = 1;
            r11 = 0;
            picassoInputView.setCustomKeyBoardView(inputModel.keyboardAccessoryView, inputModel.keyboardView, picassoView, inputModel.autoAdjust, inputModel.autoAdjustSpace);
        } else {
            r11 = 0;
            i = 2;
            i2 = 1;
        }
        if (inputModel2 == null || inputModel2.textSize != inputModel.textSize) {
            picassoInputView.setTextSize(i2, ((double) inputModel.textSize) > 1.0E-8d ? inputModel.textSize : 14.0f);
        }
        int parseColor = PicassoUtils.isValidColor(inputModel.hintColor) ? Color.parseColor(inputModel.hintColor) : DEFAULT_HIT_COLOR;
        if (parseColor != picassoInputView.getCurrentHintTextColor()) {
            picassoInputView.setHintTextColor(parseColor);
        }
        if (inputModel2 == null || !inputModel2.hint.equals(inputModel.hint)) {
            picassoInputView.setHint(inputModel.hint);
        }
        if (inputModel2 == null || inputModel2.inputType != inputModel.inputType) {
            picassoInputView.setInputType(InputModel.getInputType(inputModel.inputType));
        }
        if (inputModel2 == null || inputModel2.actionType != inputModel.actionType) {
            picassoInputView.setImeOptions(InputModel.getActionType(inputModel.actionType));
        }
        if (inputModel.multiline) {
            picassoInputView.setImeOptions(r11);
        }
        int parseColor2 = PicassoUtils.isValidColor(inputModel.textColor) ? Color.parseColor(inputModel.textColor) : -16777216;
        if (parseColor2 != picassoInputView.getCurrentTextColor()) {
            picassoInputView.setTextColor(parseColor2);
        }
        if (inputModel.inputAlignment == i2) {
            i3 = 5;
        } else if (inputModel.inputAlignment == i) {
            i3 = 1;
        }
        if (inputModel.multiline) {
            picassoInputView.setGravity(i3 | 48);
        } else {
            picassoInputView.setGravity(i3 | 16);
        }
        if (inputModel2 == null || inputModel2.multiline != inputModel.multiline) {
            picassoInputView.setSingleLine((inputModel.multiline ? 1 : 0) ^ i2);
        }
        if (inputModel2 == null || inputModel2.maxLength != inputModel.maxLength) {
            InputFilter[] inputFilterArr = new InputFilter[i2];
            inputFilterArr[r11] = new InputFilter.LengthFilter(inputModel.maxLength > 0 ? inputModel.maxLength : Integer.MAX_VALUE);
            picassoInputView.setFilters(inputFilterArr);
        }
        if (inputModel2 == null || inputModel2.secureTextEntry != inputModel.secureTextEntry) {
            if (!inputModel.secureTextEntry) {
                picassoInputView.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                picassoInputView.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        if (inputModel.autoFocus || (inputModel.inputFocus != null && inputModel.inputFocus.booleanValue())) {
            picassoInputView.setFocusable((boolean) i2);
            if (picassoView.getFocusedView() == null) {
                picassoInputView.requestFocus();
                picassoInputView.updateKeyboard();
                picassoView.setFocusedView(picassoInputView);
            }
        } else {
            if (inputModel.inputFocus != null && picassoInputView.isFocused()) {
                picassoView.setFocusableInTouchMode(i2);
                picassoInputView.clearFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) picassoInputView.getContext().getSystemService("input_method");
                if (inputMethodManager != 0) {
                    inputMethodManager.hideSoftInputFromWindow(picassoInputView.getWindowToken(), r11);
                }
                if (picassoInputView == picassoView.getFocusedView()) {
                    picassoView.setFocusedView(null);
                }
            }
            picassoInputView.setInLayout();
        }
        if ((picassoInputView.getEditableText() == null || !picassoInputView.getEditableText().toString().equals(inputModel.text)) && inputModel.text != null) {
            picassoInputView.setText(inputModel.text);
            if (inputModel.text != null) {
                picassoInputView.setSelection(picassoInputView.getText().length());
            }
        }
        picassoInputView.setInUpdating(r11);
        picassoInputView.setEnabled(inputModel.editable);
        if (inputModel.cursorIndex >= 0) {
            inputModel.cursorIndex = picassoInputView.setCursorIndex(inputModel.cursorIndex);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(PicassoInputView picassoInputView, InputModel inputModel) {
        Object[] objArr = {picassoInputView, inputModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c89155ac3f6b3974eb896cf2c4d7cb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c89155ac3f6b3974eb896cf2c4d7cb7b");
            return;
        }
        super.unbindActions((InputViewWrapper) picassoInputView, (PicassoInputView) inputModel);
        if (inputModel != null && inputModel.mTextWatcher != null) {
            picassoInputView.removeTextChangedListener(inputModel.mTextWatcher);
        }
        picassoInputView.setOnFocusChangeListener(null);
        picassoInputView.setOnEditorActionListener(null);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<InputModel> getDecodingFactory() {
        return InputModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(final PicassoInputView picassoInputView, final InputModel inputModel, final String str) {
        Object[] objArr = {picassoInputView, inputModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c03dc230a02f3669931baf31aa88c3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c03dc230a02f3669931baf31aa88c3c")).booleanValue();
        }
        if ("onTextChange".equals(str)) {
            inputModel.mTextWatcher = new TextWatcher() { // from class: com.dianping.picasso.creator.InputViewWrapper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ed6b8fdfdee9effaf90014e032c3c979", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ed6b8fdfdee9effaf90014e032c3c979");
                    } else if (picassoInputView.isInUpdating()) {
                    } else {
                        InputViewWrapper.this.callAction(inputModel, str, new JSONBuilder().put("newStr", editable.toString()).put("cursorIndex", Integer.valueOf(picassoInputView.getSelectionStart())).toJSONObject());
                    }
                }
            };
            picassoInputView.addTextChangedListener(inputModel.mTextWatcher);
            return true;
        } else if ("onFocus".equals(str)) {
            picassoInputView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.dianping.picasso.creator.InputViewWrapper.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    Object[] objArr2 = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af2ddd94a75d282a1e78830fc99dcbcf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af2ddd94a75d282a1e78830fc99dcbcf");
                    } else {
                        InputViewWrapper.this.callAction(inputModel, str, new JSONBuilder().put("isFocus", Boolean.valueOf(z)).toJSONObject());
                    }
                }
            });
            return true;
        } else if ("onReturnDone".equals(str)) {
            if (inputModel.multiline) {
                picassoInputView.setOnKeyListener(new View.OnKeyListener() { // from class: com.dianping.picasso.creator.InputViewWrapper.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnKeyListener
                    public boolean onKey(View view, int i, KeyEvent keyEvent) {
                        Object[] objArr2 = {view, Integer.valueOf(i), keyEvent};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "836d05043a0f1d57fd1026af0818be3a", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "836d05043a0f1d57fd1026af0818be3a")).booleanValue();
                        }
                        if ((i == 66 || i == 23) && keyEvent.getAction() == 1) {
                            InputViewWrapper.this.callAction(inputModel, str, null);
                        }
                        return false;
                    }
                });
            } else {
                picassoInputView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.dianping.picasso.creator.InputViewWrapper.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        int keyCode;
                        Object[] objArr2 = {textView, Integer.valueOf(i), keyEvent};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ec3ce4afdad6621a9cd9eb1377937c2f", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ec3ce4afdad6621a9cd9eb1377937c2f")).booleanValue();
                        }
                        if (i != 0) {
                            switch (i) {
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    InputViewWrapper.this.callAction(inputModel, str, null);
                                    return true;
                                default:
                                    return false;
                            }
                        } else if (keyEvent == null || !((keyCode = keyEvent.getKeyCode()) == 66 || keyCode == 23)) {
                            return false;
                        } else {
                            if (!keyEvent.isLongPress() && keyEvent.getAction() == 1) {
                                InputViewWrapper.this.callAction(inputModel, str, null);
                            }
                            return true;
                        }
                    }
                });
            }
            return true;
        } else {
            return super.bindAction((InputViewWrapper) picassoInputView, (PicassoInputView) inputModel, str);
        }
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoModel[] getSubModels(InputModel inputModel) {
        Object[] objArr = {inputModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "505e1447fe330faca7d887c7cc2737f1", RobustBitConfig.DEFAULT_VALUE) ? (PicassoModel[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "505e1447fe330faca7d887c7cc2737f1") : new PicassoModel[]{inputModel.keyboardAccessoryView, inputModel.keyboardView};
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public DecodingFactory getCommandViewDecodingFactory() {
        return InputViewCommandModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9175ed3dcf8643ded3666f2ce4cc34f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9175ed3dcf8643ded3666f2ce4cc34f");
            return;
        }
        super.handleCommandView(view, baseViewCommandModel, picassoModel);
        if ((view instanceof PicassoInputView) && (baseViewCommandModel instanceof InputViewCommandModel) && (picassoModel instanceof InputModel)) {
            PicassoInputView picassoInputView = (PicassoInputView) view;
            InputViewCommandModel inputViewCommandModel = (InputViewCommandModel) baseViewCommandModel;
            InputModel inputModel = (InputModel) picassoModel;
            if (inputViewCommandModel.hasFocus != null) {
                if (inputViewCommandModel.hasFocus.booleanValue()) {
                    picassoInputView.requestFocus();
                } else {
                    picassoInputView.clearFocus();
                }
                if (inputModel.inputFocus != null) {
                    inputModel.inputFocus = inputViewCommandModel.hasFocus;
                }
            }
            if (inputViewCommandModel.clearText != null) {
                picassoInputView.setText("");
                if (inputModel.text != null) {
                    inputModel.text = "";
                }
            }
            if (inputViewCommandModel.cursorIndex != null) {
                picassoInputView.requestFocus();
                inputViewCommandModel.cursorIndex = Integer.valueOf(picassoInputView.setCursorIndex(inputViewCommandModel.cursorIndex.intValue()));
                if (inputModel.inputFocus != null) {
                    inputModel.inputFocus = Boolean.TRUE;
                }
                if (inputModel.cursorIndex != -1) {
                    inputModel.cursorIndex = inputViewCommandModel.cursorIndex.intValue();
                }
            }
        }
    }
}
