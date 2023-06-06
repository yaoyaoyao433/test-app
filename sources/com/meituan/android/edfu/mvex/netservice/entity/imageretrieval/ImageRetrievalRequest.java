package com.meituan.android.edfu.mvex.netservice.entity.imageretrieval;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ImageRetrievalRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String clientId;
    private String extra;
    private String groupId;
    private ImageBody image;
    private String projectId;
    private String sessionId;
    private String traceId;

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

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public ImageBody getImage() {
        return this.image;
    }

    public void setImage(ImageBody imageBody) {
        this.image = imageBody;
    }
}
