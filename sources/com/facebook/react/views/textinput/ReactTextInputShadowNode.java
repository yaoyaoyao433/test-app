package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
/* compiled from: ProGuard */
@TargetApi(23)
@VisibleForTesting
/* loaded from: classes.dex */
public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {
    @VisibleForTesting
    public static final String PROP_PLACEHOLDER = "placeholder";
    @VisibleForTesting
    public static final String PROP_SELECTION = "selection";
    @VisibleForTesting
    public static final String PROP_TEXT = "text";
    @Nullable
    private EditText mInternalEditText;
    @Nullable
    private j mLocalData;
    private int mMostRecentEventCount;
    @Nullable
    private String mPlaceholder;
    private int mSelectionEnd;
    private int mSelectionStart;
    @Nullable
    private String mText;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean isYogaLeafNode() {
        return true;
    }

    public ReactTextInputShadowNode(@Nullable com.facebook.react.views.text.j jVar) {
        super(jVar);
        this.mMostRecentEventCount = -1;
        this.mText = null;
        this.mPlaceholder = null;
        this.mSelectionStart = -1;
        this.mSelectionEnd = -1;
        this.mTextBreakStrategy = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        initMeasureFunction();
    }

    public ReactTextInputShadowNode() {
        this(null);
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void setThemedContext(ao aoVar) {
        super.setThemedContext(aoVar);
        EditText createInternalEditText = createInternalEditText();
        setDefaultPadding(4, ViewCompat.getPaddingStart(createInternalEditText));
        setDefaultPadding(1, createInternalEditText.getPaddingTop());
        setDefaultPadding(5, ViewCompat.getPaddingEnd(createInternalEditText));
        setDefaultPadding(3, createInternalEditText.getPaddingBottom());
        this.mInternalEditText = createInternalEditText;
        this.mInternalEditText.setPadding(0, 0, 0, 0);
        this.mInternalEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) com.facebook.infer.annotation.a.a(this.mInternalEditText);
        if (this.mLocalData != null) {
            j jVar = this.mLocalData;
            editText.setText(jVar.a);
            editText.setTextSize(0, jVar.b);
            editText.setMinLines(jVar.c);
            editText.setMaxLines(jVar.d);
            editText.setInputType(jVar.e);
            editText.setHint(jVar.g);
            if (Build.VERSION.SDK_INT >= 23) {
                editText.setBreakStrategy(jVar.f);
            }
        } else {
            editText.setTextSize(0, this.mTextAttributes.a());
            if (this.mNumberOfLines != -1) {
                editText.setLines(this.mNumberOfLines);
            }
            if (Build.VERSION.SDK_INT >= 23 && editText.getBreakStrategy() != this.mTextBreakStrategy) {
                editText.setBreakStrategy(this.mTextBreakStrategy);
            }
        }
        editText.setHint(getPlaceholder());
        editText.measure(com.facebook.react.views.view.b.a(f, yogaMeasureMode), com.facebook.react.views.view.b.a(f2, yogaMeasureMode2));
        return com.facebook.yoga.c.a(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void setLocalData(Object obj) {
        com.facebook.infer.annotation.a.a(obj instanceof j);
        this.mLocalData = (j) obj;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mMostRecentEventCount = i;
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        this.mText = str;
        if (str != null) {
            if (this.mSelectionStart > str.length()) {
                this.mSelectionStart = str.length();
            }
            if (this.mSelectionEnd > str.length()) {
                this.mSelectionEnd = str.length();
            }
        } else {
            this.mSelectionStart = -1;
            this.mSelectionEnd = -1;
        }
        markUpdated();
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    @ReactProp(name = PROP_PLACEHOLDER)
    public void setPlaceholder(@Nullable String str) {
        this.mPlaceholder = str;
        markUpdated();
    }

    @Nullable
    public String getPlaceholder() {
        return this.mPlaceholder;
    }

    @ReactProp(name = PROP_SELECTION)
    public void setSelection(@Nullable ReadableMap readableMap) {
        this.mSelectionEnd = -1;
        this.mSelectionStart = -1;
        if (readableMap != null && readableMap.hasKey("start") && readableMap.hasKey("end")) {
            this.mSelectionStart = readableMap.getInt("start");
            this.mSelectionEnd = readableMap.getInt("end");
            markUpdated();
        }
    }

    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    public void setTextBreakStrategy(@Nullable String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "simple".equals(str)) {
            this.mTextBreakStrategy = 0;
        } else if ("highQuality".equals(str)) {
            this.mTextBreakStrategy = 1;
        } else if ("balanced".equals(str)) {
            this.mTextBreakStrategy = 2;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            uIViewOperationQueue.a(getReactTag(), new com.facebook.react.views.text.i(spannedFromShadowNode(this, getText(), false, null), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy, this.mJustificationMode, this.mSelectionStart, this.mSelectionEnd));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    protected EditText createInternalEditText() {
        return new EditText(getThemedContext());
    }
}
