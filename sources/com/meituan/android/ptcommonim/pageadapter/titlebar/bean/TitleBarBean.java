package com.meituan.android.ptcommonim.pageadapter.titlebar.bean;

import android.support.annotation.DrawableRes;
import android.support.annotation.Keep;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.event.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class TitleBarBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String labelIconUrl;
    public Map<String, Object> machDataMap;
    public MachInfo machInfo;
    public final String mainTitle;
    public final List<TitleIcon> rightIconList;
    public String subTitle;
    public String subTitle2;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class TitleIcon {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final c clickCallback;
        @DrawableRes
        public final int drawableId;
        public final String imgUrl;
        public final String title;

        public TitleIcon(String str, int i, String str2, c cVar) {
            this.title = str;
            this.imgUrl = str2;
            this.clickCallback = cVar;
            this.drawableId = i == 0 ? 0 : i;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;
            private c clickCallback;
            @DrawableRes
            private int drawableId;
            private String imgUrl;
            private String title;

            public Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Builder setImgUrl(String str) {
                this.imgUrl = str;
                return this;
            }

            public Builder setDrawableId(int i) {
                this.drawableId = i;
                return this;
            }

            public Builder setClickCallback(c cVar) {
                this.clickCallback = cVar;
                return this;
            }

            public TitleIcon build() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a93acd4698de7295167e036a71f235f4", RobustBitConfig.DEFAULT_VALUE) ? (TitleIcon) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a93acd4698de7295167e036a71f235f4") : new TitleIcon(this.title, this.drawableId, this.imgUrl, this.clickCallback);
            }
        }
    }

    public TitleBarBean(String str, String str2, List<TitleIcon> list, String str3, String str4, Map<String, Object> map, MachInfo machInfo) {
        this.mainTitle = str;
        this.labelIconUrl = str2;
        this.rightIconList = list;
        this.subTitle = str3;
        this.subTitle2 = str4;
        this.machDataMap = map;
        this.machInfo = machInfo;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String labelIconUrl;
        private Map<String, Object> machDataMap;
        private MachInfo machInfo;
        private String mainTitle;
        private List<TitleIcon> rightIconList;
        private String subTitle;
        private String subTitle2;

        public Builder setMainTitle(String str) {
            this.mainTitle = str;
            return this;
        }

        public Builder setLabelIconUrl(String str) {
            this.labelIconUrl = str;
            return this;
        }

        public Builder setRightIconList(List<TitleIcon> list) {
            this.rightIconList = list;
            return this;
        }

        public Builder setSubTitle(String str) {
            this.subTitle = str;
            return this;
        }

        public Builder setSubTitle2(String str) {
            this.subTitle2 = str;
            return this;
        }

        public Builder setMachData(Map<String, Object> map) {
            this.machDataMap = map;
            return this;
        }

        public Builder setMachInfo(MachInfo machInfo) {
            this.machInfo = machInfo;
            return this;
        }

        public TitleBarBean build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9c81d67568e422c5b61a21c27fb4993", RobustBitConfig.DEFAULT_VALUE) ? (TitleBarBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9c81d67568e422c5b61a21c27fb4993") : new TitleBarBean(this.mainTitle, this.labelIconUrl, this.rightIconList, this.subTitle, this.subTitle2, this.machDataMap, this.machInfo);
        }
    }
}
