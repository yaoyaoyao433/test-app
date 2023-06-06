package com.meituan.msi.page;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IPage {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface VIEW_TYPE {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public boolean a;
    }

    View findView(int i, a aVar);

    View getAndCreateView(int i, String str, f fVar);

    c getKeyBoard();

    String getPagePath();

    e getViewGroup();

    void hideView(int i, View view, a aVar);

    void showView(int i, View view, a aVar);
}
