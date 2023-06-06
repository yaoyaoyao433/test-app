package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.at;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.aa;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.w;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactTextView extends AppCompatTextView implements aa {
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mAdjustsFontSizeToFit;
    private boolean mContainsImages;
    private int mDefaultGravityHorizontal;
    private int mDefaultGravityVertical;
    private TextUtils.TruncateAt mEllipsizeLocation;
    private int mLinkifyMaskType;
    private boolean mNotifyOnInlineViewLayout;
    private int mNumberOfLines;
    private com.facebook.react.views.view.e mReactBackgroundManager;
    private Spannable mSpanned;
    private int mTextAlign;

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public ReactTextView(Context context) {
        super(context);
        this.mTextAlign = 0;
        this.mNumberOfLines = Integer.MAX_VALUE;
        this.mEllipsizeLocation = TextUtils.TruncateAt.END;
        this.mAdjustsFontSizeToFit = false;
        this.mLinkifyMaskType = 0;
        this.mReactBackgroundManager = new com.facebook.react.views.view.e(this);
        this.mDefaultGravityHorizontal = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        this.mDefaultGravityVertical = getGravity() & 112;
    }

    private static WritableMap inlineViewJson(int i, int i2, int i3, int i4, int i5, int i6) {
        WritableMap createMap = Arguments.createMap();
        if (i == 8) {
            createMap.putString(RemoteMessageConst.Notification.VISIBILITY, "gone");
            createMap.putInt("index", i2);
        } else if (i == 0) {
            createMap.putString(RemoteMessageConst.Notification.VISIBILITY, "visible");
            createMap.putInt("index", i2);
            createMap.putDouble("left", w.c(i3));
            createMap.putDouble("top", w.c(i4));
            createMap.putDouble("right", w.c(i5));
            createMap.putDouble("bottom", w.c(i6));
        } else {
            createMap.putString(RemoteMessageConst.Notification.VISIBILITY, "unknown");
            createMap.putInt("index", i2);
        }
        return createMap;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof at ? (ReactContext) ((at) context).getBaseContext() : (ReactContext) context;
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        p[] pVarArr;
        boolean z2;
        int i5;
        ReactContext reactContext;
        int i6;
        int secondaryHorizontal;
        int lineRight;
        int totalPaddingLeft;
        if (!(getText() instanceof Spanned) || com.facebook.react.uimanager.common.a.a(getId()) == 2) {
            return;
        }
        ReactContext reactContext2 = getReactContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactContext2.getNativeModule(UIManagerModule.class);
        Spanned spanned = (Spanned) getText();
        Layout layout = getLayout();
        p[] pVarArr2 = (p[]) spanned.getSpans(0, spanned.length(), p.class);
        ArrayList arrayList = this.mNotifyOnInlineViewLayout ? new ArrayList(pVarArr2.length) : null;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int length = pVarArr2.length;
        int i9 = 0;
        while (i9 < length) {
            p pVar = pVarArr2[i9];
            View resolveView = uIManagerModule.resolveView(pVar.a);
            int spanStart = spanned.getSpanStart(pVar);
            UIManagerModule uIManagerModule2 = uIManagerModule;
            int lineForOffset = layout.getLineForOffset(spanStart);
            boolean z3 = true;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                pVarArr = pVarArr2;
                z2 = true;
            } else {
                pVarArr = pVarArr2;
                z2 = false;
            }
            if ((z2 && spanStart >= layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) || lineForOffset >= this.mNumberOfLines || spanStart >= layout.getLineEnd(lineForOffset)) {
                reactContext = reactContext2;
                i5 = length;
                i6 = i9;
                resolveView.setVisibility(8);
                if (this.mNotifyOnInlineViewLayout) {
                    arrayList.add(inlineViewJson(8, spanStart, -1, -1, -1, -1));
                }
            } else {
                int i10 = pVar.b;
                int i11 = pVar.c;
                i5 = length;
                boolean isRtlCharAt = layout.isRtlCharAt(spanStart);
                reactContext = reactContext2;
                i6 = i9;
                boolean z4 = layout.getParagraphDirection(lineForOffset) == -1;
                if (spanStart != spanned.length() - 1) {
                    if (z4 == isRtlCharAt) {
                        secondaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
                    } else {
                        secondaryHorizontal = (int) layout.getSecondaryHorizontal(spanStart);
                    }
                    lineRight = z4 ? i7 - (((int) layout.getLineRight(lineForOffset)) - secondaryHorizontal) : secondaryHorizontal;
                    if (isRtlCharAt) {
                        lineRight -= i10;
                    }
                } else if (z4) {
                    lineRight = i7 - ((int) layout.getLineWidth(lineForOffset));
                } else {
                    lineRight = ((int) layout.getLineRight(lineForOffset)) - i10;
                }
                if (isRtlCharAt) {
                    totalPaddingLeft = lineRight + getTotalPaddingRight();
                } else {
                    totalPaddingLeft = lineRight + getTotalPaddingLeft();
                }
                int i12 = i + totalPaddingLeft;
                int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - i11;
                int i13 = i2 + totalPaddingTop;
                if (i7 > totalPaddingLeft && i8 > totalPaddingTop) {
                    z3 = false;
                }
                int i14 = z3 ? 8 : 0;
                int i15 = i10 + i12;
                int i16 = i13 + i11;
                resolveView.setVisibility(i14);
                resolveView.layout(i12, i13, i15, i16);
                if (this.mNotifyOnInlineViewLayout) {
                    arrayList.add(inlineViewJson(i14, spanStart, i12, i13, i15, i16));
                }
            }
            i9 = i6 + 1;
            uIManagerModule = uIManagerModule2;
            pVarArr2 = pVarArr;
            length = i5;
            reactContext2 = reactContext;
        }
        ReactContext reactContext3 = reactContext2;
        if (this.mNotifyOnInlineViewLayout) {
            Collections.sort(arrayList, new Comparator() { // from class: com.facebook.react.views.text.ReactTextView.1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
                }
            });
            WritableArray createArray = Arguments.createArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                createArray.pushMap((WritableMap) it.next());
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putArray("inlineViews", createArray);
            ((RCTEventEmitter) reactContext3.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topInlineViewLayout", createMap);
        }
    }

    @Override // com.facebook.react.uimanager.aa
    public int reactTagForTouch(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                h[] hVarArr = (h[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, h.class);
                if (hVarArr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < hVarArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(hVarArr[i4]);
                        int spanEnd = spanned.getSpanEnd(hVarArr[i4]);
                        if (spanEnd > offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = hVarArr[i4].a;
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                com.facebook.common.logging.a.d("ReactNative", "Crash in HorizontalMeasurementProvider: " + e.getMessage());
                return id;
            }
        }
        return id;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                if (oVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
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
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                oVar.b();
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                oVar.c();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                oVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (o oVar : (o[]) spanned.getSpans(0, spanned.length(), o.class)) {
                oVar.e();
            }
        }
    }

    void setGravityHorizontal(int i) {
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

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i;
        setSingleLine(this.mNumberOfLines == 1);
        setMaxLines(this.mNumberOfLines);
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.mAdjustsFontSizeToFit = z;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.mNotifyOnInlineViewLayout = z;
    }

    public void updateView() {
        setEllipsize((this.mNumberOfLines == Integer.MAX_VALUE || this.mAdjustsFontSizeToFit) ? null : this.mEllipsizeLocation);
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

    public void setSpanned(Spannable spannable) {
        this.mSpanned = spannable;
    }

    public Spannable getSpanned() {
        return this.mSpanned;
    }

    public void setLinkifyMask(int i) {
        this.mLinkifyMaskType = i;
    }

    public void setText(i iVar) {
        int i;
        this.mContainsImages = iVar.c;
        if (getLayoutParams() == null) {
            setLayoutParams(EMPTY_LAYOUT_PARAMS);
        }
        Spannable spannable = iVar.a;
        if (this.mLinkifyMaskType > 0) {
            Linkify.addLinks(spannable, this.mLinkifyMaskType);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(spannable);
        float f = iVar.d;
        float f2 = iVar.e;
        float f3 = iVar.f;
        float f4 = iVar.g;
        if (f != -1.0f && f4 != -1.0f && f3 != -1.0f && i != 0) {
            setPadding((int) Math.floor(f), (int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4));
        }
        int i2 = iVar.h;
        if (this.mTextAlign != i2) {
            this.mTextAlign = i2;
        }
        setGravityHorizontal(this.mTextAlign);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != iVar.i) {
            setBreakStrategy(iVar.i);
        }
        if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != iVar.l) {
            setJustificationMode(iVar.l);
        }
        requestLayout();
    }
}
