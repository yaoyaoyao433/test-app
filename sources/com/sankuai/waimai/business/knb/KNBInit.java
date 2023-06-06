package com.sankuai.waimai.business.knb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.listener.NeedWrapUrlListener;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.utils.k;
import java.io.File;
import java.net.URI;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HornCallback loadCallback;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "KNBInit";
    }

    public KNBInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2491adcfc0602853b96faf024c4cdf7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2491adcfc0602853b96faf024c4cdf7f");
        } else {
            this.loadCallback = new HornCallback() { // from class: com.sankuai.waimai.business.knb.KNBInit.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    com.sankuai.waimai.business.knb.model.a aVar;
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a4d12fe9943e27d60b285621d3cfb928", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a4d12fe9943e27d60b285621d3cfb928");
                    } else if (!z || TextUtils.isEmpty(str) || (aVar = (com.sankuai.waimai.business.knb.model.a) k.a().fromJson(str, (Class<Object>) com.sankuai.waimai.business.knb.model.a.class)) == null || com.sankuai.waimai.foundation.utils.d.a(aVar.a)) {
                    } else {
                        com.sankuai.waimai.business.knb.webview.c.b = aVar.a;
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        boolean z;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ded9c9e2a83db135e2d2a89cac88a981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ded9c9e2a83db135e2d2a89cac88a981");
            return;
        }
        boolean is64Bit = ProcessUtils.is64Bit();
        Object[] objArr2 = {application, Byte.valueOf(is64Bit ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "46ad9c7403bfa476ec0a9db38884251f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "46ad9c7403bfa476ec0a9db38884251f");
        } else if (Build.VERSION.SDK_INT >= 24 && application != null) {
            Object[] objArr3 = {application, Byte.valueOf(is64Bit ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "e01c76d664c2a6142ed9bc01dab2fefb", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "e01c76d664c2a6142ed9bc01dab2fefb")).booleanValue();
            } else {
                String string = a.a(application).getString("deleted_gpu_cache_app_abi", null);
                z = (string == null && !is64Bit) || (TextUtils.equals("64", string) && is64Bit) || (TextUtils.equals("32", string) && !is64Bit);
            }
            if (!z) {
                try {
                    Context applicationContext = application.getApplicationContext();
                    if (a.a(new File(applicationContext.getDataDir() + File.separator + "app_webview" + File.separator + "GPUCache"))) {
                        Object[] objArr4 = {application, Byte.valueOf(is64Bit ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "aaa14ba4bbcd9f3f48dab3525e3a5cbd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "aaa14ba4bbcd9f3f48dab3525e3a5cbd");
                        } else {
                            a.a(application).edit().putString("deleted_gpu_cache_app_abi", is64Bit ? "64" : "32").apply();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        KNBWebManager.init(application, new com.sankuai.waimai.business.knb.webview.c(), new com.sankuai.waimai.business.knb.config.b(), new h(application), "waimai", com.sankuai.waimai.config.a.a().d(), new com.sankuai.waimai.business.knb.config.a());
        KNBWebManager.setNeedWrapUrlListener(new NeedWrapUrlListener() { // from class: com.sankuai.waimai.business.knb.KNBInit.1
            public static ChangeQuickRedirect a;
            private Pattern c;

            @Override // com.sankuai.meituan.android.knb.listener.NeedWrapUrlListener
            public final boolean needWrapUrl(String str) {
                Pattern pattern;
                Object[] objArr5 = {str};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "013e517fcd6e3b7fc557b5131aa16d8b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "013e517fcd6e3b7fc557b5131aa16d8b")).booleanValue();
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
                if (indexOf > 0) {
                    str = str.substring(0, indexOf);
                }
                try {
                    String host = new URI(str).getHost();
                    if (TextUtils.isEmpty(host)) {
                        return false;
                    }
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "60fa97d2955a0100e3c39f03a93895c6", RobustBitConfig.DEFAULT_VALUE)) {
                        pattern = (Pattern) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "60fa97d2955a0100e3c39f03a93895c6");
                    } else {
                        if (this.c == null) {
                            this.c = Pattern.compile("^(.*\\.)?((sankuai|meituan|maoyan|dianping|51ping)\\.com)|(kuxun\\.cn)(\\.)?$");
                        }
                        pattern = this.c;
                    }
                    if (pattern == null) {
                        return false;
                    }
                    return pattern.matcher(host).matches();
                } catch (Throwable unused2) {
                    return false;
                }
            }
        });
        KNBWebManager.WXAppId = "wx9f6523d23a33a5b3";
        if (com.sankuai.waimai.kit.a.a().b()) {
            KNBWebManager.enableDebugMode(true);
            KNBWebManager.showDebugUrl(true);
        }
        b.a();
        Horn.register("token_blacklist", this.loadCallback);
    }
}
