package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.LevelListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.u;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.common.view.SimpleTextView;
import com.sankuai.xm.imui.common.view.WaveView;
import com.sankuai.xm.imui.session.event.g;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VoicePlugin extends Plugin {
    public static ChangeQuickRedirect b;
    private a A;
    private Handler B;
    private com.sankuai.xm.base.callback.c<g> C;
    private boolean D;
    private int E;
    private LinearLayout a;
    private SimpleTextView c;
    private View d;
    private PopupWindow m;
    private WaveView n;
    private View o;
    private View p;
    private View q;
    private View r;
    private View s;
    private View t;
    private View u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public static /* synthetic */ void e(VoicePlugin voicePlugin) {
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_chat_set_mode_btn;
    }

    @Deprecated
    public int getVolumeImageResource() {
        return 0;
    }

    public static /* synthetic */ void a(VoicePlugin voicePlugin) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, voicePlugin, changeQuickRedirect, false, "6960845eab141365d39c14b613d2ee54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, voicePlugin, changeQuickRedirect, false, "6960845eab141365d39c14b613d2ee54");
            return;
        }
        voicePlugin.setRecordState(2);
        a aVar = voicePlugin.A;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7fad8276e97e2a5c88b80f1687ad9515", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7fad8276e97e2a5c88b80f1687ad9515");
        } else {
            if (aVar.c) {
                aVar.a();
            }
            if (VoicePlugin.this.z > 0) {
                aVar.c = true;
                aVar.b = VoicePlugin.this.z;
                VoicePlugin.this.B.postDelayed(aVar, IMUIManager.a().b - (VoicePlugin.this.z * 1000));
            }
        }
        voicePlugin.k();
        voicePlugin.B.sendEmptyMessageDelayed(4, IMUIManager.a().b);
    }

    public static /* synthetic */ void a(VoicePlugin voicePlugin, MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, voicePlugin, changeQuickRedirect, false, "87e3fc523964453aacf1f11aac76b986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, voicePlugin, changeQuickRedirect, false, "87e3fc523964453aacf1f11aac76b986");
            return;
        }
        int[] iArr = new int[2];
        voicePlugin.t.getLocationOnScreen(iArr);
        int i = iArr[1];
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        Object tag = voicePlugin.c.getTag();
        if (tag != null) {
            int intValue = ((Integer) tag).intValue();
            if (actionMasked == 2) {
                if (motionEvent.findPointerIndex(intValue) >= 0) {
                    if (motionEvent.getRawY() < i) {
                        voicePlugin.setRecordState(3);
                    } else {
                        voicePlugin.setRecordState(2);
                    }
                }
            } else if (intValue == pointerId) {
                if (actionMasked != 1 && actionMasked != 6) {
                    if (actionMasked == 3) {
                        d.b("VoicePlugin::handleTalkBtnTouchEventListener.CANCEL", new Object[0]);
                        voicePlugin.m();
                        voicePlugin.c.setTag(null);
                        return;
                    }
                    return;
                }
                d.b("VoicePlugin::handleTalkBtnTouchEventListener.UP," + pointerId + ",action:" + actionMasked, new Object[0]);
                if (motionEvent.getRawY() < i) {
                    voicePlugin.m();
                } else {
                    voicePlugin.l();
                }
                voicePlugin.c.setTag(null);
            }
        } else if (actionMasked == 0 || actionMasked == 5) {
            d.b("VoicePlugin::handleTalkBtnTouchEventListener.DOWN, pointerId:" + pointerId + ",action:" + actionMasked, new Object[0]);
            if (motionEvent.getRawY() > i) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, voicePlugin, changeQuickRedirect2, false, "deaa9dfc73ac5e51209010d1032cdccf", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, voicePlugin, changeQuickRedirect2, false, "deaa9dfc73ac5e51209010d1032cdccf");
                } else {
                    e createPermissionGuard = Privacy.createPermissionGuard();
                    if (createPermissionGuard == null) {
                        ad.a(voicePlugin.getContext(), (int) R.string.xm_sdk_perm_check_fail);
                        d.d("VoicePlugin::startRecord: perm is null", new Object[0]);
                    } else {
                        int a2 = createPermissionGuard.a(voicePlugin.getContext(), PermissionGuard.PERMISSION_MICROPHONE, "jcyf-e4b399808a333f25");
                        d.b("VoicePlugin::startRecord::perm code : %s", Integer.valueOf(a2));
                        if (a2 > 0) {
                            voicePlugin.setRecordState(1);
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = b;
                            if (PatchProxy.isSupport(objArr3, voicePlugin, changeQuickRedirect3, false, "ce6157b1168865a88620d414e667908b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, voicePlugin, changeQuickRedirect3, false, "ce6157b1168865a88620d414e667908b");
                            } else {
                                voicePlugin.c(393216);
                                if (IMClient.a().a(new com.sankuai.xm.base.voicemail.c() { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.5
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.xm.base.voicemail.c
                                    public final void a(String str) {
                                        Object[] objArr4 = {str};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "39c8bab9ac8f790eefe74517a6d310f2", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "39c8bab9ac8f790eefe74517a6d310f2");
                                        } else {
                                            VoicePlugin.this.B.sendEmptyMessage(1);
                                        }
                                    }

                                    @Override // com.sankuai.xm.base.voicemail.c
                                    public final void b(String str) {
                                        Object[] objArr4 = {str};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "632318018e774e2999951de441521892", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "632318018e774e2999951de441521892");
                                            return;
                                        }
                                        VoicePlugin.this.B.sendEmptyMessage(2);
                                        if (Build.VERSION.SDK_INT > 28 && com.sankuai.xm.recorder.a.a(VoicePlugin.this.getContext())) {
                                            ad.a(VoicePlugin.this.getContext(), (int) R.string.xm_sdk_voice_record_focus_lost);
                                        } else {
                                            ad.a(VoicePlugin.this.getContext(), (int) R.string.xm_sdk_voice_record_failed);
                                        }
                                    }

                                    @Override // com.sankuai.xm.base.voicemail.c
                                    public final void a(long j, long j2, File file) {
                                        Object[] objArr4 = {new Long(j), new Long(j2), file};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a01c8b1e1947c0cab4005ed34520e5b1", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a01c8b1e1947c0cab4005ed34520e5b1");
                                            return;
                                        }
                                        VoicePlugin.this.B.sendEmptyMessage(2);
                                        short s = (short) (j / 1000);
                                        if (s <= 0) {
                                            VoicePlugin.this.E = R.string.xm_sdk_voice_recording_too_short;
                                            VoicePlugin.this.B.sendEmptyMessage(6);
                                            return;
                                        }
                                        if (u.a(VoicePlugin.this.getContext()) && VoicePlugin.this.y && u.a(file.getPath())) {
                                            VoicePlugin.this.E = R.string.xm_sdk_voice_record_slice_file;
                                            VoicePlugin.this.B.sendEmptyMessage(6);
                                        }
                                        IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.a(file.getAbsolutePath(), (short) 0, s), false);
                                    }
                                }) != 0) {
                                    voicePlugin.setRecordState(0);
                                    voicePlugin.c(327680);
                                    ad.a(voicePlugin.getContext(), (int) R.string.xm_sdk_voice_record_launch_error);
                                }
                            }
                        } else {
                            createPermissionGuard.a(voicePlugin.getActivity(), PermissionGuard.PERMISSION_MICROPHONE, "jcyf-e4b399808a333f25", (com.meituan.android.privacy.interfaces.d) new com.meituan.android.privacy.interfaces.g() { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.4
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.privacy.interfaces.d
                                public final void onResult(String str, int i2) {
                                    Object[] objArr4 = {str, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3400a2a7bba3edf269979fbc9a504240", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3400a2a7bba3edf269979fbc9a504240");
                                    } else if (i2 <= 0) {
                                        d.c("VoicePlugin::startRecord::onResult: %s", Integer.valueOf(i2));
                                        if (VoicePlugin.this.c(262144)) {
                                            return;
                                        }
                                        l.a(VoicePlugin.this.getContext(), R.string.xm_sdk_perm_audio);
                                    }
                                }
                            });
                        }
                    }
                }
                voicePlugin.c.setTag(Integer.valueOf(pointerId));
            }
        }
    }

    public static /* synthetic */ boolean b(VoicePlugin voicePlugin, boolean z) {
        voicePlugin.y = true;
        return true;
    }

    public static /* synthetic */ void d(VoicePlugin voicePlugin) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, voicePlugin, changeQuickRedirect, false, "d60e69cc3ff3f19e40c4c09719987f8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, voicePlugin, changeQuickRedirect, false, "d60e69cc3ff3f19e40c4c09719987f8f");
            return;
        }
        voicePlugin.A.a();
        IMClient.a().v();
        voicePlugin.setRecordState(0);
    }

    public VoicePlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c63ad839df1d6c5a51d719f34ab0389", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c63ad839df1d6c5a51d719f34ab0389");
        }
    }

    public VoicePlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd01afd67fc6b5f1d70df674dc604554", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd01afd67fc6b5f1d70df674dc604554");
        }
    }

    public VoicePlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c35b6970fa9c41c78d0c3213947fd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c35b6970fa9c41c78d0c3213947fd8");
            return;
        }
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = 10;
        this.A = new a();
        this.B = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce15b6a701a0270556fc7a33161e5c89", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce15b6a701a0270556fc7a33161e5c89");
                    return;
                }
                if (message != null) {
                    switch (message.what) {
                        case 1:
                            VoicePlugin.a(VoicePlugin.this);
                            break;
                        case 2:
                            VoicePlugin.this.l();
                        case 3:
                            VoicePlugin.this.k();
                            break;
                        case 4:
                            VoicePlugin.d(VoicePlugin.this);
                            break;
                        case 5:
                            VoicePlugin.e(VoicePlugin.this);
                            break;
                        case 6:
                            if (VoicePlugin.this.D && VoicePlugin.this.E != 0) {
                                ad.a(VoicePlugin.this.getActivity(), VoicePlugin.this.getResources().getString(VoicePlugin.this.E), XPlayerConstants.MEDIA_ERROR_IJK_PLAYER, 17, View.inflate(VoicePlugin.this.getContext(), R.layout.xm_sdk_toast_icon_view, null));
                                VoicePlugin.this.E = 0;
                                break;
                            }
                            break;
                    }
                }
                super.handleMessage(message);
            }
        };
        this.C = null;
        this.D = false;
        this.E = 0;
        setPluginClickClosable(true);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22bf00ff13cd097ff3752f17bcf4cdb1", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22bf00ff13cd097ff3752f17bcf4cdb1");
        }
        this.a = (LinearLayout) layoutInflater.inflate(R.layout.xm_sdk_send_panel_plugin_voice, viewGroup, false);
        this.d = this.a.findViewById(R.id.open_voice);
        this.c = (SimpleTextView) this.a.findViewById(R.id.press_to_talk);
        if (this.x) {
            this.a.removeView(this.d);
            this.a.addView(this.d, 0);
        }
        int i = this.a.getLayoutParams().height;
        if (i > 0) {
            this.a.getLayoutParams().width = i;
        }
        setIconView(this.d);
        this.c.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, final MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aed2fff14ac443d0723deb9fd74ad3e4", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aed2fff14ac443d0723deb9fd74ad3e4")).booleanValue();
                }
                if (VoicePlugin.this.k) {
                    return false;
                }
                if (motionEvent.getAction() == 0) {
                    com.sankuai.xm.imui.common.report.a.c(14);
                    com.sankuai.xm.log.c.b("session_click", "%s::open::%s", "VoicePlugin", "VoicePlugin_PressTalk");
                }
                if (view == VoicePlugin.this.c) {
                    VoicePlugin.this.post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fa8b9559857c1ff4c4ff66a9d7f2ae0", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fa8b9559857c1ff4c4ff66a9d7f2ae0");
                            } else {
                                VoicePlugin.a(VoicePlugin.this, motionEvent);
                            }
                        }
                    }));
                    return true;
                }
                return false;
            }
        });
        this.c.setFocusable(true);
        this.c.setContentDescription(getResources().getString(R.string.xm_sdk_voice_record_btn_text));
        return this.a;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b0df9a089c2f37d299c8078256ddfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b0df9a089c2f37d299c8078256ddfe");
            return;
        }
        b(1);
        this.c.setVisibility(0);
        this.a.getLayoutParams().width = -2;
        this.D = true;
        if (this.C != null) {
            com.sankuai.xm.imui.session.b.b(getActivity()).a(g.class, this.C);
        }
        this.C = new com.sankuai.xm.base.callback.c<g>() { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.c
            public final /* synthetic */ boolean a(g gVar) {
                g gVar2 = gVar;
                Object[] objArr2 = {gVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80f7184325668a0be26c9474807e66e5", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80f7184325668a0be26c9474807e66e5")).booleanValue();
                }
                if (gVar2.b == 3) {
                    VoicePlugin.this.D = false;
                    if (VoicePlugin.this.v == 2) {
                        d.b("VoicePlugin::onOpen paused when recording.", new Object[0]);
                        VoicePlugin.b(VoicePlugin.this, true);
                    }
                } else if (gVar2.b == 2) {
                    VoicePlugin.this.D = true;
                    VoicePlugin.this.B.sendEmptyMessage(6);
                }
                return false;
            }
        };
        com.sankuai.xm.imui.session.b.b(getActivity()).a(g.class, this.C, true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92b6146b228ad1a63d70c29b4f147e86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92b6146b228ad1a63d70c29b4f147e86");
        } else if (this.m == null) {
            View inflate = inflate(getContext(), R.layout.xm_sdk_send_panel_plugin_voice_recording_window, null);
            this.m = new PopupWindow(inflate, k.b(getContext()), -1);
            this.m.setClippingEnabled(false);
            this.n = (WaveView) inflate.findViewById(R.id.xm_sdk_recording_wave_text);
            this.o = inflate.findViewById(R.id.xm_sdk_recording_cancel_tip);
            this.p = inflate.findViewById(R.id.xm_sdk_recording_cancel_btn);
            this.q = inflate.findViewById(R.id.xm_sdk_recording_cancel_btn_circle);
            this.r = inflate.findViewById(R.id.xm_sdk_recording_cancel_btn_x);
            this.s = inflate.findViewById(R.id.xm_sdk_recording_send_tip);
            this.t = inflate.findViewById(R.id.xm_sdk_recording_press_btn);
            this.u = inflate.findViewById(R.id.xm_sdk_recording_press_btn_icon);
            float a2 = (k.a(getContext()) * 1.0f) / k.a(getContext(), 812.0f);
            d.a("VoicePlugin::adjustPopWinMargin scale: %s.", Float.valueOf(a2));
            if (a2 > 0.0f) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.s.getLayoutParams();
                layoutParams.bottomMargin = (int) (layoutParams.bottomMargin * a2);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
                layoutParams2.bottomMargin = (int) (layoutParams2.bottomMargin * a2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
                layoutParams3.bottomMargin = (int) (layoutParams3.bottomMargin * a2);
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
                layoutParams4.bottomMargin = (int) (layoutParams4.bottomMargin * a2);
            }
            com.sankuai.xm.imui.theme.b a3 = com.sankuai.xm.imui.theme.c.a().a(com.sankuai.xm.imui.session.b.b(getContext()).b());
            if (a3 == null || a3.p == null) {
                return;
            }
            ((LevelListDrawable) this.n.getBackground()).getCurrent().setColorFilter(new PorterDuffColorFilter(a3.p.intValue(), PorterDuff.Mode.SRC_ATOP));
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b51645e948624be0d843b48b846d90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b51645e948624be0d843b48b846d90");
            return;
        }
        b(0);
        int i = this.a.getLayoutParams().height;
        if (i > 0) {
            this.a.getLayoutParams().width = i;
        }
        this.w = false;
        this.c.setVisibility(8);
        this.B.removeCallbacksAndMessages(null);
        if (this.C != null) {
            com.sankuai.xm.imui.session.b.b(getActivity()).a(g.class, this.C);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2aed8ecb06009e18d7a9c73370e284", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2aed8ecb06009e18d7a9c73370e284") : getResources().getString(R.string.xm_sdk_app_plugin_voice);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final boolean a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf26744fcb94dafc939999cbf13eaa23", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf26744fcb94dafc939999cbf13eaa23")).booleanValue();
        }
        if (super.a(i, obj)) {
            return true;
        }
        if (327680 == i) {
            this.B.removeCallbacksAndMessages(null);
            this.A.a();
        }
        return false;
    }

    public void setReverse(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc0f6e35f9a827845c3579ceea93c7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc0f6e35f9a827845c3579ceea93c7d");
        } else if (this.x != z) {
            this.x = z;
            if (this.a == null || this.d == null) {
                return;
            }
            this.a.removeView(this.d);
            this.a.addView(this.d, z ? 0 : -1);
        }
    }

    private void setRecordState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77309dea5e06b2790311a0d8026c2dd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77309dea5e06b2790311a0d8026c2dd0");
        } else if (this.v != i) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9e94b6ca37499d64849374ef8095ead", 6917529027641081856L)) {
                if (!ActivityUtils.a(getActivity())) {
                    d.c("VoicePlugin::onRecordStateChange activity is invalid : state = " + i, new Object[0]);
                } else {
                    if (i == 0) {
                        this.B.removeCallbacksAndMessages(null);
                        if (this.m.isShowing()) {
                            p.b(this.m);
                        }
                    } else if (i == 1 && !this.m.isShowing()) {
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.xm_sdk_recording_cancel_btn_size_small);
                        this.q.getLayoutParams().width = dimensionPixelSize;
                        this.q.getLayoutParams().height = dimensionPixelSize;
                        p.a(this.m, getRootView(), 80, 0, 0);
                    }
                    switch (i) {
                        case 0:
                            this.w = false;
                            a(0, i);
                            this.n.a(false);
                            this.A.a();
                            this.B.removeCallbacksAndMessages(null);
                            break;
                        case 1:
                            a(0, i);
                            this.n.a(false);
                            this.n.setText(R.string.xm_sdk_voice_record_prepare);
                            l.a(4, this.o, this.s);
                            break;
                        case 2:
                            if (!this.w) {
                                this.n.a(true);
                            }
                            this.s.setVisibility(0);
                            this.o.setVisibility(4);
                            this.B.sendEmptyMessage(3);
                            a(0, i);
                            break;
                        case 3:
                            if (!this.w) {
                                this.n.a(true);
                            }
                            this.s.setVisibility(4);
                            this.o.setVisibility(0);
                            a(1, i);
                            break;
                    }
                }
            } else {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9e94b6ca37499d64849374ef8095ead");
            }
            this.v = i;
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81649aefdfd54640872df7697d91e024", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81649aefdfd54640872df7697d91e024");
        } else if (this.v == i2) {
        } else {
            this.t.getBackground().setLevel(i);
            this.r.getBackground().setLevel(i);
            this.q.getBackground().setLevel(i);
            if (!this.w) {
                this.n.b(i2 == 3);
            }
            if (i2 == 3 && this.v == 2) {
                this.q.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.xm_sdk_recording_zoom_in));
                this.u.getBackground().setColorFilter(new PorterDuffColorFilter(Color.rgb(187, 187, 187), PorterDuff.Mode.SRC_ATOP));
                return;
            }
            if (i2 == 2 && this.v == 3) {
                this.q.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.xm_sdk_recording_zoom_out));
            } else if (i2 != 0 && i2 != 1) {
                return;
            }
            this.u.getBackground().setColorFilter(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d02c1f545a223d9bdec69350646a4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d02c1f545a223d9bdec69350646a4e");
            return;
        }
        this.n.a((int) IMClient.a().y());
        this.B.sendEmptyMessageDelayed(3, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        int b;
        boolean c;
        private com.sankuai.xm.base.trace.g e;

        private a() {
            Object[] objArr = {VoicePlugin.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213ff000e4a99d3f88b62d44d5a8912c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213ff000e4a99d3f88b62d44d5a8912c");
            } else {
                this.e = j.a();
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08706d5249120e8751130430e97b5f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08706d5249120e8751130430e97b5f9");
            } else if (this.c) {
                this.c = false;
                VoicePlugin.this.w = false;
                VoicePlugin.this.B.removeCallbacks(this);
                this.b = VoicePlugin.this.z;
                VoicePlugin.this.post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.VoicePlugin.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54b5e9d7a698b1a2ed958dcfbdc288cd", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54b5e9d7a698b1a2ed958dcfbdc288cd");
                        } else {
                            VoicePlugin.this.n.a(true);
                        }
                    }
                }));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5810a29b685ad061a710017e3ada0265", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5810a29b685ad061a710017e3ada0265");
                return;
            }
            try {
                j.a(this.e);
                VoicePlugin.this.w = true;
                VoicePlugin.this.n.a(false);
                VoicePlugin.this.n.b(true);
                WaveView waveView = VoicePlugin.this.n;
                waveView.setText(this.b + VoicePlugin.this.getResources().getString(R.string.xm_sdk_voice_remain_time));
                this.b = this.b - 1;
                VoicePlugin.this.B.postDelayed(this, 1000L);
                j.c(this.e);
            } catch (Throwable th) {
                j.a(this.e, th);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8836f86bd782f208e353de2007822bd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8836f86bd782f208e353de2007822bd4");
            return;
        }
        setRecordState(0);
        IMClient.a().v();
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2034ea0bba884d211d478c37e24eb842", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2034ea0bba884d211d478c37e24eb842");
            return;
        }
        setRecordState(0);
        IMClient.a().w();
    }
}
