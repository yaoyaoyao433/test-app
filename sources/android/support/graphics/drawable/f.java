package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.annotation.RestrictTo;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.meituan.robust.common.CommonConstant;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class f implements Interpolator {
    private float[] a;
    private float[] b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, a.l);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "pathData", 4);
            Path createPathFromPathData = PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData == null) {
                throw new InflateException("The path is null, which is created from " + namedString);
            }
            a(createPathFromPathData);
        } else if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlX1", 0, 0.0f);
            float namedFloat2 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlY1", 1, 0.0f);
            boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
            if (hasAttribute != TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (hasAttribute) {
                float namedFloat3 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlX2", 2, 0.0f);
                float namedFloat4 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlY2", 3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(namedFloat, namedFloat2, namedFloat3, namedFloat4, 1.0f, 1.0f);
                a(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(namedFloat, namedFloat2, 1.0f, 1.0f);
                a(path2);
            }
        }
        obtainAttributes.recycle();
    }

    private void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.a = new float[min];
        this.b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.a[i2] = fArr[0];
            this.b[i2] = fArr[1];
        }
        if (Math.abs(this.a[0]) <= 1.0E-5d && Math.abs(this.b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.b[i3] - 1.0f) <= 1.0E-5d) {
                int i4 = 0;
                float f = 0.0f;
                while (i < min) {
                    int i5 = i4 + 1;
                    float f2 = this.a[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    this.a[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.a[0]);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.a[i6]);
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.a[length] - this.a[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float f3 = this.b[i];
        return f3 + (((f - this.a[i]) / f2) * (this.b[length] - f3));
    }
}
