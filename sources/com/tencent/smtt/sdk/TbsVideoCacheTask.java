package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.tencent.smtt.export.external.DexLoader;
/* loaded from: classes6.dex */
public class TbsVideoCacheTask {
    public static final String KEY_VIDEO_CACHE_PARAM_FILENAME = "filename";
    public static final String KEY_VIDEO_CACHE_PARAM_FOLDERPATH = "folderPath";
    public static final String KEY_VIDEO_CACHE_PARAM_HEADER = "header";
    public static final String KEY_VIDEO_CACHE_PARAM_URL = "url";
    Context a;
    TbsVideoCacheListener b;
    private String e;
    private String f;
    private boolean c = false;
    private r d = null;
    private Object g = null;

    public TbsVideoCacheTask(Context context, Bundle bundle, TbsVideoCacheListener tbsVideoCacheListener) {
        this.a = null;
        this.b = null;
        this.a = context;
        this.b = tbsVideoCacheListener;
        if (bundle != null) {
            this.e = bundle.getString(ResponseWithInnerData.TASK_ID);
            this.f = bundle.getString("url");
        }
        a(bundle);
    }

    private void a(Bundle bundle) {
        DexLoader dexLoader;
        if (this.d == null) {
            g.a(true).a(this.a, false, false);
            v a = g.a(true).a();
            if (a != null) {
                dexLoader = a.b();
            } else {
                this.b.onVideoDownloadError(this, -1, "init engine error!", null);
                dexLoader = null;
            }
            if (dexLoader != null) {
                this.d = new r(dexLoader);
            } else {
                this.b.onVideoDownloadError(this, -1, "Java dexloader invalid!", null);
            }
        }
        if (this.d == null) {
            if (this.b != null) {
                this.b.onVideoDownloadError(this, -1, "init error!", null);
                return;
            }
            return;
        }
        this.g = this.d.a(this.a, this, bundle);
        if (this.g == null) {
            this.b.onVideoDownloadError(this, -1, "init task error!", null);
        }
    }

    public long getContentLength() {
        if (this.d == null || this.g == null) {
            if (this.b != null) {
                this.b.onVideoDownloadError(this, -1, "getContentLength failed, init uncompleted!", null);
                return 0L;
            }
            return 0L;
        }
        return this.d.d();
    }

    public int getDownloadedSize() {
        if (this.d == null || this.g == null) {
            if (this.b != null) {
                this.b.onVideoDownloadError(this, -1, "getDownloadedSize failed, init uncompleted!", null);
                return 0;
            }
            return 0;
        }
        return this.d.e();
    }

    public int getProgress() {
        if (this.d == null || this.g == null) {
            if (this.b != null) {
                this.b.onVideoDownloadError(this, -1, "getProgress failed, init uncompleted!", null);
                return 0;
            }
            return 0;
        }
        return this.d.f();
    }

    public String getTaskID() {
        return this.e;
    }

    public String getTaskUrl() {
        return this.f;
    }

    public void pauseTask() {
        if (this.d != null && this.g != null) {
            this.d.a();
        } else if (this.b != null) {
            this.b.onVideoDownloadError(this, -1, "pauseTask failed, init uncompleted!", null);
        }
    }

    public void removeTask(boolean z) {
        if (this.d != null && this.g != null) {
            this.d.a(z);
        } else if (this.b != null) {
            this.b.onVideoDownloadError(this, -1, "removeTask failed, init uncompleted!", null);
        }
    }

    public void resumeTask() {
        if (this.d != null && this.g != null) {
            this.d.b();
        } else if (this.b != null) {
            this.b.onVideoDownloadError(this, -1, "resumeTask failed, init uncompleted!", null);
        }
    }

    public void stopTask() {
        if (this.d != null && this.g != null) {
            this.d.c();
        } else if (this.b != null) {
            this.b.onVideoDownloadError(this, -1, "stopTask failed, init uncompleted!", null);
        }
    }
}
