package com.sankuai.waimai.platform.modular.block.offline;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.modular.block.offline.b;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements b.a {
    public static ChangeQuickRedirect a = null;
    private static int f = -1;
    public ViewGroup b;
    public b c;
    public boolean d;
    public com.sankuai.waimai.platform.net.a e;
    private LayoutInflater g;
    private String h;
    private boolean i;

    public static boolean a(String str) {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "748d7e23a2bb5d9ec86a9fa06dd03bc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "748d7e23a2bb5d9ec86a9fa06dd03bc6")).booleanValue();
        }
        b.a(com.sankuai.waimai.foundation.core.a.d());
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "adb08d20c2291ba9d7854b1c5d6f5780", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "adb08d20c2291ba9d7854b1c5d6f5780")).booleanValue();
        } else {
            if (!TextUtils.isEmpty(str)) {
                d.a(context);
                if (d.b != null) {
                    ABStrategy aBStrategy = d.b;
                    String paramWithKey = aBStrategy.getParamWithKey(str + "_switch");
                    if (!TextUtils.isEmpty(paramWithKey)) {
                        z = "true".equals(paramWithKey);
                    }
                }
            }
            z = false;
        }
        return z && a(com.meituan.android.singleton.b.a);
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca8929fd7684ebb47f23f5f5fe414cb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca8929fd7684ebb47f23f5f5fe414cb2")).booleanValue();
        }
        if (f >= 0) {
            return f > 0;
        }
        f = 0;
        try {
            for (String str : context.getAssets().list("")) {
                if ("wm_offline_jsgame".equals(str)) {
                    f = 1;
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {context, layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3ee45aee2566384944872482b56b1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3ee45aee2566384944872482b56b1c");
            return;
        }
        this.h = "file:///android_asset/wm_offline_jsgame/index.html";
        this.d = false;
        this.i = false;
        this.g = layoutInflater;
        this.b = viewGroup;
        this.c = new b(context);
        this.c.f = this;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b65c2994bd4d5fb443e35f1f05a480d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b65c2994bd4d5fb443e35f1f05a480d");
            return;
        }
        if (!this.d) {
            this.c.a(this.g, this.b);
            this.b.addView(this.c.a());
            ViewGroup.LayoutParams layoutParams = this.c.a().getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            this.c.a().setLayoutParams(layoutParams);
            this.c.a(this.h);
            this.d = true;
        }
        this.b.setVisibility(0);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef0dbfaf0f1b8e0bfadbbab9b02ac8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef0dbfaf0f1b8e0bfadbbab9b02ac8d");
        } else if (this.c != null) {
            this.c.c();
        }
    }

    @Override // com.sankuai.waimai.platform.modular.block.offline.b.a
    public final void a(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f5bd399038dd164fa145f7e5e27fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f5bd399038dd164fa145f7e5e27fc0");
        } else if (this.i || consoleMessage == null || this.e == null || !"js game start !!! ".equals(consoleMessage.message())) {
        } else {
            d.a(this.b.getContext(), "homepage_offline_ui", this.e, "played");
            this.i = true;
        }
    }
}
