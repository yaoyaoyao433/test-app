package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.View;
import com.airbnb.lottie.model.h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public final AssetManager d;
    @Nullable
    public com.airbnb.lottie.b e;
    public final h<String> a = new h<>();
    public final Map<h<String>, Typeface> b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public String f = ".ttf";

    public a(Drawable.Callback callback, @Nullable com.airbnb.lottie.b bVar) {
        this.e = bVar;
        if (!(callback instanceof View)) {
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }
}
