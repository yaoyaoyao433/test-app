package com.sankuai.meituan.android.knb.listener;

import android.content.Context;
import android.util.Pair;
import com.dianping.titans.widget.DynamicTitleParser;
import com.dianping.titans.widget.LineTitleLayout;
import com.dianping.titans.widget.ZIndexFrameLayout;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnInflateTitleBarListener {
    Pair<LineTitleLayout, ZIndexFrameLayout.LayoutParams> onInflateDynamicTitleBar(Context context, JSONObject jSONObject, DynamicTitleParser.ResourceProvider resourceProvider);
}
