package com.sankuai.titans.base.titlebar;

import android.content.Context;
import android.util.Pair;
import com.sankuai.titans.base.titlebar.DynamicTitleParser;
import com.sankuai.titans.base.titlebar.ZIndexFrameLayout;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnInflateTitleBarListener {
    Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> onInflateDynamicTitleBar(Context context, DynamicTitleBarEntity dynamicTitleBarEntity, DynamicTitleParser.ResourceProvider resourceProvider);
}
