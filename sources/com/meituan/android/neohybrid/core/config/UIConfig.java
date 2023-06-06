package com.meituan.android.neohybrid.core.config;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.neohybrid.util.bean.BaseConfig;
import com.meituan.android.neohybrid.util.bean.Bean;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class UIConfig extends BaseConfig {
    public static final String BACKGROUND_COLOR = "backgroundcolor";
    public static final Parcelable.Creator<UIConfig> CREATOR = new Parcelable.Creator<UIConfig>() { // from class: com.meituan.android.neohybrid.core.config.UIConfig.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UIConfig createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72389006aafa49b97230bd135a477d05", RobustBitConfig.DEFAULT_VALUE) ? (UIConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72389006aafa49b97230bd135a477d05") : new UIConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UIConfig[] newArray(int i) {
            return new UIConfig[i];
        }
    };
    public static final String FULL_SCREEN = "fullscreen";
    public static final String HIDE_TITLE_BAR = "hidetitlebar";
    public static final String IMMERSION = "immersion";
    public static final String MODAL = "modal";
    public static final String PROGRESS_COLOR = "progresscolor";
    public static final String STATUS_BAR_COLOR = "statusbarcolor";
    public static final String TITLE_BAR_COLOR = "titlebarcolor";
    public static final String TRANSPARENT_TITLE_BAR = "transparenttitlebar";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Bean(BACKGROUND_COLOR)
    private String backgroundColor;
    @Bean(defNumBool = 0, value = FULL_SCREEN)
    private boolean fullscreen;
    @Bean(defNumBool = 0, value = HIDE_TITLE_BAR)
    private boolean hideTitleBar;
    @Bean(defNumBool = 0, value = IMMERSION)
    private boolean immersion;
    @Bean(defNumBool = 0, value = TRANSPARENT_TITLE_BAR)
    private boolean isTitleBarTransparent;
    @Bean(defNumBool = 0, value = MODAL)
    private boolean modal;
    @Bean("progresscolor")
    private String progressColor;
    @Bean(STATUS_BAR_COLOR)
    private String statusBarColor;
    @Bean(TITLE_BAR_COLOR)
    private String titleBarColor;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UIConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d9ba8f4d2b3282b1bdc15d0844991c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d9ba8f4d2b3282b1bdc15d0844991c6");
        } else {
            this.progressColor = "#00000000";
        }
    }

    public UIConfig(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f16bbf9cc7e39c216f5bfc1046e001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f16bbf9cc7e39c216f5bfc1046e001");
            return;
        }
        this.progressColor = "#00000000";
        this.statusBarColor = parcel.readString();
        this.titleBarColor = parcel.readString();
        this.progressColor = parcel.readString();
        this.backgroundColor = parcel.readString();
        this.hideTitleBar = parcel.readByte() != 0;
        this.fullscreen = parcel.readByte() != 0;
        this.immersion = parcel.readByte() != 0;
        this.modal = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb9548c387f63b09c60dc3bdd2ab141b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb9548c387f63b09c60dc3bdd2ab141b");
            return;
        }
        parcel.writeString(this.statusBarColor);
        parcel.writeString(this.titleBarColor);
        parcel.writeString(this.progressColor);
        parcel.writeString(this.backgroundColor);
        parcel.writeByte(this.hideTitleBar ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fullscreen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.immersion ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.modal ? (byte) 1 : (byte) 0);
    }

    public String getProgressColor() {
        return this.progressColor;
    }

    public void setProgressColor(String str) {
        this.progressColor = str;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public String getStatusBarColor() {
        return this.statusBarColor;
    }

    public void setStatusBarColor(String str) {
        this.statusBarColor = str;
    }

    public String getTitleBarColor() {
        return this.titleBarColor;
    }

    public void setTitleBarColor(String str) {
        this.titleBarColor = str;
    }

    public boolean isHideTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26c478c72babd7a20410f7fd79c9866a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26c478c72babd7a20410f7fd79c9866a")).booleanValue() : isModal() || this.hideTitleBar;
    }

    public void setHideTitleBar(boolean z) {
        this.hideTitleBar = z;
    }

    public boolean isFullscreen() {
        return this.fullscreen;
    }

    public void setFullscreen(boolean z) {
        this.fullscreen = z;
    }

    @Nullable
    public Integer getBackgroundColorInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46b601a7f5c2d8b7ef8f1c05ea87ce1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46b601a7f5c2d8b7ef8f1c05ea87ce1c");
        }
        String backgroundColor = getBackgroundColor();
        if (TextUtils.isEmpty(backgroundColor)) {
            if (!isModal()) {
                return null;
            }
            backgroundColor = "#00000000";
        }
        try {
            return Integer.valueOf(Color.parseColor(backgroundColor));
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isBackgroundTranslucent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a91eded1e2b155992e9fffdf6c2a3f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a91eded1e2b155992e9fffdf6c2a3f7")).booleanValue();
        }
        Integer backgroundColorInt = getBackgroundColorInt();
        return backgroundColorInt != null && Color.alpha(backgroundColorInt.intValue()) == 0;
    }

    @Nullable
    public Integer getStatusBarColorInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23d11beee3c705ad99e9b1610021e9c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23d11beee3c705ad99e9b1610021e9c5");
        }
        String statusBarColor = getStatusBarColor();
        if (TextUtils.isEmpty(statusBarColor)) {
            return getBackgroundColorInt();
        }
        try {
            return Integer.valueOf(Color.parseColor(statusBarColor));
        } catch (Exception unused) {
            return null;
        }
    }

    public int getTitleBarColorInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bde2f221c0e9994396a645c3be6808b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bde2f221c0e9994396a645c3be6808b9")).intValue();
        }
        try {
            return Color.parseColor(getTitleBarColor());
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean isTitleBarColorSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb591c163ac36854502fb7e73be4c6e1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb591c163ac36854502fb7e73be4c6e1")).booleanValue() : !TextUtils.isEmpty(getTitleBarColor());
    }

    public boolean isImmersion() {
        return this.immersion;
    }

    public void setImmersion(boolean z) {
        this.immersion = z;
    }

    public boolean isModal() {
        return this.modal;
    }

    public void setModal(boolean z) {
        this.modal = z;
    }

    public boolean isTitleBarTransparent() {
        return this.isTitleBarTransparent;
    }

    public void setTitleBarTransparent(boolean z) {
        this.isTitleBarTransparent = z;
    }
}
