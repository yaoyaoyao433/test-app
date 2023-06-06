package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PropHelper {
    private static final int inputMatrixDataSize = 6;

    PropHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toMatrixData(ReadableArray readableArray, float[] fArr, float f) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f;
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double fromRelative(String str, double d, double d2, double d3) {
        char c;
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals("normal")) {
            return 0.0d;
        }
        if (trim.codePointAt(i) == 37) {
            return (Double.valueOf(trim.substring(0, i)).doubleValue() / 100.0d) * d;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            String substring = trim.substring(i2);
            int hashCode = substring.hashCode();
            if (hashCode == 3178) {
                if (substring.equals("cm")) {
                    c = 5;
                }
                c = 65535;
            } else if (hashCode == 3240) {
                if (substring.equals("em")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode == 3365) {
                if (substring.equals("in")) {
                    c = 6;
                }
                c = 65535;
            } else if (hashCode == 3488) {
                if (substring.equals("mm")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 3571) {
                if (substring.equals("pc")) {
                    c = 3;
                }
                c = 65535;
            } else if (hashCode != 3588) {
                if (hashCode == 3592 && substring.equals("px")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (substring.equals(AdvertisementOption.PRIORITY_VALID_TIME)) {
                    c = 2;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    d3 = 1.0d;
                    break;
                case 1:
                    break;
                case 2:
                    d3 = 1.25d;
                    break;
                case 3:
                    d3 = 15.0d;
                    break;
                case 4:
                    d3 = 3.543307d;
                    break;
                case 5:
                    d3 = 35.43307d;
                    break;
                case 6:
                    d3 = 90.0d;
                    break;
                default:
                    i2 = length;
                    d3 = 1.0d;
                    break;
            }
            return Double.valueOf(trim.substring(0, i2)).doubleValue() * d3 * d2;
        }
        return Double.valueOf(trim).doubleValue() * d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double fromRelative(SVGLength sVGLength, double d, double d2, double d3, double d4) {
        if (sVGLength == null) {
            return d2;
        }
        SVGLength.UnitType unitType = sVGLength.unit;
        double d5 = sVGLength.value;
        switch (unitType) {
            case NUMBER:
            case PX:
                d4 = 1.0d;
                break;
            case PERCENTAGE:
                return ((d5 / 100.0d) * d) + d2;
            case EMS:
                break;
            case EXS:
                d4 /= 2.0d;
                break;
            case CM:
                d4 = 35.43307d;
                break;
            case MM:
                d4 = 3.543307d;
                break;
            case IN:
                d4 = 90.0d;
                break;
            case PT:
                d4 = 1.25d;
                break;
            case PC:
                d4 = 15.0d;
                break;
            default:
                return (d5 * d3) + d2;
        }
        return (d5 * d4 * d3) + d2;
    }
}
