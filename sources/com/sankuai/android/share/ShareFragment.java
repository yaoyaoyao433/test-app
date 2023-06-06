package com.sankuai.android.share;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.AppBean;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.ShareDialog;
import com.sankuai.android.share.common.filter.d;
import com.sankuai.android.share.common.filter.e;
import com.sankuai.android.share.common.filter.f;
import com.sankuai.android.share.common.filter.g;
import com.sankuai.android.share.common.filter.h;
import com.sankuai.android.share.common.filter.i;
import com.sankuai.android.share.common.filter.j;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.keymodule.SharePanel.b;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
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
public class ShareFragment extends ShareDialog implements c {
    public static ChangeQuickRedirect a;
    protected ShareBaseBean b;
    protected SparseArray<ShareBaseBean> c;
    private String j;
    private List<AppBean> k;
    private AppBean l;
    private String m;
    private a n;
    private b o;
    private Picasso p;
    private String q;
    private b.a r;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8037c8bc59ac0cfc782de050e9f6a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8037c8bc59ac0cfc782de050e9f6a6") : i != 2 ? i != 128 ? i != 256 ? i != 512 ? i != 1024 ? i != 2048 ? i != 4096 ? "" : "password" : "copy" : "more" : "qq" : "pyq" : MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX : "qqzone";
    }

    public ShareFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0857070ba0b189644398ac5195fa1f84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0857070ba0b189644398ac5195fa1f84");
            return;
        }
        this.j = "";
        this.m = "";
        this.q = "";
        this.r = new b.a() { // from class: com.sankuai.android.share.ShareFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.keymodule.SharePanel.b.a
            public final void a(AppBean appBean) {
                Object[] objArr2 = {appBean};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2f00d939e388da1114b49983afdb49c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2f00d939e388da1114b49983afdb49c");
                } else if (appBean == null) {
                } else {
                    ShareFragment.this.l = appBean;
                    ShareFragment.a(ShareFragment.this, appBean.getId());
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0371, code lost:
        if (r20 != 128) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.android.share.ShareFragment r19, int r20) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.share.ShareFragment.a(com.sankuai.android.share.ShareFragment, int):void");
    }

    @Override // com.sankuai.android.share.common.ShareDialog, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        String originUrl;
        ShareBaseBean shareBaseBean;
        int i5;
        List<AppBean> list;
        List arrayList;
        String extraImage;
        ShareBaseBean shareBaseBean2;
        final String extraJumpUrl;
        ShareBaseBean shareBaseBean3;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ab09bd06b3f6ac67a2ab453be37d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ab09bd06b3f6ac67a2ab453be37d3a");
            return;
        }
        super.onViewCreated(view, bundle);
        if (getActivity() == null) {
            a();
            return;
        }
        com.sankuai.android.share.a.a();
        this.j = com.meituan.android.base.share.b.a();
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("extra_share_data") : null;
        if (obj == null) {
            com.sankuai.android.share.a.a(getActivity(), getString(R.string.share_data_none));
            a();
            return;
        }
        if (obj instanceof ShareBaseBean) {
            this.b = (ShareBaseBean) obj;
        } else if (obj instanceof SparseArray) {
            this.c = (SparseArray) obj;
        }
        if (this.b == null && this.c == null) {
            com.sankuai.android.share.a.a(getActivity(), getString(R.string.share_data_none));
            a();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbda10b010c302161fd9cf1b2f81cdb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbda10b010c302161fd9cf1b2f81cdb7");
            i = 128;
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            i = 128;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa717a7a24db85522c30d7ff3efd8f6f", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa717a7a24db85522c30d7ff3efd8f6f");
                i2 = R.drawable.share_ic_base_share_weixin;
                i3 = R.string.share_channel_weixin_friend;
                i5 = R.drawable.share_ic_base_share_qq;
                i4 = R.string.share_channel_weixin_circle;
            } else {
                this.k = new CopyOnWriteArrayList();
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                i2 = R.drawable.share_ic_base_share_weixin;
                i3 = R.string.share_channel_weixin_friend;
                i4 = R.string.share_channel_weixin_circle;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "424d0e4a7690246abc5e6f55ec316334", RobustBitConfig.DEFAULT_VALUE)) {
                    originUrl = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "424d0e4a7690246abc5e6f55ec316334");
                } else if (this.b != null) {
                    originUrl = this.b.getOriginUrl();
                } else {
                    originUrl = (this.c == null || this.c.size() <= 0 || (shareBaseBean = this.c.get(this.c.keyAt(0))) == null) ? "" : shareBaseBean.getOriginUrl();
                }
                JsonArray a2 = com.sankuai.android.share.common.util.a.a(originUrl);
                ArrayList arrayList2 = new ArrayList();
                if (a2 != null) {
                    Iterator<JsonElement> it = a2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAsString());
                    }
                }
                if (arrayList2.contains(MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX)) {
                    this.k.add(new AppBean(128, R.drawable.share_ic_base_share_weixin, getString(R.string.share_channel_weixin_friend)));
                }
                if (arrayList2.contains("pyq")) {
                    this.k.add(new AppBean(256, R.drawable.share_ic_base_share_weixin_friends, getString(R.string.share_channel_weixin_circle)));
                }
                if (arrayList2.contains("qq")) {
                    List<AppBean> list2 = this.k;
                    String string = getString(R.string.share_channel_qq);
                    i5 = R.drawable.share_ic_base_share_qq;
                    list2.add(new AppBean(512, R.drawable.share_ic_base_share_qq, string));
                } else {
                    i5 = R.drawable.share_ic_base_share_qq;
                }
                if (arrayList2.contains("qqzone")) {
                    this.k.add(new AppBean(2, R.drawable.share_ic_base_share_qzone, getString(R.string.share_channel_qzone)));
                }
                if (arrayList2.contains("copy")) {
                    this.k.add(new AppBean(2048, R.drawable.share_ic_base_share_copy, getString(R.string.share_channel_copy_url)));
                }
                if (arrayList2.contains("password")) {
                    this.k.add(new AppBean(4096, R.drawable.share_ic_base_share_password, getString(R.string.share_channel_copy_password)));
                }
                if (arrayList2.contains("more")) {
                    this.k.add(new AppBean(1024, R.drawable.share_ic_base_share_more, getString(R.string.share_channel_more)));
                }
                list = this.k;
            }
            this.k = list;
            if (this.k == null || this.k.size() <= 0) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "095a207b9f734b92e555c3e475f358c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "095a207b9f734b92e555c3e475f358c5");
                } else {
                    this.k = new CopyOnWriteArrayList();
                    this.k.add(new AppBean(128, i2, getString(i3)));
                    this.k.add(new AppBean(256, R.drawable.share_ic_base_share_weixin_friends, getString(i4)));
                    this.k.add(new AppBean(512, i5, getString(R.string.share_channel_qq)));
                    this.k.add(new AppBean(2, R.drawable.share_ic_base_share_qzone, getString(R.string.share_channel_qzone)));
                    this.k.add(new AppBean(2048, R.drawable.share_ic_base_share_copy, getString(R.string.share_channel_copy_url)));
                    this.k.add(new AppBean(4096, R.drawable.share_ic_base_share_password, getString(R.string.share_channel_copy_password)));
                    this.k.add(new AppBean(1024, R.drawable.share_ic_base_share_more, getString(R.string.share_channel_more)));
                }
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b69922c71a62c69486d359b2a48c01fa", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b69922c71a62c69486d359b2a48c01fa");
        } else {
            arrayList = new ArrayList();
            arrayList.add(new e(getActivity()));
            arrayList.add(new h(getActivity()));
            arrayList.add(new d(a(512)));
            arrayList.add(new f(a(2)));
            arrayList.add(new j(a(i)));
            arrayList.add(new i(a(256)));
            arrayList.add(new com.sankuai.android.share.common.filter.a(a(2048)));
            arrayList.add(new com.sankuai.android.share.common.filter.c(a(4096)));
            arrayList.add(new g(a(1024)));
        }
        for (AppBean appBean : this.k) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((com.sankuai.android.share.common.filter.b) it2.next()).a(appBean)) {
                        this.k.remove(appBean);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (this.k.isEmpty()) {
            com.sankuai.android.share.a.a(getActivity(), getString(R.string.share_data_none));
            a();
            return;
        }
        if (Statistics.isInitialized()) {
            HashMap hashMap = new HashMap();
            hashMap.put("bg_name", e());
            hashMap.put("bu_name", com.sankuai.android.share.util.j.a(this.b));
            hashMap.put("items", g());
            hashMap.put("wxapp", h());
            hashMap.put("cid", com.sankuai.android.share.util.j.b(this.b));
            hashMap.put("pagenm", this.j);
            com.sankuai.android.share.util.i.a("b_PHDJN", hashMap).a("c_sxr976a").a();
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ce353be59ad75e6b5a92264d5154bfb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ce353be59ad75e6b5a92264d5154bfb7");
            return;
        }
        this.p = Picasso.g(getActivity());
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "156bc014b20457edfc60dc5423c4eb43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "156bc014b20457edfc60dc5423c4eb43");
        } else {
            if (!TextUtils.isEmpty(i()) && !TextUtils.isEmpty(d())) {
                a(d());
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a74f752022e6ebe3594eafc421cf86d2", RobustBitConfig.DEFAULT_VALUE)) {
                extraImage = (String) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a74f752022e6ebe3594eafc421cf86d2");
            } else if (this.b != null) {
                extraImage = this.b.getExtraImage();
            } else {
                extraImage = (this.c == null || this.c.size() <= 0 || (shareBaseBean2 = this.c.get(this.c.keyAt(0))) == null) ? "" : shareBaseBean2.getExtraImage();
            }
            String str = extraImage;
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "511228b1c2de5792276764d219bc0268", RobustBitConfig.DEFAULT_VALUE)) {
                extraJumpUrl = (String) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "511228b1c2de5792276764d219bc0268");
            } else if (this.b != null) {
                extraJumpUrl = this.b.getExtraJumpUrl();
            } else {
                extraJumpUrl = (this.c == null || this.c.size() <= 0 || (shareBaseBean3 = this.c.get(this.c.keyAt(0))) == null) ? "" : shareBaseBean3.getExtraJumpUrl();
            }
            if (!TextUtils.isEmpty(str)) {
                this.p.d(str).a(new Target() { // from class: com.sankuai.android.share.ShareFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr11 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect11 = a;
                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "98da5648e9755f22b0ef4e3196d30bca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "98da5648e9755f22b0ef4e3196d30bca");
                        } else if (ShareFragment.this.getActivity() != null) {
                            ShareFragment.this.h = new ShareDialog.a() { // from class: com.sankuai.android.share.ShareFragment.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.android.share.common.ShareDialog.a
                                public final void a() {
                                    Object[] objArr12 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "44d8e3fd8af1808bf8c57b20c00166fd", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "44d8e3fd8af1808bf8c57b20c00166fd");
                                    } else if (Statistics.isInitialized()) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("url", TextUtils.isEmpty(extraJumpUrl) ? "-999" : extraJumpUrl);
                                        hashMap2.put("id", TextUtils.isEmpty(ShareFragment.this.i()) ? "-999" : ShareFragment.this.i());
                                        com.sankuai.android.share.util.i.c("b_group_j69qw1v0_mv", hashMap2).a("c_group_85oqsn4n").a();
                                    }
                                }

                                @Override // com.sankuai.android.share.common.ShareDialog.a
                                public final void b() {
                                    Object[] objArr12 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "ca2e855906322ff65a07383304521849", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "ca2e855906322ff65a07383304521849");
                                        return;
                                    }
                                    if (Statistics.isInitialized()) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("url", TextUtils.isEmpty(extraJumpUrl) ? "-999" : extraJumpUrl);
                                        hashMap2.put("id", TextUtils.isEmpty(ShareFragment.this.i()) ? "-999" : ShareFragment.this.i());
                                        com.sankuai.android.share.util.i.d("b_group_j69qw1v0_mc", hashMap2).a("c_group_85oqsn4n").a();
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
                                    intent.setPackage(ShareFragment.this.getActivity().getPackageName());
                                    ShareFragment.this.startActivity(intent);
                                }
                            };
                            ShareFragment.this.a(bitmap, true);
                        }
                    }
                });
            }
        }
        this.e = new ShareDialog.b() { // from class: com.sankuai.android.share.ShareFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.common.ShareDialog.b
            public final void a(DialogInterface dialogInterface, boolean z) {
                int id;
                Object[] objArr11 = {dialogInterface, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "dc39472dcf2e5aa2a4b0338a84336ca6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "dc39472dcf2e5aa2a4b0338a84336ca6");
                } else if ((ShareFragment.this.l == null || !((id = ShareFragment.this.l.getId()) == 512 || id == 2)) && Statistics.isInitialized() && z) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("title", IPaymentManager.NO_ACTION);
                    hashMap2.put("title_name", IPaymentManager.NO_ACTION);
                    hashMap2.put("bg_name", ShareFragment.this.e());
                    hashMap2.put("bu_name", com.sankuai.android.share.util.j.a(ShareFragment.this.b));
                    hashMap2.put("url", ShareFragment.this.j());
                    hashMap2.put("type", ShareFragment.this.m);
                    hashMap2.put("wxapp", "");
                    hashMap2.put("cid", com.sankuai.android.share.util.j.b(ShareFragment.this.b));
                    hashMap2.put("pagenm", ShareFragment.this.j);
                    com.sankuai.android.share.util.i.b("b_Z6rip", hashMap2).a("c_sxr976a").a();
                }
            }
        };
        this.o = new b(getActivity(), this.k, null);
        this.o.d = this.r;
        a(this.o);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40774a7649e4a47f9ec2d8636a68c6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40774a7649e4a47f9ec2d8636a68c6d8");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (intent != null && i == 1) {
            if (i2 == -1) {
                switch (com.sankuai.waimai.platform.utils.f.a(intent, "extra_call_back", -1)) {
                    case 0:
                        a(b.a.SINA_WEIBO, c.a.COMPLETE);
                        a("success", "-999");
                        break;
                    case 1:
                        a(b.a.SINA_WEIBO, c.a.FAILED);
                        a("fail", "-999");
                        break;
                    case 2:
                        a(b.a.SINA_WEIBO, c.a.CANCEL);
                        a("fail", "2");
                        break;
                }
            }
            dismiss();
        } else {
            Tencent.onActivityResultData(i, i2, intent, null);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe5870fb4a5f36c6c13489ea163ec74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe5870fb4a5f36c6c13489ea163ec74");
            return;
        }
        if (getActivity() != null) {
            com.sankuai.android.share.a.b(getActivity());
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a2d2783dd8a302ecfa9bfb5049f8d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a2d2783dd8a302ecfa9bfb5049f8d4");
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    private ShareBaseBean a(ShareBaseBean shareBaseBean, b.a aVar) {
        Object[] objArr = {shareBaseBean, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cc43e864b212b140e82174869bd6f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareBaseBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cc43e864b212b140e82174869bd6f8d");
        }
        if (shareBaseBean == null) {
            return null;
        }
        this.q = com.sankuai.android.share.util.j.a();
        shareBaseBean.setAppshare(this.q);
        return shareBaseBean;
    }

    private ShareBaseBean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cacc761736eec5ef9d5f7c33946500", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareBaseBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cacc761736eec5ef9d5f7c33946500");
        }
        if (this.b != null) {
            return this.b;
        }
        if (this.c != null) {
            if (this.c.get(i) == null) {
                return this.c.valueAt(0);
            }
            return this.c.get(i);
        }
        return null;
    }

    @Override // com.sankuai.android.share.common.ShareDialog
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8102c34b1313b2055ba692e6c1b976e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8102c34b1313b2055ba692e6c1b976e");
            return;
        }
        if (getActivity() != null) {
            String a2 = com.sankuai.android.share.a.a(getActivity());
            if (!TextUtils.isEmpty(a2)) {
                new com.sankuai.meituan.android.ui.widget.a(getActivity(), a2, -1).a();
            }
        }
        super.a();
    }

    @Override // com.sankuai.android.share.common.ShareDialog, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "317258d55b6560e74af53f40b0ab3b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "317258d55b6560e74af53f40b0ab3b63");
        } else {
            super.onDismiss(dialogInterface);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37951d590059f24851f4f93d758c1213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37951d590059f24851f4f93d758c1213");
        } else if (Statistics.isInitialized()) {
            HashMap hashMap = new HashMap();
            hashMap.put("title", "weibo");
            hashMap.put("title_name", "新浪微博");
            hashMap.put("result", str);
            hashMap.put("bg_name", e());
            hashMap.put("bu_name", f());
            hashMap.put("type", this.m);
            hashMap.put("wxapp", "");
            hashMap.put("cid", i());
            hashMap.put("pagenm", this.j);
            hashMap.put("sort", str2);
            hashMap.put("appshare", this.q == null ? "" : this.q);
            com.sankuai.android.share.util.d.a(this, "b_e7rrs", "c_sxr976a", hashMap);
        }
    }

    @Override // com.sankuai.android.share.interfaces.c
    public final void a(b.a aVar, c.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ee9d11cc3309942ca2870b9fd58a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ee9d11cc3309942ca2870b9fd58a12");
        } else if (aVar == b.a.QQ) {
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.android.share.ShareFragment.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2118f0cdeda296b8589cb0b4224495a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2118f0cdeda296b8589cb0b4224495a7");
                    } else if (ShareFragment.this.isAdded()) {
                        ShareFragment.this.dismiss();
                    }
                }
            }, 1000L);
        } else {
            dismiss();
        }
    }

    private String d() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e87d9e1e353febe39a4542753645170a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e87d9e1e353febe39a4542753645170a") : this.b != null ? TextUtils.isEmpty(this.b.getActivityTitleString()) ? "" : this.b.getActivityTitleString() : (this.c == null || this.c.size() <= 0 || (shareBaseBean = this.c.get(this.c.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getActivityTitleString())) ? "" : shareBaseBean.getActivityTitleString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4604d62611a5653c96db855a52d860eb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4604d62611a5653c96db855a52d860eb") : this.b != null ? TextUtils.isEmpty(this.b.getBg()) ? "" : this.b.getBg() : (this.c == null || this.c.size() <= 0 || (shareBaseBean = this.c.get(this.c.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getBg())) ? "" : shareBaseBean.getBg();
    }

    private String f() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89fb9d77147a1f5035e8bb5cf3155687", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89fb9d77147a1f5035e8bb5cf3155687") : this.b != null ? TextUtils.isEmpty(this.b.getBu()) ? "" : this.b.getBu() : (this.c == null || this.c.size() <= 0 || (shareBaseBean = this.c.get(this.c.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getBu())) ? "" : shareBaseBean.getBu();
    }

    private List<Map<String, String>> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde7c3448e4487a4f3114ee119c583d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde7c3448e4487a4f3114ee119c583d2");
        }
        ArrayList arrayList = new ArrayList();
        if (this.k == null || this.k.size() == 0) {
            return arrayList;
        }
        for (AppBean appBean : this.k) {
            HashMap hashMap = new HashMap();
            hashMap.put("title", b(appBean.getId()));
            hashMap.put("title_name", appBean.getAppName());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277ec32ba9849b5810da47bee52a74dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277ec32ba9849b5810da47bee52a74dc");
        }
        if (this.b != null) {
            return TextUtils.isEmpty(this.b.getMiniProgramId()) ? "" : this.b.getMiniProgramId();
        } else if (this.c == null || this.c.size() <= 0) {
            return "";
        } else {
            for (int i = 0; i < this.c.size(); i++) {
                ShareBaseBean shareBaseBean = this.c.get(this.c.keyAt(i));
                if (shareBaseBean != null && !TextUtils.isEmpty(shareBaseBean.getMiniProgramPath()) && !TextUtils.isEmpty(shareBaseBean.getMiniProgramId())) {
                    return shareBaseBean.getMiniProgramId();
                }
            }
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39cf95adf58fcead3ac1fbdc50f9ae7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39cf95adf58fcead3ac1fbdc50f9ae7") : this.b != null ? TextUtils.isEmpty(this.b.getCid()) ? "" : this.b.getCid() : (this.c == null || this.c.size() <= 0 || (shareBaseBean = this.c.get(this.c.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getCid())) ? "" : shareBaseBean.getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String j() {
        ShareBaseBean shareBaseBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a08bc7423dee676ccfd317328a7fc83", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a08bc7423dee676ccfd317328a7fc83") : this.b != null ? TextUtils.isEmpty(this.b.getUrl()) ? "" : this.b.getUrl() : (this.c == null || this.c.size() <= 0 || (shareBaseBean = this.c.get(this.c.keyAt(0))) == null || TextUtils.isEmpty(shareBaseBean.getUrl())) ? "" : shareBaseBean.getUrl();
    }
}
