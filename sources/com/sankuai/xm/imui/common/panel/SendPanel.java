package com.sankuai.xm.imui.common.panel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.e;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.imui.base.BaseActivity;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
import com.sankuai.xm.imui.common.panel.plugin.VoicePlugin;
import com.sankuai.xm.imui.common.panel.plugin.b;
import com.sankuai.xm.imui.common.panel.plugin.c;
import com.sankuai.xm.imui.common.util.f;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.Observable;
import java.util.Observer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SendPanel extends LinearLayout implements BaseActivity.a, c.a {
    public static ChangeQuickRedirect a;
    public static int b = Color.parseColor("#CCCCCC");
    public SparseArray<Plugin> c;
    public boolean d;
    private a e;
    private FrameLayout f;
    private FrameLayout g;
    private ISendPanelAdapter h;
    private b i;
    private int j;
    private int k;
    private Plugin l;
    private Plugin m;
    private com.sankuai.xm.imui.common.processors.c n;
    private f o;
    private SessionFragment p;
    private com.sankuai.xm.imui.session.b q;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, Object obj);
    }

    public SendPanel(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a3c816e853981dd29693e192e074e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a3c816e853981dd29693e192e074e6");
        }
    }

    public SendPanel(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f7d1643796bdf581a5346b1778433e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f7d1643796bdf581a5346b1778433e");
        }
    }

    public SendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e7400f2f42a0fa87d098a175b11b8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e7400f2f42a0fa87d098a175b11b8e");
            return;
        }
        this.c = new SparseArray<>();
        this.d = true;
    }

    public final void a(SessionFragment sessionFragment) {
        Object[] objArr = {sessionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6008f5b369dc41f75fd652b0d40d904", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6008f5b369dc41f75fd652b0d40d904");
            return;
        }
        this.p = sessionFragment;
        setOrientation(1);
        inflate(getContext(), R.layout.xm_sdk_send_panel, this);
        this.g = (FrameLayout) findViewById(R.id.input_bar_container);
        this.f = (FrameLayout) findViewById(R.id.extra_panel_layout);
        this.k = getResources().getDimensionPixelOffset(R.dimen.xm_sdk_send_panel_min_option_height);
        this.j = e.a().getInt("input_height", this.k);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4441a9f7768fd69a2996f699c00d51b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4441a9f7768fd69a2996f699c00d51b4");
            return;
        }
        View createView = getSendPanelAdapter().createView(getContext(), this.g);
        if (createView.getParent() == null) {
            this.g.addView(createView);
        }
        a(this.g);
    }

    public void setEventListener(a aVar) {
        this.e = aVar;
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b24e926ea9b735cbb95f2b580037d88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b24e926ea9b735cbb95f2b580037d88");
        } else if (view != null) {
            if (view instanceof Plugin) {
                a((Plugin) view);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    a(viewGroup.getChildAt(i));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e1da0fd357cdeecca1fc5f860a61434", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e1da0fd357cdeecca1fc5f860a61434");
            return;
        }
        boolean z3 = this.l != null && this.l.isShown();
        z2 = ((this.i instanceof View) && ((View) this.i).isShown()) ? false : false;
        if (!z3 && !z2 && a()) {
            this.f.setVisibility(8);
            post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.SendPanel.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42e27656cb1385f78cbac1732f63d18a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42e27656cb1385f78cbac1732f63d18a");
                    } else {
                        SendPanel.this.b();
                    }
                }
            }));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b8ffc715c772c91f00872a4da9793c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b8ffc715c772c91f00872a4da9793c")).booleanValue() : this.f != null && this.f.isShown();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9216c762635a375c3c152d7fe24d9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9216c762635a375c3c152d7fe24d9e");
            return;
        }
        if (this.f != null && this.f.getVisibility() != 8) {
            this.f.setVisibility(8);
            l.a((ViewGroup) this.f);
        }
        c();
    }

    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7483259b53a48ce087a360d8bb7c83c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7483259b53a48ce087a360d8bb7c83c8");
            return;
        }
        if (z) {
            b();
        }
        if (!this.d) {
            for (int i = 0; i < this.c.size(); i++) {
                Plugin valueAt = this.c.valueAt(i);
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = Plugin.e;
                if (PatchProxy.isSupport(objArr2, valueAt, changeQuickRedirect2, false, "57d0c37f1cf7d82994bc585181012d7e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, valueAt, changeQuickRedirect2, false, "57d0c37f1cf7d82994bc585181012d7e");
                } else if (z != valueAt.k) {
                    valueAt.k = z;
                    valueAt.a(z);
                    if (z) {
                        valueAt.c(458752);
                    }
                }
            }
        }
        if (this.h != null) {
            this.h.onInputStateChange(z ? 2 : 1, str);
        }
    }

    public b getInputEditorPlugin() {
        return this.i;
    }

    public com.sankuai.xm.imui.common.processors.c getEmotionProcessor() {
        return this.n;
    }

    public void setEmotionProcessor(com.sankuai.xm.imui.common.processors.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5efeeb12eedbc09d019224263e354c4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5efeeb12eedbc09d019224263e354c4d");
            return;
        }
        this.n = cVar;
        com.sankuai.xm.imui.common.processors.f.b().b = cVar;
    }

    public void setKeyboardHelper(f fVar) {
        this.o = fVar;
    }

    public ISendPanelAdapter getSendPanelAdapter() {
        return this.h;
    }

    public void setSendPanelAdapter(ISendPanelAdapter iSendPanelAdapter) {
        if (iSendPanelAdapter != null) {
            this.h = iSendPanelAdapter;
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7dfd33429afd3542ab438ed7323f4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7dfd33429afd3542ab438ed7323f4c");
            return;
        }
        l.a(z ? 0 : 8, findViewById(R.id.xm_sdk_send_panel_bottom_divider));
    }

    public final void a(final Plugin plugin) {
        Object[] objArr = {plugin};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c0942dcdcac8a3c8072cbfa14e78c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c0942dcdcac8a3c8072cbfa14e78c3");
        } else if (plugin == null || this.c.indexOfValue(plugin) != -1) {
        } else {
            this.c.put(d(), plugin);
            plugin.setEventListener(this);
            if (this.i == null && (plugin instanceof VoicePlugin)) {
                ((VoicePlugin) plugin).setReverse(true);
            }
            plugin.a(this);
            if (plugin.f && this.l == null) {
                if (plugin instanceof b) {
                    plugin.postDelayed(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.SendPanel.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9017f9f348e9931d7edcbd73a993bd6", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9017f9f348e9931d7edcbd73a993bd6");
                            } else {
                                plugin.g();
                            }
                        }
                    }), 200L);
                } else {
                    plugin.g();
                }
            }
            if ((plugin instanceof b) && this.i == null) {
                this.i = (b) plugin;
                if (this.o != null) {
                    this.o.addObserver(new Observer() { // from class: com.sankuai.xm.imui.common.panel.SendPanel.3
                        public static ChangeQuickRedirect a;

                        @Override // java.util.Observer
                        public final void update(Observable observable, Object obj) {
                            Object[] objArr2 = {observable, obj};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c19acc015becf5e8915121a0db7b6a23", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c19acc015becf5e8915121a0db7b6a23");
                                return;
                            }
                            Integer num = (Integer) obj;
                            if (num.intValue() > 0 || !(SendPanel.this.l instanceof b) || !SendPanel.this.l.i) {
                                SendPanel.this.setOptionViewHeight(num.intValue());
                                if (SendPanel.this.l != null) {
                                    SendPanel.this.b(SendPanel.this.l);
                                    return;
                                }
                                return;
                            }
                            SendPanel.this.l.h();
                        }
                    });
                }
            }
        }
    }

    public final <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea43e95b4d84fa1f82cead75d56f107", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea43e95b4d84fa1f82cead75d56f107");
        }
        for (int i = 0; i < this.c.size(); i++) {
            Plugin valueAt = this.c.valueAt(i);
            if (cls.isInstance(valueAt)) {
                return cls.cast(valueAt);
            }
        }
        return null;
    }

    public ViewGroup getOptionViewContainer() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptionViewHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2607bf709ef0423431d9994478442016", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2607bf709ef0423431d9994478442016");
            return;
        }
        if (i <= this.k) {
            i = this.k;
        }
        if (this.j != i) {
            this.j = i;
            e.a().edit().putInt("input_height", this.j).apply();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90c05ae1a77ef9f2042bca07446c81a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90c05ae1a77ef9f2042bca07446c81a")).booleanValue();
        }
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0 && this.o != null) {
            this.o.d = false;
            boolean a2 = a();
            c();
            if (a2) {
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.c.a
    public final boolean a(Plugin plugin, int i, Object obj) {
        Object[] objArr = {plugin, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f30036995ad1eb8c74c1baf3f16c83", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f30036995ad1eb8c74c1baf3f16c83")).booleanValue();
        }
        if (getSendPanelAdapter().onPluginEvent(plugin, i, obj)) {
            return true;
        }
        if (i != 65536) {
            if (i == 131072) {
                c(plugin);
                if (this.l == plugin) {
                    this.l = null;
                    if (this.m != null) {
                        this.m.g();
                    } else {
                        b(null);
                    }
                }
            } else if (i == 393216) {
                a(3, (Object) null);
            }
        } else if (plugin.g && this.l != plugin) {
            c(plugin);
            if (l.a(this.g, plugin)) {
                if (a() && plugin.getOptionView() != null) {
                    a(1, (Object) null);
                }
                View findViewById = findViewById(plugin.getNextFocusId());
                this.m = findViewById instanceof Plugin ? (Plugin) findViewById : null;
                Plugin plugin2 = this.l;
                this.l = plugin;
                if (plugin2 != null) {
                    plugin2.h();
                }
                b(plugin);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Plugin plugin) {
        Object[] objArr = {plugin};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0969f9e317d14fcd127168ac2825ce1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0969f9e317d14fcd127168ac2825ce1b");
        } else if (this.f == null || !ActivityUtils.a((Activity) this.p.getActivity())) {
        } else {
            View optionView = plugin != null ? plugin.getOptionView() : null;
            l.a((ViewGroup) this.f);
            if (optionView != null) {
                if (this.q == null) {
                    this.q = com.sankuai.xm.imui.session.b.b(getContext());
                }
                if (this.q.c.r) {
                    if (plugin instanceof b) {
                        int i = -2;
                        if ((getRootView().getLayoutParams() instanceof WindowManager.LayoutParams) && (((WindowManager.LayoutParams) getRootView().getLayoutParams()).softInputMode & 240) == 48) {
                            int i2 = this.o.c;
                            if (Build.VERSION.SDK_INT <= 29 || (this.o.e && this.o.a(this.f) < i2)) {
                                i = i2;
                            }
                        }
                        this.f.addView(optionView, -1, i);
                    } else if (plugin.h) {
                        int i3 = this.j;
                        if (optionView.getMinimumHeight() > 0) {
                            i3 = Math.max(this.j, optionView.getMinimumHeight());
                        }
                        this.f.addView(optionView, -1, i3);
                    } else {
                        this.f.addView(optionView);
                    }
                } else if (plugin.h && plugin != this.i) {
                    int i4 = this.j;
                    if (optionView.getMinimumHeight() > 0) {
                        i4 = Math.max(this.j, optionView.getMinimumHeight());
                    }
                    this.f.addView(optionView, -1, i4);
                } else {
                    this.f.addView(optionView);
                }
                this.f.setVisibility(0);
                a(2, (Object) null);
                return;
            }
            this.f.setVisibility(8);
        }
    }

    private void c(Plugin plugin) {
        Object[] objArr = {plugin};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60efeec71512b1f9a834ac1a622bc0e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60efeec71512b1f9a834ac1a622bc0e1");
        } else if (this.o != null) {
            if (plugin == this.i) {
                this.o.a();
                this.o.d = plugin.i;
            }
            setOptionViewHeight(this.o.c);
        }
    }

    private void a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3430468465cbb1af3afbc05492cf18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3430468465cbb1af3afbc05492cf18");
        } else if (this.e != null) {
            this.e.a(i, null);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0130134e079ac1b845e44378707cd45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0130134e079ac1b845e44378707cd45");
        } else if (this.l != null) {
            this.m = null;
            this.l.h();
        }
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576dbf4e44e71914b332e471e570d390", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576dbf4e44e71914b332e471e570d390")).intValue();
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (this.c.get(i) == null) {
                return i;
            }
        }
        return size;
    }

    public final void a(Plugin plugin, @NonNull Intent intent, @IntRange(from = 0, to = 127) int i) {
        Object[] objArr = {plugin, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c7fc1ef70786890c8d94387f6d66e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c7fc1ef70786890c8d94387f6d66e0");
            return;
        }
        int indexOfValue = this.c.indexOfValue(plugin) + 1;
        if (this.p == null || indexOfValue <= 0) {
            return;
        }
        int i2 = (indexOfValue << 8) | i;
        intent.putExtra(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i2);
        this.p.startActivityForResult(intent, i2);
    }

    @Override // com.sankuai.xm.imui.base.BaseActivity.a
    public void onActivityResult(int i, int i2, Intent intent) {
        Plugin valueAt;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee87a716f0cb7d2e29adccf8afbadd11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee87a716f0cb7d2e29adccf8afbadd11");
            return;
        }
        int i3 = (i >> 8) - 1;
        if (i3 < 0 || i3 >= this.c.size() || (valueAt = this.c.valueAt(i3)) == null) {
            return;
        }
        valueAt.onActivityResult(i & 255, i2, intent);
    }
}
