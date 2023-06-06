package com.sankuai.waimai.mach;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachMetaData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("md5")
    private Md5Info md5Info;
    @SerializedName("skipInitProps")
    private boolean skipInitProps;

    public boolean getSkipInitProps() {
        return this.skipInitProps;
    }

    public void setSkipInitProps(boolean z) {
        this.skipInitProps = z;
    }

    public Md5Info getMd5Info() {
        return this.md5Info;
    }

    public void setMd5Info(Md5Info md5Info) {
        this.md5Info = md5Info;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Md5Info {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("app.js")
        private String jsMd5;
        @SerializedName("template.json")
        private String templateMd5;

        public String getJsMd5() {
            return this.jsMd5;
        }

        public void setJsMd5(String str) {
            this.jsMd5 = str;
        }

        public String getTemplateMd5() {
            return this.templateMd5;
        }

        public void setTemplateMd5(String str) {
            this.templateMd5 = str;
        }
    }
}
