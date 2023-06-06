package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public class YogaNodeJNIBatching extends YogaNodeJNIBase {
    @DoNotStrip
    @Nullable
    private float[] arr;
    private boolean b;
    @DoNotStrip
    private int mLayoutDirection;

    public YogaNodeJNIBatching() {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.b = true;
    }

    public YogaNodeJNIBatching(a aVar) {
        super(aVar);
        this.arr = null;
        this.mLayoutDirection = 0;
        this.b = true;
    }

    @Override // com.facebook.yoga.YogaNodeJNIBase, com.facebook.yoga.d
    public final void b() {
        super.b();
        this.arr = null;
        this.b = true;
        this.mLayoutDirection = 0;
    }

    @Override // com.facebook.yoga.d
    public final float q() {
        if (this.arr != null) {
            return this.arr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.d
    public final float r() {
        if (this.arr != null) {
            return this.arr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.d
    public final float s() {
        if (this.arr != null) {
            return this.arr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.d
    public final float t() {
        if (this.arr != null) {
            return this.arr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.d
    public final float e(YogaEdge yogaEdge) {
        if (this.arr == null || (((int) this.arr[0]) & 1) != 1) {
            return 0.0f;
        }
        switch (yogaEdge) {
            case LEFT:
                return this.arr[6];
            case TOP:
                return this.arr[7];
            case RIGHT:
                return this.arr[8];
            case BOTTOM:
                return this.arr[9];
            case START:
                return u() == YogaDirection.RTL ? this.arr[8] : this.arr[6];
            case END:
                return u() == YogaDirection.RTL ? this.arr[6] : this.arr[8];
            default:
                throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.d
    public final float f(YogaEdge yogaEdge) {
        if (this.arr != null) {
            if ((((int) this.arr[0]) & 2) == 2) {
                int i = 10 - ((((int) this.arr[0]) & 1) != 1 ? 4 : 0);
                switch (yogaEdge) {
                    case LEFT:
                        return this.arr[i];
                    case TOP:
                        return this.arr[i + 1];
                    case RIGHT:
                        return this.arr[i + 2];
                    case BOTTOM:
                        return this.arr[i + 3];
                    case START:
                        return u() == YogaDirection.RTL ? this.arr[i + 2] : this.arr[i];
                    case END:
                        return u() == YogaDirection.RTL ? this.arr[i] : this.arr[i + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
                }
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.d
    public final float g(YogaEdge yogaEdge) {
        if (this.arr != null) {
            if ((((int) this.arr[0]) & 4) == 4) {
                int i = (14 - ((((int) this.arr[0]) & 1) == 1 ? 0 : 4)) - ((((int) this.arr[0]) & 2) != 2 ? 4 : 0);
                switch (yogaEdge) {
                    case LEFT:
                        return this.arr[i];
                    case TOP:
                        return this.arr[i + 1];
                    case RIGHT:
                        return this.arr[i + 2];
                    case BOTTOM:
                        return this.arr[i + 3];
                    case START:
                        return u() == YogaDirection.RTL ? this.arr[i + 2] : this.arr[i];
                    case END:
                        return u() == YogaDirection.RTL ? this.arr[i] : this.arr[i + 2];
                    default:
                        throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
                }
            }
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.d
    public final YogaDirection u() {
        return YogaDirection.a(this.arr != null ? (int) this.arr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.d
    public final boolean e() {
        if (this.arr != null) {
            return (((int) this.arr[0]) & 16) == 16;
        }
        return this.b;
    }

    @Override // com.facebook.yoga.d
    public final void i() {
        if (this.arr != null) {
            this.arr[0] = ((int) this.arr[0]) & (-17);
        }
        this.b = false;
    }
}
