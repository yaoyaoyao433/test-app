package com.dianping.portal.feature;

import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface i {
    void addRightViewItem(View view, String str, View.OnClickListener onClickListener);

    View findRightViewItemByTag(String str);

    void hideTitlebar();

    void removeAllRightViewItem();

    void removeRightViewItem(String str);

    void setBarSubtitle(CharSequence charSequence);

    void setBarTitle(CharSequence charSequence);

    void setShowLeftButton(boolean z);

    void setShowRightButton(boolean z);

    void setTitleCustomView(View view);

    void setTitleCustomView(View view, boolean z, boolean z2);

    void setTitlebarBackground(Drawable drawable);

    void showTitlebar();
}
