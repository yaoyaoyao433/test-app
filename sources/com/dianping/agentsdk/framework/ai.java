package com.dianping.agentsdk.framework;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ai extends af {
    float getFooterDividerOffset(int i);

    int getFooterViewType(int i);

    int getFooterViewTypeCount();

    float getHeaderDividerOffset(int i);

    int getHeaderViewType(int i);

    int getHeaderViewTypeCount();

    boolean hasBottomDividerForFooter(int i);

    boolean hasBottomDividerForHeader(int i);

    boolean hasFooterForSection(int i);

    boolean hasHeaderForSection(int i);

    boolean hasTopDividerForHeader(int i);

    View onCreateFooterView(ViewGroup viewGroup, int i);

    View onCreateHeaderView(ViewGroup viewGroup, int i);

    void updateFooterView(View view, int i, ViewGroup viewGroup);

    void updateHeaderView(View view, int i, ViewGroup viewGroup);
}
