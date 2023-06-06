package android.support.v7.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    @NonNull
    public static ColorStateList a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return a(resources, xmlPullParser, asAttributeSet, theme);
    }

    private static ColorStateList a(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        TypedArray obtainStyledAttributes;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = {16843173, 16843551, R.attr.alpha};
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr3);
                } else {
                    obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                }
                int color = obtainStyledAttributes.getColor(0, -65281);
                float f = 1.0f;
                if (obtainStyledAttributes.hasValue(i)) {
                    f = obtainStyledAttributes.getFloat(i, 1.0f);
                } else if (obtainStyledAttributes.hasValue(2)) {
                    f = obtainStyledAttributes.getFloat(2, 1.0f);
                }
                obtainStyledAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr4, i3);
                iArr2 = c.a(iArr2, i2, ColorUtils.setAlphaComponent(color, Math.round(Color.alpha(color) * f)));
                iArr = (int[][]) c.a(iArr, i2, trimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2];
        System.arraycopy(iArr2, 0, iArr5, 0, i2);
        System.arraycopy(iArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
