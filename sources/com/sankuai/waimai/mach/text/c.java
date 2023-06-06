package com.sankuai.waimai.mach.text;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "164dc0eb1961afb203adcd52512f0f52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "164dc0eb1961afb203adcd52512f0f52");
            return;
        }
        this.b = new TextView(Mach.getContext());
        this.b.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef955ea7fa0c915fc7f53411b1eec092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef955ea7fa0c915fc7f53411b1eec092");
            return;
        }
        if (this.c == null) {
            this.c = new TextView(Mach.getContext());
        }
        this.b.setText((CharSequence) null);
        this.b.setTextSize(0, this.c.getTextSize());
        this.b.setGravity(this.c.getGravity());
        this.b.setMaxLines(this.c.getMaxLines());
        this.b.setTypeface(this.c.getTypeface());
        this.b.setPaintFlags(this.c.getPaintFlags());
        this.b.setEllipsize(this.c.getEllipsize());
    }

    public final synchronized TextView b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5d5dde9084f36640696b5453932d6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5d5dde9084f36640696b5453932d6b");
        }
        if (this.d == null) {
            this.d = new TextView(Mach.getContext());
            this.d.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        }
        return this.d;
    }
}
