package com.dianping.video.model;

import com.dianping.video.videofilter.gpuimage.n;
import com.dianping.video.videofilter.gpuimage.o;
import com.dianping.video.videofilter.gpuimage.p;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a = null;
    private static final long serialVersionUID = 1;
    public int b;
    public int c;
    public int d;
    public int e;
    public Class<? extends com.dianping.video.videofilter.gpuimage.f> f;

    public final int a() {
        if (this.f == p.class) {
            this.f = null;
            this.e = 1;
        } else if (this.f == o.class) {
            this.f = null;
            this.e = 2;
        } else if (this.f == n.class) {
            this.f = null;
            this.e = 3;
        }
        return this.e;
    }
}
