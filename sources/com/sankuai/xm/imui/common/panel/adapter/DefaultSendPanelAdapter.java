package com.sankuai.xm.imui.common.panel.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
import com.sankuai.xm.imui.common.panel.plugin.b;
import com.sankuai.xm.imui.common.util.h;
import com.sankuai.xm.imui.common.util.l;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DefaultSendPanelAdapter implements ISendPanelAdapter {
    public static ChangeQuickRedirect l;
    private int a;
    private View b;
    private View c;
    private View d;
    private Plugin e;
    private Plugin f;
    private Plugin g;
    private Plugin h;
    private String i;
    private TextView j;

    @Override // com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public void destroy() {
    }

    public boolean e() {
        return true;
    }

    public DefaultSendPanelAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb19c11bb74209178a9ceb6dfea900f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb19c11bb74209178a9ceb6dfea900f");
        } else {
            this.a = 1;
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "246ff6f3722127f8284d899b4b948c17", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "246ff6f3722127f8284d899b4b948c17");
        }
        View inflate = View.inflate(context, R.layout.xm_sdk_send_panel_layout, viewGroup);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.xm_sdk_send_panel_top_divider);
        if (!e()) {
            findViewById.setVisibility(8);
        }
        inflate.findViewById(R.id.xm_sdk_send_panel_bottom_divider);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.xm_sdk_send_panel_input_normal);
        viewStub.setLayoutResource(h.a(context, a(context), R.layout.xm_sdk_send_panel_input_bar_empty));
        viewStub.setLayoutInflater(new a(context));
        this.b = viewStub.inflate();
        this.c = this.d.findViewById(R.id.xm_sdk_send_panel_input_forbidden);
        if (this.c != null) {
            this.j = (TextView) this.c.findViewById(R.id.input_bar_forbidden_tv);
        }
        this.e = (Plugin) inflate.findViewById(R.id.editor_plugin);
        this.f = (Plugin) inflate.findViewWithTag("SEND");
        if (this.f == null) {
            this.f = (Plugin) inflate.findViewById(R.id.send_plugin);
        }
        this.h = (Plugin) inflate.findViewById(R.id.voice_plugin);
        this.g = (Plugin) inflate.findViewWithTag("ALT:SEND");
        if (this.g == null && TextUtils.isEmpty(null)) {
            this.g = this.h;
        }
        Plugin plugin = (Plugin) inflate.findViewById(R.id.extra_plugin);
        if (plugin != null && this.e != null && plugin.getNextFocusId() == -1) {
            plugin.setNextFocusId(R.id.editor_plugin);
        }
        Plugin plugin2 = (Plugin) inflate.findViewById(R.id.emotion_plugin);
        if (plugin2 != null && this.e != null && plugin2.getNextFocusId() == -1) {
            plugin2.setNextFocusId(R.id.editor_plugin);
        }
        if (this.h != null && this.e != null && this.h.getNextFocusId() == -1) {
            this.h.setNextFocusId(R.id.editor_plugin);
        }
        onInputStateChange(this.a, null);
        a();
        return inflate;
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public boolean onPluginEvent(Plugin plugin, int i, Object obj) {
        Object[] objArr = {plugin, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a29100032efc3054eca69282c6825c9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a29100032efc3054eca69282c6825c9")).booleanValue();
        }
        if (plugin == null) {
            return false;
        }
        if (this.e == plugin && this.e.getVisibility() == 0) {
            if (i == 2 || (i == 65536 && (this.e instanceof b) && !TextUtils.isEmpty(((b) this.e).getEditText().getText()))) {
                l.a(0, this.f);
                l.a(8, this.g);
            } else if (i == 1 || i == 458752) {
                l.a(8, this.f);
                l.a(0, this.g);
            }
        } else if (this.h == plugin) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            if (i == 65536) {
                l.a(8, this.e, this.f);
                l.a(0, this.h);
                layoutParams.weight = 1.0f;
                layoutParams.width = 0;
                this.h.requestLayout();
                if (this.e != null) {
                    l.a(8, this.f);
                    l.a(0, this.g);
                }
            } else if (i == 131072) {
                l.a(0, this.e);
                layoutParams.weight = 0.0f;
                layoutParams.width = -2;
                this.h.requestLayout();
            }
        }
        if (i != 458752 && this.e != null && this.e.isShown() && (this.e instanceof b) && !TextUtils.isEmpty(((b) this.e).getEditText().getText())) {
            l.a(0, this.f);
            l.a(8, this.g);
        }
        return false;
    }

    @Override // com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public void onInputStateChange(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e8a07eb7cff387bf417902f9f4a9586", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e8a07eb7cff387bf417902f9f4a9586");
        } else if (this.a == i) {
        } else {
            this.a = i;
            if (i == 2) {
                a(obj instanceof String ? (String) obj : null);
            }
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d1b376f919eda6db066994d3f09ec0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d1b376f919eda6db066994d3f09ec0");
        } else if (this.d == null) {
        } else {
            this.d.post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r11 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.AnonymousClass1.a
                        java.lang.String r10 = "db727583d6a92ff53499d269f97a50d2"
                        r4 = 0
                        r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                        r1 = r8
                        r2 = r11
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L18
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                        return
                    L18:
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r1 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        android.view.View r1 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.a(r1)
                        com.sankuai.xm.imui.session.SessionFragment r1 = com.sankuai.xm.imui.session.b.a(r1)
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L43
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r4 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        int r4 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.b(r4)
                        if (r4 == r2) goto L30
                        r4 = 1
                        goto L31
                    L30:
                        r4 = 0
                    L31:
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r5 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        java.lang.String r5 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.c(r5)
                        r1.a(r4, r5)
                        com.sankuai.xm.imui.common.panel.SendPanel r4 = r1.v
                        if (r4 == 0) goto L43
                        com.sankuai.xm.imui.common.panel.SendPanel r1 = r1.v
                        boolean r1 = r1.d
                        goto L44
                    L43:
                        r1 = 1
                    L44:
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r4 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        int r4 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.b(r4)
                        r5 = 8
                        if (r4 != r2) goto La4
                        r2 = 0
                        if (r1 == 0) goto L72
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r1 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        android.widget.TextView r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.d(r1)
                        android.view.View[] r1 = new android.view.View[r3]
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r4 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        android.view.View r4 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.e(r4)
                        r1[r0] = r4
                        com.sankuai.xm.imui.common.util.l.a(r5, r1)
                        android.view.View[] r1 = new android.view.View[r3]
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r3 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        android.view.View r3 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.f(r3)
                        r1[r0] = r3
                        com.sankuai.xm.imui.common.util.l.a(r0, r1)
                        goto L88
                    L72:
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        com.sankuai.xm.imui.common.panel.plugin.Plugin r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.g(r0)
                        boolean r0 = r0 instanceof com.sankuai.xm.imui.common.panel.plugin.b
                        if (r0 == 0) goto L88
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        com.sankuai.xm.imui.common.panel.plugin.Plugin r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.g(r0)
                        com.sankuai.xm.imui.common.panel.plugin.b r0 = (com.sankuai.xm.imui.common.panel.plugin.b) r0
                        android.widget.EditText r2 = r0.getEditText()
                    L88:
                        if (r2 != 0) goto L8b
                        return
                    L8b:
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        java.lang.String r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.c(r0)
                        if (r0 == 0) goto L9d
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        java.lang.String r0 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.c(r0)
                        r2.setText(r0)
                        goto Lc8
                    L9d:
                        r0 = 2131366369(0x7f0a11e1, float:1.835263E38)
                        r2.setText(r0)
                        return
                    La4:
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        int r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.b(r2)
                        if (r2 != r3) goto Lc8
                        if (r1 == 0) goto Lc8
                        android.view.View[] r1 = new android.view.View[r3]
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        android.view.View r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.e(r2)
                        r1[r0] = r2
                        com.sankuai.xm.imui.common.util.l.a(r0, r1)
                        android.view.View[] r1 = new android.view.View[r3]
                        com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.this
                        android.view.View r2 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.f(r2)
                        r1[r0] = r2
                        com.sankuai.xm.imui.common.util.l.a(r5, r1)
                    Lc8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.AnonymousClass1.run():void");
                }
            }));
        }
    }

    public void a(String str) {
        this.i = str;
    }

    public void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6db6029052bab207877dea990d83020", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6db6029052bab207877dea990d83020");
        } else {
            onInputStateChange(z ? 2 : 1, str);
        }
    }

    public int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013bc7c2485d7acbfcc7088d2c0ee583", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013bc7c2485d7acbfcc7088d2c0ee583")).intValue() : !TextUtils.isEmpty(null) ? R.layout.xm_sdk_send_panel_input_bar_empty : R.layout.xm_sdk_send_panel_input_bar_emotion;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a extends LayoutInflater {
        public static ChangeQuickRedirect a;
        private LayoutInflater c;

        public a(Context context) {
            super(context);
            Object[] objArr = {DefaultSendPanelAdapter.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a7e8cbe014f45dbde3adf158c37c43", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a7e8cbe014f45dbde3adf158c37c43");
            } else {
                this.c = LayoutInflater.from(context);
            }
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "809489a48a085233f36f53cdd6d2c52f", 6917529027641081856L) ? (LayoutInflater) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "809489a48a085233f36f53cdd6d2c52f") : new a(context);
        }

        @Override // android.view.LayoutInflater
        public final View inflate(int i, @Nullable ViewGroup viewGroup, boolean z) {
            Object[] objArr = {Integer.valueOf(i), viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b81a77e849b91c918e2e5bdfbecce9", 6917529027641081856L)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b81a77e849b91c918e2e5bdfbecce9");
            }
            View inflate = this.c.inflate(i, viewGroup, z);
            if (i == R.layout.xm_sdk_send_panel_input_bar_empty) {
                a(getContext(), (LinearLayout) inflate);
            }
            return inflate;
        }

        private void a(Context context, LinearLayout linearLayout) {
            Object[] objArr = {context, linearLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca12773c3462bb0e2435a56c50847982", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca12773c3462bb0e2435a56c50847982");
                return;
            }
            String str = null;
            if (TextUtils.isEmpty(null)) {
                return;
            }
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            if (com.sankuai.xm.base.util.b.b(split)) {
                return;
            }
            for (int i = 0; i < split.length; i++) {
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                        String[] split2 = str2.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                        if (split2.length == 2) {
                            if ("SEND".equals(split2[0])) {
                                split2[0] = split2[1];
                                split2[1] = "SEND";
                            }
                            Plugin a2 = a(context, split2[0]);
                            a(linearLayout, a2, split, i);
                            Plugin a3 = a(context, split2[1]);
                            if (a3 != null) {
                                if (a2 != null) {
                                    a3.setVisibility(8);
                                    a3.setTag(split2[1]);
                                    a2.setTag("ALT:" + split2[1]);
                                }
                                a(linearLayout, a3, split, i);
                            }
                        }
                    } else {
                        a(linearLayout, a(context, str2), split, i);
                    }
                }
            }
        }

        private void a(ViewGroup viewGroup, Plugin plugin, String[] strArr, int i) {
            Object[] objArr = {viewGroup, plugin, strArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15ef4362598c470f93b28a5841f9618", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15ef4362598c470f93b28a5841f9618");
                return;
            }
            if (plugin instanceof VoicePlugin) {
                int i2 = i;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    } else if (TextUtils.isEmpty(strArr[i2]) || !strArr[i2].contains("EDITOR")) {
                        i2++;
                    } else {
                        ((VoicePlugin) plugin).setReverse(i2 > i);
                    }
                }
            }
            if (plugin != null) {
                viewGroup.addView(plugin);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
            if (r15.equals("EDITOR") != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.sankuai.xm.imui.common.panel.plugin.Plugin a(android.content.Context r14, java.lang.String r15) {
            /*
                r13 = this;
                r0 = 2
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r14
                r10 = 1
                r8[r10] = r15
                com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.a.a
                java.lang.String r12 = "90da8d37ae6d9f47c5b02b7f268cc2a2"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r8
                r2 = r13
                r3 = r11
                r5 = r12
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L21
                java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
                com.sankuai.xm.imui.common.panel.plugin.Plugin r14 = (com.sankuai.xm.imui.common.panel.plugin.Plugin) r14
                return r14
            L21:
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r2 = -2
                r1.<init>(r2, r2)
                java.lang.String r15 = r15.trim()
                r2 = -1
                int r3 = r15.hashCode()
                switch(r3) {
                    case -906777541: goto L5b;
                    case 2541448: goto L51;
                    case 66427888: goto L47;
                    case 81848594: goto L3d;
                    case 2040468845: goto L34;
                    default: goto L33;
                }
            L33:
                goto L65
            L34:
                java.lang.String r3 = "EDITOR"
                boolean r15 = r15.equals(r3)
                if (r15 == 0) goto L65
                goto L66
            L3d:
                java.lang.String r0 = "VOICE"
                boolean r15 = r15.equals(r0)
                if (r15 == 0) goto L65
                r0 = 3
                goto L66
            L47:
                java.lang.String r0 = "EXTRA"
                boolean r15 = r15.equals(r0)
                if (r15 == 0) goto L65
                r0 = 0
                goto L66
            L51:
                java.lang.String r0 = "SEND"
                boolean r15 = r15.equals(r0)
                if (r15 == 0) goto L65
                r0 = 4
                goto L66
            L5b:
                java.lang.String r0 = "EMOTION"
                boolean r15 = r15.equals(r0)
                if (r15 == 0) goto L65
                r0 = 1
                goto L66
            L65:
                r0 = -1
            L66:
                switch(r0) {
                    case 0: goto L9b;
                    case 1: goto L8f;
                    case 2: goto L7d;
                    case 3: goto L71;
                    case 4: goto L6b;
                    default: goto L69;
                }
            L69:
                r15 = 0
                goto La6
            L6b:
                com.sankuai.xm.imui.common.panel.plugin.SendPlugin r15 = new com.sankuai.xm.imui.common.panel.plugin.SendPlugin
                r15.<init>(r14)
                goto La6
            L71:
                com.sankuai.xm.imui.common.panel.plugin.VoicePlugin r15 = new com.sankuai.xm.imui.common.panel.plugin.VoicePlugin
                r15.<init>(r14)
                r14 = 2131690771(0x7f0f0513, float:1.9010595E38)
                r15.setId(r14)
                goto La6
            L7d:
                com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin r15 = new com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin
                r15.<init>(r14)
                r14 = 2131690772(0x7f0f0514, float:1.9010597E38)
                r15.setId(r14)
                r1.width = r9
                r14 = 1065353216(0x3f800000, float:1.0)
                r1.weight = r14
                goto La6
            L8f:
                com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin r15 = new com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin
                r15.<init>(r14)
                r14 = 2131691652(0x7f0f0884, float:1.9012382E38)
                r15.setId(r14)
                goto La6
            L9b:
                com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin r15 = new com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin
                r15.<init>(r14)
                r14 = 2131690774(0x7f0f0516, float:1.9010601E38)
                r15.setId(r14)
            La6:
                if (r15 == 0) goto Lab
                r15.setLayoutParams(r1)
            Lab:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter.a.a(android.content.Context, java.lang.String):com.sankuai.xm.imui.common.panel.plugin.Plugin");
        }
    }
}
