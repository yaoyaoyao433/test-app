package com.dianping.imagemanager.image.loader;

import android.os.SystemClock;
import com.dianping.imagemanager.image.loader.a;
import com.dianping.imagemanager.utils.downloadphoto.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<Request extends com.dianping.imagemanager.utils.downloadphoto.a, Session extends a<Request>> implements Runnable {
    public final Session a;
    protected long b = SystemClock.elapsedRealtime();

    public b(Session session) {
        this.a = session;
    }
}
