package com.meituan.android.edfu.cvlog.netservice.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ImageSaveRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String content;
    private String group_id;
    private String meta;
    private String project_id;
    private String session_id;
    private String status;

    public String getProject_id() {
        return this.project_id;
    }

    public void setProject_id(String str) {
        this.project_id = str;
    }

    public String getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(String str) {
        this.group_id = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public void setSession_id(String str) {
        this.session_id = str;
    }

    public String getMeta() {
        return this.meta;
    }

    public void setMeta(String str) {
        this.meta = str;
    }
}
