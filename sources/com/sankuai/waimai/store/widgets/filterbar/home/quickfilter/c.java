package com.sankuai.waimai.store.widgets.filterbar.home.quickfilter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c extends com.sankuai.waimai.store.newwidgets.list.b {
    Map<String, Integer> a();

    void a(boolean z, String str, BubbleInfoBean bubbleInfoBean);

    boolean b();

    @NonNull
    List<String> c();

    @NonNull
    com.sankuai.waimai.store.widgets.filterbar.home.model.a d();

    Context getContext();
}
