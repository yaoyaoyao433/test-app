package com.dianping.imagemanager.animated;

import android.graphics.Bitmap;
import com.dianping.animated.base.AnimatedImageDecoder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    public volatile int b;
    public volatile int c;
    public volatile Thread d;
    private AnimatedImageDecoder e;
    private InterfaceC0075a f;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.animated.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0075a {
        void a();

        void a(Bitmap bitmap);

        void b();

        boolean c();
    }

    public a(AnimatedImageDecoder animatedImageDecoder, int i, InterfaceC0075a interfaceC0075a) {
        Object[] objArr = {animatedImageDecoder, Integer.valueOf(i), interfaceC0075a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ca7c14ad178f0aa6500c1fd59a4e00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ca7c14ad178f0aa6500c1fd59a4e00");
            return;
        }
        this.c = 0;
        this.e = animatedImageDecoder;
        this.b = i;
        this.f = interfaceC0075a;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.animated.a.run():void");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f60185af3207185dd75f65afff3cd02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f60185af3207185dd75f65afff3cd02");
            return;
        }
        this.c = -1;
        if (this.d != null) {
            this.d.interrupt();
            this.d = null;
        }
        this.f = null;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f92fcfb9f3b7e61cc267ef2742f7bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f92fcfb9f3b7e61cc267ef2742f7bf")).booleanValue() : (this.c == -1 || this.f == null || !this.f.c()) ? false : true;
    }
}
