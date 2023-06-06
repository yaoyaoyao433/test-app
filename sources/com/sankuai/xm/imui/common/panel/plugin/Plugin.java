package com.sankuai.xm.imui.common.panel.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.AnyRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntRange;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.imui.base.BaseActivity;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.plugin.c;
import com.sankuai.xm.imui.common.util.d;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class Plugin extends RelativeLayout implements BaseActivity.a, c {
    public static ChangeQuickRedirect e;
    private LayoutInflater a;
    private SendPanel b;
    private c.a c;
    private CharSequence d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    boolean j;
    public boolean k;
    final ArrayList<c.a> l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private View s;
    private View t;

    public abstract void a();

    public void b() {
    }

    public void d() {
    }

    public void e() {
    }

    @DrawableRes
    public abstract int getPluginIcon();

    @NonNull
    public abstract CharSequence getPluginName();

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public Plugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19953102d929bf30eaa7d63347210503", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19953102d929bf30eaa7d63347210503");
        }
    }

    public Plugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397db657e580fcd0b097b15efad833a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397db657e580fcd0b097b15efad833a8");
        }
    }

    public Plugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38a068f3e396225abca80363db7121b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38a068f3e396225abca80363db7121b");
            return;
        }
        this.j = false;
        this.k = false;
        this.l = new ArrayList<>();
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.plugin_icon, R.attr.plugin_name, R.attr.plugin_focusable, R.attr.plugin_click_closable, R.attr.plugin_next_focus, R.attr.plugin_default_focused, R.attr.plugin_use_keyboard_height, R.attr.plugin_option_view_layout, R.attr.plugin_option_view_config});
        this.f = obtainStyledAttributes.getBoolean(5, false);
        this.g = obtainStyledAttributes.getBoolean(2, true);
        this.r = obtainStyledAttributes.getBoolean(3, false);
        this.h = obtainStyledAttributes.getBoolean(6, true);
        this.o = obtainStyledAttributes.getResourceId(4, -1);
        this.m = obtainStyledAttributes.getResourceId(0, getPluginIcon());
        this.p = obtainStyledAttributes.getResourceId(7, 0);
        this.q = obtainStyledAttributes.getResourceId(8, 0);
        this.d = obtainStyledAttributes.getString(1);
        if (this.d == null) {
            this.d = getPluginName();
        }
        obtainStyledAttributes.recycle();
    }

    public void a(SendPanel sendPanel) {
        Object[] objArr = {sendPanel};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8e2df82e9596bfad20a2ed844db18f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8e2df82e9596bfad20a2ed844db18f");
        } else if (this.j) {
        } else {
            this.j = true;
            this.b = sendPanel;
            View b = b(this.a, this);
            if (b != null) {
                addView(b);
            } else {
                b = this;
            }
            if (this.t == null) {
                setIconView(b);
            }
            d();
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37644fe3ddb99f58d474fdd2c0e918b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37644fe3ddb99f58d474fdd2c0e918b8");
        } else {
            e();
        }
    }

    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6524e9ad006e4ea5228082f31486f4", 6917529027641081856L) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6524e9ad006e4ea5228082f31486f4") : layoutInflater.inflate(R.layout.xm_sdk_send_panel_plugin_icon, viewGroup, false);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ced49dcc6f7c6abafd1ea57e1be21a", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ced49dcc6f7c6abafd1ea57e1be21a");
        }
        if (this.p != 0) {
            return layoutInflater.inflate(this.p, viewGroup, false);
        }
        return null;
    }

    public View getOptionView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1b85aa7df6c0ef2ed603cf6b0794be", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1b85aa7df6c0ef2ed603cf6b0794be");
        }
        if (this.s == null) {
            j();
        }
        return this.s;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec095ba190760d53f6751d35ce687aa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec095ba190760d53f6751d35ce687aa9");
        } else if (this.k) {
        } else {
            try {
                com.sankuai.xm.imui.common.report.a.a((Class<? extends Plugin>) getClass());
                com.sankuai.xm.log.c.b("session_click", "%s::open.", getClass().getName());
                this.i = true;
                c(65536);
                a();
            } catch (Throwable th) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "plugin:open::" + getClass().getName(), th);
                d.a(th, "plugin:open::" + getClass().getName(), new Object[0]);
            }
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5fab33b9cb64ebbc5e29feac964e018", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5fab33b9cb64ebbc5e29feac964e018");
        } else if (this.k) {
        } else {
            this.i = false;
            b();
            c(131072);
        }
    }

    public final boolean i() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d252abfec0c396054f54b73885d5dde1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d252abfec0c396054f54b73885d5dde1");
            return;
        }
        this.l.clear();
        if (this.k && getIconView().getBackground() != null) {
            getIconView().getBackground().clearColorFilter();
        }
        super.onDetachedFromWindow();
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b380f6660fea13be37e08d95ebd1ff18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b380f6660fea13be37e08d95ebd1ff18");
            return;
        }
        Drawable background = getIconView().getBackground();
        if (background != null) {
            if (z) {
                background.setColorFilter(new PorterDuffColorFilter(SendPanel.b, PorterDuff.Mode.SRC_ATOP));
            } else {
                background.setColorFilter(null);
            }
            getIconView().setBackground(background);
        }
    }

    public void ae_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755531bb18c4c13dc422e1a16f88ba24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755531bb18c4c13dc422e1a16f88ba24");
        } else if (c(196608)) {
        } else {
            if (this.r && this.i) {
                h();
            } else {
                g();
            }
        }
    }

    @DrawableRes
    public int getCornerMark() {
        return this.n;
    }

    public void setCornerMark(@DrawableRes int i) {
        this.n = i;
    }

    public void setIconView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dd75ad6790ce11970081a962a2d5ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dd75ad6790ce11970081a962a2d5ebb");
        } else if (view == null) {
        } else {
            this.t = view;
            CharSequence pluginName = getPluginName();
            if (!TextUtils.isEmpty(pluginName) && TextUtils.isEmpty(view.getContentDescription())) {
                view.setContentDescription(pluginName);
            }
            if (this.m > 0) {
                view.setBackground(android.support.v7.content.res.b.b(getContext(), this.m));
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.Plugin.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5316d88e8fd264b73d4a45a3f93b0416", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5316d88e8fd264b73d4a45a3f93b0416");
                    } else {
                        Plugin.this.ae_();
                    }
                }
            });
        }
    }

    public View getIconView() {
        return this.t;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86bbe294e80ef942d5152a65a3b7e01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86bbe294e80ef942d5152a65a3b7e01");
        } else if (getIconView() == null || getIconView().getBackground() == null) {
        } else {
            getIconView().getBackground().setLevel(i);
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99ffb604f7f36df17610df8ecb08c13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99ffb604f7f36df17610df8ecb08c13");
        } else {
            this.s = a(this.a, this.b == null ? null : this.b.getOptionViewContainer());
        }
    }

    public void setName(CharSequence charSequence) {
        this.d = charSequence;
    }

    public CharSequence getName() {
        return this.d;
    }

    public int getIconResource() {
        return this.m;
    }

    public void setIconResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c90b2809aaee0609615044c1a3ab4f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c90b2809aaee0609615044c1a3ab4f7");
        } else if (i != this.m) {
            this.m = i;
            if (this.t != null) {
                this.t.setBackgroundResource(this.m);
            }
        }
    }

    public int getOptionLayoutResource() {
        return this.p;
    }

    public void setOptionLayoutResource(@LayoutRes int i) {
        if (this.p != i) {
            this.p = i;
        }
    }

    public int getOptionConfigResource() {
        return this.q;
    }

    public void setOptionConfigResource(@AnyRes int i) {
        this.q = i;
    }

    public void setPluginClickClosable(boolean z) {
        this.r = z;
    }

    public int getNextFocusId() {
        return this.o;
    }

    public void setNextFocusId(int i) {
        if (i > 0) {
            this.o = i;
        }
    }

    public void setPluginFocusable(boolean z) {
        this.g = z;
    }

    public void setDefaultFocused(boolean z) {
        this.f = z;
    }

    public void setUseKeyboardHeight(boolean z) {
        this.h = z;
    }

    public SendPanel getSendPanel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343dbe297fd916cc5aa86c94f380b7f4", 6917529027641081856L)) {
            return (SendPanel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343dbe297fd916cc5aa86c94f380b7f4");
        }
        if (this.b == null) {
            this.b = (SendPanel) getActivity().findViewById(R.id.xm_sdk_send_panel);
        }
        return this.b;
    }

    public void setEventListener(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcabac565eef3504f971329c4d3794e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcabac565eef3504f971329c4d3794e1");
            return;
        }
        c.a aVar2 = this.c;
        Object[] objArr2 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6f6389bdc4f9f361405ea8db74338eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6f6389bdc4f9f361405ea8db74338eb");
        } else if (aVar2 != null) {
            this.l.remove(aVar2);
        }
        if (aVar != null) {
            this.l.add(0, aVar);
        }
        this.c = aVar;
    }

    public final boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e362c00f77a9927a03004f64b2436e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e362c00f77a9927a03004f64b2436e")).booleanValue() : a(i, (Object) null);
    }

    public boolean a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f80aa99662f649e36d1c55f68cb9c9a9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f80aa99662f649e36d1c55f68cb9c9a9")).booleanValue();
        }
        if (i == 262144 || i == 327680 || i == 458752) {
            if (this.i) {
                h();
            }
            this.i = false;
        }
        if (!this.k || i == 458752) {
            Iterator<c.a> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().a(this, i, obj)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2b0fab36b63adc8795ab22d8e9dade", 6917529027641081856L) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2b0fab36b63adc8795ab22d8e9dade") : ActivityUtils.a(getContext());
    }

    public final void a(@NonNull Intent intent, @IntRange(from = 0, to = 127) int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f5ccf84df5ba8d494d4c5d14c05e08c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f5ccf84df5ba8d494d4c5d14c05e08c");
            return;
        }
        try {
            if (this.b != null) {
                this.b.a(this, intent, i);
            }
        } catch (Throwable th) {
            d.a(th);
            ad.a(getContext(), (int) R.string.xm_sdk_common_launch_failed);
        }
    }
}
