package com.dianping.picasso.model.params;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoTextUtils;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.TextModel;
import com.dianping.richtext.e;
import com.dianping.richtext.f;
import com.dianping.richtext.i;
import com.dianping.richtext.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TextViewParams extends PicassoModelParams<TextModel> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String endColor;
    public Integer firstLineHeadIndent;
    public String fontName;
    public int fontStyle;
    public boolean isJsonText;
    public int labelColor;
    public PicassoTextViewLineBreakMode lineBreakMode;
    public float lineSpacing;
    public GradientDrawable.Orientation orientation;
    public int padding;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;
    public String startColor;
    public int textAlignment;
    public int textShadowColor;
    public float textShadowOffsetX;
    public float textShadowOffsetY;
    public float textShadowRadius;
    public float textSize;
    public SpannableStringBuilder textStringBuilder;
    public Typeface textTypeface;
    public WeakReference<i> textUpdateListenerRef;
    public int verticalAlignment;
    public static HashMap<Integer, Integer> textAlignmentMap = new HashMap<>();
    public static HashMap<Integer, Integer> verticalTextAlignmentMap = new HashMap<>();
    public static HashMap<Integer, PicassoTextViewLineBreakMode> textLineBreakModeMap = new HashMap<>();
    public static HashMap<Integer, Integer> typefaceIntMap = new HashMap<>();

    public TextViewParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835bc7b4578117c1292369f41fd2444b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835bc7b4578117c1292369f41fd2444b");
        } else {
            this.textUpdateListenerRef = new WeakReference<>(null);
        }
    }

    static {
        textAlignmentMap.put(0, 3);
        textAlignmentMap.put(1, 1);
        textAlignmentMap.put(2, 5);
        verticalTextAlignmentMap.put(0, 16);
        verticalTextAlignmentMap.put(1, 48);
        verticalTextAlignmentMap.put(2, 80);
        textLineBreakModeMap.put(0, new PicassoTextViewLineBreakMode(1));
        textLineBreakModeMap.put(1, new PicassoTextViewLineBreakMode(1));
        textLineBreakModeMap.put(2, new PicassoTextViewLineBreakMode((TextUtils.TruncateAt) null));
        textLineBreakModeMap.put(3, new PicassoTextViewLineBreakMode(TextUtils.TruncateAt.START));
        textLineBreakModeMap.put(4, new PicassoTextViewLineBreakMode(TextUtils.TruncateAt.END));
        textLineBreakModeMap.put(5, new PicassoTextViewLineBreakMode(TextUtils.TruncateAt.MIDDLE));
        typefaceIntMap.put(0, 0);
        typefaceIntMap.put(1, 1);
        typefaceIntMap.put(2, 2);
        typefaceIntMap.put(3, 3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class PicassoTextViewLineBreakMode {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int breakStrategy;
        public final TextUtils.TruncateAt truncateAt;

        public PicassoTextViewLineBreakMode(TextUtils.TruncateAt truncateAt) {
            this.truncateAt = truncateAt;
            this.breakStrategy = -1;
        }

        public PicassoTextViewLineBreakMode(int i) {
            this.breakStrategy = i;
            this.truncateAt = null;
        }
    }

    @Override // com.dianping.picasso.model.params.PicassoModelParams
    public void switchModel(TextModel textModel) {
        Object[] objArr = {textModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66bd71c3d3f185d96cf3601e41577e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66bd71c3d3f185d96cf3601e41577e1f");
            return;
        }
        super.switchModel((TextViewParams) textModel);
        this.labelColor = PicassoUtils.isValidColor(textModel.textColor) ? Color.parseColor(textModel.textColor) : -16777216;
        this.textAlignment = textAlignmentMap.containsKey(Integer.valueOf(textModel.textAlignment)) ? textAlignmentMap.get(Integer.valueOf(textModel.textAlignment)).intValue() : 3;
        this.verticalAlignment = verticalTextAlignmentMap.containsKey(Integer.valueOf(textModel.contentVerticalAlignment)) ? verticalTextAlignmentMap.get(Integer.valueOf(textModel.contentVerticalAlignment)).intValue() : 16;
        this.lineBreakMode = textLineBreakModeMap.containsKey(Integer.valueOf(textModel.lineBreakMode)) ? textLineBreakModeMap.get(Integer.valueOf(textModel.lineBreakMode)) : new PicassoTextViewLineBreakMode(TextUtils.TruncateAt.END);
        this.lineSpacing = dp2px(textModel.linespacing, this.scaleInput);
        this.padding = dp2px(textModel.padding, this.scaleInput);
        this.paddingTop = dp2px(textModel.paddingTop, this.scaleInput);
        this.paddingRight = dp2px(textModel.paddingRight, this.scaleInput);
        this.paddingBottom = dp2px(textModel.paddingBottom, this.scaleInput);
        this.paddingLeft = dp2px(textModel.paddingLeft, this.scaleInput);
        this.firstLineHeadIndent = textModel.firstLineHeadIndent != null ? Integer.valueOf(dp2px(textModel.firstLineHeadIndent.floatValue(), this.scaleInput)) : null;
        this.textShadowColor = Color.parseColor(PicassoUtils.isValidColor(textModel.textShadowColor) ? textModel.textShadowColor : "#55000000");
        this.textShadowOffsetX = dp2px(textModel.textShadowOffsetX, this.scaleInput);
        this.textShadowOffsetY = dp2px(textModel.textShadowOffsetY, this.scaleInput);
        this.textShadowRadius = dp2px(textModel.textShadowRadius, this.scaleInput);
        if (this.textShadowRadius == 0.0f && (this.textShadowOffsetX != 0.0f || this.textShadowOffsetY != 0.0f)) {
            this.textShadowRadius = 1.0f;
        }
        if ((TextUtils.isEmpty(textModel.backgroundColor) || (PicassoUtils.isValidColor(textModel.backgroundColor) && Color.alpha(Color.parseColor(textModel.backgroundColor)) == 0)) && this.sdOpacity > 0.0f && this.textShadowRadius == 0.0f) {
            this.textShadowRadius = this.sdRadius;
            this.textShadowOffsetX = this.sdOffsetX;
            this.textShadowOffsetY = this.sdOffsetY;
            this.sdOpacity = 0.0f;
        }
        this.textSize = textModel.textSize;
        this.fontStyle = textModel.fontStyle;
        this.fontName = textModel.fontName;
        this.startColor = textModel.textStartColor;
        this.endColor = textModel.textEndColor;
        this.orientation = textModel.textOrientation > 0 ? GradientDrawable.Orientation.values()[textModel.textOrientation] : GradientDrawable.Orientation.LEFT_RIGHT;
        Typeface typeface = PicassoTextUtils.typefaceModeMap.get(0);
        if (this.fontName.length() > 0) {
            try {
                typeface = Typeface.createFromAsset(PicassoEnvironment.globalContext.getAssets(), this.fontName);
            } catch (Exception unused) {
                Log.e("fontLoadError", "fontNotExist");
            }
        }
        if (this.fontStyle > 0 && this.fontStyle <= 3) {
            typeface = PicassoTextUtils.typefaceModeMap.get(Integer.valueOf(this.fontStyle));
        }
        if (typeface == null) {
            typeface = PicassoTextUtils.defaultTypeFace;
        }
        this.textTypeface = typeface;
        j jVar = new j();
        jVar.a = this.backgroundDrawable;
        jVar.b = textModel.text;
        jVar.c = textModel.fontName;
        jVar.d = this.textSize;
        jVar.e = this.fontStyle;
        jVar.f = this.width;
        jVar.g = textModel.numberOfLines;
        jVar.h = this.textTypeface;
        jVar.i = this.lineSpacing;
        jVar.j = this.lineBreakMode.truncateAt;
        jVar.m = textModel.disableBold;
        jVar.p = this.textUpdateListenerRef.get();
        jVar.q = this.firstLineHeadIndent;
        e transformRichTextModel = transformRichTextModel(jVar, textModel);
        this.lineSpacing = transformRichTextModel.a == null ? this.lineSpacing : transformRichTextModel.a.floatValue();
        this.padding = transformRichTextModel.b == null ? this.padding : transformRichTextModel.b.intValue();
        this.paddingTop = transformRichTextModel.c == null ? this.paddingTop : transformRichTextModel.c.intValue();
        this.paddingRight = transformRichTextModel.d == null ? this.paddingRight : transformRichTextModel.d.intValue();
        this.paddingBottom = transformRichTextModel.e == null ? this.paddingBottom : transformRichTextModel.e.intValue();
        this.paddingLeft = transformRichTextModel.f == null ? this.paddingLeft : transformRichTextModel.f.intValue();
        this.textSize = transformRichTextModel.g == null ? this.textSize : transformRichTextModel.g.floatValue();
        this.fontStyle = transformRichTextModel.h == null ? this.fontStyle : transformRichTextModel.h.intValue();
        this.textAlignment = (transformRichTextModel.i == null ? this.textAlignment : transformRichTextModel.i.intValue()) | this.verticalAlignment;
        this.backgroundDrawable = transformRichTextModel.k == null ? this.backgroundDrawable : transformRichTextModel.k;
        this.textStringBuilder = transformRichTextModel.l;
        this.isJsonText = transformRichTextModel.m;
    }

    public e transformRichTextModel(j jVar, TextModel textModel) {
        Object[] objArr = {jVar, textModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c08980ab7c1caedbc445f9e47a1deea", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c08980ab7c1caedbc445f9e47a1deea") : f.a(PicassoEnvironment.globalContext, jVar);
    }
}
