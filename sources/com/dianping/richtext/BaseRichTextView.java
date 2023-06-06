package com.dianping.richtext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.CallSuper;
import android.support.constraint.R;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BaseRichTextView extends AppCompatTextView implements View.OnTouchListener, com.dianping.richtext.b, i {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float mJsonSpacing;
    private boolean mNeedChangeStyle;
    private float mRichSpacingExtra;
    private b onTextClickListener;
    public SpannableStringBuilder resultString;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, int i);
    }

    @Override // com.dianping.richtext.b
    public void onClick(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d3fc3f9a5201a322c50f5640b83beec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d3fc3f9a5201a322c50f5640b83beec");
        }
    }

    public BaseRichTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b89699cabe49f6c6ca55dba6c60ccf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b89699cabe49f6c6ca55dba6c60ccf9");
            return;
        }
        this.resultString = null;
        this.mNeedChangeStyle = true;
        initRichTextView(context, null);
    }

    public BaseRichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b294c442a34d3a7227348174a3b9ce26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b294c442a34d3a7227348174a3b9ce26");
            return;
        }
        this.resultString = null;
        this.mNeedChangeStyle = true;
        initRichTextView(context, attributeSet);
    }

    public BaseRichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78bfd4d216b0eaebe5667046dfa78109", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78bfd4d216b0eaebe5667046dfa78109");
            return;
        }
        this.resultString = null;
        this.mNeedChangeStyle = true;
        initRichTextView(context, attributeSet);
    }

    private void initRichTextView(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa4be5ff460bfcb8acb2dc80ed9abf0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa4be5ff460bfcb8acb2dc80ed9abf0d");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.needChangeStyle});
        this.mNeedChangeStyle = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        setOnTouchListener(this);
        setTypeface(getTypeface());
        setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier());
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "560b975818a365f9ed37c803a6384eb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "560b975818a365f9ed37c803a6384eb4");
            return;
        }
        if (typeface != null) {
            Typeface.create(typeface, g.a(typeface.getStyle(), this.mNeedChangeStyle));
        }
        super.setTypeface(typeface);
    }

    public void setNeedChangeStyle(boolean z) {
        this.mNeedChangeStyle = z;
    }

    public void setRichText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b57334c349f3e5e523661f6bda44f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b57334c349f3e5e523661f6bda44f3d");
        } else {
            setJsonText(str, null);
        }
    }

    public void setRichText(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bedbe23704d8554e4fea3e01e2272a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bedbe23704d8554e4fea3e01e2272a84");
        } else {
            setJsonText(str, cVar);
        }
    }

    public void setSpannableString(SpannableStringBuilder spannableStringBuilder) {
        Object[] objArr = {spannableStringBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d268cd85cef56ce1cdecd333f75b344d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d268cd85cef56ce1cdecd333f75b344d");
            return;
        }
        this.resultString = spannableStringBuilder;
        setText(spannableStringBuilder);
        if (com.dianping.richtext.c.a().d && Build.VERSION.SDK_INT == 23) {
            boolean includeFontPadding = getIncludeFontPadding();
            setIncludeFontPadding(!includeFontPadding);
            setIncludeFontPadding(includeFontPadding);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce73e55fcad21688733c12ee0410645c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce73e55fcad21688733c12ee0410645c");
            return;
        }
        this.mRichSpacingExtra = f;
        setRichLineSpacing(this.mRichSpacingExtra, f2);
    }

    public void setOriginalLineSpacing(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14168a627f0be94b5bcfa49ceb5d10ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14168a627f0be94b5bcfa49ceb5d10ea");
            return;
        }
        this.mRichSpacingExtra = f;
        setRichLineSpacing(this.mRichSpacingExtra, f2);
    }

    private void setRichLineSpacing(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82df11ffa06a1d6fe976ca39e8568391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82df11ffa06a1d6fe976ca39e8568391");
        } else if (Build.VERSION.SDK_INT < 23) {
            super.setLineSpacing(0.0f, f2);
            if (this.resultString != null) {
                this.resultString.setSpan(g.a(f, this.resultString.length(), TextViewCompat.getMaxLines(this)), 0, this.resultString.length(), 33);
            }
        } else {
            super.setLineSpacing(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setJsonText(java.lang.String r16, com.dianping.richtext.BaseRichTextView.c r17) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.richtext.BaseRichTextView.setJsonText(java.lang.String, com.dianping.richtext.BaseRichTextView$c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setBackgroungDrawable(org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.richtext.BaseRichTextView.setBackgroungDrawable(org.json.JSONObject):void");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.richtext.BaseRichTextView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[GradientDrawable.Orientation.values().length];

        static {
            try {
                a[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GradientDrawable.Orientation.TL_BR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public void setTextColor(String str, String str2, GradientDrawable.Orientation orientation, int i, int i2) {
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        LinearGradient linearGradient3;
        Object[] objArr = {str, str2, orientation, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b7cb2084e4260c0f569a74aa18d04f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b7cb2084e4260c0f569a74aa18d04f");
            return;
        }
        switch (AnonymousClass1.a[orientation.ordinal()]) {
            case 1:
                linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i2, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                linearGradient2 = linearGradient;
                break;
            case 2:
                linearGradient2 = new LinearGradient(i, 0.0f, 0.0f, i2, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                break;
            case 3:
                linearGradient3 = new LinearGradient(i, 0.0f, 0.0f, 0.0f, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                linearGradient2 = linearGradient3;
                break;
            case 4:
                linearGradient2 = new LinearGradient(i, i2, 0.0f, 0.0f, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                break;
            case 5:
                linearGradient = new LinearGradient(0.0f, i2, 0.0f, 0.0f, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                linearGradient2 = linearGradient;
                break;
            case 6:
                linearGradient2 = new LinearGradient(0.0f, i2, i, 0.0f, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                break;
            case 7:
                linearGradient2 = new LinearGradient(0.0f, 0.0f, i, i2, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                break;
            default:
                linearGradient3 = new LinearGradient(0.0f, 0.0f, i, 0.0f, new int[]{Color.parseColor(str), Color.parseColor(str2)}, (float[]) null, Shader.TileMode.CLAMP);
                linearGradient2 = linearGradient3;
                break;
        }
        getPaint().setShader(linearGradient2);
    }

    @Override // com.dianping.richtext.i
    public void update() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b54a2d22d222e8aa1319671ea82ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b54a2d22d222e8aa1319671ea82ffc");
            return;
        }
        try {
            setText(this.resultString);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View.OnTouchListener
    @CallSuper
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c37f35f1face35e6679055bdce14cbc1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c37f35f1face35e6679055bdce14cbc1")).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (view instanceof AppCompatTextView) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            if (this.resultString != null && appCompatTextView.getText() != null && (action == 1 || action == 0)) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                try {
                    int totalPaddingLeft = x - appCompatTextView.getTotalPaddingLeft();
                    int totalPaddingTop = y - appCompatTextView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + appCompatTextView.getScrollX();
                    int scrollY = totalPaddingTop + appCompatTextView.getScrollY();
                    Layout layout = appCompatTextView.getLayout();
                    if (layout != null) {
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.resultString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                            if (action == 1) {
                                clickableSpanArr[0].onClick(appCompatTextView);
                            } else if (action == 0) {
                                Selection.setSelection(this.resultString, this.resultString.getSpanStart(clickableSpanArr[0]), this.resultString.getSpanEnd(clickableSpanArr[0]));
                            }
                            return true;
                        }
                        Selection.removeSelection(this.resultString);
                    }
                } catch (Exception e) {
                    com.dianping.codelog.b.b(BaseRichTextView.class, "RichTextView touch exception:, textView text is" + ((Object) appCompatTextView.getText()) + " ,exception is " + e.toString());
                }
            }
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    public void setOnTextClickListener(b bVar) {
        this.onTextClickListener = bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        TOP_LEFT(1),
        TOP_RIGHT(2),
        BOTTOM_LEFT(4),
        BOTTOM_RIGHT(8);
        
        public static ChangeQuickRedirect a;
        private int f;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d38ed8caecfcac0bca35c39a9d69cf2", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d38ed8caecfcac0bca35c39a9d69cf2") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0866978fb5137450113960ff53c205ca", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0866978fb5137450113960ff53c205ca") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6268baaacc04ef0a370a2361a3bfa692", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6268baaacc04ef0a370a2361a3bfa692");
            } else {
                this.f = i;
            }
        }
    }
}
