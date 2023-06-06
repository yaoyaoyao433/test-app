package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.t;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
/* compiled from: ProGuard */
@TargetApi(23)
/* loaded from: classes.dex */
public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    private static final TextPaint sTextPaintInstance = new TextPaint(1);
    @Nullable
    private Spannable mPreparedSpannableText;
    private boolean mShouldNotifyOnTextLayout;
    private final YogaMeasureFunction mTextMeasureFunction;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public boolean isVirtualAnchor() {
        return false;
    }

    public ReactTextShadowNode() {
        this(null);
    }

    public ReactTextShadowNode(@Nullable j jVar) {
        super(jVar);
        this.mTextMeasureFunction = new YogaMeasureFunction() { // from class: com.facebook.react.views.text.ReactTextShadowNode.1
            @Override // com.facebook.yoga.YogaMeasureFunction
            public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                Layout build;
                TextPaint textPaint = ReactTextShadowNode.sTextPaintInstance;
                textPaint.setTextSize(ReactTextShadowNode.this.mTextAttributes.a());
                Spanned spanned = (Spanned) com.facebook.infer.annotation.a.a(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
                BoringLayout.Metrics isBoring = BoringLayout.isBoring(spanned, textPaint);
                float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spanned, textPaint) : Float.NaN;
                int i = 0;
                boolean z = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f < 0.0f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                int textAlign = ReactTextShadowNode.this.getTextAlign();
                if (textAlign == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (textAlign == 3) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else if (textAlign == 5) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                Layout.Alignment alignment2 = alignment;
                if (isBoring == null && (z || (!com.facebook.yoga.b.a(desiredWidth) && desiredWidth <= f))) {
                    int ceil = (int) Math.ceil(desiredWidth);
                    if (Build.VERSION.SDK_INT < 23) {
                        build = new StaticLayout(spanned, textPaint, ceil, alignment2, 1.0f, 0.0f, ReactTextShadowNode.this.mIncludeFontPadding);
                    } else {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, ceil).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(ReactTextShadowNode.this.mHyphenationFrequency);
                        if (Build.VERSION.SDK_INT >= 26) {
                            hyphenationFrequency.setJustificationMode(ReactTextShadowNode.this.mJustificationMode);
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
                            } catch (Throwable th) {
                                com.facebook.common.logging.a.c("[ReactTextShadowNode@measure]", null, th);
                            }
                        }
                        build = hyphenationFrequency.build();
                    }
                } else if (isBoring != null && (z || isBoring.width <= f)) {
                    build = BoringLayout.make(spanned, textPaint, isBoring.width, alignment2, 1.0f, 0.0f, isBoring, ReactTextShadowNode.this.mIncludeFontPadding);
                } else {
                    if (Build.VERSION.SDK_INT < 23) {
                        build = new StaticLayout(spanned, textPaint, (int) f, alignment2, 1.0f, 0.0f, ReactTextShadowNode.this.mIncludeFontPadding);
                    } else {
                        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(ReactTextShadowNode.this.mIncludeFontPadding).setBreakStrategy(ReactTextShadowNode.this.mTextBreakStrategy).setHyphenationFrequency(1);
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
                            } catch (Throwable th2) {
                                com.facebook.common.logging.a.d("[ReactTextShadowNode@measure]", null, th2);
                            }
                        }
                        build = hyphenationFrequency2.build();
                    }
                    Layout multiLinesLayout = ReactTextShadowNode.this.getMultiLinesLayout(build.getWidth());
                    if (multiLinesLayout != null && build.getHeight() < multiLinesLayout.getHeight()) {
                        build = multiLinesLayout;
                    }
                    i = build.getHeight();
                }
                int width = build.getWidth();
                if (i == 0) {
                    i = build.getHeight();
                    int realWidth = ReactTextShadowNode.this.getRealWidth();
                    if (realWidth > width) {
                        width = realWidth;
                    }
                }
                if (ReactTextShadowNode.this.mShouldNotifyOnTextLayout) {
                    WritableArray a = e.a(spanned, build, ReactTextShadowNode.sTextPaintInstance, ReactTextShadowNode.this.getThemedContext());
                    WritableMap createMap = Arguments.createMap();
                    createMap.putArray("lines", a);
                    ((RCTEventEmitter) ReactTextShadowNode.this.getThemedContext().getJSModule(RCTEventEmitter.class)).receiveEvent(ReactTextShadowNode.this.getReactTag(), "topTextLayout", createMap);
                }
                if (ReactTextShadowNode.this.mNumberOfLines != -1 && ReactTextShadowNode.this.mNumberOfLines < build.getLineCount()) {
                    return com.facebook.yoga.c.a(width, build.getLineBottom(ReactTextShadowNode.this.mNumberOfLines - 1));
                }
                return com.facebook.yoga.c.a(width, i);
            }
        };
        initMeasureFunction();
    }

    private void initMeasureFunction() {
        if (isVirtual()) {
            return;
        }
        setMeasureFunction(this.mTextMeasureFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() == YogaDirection.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i == 3) {
                return 5;
            }
            return i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRealWidth() {
        TextView textView = new TextView(getThemedContext().getApplicationContext());
        if (this.mPreparedSpannableText == null) {
            return -1;
        }
        textView.setText(this.mPreparedSpannableText);
        textView.measure(0, 0);
        if (textView.getLayout() != null) {
            return textView.getLayout().getWidth();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Layout getMultiLinesLayout(int i) {
        TextView textView = new TextView(getThemedContext().getApplicationContext());
        if (this.mPreparedSpannableText == null) {
            return null;
        }
        textView.setWidth(i);
        textView.setText(this.mPreparedSpannableText);
        textView.measure(0, 0);
        return textView.getLayout();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onBeforeLayout(t tVar) {
        this.mPreparedSpannableText = spannedFromShadowNode(this, null, true, tVar);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mPreparedSpannableText != null) {
            uIViewOperationQueue.a(getReactTag(), new i(this.mPreparedSpannableText, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.mShouldNotifyOnTextLayout = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public Iterable<? extends af> calculateLayoutOnChildren() {
        if (this.mInlineViews == null || this.mInlineViews.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) com.facebook.infer.annotation.a.a(this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
        p[] pVarArr = (p[]) spanned.getSpans(0, spanned.length(), p.class);
        ArrayList arrayList = new ArrayList(pVarArr.length);
        for (p pVar : pVarArr) {
            af afVar = this.mInlineViews.get(Integer.valueOf(pVar.a));
            afVar.calculateLayout();
            arrayList.add(afVar);
        }
        return arrayList;
    }
}
