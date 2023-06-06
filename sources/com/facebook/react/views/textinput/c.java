package com.facebook.react.views.textinput;

import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {
    private ReactEditText a;
    private com.facebook.react.uimanager.events.c b;
    private boolean c;
    @Nullable
    private String d;

    public c(InputConnection inputConnection, ReactContext reactContext, ReactEditText reactEditText) {
        super(inputConnection, false);
        this.d = null;
        this.b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.a = reactEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        this.c = false;
        if (this.d != null) {
            b(this.d);
            this.d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.a.getSelectionStart();
        int selectionEnd = this.a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.a.getSelectionStart();
        boolean z = false;
        a((((selectionStart2 < selectionStart || selectionStart2 <= 0) ? true : true) || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            a(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        b("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                b("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                b("Enter");
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    private void a(String str) {
        if (this.c) {
            this.d = str;
        } else {
            b(str);
        }
    }

    private void b(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.b.a(new i(this.a.getId(), str));
    }
}
