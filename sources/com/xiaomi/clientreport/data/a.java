package com.xiaomi.clientreport.data;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.xiaomi.push.av;
/* loaded from: classes6.dex */
public final class a {
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    private String g;

    /* renamed from: com.xiaomi.clientreport.data.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1516a {
        int a = -1;
        int b = -1;
        int c = -1;
        public String d = null;
        public long e = -1;
        public long f = -1;
        public long g = -1;

        public final C1516a a(boolean z) {
            this.a = z ? 1 : 0;
            return this;
        }

        public final a a(Context context) {
            return new a(context, this);
        }

        public final C1516a b(boolean z) {
            this.b = z ? 1 : 0;
            return this;
        }

        public final C1516a c(boolean z) {
            this.c = z ? 1 : 0;
            return this;
        }
    }

    private a() {
        this.a = true;
        this.b = false;
        this.c = false;
        this.d = 1048576L;
        this.e = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
        this.f = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
    }

    public final String toString() {
        return "Config{mEventEncrypted=" + this.a + ", mAESKey='" + this.g + "', mMaxFileLength=" + this.d + ", mEventUploadSwitchOpen=" + this.b + ", mPerfUploadSwitchOpen=" + this.c + ", mEventUploadFrequency=" + this.e + ", mPerfUploadFrequency=" + this.f + '}';
    }

    private a(Context context, C1516a c1516a) {
        this.a = true;
        this.b = false;
        this.c = false;
        this.d = 1048576L;
        this.e = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
        this.f = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
        if (c1516a.a == 0) {
            this.a = false;
        } else {
            int i = c1516a.a;
            this.a = true;
        }
        this.g = !TextUtils.isEmpty(c1516a.d) ? c1516a.d : av.a(context);
        this.d = c1516a.e > -1 ? c1516a.e : 1048576L;
        if (c1516a.f > -1) {
            this.e = c1516a.f;
        } else {
            this.e = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
        }
        if (c1516a.g > -1) {
            this.f = c1516a.g;
        } else {
            this.f = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
        }
        if (c1516a.b == 0 || c1516a.b != 1) {
            this.b = false;
        } else {
            this.b = true;
        }
        if (c1516a.c == 0 || c1516a.c != 1) {
            this.c = false;
        } else {
            this.c = true;
        }
    }
}
