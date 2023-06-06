package com.meituan.android.paycommon.lib.utils;

import android.os.Handler;
import android.os.Message;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public boolean b;
    public b c;
    public long d;
    public a e;
    public List<Call> f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        Call a();

        void b();
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0eca6e6d28b239b702b67b59741dd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0eca6e6d28b239b702b67b59741dd0");
        } else {
            this.b = false;
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4923ca28173ca2901f056199b86491f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4923ca28173ca2901f056199b86491f");
        } else if (!this.b) {
            this.b = true;
            if (this.e != null) {
                this.e.removeCallbacksAndMessages(null);
                this.e = null;
            }
            if (this.f != null) {
                for (Call call : this.f) {
                    if (call != null && !call.c()) {
                        call.cancel();
                    }
                }
                this.f.clear();
                this.f = null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<g> b;

        public a(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e78cc2eda45fc49b12b9b325008d1a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e78cc2eda45fc49b12b9b325008d1a");
            } else {
                this.b = new WeakReference<>(gVar);
            }
        }

        @Override // android.os.Handler
        @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "415b868252f80704c6210934ab4fafa4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "415b868252f80704c6210934ab4fafa4");
                return;
            }
            super.handleMessage(message);
            g gVar = this.b.get();
            if (gVar == null) {
                return;
            }
            Object[] objArr2 = {message};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "6755efd0bca98ad3a2963ed35a65af13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "6755efd0bca98ad3a2963ed35a65af13");
            } else if (gVar.e == null || gVar.b || gVar.c == null) {
                gVar.cancel();
            } else if (message.what == 1) {
                Call a2 = gVar.c.a();
                if (gVar.f == null) {
                    gVar.f = new ArrayList();
                }
                gVar.f.add(a2);
                gVar.e.sendEmptyMessageDelayed(1, gVar.d);
            } else if (message.what == 2) {
                gVar.e.removeMessages(1);
                gVar.cancel();
                gVar.c.b();
            }
        }
    }
}
