package com.meituan.android.customerservice.callkefuuisdk.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSVoIPInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, String> associatedData;
    private String avatarURL;
    private String callStyle;
    private String channel;
    private boolean isShow;
    private short mediaType;
    private String name;
    private String phoneNumber;
    private HashMap<String, String> pointData;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getCallStyle() {
        return this.callStyle;
    }

    public void setCallStyle(String str) {
        this.callStyle = str;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String getAvatarURL() {
        return this.avatarURL;
    }

    public void setAvatarURL(String str) {
        this.avatarURL = str;
    }

    public boolean getIsShow() {
        return this.isShow;
    }

    public void setIsShow(boolean z) {
        this.isShow = z;
    }

    public HashMap<String, String> getAssociatedData() {
        return this.associatedData;
    }

    public void setAssociatedData(HashMap<String, String> hashMap) {
        this.associatedData = hashMap;
    }

    public HashMap<String, String> getPointData() {
        return this.pointData;
    }

    public void setPointData(HashMap<String, String> hashMap) {
        this.pointData = hashMap;
    }

    public void setMediaType(short s) {
        this.mediaType = s;
    }

    public short getMediaType() {
        return this.mediaType;
    }
}
