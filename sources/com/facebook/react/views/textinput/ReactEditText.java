package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.au;
import com.facebook.react.views.text.o;
import com.unionpay.tsmservice.mi.data.Constant;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactEditText extends AppCompatEditText {
    private static final int UNSET = -1;
    private static final KeyListener sKeyListener = QwertyKeyListener.getInstanceForFullKeyboard();
    @Nullable
    protected JavaOnlyMap mAttributedString;
    private boolean mAutoFocus;
    @Nullable
    private Boolean mBlurOnSubmit;
    protected boolean mContainsImages;
    @Nullable
    private com.facebook.react.views.textinput.a mContentSizeWatcher;
    private int mDefaultGravityHorizontal;
    private int mDefaultGravityVertical;
    private boolean mDetectScrollMovement;
    private boolean mDidAttachToWindow;
    private boolean mDisableFullscreen;
    protected boolean mDisableTextDiffing;
    @Nullable
    private String mFontFamily;
    private int mFontStyle;
    private int mFontWeight;
    private final InputMethodManager mInputMethodManager;
    protected boolean mIsSettingTextFromJS;
    protected boolean mIsSettingTextFromState;
    private final a mKeyListener;
    @Nullable
    private ArrayList<TextWatcher> mListeners;
    protected int mNativeEventCount;
    private boolean mOnKeyPress;
    private com.facebook.react.views.view.e mReactBackgroundManager;
    @Nullable
    private String mReturnKeyType;
    @Nullable
    private m mScrollWatcher;
    @Nullable
    private n mSelectionWatcher;
    private int mStagedInputType;
    @Nullable
    protected an mStateWrapper;
    private com.facebook.react.views.text.n mTextAttributes;
    @Nullable
    private b mTextWatcherDelegator;
    private boolean mTypefaceDirty;

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public ReactEditText(Context context) {
        super(context, null, 0);
        this.mDetectScrollMovement = false;
        this.mOnKeyPress = false;
        this.mTypefaceDirty = false;
        this.mFontFamily = null;
        this.mFontWeight = -1;
        this.mFontStyle = -1;
        this.mAutoFocus = false;
        this.mDidAttachToWindow = false;
        this.mAttributedString = null;
        this.mStateWrapper = null;
        this.mDisableTextDiffing = false;
        this.mIsSettingTextFromState = false;
        setFocusableInTouchMode(false);
        this.mReactBackgroundManager = new com.facebook.react.views.view.e(this);
        this.mInputMethodManager = (InputMethodManager) com.facebook.infer.annotation.a.a(context.getSystemService("input_method"));
        this.mDefaultGravityHorizontal = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        this.mDefaultGravityVertical = getGravity() & 112;
        this.mNativeEventCount = 0;
        this.mIsSettingTextFromJS = false;
        this.mBlurOnSubmit = null;
        this.mDisableFullscreen = false;
        this.mListeners = null;
        this.mTextWatcherDelegator = null;
        this.mStagedInputType = getInputType();
        this.mKeyListener = new a();
        this.mScrollWatcher = null;
        this.mTextAttributes = new com.facebook.react.views.text.n();
        applyTextAttributes();
        if (Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27) {
            setLayerType(1, null);
        }
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.facebook.react.views.textinput.ReactEditText.1
            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (i == 16) {
                    return ReactEditText.this.requestFocusInternal();
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
        });
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onContentSizeChange();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDetectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.mDetectScrollMovement) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.mDetectScrollMovement = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 66 && !isMultiline()) {
            hideSoftKeyboard();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.mScrollWatcher != null) {
            this.mScrollWatcher.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext a2 = au.a(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.mOnKeyPress) {
            onCreateInputConnection = new c(onCreateInputConnection, a2, this);
        }
        if (isMultiline() && getBlurOnSubmit()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        hideSoftKeyboard();
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean requestFocusInternal() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            showSoftKeyboard();
        }
        return requestFocus;
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.mListeners.add(textWatcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners != null) {
            this.mListeners.remove(textWatcher);
            if (this.mListeners.isEmpty()) {
                this.mListeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public void setContentSizeWatcher(com.facebook.react.views.textinput.a aVar) {
        this.mContentSizeWatcher = aVar;
    }

    public void setScrollWatcher(m mVar) {
        this.mScrollWatcher = mVar;
    }

    public void maybeSetSelection(int i, int i2, int i3) {
        if (!canUpdateWithEventCount(i) || i2 == -1 || i3 == -1) {
            return;
        }
        setSelection(i2, i3);
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.mSelectionWatcher == null || !hasFocus()) {
            return;
        }
        this.mSelectionWatcher.a(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z || this.mSelectionWatcher == null) {
            return;
        }
        this.mSelectionWatcher.a(getSelectionStart(), getSelectionEnd());
    }

    public void setSelectionWatcher(n nVar) {
        this.mSelectionWatcher = nVar;
    }

    public void setBlurOnSubmit(@Nullable Boolean bool) {
        this.mBlurOnSubmit = bool;
    }

    public void setOnKeyPress(boolean z) {
        this.mOnKeyPress = z;
    }

    public boolean getBlurOnSubmit() {
        if (this.mBlurOnSubmit == null) {
            return !isMultiline();
        }
        return this.mBlurOnSubmit.booleanValue();
    }

    public void setDisableFullscreenUI(boolean z) {
        this.mDisableFullscreen = z;
        updateImeOptions();
    }

    public boolean getDisableFullscreenUI() {
        return this.mDisableFullscreen;
    }

    public void setReturnKeyType(String str) {
        this.mReturnKeyType = str;
        updateImeOptions();
    }

    public String getReturnKeyType() {
        return this.mReturnKeyType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.mStagedInputType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedInputType(int i) {
        this.mStagedInputType = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void commitStagedInputType() {
        if (getInputType() != this.mStagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.mStagedInputType);
            setSelection(selectionStart, selectionEnd);
        }
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        super.setTypeface(super.getTypeface());
        if (i == 32 && Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.startsWith(Constant.DEVICE_XIAOMI)) {
            i = 1;
        }
        super.setInputType(i);
        this.mStagedInputType = i;
        if (isMultiline()) {
            setSingleLine(false);
        }
        this.mKeyListener.a = i;
        setKeyListener(this.mKeyListener);
    }

    public void setFontFamily(String str) {
        this.mFontFamily = str;
        this.mTypefaceDirty = true;
    }

    public void setFontWeight(String str) {
        int a2 = com.facebook.react.views.text.k.a(str);
        if (a2 != this.mFontWeight) {
            this.mFontWeight = a2;
            this.mTypefaceDirty = true;
        }
    }

    public void setFontStyle(String str) {
        int b2 = com.facebook.react.views.text.k.b(str);
        if (b2 != this.mFontStyle) {
            this.mFontStyle = b2;
            this.mTypefaceDirty = true;
        }
    }

    public void maybeUpdateTypeface() {
        if (this.mTypefaceDirty) {
            this.mTypefaceDirty = false;
            setTypeface(com.facebook.react.views.text.k.a(getTypeface(), this.mFontStyle, this.mFontWeight, this.mFontFamily, getContext().getAssets()));
        }
    }

    public void requestFocusFromJS() {
        requestFocusInternal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearFocusFromJS() {
        clearFocus();
    }

    public int incrementAndGetEventCounter() {
        int i = this.mNativeEventCount + 1;
        this.mNativeEventCount = i;
        return i;
    }

    public void maybeSetTextFromJS(com.facebook.react.views.text.i iVar) {
        this.mIsSettingTextFromJS = true;
        maybeSetText(iVar);
        this.mIsSettingTextFromJS = false;
    }

    public void maybeSetTextFromState(com.facebook.react.views.text.i iVar) {
        this.mIsSettingTextFromState = true;
        maybeSetText(iVar);
        this.mIsSettingTextFromState = false;
    }

    public boolean canUpdateWithEventCount(int i) {
        return i >= this.mNativeEventCount;
    }

    public void maybeSetText(com.facebook.react.views.text.i iVar) {
        if (!(isSecureText() && TextUtils.equals(getText(), iVar.a)) && canUpdateWithEventCount(iVar.b)) {
            if (iVar.m != null) {
                this.mAttributedString = JavaOnlyMap.deepClone(iVar.m);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.a);
            manageSpans(spannableStringBuilder);
            this.mContainsImages = iVar.c;
            this.mDisableTextDiffing = true;
            if (iVar.a.length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.mDisableTextDiffing = false;
            if (Build.VERSION.SDK_INT < 23 || getBreakStrategy() == iVar.i) {
                return;
            }
            setBreakStrategy(iVar.i);
        }
    }

    private void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = getText().getSpans(0, length(), Object.class);
        for (int i = 0; i < spans.length; i++) {
            if (spans[i] instanceof com.facebook.react.views.text.g) {
                getText().removeSpan(spans[i]);
            }
            if ((getText().getSpanFlags(spans[i]) & 33) == 33) {
                Object obj = spans[i];
                int spanStart = getText().getSpanStart(spans[i]);
                int spanEnd = getText().getSpanEnd(spans[i]);
                int spanFlags = getText().getSpanFlags(spans[i]);
                getText().removeSpan(spans[i]);
                if (sameTextForSpan(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private static boolean sameTextForSpan(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    protected boolean showSoftKeyboard() {
        return this.mInputMethodManager.showSoftInput(this, 0);
    }

    protected void hideSoftKeyboard() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private b getTextWatcherDelegator() {
        if (this.mTextWatcherDelegator == null) {
            this.mTextWatcherDelegator = new b();
        }
        return this.mTextWatcherDelegator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isMultiline() {
        return (getInputType() & 131072) != 0;
    }

    private boolean isSecureText() {
        return (getInputType() & 144) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onContentSizeChange() {
        if (this.mContentSizeWatcher != null) {
            this.mContentSizeWatcher.a();
        }
        setIntrinsicContentSize();
    }

    private void setIntrinsicContentSize() {
        if (this.mStateWrapper == null) {
            ReactContext a2 = au.a(this);
            ((UIManagerModule) a2.getNativeModule(UIManagerModule.class)).setViewLocalData(getId(), new j(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.mDefaultGravityHorizontal;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.mDefaultGravityVertical;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateImeOptions() {
        /*
            r9 = this;
            java.lang.String r0 = r9.mReturnKeyType
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 5
            r5 = 2
            r6 = 6
            if (r0 == 0) goto L6a
            java.lang.String r0 = r9.mReturnKeyType
            r7 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1273775369: goto L51;
                case -906336856: goto L47;
                case 3304: goto L3d;
                case 3089282: goto L33;
                case 3377907: goto L29;
                case 3387192: goto L1f;
                case 3526536: goto L15;
                default: goto L14;
            }
        L14:
            goto L5b
        L15:
            java.lang.String r8 = "send"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 5
            goto L5c
        L1f:
            java.lang.String r8 = "none"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 2
            goto L5c
        L29:
            java.lang.String r8 = "next"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 1
            goto L5c
        L33:
            java.lang.String r8 = "done"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 6
            goto L5c
        L3d:
            java.lang.String r8 = "go"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 0
            goto L5c
        L47:
            java.lang.String r8 = "search"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 4
            goto L5c
        L51:
            java.lang.String r8 = "previous"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L5b
            r0 = 3
            goto L5c
        L5b:
            r0 = -1
        L5c:
            switch(r0) {
                case 0: goto L68;
                case 1: goto L66;
                case 2: goto L64;
                case 3: goto L62;
                case 4: goto L60;
                case 5: goto L6b;
                case 6: goto L6a;
                default: goto L5f;
            }
        L5f:
            goto L6a
        L60:
            r1 = 3
            goto L6b
        L62:
            r1 = 7
            goto L6b
        L64:
            r1 = 1
            goto L6b
        L66:
            r1 = 5
            goto L6b
        L68:
            r1 = 2
            goto L6b
        L6a:
            r1 = 6
        L6b:
            boolean r0 = r9.mDisableFullscreen
            if (r0 == 0) goto L76
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            return
        L76:
            r9.setImeOptions(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactEditText.updateImeOptions():void");
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && getText() != null) {
            Editable text = getText();
            for (o oVar : (o[]) text.getSpans(0, text.length(), o.class)) {
                if (oVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && getText() != null) {
            Editable text = getText();
            for (o oVar : (o[]) text.getSpans(0, text.length(), o.class)) {
                if (oVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.mContainsImages || getText() == null) {
            return;
        }
        Editable text = getText();
        for (o oVar : (o[]) text.getSpans(0, text.length(), o.class)) {
            oVar.b();
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (!this.mContainsImages || getText() == null) {
            return;
        }
        Editable text = getText();
        for (o oVar : (o[]) text.getSpans(0, text.length(), o.class)) {
            oVar.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mContainsImages && getText() != null) {
            Editable text = getText();
            for (o oVar : (o[]) text.getSpans(0, text.length(), o.class)) {
                oVar.d();
            }
        }
        if (this.mAutoFocus && !this.mDidAttachToWindow) {
            requestFocusInternal();
        }
        this.mDidAttachToWindow = true;
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (!this.mContainsImages || getText() == null) {
            return;
        }
        Editable text = getText();
        for (o oVar : (o[]) text.getSpans(0, text.length(), o.class)) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.a(i);
    }

    public void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.a(i, f);
    }

    public void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.a(f);
    }

    public void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.a(f, i);
    }

    public void setBorderStyle(@Nullable String str) {
        this.mReactBackgroundManager.a(str);
    }

    public void setLetterSpacingPt(float f) {
        this.mTextAttributes.d = f;
        applyTextAttributes();
    }

    public void setAllowFontScaling(boolean z) {
        if (this.mTextAttributes.a != z) {
            this.mTextAttributes.a = z;
            applyTextAttributes();
        }
    }

    public void setFontSize(float f) {
        this.mTextAttributes.b = f;
        applyTextAttributes();
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.mTextAttributes.e) {
            this.mTextAttributes.b(f);
            applyTextAttributes();
        }
    }

    public void setAutoFocus(boolean z) {
        this.mAutoFocus = z;
    }

    protected void applyTextAttributes() {
        setTextSize(0, this.mTextAttributes.a());
        if (Build.VERSION.SDK_INT >= 21) {
            float c = this.mTextAttributes.c();
            if (Float.isNaN(c)) {
                return;
            }
            setLetterSpacing(c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements TextWatcher {
        private b() {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (ReactEditText.this.mIsSettingTextFromJS || ReactEditText.this.mListeners == null) {
                return;
            }
            Iterator it = ReactEditText.this.mListeners.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!ReactEditText.this.mIsSettingTextFromJS && ReactEditText.this.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            ReactEditText.this.onContentSizeChange();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (ReactEditText.this.mIsSettingTextFromJS || ReactEditText.this.mListeners == null) {
                return;
            }
            Iterator it = ReactEditText.this.mListeners.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements KeyListener {
        int a = 0;

        @Override // android.text.method.KeyListener
        public final int getInputType() {
            return this.a;
        }

        @Override // android.text.method.KeyListener
        public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyUp(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public final void clearMetaKeyState(View view, Editable editable, int i) {
            ReactEditText.sKeyListener.clearMetaKeyState(view, editable, i);
        }
    }
}
