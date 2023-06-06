package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.TextProperties;
import java.text.Bidi;
import java.util.ArrayList;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class TSpanView extends TextView {
    private static final String FONTS = "fonts/";
    private static final String OTF = ".otf";
    private static final String TTF = ".ttf";
    static final String additionalLigatures = "'hlig', 'cala', ";
    static final String defaultFeatures = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', ";
    static final String disableDiscretionaryLigatures = "'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
    static final String fontWeightTag = "'wght' ";
    private static final double radToDeg = 57.29577951308232d;
    static final String requiredFontFeatures = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk',";
    private static final double tau = 6.283185307179586d;
    private final AssetManager assets;
    private final ArrayList<String> emoji;
    private final ArrayList<Matrix> emojiTransforms;
    private Path mCachedPath;
    @Nullable
    String mContent;
    private TextPathView textPath;

    public TSpanView(ReactContext reactContext) {
        super(reactContext);
        this.emoji = new ArrayList<>();
        this.emojiTransforms = new ArrayList<>();
        this.assets = this.mContext.getResources().getAssets();
    }

    @ReactProp(name = "content")
    public void setContent(@Nullable String str) {
        this.mContent = str;
        invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.mCachedPath = null;
        super.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView
    public void clearCache() {
        this.mCachedPath = null;
        super.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (this.mContent != null) {
            if (this.mInlineSize != null && this.mInlineSize.value != 0.0d) {
                if (setupFillPaint(paint, this.fillOpacity * f)) {
                    drawWrappedText(canvas, paint);
                }
                if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                    drawWrappedText(canvas, paint);
                    return;
                }
                return;
            }
            int size = this.emoji.size();
            if (size > 0) {
                applyTextPropertiesToPaint(paint, getTextRootGlyphContext().getFont());
                for (int i = 0; i < size; i++) {
                    canvas.save();
                    canvas.concat(this.emojiTransforms.get(i));
                    canvas.drawText(this.emoji.get(i), 0.0f, 0.0f, paint);
                    canvas.restore();
                }
            }
            drawPath(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        drawGroup(canvas, paint, f);
    }

    private void drawWrappedText(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        GlyphContext textRootGlyphContext = getTextRootGlyphContext();
        pushGlyphContext();
        FontData font = textRootGlyphContext.getFont();
        TextPaint textPaint = new TextPaint(paint);
        applyTextPropertiesToPaint(textPaint, font);
        applySpacingAndFeatures(textPaint, font);
        double fontSize = textRootGlyphContext.getFontSize();
        switch (font.textAnchor) {
            case middle:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            case end:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        StaticLayout staticLayout = getStaticLayout(textPaint, alignment, true, new SpannableString(this.mContent), (int) PropHelper.fromRelative(this.mInlineSize, canvas.getWidth(), 0.0d, this.mScale, fontSize));
        int lineAscent = staticLayout.getLineAscent(0);
        popGlyphContext();
        canvas.save();
        canvas.translate((float) textRootGlyphContext.nextX(0.0d), (float) (textRootGlyphContext.nextY() + lineAscent));
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private StaticLayout getStaticLayout(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(spannableString, textPaint, i, alignment, 1.0f, 0.0f, z);
        }
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    public static String visualToLogical(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        if (this.mCachedPath != null) {
            return this.mCachedPath;
        }
        if (this.mContent == null) {
            this.mCachedPath = getGroupPath(canvas, paint);
            return this.mCachedPath;
        }
        setupTextPath();
        pushGlyphContext();
        this.mCachedPath = getLinePath(visualToLogical(this.mContent), paint, canvas);
        popGlyphContext();
        return this.mCachedPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.TextView
    public double getSubtreeTextChunksTotalAdvance(Paint paint) {
        if (!Double.isNaN(this.cachedAdvance)) {
            return this.cachedAdvance;
        }
        double d = 0.0d;
        if (this.mContent == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof TextView) {
                    d += ((TextView) childAt).getSubtreeTextChunksTotalAdvance(paint);
                }
            }
            this.cachedAdvance = d;
            return d;
        }
        String str = this.mContent;
        if (str.length() == 0) {
            this.cachedAdvance = 0.0d;
            return 0.0d;
        }
        FontData font = getTextRootGlyphContext().getFont();
        applyTextPropertiesToPaint(paint, font);
        applySpacingAndFeatures(paint, font);
        this.cachedAdvance = paint.measureText(str);
        return this.cachedAdvance;
    }

    private void applySpacingAndFeatures(Paint paint, FontData fontData) {
        if (Build.VERSION.SDK_INT >= 21) {
            double d = fontData.letterSpacing;
            paint.setLetterSpacing((float) (d / (fontData.fontSize * this.mScale)));
            if (d == 0.0d && fontData.fontVariantLigatures == TextProperties.FontVariantLigatures.normal) {
                paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + fontData.fontFeatureSettings);
            } else {
                paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + fontData.fontFeatureSettings);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                paint.setFontVariationSettings(fontWeightTag + fontData.absoluteFontWeight + fontData.fontVariationSettings);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Path getLinePath(java.lang.String r84, android.graphics.Paint r85, android.graphics.Canvas r86) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TSpanView.getLinePath(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.horcrux.svg.TSpanView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust;

        static {
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust = new int[TextProperties.TextLengthAdjust.values().length];
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[TextProperties.TextLengthAdjust.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[TextProperties.TextLengthAdjust.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = new int[TextProperties.TextAnchor.values().length];
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private double getAbsoluteStartOffset(SVGLength sVGLength, double d, double d2) {
        return PropHelper.fromRelative(sVGLength, d, 0.0d, this.mScale, d2);
    }

    private double getTextAnchorOffset(TextProperties.TextAnchor textAnchor, double d) {
        switch (textAnchor) {
            case middle:
                return (-d) / 2.0d;
            case end:
                return -d;
            default:
                return 0.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applyTextPropertiesToPaint(android.graphics.Paint r11, com.horcrux.svg.FontData r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TSpanView.applyTextPropertiesToPaint(android.graphics.Paint, com.horcrux.svg.FontData):void");
    }

    private void setupTextPath() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == TextPathView.class) {
                this.textPath = (TextPathView) parent;
                return;
            } else if (!(parent instanceof TextView)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (this.mContent == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            if ((this.mRegion == null || !this.mRegion.contains(round, round2)) && (this.mStrokeRegion == null || !this.mStrokeRegion.contains(round, round2))) {
                return -1;
            }
            if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }
}
