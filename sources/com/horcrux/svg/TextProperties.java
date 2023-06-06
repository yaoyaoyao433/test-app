package com.horcrux.svg;

import com.dianping.titans.widget.DynamicTitleParser;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TextProperties {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum Direction {
        ltr,
        rtl
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum FontStyle {
        normal,
        italic,
        oblique
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum FontVariantLigatures {
        normal,
        none
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum TextAnchor {
        start,
        middle,
        end
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum TextLengthAdjust {
        spacing,
        spacingAndGlyphs
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum TextPathMethod {
        align,
        stretch
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum TextPathMidLine {
        sharp,
        smooth
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum TextPathSide {
        left,
        right
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum TextPathSpacing {
        auto,
        exact
    }

    TextProperties() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum AlignmentBaseline {
        baseline("baseline"),
        textBottom("text-bottom"),
        alphabetic("alphabetic"),
        ideographic("ideographic"),
        middle("middle"),
        central("central"),
        mathematical("mathematical"),
        textTop("text-top"),
        bottom("bottom"),
        center("center"),
        top("top"),
        textBeforeEdge("text-before-edge"),
        textAfterEdge("text-after-edge"),
        beforeEdge("before-edge"),
        afterEdge("after-edge"),
        hanging("hanging");
        
        private static final Map<String, AlignmentBaseline> alignmentToEnum = new HashMap();
        private final String alignment;

        static {
            AlignmentBaseline[] values;
            for (AlignmentBaseline alignmentBaseline : values()) {
                alignmentToEnum.put(alignmentBaseline.alignment, alignmentBaseline);
            }
        }

        AlignmentBaseline(String str) {
            this.alignment = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static AlignmentBaseline getEnum(String str) {
            if (!alignmentToEnum.containsKey(str)) {
                throw new IllegalArgumentException("Unknown String Value: " + str);
            }
            return alignmentToEnum.get(str);
        }

        @Override // java.lang.Enum
        @Nonnull
        public final String toString() {
            return this.alignment;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum FontWeight {
        Normal("normal"),
        Bold(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD),
        w100("100"),
        w200(BasicPushStatus.SUCCESS_CODE),
        w300("300"),
        w400("400"),
        w500("500"),
        w600("600"),
        w700("700"),
        w800("800"),
        w900("900"),
        Bolder("bolder"),
        Lighter("lighter");
        
        private static final Map<String, FontWeight> weightToEnum = new HashMap();
        private final String weight;

        static {
            FontWeight[] values;
            for (FontWeight fontWeight : values()) {
                weightToEnum.put(fontWeight.weight, fontWeight);
            }
        }

        FontWeight(String str) {
            this.weight = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean hasEnum(String str) {
            return weightToEnum.containsKey(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static FontWeight get(String str) {
            return weightToEnum.get(str);
        }

        @Override // java.lang.Enum
        @Nonnull
        public final String toString() {
            return this.weight;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum TextDecoration {
        None("none"),
        Underline(DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE),
        Overline(DynamicTitleParser.PARSER_VAL_FONT_STYLE_OVER_LINE),
        LineThrough(DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH),
        Blink("blink");
        
        private static final Map<String, TextDecoration> decorationToEnum = new HashMap();
        private final String decoration;

        static {
            TextDecoration[] values;
            for (TextDecoration textDecoration : values()) {
                decorationToEnum.put(textDecoration.decoration, textDecoration);
            }
        }

        TextDecoration(String str) {
            this.decoration = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static TextDecoration getEnum(String str) {
            if (!decorationToEnum.containsKey(str)) {
                throw new IllegalArgumentException("Unknown String Value: " + str);
            }
            return decorationToEnum.get(str);
        }

        @Override // java.lang.Enum
        @Nonnull
        public final String toString() {
            return this.decoration;
        }
    }
}
