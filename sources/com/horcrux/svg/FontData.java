package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.TextProperties;
import com.meituan.android.recce.props.gens.FontWeight;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FontData {
    static final double DEFAULT_FONT_SIZE = 12.0d;
    private static final double DEFAULT_KERNING = 0.0d;
    private static final double DEFAULT_LETTER_SPACING = 0.0d;
    private static final double DEFAULT_WORD_SPACING = 0.0d;
    static final FontData Defaults = new FontData();
    private static final String FONT_DATA = "fontData";
    private static final String FONT_FEATURE_SETTINGS = "fontFeatureSettings";
    private static final String FONT_VARIANT_LIGATURES = "fontVariantLigatures";
    private static final String FONT_VARIATION_SETTINGS = "fontVariationSettings";
    private static final String KERNING = "kerning";
    private static final String LETTER_SPACING = "letterSpacing";
    private static final String TEXT_ANCHOR = "textAnchor";
    private static final String TEXT_DECORATION = "textDecoration";
    private static final String WORD_SPACING = "wordSpacing";
    int absoluteFontWeight;
    final ReadableMap fontData;
    final String fontFamily;
    final String fontFeatureSettings;
    final double fontSize;
    final TextProperties.FontStyle fontStyle;
    final TextProperties.FontVariantLigatures fontVariantLigatures;
    final String fontVariationSettings;
    TextProperties.FontWeight fontWeight;
    final double kerning;
    final double letterSpacing;
    final boolean manualKerning;
    final TextProperties.TextAnchor textAnchor;
    private final TextProperties.TextDecoration textDecoration;
    final double wordSpacing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class AbsoluteFontWeight {
        private static final TextProperties.FontWeight[] WEIGHTS = {TextProperties.FontWeight.w100, TextProperties.FontWeight.w100, TextProperties.FontWeight.w200, TextProperties.FontWeight.w300, TextProperties.FontWeight.Normal, TextProperties.FontWeight.w500, TextProperties.FontWeight.w600, TextProperties.FontWeight.Bold, TextProperties.FontWeight.w800, TextProperties.FontWeight.w900, TextProperties.FontWeight.w900};
        private static final int[] absoluteFontWeights = {400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        static final int normal = 400;

        private static int bolder(int i) {
            if (i < 350) {
                return 400;
            }
            if (i < 550) {
                return 700;
            }
            if (i < 900) {
                return 900;
            }
            return i;
        }

        private static int lighter(int i) {
            if (i < 100) {
                return i;
            }
            if (i < 550) {
                return 100;
            }
            return i < 750 ? 400 : 700;
        }

        AbsoluteFontWeight() {
        }

        static TextProperties.FontWeight nearestFontWeight(int i) {
            return WEIGHTS[Math.round(i / 100.0f)];
        }

        static int from(TextProperties.FontWeight fontWeight, FontData fontData) {
            if (fontWeight == TextProperties.FontWeight.Bolder) {
                return bolder(fontData.absoluteFontWeight);
            }
            if (fontWeight == TextProperties.FontWeight.Lighter) {
                return lighter(fontData.absoluteFontWeight);
            }
            return absoluteFontWeights[fontWeight.ordinal()];
        }
    }

    private FontData() {
        this.fontData = null;
        this.fontFamily = "";
        this.fontStyle = TextProperties.FontStyle.normal;
        this.fontWeight = TextProperties.FontWeight.Normal;
        this.absoluteFontWeight = 400;
        this.fontFeatureSettings = "";
        this.fontVariationSettings = "";
        this.fontVariantLigatures = TextProperties.FontVariantLigatures.normal;
        this.textAnchor = TextProperties.TextAnchor.start;
        this.textDecoration = TextProperties.TextDecoration.None;
        this.manualKerning = false;
        this.kerning = 0.0d;
        this.fontSize = DEFAULT_FONT_SIZE;
        this.wordSpacing = 0.0d;
        this.letterSpacing = 0.0d;
    }

    private double toAbsolute(ReadableMap readableMap, String str, double d, double d2, double d3) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return PropHelper.fromRelative(readableMap.getString(str), d3, d, d2);
    }

    private void setInheritedWeight(FontData fontData) {
        this.absoluteFontWeight = fontData.absoluteFontWeight;
        this.fontWeight = fontData.fontWeight;
    }

    private void handleNumericWeight(FontData fontData, double d) {
        long round = Math.round(d);
        if (round >= 1 && round <= 1000) {
            this.absoluteFontWeight = (int) round;
            this.fontWeight = AbsoluteFontWeight.nearestFontWeight(this.absoluteFontWeight);
            return;
        }
        setInheritedWeight(fontData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FontData(ReadableMap readableMap, FontData fontData, double d) {
        double d2 = fontData.fontSize;
        if (readableMap.hasKey("fontSize")) {
            this.fontSize = toAbsolute(readableMap, "fontSize", 1.0d, d2, d2);
        } else {
            this.fontSize = d2;
        }
        if (readableMap.hasKey(FontWeight.LOWER_CASE_NAME)) {
            if (readableMap.getType(FontWeight.LOWER_CASE_NAME) == ReadableType.Number) {
                handleNumericWeight(fontData, readableMap.getDouble(FontWeight.LOWER_CASE_NAME));
            } else {
                String string = readableMap.getString(FontWeight.LOWER_CASE_NAME);
                if (TextProperties.FontWeight.hasEnum(string)) {
                    this.absoluteFontWeight = AbsoluteFontWeight.from(TextProperties.FontWeight.get(string), fontData);
                    this.fontWeight = AbsoluteFontWeight.nearestFontWeight(this.absoluteFontWeight);
                } else if (string != null) {
                    handleNumericWeight(fontData, Double.parseDouble(string));
                } else {
                    setInheritedWeight(fontData);
                }
            }
        } else {
            setInheritedWeight(fontData);
        }
        this.fontData = readableMap.hasKey(FONT_DATA) ? readableMap.getMap(FONT_DATA) : fontData.fontData;
        this.fontFamily = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : fontData.fontFamily;
        this.fontStyle = readableMap.hasKey("fontStyle") ? TextProperties.FontStyle.valueOf(readableMap.getString("fontStyle")) : fontData.fontStyle;
        this.fontFeatureSettings = readableMap.hasKey(FONT_FEATURE_SETTINGS) ? readableMap.getString(FONT_FEATURE_SETTINGS) : fontData.fontFeatureSettings;
        this.fontVariationSettings = readableMap.hasKey(FONT_VARIATION_SETTINGS) ? readableMap.getString(FONT_VARIATION_SETTINGS) : fontData.fontVariationSettings;
        this.fontVariantLigatures = readableMap.hasKey(FONT_VARIANT_LIGATURES) ? TextProperties.FontVariantLigatures.valueOf(readableMap.getString(FONT_VARIANT_LIGATURES)) : fontData.fontVariantLigatures;
        this.textAnchor = readableMap.hasKey(TEXT_ANCHOR) ? TextProperties.TextAnchor.valueOf(readableMap.getString(TEXT_ANCHOR)) : fontData.textAnchor;
        this.textDecoration = readableMap.hasKey(TEXT_DECORATION) ? TextProperties.TextDecoration.getEnum(readableMap.getString(TEXT_DECORATION)) : fontData.textDecoration;
        boolean hasKey = readableMap.hasKey(KERNING);
        this.manualKerning = hasKey || fontData.manualKerning;
        this.kerning = hasKey ? toAbsolute(readableMap, KERNING, d, this.fontSize, 0.0d) : fontData.kerning;
        this.wordSpacing = readableMap.hasKey(WORD_SPACING) ? toAbsolute(readableMap, WORD_SPACING, d, this.fontSize, 0.0d) : fontData.wordSpacing;
        this.letterSpacing = readableMap.hasKey("letterSpacing") ? toAbsolute(readableMap, "letterSpacing", d, this.fontSize, 0.0d) : fontData.letterSpacing;
    }
}
