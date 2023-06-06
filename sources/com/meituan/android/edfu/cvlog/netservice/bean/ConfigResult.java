package com.meituan.android.edfu.cvlog.netservice.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ConfigResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String message;
    private Config result;

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public Config getResult() {
        return this.result;
    }

    public void setResult(Config config) {
        this.result = config;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int imageheight;
        private int imagequality;
        private int imagewidth;
        private int interval;
        private int maxframe;
        private int timeout;
        private boolean upload;

        public Config() {
        }

        public int getTimeout() {
            return this.timeout;
        }

        public void setTimeout(int i) {
            this.timeout = i;
        }

        public int getInterval() {
            return this.interval;
        }

        public void setInterval(int i) {
            this.interval = i;
        }

        public int getMaxframe() {
            return this.maxframe;
        }

        public void setMaxframe(int i) {
            this.maxframe = i;
        }

        public int getImagewidth() {
            return this.imagewidth;
        }

        public void setImagewidth(int i) {
            this.imagewidth = i;
        }

        public int getImageheight() {
            return this.imageheight;
        }

        public void setImageheight(int i) {
            this.imageheight = i;
        }

        public int getImagequality() {
            return this.imagequality;
        }

        public void setImagequality(int i) {
            this.imagequality = i;
        }

        public boolean getUpload() {
            return this.upload;
        }

        public void setUpload(boolean z) {
            this.upload = z;
        }
    }
}
