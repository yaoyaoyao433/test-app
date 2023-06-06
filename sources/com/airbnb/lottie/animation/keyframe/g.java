package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public final List<a<com.airbnb.lottie.model.content.l, Path>> a;
    public final List<a<Integer, Integer>> b;
    public final List<com.airbnb.lottie.model.content.g> c;

    public g(List<com.airbnb.lottie.model.content.g> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(list.get(i).b.a());
            this.b.add(list.get(i).c.a());
        }
    }
}
