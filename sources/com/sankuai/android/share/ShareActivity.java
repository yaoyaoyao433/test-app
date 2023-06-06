package com.sankuai.android.share;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.ShareDialog;
import com.sankuai.android.share.common.filter.b;
import com.sankuai.android.share.common.filter.g;
import com.sankuai.android.share.common.filter.h;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.interfaces.e;
import com.sankuai.android.share.keymodule.SharePanel.b;
import com.sankuai.android.share.util.d;
import com.sankuai.android.share.util.i;
import com.sankuai.android.share.util.j;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.platform.utils.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.tencent.tauth.Tencent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ShareActivity extends FragmentActivity implements c {
    public static ChangeQuickRedirect a;
    private List<b> b;
    private List<AppBean> c;
    private ShareBaseBean d;
    private SparseArray<ShareBaseBean> e;
    private AppBean f;
    private ShareDialog g;
    private com.sankuai.android.share.keymodule.SharePanel.b h;
    private String i;
    private boolean j;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private Picasso o;
    private e p;
    private LyingkitTraceBody q;
    private b.InterfaceC0541b r;
    private b.a s;

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a6c7f5c17b0f2f62115a7082c73c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a6c7f5c17b0f2f62115a7082c73c50");
        }
    }

    public ShareActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea98922d6e600e63a6d4a07b1c48009", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea98922d6e600e63a6d4a07b1c48009");
            return;
        }
        this.j = false;
        this.k = false;
        this.l = "";
        this.m = "";
        this.n = "";
        this.p = null;
        this.r = new b.InterfaceC0541b() { // from class: com.sankuai.android.share.ShareActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.keymodule.SharePanel.b.InterfaceC0541b
            public final void a(List<AppBean> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0233dad8ea3cdaa2d15f9c79cbb46582", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0233dad8ea3cdaa2d15f9c79cbb46582");
                } else if (Statistics.isInitialized()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bg_name", ShareActivity.this.a());
                    hashMap.put("bu_name", j.a(ShareActivity.this.d));
                    hashMap.put("items", ShareActivity.a(ShareActivity.this, list));
                    hashMap.put("wxapp", ShareActivity.this.c());
                    hashMap.put("cid", j.b(ShareActivity.this.d));
                    hashMap.put("pagenm", ShareActivity.this.m);
                    i.a("b_PHDJN", hashMap).a("c_sxr976a").a();
                }
            }
        };
        this.s = new b.a() { // from class: com.sankuai.android.share.ShareActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.keymodule.SharePanel.b.a
            public final void a(AppBean appBean) {
                Object[] objArr2 = {appBean};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa59ca196157ef0fcce082b7b34807a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa59ca196157ef0fcce082b7b34807a9");
                } else if (appBean == null) {
                } else {
                    ShareActivity.this.f = appBean;
                    ShareActivity.a(ShareActivity.this, appBean, appBean.getId());
                }
            }
        };
    }

    public static /* synthetic */ List a(ShareActivity shareActivity, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, shareActivity, changeQuickRedirect, false, "4eb665e718626d35ace819d11d7e6e43", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, shareActivity, changeQuickRedirect, false, "4eb665e718626d35ace819d11d7e6e43");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() == 0) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AppBean appBean = (AppBean) it.next();
            HashMap hashMap = new HashMap();
            hashMap.put("title", d.a(appBean.getId()));
            hashMap.put("title_name", appBean.getAppName());
            String bubbleText = appBean.getBubbleText();
            if (!TextUtils.isEmpty(bubbleText)) {
                hashMap.put("haveicon", bubbleText);
            } else {
                hashMap.put("haveicon", "-999");
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static /* synthetic */ void a(ShareActivity shareActivity, AppBean appBean, int i) {
        String str;
        Object[] objArr = {appBean, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, shareActivity, changeQuickRedirect, false, "edcee26f5651b346644a5ed89653bf4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shareActivity, changeQuickRedirect, false, "edcee26f5651b346644a5ed89653bf4f");
            return;
        }
        ShareBaseBean c = shareActivity.c(i);
        Object[] objArr2 = {c, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, shareActivity, changeQuickRedirect2, false, "2ddf47e2ee9f6634a02f509411207707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, shareActivity, changeQuickRedirect2, false, "2ddf47e2ee9f6634a02f509411207707");
        } else if (c != null && !TextUtils.isEmpty(c.getUrl())) {
            Uri parse = Uri.parse(c.getUrl());
            Uri.Builder buildUpon = parse.buildUpon();
            if (TextUtils.isEmpty(parse.getQueryParameter("utm_source"))) {
                buildUpon.appendQueryParameter("utm_source", "appshare");
            }
            if (TextUtils.isEmpty(parse.getQueryParameter("utm_sharesource")) && !TextUtils.isEmpty(c.getContentType())) {
                buildUpon.appendQueryParameter("utm_sharesource", c.getContentType());
            }
            if (TextUtils.isEmpty(parse.getQueryParameter("utm_fromapp"))) {
                buildUpon.appendQueryParameter("utm_fromapp", d.a(i));
            }
            if (TextUtils.isEmpty(parse.getQueryParameter("utm_frombg")) && !TextUtils.isEmpty(c.getBg())) {
                buildUpon.appendQueryParameter("utm_frombg", c.getBg());
            }
            if (TextUtils.isEmpty(parse.getQueryParameter("utm_frombu")) && !TextUtils.isEmpty(c.getBu())) {
                buildUpon.appendQueryParameter("utm_frombu", c.getBu());
            }
            c.setUrl(buildUpon.toString());
        }
        if (c != null) {
            Object[] objArr3 = {appBean, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, shareActivity, changeQuickRedirect3, false, "e9c0334b9e8a1778d688c5387a38e891", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, shareActivity, changeQuickRedirect3, false, "e9c0334b9e8a1778d688c5387a38e891");
            } else {
                if (i == 2048 || i == 1024) {
                    Object[] objArr4 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, shareActivity, changeQuickRedirect4, false, "5a4b883f69793b940998aa31d2fb0ec1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, shareActivity, changeQuickRedirect4, false, "5a4b883f69793b940998aa31d2fb0ec1");
                    } else {
                        com.sankuai.android.share.common.b bVar = new com.sankuai.android.share.common.b() { // from class: com.sankuai.android.share.ShareActivity.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.android.share.common.b
                            public final void a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ff90238bdf66165e015799c8995aa191", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ff90238bdf66165e015799c8995aa191");
                                } else if (ShareActivity.this.g != null) {
                                    ShareActivity.this.g.b();
                                }
                            }

                            @Override // com.sankuai.android.share.interfaces.c
                            public final void a(b.a aVar, c.a aVar2) {
                                Object[] objArr5 = {aVar, aVar2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "84bedae5c4ac921da53111580953cba2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "84bedae5c4ac921da53111580953cba2");
                                } else if (ShareActivity.this.p == null || aVar != b.a.COPY) {
                                } else {
                                    e unused = ShareActivity.this.p;
                                }
                            }
                        };
                        ShareBaseBean c2 = shareActivity.c(i);
                        b.a b = d.b(i);
                        com.sankuai.android.share.keymodule.SharePanel.a.a(shareActivity.q, shareActivity, b, shareActivity.a(c2, b), bVar);
                        if (i == 1024 || i == 2048) {
                            shareActivity.b(i);
                        }
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, shareActivity, changeQuickRedirect5, false, "6328a0c6c358da755d01606971836d6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, shareActivity, changeQuickRedirect5, false, "6328a0c6c358da755d01606971836d6a");
                    } else {
                        ShareBaseBean c3 = shareActivity.c(i);
                        b.a b2 = d.b(i);
                        com.sankuai.android.share.keymodule.SharePanel.a.a(shareActivity.q, shareActivity, b2, shareActivity.a(c3, b2), shareActivity);
                        shareActivity.b(i);
                    }
                }
                if (Statistics.isInitialized()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("title", d.a(i));
                    hashMap.put("title_name", d.a(shareActivity, i));
                    Object[] objArr6 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, shareActivity, changeQuickRedirect6, false, "cfaba2b858625a1e9b9a06ecdfc3b82d", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr6, shareActivity, changeQuickRedirect6, false, "cfaba2b858625a1e9b9a06ecdfc3b82d");
                    } else if (i == 2048) {
                        str = "口令";
                    } else {
                        ShareBaseBean c4 = shareActivity.c(i);
                        if (c4 != null) {
                            if ((!TextUtils.isEmpty(c4.getPassword()) && i == 128) || i == 4096) {
                                str = "分享口令";
                            } else if (i == 128 && !TextUtils.isEmpty(c4.getMiniProgramPath()) && !TextUtils.isEmpty(c4.getMiniProgramId())) {
                                str = "小程序";
                            } else if (!TextUtils.isEmpty(c4.getUrl()) || c4.hasShortUrl()) {
                                str = DiagnoseLog.H5;
                            } else if (!TextUtils.isEmpty(c4.getImgUrl())) {
                                str = "图片";
                            }
                        }
                        str = "";
                    }
                    shareActivity.l = str;
                    hashMap.put("bg_name", shareActivity.a());
                    hashMap.put("bu_name", j.a(shareActivity.d));
                    hashMap.put("url", shareActivity.f());
                    if (i != 1024) {
                        hashMap.put("type", shareActivity.l);
                    }
                    if (TextUtils.equals(shareActivity.l, "小程序")) {
                        hashMap.put("wxapp", shareActivity.c());
                    } else {
                        hashMap.put("wxapp", "");
                    }
                    hashMap.put("cid", j.b(shareActivity.d));
                    hashMap.put("pagenm", shareActivity.m);
                    hashMap.put("appshare", shareActivity.n == null ? "" : shareActivity.n);
                    String bubbleText = appBean.getBubbleText();
                    if (!TextUtils.isEmpty(bubbleText)) {
                        hashMap.put("haveicon", bubbleText);
                    } else {
                        hashMap.put("haveicon", "-999");
                    }
                    i.b("b_Z6rip", hashMap).a("c_sxr976a").a();
                }
            }
            com.sankuai.meituan.skyeye.library.core.e.a().a("biz_share", "share_flow_Data", "share_flow_Data_success", null);
            return;
        }
        com.sankuai.meituan.skyeye.library.core.e.a().a("biz_share", "share_flow_Data", "share_flow_Data_nil", "分享数据为空", null);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object data;
        int i;
        int i2;
        int i3;
        String originUrl;
        ShareBaseBean shareBaseBean;
        List<AppBean> list;
        List<com.sankuai.android.share.common.filter.b> arrayList;
        String extraImage;
        ShareBaseBean shareBaseBean2;
        final String extraJumpUrl;
        ShareBaseBean shareBaseBean3;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a816436c0d750eb63ac402c89827d106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a816436c0d750eb63ac402c89827d106");
            return;
        }
        super.onCreate(bundle);
        setTheme(R.style.share_ShareDialogTheme);
        getWindow().setWindowAnimations(R.style.notAnimation);
        this.m = com.meituan.android.base.share.b.a();
        if (getIntent() == null) {
            finish();
            return;
        }
        com.meituan.android.nom.lyingkit.b.a(getApplicationContext());
        this.q = (LyingkitTraceBody) getIntent().getParcelableExtra("tracebody");
        if (getIntent().hasExtra("listenercode")) {
            Object a2 = a.a(f.a(getIntent(), "listenercode"));
            if (a2 instanceof e) {
                this.p = (e) a2;
            }
        }
        try {
            this.j = getIntent().hasExtra("showBottom");
            this.k = f.a(getIntent(), "image_type", false);
            Statistics.resetPageName(AppUtil.generatePageInfoKey(this), "c_sxr976a");
            this.i = f.a(getIntent(), "filter");
            if (!TextUtils.isEmpty(this.i)) {
                com.sankuai.android.share.a.a();
            }
            if (getIntent().hasExtra("extra_share_data")) {
                Bundle bundleExtra = getIntent().getBundleExtra("extra_share_data");
                if (bundleExtra != null) {
                    data = bundleExtra.get("extra_share_data");
                } else {
                    data = f.c(getIntent(), "extra_share_data");
                    if (data == null) {
                        data = getIntent().getParcelableExtra("extra_share_data");
                    }
                }
            } else {
                data = getIntent().getData();
            }
            if (data == null) {
                com.sankuai.android.share.a.a(this, (int) R.string.share_data_none);
                finish();
                return;
            }
            if (data instanceof ShareBaseBean) {
                this.d = (ShareBaseBean) data;
                if (this.d != null) {
                    Sniffer.smell("biz_share", "share_data_onPlatform", "bean", "分享面板传入数据bean", this.d.toString());
                }
            } else if (data instanceof SparseArray) {
                this.e = (SparseArray) data;
                Sniffer.smell("biz_share", "share_data_onPlatform", "sparseArray", "分享面板传入数据sparseArray", this.e.toString());
            }
            if (this.d == null && this.e == null) {
                com.sankuai.android.share.a.a(this, (int) R.string.share_data_none);
                finish();
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cb6cd8726e1fab1689ee5ead7751efa", RobustBitConfig.DEFAULT_VALUE)) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2989df3e9eb1aae280828b9da3992db2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2989df3e9eb1aae280828b9da3992db2");
                    i = 128;
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    i = 128;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8c92f4e02e26f3e661758e6a4318499a", RobustBitConfig.DEFAULT_VALUE)) {
                        list = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8c92f4e02e26f3e661758e6a4318499a");
                        i3 = R.string.share_channel_weixin_friend;
                        i2 = R.drawable.share_ic_base_share_weixin;
                    } else {
                        this.c = new CopyOnWriteArrayList();
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        i2 = R.drawable.share_ic_base_share_weixin;
                        i3 = R.string.share_channel_weixin_friend;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c8dcec95681493a98f8d2ce28a5bc2b0", RobustBitConfig.DEFAULT_VALUE)) {
                            originUrl = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c8dcec95681493a98f8d2ce28a5bc2b0");
                        } else if (this.d != null) {
                            originUrl = this.d.getOriginUrl();
                        } else {
                            originUrl = (this.e == null || this.e.size() <= 0 || (shareBaseBean = this.e.get(this.e.keyAt(0))) == null) ? "" : shareBaseBean.getOriginUrl();
                        }
                        JsonArray a3 = com.sankuai.android.share.common.util.a.a(originUrl);
                        ArrayList arrayList2 = new ArrayList();
                        if (a3 != null) {
                            Iterator<JsonElement> it = a3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().getAsString());
                            }
                        }
                        if (arrayList2.contains(MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX)) {
                            this.c.add(new AppBean(128, R.drawable.share_ic_base_share_weixin, getString(R.string.share_channel_weixin_friend)));
                        }
                        if (arrayList2.contains("pyq")) {
                            this.c.add(new AppBean(256, R.drawable.share_ic_base_share_weixin_friends, getString(R.string.share_channel_weixin_circle)));
                        }
                        if (arrayList2.contains("qq")) {
                            this.c.add(new AppBean(512, R.drawable.share_ic_base_share_qq, getString(R.string.share_channel_qq)));
                        }
                        if (arrayList2.contains("qqzone")) {
                            this.c.add(new AppBean(2, R.drawable.share_ic_base_share_qzone, getString(R.string.share_channel_qzone)));
                        }
                        if (arrayList2.contains("copy")) {
                            this.c.add(new AppBean(2048, R.drawable.share_ic_base_share_copy, getString(R.string.share_channel_copy_url)));
                        }
                        if (arrayList2.contains("password")) {
                            this.c.add(new AppBean(4096, R.drawable.share_ic_base_share_password, getString(R.string.share_channel_copy_password)));
                        }
                        if (arrayList2.contains("more")) {
                            this.c.add(new AppBean(1024, R.drawable.share_ic_base_share_more, getString(R.string.share_channel_more)));
                        }
                        list = this.c;
                    }
                    this.c = list;
                    if (this.c == null || this.c.size() <= 0) {
                        boolean equals = TextUtils.equals(a(), "xindaodian_daocan_pintuan");
                        Object[] objArr6 = {Byte.valueOf(equals ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ed03aa1087e95b47cc4870b213711c6f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ed03aa1087e95b47cc4870b213711c6f");
                        } else {
                            this.c.add(new AppBean(128, i2, getString(i3)));
                            this.c.add(new AppBean(256, R.drawable.share_ic_base_share_weixin_friends, getString(R.string.share_channel_weixin_circle)));
                            if (!equals) {
                                this.c.add(new AppBean(512, R.drawable.share_ic_base_share_qq, getString(R.string.share_channel_qq)));
                                this.c.add(new AppBean(2, R.drawable.share_ic_base_share_qzone, getString(R.string.share_channel_qzone)));
                                this.c.add(new AppBean(2048, R.drawable.share_ic_base_share_copy, getString(R.string.share_channel_copy_url)));
                                this.c.add(new AppBean(4096, R.drawable.share_ic_base_share_password, getString(R.string.share_channel_copy_password)));
                                this.c.add(new AppBean(1024, R.drawable.share_ic_base_share_more, getString(R.string.share_channel_more)));
                            }
                        }
                    }
                }
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9fbe16158c797c0e991731236738625d", RobustBitConfig.DEFAULT_VALUE)) {
                    arrayList = (List) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9fbe16158c797c0e991731236738625d");
                } else {
                    arrayList = new ArrayList<>();
                    arrayList.add(new com.sankuai.android.share.common.filter.e(this));
                    arrayList.add(new h(this));
                    arrayList.add(new com.sankuai.android.share.common.filter.d(c(512)));
                    arrayList.add(new com.sankuai.android.share.common.filter.f(c(2)));
                    arrayList.add(new com.sankuai.android.share.common.filter.j(c(i)));
                    arrayList.add(new com.sankuai.android.share.common.filter.i(c(256)));
                    arrayList.add(new com.sankuai.android.share.common.filter.a(c(2048)));
                    arrayList.add(new com.sankuai.android.share.common.filter.c(c(4096)));
                    arrayList.add(new g(c(1024)));
                }
                this.b = arrayList;
                for (AppBean appBean : this.c) {
                    Iterator<com.sankuai.android.share.common.filter.b> it2 = this.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().a(appBean)) {
                                this.c.remove(appBean);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } else {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cb6cd8726e1fab1689ee5ead7751efa");
            }
            if (this.c == null || this.c.isEmpty()) {
                com.sankuai.android.share.a.a(this, getString(R.string.share_cannot_share));
                LyingkitTraceBody lyingkitTraceBody = this.q;
                a(lyingkitTraceBody, "1", "唤起分享面板异常---" + getString(R.string.share_cannot_share));
                finish();
                return;
            }
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "99c55b8009ce757c913cb8c31a0ec757", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "99c55b8009ce757c913cb8c31a0ec757");
            } else {
                this.o = Picasso.g(this);
                this.g = new ShareDialog();
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "5d831663081c065b862bebcc3a9bba9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "5d831663081c065b862bebcc3a9bba9b");
                } else {
                    if (!TextUtils.isEmpty(d()) && !TextUtils.isEmpty(e()) && this.g != null) {
                        this.g.a(e());
                    }
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "705774db51680843b0b4cbd06ac52fca", RobustBitConfig.DEFAULT_VALUE)) {
                        extraImage = (String) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "705774db51680843b0b4cbd06ac52fca");
                    } else if (this.d != null) {
                        extraImage = this.d.getExtraImage();
                    } else {
                        extraImage = (this.e == null || this.e.size() <= 0 || (shareBaseBean2 = this.e.get(this.e.keyAt(0))) == null) ? "" : shareBaseBean2.getExtraImage();
                    }
                    String str = extraImage;
                    Object[] objArr11 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "96744b71c41eadb84ad10599928e19a1", RobustBitConfig.DEFAULT_VALUE)) {
                        extraJumpUrl = (String) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "96744b71c41eadb84ad10599928e19a1");
                    } else if (this.d != null) {
                        extraJumpUrl = this.d.getExtraJumpUrl();
                    } else {
                        extraJumpUrl = (this.e == null || this.e.size() <= 0 || (shareBaseBean3 = this.e.get(this.e.keyAt(0))) == null) ? "" : shareBaseBean3.getExtraJumpUrl();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.o.d(str).a(new Target() { // from class: com.sankuai.android.share.ShareActivity.1
                            public static ChangeQuickRedirect a;

                            @Override // com.squareup.picasso.Target
                            public final void onBitmapFailed(Drawable drawable) {
                            }

                            @Override // com.squareup.picasso.Target
                            public final void onPrepareLoad(Drawable drawable) {
                            }

                            @Override // com.squareup.picasso.Target
                            public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                                Object[] objArr12 = {bitmap, loadedFrom};
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "99b2f01e6c74543b950e76567bfb39ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "99b2f01e6c74543b950e76567bfb39ca");
                                } else if (ShareActivity.this.g != null) {
                                    if (!ShareActivity.this.k) {
                                        ShareActivity.this.g.h = new ShareDialog.a() { // from class: com.sankuai.android.share.ShareActivity.1.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.android.share.common.ShareDialog.a
                                            public final void a() {
                                                Object[] objArr13 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect13 = a;
                                                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "90f3bc6725a1d70d65a564029e482eea", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "90f3bc6725a1d70d65a564029e482eea");
                                                } else if (Statistics.isInitialized()) {
                                                    HashMap hashMap = new HashMap();
                                                    hashMap.put("url", TextUtils.isEmpty(extraJumpUrl) ? "-999" : extraJumpUrl);
                                                    hashMap.put("id", TextUtils.isEmpty(ShareActivity.this.d()) ? "-999" : ShareActivity.this.d());
                                                    i.c("b_group_j69qw1v0_mv", hashMap).a("c_group_85oqsn4n").a();
                                                }
                                            }

                                            @Override // com.sankuai.android.share.common.ShareDialog.a
                                            public final void b() {
                                                Object[] objArr13 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect13 = a;
                                                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "496b564b601cfb9df81208bcbed8abed", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "496b564b601cfb9df81208bcbed8abed");
                                                    return;
                                                }
                                                if (Statistics.isInitialized()) {
                                                    HashMap hashMap = new HashMap();
                                                    hashMap.put("url", TextUtils.isEmpty(extraJumpUrl) ? "-999" : extraJumpUrl);
                                                    hashMap.put("id", TextUtils.isEmpty(ShareActivity.this.d()) ? "-999" : ShareActivity.this.d());
                                                    i.d("b_group_j69qw1v0_mc", hashMap).a("c_group_85oqsn4n").a();
                                                }
                                                if (TextUtils.isEmpty(extraJumpUrl)) {
                                                    return;
                                                }
                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                if (extraJumpUrl.startsWith("http")) {
                                                    intent.setData(Uri.parse(KNBWebManager.IEnvironment.WEBVIEW_URI).buildUpon().appendQueryParameter("url", extraJumpUrl).build());
                                                } else {
                                                    intent.setData(Uri.parse(extraJumpUrl));
                                                }
                                                intent.addCategory("android.intent.category.DEFAULT");
                                                intent.setPackage(ShareActivity.this.getPackageName());
                                                ShareActivity.this.startActivity(intent);
                                            }
                                        };
                                    }
                                    ShareActivity.this.g.a(bitmap, !ShareActivity.this.k);
                                }
                            }
                        });
                    }
                }
                this.h = new com.sankuai.android.share.keymodule.SharePanel.b(this, this.c, b());
                this.h.e = this.r;
                this.h.d = this.s;
                this.g.a(this.h);
                ShareDialog shareDialog = this.g;
                e eVar = this.p;
                if (eVar != null) {
                    shareDialog.i = eVar;
                }
                this.g.e = new ShareDialog.b() { // from class: com.sankuai.android.share.ShareActivity.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.android.share.common.ShareDialog.b
                    public final void a(DialogInterface dialogInterface, boolean z) {
                        int id;
                        Object[] objArr12 = {dialogInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect12 = a;
                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "f5a17d241c3aa45787ae41f73a5f759c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "f5a17d241c3aa45787ae41f73a5f759c");
                        } else if (ShareActivity.this.f == null || !((id = ShareActivity.this.f.getId()) == 512 || id == 2)) {
                            if (Statistics.isInitialized() && z) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("title", IPaymentManager.NO_ACTION);
                                hashMap.put("title_name", IPaymentManager.NO_ACTION);
                                hashMap.put("bg_name", ShareActivity.this.a());
                                hashMap.put("bu_name", j.a(ShareActivity.this.d));
                                hashMap.put("url", ShareActivity.this.f());
                                hashMap.put("type", ShareActivity.this.l);
                                hashMap.put("wxapp", "");
                                hashMap.put("cid", j.b(ShareActivity.this.d));
                                hashMap.put("pagenm", ShareActivity.this.m);
                                hashMap.put("appshare", "");
                                i.b("b_Z6rip", hashMap).a("c_sxr976a").a();
                            }
                            ShareActivity.this.finish();
                        }
                    }
                };
                this.g.show(getSupportFragmentManager(), "dialog");
            }
            if (Statistics.isInitialized()) {
                Statistics.getChannel("group").writePageView(AppUtil.generatePageInfoKey(this), "c_group_85oqsn4n", null);
            }
            a(this.q, "0", "唤起分享面板成功");
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9828877f2b342cd5e3e7ed5efd03f674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9828877f2b342cd5e3e7ed5efd03f674");
            return;
        }
        super.finish();
        if (!TextUtils.isEmpty(this.i)) {
            Intent intent = new Intent();
            intent.putExtra("message", com.sankuai.android.share.a.a(this));
            intent.putExtra("showBottom", this.j);
            intent.setAction(this.i);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9059bd9f9bdf418842f073ca268bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9059bd9f9bdf418842f073ca268bc3");
            return;
        }
        super.onDestroy();
        com.sankuai.android.share.a.b(this);
        this.g = null;
        this.h = null;
    }

    private ShareBaseBean a(ShareBaseBean shareBaseBean, b.a aVar) {
        Object[] objArr = {shareBaseBean, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a40ff14990eeee1570e150f71e2f06", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareBaseBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a40ff14990eeee1570e150f71e2f06");
        }
        if (shareBaseBean == null) {
            return null;
        }
        this.n = j.a();
        shareBaseBean.setAppshare(this.n);
        return shareBaseBean;
    }

    private ShareBaseBean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e146d87fe0073e58f9a74e9f8f7ab24", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareBaseBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e146d87fe0073e58f9a74e9f8f7ab24");
        }
        if (this.d != null) {
            return this.d;
        }
        if (this.e != null) {
            if (this.e.get(i) == null) {
                return this.e.valueAt(0);
            }
            return this.e.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e85f82ad5fd8335c814aa2b088e6b7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e85f82ad5fd8335c814aa2b088e6b7") : this.d != null ? TextUtils.isEmpty(this.d.getBg()) ? "" : this.d.getBg() : (this.e == null || this.e.size() <= 0 || (shareBaseBean = this.e.get(this.e.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getBg())) ? "" : shareBaseBean.getBg();
    }

    private HashMap<String, String> b() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c8264dfabdcbb768618039449dffd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c8264dfabdcbb768618039449dffd4");
        }
        if (this.d != null) {
            return this.d.getBubbleMap();
        }
        if (this.e == null || this.e.size() <= 0 || (shareBaseBean = this.e.get(this.e.keyAt(0))) == null) {
            return null;
        }
        return shareBaseBean.getBubbleMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r19) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.share.ShareActivity.a(int):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb613fd905e7f6166d5d4d0927af82f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb613fd905e7f6166d5d4d0927af82f");
        }
        if (this.d != null) {
            return TextUtils.isEmpty(this.d.getMiniProgramId()) ? "" : this.d.getMiniProgramId();
        } else if (this.e == null || this.e.size() <= 0) {
            return "";
        } else {
            for (int i = 0; i < this.e.size(); i++) {
                ShareBaseBean shareBaseBean = this.e.get(this.e.keyAt(i));
                if (shareBaseBean != null && !TextUtils.isEmpty(shareBaseBean.getMiniProgramPath()) && !TextUtils.isEmpty(shareBaseBean.getMiniProgramId())) {
                    return shareBaseBean.getMiniProgramId();
                }
            }
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47cbfa8fa7387f9ef69807a018f3a760", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47cbfa8fa7387f9ef69807a018f3a760") : this.d != null ? TextUtils.isEmpty(this.d.getCid()) ? "" : this.d.getCid() : (this.e == null || this.e.size() <= 0 || (shareBaseBean = this.e.get(this.e.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getCid())) ? "" : shareBaseBean.getCid();
    }

    private String e() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0927083b4ec28227167693084f77e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0927083b4ec28227167693084f77e8") : this.d != null ? TextUtils.isEmpty(this.d.getActivityTitleString()) ? "" : this.d.getActivityTitleString() : (this.e == null || this.e.size() <= 0 || (shareBaseBean = this.e.get(this.e.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getActivityTitleString())) ? "" : shareBaseBean.getActivityTitleString();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2665a6b23ac1b13a23dc62c5356307ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2665a6b23ac1b13a23dc62c5356307ce");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (intent != null && i == 1) {
            com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", this.q, "0"), "share_weiboService_shareCallBack", Integer.valueOf(i2), intent, this, this.g);
        } else {
            Tencent.onActivityResultData(i, i2, intent, null);
            if (this.g != null) {
                ShareDialog shareDialog = this.g;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = ShareDialog.d;
                if (PatchProxy.isSupport(objArr2, shareDialog, changeQuickRedirect2, false, "7387981b7716a944d13bccd9522377f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, shareDialog, changeQuickRedirect2, false, "7387981b7716a944d13bccd9522377f5");
                } else {
                    shareDialog.f = false;
                    shareDialog.g = true;
                    shareDialog.c();
                }
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.sankuai.android.share.interfaces.c
    public final void a(b.a aVar, c.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2fd8c8fc19cc2dbbfdd1020ea75115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2fd8c8fc19cc2dbbfdd1020ea75115");
        } else if (aVar == b.a.PASSWORD) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fb038c3eafcba3f8ab3c7ff963e88b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fb038c3eafcba3f8ab3c7ff963e88b") : this.d != null ? TextUtils.isEmpty(this.d.getUrl()) ? "" : this.d.getUrl() : (this.e == null || this.e.size() <= 0 || (shareBaseBean = this.e.get(this.e.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getUrl())) ? "" : shareBaseBean.getUrl();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static Map<String, Object> b = new HashMap(2);

        public static synchronized void a(String str, Object obj) {
            synchronized (a.class) {
                Object[] objArr = {str, obj};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d27895fa13e55e043f93bf56f050e03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d27895fa13e55e043f93bf56f050e03");
                    return;
                }
                if (!TextUtils.isEmpty(str) && obj != null) {
                    if (b == null) {
                        b = new HashMap();
                    }
                    b.put(str, obj);
                }
            }
        }

        public static synchronized Object a(String str) {
            synchronized (a.class) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6674d3749a78631f938d1ffef2ed4b17", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6674d3749a78631f938d1ffef2ed4b17");
                }
                if (!TextUtils.isEmpty(str) && b != null) {
                    return b.remove(str);
                }
                return null;
            }
        }
    }

    private void a(LyingkitTraceBody lyingkitTraceBody, String str, String str2) {
        Object[] objArr = {lyingkitTraceBody, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd53dafdbdbba0d5683b323b84960d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd53dafdbdbba0d5683b323b84960d7");
        } else if (lyingkitTraceBody != null) {
            lyingkitTraceBody.g = str;
            lyingkitTraceBody.h = str2;
        }
    }
}
