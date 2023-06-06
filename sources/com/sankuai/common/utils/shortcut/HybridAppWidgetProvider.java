package com.sankuai.common.utils.shortcut;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class HybridAppWidgetProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract Class<? extends AppWidgetProvider> appWidgetProviderClass();

    public abstract RemoteViews appWidgetRemoteViews(Context context, String str, String str2);
}
