package com.horcrux.svg;

import android.view.View;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TextLayoutAlgorithm {
    TextLayoutAlgorithm() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class CharacterInformation {
        double advance;
        char character;
        TextView element;
        int index;
        double x = 0.0d;
        double y = 0.0d;
        double rotate = 0.0d;
        boolean hidden = false;
        boolean middle = false;
        boolean resolved = false;
        boolean xSpecified = false;
        boolean ySpecified = false;
        boolean addressable = true;
        boolean anchoredChunk = false;
        boolean rotateSpecified = false;
        boolean firstCharacterInResolvedDescendant = false;

        CharacterInformation(int i, char c) {
            this.index = i;
            this.character = c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class LayoutInput {
        boolean horizontal;
        TextView text;

        LayoutInput() {
        }
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<TextPathView> arrayList, ArrayList<TextView> arrayList2, StringBuilder sb, View view, TextPathView textPathView) {
        int i = 0;
        if (view instanceof TSpanView) {
            TSpanView tSpanView = (TSpanView) view;
            String str = tSpanView.mContent;
            if (str == null) {
                while (i < tSpanView.getChildCount()) {
                    getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, tSpanView.getChildAt(i), textPathView);
                    i++;
                }
                return;
            }
            while (i < str.length()) {
                arrayList2.add(tSpanView);
                arrayList.add(textPathView);
                i++;
            }
            sb.append(str);
            return;
        }
        if (view instanceof TextPathView) {
            textPathView = (TextPathView) view;
        }
        while (i < textPathView.getChildCount()) {
            getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, textPathView.getChildAt(i), textPathView);
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019c, code lost:
        if (r18 == Double.POSITIVE_INFINITY) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02df  */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.Canvas, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.horcrux.svg.TextLayoutAlgorithm.CharacterInformation[] layoutText(com.horcrux.svg.TextLayoutAlgorithm.LayoutInput r29) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TextLayoutAlgorithm.layoutText(com.horcrux.svg.TextLayoutAlgorithm$LayoutInput):com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation[]");
    }
}
