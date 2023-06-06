package com.sankuai.common.utils.shortcut;

import android.appwidget.AppWidgetProvider;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.shortcut.ShortcutInfoBeforeV25;
import com.sankuai.common.utils.shortcut.ShortcutInfoSinceV25;
import com.sankuai.common.utils.shortcut.ShortcutWidgetInfo;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortcutInfoCompat implements Parcelable {
    public static final Parcelable.Creator<ShortcutInfoCompat> CREATOR = new Parcelable.Creator<ShortcutInfoCompat>() { // from class: com.sankuai.common.utils.shortcut.ShortcutInfoCompat.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortcutInfoCompat createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb51e6e9fdc5323f436f33629bf91d05", RobustBitConfig.DEFAULT_VALUE) ? (ShortcutInfoCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb51e6e9fdc5323f436f33629bf91d05") : new ShortcutInfoCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortcutInfoCompat[] newArray(int i) {
            return new ShortcutInfoCompat[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private String disableMsg;
    private Icon icon;
    private Intent[] intents;
    private boolean isAllowDuplicate;
    private Intent launchIntent;
    private String longLabelV26;
    private Intent oldLaunchIntent;
    private int rank;
    private RemoteViews remoteViews;
    private int resId;
    private String shortLabel;
    private String shortcutId;
    private String shortcutName;
    private String widgetName;
    private Class<? extends AppWidgetProvider> widgetProvider;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShortcutInfoCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb63ce5023851e29f9f58fc511371b89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb63ce5023851e29f9f58fc511371b89");
        } else {
            this.rank = Integer.MAX_VALUE;
        }
    }

    public ShortcutInfoCompat(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80077acac40134222a70d5e9677aeb03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80077acac40134222a70d5e9677aeb03");
            return;
        }
        this.rank = Integer.MAX_VALUE;
        this.shortcutId = parcel.readString();
        this.shortLabel = parcel.readString();
        this.longLabelV26 = parcel.readString();
        this.disableMsg = parcel.readString();
        if (Build.VERSION.SDK_INT >= 25) {
            this.icon = (Icon) parcel.readParcelable(Icon.class.getClassLoader());
        }
        this.intents = (Intent[]) parcel.createTypedArray(Intent.CREATOR);
        this.rank = parcel.readInt();
        this.shortcutName = parcel.readString();
        this.isAllowDuplicate = parcel.readByte() != 0;
        this.launchIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.resId = parcel.readInt();
        this.oldLaunchIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.widgetName = parcel.readString();
        try {
            String readString = parcel.readString();
            if (!TextUtils.isEmpty(readString)) {
                this.widgetProvider = Class.forName(readString);
            }
        } catch (Exception unused) {
            this.widgetProvider = null;
        }
        this.remoteViews = (RemoteViews) parcel.readParcelable(RemoteViews.class.getClassLoader());
    }

    public ShortcutInfoBeforeV25 getShortcutInfoBeforeV25() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47065deb90986d202b7c2749b876cd65", RobustBitConfig.DEFAULT_VALUE) ? (ShortcutInfoBeforeV25) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47065deb90986d202b7c2749b876cd65") : new ShortcutInfoBeforeV25.Builder().shortcutName(this.shortcutName).launchIntent(this.launchIntent).resourceId(this.resId).duplicate(this.isAllowDuplicate).build();
    }

    public ShortcutInfoSinceV25 getShortcutInfoSinceV25() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b2cc2e1615c726734fed7767e7baa26", RobustBitConfig.DEFAULT_VALUE) ? (ShortcutInfoSinceV25) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b2cc2e1615c726734fed7767e7baa26") : new ShortcutInfoSinceV25.Builder().id(this.shortcutId).shortLabel(this.shortLabel).longLabel(this.longLabelV26).disableMsg(this.disableMsg).icon(this.icon).intents(this.intents).rank(this.rank).build();
    }

    public ShortcutWidgetInfo getShortcutWidgetInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a585733b8efb8da2fc729836826c5f4", RobustBitConfig.DEFAULT_VALUE) ? (ShortcutWidgetInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a585733b8efb8da2fc729836826c5f4") : new ShortcutWidgetInfo.Builder().name(this.widgetName).provider(this.widgetProvider).remoteViews(this.remoteViews).build();
    }

    public String getShortcutIdSinceV26() {
        return this.shortcutId;
    }

    public String getShortcutNameBeforeV25() {
        return this.shortcutName;
    }

    public int getResId() {
        return this.resId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d01b910a5231be6269ef8cafc4e81102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d01b910a5231be6269ef8cafc4e81102");
            return;
        }
        parcel.writeString(this.shortcutId);
        parcel.writeString(this.shortLabel);
        parcel.writeString(this.longLabelV26);
        parcel.writeString(this.disableMsg);
        if (Build.VERSION.SDK_INT >= 25) {
            parcel.writeParcelable(this.icon, i);
        }
        parcel.writeTypedArray(this.intents, i);
        parcel.writeInt(this.rank);
        parcel.writeString(this.shortcutName);
        parcel.writeByte(this.isAllowDuplicate ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.launchIntent, i);
        parcel.writeInt(this.resId);
        parcel.writeParcelable(this.oldLaunchIntent, i);
        parcel.writeString(this.widgetName);
        parcel.writeString(this.widgetProvider == null ? "" : this.widgetProvider.getName());
        parcel.writeParcelable(this.remoteViews, i);
    }

    public Intent getOldLaunchIntentBeforeV25() {
        return this.oldLaunchIntent;
    }

    public Intent getLauncherIntentBeforeV25() {
        return this.launchIntent;
    }

    public boolean isAllowDuplicate() {
        return this.isAllowDuplicate;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private ShortcutInfoCompat mInfo;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "582a1eb87909790dec41613a452a8028", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "582a1eb87909790dec41613a452a8028");
            } else {
                this.mInfo = new ShortcutInfoCompat();
            }
        }

        public Builder setDuplicate(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd0d22328656696d96bde5a9ec8bf2e5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd0d22328656696d96bde5a9ec8bf2e5");
            }
            this.mInfo.isAllowDuplicate = z;
            return this;
        }

        public Builder setLaunchIntent(Intent intent) {
            Object[] objArr = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e99ec66d8886bf095c262c3f6449406", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e99ec66d8886bf095c262c3f6449406");
            }
            this.mInfo.launchIntent = intent;
            return this;
        }

        public Builder setShortcutResourceId(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57b733ffafafabe80c9951fa2226ab41", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57b733ffafafabe80c9951fa2226ab41");
            }
            this.mInfo.resId = i;
            return this;
        }

        public Builder setOldLaunchIntent(Intent intent) {
            Object[] objArr = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92cd7dee6b772639a4ce4392df445755", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92cd7dee6b772639a4ce4392df445755");
            }
            this.mInfo.oldLaunchIntent = intent;
            return this;
        }

        public Builder setShortcutName(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bbc04737aa9716bb5443f09b76e39dc", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bbc04737aa9716bb5443f09b76e39dc");
            }
            this.mInfo.shortcutName = str;
            return this;
        }

        public Builder setShortcutId(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a27239951058dd4478897c2aaeaf547", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a27239951058dd4478897c2aaeaf547");
            }
            this.mInfo.shortcutId = str;
            return this;
        }

        public Builder setShortLabel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e65d295b1fe3c110eeeb4b6d88664f0b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e65d295b1fe3c110eeeb4b6d88664f0b");
            }
            this.mInfo.shortLabel = str;
            return this;
        }

        public Builder setLongLabel(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6731df70a6987f1562351ce83f80729", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6731df70a6987f1562351ce83f80729");
            }
            this.mInfo.longLabelV26 = str;
            return this;
        }

        public Builder setIntents(Intent[] intentArr) {
            Object[] objArr = {intentArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ebcc70572abf724ab8b99ee1a3d914b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ebcc70572abf724ab8b99ee1a3d914b");
            }
            this.mInfo.intents = intentArr;
            return this;
        }

        public Builder setRank(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "441cf96b23f5bb6de97eeebeab81e3d3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "441cf96b23f5bb6de97eeebeab81e3d3");
            }
            this.mInfo.rank = i;
            return this;
        }

        public Builder setIcon(Icon icon) {
            Object[] objArr = {icon};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0428d5544b32392668677d4f57e92d45", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0428d5544b32392668677d4f57e92d45");
            }
            this.mInfo.icon = icon;
            return this;
        }

        public Builder setDisableMsg(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af54a0c7fd437a6f870db93d55a39c25", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af54a0c7fd437a6f870db93d55a39c25");
            }
            this.mInfo.disableMsg = str;
            return this;
        }

        public Builder setWidgetName(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69e39a8c362cf1c8dc6b2d6393ddd6f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69e39a8c362cf1c8dc6b2d6393ddd6f6");
            }
            this.mInfo.widgetName = str;
            return this;
        }

        public Builder setWidgetProvider(Class<? extends AppWidgetProvider> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe7c0d39bf394a5d594d6de7a4c05411", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe7c0d39bf394a5d594d6de7a4c05411");
            }
            this.mInfo.widgetProvider = cls;
            return this;
        }

        public Builder setWidgetRemoteViews(RemoteViews remoteViews) {
            Object[] objArr = {remoteViews};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42c34f7f04c463fbe876054b132d57cb", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42c34f7f04c463fbe876054b132d57cb");
            }
            this.mInfo.remoteViews = remoteViews;
            return this;
        }

        public ShortcutInfoCompat build() {
            return this.mInfo;
        }
    }
}
