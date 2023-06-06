package com.airbnb.lottie.model.content;

import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h implements b {
    public final String a;
    public final a b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static a a(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    public h(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.b + '}';
    }

    @Override // com.airbnb.lottie.model.content.b
    @Nullable
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        if (!lottieDrawable.k) {
            com.airbnb.lottie.d.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new com.airbnb.lottie.animation.content.k(this);
    }
}
