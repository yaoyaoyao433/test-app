package com.sankuai.waimai.irmo.render.bean.anim.draw;

import com.sankuai.waimai.mach.widget.decorations.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface DrawUpdateCommand<T> extends c {
    public static final float[] nilCorner = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    void update(T t);
}
