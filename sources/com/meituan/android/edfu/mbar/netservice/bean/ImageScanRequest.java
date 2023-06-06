package com.meituan.android.edfu.mbar.netservice.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ImageScanRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String channel;
    private String clientId;
    private String extra;
    private String groupId;
    private Image image;
    private String projectId;
    private String taskId;
    private String traceId;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Image {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String content;
        private String url;

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String getContent() {
            return this.content;
        }

        public void setContent(String str) {
            this.content = str;
        }
    }

    public Image getImage() {
        return this.image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Extra {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String businessID;

        public String getBusinessID() {
            return this.businessID;
        }

        public void setBusinessID(String str) {
            this.businessID = str;
        }
    }
}
