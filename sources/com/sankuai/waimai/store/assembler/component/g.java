package com.sankuai.waimai.store.assembler.component;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends b {
    public int b;
    public int c;
    public BaseCard d;

    public g(BaseCard baseCard) {
        super(new LinearLayout(baseCard.e));
        this.d = baseCard;
        this.a.setLayoutParams(new ViewGroup.LayoutParams(new ViewGroup.LayoutParams(com.sankuai.shangou.stone.util.h.a((Context) baseCard.e), baseCard.c.a.equals(f.MultiList) ? com.sankuai.shangou.stone.util.h.b(baseCard.e) : -2)));
        ((ViewGroup) this.a).addView(baseCard.b, new ViewGroup.LayoutParams(-1, -2));
        this.b = System.identityHashCode(baseCard);
    }
}
