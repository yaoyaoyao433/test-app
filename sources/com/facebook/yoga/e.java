package com.facebook.yoga;

import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.sampler.fps.FpsEvent;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    static final e a = new e(Float.NaN, YogaUnit.UNDEFINED);
    static final e b = new e(0.0f, YogaUnit.POINT);
    static final e c = new e(Float.NaN, YogaUnit.AUTO);
    public final float d;
    public final YogaUnit e;

    public e(float f, YogaUnit yogaUnit) {
        this.d = f;
        this.e = yogaUnit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(float f, int i) {
        this(f, YogaUnit.a(i));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.e == eVar.e) {
                return this.e == YogaUnit.UNDEFINED || this.e == YogaUnit.AUTO || Float.compare(this.d, eVar.d) == 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + this.e.e;
    }

    public final String toString() {
        switch (this.e) {
            case UNDEFINED:
                return Constants.UNDEFINED;
            case POINT:
                return Float.toString(this.d);
            case PERCENT:
                return this.d + "%";
            case AUTO:
                return FpsEvent.TYPE_SCROLL_AUTO;
            default:
                throw new IllegalStateException();
        }
    }

    public static e a(String str) {
        if (str == null) {
            return null;
        }
        if (Constants.UNDEFINED.equals(str)) {
            return a;
        }
        if (FpsEvent.TYPE_SCROLL_AUTO.equals(str)) {
            return c;
        }
        if (str.endsWith("%")) {
            return new e(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT);
        }
        return new e(Float.parseFloat(str), YogaUnit.POINT);
    }
}
