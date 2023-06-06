package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.android.recce.props.gens.BorderTopColor;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.Editable;
import com.meituan.android.recce.props.gens.Elevation;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PathParser {
    static ArrayList<PathElement> elements;
    private static int i;
    private static int l;
    private static Path mPath;
    private static boolean mPenDown;
    private static float mPenDownX;
    private static float mPenDownY;
    private static float mPenX;
    private static float mPenY;
    private static float mPivotX;
    private static float mPivotY;
    static float mScale;
    private static String s;

    private static boolean is_cmd(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case BorderTopColor.INDEX_ID /* 81 */:
            case BorderTopLeftRadius.INDEX_ID /* 83 */:
            case 'T':
            case Elevation.INDEX_ID /* 86 */:
            case 'Z':
            case Editable.INDEX_ID /* 97 */:
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean is_number_start(char c) {
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+';
    }

    PathParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Path parse(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.PathParser.parse(java.lang.String):android.graphics.Path");
    }

    private static void move(float f, float f2) {
        moveTo(f + mPenX, f2 + mPenY);
    }

    private static void moveTo(float f, float f2) {
        mPenX = f;
        mPivotX = f;
        mPenDownX = f;
        mPenY = f2;
        mPivotY = f2;
        mPenDownY = f2;
        mPath.moveTo(mScale * f, mScale * f2);
        elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, new Point[]{new Point(f, f2)}));
    }

    private static void line(float f, float f2) {
        lineTo(f + mPenX, f2 + mPenY);
    }

    private static void lineTo(float f, float f2) {
        setPenDown();
        mPenX = f;
        mPivotX = f;
        mPenY = f2;
        mPivotY = f2;
        mPath.lineTo(mScale * f, mScale * f2);
        elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, new Point[]{new Point(f, f2)}));
    }

    private static void curve(float f, float f2, float f3, float f4, float f5, float f6) {
        curveTo(f + mPenX, f2 + mPenY, f3 + mPenX, f4 + mPenY, f5 + mPenX, f6 + mPenY);
    }

    private static void curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        mPivotX = f3;
        mPivotY = f4;
        cubicTo(f, f2, f3, f4, f5, f6);
    }

    private static void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        setPenDown();
        mPenX = f5;
        mPenY = f6;
        mPath.cubicTo(mScale * f, mScale * f2, mScale * f3, mScale * f4, mScale * f5, mScale * f6);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f, f2), new Point(f3, f4), new Point(f5, f6)}));
    }

    private static void smoothCurve(float f, float f2, float f3, float f4) {
        smoothCurveTo(f + mPenX, f2 + mPenY, f3 + mPenX, f4 + mPenY);
    }

    private static void smoothCurveTo(float f, float f2, float f3, float f4) {
        mPivotX = f;
        mPivotY = f2;
        cubicTo((mPenX * 2.0f) - mPivotX, (mPenY * 2.0f) - mPivotY, f, f2, f3, f4);
    }

    private static void quadraticBezierCurve(float f, float f2, float f3, float f4) {
        quadraticBezierCurveTo(f + mPenX, f2 + mPenY, f3 + mPenX, f4 + mPenY);
    }

    private static void quadraticBezierCurveTo(float f, float f2, float f3, float f4) {
        mPivotX = f;
        mPivotY = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        float f7 = (mPenX + f5) / 3.0f;
        float f8 = (mPenY + f6) / 3.0f;
        cubicTo(f7, f8, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    private static void smoothQuadraticBezierCurve(float f, float f2) {
        smoothQuadraticBezierCurveTo(f + mPenX, f2 + mPenY);
    }

    private static void smoothQuadraticBezierCurveTo(float f, float f2) {
        quadraticBezierCurveTo((mPenX * 2.0f) - mPivotX, (mPenY * 2.0f) - mPivotY, f, f2);
    }

    private static void arc(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        arcTo(f, f2, f3, z, z2, f4 + mPenX, f5 + mPenY);
    }

    private static void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = mPenX;
        float f15 = mPenY;
        float abs = Math.abs(f2 == 0.0f ? f == 0.0f ? f5 - f15 : f : f2);
        float abs2 = Math.abs(f == 0.0f ? f4 - f14 : f);
        if (abs2 == 0.0f || abs == 0.0f || (f4 == f14 && f5 == f15)) {
            lineTo(f4, f5);
            return;
        }
        float radians = (float) Math.toRadians(f3);
        double d = radians;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f16 = f4 - f14;
        float f17 = f5 - f15;
        float f18 = ((cos * f16) / 2.0f) + ((sin * f17) / 2.0f);
        float f19 = -sin;
        float f20 = ((f19 * f16) / 2.0f) + ((cos * f17) / 2.0f);
        float f21 = abs2 * abs2;
        float f22 = abs * abs * f18 * f18;
        if ((((f21 * abs) * abs) - ((f21 * f20) * f20)) - f22 < 0.0f) {
            f9 = f19;
            float sqrt = (float) Math.sqrt(1.0f - (f8 / f6));
            f13 = f16 / 2.0f;
            f10 = abs * sqrt;
            f11 = abs2 * sqrt;
            f12 = f17 / 2.0f;
        } else {
            f9 = f19;
            float sqrt2 = (float) Math.sqrt(f8 / (f7 + f22));
            if (z == z2) {
                sqrt2 = -sqrt2;
            }
            float f23 = (((-sqrt2) * f20) * abs2) / abs;
            float f24 = ((sqrt2 * f18) * abs) / abs2;
            f10 = abs;
            f11 = abs2;
            f12 = (f17 / 2.0f) + (f23 * sin) + (f24 * cos);
            f13 = ((cos * f23) - (sin * f24)) + (f16 / 2.0f);
        }
        float f25 = f10;
        float f26 = cos / f11;
        float f27 = sin / f11;
        float f28 = f9 / f25;
        float f29 = cos / f25;
        float f30 = -f13;
        float f31 = -f12;
        float f32 = f11;
        float atan2 = (float) Math.atan2((f28 * f30) + (f29 * f31), (f30 * f26) + (f31 * f27));
        float f33 = f16 - f13;
        float f34 = f17 - f12;
        float atan22 = (float) Math.atan2((f28 * f33) + (f29 * f34), (f26 * f33) + (f27 * f34));
        float f35 = f13 + f14;
        float f36 = f12 + f15;
        float f37 = f16 + f14;
        float f38 = f17 + f15;
        setPenDown();
        mPivotX = f37;
        mPenX = f37;
        mPivotY = f38;
        mPenY = f38;
        if (f32 != f25 || radians != 0.0f) {
            arcToBezier(f35, f36, f32, f25, atan2, atan22, z2, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(atan2);
        float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
        if (z) {
            if (abs3 < 180.0f) {
                abs3 = 360.0f - abs3;
            }
        } else if (abs3 > 180.0f) {
            abs3 = 360.0f - abs3;
        }
        if (!z2) {
            abs3 = -abs3;
        }
        mPath.arcTo(new RectF((f35 - f32) * mScale, (f36 - f32) * mScale, (f35 + f32) * mScale, (f36 + f32) * mScale), degrees, abs3);
        elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f37, f38)}));
    }

    private static void close() {
        if (mPenDown) {
            mPenX = mPenDownX;
            mPenY = mPenDownY;
            mPenDown = false;
            mPath.close();
            elements.add(new PathElement(ElementType.kCGPathElementCloseSubpath, new Point[]{new Point(mPenX, mPenY)}));
        }
    }

    private static void arcToBezier(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7) {
        double d = f7;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f8 = cos * f3;
        float f9 = (-sin) * f4;
        float f10 = sin * f3;
        float f11 = cos * f4;
        float f12 = f6 - f5;
        if (f12 < 0.0f && z) {
            f12 = (float) (f12 + 6.283185307179586d);
        } else if (f12 > 0.0f && !z) {
            f12 = (float) (f12 - 6.283185307179586d);
        }
        int ceil = (int) Math.ceil(Math.abs(round(f12 / 1.5707963267948966d)));
        float f13 = f12 / ceil;
        float tan = (float) (Math.tan(f13 / 4.0f) * 1.3333333333333333d);
        double d2 = f5;
        float cos2 = (float) Math.cos(d2);
        float sin2 = (float) Math.sin(d2);
        float f14 = f5;
        int i2 = 0;
        while (i2 < ceil) {
            float f15 = cos2 - (tan * sin2);
            float f16 = sin2 + (cos2 * tan);
            f14 += f13;
            double d3 = f14;
            float f17 = f13;
            int i3 = ceil;
            float cos3 = (float) Math.cos(d3);
            float sin3 = (float) Math.sin(d3);
            float f18 = (tan * sin3) + cos3;
            float f19 = sin3 - (tan * cos3);
            float f20 = f + (f8 * f15) + (f9 * f16);
            float f21 = f2 + (f15 * f10) + (f16 * f11);
            float f22 = f + (f8 * f18) + (f9 * f19);
            float f23 = f2 + (f18 * f10) + (f19 * f11);
            float f24 = f + (f8 * cos3) + (f9 * sin3);
            float f25 = f2 + (f10 * cos3) + (f11 * sin3);
            mPath.cubicTo(f20 * mScale, f21 * mScale, f22 * mScale, f23 * mScale, f24 * mScale, f25 * mScale);
            elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, new Point[]{new Point(f20, f21), new Point(f22, f23), new Point(f24, f25)}));
            i2++;
            ceil = i3;
            f13 = f17;
            cos2 = cos3;
            sin2 = sin3;
            tan = tan;
            f10 = f10;
            f8 = f8;
            f11 = f11;
        }
    }

    private static void setPenDown() {
        if (mPenDown) {
            return;
        }
        mPenDownX = mPenX;
        mPenDownY = mPenY;
        mPenDown = true;
    }

    private static double round(double d) {
        double pow = Math.pow(10.0d, 4.0d);
        return Math.round(d * pow) / pow;
    }

    private static void skip_spaces() {
        while (i < l && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
    }

    private static boolean is_absolute(char c) {
        return Character.isUpperCase(c);
    }

    private static boolean parse_flag() {
        skip_spaces();
        char charAt = s.charAt(i);
        switch (charAt) {
            case '0':
            case '1':
                int i2 = i + 1;
                i = i2;
                if (i2 < l && s.charAt(i) == ',') {
                    i++;
                }
                skip_spaces();
                return charAt == '1';
            default:
                throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(i), s));
        }
    }

    private static float parse_list_number() {
        if (i == l) {
            throw new Error(String.format("Unexpected end (s=%s)", s));
        }
        float parse_number = parse_number();
        skip_spaces();
        parse_list_separator();
        return parse_number;
    }

    private static float parse_number() {
        char charAt;
        skip_spaces();
        if (i == l) {
            throw new Error(String.format("Unexpected end (s=%s)", s));
        }
        int i2 = i;
        char charAt2 = s.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            i++;
            charAt2 = s.charAt(i);
        }
        if (charAt2 >= '0' && charAt2 <= '9') {
            skip_digits();
            if (i < l) {
                charAt2 = s.charAt(i);
            }
        } else if (charAt2 != '.') {
            throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(i), s));
        }
        if (charAt2 == '.') {
            i++;
            skip_digits();
            if (i < l) {
                charAt2 = s.charAt(i);
            }
        }
        if ((charAt2 == 'e' || charAt2 == 'E') && i + 1 < l && (charAt = s.charAt(i + 1)) != 'm' && charAt != 'x') {
            i++;
            char charAt3 = s.charAt(i);
            if (charAt3 == '+' || charAt3 == '-') {
                i++;
                skip_digits();
            } else if (charAt3 >= '0' && charAt3 <= '9') {
                skip_digits();
            } else {
                throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(i), s));
            }
        }
        String substring = s.substring(i2, i);
        float parseFloat = Float.parseFloat(substring);
        if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
            throw new Error(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i2), Integer.valueOf(i), s));
        }
        return parseFloat;
    }

    private static void parse_list_separator() {
        if (i >= l || s.charAt(i) != ',') {
            return;
        }
        i++;
    }

    private static void skip_digits() {
        while (i < l && Character.isDigit(s.charAt(i))) {
            i++;
        }
    }
}
