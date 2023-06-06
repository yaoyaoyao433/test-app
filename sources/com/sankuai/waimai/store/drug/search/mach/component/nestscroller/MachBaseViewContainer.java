package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class MachBaseViewContainer extends MachViewGroup {
    public a a;
    public com.sankuai.waimai.mach.node.a b;

    public MachBaseViewContainer(@NonNull Context context) {
        this(context, null);
    }

    private MachBaseViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
    }

    public MachBaseViewContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
