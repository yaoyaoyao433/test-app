package com.sankuai.common.utils.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortcutInfoSinceV25 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String disableMsg;
    private Icon icon;
    private String id;
    private Intent[] intents;
    private String longLabel;
    private int rank;
    private String shortLabel;

    public ShortcutInfoSinceV25() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29c34d8bbb99323f972c3c2529166a12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29c34d8bbb99323f972c3c2529166a12");
        } else {
            this.rank = Integer.MAX_VALUE;
        }
    }

    public String getId() {
        return this.id;
    }

    public String getShortLabel() {
        return this.shortLabel;
    }

    public String getLongLabel() {
        return this.longLabel;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public Intent[] getIntents() {
        return this.intents;
    }

    public int getRank() {
        return this.rank;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ShortcutInfoSinceV25 mInfo;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dde1954befc294ad7b4aac4c131cebdf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dde1954befc294ad7b4aac4c131cebdf");
            } else {
                this.mInfo = new ShortcutInfoSinceV25();
            }
        }

        public Builder id(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1570593d2116db51efdbceb120a350a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1570593d2116db51efdbceb120a350a");
            }
            this.mInfo.id = str;
            return this;
        }

        public Builder shortLabel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b0da2aa3dfc28b58f23f623ab75971", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b0da2aa3dfc28b58f23f623ab75971");
            }
            this.mInfo.shortLabel = str;
            return this;
        }

        public Builder longLabel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b0589d9b52229948fcc72f643caf8b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b0589d9b52229948fcc72f643caf8b");
            }
            this.mInfo.longLabel = str;
            return this;
        }

        public Builder intents(Intent[] intentArr) {
            Object[] objArr = {intentArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aed3eaeff78813e5006299973b5c5aa7", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aed3eaeff78813e5006299973b5c5aa7");
            }
            this.mInfo.intents = intentArr;
            return this;
        }

        public Builder rank(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "120ee246eaf70a6a61625a0c87b32bc9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "120ee246eaf70a6a61625a0c87b32bc9");
            }
            this.mInfo.rank = i;
            return this;
        }

        public Builder icon(Icon icon) {
            Object[] objArr = {icon};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "833fbd8cc1dfb0646d7231e401ca2c4e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "833fbd8cc1dfb0646d7231e401ca2c4e");
            }
            this.mInfo.icon = icon;
            return this;
        }

        public Builder disableMsg(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68c567b033e79e7adb8265e4324c6cb5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68c567b033e79e7adb8265e4324c6cb5");
            }
            this.mInfo.disableMsg = str;
            return this;
        }

        public ShortcutInfoSinceV25 build() {
            return this.mInfo;
        }
    }

    @RequiresApi(api = 25)
    public static ShortcutInfo convert(Context context, ShortcutInfoSinceV25 shortcutInfoSinceV25) {
        Object[] objArr = {context, shortcutInfoSinceV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f408ee036b107b5be6b6c6c691cd84cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f408ee036b107b5be6b6c6c691cd84cd");
        }
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, shortcutInfoSinceV25.id);
        if (shortcutInfoSinceV25.icon != null) {
            builder.setIcon(shortcutInfoSinceV25.icon);
        }
        if (!TextUtils.isEmpty(shortcutInfoSinceV25.shortLabel)) {
            builder.setShortLabel(shortcutInfoSinceV25.shortLabel);
        }
        if (!TextUtils.isEmpty(shortcutInfoSinceV25.longLabel)) {
            builder.setLongLabel(shortcutInfoSinceV25.longLabel);
        }
        if (!TextUtils.isEmpty(shortcutInfoSinceV25.disableMsg)) {
            builder.setDisabledMessage(shortcutInfoSinceV25.disableMsg);
        }
        if (shortcutInfoSinceV25.rank >= 0) {
            builder.setRank(shortcutInfoSinceV25.rank);
        } else {
            builder.setRank(0);
        }
        builder.setIntents(shortcutInfoSinceV25.intents);
        return builder.build();
    }

    public static boolean isValid(ShortcutInfoSinceV25 shortcutInfoSinceV25) {
        Object[] objArr = {shortcutInfoSinceV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c1c9b7096223e8902fb75f4412c71a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c1c9b7096223e8902fb75f4412c71a8")).booleanValue();
        }
        if (shortcutInfoSinceV25 == null || TextUtils.isEmpty(shortcutInfoSinceV25.id)) {
            return false;
        }
        return ((TextUtils.isEmpty(shortcutInfoSinceV25.shortLabel) && TextUtils.isEmpty(shortcutInfoSinceV25.longLabel)) || shortcutInfoSinceV25.icon == null || shortcutInfoSinceV25.intents == null || shortcutInfoSinceV25.intents.length == 0) ? false : true;
    }
}
