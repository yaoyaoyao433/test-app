package com.meituan.android.preload;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.dianping.titans.ui.TitansUIManager;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.android.preload.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    KNBWebCompat b;
    private TitansUIManager c;
    private BaseTitleBar d;
    private long e;
    private String f;
    private C0348a g;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0348a {
        public boolean a = true;
        public boolean b = false;
        public boolean c = false;
        public Bundle d;
        public Map<String, String> e;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68676abe77dddd650ae4f179fac3b4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68676abe77dddd650ae4f179fac3b4b5");
        } else {
            a(context, null, 1, null, null);
        }
    }

    public a(Context context, int i, c.a aVar) {
        super(context);
        Object[] objArr = {context, 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2763be0697d52155adbdab7cb64093", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2763be0697d52155adbdab7cb64093");
        } else {
            a(context, null, 1, null, aVar);
        }
    }

    public a(Context context, int i, C0348a c0348a, c.a aVar) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), c0348a, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a997a5b0786b9d04a52aa153d753993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a997a5b0786b9d04a52aa153d753993");
        } else {
            a(context, null, i, c0348a, aVar);
        }
    }

    private void a(@NonNull Context context, AttributeSet attributeSet, int i, C0348a c0348a, c.a aVar) {
        Object[] objArr = {context, null, Integer.valueOf(i), c0348a, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f63d98dca610324ce90c400214067e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f63d98dca610324ce90c400214067e");
            return;
        }
        this.f = String.valueOf(System.currentTimeMillis());
        this.b = KNBWebCompactFactory.getKNBCompact(i);
        Bundle bundle = new Bundle();
        this.g = c0348a;
        if (c0348a == null) {
            this.g = new C0348a();
        }
        if (this.g.d != null) {
            bundle.putAll(this.g.d);
        }
        this.b.setEnableSlowDraw(this.g.a);
        this.b.onCreate(context, bundle);
        this.b.setAutoInflateTitleBar(this.g.c);
        this.b.setAutoSetCookiesAfterViewCreated(this.g.b);
        a(context, aVar);
        addView(this.b.onCreateView(LayoutInflater.from(context), this));
    }

    private void a(Context context, c.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c99693712ae43ecb3a7f7721f12b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c99693712ae43ecb3a7f7721f12b80");
            return;
        }
        this.c = new TitansUIManager();
        if (aVar != null) {
            this.d = aVar.a(context);
            if (this.d != null) {
                this.c.setDefaultTitleBar(this.d);
            }
            this.c.setBackIconId(R.drawable.wm_ic_home_as_up_indicator);
        }
        this.b.getWebSettings().setUIManager(this.c);
    }

    public final KNBWebCompat getKnbWebCompat() {
        return this.b;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59744e10d483acbbf51181541e243513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59744e10d483acbbf51181541e243513");
            return;
        }
        this.b.getWebHandler().loadUrl(str);
        this.e = System.currentTimeMillis();
    }

    public final TitansUIManager getUIManager() {
        return this.c;
    }

    public final BaseTitleBar getTitleBar() {
        return this.d;
    }

    public final long getLoadUrlTime() {
        return this.e;
    }

    public final String getUniqueId() {
        return this.f;
    }
}
