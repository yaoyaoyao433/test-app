package com.squareup.picasso;

import android.graphics.Bitmap;
import android.view.animation.Animation;
import com.meituan.metrics.common.Constants;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class Request {
    private static final long l = TimeUnit.SECONDS.toNanos(5);
    public final Object a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final float g;
    public final float h;
    public final float i;
    public final boolean j;
    public final Bitmap.Config k;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        sb.append(PicassoUtil.a(this.a));
        if (this.b != null) {
            sb.append(" stableKey(");
            sb.append(this.b);
            sb.append(')');
        }
        if (this.c > 0) {
            sb.append(" resize(");
            sb.append(this.c);
            sb.append(',');
            sb.append(this.d);
            sb.append(')');
        }
        if (this.e) {
            sb.append(" centerCrop");
        }
        if (this.f) {
            sb.append(" centerInside");
        }
        if (this.g != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.g);
            if (this.j) {
                sb.append(" @ ");
                sb.append(this.h);
                sb.append(',');
                sb.append(this.i);
            }
            sb.append(')');
        }
        if (this.k != null) {
            sb.append(Constants.SPACE);
            sb.append(this.k);
        }
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class Builder {
        public Object a;
        int b;
        int c;
        boolean d;
        boolean e;
        List<Transformation> f;
        Bitmap.Config g;
        Picasso.Priority h;
        DecodeFormat i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;
        Animation o;
        public boolean p;
        boolean q;
        Float r = Float.valueOf(1.0f);

        public Builder(Object obj) {
            this.a = obj;
        }

        public final boolean a() {
            return this.a != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean b() {
            return this.h != null;
        }

        public final Builder a(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i2 == 0 && i == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.b = i;
                    this.c = i2;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public final Builder c() {
            if (this.e) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.d = true;
            return this;
        }

        public final Builder d() {
            if (this.d) {
                throw new IllegalStateException("Center inside can not be used after calling centerCrop");
            }
            this.e = true;
            return this;
        }

        public final Builder a(Transformation transformation) {
            if (transformation == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (transformation.a() == null) {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            if (this.f == null) {
                this.f = new ArrayList(2);
            }
            this.f.add(transformation);
            return this;
        }
    }
}
