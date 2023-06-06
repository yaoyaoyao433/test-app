package com.sankuai.common.utils.shortcut;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortcutInfoBeforeV25 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isAllowDuplicate;
    private Intent launchIntent;
    private int resId;
    private String shortcutName;

    public ShortcutInfoBeforeV25() {
    }

    public String getShortcutName() {
        return this.shortcutName;
    }

    public Intent getLaunchIntent() {
        return this.launchIntent;
    }

    public boolean isAllowDuplicate() {
        return this.isAllowDuplicate;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ShortcutInfoBeforeV25 mInfo;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8914b1594abead4750b8b792f2f2122d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8914b1594abead4750b8b792f2f2122d");
            } else {
                this.mInfo = new ShortcutInfoBeforeV25();
            }
        }

        public Builder duplicate(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "834738ae52c7d9ad56d8efc9e8f720b0", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "834738ae52c7d9ad56d8efc9e8f720b0");
            }
            this.mInfo.isAllowDuplicate = z;
            return this;
        }

        public Builder launchIntent(Intent intent) {
            Object[] objArr = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55d44b295b61ab94aae799a99c55df55", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55d44b295b61ab94aae799a99c55df55");
            }
            this.mInfo.launchIntent = intent;
            return this;
        }

        public Builder resourceId(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "337ea48512b86b78aab419c57c88e7de", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "337ea48512b86b78aab419c57c88e7de");
            }
            this.mInfo.resId = i;
            return this;
        }

        public Builder shortcutName(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c803eca4c3dce7d6e00f0f24a3d5c1aa", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c803eca4c3dce7d6e00f0f24a3d5c1aa");
            }
            this.mInfo.shortcutName = str;
            return this;
        }

        public ShortcutInfoBeforeV25 build() {
            return this.mInfo;
        }
    }

    public static Intent getInstallShortcutIntent(Context context, ShortcutInfoBeforeV25 shortcutInfoBeforeV25) {
        Object[] objArr = {context, shortcutInfoBeforeV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dab25c54a8e228fdd1e19390c7035a1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dab25c54a8e228fdd1e19390c7035a1e");
        }
        if (isValid(shortcutInfoBeforeV25)) {
            Intent intent = new Intent();
            intent.putExtra(ShortcutUtils.EXTRA_DUPLICATE, shortcutInfoBeforeV25.isAllowDuplicate);
            intent.putExtra("android.intent.extra.shortcut.NAME", shortcutInfoBeforeV25.shortcutName);
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, shortcutInfoBeforeV25.resId));
            intent.putExtra("android.intent.extra.shortcut.INTENT", shortcutInfoBeforeV25.launchIntent);
            return intent;
        }
        return null;
    }

    public static boolean isValid(ShortcutInfoBeforeV25 shortcutInfoBeforeV25) {
        Object[] objArr = {shortcutInfoBeforeV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "90b05c276f7dbde672c1fdab47039ee7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "90b05c276f7dbde672c1fdab47039ee7")).booleanValue() : (shortcutInfoBeforeV25 == null || TextUtils.isEmpty(shortcutInfoBeforeV25.shortcutName) || shortcutInfoBeforeV25.launchIntent == null || shortcutInfoBeforeV25.launchIntent.getComponent() == null || TextUtils.isEmpty(shortcutInfoBeforeV25.launchIntent.getAction())) ? false : true;
    }
}
