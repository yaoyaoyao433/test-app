package com.sankuai.waimai.reactnative.pullfresh;

import android.os.Handler;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final Handler b;
    int c;
    ImageView d;
    List<Integer> e;
    Timer f;
    C1120a g;
    int h;
    boolean i;
    final Runnable j;
    final Runnable k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831b35880ca0d52d366ee30f02a83a2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831b35880ca0d52d366ee30f02a83a2e");
            return;
        }
        this.b = new Handler();
        this.c = 244;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.i = false;
        this.j = new Runnable() { // from class: com.sankuai.waimai.reactnative.pullfresh.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12e1abaebbdc9a02c7cedb2fb608d393", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12e1abaebbdc9a02c7cedb2fb608d393");
                } else if (a.this.h < 0 || a.this.h >= a.this.e.size() || a.this.c != 244) {
                } else {
                    a.this.d.setImageResource(a.this.e.get(a.this.h).intValue());
                    a.this.h++;
                }
            }
        };
        this.k = new Runnable() { // from class: com.sankuai.waimai.reactnative.pullfresh.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbaf5413386cf31937f48a732430e4e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbaf5413386cf31937f48a732430e4e9");
                } else if (a.this.g != null) {
                    a.this.h = 0;
                    a.this.f.purge();
                    a.this.g.cancel();
                    a.this.c = TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK;
                    a.this.g = null;
                    a.this.d.setImageResource(0);
                }
            }
        };
        this.f = new Timer();
    }

    public final void a(ImageView imageView, List<Integer> list) {
        this.d = imageView;
        this.e = list;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be12ab6fd1f6390c2e8f652a585ec3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be12ab6fd1f6390c2e8f652a585ec3c0");
            return;
        }
        if (this.g != null) {
            this.h = 0;
            this.c = TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK;
            this.f.purge();
            this.g.cancel();
            this.g = null;
            this.d.setBackgroundResource(0);
        }
        this.b.removeCallbacks(this.j);
        this.b.removeCallbacks(this.k);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.reactnative.pullfresh.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1120a extends TimerTask {
        public static ChangeQuickRedirect a;

        public C1120a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60dc9082df7a09ab1549072d6572a9b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60dc9082df7a09ab1549072d6572a9b5");
            } else if (a.this.h < 0 || a.this.c == 243) {
            } else {
                if (a.this.h < a.this.e.size()) {
                    a.this.b.post(a.this.j);
                    return;
                }
                a.this.h = 0;
                if (a.this.i) {
                    return;
                }
                a.this.b.post(a.this.k);
            }
        }
    }
}
