package com.meituan.msi.api.setting;

import com.google.gson.annotations.SerializedName;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SettingResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AuthSetting authSetting;
    public PersonalizationSetting personalizationSetting;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class AuthSetting {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("scope.address")
        public boolean address;
        @SerializedName("scope.bluetooth")
        public boolean bluetooth;
        @SerializedName("scope.calendar")
        public boolean calendar;
        @SerializedName("scope.camera")
        public boolean camera;
        @SerializedName("scope.clipboard")
        public boolean clipboard;
        @SerializedName("scope.contact")
        public boolean contact;
        @SerializedName("scope.motion")
        public boolean motion;
        @SerializedName("scope.phone")
        public boolean phone;
        @SerializedName("scope.readPhotosAlbum")
        public boolean readPhotosAlbum;
        @SerializedName("scope.record")
        public boolean record;
        @SerializedName("scope.userInfo")
        public boolean userInfo;
        @SerializedName("scope.userLocation")
        public boolean userLocation;
        @SerializedName("scope.userLocationBackground")
        public boolean userLocationBackground;
        @SerializedName("scope.userLocationUpdate")
        public boolean userLocationUpdate;
        @SerializedName("scope.writePhotosAlbum")
        public boolean writePhotosAlbum;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class PersonalizationSetting {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean personalizedAds;
        public boolean personalizedContent;
    }
}
