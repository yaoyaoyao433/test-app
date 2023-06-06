package com.sankuai.common.utils.shortcut;

import android.appwidget.AppWidgetProvider;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortcutWidgetInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;
    private Class<? extends AppWidgetProvider> provider;
    private RemoteViews remoteViews;

    public String getName() {
        return this.name;
    }

    public Class<? extends AppWidgetProvider> getProvider() {
        return this.provider;
    }

    public RemoteViews getRemoteViews() {
        return this.remoteViews;
    }

    public static boolean isValidForAdding(ShortcutWidgetInfo shortcutWidgetInfo) {
        Object[] objArr = {shortcutWidgetInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66c33d6355fc4a8f1a5b30b86bda5d0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66c33d6355fc4a8f1a5b30b86bda5d0d")).booleanValue() : (shortcutWidgetInfo == null || TextUtils.isEmpty(shortcutWidgetInfo.name) || shortcutWidgetInfo.provider == null) ? false : true;
    }

    public static boolean isValidForUpdating(ShortcutWidgetInfo shortcutWidgetInfo) {
        Object[] objArr = {shortcutWidgetInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b936de7cb17a0e82a7ab08563fa54ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b936de7cb17a0e82a7ab08563fa54ac")).booleanValue() : (shortcutWidgetInfo == null || shortcutWidgetInfo.provider == null || shortcutWidgetInfo.remoteViews == null) ? false : true;
    }

    public static boolean isValidForQuerying(ShortcutWidgetInfo shortcutWidgetInfo) {
        return (shortcutWidgetInfo == null || shortcutWidgetInfo.provider == null) ? false : true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ShortcutWidgetInfo widget;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1597dc9dcee20f7ef0871303b186ca03", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1597dc9dcee20f7ef0871303b186ca03");
            } else {
                this.widget = new ShortcutWidgetInfo();
            }
        }

        public Builder name(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87bbee776e45237ac98b34e86001c47f", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87bbee776e45237ac98b34e86001c47f");
            }
            this.widget.name = str;
            return this;
        }

        public Builder provider(Class<? extends AppWidgetProvider> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99ca328b598bc937c72bfe6fded14424", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99ca328b598bc937c72bfe6fded14424");
            }
            this.widget.provider = cls;
            return this;
        }

        public Builder remoteViews(RemoteViews remoteViews) {
            Object[] objArr = {remoteViews};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e47b1881e621ea4322b62b76e69b666", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e47b1881e621ea4322b62b76e69b666");
            }
            this.widget.remoteViews = remoteViews;
            return this;
        }

        public ShortcutWidgetInfo build() {
            return this.widget;
        }
    }
}
