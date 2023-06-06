package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public final l<com.bumptech.glide.load.resource.gif.b> a;
    public final l<Bitmap> b;

    public a(l<Bitmap> lVar, l<com.bumptech.glide.load.resource.gif.b> lVar2) {
        if (lVar != null && lVar2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.b = lVar;
        this.a = lVar2;
    }
}
