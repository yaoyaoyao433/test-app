package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SVGLength {
    final UnitType unit;
    final double value;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    private SVGLength() {
        this.value = 0.0d;
        this.unit = UnitType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGLength(double d) {
        this.value = d;
        this.unit = UnitType.NUMBER;
    }

    private SVGLength(String str) {
        char c;
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals("normal")) {
            this.unit = UnitType.UNKNOWN;
            this.value = 0.0d;
        } else if (trim.codePointAt(i) == 37) {
            this.unit = UnitType.PERCENTAGE;
            this.value = Double.valueOf(trim.substring(0, i)).doubleValue();
        } else {
            int i2 = length - 2;
            if (i2 > 0) {
                String substring = trim.substring(i2);
                int hashCode = substring.hashCode();
                if (hashCode == 3178) {
                    if (substring.equals("cm")) {
                        c = 6;
                    }
                    c = 65535;
                } else if (hashCode == 3240) {
                    if (substring.equals("em")) {
                        c = 1;
                    }
                    c = 65535;
                } else if (hashCode == 3251) {
                    if (substring.equals("ex")) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode == 3365) {
                    if (substring.equals("in")) {
                        c = 7;
                    }
                    c = 65535;
                } else if (hashCode == 3488) {
                    if (substring.equals("mm")) {
                        c = 5;
                    }
                    c = 65535;
                } else if (hashCode == 3571) {
                    if (substring.equals("pc")) {
                        c = 4;
                    }
                    c = 65535;
                } else if (hashCode != 3588) {
                    if (hashCode == 3592 && substring.equals("px")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (substring.equals(AdvertisementOption.PRIORITY_VALID_TIME)) {
                        c = 3;
                    }
                    c = 65535;
                }
                switch (c) {
                    case 0:
                        this.unit = UnitType.NUMBER;
                        length = i2;
                        break;
                    case 1:
                        this.unit = UnitType.EMS;
                        length = i2;
                        break;
                    case 2:
                        this.unit = UnitType.EXS;
                        length = i2;
                        break;
                    case 3:
                        this.unit = UnitType.PT;
                        length = i2;
                        break;
                    case 4:
                        this.unit = UnitType.PC;
                        length = i2;
                        break;
                    case 5:
                        this.unit = UnitType.MM;
                        length = i2;
                        break;
                    case 6:
                        this.unit = UnitType.CM;
                        length = i2;
                        break;
                    case 7:
                        this.unit = UnitType.IN;
                        length = i2;
                        break;
                    default:
                        this.unit = UnitType.NUMBER;
                        break;
                }
                this.value = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.unit = UnitType.NUMBER;
            this.value = Double.valueOf(trim).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SVGLength from(Dynamic dynamic) {
        switch (dynamic.getType()) {
            case Number:
                return new SVGLength(dynamic.asDouble());
            case String:
                return new SVGLength(dynamic.asString());
            default:
                return new SVGLength();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toString(Dynamic dynamic) {
        switch (dynamic.getType()) {
            case Number:
                return String.valueOf(dynamic.asDouble());
            case String:
                return dynamic.asString();
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<SVGLength> arrayFrom(Dynamic dynamic) {
        switch (dynamic.getType()) {
            case Number:
                ArrayList<SVGLength> arrayList = new ArrayList<>(1);
                arrayList.add(new SVGLength(dynamic.asDouble()));
                return arrayList;
            case String:
                ArrayList<SVGLength> arrayList2 = new ArrayList<>(1);
                arrayList2.add(new SVGLength(dynamic.asString()));
                return arrayList2;
            case Array:
                ReadableArray asArray = dynamic.asArray();
                int size = asArray.size();
                ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    arrayList3.add(from(asArray.getDynamic(i)));
                }
                return arrayList3;
            default:
                return null;
        }
    }
}
