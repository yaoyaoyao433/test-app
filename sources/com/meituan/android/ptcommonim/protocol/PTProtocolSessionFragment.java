package com.meituan.android.ptcommonim.protocol;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.android.ptcommonim.PTIMMgeBean;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTProtocolSessionFragment extends SessionFragment {
    public static ChangeQuickRedirect g;
    private com.sankuai.xm.imui.session.b a;
    private boolean b;
    private long c;
    private String d;
    private Runnable e;
    private final Handler f;
    protected PTIMMgeBean h;
    private final ViewTreeObserver.OnScrollChangedListener i;

    public PTProtocolSessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac67d69e1d1d73eb67e90501149767f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac67d69e1d1d73eb67e90501149767f");
            return;
        }
        this.b = false;
        this.d = "";
        this.e = b.a(this);
        this.f = new Handler(Looper.getMainLooper());
        this.i = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.meituan.android.ptcommonim.protocol.PTProtocolSessionFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84fde30756ff6fbf2c968eba0cdefffc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84fde30756ff6fbf2c968eba0cdefffc");
                    return;
                }
                PTProtocolSessionFragment.this.f.removeCallbacks(PTProtocolSessionFragment.this.e);
                if (!PTProtocolSessionFragment.this.b) {
                    PTProtocolSessionFragment.a(PTProtocolSessionFragment.this, true);
                    PTProtocolSessionFragment.this.c = SystemClock.elapsedRealtime();
                    Metrics metrics = Metrics.getInstance();
                    metrics.startCustomFPS("ptim_im_scroll_fps_" + ((int) PTProtocolSessionFragment.this.t()));
                }
                PTProtocolSessionFragment.this.f.postDelayed(PTProtocolSessionFragment.this.e, 80L);
            }
        };
    }

    public static /* synthetic */ boolean a(PTProtocolSessionFragment pTProtocolSessionFragment, boolean z) {
        pTProtocolSessionFragment.b = true;
        return true;
    }

    public static /* synthetic */ void a(PTProtocolSessionFragment pTProtocolSessionFragment) {
        Object[] objArr = {pTProtocolSessionFragment};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a651920b853d27689f0746cae56f581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a651920b853d27689f0746cae56f581");
            return;
        }
        pTProtocolSessionFragment.b = false;
        if (SystemClock.elapsedRealtime() - pTProtocolSessionFragment.c > 160) {
            Metrics metrics = Metrics.getInstance();
            metrics.stopCustomFPS("ptim_im_scroll_fps_" + ((int) pTProtocolSessionFragment.t()));
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a46acdda7c9c30d586d2c6250ccb2a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a46acdda7c9c30d586d2c6250ccb2a14");
            return;
        }
        super.onCreate(bundle);
        this.a = com.sankuai.xm.imui.session.b.b(getContext());
        this.h = (PTIMMgeBean) SessionParams.a(getContext()).a().getParcelable("pt_im_info");
        if ((this.h == null || TextUtils.isEmpty(this.h.b)) && "meituaninternaltest".equals(com.meituan.android.base.a.f)) {
            throw new RuntimeException("缺少平台埋点参数");
        }
        GetUUID.getInstance().getUUID(getContext(), c.a(this));
    }

    public static /* synthetic */ void a(PTProtocolSessionFragment pTProtocolSessionFragment, Context context, String str) {
        Object[] objArr = {pTProtocolSessionFragment, context, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5dd5515a38c9c93be4bb871ed214f0a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5dd5515a38c9c93be4bb871ed214f0a4");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            pTProtocolSessionFragment.d = str;
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc94b95ffaa304f0a6467e1222dbc49", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc94b95ffaa304f0a6467e1222dbc49");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            onCreateView.getViewTreeObserver().addOnScrollChangedListener(this.i);
        }
        return onCreateView;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da409186a7cdd81f17bf595d945a61b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da409186a7cdd81f17bf595d945a61b2");
            return;
        }
        super.onResume();
        Metrics metrics = Metrics.getInstance();
        metrics.startCustomFPS("ptim_im_static_fps_" + ((int) t()));
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e503ee0e66e740d6aa866681e37b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e503ee0e66e740d6aa866681e37b66");
            return;
        }
        super.onPause();
        Metrics metrics = Metrics.getInstance();
        metrics.stopCustomFPS("ptim_im_static_fps_" + ((int) t()));
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34cb2f485c8cd12e333bdb41cacb5381", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34cb2f485c8cd12e333bdb41cacb5381")).booleanValue();
        }
        if (bVar != null) {
            try {
                Context a = com.meituan.android.singleton.b.a();
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject();
                PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
                if (packageInfo != null) {
                    jSONObject.put("fromVersion", packageInfo.versionName);
                }
                jSONObject.put("fromPlatform", "android");
                jSONObject.put("fromUuid", this.d);
                jSONObject.put("buId", this.h != null ? this.h.b : "");
                hashMap.put("platformExtension", jSONObject);
                if (bVar.a() != null) {
                    bVar.a().appendExtension(hashMap);
                }
            } catch (Throwable unused) {
            }
        }
        return super.a(bVar);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment
    public boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        SessionId f;
        SessionId f2;
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c01c3d01598f5fa1ebc8919dd4e8559", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c01c3d01598f5fa1ebc8919dd4e8559")).booleanValue();
        }
        if (bVar != null) {
            if (bVar.a() instanceof GeneralMessage) {
                short channel = ((GeneralMessage) bVar.a()).getChannel();
                if (channel == 0 && (f2 = com.sankuai.xm.imui.b.a().f()) != null) {
                    channel = f2.d();
                }
                if (i == 0) {
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_post_general_msg_" + ((int) channel), "ptim_post_general_msg_success");
                } else if (i == 10024) {
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_post_general_msg_" + ((int) channel), "ptim_post_general_msg_not_limit", "General消息体超出限制");
                } else {
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_post_general_msg_" + ((int) channel), "ptim_post_general_msg_other_error_" + i, "其他发送错误");
                }
            } else {
                short channel2 = bVar.a().getChannel();
                if (channel2 == 0 && (f = com.sankuai.xm.imui.b.a().f()) != null) {
                    channel2 = f.d();
                }
                if (i == 0) {
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_post_all_msg_" + ((int) channel2), "ptim_post_all_msg_success");
                } else {
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_post_all_msg_" + ((int) channel2), "ptim_post_all_msg_fail_" + i, "消息发送失败");
                }
            }
        }
        return super.a(i, bVar);
    }
}
