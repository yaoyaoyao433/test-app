package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.r;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q implements b {
    public final String a;
    public final int b;
    public final com.airbnb.lottie.model.animatable.b c;
    public final com.airbnb.lottie.model.animatable.b d;
    public final com.airbnb.lottie.model.animatable.b e;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {a, b};

        public static int a(int i) {
            switch (i) {
                case 1:
                    return a;
                case 2:
                    return b;
                default:
                    throw new IllegalArgumentException("Unknown trim path type " + i);
            }
        }
    }

    public q(String str, int i, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3) {
        this.a = str;
        this.b = i;
        this.c = bVar;
        this.d = bVar2;
        this.e = bVar3;
    }

    @Override // com.airbnb.lottie.model.content.b
    public final com.airbnb.lottie.animation.content.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new r(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
