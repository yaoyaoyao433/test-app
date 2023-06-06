package com.meituan.android.ptcommonim.video.play.manager;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.ptcommonim.video.model.VideoPreviewParam;
import com.meituan.android.ptcommonim.video.record.utils.g;
import com.meituan.android.ptcommonim.video.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.d;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final Activity b;
    final VideoPreviewParam c;
    public final com.sankuai.meituan.mtlive.ugc.library.interfaces.c d;
    final Handler e;
    public boolean f;
    public b g;
    public d.c h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(float f);

        void a(int i, String str);
    }

    public a(Activity activity, VideoPreviewParam videoPreviewParam) {
        Object[] objArr = {activity, videoPreviewParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c81c3bf64d18e6b462bf9249afda0a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c81c3bf64d18e6b462bf9249afda0a1");
            return;
        }
        this.e = new Handler(Looper.getMainLooper());
        this.b = activity;
        this.c = videoPreviewParam;
        this.d = com.sankuai.meituan.mtlive.ugc.library.b.c(this.b.getApplicationContext(), 453197);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.video.play.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0358a implements Runnable {
        public static ChangeQuickRedirect a;
        final String b;

        private RunnableC0358a(String str) {
            Object[] objArr = {a.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09022afd6cac8a15f255921f3f1e0f3f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09022afd6cac8a15f255921f3f1e0f3f");
            } else {
                this.b = str;
            }
        }

        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r4v9 */
        @Override // java.lang.Runnable
        public final void run() {
            ?? r4;
            CountDownLatch countDownLatch;
            String str;
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0e9ceb97304880d69890edee3a3087", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0e9ceb97304880d69890edee3a3087");
                return;
            }
            boolean z = a.this.f || a.this.h != null;
            boolean z2 = a.this.c != null && a.this.c.h;
            Activity activity = a.this.b;
            Object[] objArr2 = {activity, PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-4e0dc3a60c94351d"};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f59b5ca9463cd73df35cd4ad152835bb", RobustBitConfig.DEFAULT_VALUE)) {
                r4 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f59b5ca9463cd73df35cd4ad152835bb")).booleanValue();
            } else {
                com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
                r4 = (createPermissionGuard == null || !com.meituan.android.ptcommonim.video.utils.a.a(activity) || createPermissionGuard.a(activity, PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-4e0dc3a60c94351d") <= 0) ? 0 : 1;
            }
            if (z) {
                countDownLatch = r4 != 0 ? new CountDownLatch(2) : new CountDownLatch(1);
            } else {
                countDownLatch = (r4 == 0 || z2) ? null : new CountDownLatch(1);
            }
            CountDownLatch countDownLatch2 = countDownLatch;
            ArrayList arrayList = new ArrayList();
            if (z) {
                str = com.meituan.android.ptcommonim.video.utils.d.b();
                Object[] objArr3 = {this, arrayList, countDownLatch2, Byte.valueOf((byte) r4), str};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                g.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d25c36d281514f80f06e53b2a07bbbfe", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d25c36d281514f80f06e53b2a07bbbfe") : new d(this, arrayList, countDownLatch2, r4, str));
            } else {
                str = this.b;
                if (!z2) {
                    a(countDownLatch2, r4, str);
                }
            }
            if (countDownLatch2 != null) {
                try {
                    countDownLatch2.await();
                } catch (InterruptedException unused) {
                }
            }
            if (z) {
                d.a aVar = (d.a) arrayList.get(0);
                i = aVar != null ? aVar.a : -1;
            } else {
                i = 0;
            }
            a aVar2 = a.this;
            Object[] objArr4 = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "7e6356f7292577b5cad44108326a6259", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "7e6356f7292577b5cad44108326a6259");
            } else if (aVar2.g != null) {
                aVar2.e.post(c.a(aVar2, i, str));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CountDownLatch countDownLatch, boolean z, String str) {
            Object[] objArr = {countDownLatch, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8061102b154c73dc4a6e86e4a4665b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8061102b154c73dc4a6e86e4a4665b0");
            } else if (z) {
                g.a(e.a(str, countDownLatch));
            }
        }
    }
}
