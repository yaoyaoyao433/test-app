package com.sankuai.waimai.platform.widget.nestedlist.interfaces;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.sankuai.waimai.platform.widget.nestedlist.impl.GroupItemInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c<Holder, Group, Child> {
    void a(@NonNull Holder holder, Group group, int i, @NonNull GroupItemInfo groupItemInfo);

    @NonNull
    Holder b(ViewGroup viewGroup, int i);

    void b(@NonNull Holder holder, Child child, int i, @NonNull GroupItemInfo groupItemInfo);

    @NonNull
    Holder c(ViewGroup viewGroup, int i);
}
