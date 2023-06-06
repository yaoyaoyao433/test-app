package com.sankuai.xm.imui.session;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.b;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.base.BaseFragment;
import com.sankuai.xm.imui.base.PageSpeedLinearLayout;
import com.sankuai.xm.imui.common.adapter.DefaultMsgListAdapter;
import com.sankuai.xm.imui.common.adapter.DialogModeSupportable;
import com.sankuai.xm.imui.common.adapter.GroupAnnouncementAdapter;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.adapter.IMsgListAdapter;
import com.sankuai.xm.imui.common.adapter.IPageEventAdapter;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.util.f;
import com.sankuai.xm.imui.common.util.i;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.pulltorefresh.PullToRefreshListView;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
import com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import com.sankuai.xm.imui.common.widget.WidgetPanel;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.event.e;
import com.sankuai.xm.imui.session.view.AudioMsgView;
import com.sankuai.xm.imui.session.view.BaseCommonView;
import com.sankuai.xm.imui.session.view.MediaMsgView;
import com.sankuai.xm.imui.session.view.MsgViewAdapterDecorator;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
import com.sankuai.xm.imui.session.widget.MsgListFooterWidgetPenal;
import com.sankuai.xm.imui.session.widget.g;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import com.sankuai.xm.ui.service.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SessionFragment extends BaseFragment implements com.sankuai.xm.imui.session.a, c.b {
    public static ChangeQuickRedirect q;
    private IBannerAdapter A;
    private Runnable B;
    private com.sankuai.xm.imui.theme.b C;
    private ContextWrapper D;
    private float a;
    private float b;
    private SessionId c;
    private MsgViewAdapterDecorator d;
    private ISendPanelAdapter e;
    private View f;
    private g g;
    private MsgListFooterWidgetPenal h;
    private TitleBarAdapter i;
    private ViewGroup j;
    private ViewGroup k;
    private d l;
    private com.sankuai.xm.imui.session.presenter.a m;
    public com.sankuai.xm.imui.session.b r;
    public String s;
    protected SessionParams t;
    public c.a u;
    public SendPanel v;
    protected PullToRefreshListView w;
    Runnable x;
    private f y;
    private IPageEventAdapter z;

    public void a(boolean z) {
    }

    public boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        return false;
    }

    public boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        return false;
    }

    public IMsgViewAdapter d() {
        return null;
    }

    public SessionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "323ccc73ab02477661cbe226fa7a86f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "323ccc73ab02477661cbe226fa7a86f2");
            return;
        }
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public static /* synthetic */ void a(SessionFragment sessionFragment, IMMessage iMMessage, com.sankuai.xm.im.a aVar) {
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, sessionFragment, changeQuickRedirect, false, "4a681deed2272de88036a38c87c0438b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, sessionFragment, changeQuickRedirect, false, "4a681deed2272de88036a38c87c0438b");
        } else if (!ActivityUtils.a((Activity) sessionFragment.getActivity())) {
            com.sankuai.xm.imui.common.util.d.d("SessionFragment::onJumpToMessageInner isValidActivity", new Object[0]);
        } else if (iMMessage == null) {
            if (aVar != null) {
                aVar.onFailure(-1, "message is null");
            }
        } else {
            int a2 = sessionFragment.u.a(iMMessage.getMsgUuid());
            if (a2 < 0) {
                if (aVar != null) {
                    aVar.onFailure(-1, "not found message");
                    return;
                }
                return;
            }
            int headerViewsCount = ((ListView) sessionFragment.w.getRefreshableView()).getHeaderViewsCount();
            if (headerViewsCount > 0) {
                a2 += headerViewsCount;
            }
            sessionFragment.w.setSelection(a2);
            if (aVar != null) {
                aVar.onSuccess(0);
            }
        }
    }

    @Override // com.sankuai.xm.imui.base.b
    public final /* bridge */ /* synthetic */ void a(c.a aVar) {
        this.u = aVar;
    }

    @Override // android.support.v4.app.Fragment, com.sankuai.xm.imui.session.c.b
    @Nullable
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60bbbdb4a126d0a63168c534b71ca065", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60bbbdb4a126d0a63168c534b71ca065");
        }
        if (this.D != null) {
            return this.D;
        }
        return super.getContext();
    }

    @Override // android.support.v4.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Object[] objArr = {context, attributeSet, bundle};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250e3880d88b1b1749247d6733b913f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250e3880d88b1b1749247d6733b913f7");
        } else {
            super.onInflate(context, attributeSet, bundle);
            throw new UnsupportedOperationException("DO NOT use <fragment> tag with class SessionFragment in layout file.");
        }
    }

    @Override // android.support.v4.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b50b9f98a2ce28d45e29504af289278", 6917529027641081856L)) {
            return (LayoutInflater) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b50b9f98a2ce28d45e29504af289278");
        }
        super.onGetLayoutInflater(bundle);
        return LayoutInflater.from(getContext());
    }

    @Override // com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af58c5fe85d4cf621f533320f97c6fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af58c5fe85d4cf621f533320f97c6fb");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = (SessionId) getArguments().getParcelable("SessionId");
            this.s = getArguments().getString("ActivityId");
            this.t = (SessionParams) getArguments().getParcelable("SessionParams");
        }
        if (this.c == null) {
            this.c = com.sankuai.xm.imui.b.a().f();
        }
        if (this.s == null) {
            this.s = com.sankuai.xm.imui.b.a().h();
        }
        if (this.t == null) {
            this.t = com.sankuai.xm.imui.b.a().c();
        }
        this.r = new com.sankuai.xm.imui.session.b(this.c, this.t);
        com.sankuai.xm.imui.session.b bVar = this.r;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.session.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f0a178c0d1ba8d14e95b84e5f46da871", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f0a178c0d1ba8d14e95b84e5f46da871");
        } else {
            bVar.d = this;
            com.sankuai.xm.imui.common.util.d.b("SessionContext::attach SessionFragment: %s.", this);
        }
        com.sankuai.xm.imui.b.a().a(this.r);
        if (this.t != null && this.t.r) {
            Resources.Theme newTheme = getResources().newTheme();
            newTheme.applyStyle(R.style.XmSdkTheme, true);
            this.D = new android.support.v7.view.d(super.getContext(), newTheme);
        }
        if (this.u == null) {
            com.sankuai.xm.imui.common.util.d.c("SessionFragment::onCreate::mPresenter is null", new Object[0]);
            this.u = new com.sankuai.xm.imui.session.presenter.b(this);
        }
        if (!this.c.i() || bundle != null) {
            com.sankuai.xm.imui.common.util.d.c("SessionFragment::onCreate:: stateRestore自主hud is not allowed: %s.", bundle);
            if (getActivity() instanceof SessionActivity) {
                getActivity().finish();
                return;
            }
            SessionDialogFragment a2 = SessionDialogFragment.a(getContext());
            if (a2 != null) {
                a2.a();
                return;
            }
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = q;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ce0209ea09f44c554f02353f74c2c9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ce0209ea09f44c554f02353f74c2c9d");
        } else {
            final com.sankuai.xm.imui.session.b b2 = com.sankuai.xm.imui.session.b.b(getContext());
            if (b2 == null) {
                com.sankuai.xm.imui.common.util.d.d("SessionFragment::onCreate::initEvent SessionContext is null", new Object[0]);
            } else {
                b2.a(e.f.class, new com.sankuai.xm.base.callback.c<e.f>() { // from class: com.sankuai.xm.imui.session.SessionFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.c
                    public final /* synthetic */ boolean a(e.f fVar) {
                        BaseCommonView a3;
                        e.f fVar2 = fVar;
                        Object[] objArr4 = {fVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "41963d63fd31025f0f91ef03636800c3", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "41963d63fd31025f0f91ef03636800c3")).booleanValue();
                        }
                        b2.e.putBoolean("key_bool_msg_multi_select", fVar2.b);
                        if (fVar2.b && fVar2.c != null && (a3 = SessionFragment.this.a(fVar2.c.getMsgUuid())) != null) {
                            a3.setMultiSelectBtn(true);
                        }
                        SessionFragment.this.A();
                        return false;
                    }
                }, true);
            }
        }
        String b3 = IMClient.a().b(3);
        if (!TextUtils.equals(b3, com.sankuai.xm.video.f.a().d)) {
            com.sankuai.xm.video.f.a().a(b3);
        }
        com.sankuai.xm.imui.common.report.b.a(this.c != null ? this.c.f() : this.s, "onCreate", this.t == null ? null : this.t.toString());
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View onCreateView;
        com.sankuai.xm.ui.service.b bVar;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3525d18b72d4a5ebb1265e02762b3763", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3525d18b72d4a5ebb1265e02762b3763");
        }
        com.sankuai.xm.base.trace.g gVar = this.r == null ? null : this.r.g;
        j.a(gVar);
        try {
            if (ActivityUtils.a((Activity) getActivity()) && com.sankuai.xm.imui.session.b.b(getContext()) != null) {
                this.u.ca_();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = q;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e6d7dfad98d7dfb0eac7c23baa0771e", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e6d7dfad98d7dfb0eac7c23baa0771e")).booleanValue();
                } else {
                    if (IMClient.a().h() == null) {
                        com.sankuai.xm.imui.common.util.d.d("SessionFragment::isAccountInfoError, getConnectionClient is null", new Object[0]);
                    } else {
                        long q2 = com.sankuai.xm.login.a.a().q();
                        if (q2 == 0) {
                            com.sankuai.xm.imui.common.util.d.c("SessionFragment::isAccountInfoError, uid is 0.", new Object[0]);
                        }
                        if (DBProxy.l().b(q2)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    com.sankuai.xm.imui.common.util.d.d("SessionFragment::onCreateView::account info error", new Object[0]);
                    com.sankuai.xm.monitor.statistics.a.a("imui", "SessionFragment::onCreate", "account error");
                    IMClient a2 = IMClient.a();
                    long q3 = com.sankuai.xm.login.a.a().q();
                    Object[] objArr3 = {new Long(q3)};
                    ChangeQuickRedirect changeQuickRedirect3 = IMClient.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "a39f349883406eb6f60f4667b557e7cf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "a39f349883406eb6f60f4667b557e7cf");
                    } else if (!a2.A()) {
                        com.sankuai.xm.im.utils.a.b("IMClient::initCache, 预加载, uid = " + q3, new Object[0]);
                        if (q3 != 0) {
                            com.sankuai.xm.im.utils.b.a().a(a2.f(), q3, a2.g());
                            DBProxy.l().a(q3, false, (Callback<Boolean>) null);
                            CryptoProxy.c().a(a2.c(q3));
                        } else {
                            com.sankuai.xm.base.init.b.a(2);
                        }
                    }
                    F_();
                } else {
                    this.u.a(0, w(), 1);
                }
                View inflate = layoutInflater.inflate(R.layout.xm_sdk_fargment_session, viewGroup, false);
                PageSpeedLinearLayout pageSpeedLinearLayout = (PageSpeedLinearLayout) inflate.findViewById(R.id.xm_sdk_session_ll);
                String str = this.s;
                SessionId sessionId = this.c;
                pageSpeedLinearLayout.b = str;
                pageSpeedLinearLayout.c = sessionId;
                Object[] objArr4 = {inflate};
                ChangeQuickRedirect changeQuickRedirect4 = q;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fffb718bc99a54c8dcde9b50d2b8abdc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fffb718bc99a54c8dcde9b50d2b8abdc");
                } else {
                    this.i = a();
                    if (this.t != null && this.t.r && !(this.i instanceof DialogModeSupportable)) {
                        this.i = new DefaultTitleBarAdapter();
                    }
                    this.i.onAttach(getActivity());
                    this.i.createView(getContext(), (ViewGroup) inflate.findViewById(R.id.xm_sdk_title_bar));
                    com.sankuai.xm.im.vcard.d a3 = com.sankuai.xm.im.vcard.d.a(this.c.b, this.c.e, this.c.g);
                    a3.e = this.c.g();
                    IMUIManager.a().a(a3, new b(this));
                }
                Object[] objArr5 = {inflate};
                ChangeQuickRedirect changeQuickRedirect5 = q;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "06868e098f2a8a3ba0d2e45b95660a2d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "06868e098f2a8a3ba0d2e45b95660a2d");
                } else {
                    this.j = (ViewGroup) inflate.findViewById(R.id.xm_sdk_banner);
                    IBannerAdapter b2 = b();
                    if (b2 != null && !b2.isOverlay() && (onCreateView = b2.onCreateView(LayoutInflater.from(getContext()), this.j)) != null) {
                        this.j.addView(onCreateView);
                        this.j.setTag(b2);
                    }
                }
                Object[] objArr6 = {inflate};
                ChangeQuickRedirect changeQuickRedirect6 = q;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e4e7cb728a668a5b98ff886054a9f781", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e4e7cb728a668a5b98ff886054a9f781");
                } else {
                    this.y = new f(getActivity());
                    this.v = (SendPanel) inflate.findViewById(R.id.xm_sdk_send_panel);
                    this.e = bo_();
                    if (this.e == null) {
                        this.e = new DefaultSendPanelAdapter();
                    }
                    this.v.setSendPanelAdapter(this.e);
                    this.v.setKeyboardHelper(this.y);
                    this.v.setEventListener(new SendPanel.a() { // from class: com.sankuai.xm.imui.session.SessionFragment.4
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.imui.common.panel.SendPanel.a
                        public final void a(int i, Object obj) {
                            Object[] objArr7 = {Integer.valueOf(i), obj};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aea56fc9210c8664d33e1b8180a71749", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aea56fc9210c8664d33e1b8180a71749");
                                return;
                            }
                            switch (i) {
                                case 1:
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) SessionFragment.this.k.getLayoutParams();
                                    layoutParams.height = SessionFragment.this.k.getHeight();
                                    layoutParams.weight = 0.0f;
                                    SessionFragment.this.v.removeCallbacks(SessionFragment.this.B);
                                    if (SessionFragment.this.B == null) {
                                        SessionFragment.this.B = j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.SessionFragment.4.1
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr8 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "262235a78e173d8dda122126e7c2d5d4", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "262235a78e173d8dda122126e7c2d5d4");
                                                    return;
                                                }
                                                ((LinearLayout.LayoutParams) SessionFragment.this.k.getLayoutParams()).weight = 1.0f;
                                                SessionFragment.this.k.requestLayout();
                                                SessionFragment.this.B = null;
                                            }
                                        });
                                    }
                                    SessionFragment.this.v.postDelayed(SessionFragment.this.B, 200L);
                                    return;
                                case 2:
                                    SessionFragment.this.y();
                                    return;
                                case 3:
                                    SessionFragment.this.m.b((AudioMsgView) null);
                                    return;
                                default:
                                    return;
                            }
                        }
                    });
                    this.v.a(this);
                    if (this.t != null) {
                        if (this.t.i > 0) {
                            IMUIManager.a().b(this.t.i);
                        }
                        if (this.t.o != null && (bVar = (com.sankuai.xm.ui.service.b) m.a(com.sankuai.xm.ui.service.b.class)) != null) {
                            b.C1420b a4 = b.C1420b.a(com.sankuai.xm.base.util.b.a(this.t.o));
                            a4.d = true;
                            bVar.a(a4);
                        }
                        if (!this.t.t) {
                            Object[] objArr7 = {(byte) 0};
                            ChangeQuickRedirect changeQuickRedirect7 = q;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7e77789681a6bdcd652cae51e68c0c3b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7e77789681a6bdcd652cae51e68c0c3b");
                            } else {
                                com.sankuai.xm.imui.common.util.d.b("SessionFragment::setSendPanelVisible visible = %s", Boolean.FALSE);
                                this.v.setVisibility(8);
                                this.v.b();
                            }
                        }
                    }
                }
                Object[] objArr8 = {inflate};
                ChangeQuickRedirect changeQuickRedirect8 = q;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "a137a64b4fb86fdacd9701566db44536", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "a137a64b4fb86fdacd9701566db44536");
                } else {
                    this.m = new com.sankuai.xm.imui.session.presenter.a(this.u);
                    com.sankuai.xm.imui.session.presenter.a aVar = this.m;
                    Context context = getContext();
                    Object[] objArr9 = {context};
                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.xm.imui.session.presenter.a.a;
                    if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "7dbc48c102fc3ce05d2fed2fd2f14023", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "7dbc48c102fc3ce05d2fed2fd2f14023");
                    } else {
                        aVar.b = context;
                        aVar.c = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        aVar.d = Privacy.createSensorManager(context, "jcyf-7f8ec5b03baeea8c");
                        if (aVar.d != null) {
                            aVar.f = aVar.d.getDefaultSensor(8);
                        }
                        aVar.e = new i(context);
                    }
                    this.w = (PullToRefreshListView) inflate.findViewById(R.id.xm_sdk_msg_list);
                    this.l = new d(getContext(), this.u, this.m);
                    this.w.setAdapter(this.l);
                    this.w.setStackFromBottom(false);
                    ((ListView) this.w.getRefreshableView()).setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.xm.imui.session.SessionFragment.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Object[] objArr10 = {view, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2bf8ce4f55cabad74e807ccb510e7948", 6917529027641081856L)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2bf8ce4f55cabad74e807ccb510e7948")).booleanValue();
                            }
                            switch (motionEvent.getAction()) {
                                case 0:
                                    SessionFragment.this.a = motionEvent.getX();
                                    SessionFragment.this.b = motionEvent.getY();
                                    if (SessionFragment.this.v != null) {
                                        SessionFragment.this.v.b();
                                        break;
                                    }
                                    break;
                                case 2:
                                    float x = motionEvent.getX();
                                    float y = motionEvent.getY();
                                    if (x - SessionFragment.this.a > (BaseFragment.o * 2) / 3 && Math.abs(y - SessionFragment.this.b) < 200.0f) {
                                        SessionFragment sessionFragment = SessionFragment.this;
                                        Object[] objArr11 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect11 = SessionFragment.q;
                                        if (!PatchProxy.isSupport(objArr11, sessionFragment, changeQuickRedirect11, false, "a43cac7bb8350bc36cc98f75952d9664", 6917529027641081856L)) {
                                            sessionFragment.C_().onScrollFromLeft(sessionFragment.getActivity());
                                            break;
                                        } else {
                                            ((Boolean) PatchProxy.accessDispatch(objArr11, sessionFragment, changeQuickRedirect11, false, "a43cac7bb8350bc36cc98f75952d9664")).booleanValue();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return false;
                        }
                    });
                    this.w.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.sankuai.xm.imui.session.SessionFragment.6
                        public static ChangeQuickRedirect a;
                        private int c;
                        private final HashMap<String, a> d = new HashMap<>();

                        @Override // android.widget.AbsListView.OnScrollListener
                        public final void onScrollStateChanged(AbsListView absListView, int i) {
                            this.c = i;
                        }

                        @Override // android.widget.AbsListView.OnScrollListener
                        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                            e.d dVar;
                            Object[] objArr10 = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "0c2dd5c6da993d2d1afdb5ede786f260", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "0c2dd5c6da993d2d1afdb5ede786f260");
                                return;
                            }
                            if (SessionFragment.this.g != null) {
                                g gVar2 = SessionFragment.this.g;
                                g gVar3 = SessionFragment.this.g;
                                gVar3.getClass();
                                gVar2.a(new g.a(gVar3, 1));
                            }
                            if (com.sankuai.xm.base.util.b.a(SessionFragment.this.u.c()) || i2 <= 0 || i3 <= 0) {
                                return;
                            }
                            int headerViewsCount = ((ListView) SessionFragment.this.w.getRefreshableView()).getHeaderViewsCount();
                            int footerViewsCount = ((ListView) SessionFragment.this.w.getRefreshableView()).getFooterViewsCount();
                            int i4 = (i3 - headerViewsCount) - footerViewsCount;
                            int i5 = (i2 - headerViewsCount) - footerViewsCount;
                            if (i4 <= 0 || i5 <= 0 || i4 != com.sankuai.xm.base.util.b.b(SessionFragment.this.u.c())) {
                                return;
                            }
                            SessionFragment sessionFragment = SessionFragment.this;
                            List<com.sankuai.xm.imui.session.entity.b> c = SessionFragment.this.u.c();
                            int max = Math.max(0, i - headerViewsCount);
                            Object[] objArr11 = {16, c, Integer.valueOf(max), Integer.valueOf(i5)};
                            ChangeQuickRedirect changeQuickRedirect11 = e.d.b;
                            if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "a7bf707af07129c6b0ff3745efb179ac", 6917529027641081856L)) {
                                dVar = (e.d) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "a7bf707af07129c6b0ff3745efb179ac");
                            } else {
                                e.d dVar2 = new e.d(16, c);
                                dVar2.c = max;
                                dVar2.d = i5;
                                dVar = dVar2;
                            }
                            sessionFragment.b(dVar);
                            if (this.c != 2) {
                                com.sankuai.xm.imui.session.b b3 = com.sankuai.xm.imui.session.b.b(SessionFragment.this.getActivity());
                                Object[] objArr12 = {e.a.class};
                                ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.xm.imui.session.b.a;
                                if (PatchProxy.isSupport(objArr12, b3, changeQuickRedirect12, false, "8442484acbb942d9759647885f34a56f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr12, b3, changeQuickRedirect12, false, "8442484acbb942d9759647885f34a56f")).booleanValue() : ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a_(e.a.class).b()) {
                                    HashSet hashSet = new HashSet();
                                    int i6 = 0;
                                    while (i6 < i2) {
                                        View childAt = ((ListView) SessionFragment.this.w.getRefreshableView()).getChildAt(i6);
                                        if (childAt instanceof BaseCommonView) {
                                            com.sankuai.xm.imui.session.entity.b message = ((BaseCommonView) childAt).getMessage();
                                            hashSet.add(message.b());
                                            a aVar2 = this.d.get(message.b());
                                            int b4 = (i6 <= headerViewsCount || i6 >= (i5 - footerViewsCount) - 1) ? l.b(childAt) : 100;
                                            if (aVar2 == null) {
                                                Object[] objArr13 = {Integer.valueOf(i6), -1, message};
                                                ChangeQuickRedirect changeQuickRedirect13 = a.a;
                                                aVar2 = PatchProxy.isSupport(objArr13, null, changeQuickRedirect13, true, "bc623a30b215d622bd1293cd41eb5d7a", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr13, null, changeQuickRedirect13, true, "bc623a30b215d622bd1293cd41eb5d7a") : new a(i6, -1, message);
                                                this.d.put(message.b(), aVar2);
                                            }
                                            if (aVar2.c != b4) {
                                                aVar2.c = b4;
                                                aVar2.b = i6;
                                                SessionFragment.this.b(e.a.a(b4, message));
                                            }
                                        }
                                        i6++;
                                    }
                                    Iterator<Map.Entry<String, a>> it = this.d.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry<String, a> next = it.next();
                                        if (!hashSet.contains(next.getKey())) {
                                            a value = next.getValue();
                                            it.remove();
                                            if (value != null) {
                                                SessionFragment.this.b(e.a.a(0, value.d));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    });
                    this.w.setOnRefreshListener(new e.f<ListView>() { // from class: com.sankuai.xm.imui.session.SessionFragment.7
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e.f
                        public final void a(com.sankuai.xm.imui.common.view.pulltorefresh.e<ListView> eVar) {
                            Object[] objArr10 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "54ee22b10ffcecad5cad983f102ff181", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "54ee22b10ffcecad5cad983f102ff181");
                                return;
                            }
                            PullToRefreshListView pullToRefreshListView = SessionFragment.this.w;
                            Object[] objArr11 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.xm.imui.common.view.pulltorefresh.e.b;
                            if (PatchProxy.isSupport(objArr11, pullToRefreshListView, changeQuickRedirect11, false, "4ec6224efdfaba45259803a5780ff88e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr11, pullToRefreshListView, changeQuickRedirect11, false, "4ec6224efdfaba45259803a5780ff88e");
                            } else {
                                pullToRefreshListView.setRefreshing(true);
                            }
                            SessionFragment.this.u.a(0, SessionFragment.this.w(), 2);
                        }
                    });
                    this.w.setMode(e.c.PULL_FROM_START);
                    com.sankuai.xm.imui.common.view.pulltorefresh.a a5 = this.w.a(true, false);
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = q;
                    IMsgListAdapter defaultMsgListAdapter = PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "bb06494614fc011bffa197e838c59619", 6917529027641081856L) ? (IMsgListAdapter) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "bb06494614fc011bffa197e838c59619") : new DefaultMsgListAdapter();
                    if (defaultMsgListAdapter == null) {
                        defaultMsgListAdapter = new DefaultMsgListAdapter();
                    }
                    a5.setPullLabel(defaultMsgListAdapter.getPullLabel());
                    a5.setReleaseLabel(defaultMsgListAdapter.getReleaseLabel());
                    a5.setRefreshingLabel(defaultMsgListAdapter.getLoadingLabel());
                    a5.setLoadingDrawable(defaultMsgListAdapter.getLoadingDrawable());
                    this.f = inflate.findViewById(R.id.xm_sdk_msg_list_top_divider);
                }
                Object[] objArr11 = {inflate};
                ChangeQuickRedirect changeQuickRedirect11 = q;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "07cbc7c63e05771342efa5281b9bad3e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "07cbc7c63e05771342efa5281b9bad3e");
                } else {
                    this.k = (ViewGroup) inflate.findViewById(R.id.xm_sdk_msg_list_wrapper);
                    this.g = new g(getContext());
                    this.k.addView(this.g);
                    ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b> aVar2 = new ListViewWidgetPanel.a<com.sankuai.xm.imui.session.entity.b>() { // from class: com.sankuai.xm.imui.session.SessionFragment.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.imui.common.widget.ListViewWidgetPanel.a
                        public final List<com.sankuai.xm.imui.session.entity.b> b() {
                            Object[] objArr12 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            return PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "e56949a956f7ca8c674ff4540b571729", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "e56949a956f7ca8c674ff4540b571729") : SessionFragment.this.u.c();
                        }

                        @Override // com.sankuai.xm.imui.common.widget.ListViewWidgetPanel.a
                        public final void a(int i) {
                            Object[] objArr12 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d8f19a12d20020ef707948e47d8d845e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d8f19a12d20020ef707948e47d8d845e");
                            } else {
                                SessionFragment.this.u.a(i, SessionFragment.this.w(), 3);
                            }
                        }

                        @Override // com.sankuai.xm.imui.common.widget.ListViewWidgetPanel.a
                        public final void a(ListViewWidgetPanel.c<com.sankuai.xm.imui.session.entity.b> cVar) {
                            Object[] objArr12 = {cVar};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "20cf37b183729adfe782cbd43adb0f67", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "20cf37b183729adfe782cbd43adb0f67");
                            } else if (cVar != null && ActivityUtils.a((Activity) SessionFragment.this.getActivity())) {
                                List<com.sankuai.xm.imui.session.entity.b> list = cVar.c;
                                if (com.sankuai.xm.base.util.b.a(list)) {
                                    return;
                                }
                                switch (cVar.b) {
                                    case 1:
                                        for (com.sankuai.xm.imui.session.entity.b bVar2 : list) {
                                            BaseCommonView a6 = SessionFragment.this.a(bVar2.b());
                                            if (a6 != null) {
                                                a6.b(bVar2);
                                            }
                                        }
                                        return;
                                    case 2:
                                        com.sankuai.xm.imui.common.util.d.b("SessionFragment", "onRefreshRequest", "REFRESH_REQ_ADDITION %s", list);
                                        if (list.size() == 1) {
                                            SessionFragment.this.b(list.get(0).b());
                                            return;
                                        } else {
                                            SessionFragment.this.A();
                                            return;
                                        }
                                    default:
                                        return;
                                }
                            }
                        }

                        @Override // com.sankuai.xm.imui.common.widget.ListViewWidgetPanel.a
                        public final ListView a() {
                            Object[] objArr12 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            return PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "6ad256fd3b6cf15d425d69fc9c344ed9", 6917529027641081856L) ? (ListView) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "6ad256fd3b6cf15d425d69fc9c344ed9") : (ListView) SessionFragment.this.w.getRefreshableView();
                        }
                    };
                    this.g.a(aVar2, this);
                    this.h = (MsgListFooterWidgetPenal) inflate.findViewById(R.id.xm_sdk_msg_list_footer_panel);
                    this.h.a(aVar2);
                    com.sankuai.xm.imui.session.b.b(getActivity()).a(e.f.class, new com.sankuai.xm.base.callback.c<e.f>() { // from class: com.sankuai.xm.imui.session.SessionFragment.9
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.c
                        public final /* synthetic */ boolean a(e.f fVar) {
                            e.f fVar2 = fVar;
                            boolean z2 = true;
                            Object[] objArr12 = {fVar2};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "31adcd5ac29360c20319c4135376f7ac", 6917529027641081856L)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "31adcd5ac29360c20319c4135376f7ac")).booleanValue();
                            }
                            MsgListFooterWidgetPenal msgListFooterWidgetPenal = SessionFragment.this.h;
                            Object[] objArr13 = {3};
                            ChangeQuickRedirect changeQuickRedirect13 = MsgListFooterWidgetPenal.f;
                            if (PatchProxy.isSupport(objArr13, msgListFooterWidgetPenal, changeQuickRedirect13, false, "3ce8a6bd3dae96f5af2557173aa0b8f7", 6917529027641081856L)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr13, msgListFooterWidgetPenal, changeQuickRedirect13, false, "3ce8a6bd3dae96f5af2557173aa0b8f7")).booleanValue();
                            } else {
                                List<com.sankuai.xm.imui.common.widget.b> installedWidgets = msgListFooterWidgetPenal.getInstalledWidgets();
                                if (!com.sankuai.xm.base.util.b.a(installedWidgets)) {
                                    for (com.sankuai.xm.imui.common.widget.b bVar2 : installedWidgets) {
                                        if ((bVar2 instanceof com.sankuai.xm.imui.session.widget.d) && ((com.sankuai.xm.imui.session.widget.d) bVar2).a() == 3) {
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                            }
                            if (z2) {
                                if (fVar2.b) {
                                    if (SessionFragment.this.v.a()) {
                                        SessionFragment.this.v.b();
                                    }
                                    SessionFragment.this.v.setVisibility(8);
                                    SessionFragment.this.h.setVisibility(0);
                                } else {
                                    SessionFragment.this.v.setVisibility(0);
                                    SessionFragment.this.h.setVisibility(8);
                                }
                            }
                            return false;
                        }
                    }, true);
                }
                Object[] objArr12 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect12 = BaseFragment.n;
                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "ca9d1ffb8c4944bd1307aa7e11b31295", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "ca9d1ffb8c4944bd1307aa7e11b31295");
                } else {
                    com.sankuai.xm.imui.theme.b a6 = com.sankuai.xm.imui.theme.c.a().a(t());
                    if (a6 != null) {
                        a(a6);
                    }
                }
                return inflate;
            }
            com.sankuai.xm.imui.common.util.d.c("SessionFragment::onCreateView:: no view can be created", new Object[0]);
            j.c(gVar);
            return null;
        } finally {
            j.c(gVar);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ddba377cee1881c42eb7cd3e0a0999", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ddba377cee1881c42eb7cd3e0a0999");
            return;
        }
        super.onStart();
        IMClient.a().a(this.c);
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed66517810082aae58d50976de6a7d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed66517810082aae58d50976de6a7d5");
            return;
        }
        super.onResume();
        if (this.m != null) {
            com.sankuai.xm.imui.session.presenter.a aVar = this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.session.presenter.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "896e5dce5c67bdd9b88540f058d41598", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "896e5dce5c67bdd9b88540f058d41598");
            }
        }
        if (this.g != null) {
            g gVar = this.g;
            g gVar2 = this.g;
            gVar2.getClass();
            gVar.a(new g.a(gVar2, 5));
        }
        if (this.r != null) {
            this.r.a(new com.sankuai.xm.imui.session.event.g(2));
        }
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48c9daaf30716827161f5d33c30a0a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48c9daaf30716827161f5d33c30a0a1");
            return;
        }
        if (this.m != null) {
            com.sankuai.xm.imui.session.presenter.a aVar = this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.session.presenter.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0cdf46f8f0adf1f2f3f0bacbc80114ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0cdf46f8f0adf1f2f3f0bacbc80114ea");
            } else {
                aVar.b((AudioMsgView) null);
            }
        }
        if (this.r != null) {
            this.r.a(new com.sankuai.xm.imui.session.event.g(3));
        }
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d80ca3fb432068e122d958d01c07d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d80ca3fb432068e122d958d01c07d7");
            return;
        }
        super.onStop();
        if (this.v != null) {
            this.v.b();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c22aa6674b69436433b16d3f057cea0", 6917529027641081856L)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c22aa6674b69436433b16d3f057cea0")).booleanValue();
        } else if (this.c != null && !TextUtils.isEmpty(this.s) && (TextUtils.equals(this.s, com.sankuai.xm.imui.b.a().h()) || this.c.equals(com.sankuai.xm.imui.b.a().f()))) {
            z = true;
        }
        if (z) {
            IMClient.a().b(this.c);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe1cb59316782dfd5a00b0ef2f11e8ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe1cb59316782dfd5a00b0ef2f11e8ae");
            return;
        }
        if (this.j != null && (this.j.getTag() instanceof IBannerAdapter)) {
            ((IBannerAdapter) this.j.getTag()).onDestroy();
        }
        if (this.e != null) {
            this.e.destroy();
        }
        if (this.i != null) {
            this.i.onDetach();
        }
        if (this.d != null) {
            MsgViewAdapterDecorator msgViewAdapterDecorator = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = MsgViewAdapterDecorator.a;
            if (PatchProxy.isSupport(objArr2, msgViewAdapterDecorator, changeQuickRedirect2, false, "20442b021b984b0e3700e4fa947cc22c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, msgViewAdapterDecorator, changeQuickRedirect2, false, "20442b021b984b0e3700e4fa947cc22c");
            } else {
                if (msgViewAdapterDecorator.b != null) {
                    msgViewAdapterDecorator.b.release();
                    msgViewAdapterDecorator.b = null;
                }
                for (int i = 0; i < msgViewAdapterDecorator.c.size(); i++) {
                    IExtraAdapter valueAt = msgViewAdapterDecorator.c.valueAt(i);
                    if (valueAt != null) {
                        valueAt.release();
                    }
                }
                msgViewAdapterDecorator.c.clear();
            }
        }
        if (this.g != null) {
            g gVar = this.g;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = WidgetPanel.b;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "a2559945840b53a8c189f9c54c3808c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "a2559945840b53a8c189f9c54c3808c4");
            } else {
                gVar.d = false;
                gVar.c = null;
                for (int size = gVar.e.size() - 1; size >= 0; size--) {
                    gVar.a((g) ((com.sankuai.xm.imui.common.widget.b) gVar.e.get(size)));
                }
            }
            this.g = null;
        }
        if (this.m != null) {
            com.sankuai.xm.imui.session.presenter.a aVar = this.m;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.imui.session.presenter.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "848bb21ebf21ebd3fe7b829d3f95a876", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "848bb21ebf21ebd3fe7b829d3f95a876");
            } else {
                aVar.b = null;
                aVar.a(false);
                aVar.c = null;
                aVar.d = null;
                aVar.f = null;
                if (aVar.e != null) {
                    aVar.e.b();
                }
                aVar.e = null;
                if (aVar.g != null) {
                    aVar.g.clear();
                    aVar.g = null;
                }
                if (aVar.i != null) {
                    aVar.i.clear();
                    aVar.i = null;
                }
                aVar.a(true, false);
                aVar.b((AudioMsgView) null);
            }
            this.m = null;
        }
        if (this.y != null) {
            f fVar = this.y;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = f.a;
            if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "69e8f0c99109df82dd98d83d0adf9778", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "69e8f0c99109df82dd98d83d0adf9778");
            } else {
                if (fVar.b != null) {
                    fVar.b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(fVar);
                }
                fVar.b = null;
                fVar.deleteObservers();
            }
            this.y = null;
        }
        this.d = null;
        if (this.v != null) {
            SendPanel sendPanel = this.v;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = SendPanel.a;
            if (PatchProxy.isSupport(objArr6, sendPanel, changeQuickRedirect6, false, "973d616d9295f4b97b5ef10ea4422abd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr6, sendPanel, changeQuickRedirect6, false, "973d616d9295f4b97b5ef10ea4422abd");
            } else {
                if (sendPanel.c != null && sendPanel.c.size() > 0) {
                    for (int i2 = 0; i2 < sendPanel.c.size(); i2++) {
                        sendPanel.c.valueAt(i2).f();
                    }
                    sendPanel.c.clear();
                }
                if (sendPanel.getEmotionProcessor() != null) {
                    sendPanel.setEmotionProcessor(null);
                }
            }
        }
        super.onDestroyView();
    }

    @Override // com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41772075b1d6c37cc85c7cc505cee14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41772075b1d6c37cc85c7cc505cee14");
            return;
        }
        com.sankuai.xm.imui.common.report.b.a(this.c != null ? this.c.f() : this.s, "onDestroy", getActivity() == null ? null : getActivity().toString());
        com.sankuai.xm.imui.common.report.b.a(this.s, this.c, true);
        if (this.u != null) {
            this.u.b();
        }
        if (this.r != null) {
            com.sankuai.xm.imui.session.b bVar = this.r;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.session.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "119f51da9d68075b7b3c5b2690786d91", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "119f51da9d68075b7b3c5b2690786d91");
            } else {
                if (bVar.f != null) {
                    bVar.f.clear();
                }
                bVar.d = null;
                com.sankuai.xm.imui.common.util.d.b("SessionContext::detach activity: %s.", this);
            }
            this.r = null;
        }
        com.sankuai.xm.imui.b.a().a(this.c, this.s);
        CryptoProxy.c().b();
        com.sankuai.xm.video.f.a().b = null;
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    @CallSuper
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9996d1f705188c304b6c9b332d434160", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9996d1f705188c304b6c9b332d434160");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.v != null) {
            this.v.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.sankuai.xm.imui.session.c.b
    @NonNull
    public final MsgViewAdapterDecorator u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "059a17d730ed348dfc73253d08d42833", 6917529027641081856L)) {
            return (MsgViewAdapterDecorator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "059a17d730ed348dfc73253d08d42833");
        }
        if (this.d == null) {
            IMsgViewAdapter d = d();
            if (d == null) {
                d = new MsgViewAdapter();
            }
            this.d = new MsgViewAdapterDecorator(getContext(), d);
        }
        return this.d;
    }

    @Override // com.sankuai.xm.imui.base.BaseFragment, com.sankuai.xm.imui.theme.c.a
    public void a(com.sankuai.xm.imui.theme.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa235a5fbc11c7de12ce220309ae0e4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa235a5fbc11c7de12ce220309ae0e4e");
        } else if (this.C == bVar) {
        } else {
            this.C = bVar;
            if (this.i != null) {
                this.i.onThemeChanged(bVar);
            }
            if (this.f != null && bVar.r != null) {
                this.f.setBackgroundColor(bVar.r.intValue());
            }
            if (this.w != null) {
                com.sankuai.xm.imui.theme.c.a(bVar.e, bVar.f, this.w);
            }
            if (this.v != null) {
                Drawable drawable = bVar.u;
                if (drawable != null) {
                    this.v.setBackground(drawable);
                } else {
                    com.sankuai.xm.imui.theme.c.a(bVar.c, bVar.d, this.v);
                }
            }
        }
    }

    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f07258083ebfd4f4a42f85ef18d2faf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f07258083ebfd4f4a42f85ef18d2faf");
        } else if (this.w == null) {
        } else {
            this.w.postDelayed(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.SessionFragment.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30ad0b47233b44c02477026c3ede01f8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30ad0b47233b44c02477026c3ede01f8");
                    } else {
                        SessionFragment.this.w.setSelection(SessionFragment.this.l.getCount());
                    }
                }
            }), 200L);
        }
    }

    public boolean b(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2ad308ed4ff42e111d719152950a45", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2ad308ed4ff42e111d719152950a45")).booleanValue() : a(bVar);
    }

    public void b(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821ac70ba576f4d27db1e0aabfa25ca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821ac70ba576f4d27db1e0aabfa25ca4");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7b68d89cfb82c071a410b743cf2f3ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7b68d89cfb82c071a410b743cf2f3ae");
            return;
        }
        Object[] objArr3 = new Object[2];
        objArr3[0] = bVar == null ? "" : bVar.b();
        objArr3[1] = Integer.valueOf(i);
        com.sankuai.xm.imui.common.util.d.b("SessionFragment::onSendMsgAddToUI, msgUuid = %s, resCode = %s", objArr3);
        this.l.notifyDataSetChanged();
        if (this.l.getCount() <= 0 || bVar == null || this.l.getItem(this.l.getCount() - 1) != bVar) {
            return;
        }
        y();
    }

    public void a(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b578625cdff6d7ad909284d27fcbc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b578625cdff6d7ad909284d27fcbc3");
            return;
        }
        this.l.notifyDataSetChanged();
        int b2 = com.sankuai.xm.base.util.b.b(this.u.c());
        com.sankuai.xm.imui.common.util.d.b("SessionFragment::onReceiveMsg, msg count = %d", Integer.valueOf(com.sankuai.xm.base.util.b.b(list)));
        int lastVisiblePosition = this.w.getLastVisiblePosition();
        if (this.g != null) {
            g gVar = this.g;
            g gVar2 = this.g;
            gVar2.getClass();
            gVar.a(new g.a(gVar2, 2).a(list));
        }
        b(e.b.a(1, list, 1));
        if (lastVisiblePosition >= b2 + (-1)) {
            this.w.setSelection(b2);
        }
    }

    public void b(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ee6c7efd12c175d39c8005cc4abd2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ee6c7efd12c175d39c8005cc4abd2b");
            return;
        }
        com.sankuai.xm.imui.common.util.d.b("SessionFragment::onDeleteMsg, msg count = %d", Integer.valueOf(com.sankuai.xm.base.util.b.b(list)));
        this.l.notifyDataSetChanged();
        if (this.g != null) {
            g gVar = this.g;
            g gVar2 = this.g;
            gVar2.getClass();
            gVar.a(new g.a(gVar2, 3).a(list));
        }
        b(e.b.a(3, list, 0));
    }

    public final void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af279bd99f64d6bf509d20d6e6e3f0b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af279bd99f64d6bf509d20d6e6e3f0b6");
        } else if (this.r == null || !ActivityUtils.a((Activity) getActivity())) {
            com.sankuai.xm.imui.common.util.d.c("close Session should not call.", new Object[0]);
        } else if (this.r.c.r) {
            SessionDialogFragment a2 = SessionDialogFragment.a(getActivity());
            if (a2 != null) {
                a2.dismissAllowingStateLoss();
            }
        } else {
            getActivity().finish();
        }
    }

    public final void b(IMMessage iMMessage, com.sankuai.xm.im.a<Integer> aVar) {
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce1251e65081ea4c63f18b8f3e9247d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce1251e65081ea4c63f18b8f3e9247d");
            return;
        }
        try {
            this.u.a(iMMessage, aVar);
        } catch (Throwable th) {
            com.sankuai.xm.imui.common.util.d.a(th, "SessionFragment::jumpToMessage exception", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.imui.session.c.b
    public final void a(final IMMessage iMMessage, final com.sankuai.xm.im.a<Integer> aVar) {
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6d3dc4c1d012a2b372b55e909020bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6d3dc4c1d012a2b372b55e909020bf");
        } else {
            m.e().a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.SessionFragment.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "798dccee3537e3d9295e4333a0897774", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "798dccee3537e3d9295e4333a0897774");
                    } else {
                        SessionFragment.a(SessionFragment.this, iMMessage, aVar);
                    }
                }
            }), 1L);
        }
    }

    @Override // com.sankuai.xm.imui.session.c.b
    public final void a(String str, String str2, int i, int i2) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318b87c70a560a0ce0bc4d2d58fc4b8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318b87c70a560a0ce0bc4d2d58fc4b8d");
            return;
        }
        BaseCommonView a2 = a(str);
        if (a2 instanceof MediaMsgView) {
            ((MediaMsgView) a2).a(str2, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd1ab4b1a079bc4f1a2d16725a38dcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd1ab4b1a079bc4f1a2d16725a38dcc");
        } else {
            com.sankuai.xm.imui.session.b.b(getActivity()).a(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BaseCommonView a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51235176bda8d336a5ed3889247c021e", 6917529027641081856L)) {
            return (BaseCommonView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51235176bda8d336a5ed3889247c021e");
        }
        if (TextUtils.isEmpty(str) || !ActivityUtils.a((Activity) getActivity())) {
            return null;
        }
        int firstVisiblePosition = this.w.getFirstVisiblePosition();
        int lastVisiblePosition = this.w.getLastVisiblePosition();
        for (int i = 0; i < (lastVisiblePosition - firstVisiblePosition) + 1; i++) {
            View childAt = ((ListView) this.w.getRefreshableView()).getChildAt(i);
            if (childAt instanceof BaseCommonView) {
                BaseCommonView baseCommonView = (BaseCommonView) childAt;
                if (TextUtils.equals(str, baseCommonView.getMessage().b())) {
                    return baseCommonView;
                }
            }
        }
        return null;
    }

    @Override // com.sankuai.xm.imui.session.c.b
    public final SendPanel v() {
        return this.v;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e1d75e73b2342984a31d7390bc3151", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e1d75e73b2342984a31d7390bc3151");
        } else if (getActivity() == null || !isAdded() || getView() == null) {
            com.sankuai.xm.imui.common.util.d.d("SessionFragment::onQueryMsgResult not attached to Activity", new Object[0]);
        } else {
            this.l.notifyDataSetChanged();
            int b2 = com.sankuai.xm.base.util.b.b(this.u.c());
            int b3 = com.sankuai.xm.base.util.b.b(list);
            com.sankuai.xm.imui.common.util.d.b("SessionFragment::onQueryMsgResult,code = %d, type = %d, totalCount = %d, newCount = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b2), Integer.valueOf(b3));
            switch (i2) {
                case 1:
                    boolean z2 = b3 > 0;
                    com.sankuai.xm.imui.common.util.d.b("SessionFragment onQueryMsgResult init hasLocal = " + z2, new Object[0]);
                    a(z2);
                    break;
                case 2:
                case 6:
                    if (b3 > 0) {
                        if (b2 > b3) {
                            b2 = b3 + 1;
                            break;
                        }
                        b2 = b3;
                        break;
                    }
                    b2 = -1;
                    break;
                case 3:
                case 5:
                case 7:
                default:
                    b2 = -1;
                    break;
                case 4:
                    if (i == 0) {
                        if (b3 != 0 || z) {
                            if (b2 > b3) {
                                b2 = b3 + 1;
                                break;
                            }
                            b2 = b3;
                            break;
                        } else {
                            com.sankuai.xm.imui.common.view.pulltorefresh.a a2 = this.w.a(true, false);
                            String string = getString(R.string.xm_sdk_session_msg_no_more_messages);
                            a2.setPullLabel(string);
                            a2.setRefreshingLabel(string);
                            a2.setReleaseLabel(string);
                            a2.setLoadingDrawable(null);
                        }
                    }
                    b2 = -1;
                    break;
            }
            if (this.g != null) {
                g gVar = this.g;
                g gVar2 = this.g;
                gVar2.getClass();
                gVar.a(new g.a(gVar2, 4).a(list));
            }
            if (b3 > 0) {
                b(e.b.a(1, list, 2));
            }
            PullToRefreshListView pullToRefreshListView = this.w;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.imui.common.view.pulltorefresh.e.b;
            if (PatchProxy.isSupport(objArr2, pullToRefreshListView, changeQuickRedirect2, false, "feb59e63f793d4fc9dd954332c553e61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, pullToRefreshListView, changeQuickRedirect2, false, "feb59e63f793d4fc9dd954332c553e61");
            } else if (pullToRefreshListView.i()) {
                pullToRefreshListView.a(e.k.RESET, new boolean[0]);
            }
            if (b2 > 0) {
                this.w.setSelection(b2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.xm.imui.session.c.b
    public final void a(com.sankuai.xm.imui.session.entity.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ea579f25a56b2aca40c4e9100cef39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ea579f25a56b2aca40c4e9100cef39");
            return;
        }
        Object[] objArr2 = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ba7f8ef8f357baf40ab5ebeb25842ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ba7f8ef8f357baf40ab5ebeb25842ca");
        } else if (!ActivityUtils.a((Activity) getActivity()) || this.w == null || bVar == null || bVar.b == 0) {
        } else {
            if (bVar.b.getMsgType() == 12 && bVar.c() == 15) {
                this.l.notifyDataSetChanged();
                return;
            }
            int c = bVar.c();
            if (c == 16 && i != 0) {
                Object[] objArr3 = {bVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = q;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8a8bcd6f3a3edb0d5ac7c633ae26d761", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8a8bcd6f3a3edb0d5ac7c633ae26d761");
                } else {
                    ad.a(getContext(), (int) R.string.xm_sdk_session_msg_cancel_fail);
                }
            } else if (c == 5 || c == 4 || (c >= 900 && c <= 1000)) {
                if (i == -9999) {
                    com.sankuai.xm.imui.common.util.d.c("SessionFragment::onUpdateMsgStatus, sendStatus and rescode not match, status=%d", Integer.valueOf(c));
                    return;
                } else if (!a(i, bVar)) {
                    com.sankuai.xm.imui.common.util.b.a(getContext(), i);
                }
            }
            BaseCommonView a2 = a(bVar.b());
            if (a2 != null) {
                com.sankuai.xm.imui.session.entity.b message = a2.getMessage();
                if (message != bVar) {
                    bVar.b.copyTo(message.b);
                }
                a2.a(message.c());
            }
        }
    }

    @Override // com.sankuai.xm.imui.session.c.b
    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57930c0c789f741af91b40bc6936e757", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57930c0c789f741af91b40bc6936e757");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44e4a71d54d59c135bf98d56d1a6ce39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44e4a71d54d59c135bf98d56d1a6ce39");
        } else {
            C_().onUnReadCountChanged(this.i);
        }
    }

    @Override // com.sankuai.xm.imui.session.c.b
    public final void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88d269ab1b220d4ccbdb1d69e1b4bd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88d269ab1b220d4ccbdb1d69e1b4bd2");
            return;
        }
        com.sankuai.xm.im.utils.a.a("onDBStateChange:state=" + aVar, new Object[0]);
        if (aVar == b.a.READY && DBProxy.l().e()) {
            if (this.x == null) {
                this.u.a(0, w(), 6);
                return;
            }
            b(this.x);
            this.x = null;
            this.u.a(0, w(), 1);
        }
    }

    public void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92135c0fcfacb16130d7bde1db4df7d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92135c0fcfacb16130d7bde1db4df7d9");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        com.sankuai.xm.imui.common.util.d.b("SessionFragment::setInputEnabled enable = %s, hint = %s", sb.toString(), str);
        this.v.a(!z ? 1 : 0, str);
    }

    public final void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e8c3c91df5968328a253a8a7fff232", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e8c3c91df5968328a253a8a7fff232");
            return;
        }
        FragmentActivity activity = getActivity();
        if (!ActivityUtils.a((Activity) activity)) {
            com.sankuai.xm.imui.common.util.d.c("SessionFragment::refreshMsgListView an valid activity is required.", new Object[0]);
        } else {
            activity.runOnUiThread(j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.SessionFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81376cae32cdddb1e963fff19ca4baff", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81376cae32cdddb1e963fff19ca4baff");
                    } else if (SessionFragment.this.l != null) {
                        com.sankuai.xm.imui.common.util.d.b("SessionFragment::refreshMsgListView refresh msg list manually.", new Object[0]);
                        SessionFragment.this.l.notifyDataSetChanged();
                    }
                }
            }));
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8ffc12846dde30eccf92d42b356a4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8ffc12846dde30eccf92d42b356a4f");
        } else if (!ActivityUtils.a((Activity) getActivity())) {
            com.sankuai.xm.imui.common.util.d.d("SessionFragment::refreshMsgView an valid activity is required.", new Object[0]);
        } else {
            BaseCommonView a2 = a(str);
            if (a2 != null) {
                a2.setMessage(a2.getMessage());
            }
        }
    }

    public TitleBarAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd02fc11dedfe47c082120657004797", 6917529027641081856L)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd02fc11dedfe47c082120657004797");
        }
        if (this.i == null) {
            this.i = new DefaultTitleBarAdapter();
        }
        return this.i;
    }

    public IBannerAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38ab6818c2883cf1b286bd9e37a7544", 6917529027641081856L)) {
            return (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38ab6818c2883cf1b286bd9e37a7544");
        }
        SessionParams sessionParams = com.sankuai.xm.imui.session.b.b(getContext()).c;
        if (this.A == null && this.c.e == 2 && sessionParams.q) {
            this.A = new GroupAnnouncementAdapter();
        }
        return this.A;
    }

    public ISendPanelAdapter bo_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9eb5e80243d8b07f54925e495f0a09", 6917529027641081856L)) {
            return (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9eb5e80243d8b07f54925e495f0a09");
        }
        if (this.e == null) {
            this.e = new DefaultSendPanelAdapter();
        }
        return this.e;
    }

    @Override // com.sankuai.xm.imui.session.a
    public final IPageEventAdapter C_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838a5495fe27b3f2da4134ce28e10320", 6917529027641081856L)) {
            return (IPageEventAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838a5495fe27b3f2da4134ce28e10320");
        }
        if (this.z == null) {
            this.z = new DefaultPageEventAdapter();
        }
        return this.z;
    }

    @Override // com.sankuai.xm.imui.session.c.b
    public final com.sankuai.xm.imui.session.entity.a w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d688872c344ecae4d5e454a87bffe5", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.session.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d688872c344ecae4d5e454a87bffe5");
        }
        if (this.t != null) {
            return new com.sankuai.xm.imui.session.entity.a(this.t.c, this.t.d, this.t.e);
        }
        return null;
    }

    public void F_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94fdf9ea301a4ad01e0b2d117cdf4903", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94fdf9ea301a4ad01e0b2d117cdf4903");
        } else {
            C_().onAccountError(getActivity());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class DefaultPageEventAdapter implements IPageEventAdapter {
        public static ChangeQuickRedirect a;
        private boolean c;

        private DefaultPageEventAdapter() {
            Object[] objArr = {SessionFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8fda9ec3f8a61503767f868e0e2376", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8fda9ec3f8a61503767f868e0e2376");
            } else {
                this.c = false;
            }
        }

        public static /* synthetic */ void a(DefaultPageEventAdapter defaultPageEventAdapter, int i, TitleBarAdapter titleBarAdapter) {
            Object[] objArr = {Integer.valueOf(i), titleBarAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, defaultPageEventAdapter, changeQuickRedirect, false, "299e489910960e2108671c275d24af93", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, defaultPageEventAdapter, changeQuickRedirect, false, "299e489910960e2108671c275d24af93");
            } else if (titleBarAdapter != null) {
                titleBarAdapter.onUnreadCountChanged(i);
            }
        }

        @Override // com.sankuai.xm.imui.common.adapter.IPageEventAdapter
        public boolean isShowUnreadMessageNotification() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c39c715ffd13829055820799ef7804a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c39c715ffd13829055820799ef7804a")).booleanValue() : !com.sankuai.xm.imui.session.b.b(SessionFragment.this.getContext()).c.r;
        }

        @Override // com.sankuai.xm.imui.common.adapter.IPageEventAdapter
        public void onAccountError(final Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c89a169f4c3a8370cd97f47a61833d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c89a169f4c3a8370cd97f47a61833d");
                return;
            }
            final SessionFragment a2 = com.sankuai.xm.imui.session.b.a((Context) activity);
            if (a2 != null) {
                this.c = true;
                Runnable a3 = j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.SessionFragment.DefaultPageEventAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cad7a338ddbf140964573cacabe290b", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cad7a338ddbf140964573cacabe290b");
                        } else if (ActivityUtils.a((Activity) SessionFragment.this.getActivity())) {
                            if (DefaultPageEventAdapter.this.c && !DBProxy.l().b(com.sankuai.xm.login.a.a().q())) {
                                ad.a(activity, (int) R.string.xm_sdk_session_msg_load_time_out);
                                a2.a(false);
                            } else if (a2.u != null) {
                                a2.u.a(0, a2.w(), 1);
                            }
                        }
                    }
                });
                a2.x = a3;
                a2.a(a3, 5000);
            }
        }

        @Override // com.sankuai.xm.imui.common.adapter.IPageEventAdapter
        public void onUnReadCountChanged(final TitleBarAdapter titleBarAdapter) {
            Object[] objArr = {titleBarAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83fe4447175a0c584fc15d2dbac096b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83fe4447175a0c584fc15d2dbac096b7");
                return;
            }
            Object[] objArr2 = {titleBarAdapter};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8583559c446217d8ccdd2a03765f279c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8583559c446217d8ccdd2a03765f279c");
                return;
            }
            IMUIManager a2 = IMUIManager.a();
            com.sankuai.xm.im.d<Integer> dVar = new com.sankuai.xm.im.d<Integer>() { // from class: com.sankuai.xm.imui.session.SessionFragment.DefaultPageEventAdapter.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(Integer num) {
                    final Integer num2 = num;
                    Object[] objArr3 = {num2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0d44b6e4aa1551df3a105e97aa5f4fa", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0d44b6e4aa1551df3a105e97aa5f4fa");
                    } else if (!ActivityUtils.a((Activity) SessionFragment.this.getActivity()) || num2 == null) {
                    } else {
                        if (num2.intValue() == 0) {
                            DefaultPageEventAdapter.a(DefaultPageEventAdapter.this, num2.intValue(), titleBarAdapter);
                        } else {
                            IMClient.a().a(com.sankuai.xm.imui.b.a().f(), new com.sankuai.xm.im.d<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.xm.imui.session.SessionFragment.DefaultPageEventAdapter.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.im.d
                                public final /* synthetic */ void b_(com.sankuai.xm.im.session.entry.a aVar) {
                                    com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                                    Object[] objArr4 = {aVar2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3c1660c77f53f53f7563b136a1367e1", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3c1660c77f53f53f7563b136a1367e1");
                                    } else if (ActivityUtils.a((Activity) SessionFragment.this.getActivity())) {
                                        if (aVar2 == null) {
                                            DefaultPageEventAdapter.a(DefaultPageEventAdapter.this, num2.intValue(), titleBarAdapter);
                                        } else {
                                            DefaultPageEventAdapter.a(DefaultPageEventAdapter.this, num2.intValue() - aVar2.d, titleBarAdapter);
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            };
            Object[] objArr3 = {dVar};
            ChangeQuickRedirect changeQuickRedirect3 = IMUIManager.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "4aef6da38281351f37ec687b1e2863f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "4aef6da38281351f37ec687b1e2863f3");
            } else {
                IMClient.a().a((short) -1, (com.sankuai.xm.im.a<Integer>) dVar);
            }
        }

        @Override // com.sankuai.xm.imui.common.adapter.IPageEventAdapter
        public boolean onScrollFromLeft(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8349570fa659221094b38e8bf9c5d32a", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8349570fa659221094b38e8bf9c5d32a")).booleanValue();
            }
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
            return true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class b extends com.sankuai.xm.im.d<com.sankuai.xm.im.vcard.entity.a> {
        public static ChangeQuickRedirect a;
        private WeakReference<SessionFragment> b;

        @Override // com.sankuai.xm.im.d
        public final /* synthetic */ void b_(com.sankuai.xm.im.vcard.entity.a aVar) {
            com.sankuai.xm.im.vcard.entity.a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc2fecc4aaff803ac45ea315e3b571e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc2fecc4aaff803ac45ea315e3b571e");
                return;
            }
            SessionFragment sessionFragment = this.b.get();
            if (aVar2 == null || aVar2.d == null || sessionFragment == null || sessionFragment.i == null || !ActivityUtils.a((Activity) sessionFragment.getActivity())) {
                return;
            }
            sessionFragment.i.onTitleTextChanged(aVar2.d);
        }

        public b(SessionFragment sessionFragment) {
            Object[] objArr = {sessionFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2dfd76ff328374403234d730c8b839", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2dfd76ff328374403234d730c8b839");
            } else {
                this.b = new WeakReference<>(sessionFragment);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public com.sankuai.xm.imui.session.entity.b<?> d;

        public a(int i, int i2, com.sankuai.xm.imui.session.entity.b<?> bVar) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0352a74218404a54a2607b9836bd03", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0352a74218404a54a2607b9836bd03");
                return;
            }
            this.b = -1;
            this.c = 0;
            this.b = i;
            this.c = i2;
            this.d = bVar;
        }
    }

    @Deprecated
    public final <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84fcce582c7797d48d5e9f7797bec8c9", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84fcce582c7797d48d5e9f7797bec8c9");
        }
        if (this.v == null) {
            return null;
        }
        return (T) this.v.a(cls);
    }
}
