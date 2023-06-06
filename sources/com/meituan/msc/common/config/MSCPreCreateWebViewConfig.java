package com.meituan.msc.common.config;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.msc.common.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCPreCreateWebViewConfig extends a<Config> {
    public static ChangeQuickRedirect c;
    private static volatile MSCPreCreateWebViewConfig d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String[] appIdWhiteList = {"73a62054aadc4526"};
        public String[] appIdBlackList = new String[0];
    }

    public static MSCPreCreateWebViewConfig d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "801a27cc8557d8c46e3668586f398077", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCPreCreateWebViewConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "801a27cc8557d8c46e3668586f398077");
        }
        if (d == null) {
            synchronized (MSCPreCreateWebViewConfig.class) {
                if (d == null) {
                    d = new MSCPreCreateWebViewConfig();
                }
            }
        }
        return d;
    }

    public MSCPreCreateWebViewConfig() {
        super("msc_pre_create_webview_config", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c6d513525c8b819489c233b8c8c3b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c6d513525c8b819489c233b8c8c3b8");
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [Config, java.lang.Object] */
    @Override // com.meituan.msc.common.config.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d53e1a736f3c0426356df0d6f488ea82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d53e1a736f3c0426356df0d6f488ea82");
            return;
        }
        super.b(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = a(str);
    }

    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6429d8f4feef46dc66867a8257211f72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6429d8f4feef46dc66867a8257211f72")).booleanValue();
        }
        if (d.a(((Config) this.b).appIdBlackList, str)) {
            return false;
        }
        return d.a(((Config) this.b).appIdWhiteList, str);
    }
}
