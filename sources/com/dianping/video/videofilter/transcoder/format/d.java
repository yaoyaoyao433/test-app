package com.dianping.video.videofilter.transcoder.format;

import android.media.MediaFormat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d {
    public static ChangeQuickRedirect e;
    public boolean f;
    protected boolean g;

    public abstract MediaFormat a(MediaFormat mediaFormat, int i);

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04e9624af52c4dc6b9fa2a6eaff9c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04e9624af52c4dc6b9fa2a6eaff9c2b");
            return;
        }
        this.f = true;
        this.g = false;
    }

    public final boolean a() {
        return this.g;
    }
}
