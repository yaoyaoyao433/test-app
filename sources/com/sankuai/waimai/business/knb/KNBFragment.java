package com.sankuai.waimai.business.knb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.widget.TextView;
import com.dianping.titans.ui.TitansUIManager;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnAppendUAListener;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import com.sankuai.waimai.foundation.core.base.fragment.BaseFragment;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBFragment extends BaseFragment {
    public static ChangeQuickRedirect a = null;
    private static boolean q = true;
    private static boolean r = true;
    protected String b;
    protected KNBWebCompat c;
    protected String d;
    protected g e;
    protected TitansUIManager f;
    protected boolean g;
    int h;
    protected TextView i;
    protected com.sankuai.waimai.platform.widget.emptylayout.d j;
    private boolean k;
    private String l;
    private ArrayList<String> m;
    private String n;
    private HashMap<String, String> o;
    private BroadcastReceiver p;

    public void b() {
    }

    public void c() {
    }

    public KNBFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5dbe0a884e25b2f8c49ca64a8c8ffae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5dbe0a884e25b2f8c49ca64a8c8ffae");
            return;
        }
        this.k = false;
        this.m = new ArrayList<>(Arrays.asList("imeituan", "tel", "geo", "mailto", "meituanwaimai", "meituanpayment", "itakeawaybiz", "meituanshangou"));
        this.h = 1;
    }

    public static /* synthetic */ int a(KNBFragment kNBFragment, int i) {
        kNBFragment.h = 1;
        return 1;
    }

    public static /* synthetic */ void a(KNBFragment kNBFragment, String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kNBFragment, changeQuickRedirect, false, "e3580c769abee3d636d09b3babca951f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kNBFragment, changeQuickRedirect, false, "e3580c769abee3d636d09b3babca951f");
        } else if (kNBFragment.k || TextUtils.isEmpty(str)) {
        } else {
            try {
                str2 = Uri.parse(str).getQueryParameter("isJumper");
            } catch (Exception unused) {
                str2 = null;
            }
            kNBFragment.k = "1".equals(str2);
        }
    }

    public static /* synthetic */ void b(KNBFragment kNBFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kNBFragment, changeQuickRedirect, false, "8ae583177330a87e00251cec705392bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kNBFragment, changeQuickRedirect, false, "8ae583177330a87e00251cec705392bb");
        } else if (kNBFragment.k) {
            HashMap hashMap = new HashMap();
            hashMap.put("source_id", kNBFragment.l);
            hashMap.put("download_url", str);
            JudasManualManager.a("b_waimai_02a51kjt_mc").a("c_waimai_23lvxehn").a((Map<String, Object>) hashMap).a();
        }
    }

    public static /* synthetic */ boolean b(boolean z) {
        q = false;
        return false;
    }

    public static /* synthetic */ boolean c(KNBFragment kNBFragment, String str) {
        String str2;
        String str3;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kNBFragment, changeQuickRedirect, false, "2b57bbedab5dfb577cd448c23ebb9b19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, kNBFragment, changeQuickRedirect, false, "2b57bbedab5dfb577cd448c23ebb9b19")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            final Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!TextUtils.isEmpty(scheme) && scheme.toLowerCase().equals("app") && !TextUtils.isEmpty(host) && host.toLowerCase().equals("close")) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, kNBFragment, changeQuickRedirect2, false, "6b48b7d0df48dd85c79de0ea5d27a820", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, kNBFragment, changeQuickRedirect2, false, "6b48b7d0df48dd85c79de0ea5d27a820");
                } else {
                    kNBFragment.F.finish();
                }
                return true;
            } else if (!com.sankuai.waimai.foundation.utils.d.a(kNBFragment.m) && kNBFragment.m.contains(parse.getScheme())) {
                if ("/share".equals(parse.getPath())) {
                    ShareTip a2 = kNBFragment.a(parse);
                    Activity activity = kNBFragment.F;
                    Object[] objArr3 = {a2, activity, 6};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, kNBFragment, changeQuickRedirect3, false, "27f9325ef25c6d689ba0afa63b709fa2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kNBFragment, changeQuickRedirect3, false, "27f9325ef25c6d689ba0afa63b709fa2");
                    } else {
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_title", a2.getTitle());
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_content", a2.getContent());
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_icon_url", a2.getIcon());
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_url", a2.getUrl());
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_channel", a2.getChannelsInteger());
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_description", a2.getDescription());
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) activity, "h5_share_description_icon", a2.getShareButtonDes());
                    }
                    com.sankuai.waimai.business.knb.util.a.a(kNBFragment.F, null, null);
                } else if (com.sankuai.waimai.foundation.router.a.a(kNBFragment.F, str, (int) R.string.scheme_path_browser) || com.sankuai.waimai.foundation.router.a.a(kNBFragment.F, str, (int) R.string.scheme_path_pweb)) {
                    Object[] objArr4 = {parse, str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, kNBFragment, changeQuickRedirect4, false, "2433fc03f2ef2c9434e3a59e380e6116", RobustBitConfig.DEFAULT_VALUE)) {
                        str2 = (String) PatchProxy.accessDispatch(objArr4, kNBFragment, changeQuickRedirect4, false, "2433fc03f2ef2c9434e3a59e380e6116");
                    } else {
                        str2 = "";
                        if (com.sankuai.waimai.foundation.router.a.a(kNBFragment.F, str, (int) R.string.scheme_path_browser)) {
                            Object[] objArr5 = {parse};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.knb.util.b.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "920131a1d0c8b1eb5412663a1b577f14", RobustBitConfig.DEFAULT_VALUE)) {
                                str3 = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "920131a1d0c8b1eb5412663a1b577f14");
                            } else if (parse == null) {
                                str3 = null;
                            } else {
                                String queryParameter = parse.getQueryParameter("url");
                                if (TextUtils.isEmpty(queryParameter)) {
                                    queryParameter = parse.getQueryParameter("inner_url");
                                }
                                if (TextUtils.isEmpty(queryParameter)) {
                                    queryParameter = parse.getQueryParameter("web_url");
                                }
                                str3 = queryParameter;
                            }
                            str2 = str3;
                        }
                    }
                    final String str4 = str2;
                    if (com.sankuai.waimai.business.knb.util.b.a(parse)) {
                        Object[] objArr6 = {parse, str4};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, kNBFragment, changeQuickRedirect6, false, "17a5576c746fbafe5c6c8fdfd7cd131f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, kNBFragment, changeQuickRedirect6, false, "17a5576c746fbafe5c6c8fdfd7cd131f");
                        } else if (kNBFragment.m() == null) {
                            kNBFragment.a(new Runnable() { // from class: com.sankuai.waimai.business.knb.KNBFragment.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c1660d05bc95e13155caf3ae2165de4e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c1660d05bc95e13155caf3ae2165de4e");
                                    } else {
                                        KNBFragment.this.a(parse, str4);
                                    }
                                }
                            });
                        } else {
                            kNBFragment.a(parse, str4);
                        }
                    } else {
                        kNBFragment.a(parse, str4);
                    }
                } else {
                    a.C0950a a3 = com.sankuai.waimai.foundation.router.a.a();
                    Object[] objArr7 = {3};
                    ChangeQuickRedirect changeQuickRedirect7 = a.C0950a.a;
                    if (PatchProxy.isSupport(objArr7, a3, changeQuickRedirect7, false, "806f130393a21e32ae4673be893cea77", RobustBitConfig.DEFAULT_VALUE)) {
                        a3 = (a.C0950a) PatchProxy.accessDispatch(objArr7, a3, changeQuickRedirect7, false, "806f130393a21e32ae4673be893cea77");
                    } else {
                        a3.b.put("com.sankuai.waimai.router.from", 3);
                    }
                    a3.a(kNBFragment.F, str);
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean c(boolean z) {
        r = false;
        return false;
    }

    public static /* synthetic */ void e(KNBFragment kNBFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kNBFragment, changeQuickRedirect, false, "50a6ad1247271322585ceadea6f78aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kNBFragment, changeQuickRedirect, false, "50a6ad1247271322585ceadea6f78aae");
            return;
        }
        int b = kNBFragment.b(str);
        if (b >= 0) {
            kNBFragment.a_(b == 0);
        }
    }

    static {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d94d5c746269a37177c857e7577d2b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d94d5c746269a37177c857e7577d2b2c");
        } else {
            b.a();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dff753a0981d8f5cdabe783ce88f823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dff753a0981d8f5cdabe783ce88f823");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.c.onSaveInstanceState(bundle);
        bundle.putString("web_url", this.c.getWebHandler().getUrl());
        bundle.putSerializable("common_params", this.o);
        bundle.putInt("status_flag", this.h);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        final String str;
        boolean z;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e73bdd8dd72ae883d69c520ba67c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e73bdd8dd72ae883d69c520ba67c52");
            return;
        }
        super.onCreate(bundle);
        a();
        this.n = "(.*\\.)?(meituan|maoyan|sankuai|dianping|51ping|maka|dpurl)\\.(com|info|im|cn)$";
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ead9ffade12050a83bf44fad4e85fa7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ead9ffade12050a83bf44fad4e85fa7e");
        } else {
            this.c.setOnAppendUAListener(new OnAppendUAListener() { // from class: com.sankuai.waimai.business.knb.KNBFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.android.knb.listener.OnAppendUAListener
                public final String onAppendUA() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "78346e56e80ca7271ce9f15f83806f3e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "78346e56e80ca7271ce9f15f83806f3e");
                    }
                    return com.sankuai.waimai.foundation.router.interfaces.b.a + "/" + com.sankuai.waimai.business.knb.services.a.c() + StringUtil.SPACE + com.sankuai.waimai.foundation.router.interfaces.b.a + "-c/" + com.sankuai.waimai.business.knb.services.a.c();
                }
            });
            Serializable c = com.sankuai.waimai.platform.utils.f.c(this.F.getIntent(), "_dl_task_ext_");
            final com.sankuai.waimai.platform.capacity.deeplink.e eVar = c instanceof com.sankuai.waimai.platform.capacity.deeplink.e ? (com.sankuai.waimai.platform.capacity.deeplink.e) c : null;
            this.c.setOnWebViewClientListener(new OnWebClientListener() { // from class: com.sankuai.waimai.business.knb.KNBFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final boolean shouldOverrideUrlLoading(String str2) {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b43bdc03955e56ae142e5fd28c9a4fd", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b43bdc03955e56ae142e5fd28c9a4fd")).booleanValue();
                    }
                    KNBFragment.a(KNBFragment.this, str2);
                    KNBFragment.b(KNBFragment.this, str2);
                    return KNBFragment.c(KNBFragment.this, str2);
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onPageStarted(String str2, Bitmap bitmap) {
                    Object[] objArr3 = {str2, bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a92ec154b563ff32633231d54109a0de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a92ec154b563ff32633231d54109a0de");
                        return;
                    }
                    KNBFragment.a(KNBFragment.this, str2);
                    KNBFragment.this.l = str2;
                    KNBFragment.e(KNBFragment.this, str2);
                    KNBFragment.this.b();
                    KNBFragment.this.g = false;
                    if (KNBFragment.q && com.sankuai.waimai.platform.capacity.deeplink.b.f() && "pageinit".equals(com.sankuai.waimai.platform.capacity.deeplink.b.c())) {
                        KNBFragment.b(false);
                        com.sankuai.waimai.platform.capacity.deeplink.b.b("t2");
                    }
                    if (eVar != null) {
                        eVar.a("t2");
                    }
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onPageFinished(String str2) {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4a0a2058f360a0ba6f310772cb2f1314", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4a0a2058f360a0ba6f310772cb2f1314");
                        return;
                    }
                    if ("https://verify.meituan.com/v2/app/general_page".equals(str2)) {
                        com.sankuai.waimai.platform.capacity.log.c.a().a(KNBFragment.this.g ? 13110 : 13100, "waimai_crawler_page", 0L);
                    }
                    KNBFragment.this.c();
                    if (KNBFragment.r && com.sankuai.waimai.platform.capacity.deeplink.b.f() && "t2".equals(com.sankuai.waimai.platform.capacity.deeplink.b.c())) {
                        KNBFragment.c(false);
                        com.sankuai.waimai.platform.capacity.deeplink.b.b("t3");
                    }
                    if (eVar != null) {
                        eVar.a("t3");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0129  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
                /* JADX WARN: Type inference failed for: r0v29 */
                /* JADX WARN: Type inference failed for: r0v5 */
                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onReceivedError(int r26, java.lang.String r27, java.lang.String r28) {
                    /*
                        Method dump skipped, instructions count: 406
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.knb.KNBFragment.AnonymousClass2.onReceivedError(int, java.lang.String, java.lang.String):void");
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
                    Object[] objArr3 = {sslErrorHandler, sslError};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f9db54647a2e0b969d9f1732381484f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f9db54647a2e0b969d9f1732381484f");
                        return;
                    }
                    com.sankuai.waimai.platform.capacity.deeplink.b.a("webview_ssl_error:" + sslError);
                    if (sslError == null) {
                        i.d(new com.sankuai.waimai.business.knb.log.a().a("web_page_error").b("ssl_error_null").b(true).b());
                        return;
                    }
                    a.AbstractC1040a a2 = new com.sankuai.waimai.business.knb.log.a().a("web_page_error");
                    i.d(a2.b("ssl_error_" + sslError.getPrimaryError()).c(sslError.getUrl()).b(true).b());
                }
            });
        }
        Object[] objArr3 = {bundle};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d545f6772b51cbac82f11d0fe43bbfec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d545f6772b51cbac82f11d0fe43bbfec");
            return;
        }
        if (bundle == null) {
            str = i();
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00b5381061ee225cb3dfc0a2135aa624", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00b5381061ee225cb3dfc0a2135aa624");
            } else if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (!Uri.EMPTY.equals(parse)) {
                    this.o = new HashMap<>();
                    for (String str2 : parse.getQueryParameterNames()) {
                        String queryParameter = parse.getQueryParameter(str2);
                        if (queryParameter != null) {
                            this.o.put(str2, queryParameter);
                        }
                    }
                }
            }
        } else {
            this.h = bundle.getInt("status_flag", 1);
            String string = bundle.getString("web_url");
            Serializable a2 = com.sankuai.waimai.platform.utils.f.a(bundle, "common_params");
            this.o = new HashMap<>();
            if (a2 instanceof HashMap) {
                HashMap hashMap = (HashMap) a2;
                for (Object obj : hashMap.keySet()) {
                    if (obj instanceof String) {
                        Object obj2 = hashMap.get(obj);
                        if (obj2 instanceof String) {
                            this.o.put((String) obj, (String) obj2);
                        }
                    }
                }
            }
            if (this.h == 3) {
                str = g(f(string));
                this.h = 1;
            } else {
                str = string;
            }
        }
        com.sankuai.waimai.foundation.utils.log.a.b("urlProcessing", "onCreate -", new Object[0]);
        Object[] objArr5 = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "719bd01c5b15754972e2535d004d4749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "719bd01c5b15754972e2535d004d4749");
            return;
        }
        Object[] objArr6 = {str};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bc09748e1b981754a327465a427e917a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bc09748e1b981754a327465a427e917a")).booleanValue();
        } else {
            if (!TextUtils.isEmpty(str)) {
                User m = m();
                String queryParameter2 = Uri.parse(str).getQueryParameter("need_login");
                if (m == null && !TextUtils.isEmpty(queryParameter2) && "1".equals(queryParameter2)) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            c(str);
            return;
        }
        Object[] objArr7 = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a36b1ee941368288c9f69d9d4f76be28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a36b1ee941368288c9f69d9d4f76be28");
            return;
        }
        Uri parse2 = Uri.parse(str);
        User m2 = m();
        Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.business.knb.KNBFragment.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d556fccdee66f5d3197e0795dcf3288d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d556fccdee66f5d3197e0795dcf3288d");
                } else {
                    KNBFragment.this.a(str, r3);
                }
            }
        };
        if (m2 == null && com.sankuai.waimai.business.knb.util.b.a(parse2)) {
            a(runnable);
        } else {
            runnable.run();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1ee35d5eb366aebd7d94de3943a803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1ee35d5eb366aebd7d94de3943a803");
            return;
        }
        this.c = KNBWebCompactFactory.getKNBCompact(1);
        this.c.onCreate((Activity) getActivity(), getArguments());
    }

    private ShareTip a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3047fc47b6a55076e4b1ef79b3296046", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareTip) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3047fc47b6a55076e4b1ef79b3296046");
        }
        ShareTip shareTip = new ShareTip();
        try {
            String queryParameter = uri.getQueryParameter("channel");
            String queryParameter2 = uri.getQueryParameter("title");
            String queryParameter3 = uri.getQueryParameter("imageURL");
            String queryParameter4 = uri.getQueryParameter("detailURL");
            String queryParameter5 = uri.getQueryParameter("content");
            String queryParameter6 = uri.getQueryParameter("description_icon");
            String queryParameter7 = uri.getQueryParameter("description");
            if (queryParameter != null) {
                shareTip.setChannelsInteger(Integer.parseInt(queryParameter));
            }
            shareTip.setContent(queryParameter5);
            shareTip.setTitle(queryParameter2);
            shareTip.setIcon(queryParameter3);
            shareTip.setUrl(queryParameter4);
            shareTip.setShareButtonDes(queryParameter6);
            shareTip.setDescription(queryParameter7);
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return shareTip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        byte b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c245d6158fe01a7eb3d70013fc904dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c245d6158fe01a7eb3d70013fc904dd6");
            return;
        }
        this.b = h();
        this.e = new g(this.F);
        this.e.findViewById(R.id.web_title_bar).setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f.setDefaultTitleBar(this.e);
        this.e.setWebTitle(this.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f737bbb762e9d07d4396f08084819f8d", RobustBitConfig.DEFAULT_VALUE)) {
            b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f737bbb762e9d07d4396f08084819f8d")).booleanValue();
        } else {
            Activity activity = this.F;
            b = activity instanceof KNBWebViewActivity ? ((KNBWebViewActivity) activity).c : (byte) 0;
        }
        Object[] objArr3 = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "398b13355a1f91adbf3f138d264d4b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "398b13355a1f91adbf3f138d264d4b96");
        } else if (b != 0) {
            com.sankuai.waimai.platform.capacity.immersed.a.b(this.F, true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa23c5b9084d89bed6332ec3535fe77", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa23c5b9084d89bed6332ec3535fe77") : this.c.onCreateView(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e50de8276439598ccebb7f7ea0ddfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e50de8276439598ccebb7f7ea0ddfb");
        } else {
            e();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c1c9831364675c16dd6147129d2a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c1c9831364675c16dd6147129d2a98");
        } else {
            super.onActivityCreated(bundle);
        }
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00717476de16e40ab9c9f2f7b3562c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00717476de16e40ab9c9f2f7b3562c49");
            return;
        }
        if (this.i == null) {
            e();
        }
        if (this.i == null) {
            return;
        }
        String a2 = com.sankuai.waimai.business.knb.webview.a.a(i);
        String a3 = com.sankuai.waimai.monitor.a.a(String.valueOf(i)).b("10326").a();
        this.j.a(a2, a3);
        com.sankuai.waimai.business.knb.util.c.a(this.d, a3, this.j.k());
    }

    public void a(KNBWebCompat kNBWebCompat) {
        Object[] objArr = {kNBWebCompat};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7d39d6d792944296a9bba658b6cb01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7d39d6d792944296a9bba658b6cb01");
            return;
        }
        this.f = new TitansUIManager();
        this.f.setBackIconId(R.drawable.wm_ic_home_as_up_indicator);
        this.f.setCloseIconId(R.drawable.wm_titans_web_close);
        this.f.setCustomBackIconId(R.drawable.wm_ic_home_as_up_indicator);
        this.f.setProgressDrawableResId(R.drawable.wm_common_progress_horizontal);
        this.f.setSearchIconId(R.drawable.wm_ic_action_search);
        this.f.setShareIconId(R.drawable.wm_knb_share_app);
        this.f.setMaskLayoutResId(R.layout.wm_knb_layout_err);
        kNBWebCompat.getWebSettings().setUIManager(this.f);
        f();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c541e2391ae2f598ec59c2835410675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c541e2391ae2f598ec59c2835410675");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null && TextUtils.equals("1", arguments.getString("noclosebtn"))) {
            this.f.setCloseIconId(0);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16a47aa6121733acbe7491ce2c2d338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16a47aa6121733acbe7491ce2c2d338");
            return;
        }
        super.onStart();
        this.c.onStart();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b683959276ac439c3a534a2c238e7137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b683959276ac439c3a534a2c238e7137");
            return;
        }
        super.onResume();
        this.c.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94b213a1b9c9f793cf83fa47540e9c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94b213a1b9c9f793cf83fa47540e9c64");
            return;
        }
        super.onPause();
        this.c.onPause();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91760bd600511d2988b38841db983989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91760bd600511d2988b38841db983989");
            return;
        }
        super.onStop();
        this.c.onStop();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8afa0fa1c0a0effc277072ea7e5de4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8afa0fa1c0a0effc277072ea7e5de4e");
            return;
        }
        super.onDestroy();
        this.c.onDestroy();
        if (this.p != null) {
            this.F.unregisterReceiver(this.p);
            this.p = null;
        }
        this.l = null;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d92cf51211c4b8b4a25676bb00ab9dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d92cf51211c4b8b4a25676bb00ab9dd");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.c != null) {
            this.c.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9077cbf71fada67668b87d2c16beb89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9077cbf71fada67668b87d2c16beb89");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.c.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06e5ee81b86b1a0d97aa6155ec69503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06e5ee81b86b1a0d97aa6155ec69503");
        } else {
            this.c.onBackPressed();
        }
    }

    public final void a_(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fb55cd0b59f89b36fe02893536bae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fb55cd0b59f89b36fe02893536bae1");
            return;
        }
        KNBWebCompat.WebSettings webSettings = this.c.getWebSettings();
        if (webSettings == null) {
            return;
        }
        if (z) {
            webSettings.visibleTitleBar();
        } else {
            webSettings.invisibleTitleBar();
        }
    }

    private int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b4d7b7eff9d29e48efd5109c95b551", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b4d7b7eff9d29e48efd5109c95b551")).intValue();
        }
        if (aa.a(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                if (str2.equals("hideNativeNavBar")) {
                    return "1".equals(parse.getQueryParameter("hideNativeNavBar")) ? 1 : 0;
                }
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5df69cdd1eb7c9af94ed9747b0280a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5df69cdd1eb7c9af94ed9747b0280a");
        }
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("title") : "";
    }

    @Deprecated
    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6969b8d244e6ea6840d52ad92874a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6969b8d244e6ea6840d52ad92874a0");
            return;
        }
        this.h = 2;
        com.sankuai.waimai.foundation.utils.log.a.b("urlProcessing", "loadURL - URL: " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            String host = parse.getHost();
            if (!TextUtils.isEmpty(this.n) && !TextUtils.isEmpty(host) && host.matches(this.n)) {
                a(str);
            }
        }
        this.d = str;
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0990b01cc51495941aae2187944926f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0990b01cc51495941aae2187944926f0");
        } else {
            this.c.getWebHandler().loadUrl(str);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaef02594990206ec249df8fb02ca957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaef02594990206ec249df8fb02ca957");
            return;
        }
        if (z) {
            str = e(str);
        }
        c(g(f(str)));
    }

    private String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24434b8be47bcb46355ed17501211ce7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24434b8be47bcb46355ed17501211ce7");
        }
        if (TextUtils.isEmpty(str) || this.o == null || this.o.isEmpty()) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (Uri.EMPTY.equals(parse)) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        for (String str2 : this.o.keySet()) {
            if (!str2.equals("el_page") && !str2.equals("el_biz") && parse.getQueryParameter(str2) == null) {
                buildUpon.appendQueryParameter(str2, this.o.get(str2));
            }
        }
        return buildUpon.toString();
    }

    private String f(String str) {
        String queryParameter;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a174f9f8aa19c264035b5621c8033916", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a174f9f8aa19c264035b5621c8033916");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (Uri.EMPTY.equals(parse)) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (String str2 : parse.getQueryParameterNames()) {
            if (!"userid".equals(str2) && !"token".equals(str2) && (queryParameter = parse.getQueryParameter(str2)) != null) {
                buildUpon.appendQueryParameter(str2, queryParameter);
            }
        }
        User m = m();
        if (m == null) {
            return buildUpon.toString();
        }
        buildUpon.appendQueryParameter("userid", String.valueOf(m.id));
        buildUpon.appendQueryParameter("token", m.token);
        return buildUpon.toString();
    }

    private String g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140b31c55f1ba8c1cb6539582e2ccd5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140b31c55f1ba8c1cb6539582e2ccd5d");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (Uri.EMPTY.equals(parse)) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        if (m() != null) {
            buildUpon.appendQueryParameter("login_finished", "1");
        }
        return buildUpon.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd68875e728f995df204a4c7e504ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd68875e728f995df204a4c7e504ca5");
            return;
        }
        String g = g(f(e(str)));
        Intent intent = new Intent(this.F, KNBWebViewActivity.class);
        intent.putExtra("url", g);
        this.F.startActivity(a(uri, intent));
    }

    private Intent a(Uri uri, Intent intent) {
        Set<String> queryParameterNames;
        Object[] objArr = {uri, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebdd22fee1f3adfdd4b0c8dbca4fc41f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebdd22fee1f3adfdd4b0c8dbca4fc41f");
        }
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null && queryParameterNames.size() > 0) {
            for (String str : queryParameterNames) {
                if (!TextUtils.equals(str, "url") && !TextUtils.equals(str, "inner_url")) {
                    intent.putExtra(str, uri.getQueryParameter(str));
                }
            }
        }
        return intent;
    }

    private void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3daeeaee37db785fe3722823c0bbcb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3daeeaee37db785fe3722823c0bbcb73");
            return;
        }
        if (this.p == null) {
            this.p = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.knb.KNBFragment.6
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07c6a2379df2ccc90d9c9619ba605502", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07c6a2379df2ccc90d9c9619ba605502");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.e("mLoginReceiver", "receive loginevent broadcast", new Object[0]);
                    if (intent.getAction().equals("com.sankuai.meituan.login.action")) {
                        Serializable c = com.sankuai.waimai.platform.utils.f.c(intent, "type");
                        if ((c instanceof UserCenter.d) && UserCenter.d.login == ((UserCenter.d) c) && runnable != null) {
                            runnable.run();
                        }
                        KNBFragment.a(KNBFragment.this, 1);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.sankuai.meituan.login.action");
            this.F.registerReceiver(this.p, intentFilter);
        }
        this.h = 3;
        ae.a(this.F, (int) R.string.wm_knb_login_first);
        com.sankuai.waimai.platform.domain.manager.user.a.a((Context) this.F);
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7484a1ab51980ef64ebc6e65b7912146", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7484a1ab51980ef64ebc6e65b7912146");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("url");
        }
        return null;
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6959e744cffc407b61107401d605df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6959e744cffc407b61107401d605df2");
            return;
        }
        this.c.getWebHandler().clearHistory();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ee0d0bf5f754ccb46680f43b389fa1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ee0d0bf5f754ccb46680f43b389fa1c");
        } else if (this.e == null || !this.c.getWebHandler().canGoBack()) {
        } else {
            this.e.setLRButton((String) null, (String) null, false, (View.OnClickListener) null);
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa40861616e7824c5058c149ca2c7ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa40861616e7824c5058c149ca2c7ac");
            return;
        }
        View findViewById = this.F.findViewById(R.id.layout_info);
        if (findViewById != null) {
            this.j = new com.sankuai.waimai.platform.widget.emptylayout.d(findViewById);
            this.j.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.knb.KNBFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4d723095cbf66ce60e74c019da2d3f0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4d723095cbf66ce60e74c019da2d3f0");
                    } else {
                        KNBFragment.this.c.getWebHandler().reload();
                    }
                }
            });
            this.j.g();
            com.sankuai.waimai.platform.bizdiagnosis.a.b(getContext());
            this.i = this.j.b();
            if (this.c.getTitleBarHost() != null) {
                this.c.getTitleBarHost().showTitleBar(true);
            }
        }
    }

    private User m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b27ddb7b04e647267e4d2fa88d1fa2", RobustBitConfig.DEFAULT_VALUE) ? (User) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b27ddb7b04e647267e4d2fa88d1fa2") : com.sankuai.waimai.business.knb.util.b.a((Context) this.F);
    }
}
