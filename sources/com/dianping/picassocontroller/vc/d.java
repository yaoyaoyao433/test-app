package com.dianping.picassocontroller.vc;

import android.app.Activity;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.view.keyboard.PicassoKeyboardCenter;
import com.dianping.picasso.view.keyboard.PicassoSystemKeyBoardObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public PicassoSystemKeyBoardObserver.KeyboardObserver b;
        public PicassoKeyboardCenter.OnKeyBoardChangedListener c;

        public a(Activity activity, g gVar) {
            Object[] objArr = {activity, gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b26fdffa841309e7b8fa9686f8e6a02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b26fdffa841309e7b8fa9686f8e6a02");
                return;
            }
            PicassoKeyboardCenter.resetKeyboardCenter();
            this.b = new PicassoSystemKeyBoardObserver.KeyboardObserver(activity);
            this.c = new C0112a(activity, gVar);
            PicassoKeyboardCenter.addOnKeyBoardChangedListener(this.c);
        }

        /* compiled from: ProGuard */
        /* renamed from: com.dianping.picassocontroller.vc.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0112a implements PicassoKeyboardCenter.OnKeyBoardChangedListener {
            public static ChangeQuickRedirect a;
            private WeakReference<Activity> b;
            private WeakReference<g> c;

            public C0112a(Activity activity, g gVar) {
                Object[] objArr = {activity, gVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a90e88dae3243444ae4caf384d2947", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a90e88dae3243444ae4caf384d2947");
                    return;
                }
                this.b = new WeakReference<>(activity);
                this.c = new WeakReference<>(gVar);
            }

            @Override // com.dianping.picasso.view.keyboard.PicassoKeyboardCenter.OnKeyBoardChangedListener
            public final void onKeyboardChanged(int i) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5473f152453e36aff92ef2abf356a41b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5473f152453e36aff92ef2abf356a41b");
                } else if (this.c.get() == null || this.b.get() == null) {
                } else {
                    this.c.get().a("dispatchOnKeyboardStatusChanged", new JSONBuilder().put("height", Float.valueOf(PicassoUtils.px2dp(this.b.get(), i))).toJSONObject());
                }
            }
        }
    }
}
