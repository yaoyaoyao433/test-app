package com.sankuai.android.share.keymodule.shareChannel.weixin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.ShareActivity;
import com.sankuai.android.share.bean.MiniProgramBaseBean;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.bean.WeixinCallbackBean;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.keymodule.b;
import com.sankuai.android.share.keymodule.shareChannel.weixin.template.a;
import com.sankuai.android.share.util.d;
import com.sankuai.android.share.util.i;
import com.sankuai.waimai.platform.utils.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.utils.ILog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "weixinService")
/* loaded from: classes3.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private b.a b;
    private ShareBaseBean c;
    private c d;
    private IWXAPI e;
    private WeakReference<Context> f;
    private LyingkitTraceBody g;
    private Bitmap h;
    private Target i;
    private C0542a j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4aece7ad57cd26677a996998e4c97b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4aece7ad57cd26677a996998e4c97b");
        } else {
            this.i = new Target() { // from class: com.sankuai.android.share.keymodule.shareChannel.weixin.a.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8ee131a0860681a75dabfdae2782c54", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8ee131a0860681a75dabfdae2782c54");
                        return;
                    }
                    com.sankuai.android.share.util.c.a("微信分享图片加载成功");
                    a.this.a(bitmap);
                    if (a.this.c != null) {
                        Sniffer.normal("biz_share", "ShareByWeixin", "onBitmapLoaded", a.this.c.toString());
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18d795c0484ee170838bccce3124d404", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18d795c0484ee170838bccce3124d404");
                        return;
                    }
                    com.sankuai.android.share.util.c.a("微信分享图片加载失败");
                    a.this.a((Bitmap) null);
                    if (a.this.c != null) {
                        Sniffer.smell("biz_share", "ShareByWeixin", "onBitmapFailed", "微信分享图片加载失败", a.this.c.toString());
                    }
                }
            };
        }
    }

    @NomApiInterface(alias = UserCenter.OAUTH_TYPE_WEIXIN)
    public void share(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425e9ba72968bb385606c34cb9090456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425e9ba72968bb385606c34cb9090456");
            return;
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用微信分享 Service 接口成功");
        if (context == null) {
            return;
        }
        this.g = lyingkitTraceBody;
        this.f = new WeakReference<>(context);
        this.b = aVar;
        this.e = WXAPIFactory.createWXAPI(context.getApplicationContext(), com.sankuai.android.share.common.util.c.a(context), true);
        this.e.setLogImpl(new ILog() { // from class: com.sankuai.android.share.keymodule.shareChannel.weixin.a.2
            public static ChangeQuickRedirect a;

            @Override // com.tencent.mm.opensdk.utils.ILog
            public final void d(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08d065d49e0712e77a415a3db1b3c8d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08d065d49e0712e77a415a3db1b3c8d2");
                }
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public final void i(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c7a686e52c04a48dbadf7344ebd5bb3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c7a686e52c04a48dbadf7344ebd5bb3");
                }
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public final void v(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "247ba57fecb3838955a380bf1f9733e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "247ba57fecb3838955a380bf1f9733e6");
                }
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public final void w(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "268cba5a1993509a32fbc200a37bcd10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "268cba5a1993509a32fbc200a37bcd10");
                }
            }

            @Override // com.tencent.mm.opensdk.utils.ILog
            public final void e(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d6335559aaa0518ef1be3da2def8f92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d6335559aaa0518ef1be3da2def8f92");
                    return;
                }
                Log.e(str, str2);
                com.sankuai.android.share.util.c.a("微信分享内部异常,tag: " + str + ",msg: " + str2);
            }
        });
        this.e.registerApp(com.sankuai.android.share.common.util.c.a(context));
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "597a5563f07d299834cd24bf799a0c72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "597a5563f07d299834cd24bf799a0c72");
            } else if (this.f != null && this.f.get() != null) {
                b();
                this.j = new C0542a(this.f.get());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("weixinshare");
                this.f.get().registerReceiver(this.j, intentFilter);
                com.sankuai.android.share.util.c.a("注册微信回调广播");
            }
        } catch (Exception unused) {
        }
        if (this.f == null || this.f.get() == null) {
            return;
        }
        this.c = shareBaseBean;
        this.d = cVar;
        if (this.c == null) {
            com.sankuai.android.share.keymodule.a.a(this.g, "1", "微信分享传入数据类型异常---null");
            return;
        }
        com.sankuai.android.share.util.c.a("开始微信分享");
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d36a17e53e97a1265c5bdb2c78d83628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d36a17e53e97a1265c5bdb2c78d83628");
        } else if (this.e.isWXAppInstalled()) {
            if (!TextUtils.isEmpty(this.c.getPassword())) {
                String password = this.c.getPassword();
                Object[] objArr4 = {password};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e8a19b75a736137dd703faa1cc4ea331", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e8a19b75a736137dd703faa1cc4ea331");
                    return;
                }
                WXTextObject wXTextObject = new WXTextObject();
                wXTextObject.text = password;
                WXMediaMessage wXMediaMessage = new WXMediaMessage();
                wXMediaMessage.mediaObject = wXTextObject;
                wXMediaMessage.description = password;
                SendMessageToWX.Req req = new SendMessageToWX.Req();
                if (TextUtils.isEmpty(this.c.getMmpshare())) {
                    req.transaction = String.valueOf(System.currentTimeMillis());
                } else {
                    req.transaction = "action_" + this.c.getMmpshare();
                }
                req.message = wXMediaMessage;
                req.scene = 0;
                this.e.sendReq(req);
                com.sankuai.android.share.util.c.a("微信口令分享");
                d.a(this.f.get(), this.b, this.c);
            } else if (!TextUtils.isEmpty(this.c.getImgUrl()) && this.c.isLocalImage() && Build.VERSION.SDK_INT <= 28) {
                com.sankuai.android.share.util.c.a("微信分享本地图片");
                c cVar2 = this.d;
                Object[] objArr5 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "51b13c501220f4be61c550a136bca4df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "51b13c501220f4be61c550a136bca4df");
                } else if (this.f == null || this.f.get() == null) {
                } else {
                    this.d = cVar2;
                    if (this.e.isWXAppInstalled()) {
                        com.sankuai.android.share.util.c.a("微信本地图片分享image：" + this.c.getImgUrl());
                        WXMediaMessage wXMediaMessage2 = new WXMediaMessage();
                        WXImageObject wXImageObject = new WXImageObject();
                        wXImageObject.setImagePath(this.c.getImgUrl());
                        wXMediaMessage2.mediaObject = wXImageObject;
                        SendMessageToWX.Req req2 = new SendMessageToWX.Req();
                        if (!TextUtils.isEmpty(this.c.getMmpshare())) {
                            req2.transaction = "action_" + this.c.getMmpshare();
                        } else {
                            req2.transaction = String.valueOf(System.currentTimeMillis());
                        }
                        req2.message = wXMediaMessage2;
                        if (b.a.WEIXIN_FRIEDN == this.b) {
                            req2.scene = 0;
                        } else if (b.a.WEIXIN_CIRCLE == this.b) {
                            req2.scene = 1;
                        }
                        this.e.sendReq(req2);
                        d.a(this.f.get(), this.b, this.c);
                        return;
                    }
                    if (this.f.get() != null) {
                        com.sankuai.android.share.a.a(this.f.get(), (int) R.string.share_no_weixin_client);
                    }
                    if (this.d != null) {
                        this.d.a(this.b, c.a.FAILED);
                    }
                    LyingkitTraceBody lyingkitTraceBody2 = this.g;
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody2, "1", "微信分享唤起失败---title:" + this.c.getTitle() + "  content:" + this.c.getContent() + " URLString:" + this.c.getUrl() + " imageURLString:" + this.c.getImgUrl());
                    d.a(this.f.get(), this.b, this.c, a.EnumC0540a.Uninstalled);
                }
            } else {
                com.sankuai.android.share.keymodule.shareChannel.weixin.template.a aVar2 = null;
                if (this.c.getMiniProgramInfo() != null && this.c.getTemplateType() >= 0 && !TextUtils.isEmpty(this.c.getMiniProgramInfo().imageUrl)) {
                    com.sankuai.android.share.util.c.a("微信分享小程序");
                    ShareBaseBean shareBaseBean2 = this.c;
                    Object[] objArr6 = {shareBaseBean2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "96147ce7896c31d9e672ec3793b02f05", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "96147ce7896c31d9e672ec3793b02f05");
                        return;
                    }
                    MiniProgramBaseBean miniProgramInfo = shareBaseBean2.getMiniProgramInfo();
                    if (this.f != null && this.f.get() != null) {
                        switch (shareBaseBean2.getTemplateType()) {
                            case 0:
                                aVar2 = new com.sankuai.android.share.keymodule.shareChannel.weixin.template.d(this.f.get());
                                break;
                            case 1:
                                aVar2 = new com.sankuai.android.share.keymodule.shareChannel.weixin.template.b(this.f.get());
                                break;
                            case 2:
                                aVar2 = new com.sankuai.android.share.keymodule.shareChannel.weixin.template.c(this.f.get());
                                break;
                        }
                    }
                    if (aVar2 != null) {
                        aVar2.a(miniProgramInfo, new a.b() { // from class: com.sankuai.android.share.keymodule.shareChannel.weixin.a.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a.b
                            public final void a(Bitmap bitmap) {
                                Object[] objArr7 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "495555c2659ee400eb928314c8d01dbf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "495555c2659ee400eb928314c8d01dbf");
                                } else if (bitmap != null) {
                                    a.this.a(bitmap);
                                }
                            }

                            @Override // com.sankuai.android.share.keymodule.shareChannel.weixin.template.a.b
                            public final void a() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "27ba2f9edf69811666694961dc9ca249", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "27ba2f9edf69811666694961dc9ca249");
                                } else {
                                    a.this.a((Bitmap) null);
                                }
                            }
                        });
                    }
                } else if (!TextUtils.isEmpty(this.c.getImgUrl()) && this.f != null && this.f.get() != null) {
                    com.sankuai.android.share.util.c.a("微信分享网络图片image：" + this.c.getImgUrl());
                    Picasso.g(this.f.get()).d(com.sankuai.android.share.common.util.b.a(this.c.getImgUrl())).a(this.i);
                } else {
                    a((Bitmap) null);
                }
            }
        } else {
            if (this.f != null && this.f.get() != null) {
                com.sankuai.android.share.a.a(this.f.get(), (int) R.string.share_no_weixin_client);
            }
            if (this.d != null) {
                this.d.a(this.b, c.a.FAILED);
            }
            com.sankuai.android.share.util.c.a("未安装微信，唤醒微信失败");
            LyingkitTraceBody lyingkitTraceBody3 = this.g;
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody3, "1", "微信分享唤起失败---title:" + this.c.getTitle() + "  content:" + this.c.getContent() + " URLString:" + this.c.getUrl() + " imageURLString:" + this.c.getImgUrl());
            d.a(this.f.get(), this.b, this.c, a.EnumC0540a.Uninstalled);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c01db35f8ca6eced7fde40fef249162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c01db35f8ca6eced7fde40fef249162");
        } else if (bitmap != null && !TextUtils.isEmpty(this.c.getImgUrl()) && this.c.isLocalImage() && Build.VERSION.SDK_INT > 28) {
            com.sankuai.android.share.util.c.a("微信shareImg isLocalImage==true");
            a(bitmap, this.d, true);
        } else if (bitmap != null && TextUtils.isEmpty(this.c.getTitle(this.b)) && TextUtils.isEmpty(this.c.getContent()) && TextUtils.isEmpty(this.c.getOriginUrl()) && !a()) {
            com.sankuai.android.share.util.c.a("微信shareImg [getTitle ,getContent, getContent] not null");
            a(bitmap, this.d, false);
        } else if (bitmap != null && this.c.isImageShare()) {
            com.sankuai.android.share.util.c.a("微信shareImg，isImageShare==true ");
            a(bitmap, this.d, false);
        } else {
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            if (TextUtils.isEmpty(this.c.getMmpshare())) {
                req.transaction = String.valueOf(System.currentTimeMillis());
            } else {
                req.transaction = "action_" + this.c.getMmpshare();
            }
            WXMediaMessage b = b(bitmap);
            if (b == null) {
                return;
            }
            req.message = b;
            if (b.a.WEIXIN_FRIEDN == this.b) {
                req.scene = 0;
            } else if (b.a.WEIXIN_CIRCLE == this.b) {
                req.scene = 1;
            }
            this.e.sendReq(req);
            d.a(this.f.get(), this.b, this.c);
        }
    }

    private WXMediaMessage b(Bitmap bitmap) {
        Bitmap a2;
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717a44a71e0b429eced43d0fb0ff463c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WXMediaMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717a44a71e0b429eced43d0fb0ff463c");
        }
        com.sankuai.android.share.util.c.a("微信buildWXMediaMessage ");
        WXMediaMessage wXMediaMessage = new WXMediaMessage();
        wXMediaMessage.title = this.c.getTitle(this.b);
        if (!TextUtils.isEmpty(wXMediaMessage.title) && wXMediaMessage.title.length() > 512) {
            wXMediaMessage.title = wXMediaMessage.title.substring(0, 512);
        }
        wXMediaMessage.description = this.c.getContent();
        if (!TextUtils.isEmpty(wXMediaMessage.description) && wXMediaMessage.description.length() > 1024) {
            wXMediaMessage.description = wXMediaMessage.description.substring(0, 1024);
        }
        if (a() && (bitmap != null || this.h != null)) {
            com.sankuai.android.share.util.c.a("微信分享到小程序，构建小程序信息 ");
            if (bitmap != null) {
                a(wXMediaMessage, bitmap);
            } else {
                a(wXMediaMessage, this.h);
            }
            return wXMediaMessage;
        }
        if (TextUtils.isEmpty(this.c.getOriginUrl())) {
            String content = this.c.getContent();
            if (TextUtils.isEmpty(content)) {
                b();
                if (this.d != null) {
                    this.d.a(this.b, c.a.FAILED);
                }
                d.a(this.f.get(), this.b, this.c, a.EnumC0540a.Data);
                return null;
            }
            wXMediaMessage.mediaObject = new WXTextObject(content);
        } else {
            if (bitmap != null) {
                com.sankuai.android.share.util.c.a("微信分享构建缩略图 ");
                wXMediaMessage.setThumbImage(c(bitmap));
            } else if (this.h != null) {
                wXMediaMessage.setThumbImage(c(this.h));
            } else if (this.f != null && this.f.get() != null && (a2 = com.sankuai.waimai.launcher.util.image.a.a(this.f.get().getResources(), (int) R.drawable.share_ic_meituan_logo)) != null) {
                wXMediaMessage.setThumbImage(c(a2));
            }
            wXMediaMessage.mediaObject = new WXWebpageObject(this.c.getUrl());
        }
        return wXMediaMessage;
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d3283dee8c566b4328e0bb8be20211", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d3283dee8c566b4328e0bb8be20211")).booleanValue();
        }
        return (this.b == b.a.WEIXIN_FRIEDN) && (!TextUtils.isEmpty(this.c.getMiniProgramPath()) && !TextUtils.isEmpty(this.c.getMiniProgramId()));
    }

    private boolean a(WXMediaMessage wXMediaMessage, Bitmap bitmap) {
        Object[] objArr = {wXMediaMessage, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9b6998a864c4643391556673800d1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9b6998a864c4643391556673800d1e")).booleanValue();
        }
        if (bitmap == null || TextUtils.isEmpty(this.c.getMiniProgramPath()) || TextUtils.isEmpty(this.c.getMiniProgramId()) || this.b != b.a.WEIXIN_FRIEDN) {
            return false;
        }
        WXMiniProgramObject wXMiniProgramObject = new WXMiniProgramObject();
        wXMiniProgramObject.path = this.c.getMiniProgramPath();
        wXMiniProgramObject.userName = !TextUtils.isEmpty(this.c.getMiniProgramId()) ? this.c.getMiniProgramId() : StringUtil.SPACE;
        wXMiniProgramObject.webpageUrl = !TextUtils.isEmpty(this.c.getOriginUrl()) ? this.c.getOriginUrl() : StringUtil.SPACE;
        wXMiniProgramObject.miniprogramType = this.c.getMiniProgramType();
        wXMiniProgramObject.withShareTicket = this.c.isWithShareTicket();
        wXMediaMessage.mediaObject = wXMiniProgramObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
            if (wXMediaMessage.thumbData.length > 131072) {
                int length = 13107200 / wXMediaMessage.thumbData.length;
                byteArrayOutputStream.reset();
                bitmap.compress(Bitmap.CompressFormat.JPEG, length, byteArrayOutputStream);
                wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            a(byteArrayOutputStream);
            throw th;
        }
        a(byteArrayOutputStream);
        return true;
    }

    private void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51c0bd83e636cfe0a71c0210af7ad60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51c0bd83e636cfe0a71c0210af7ad60");
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private Bitmap c(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0d684d660d9ba0d9eba03530d0e4695", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0d684d660d9ba0d9eba03530d0e4695");
        }
        float min = Math.min(150.0f / bitmap.getWidth(), 150.0f / bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (min * bitmap.getHeight()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab3e442e0c35252fe2d031fb5170bcbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab3e442e0c35252fe2d031fb5170bcbd");
            return;
        }
        try {
            if (this.f != null && this.f.get() != null && this.j != null) {
                this.f.get().unregisterReceiver(this.j);
            }
            com.sankuai.android.share.util.c.a("反注册微信回调广播 ");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.graphics.Bitmap r13, com.sankuai.android.share.interfaces.c r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.share.keymodule.shareChannel.weixin.a.a(android.graphics.Bitmap, com.sankuai.android.share.interfaces.c, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.share.keymodule.shareChannel.weixin.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0542a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private WeakReference<Context> c;

        public C0542a(Context context) {
            Object[] objArr = {a.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "937ec79dea632ca60d980a929afa5a01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "937ec79dea632ca60d980a929afa5a01");
            } else {
                this.c = new WeakReference<>(context);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac1d2ed454209d86246e59a2ccaa9123", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac1d2ed454209d86246e59a2ccaa9123");
                return;
            }
            a.this.b();
            if (intent.hasExtra("result")) {
                int a2 = f.a(intent, "result", -3);
                WeixinCallbackBean weixinCallbackBean = new WeixinCallbackBean();
                weixinCallbackBean.contextWeakReference = this.c;
                weixinCallbackBean.errCode = a2;
                com.sankuai.android.share.util.c.a("微信分享结果处理,errCode: " + a2);
                com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", a.this.g, "0"), LyingkitKernel_share.SHARE_WEIXINSERVICE_SHARECALLBACK, weixinCallbackBean);
            }
        }
    }

    @NomApiInterface(alias = "shareCallBack")
    private void shareCallBack(LyingkitTraceBody lyingkitTraceBody, WeixinCallbackBean weixinCallbackBean) {
        Object[] objArr = {lyingkitTraceBody, weixinCallbackBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbd76cb50df9158d61f5f04e1f39eda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbd76cb50df9158d61f5f04e1f39eda");
            return;
        }
        if (weixinCallbackBean.errCode == 0) {
            if (this.d != null) {
                this.d.a(this.b, c.a.COMPLETE);
                com.sankuai.android.share.util.c.a("微信分享complete ");
            }
            a("success", "-999", weixinCallbackBean.contextWeakReference);
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "微信分享成功");
        } else if (weixinCallbackBean.errCode == -2) {
            if (this.d != null) {
                this.d.a(this.b, c.a.CANCEL);
                com.sankuai.android.share.util.c.a("微信分享cancel ");
            }
            a("fail", "2", weixinCallbackBean.contextWeakReference);
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "微信分享取消");
        } else {
            if (this.d != null) {
                this.d.a(this.b, c.a.FAILED);
                com.sankuai.android.share.util.c.a("微信分享failed ");
            }
            a("fail", "-999", weixinCallbackBean.contextWeakReference);
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "微信分享失败---error：");
        }
        Context context = weixinCallbackBean.contextWeakReference.get();
        if (this.c != null && !TextUtils.isEmpty(this.c.getPassword())) {
            if (Statistics.isInitialized() && context != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("pwd", this.c.getPassword());
                i.a c = i.c("b_group_a7obhp25_mv", hashMap);
                Object[] objArr2 = {context, "c_sxr976a"};
                ChangeQuickRedirect changeQuickRedirect2 = i.a.a;
                if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "9553fb36f62a94e35ab2d9317f6558fe", RobustBitConfig.DEFAULT_VALUE)) {
                    c = (i.a) PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "9553fb36f62a94e35ab2d9317f6558fe");
                } else {
                    c.b = AppUtil.generatePageInfoKey(context);
                    c.val_cid = "c_sxr976a";
                }
                c.a();
            }
            if (weixinCallbackBean.errCode == 0 && !TextUtils.isEmpty(this.c.getToast()) && context != null) {
                if (context instanceof ShareActivity) {
                    com.sankuai.android.share.a.a(context, this.c.getToast());
                } else if (context instanceof Activity) {
                    new com.sankuai.meituan.android.ui.widget.a((Activity) context, this.c.getToast(), -1).a();
                }
            }
        }
        if (context != null && (context instanceof ShareActivity)) {
            ShareActivity shareActivity = (ShareActivity) context;
            if (!shareActivity.isFinishing()) {
                shareActivity.finish();
            }
        }
        this.d = null;
    }

    private void a(String str, String str2, WeakReference<Context> weakReference) {
        Object[] objArr = {str, str2, weakReference};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5364f15a8dba61ba7df7db88eee5722f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5364f15a8dba61ba7df7db88eee5722f");
        } else if (TextUtils.isEmpty(str) || !Statistics.isInitialized() || this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("title", a(this.b));
            hashMap.put("title_name", b(this.b));
            hashMap.put("result", str);
            hashMap.put("bg_name", TextUtils.isEmpty(this.c.getBg()) ? "" : this.c.getBg());
            hashMap.put("bu_name", TextUtils.isEmpty(this.c.getBu()) ? "" : this.c.getBu());
            hashMap.put("type", c());
            if (TextUtils.equals(c(), "小程序")) {
                hashMap.put("wxapp", this.c.getMiniProgramId());
            } else {
                hashMap.put("wxapp", "");
            }
            hashMap.put("cid", this.c.getCid());
            hashMap.put("pagenm", com.meituan.android.base.share.b.a());
            hashMap.put("sort", str2);
            hashMap.put("appshare", this.c.getAppshare());
            if (TextUtils.equals(c(), "小程序")) {
                hashMap.put("main_title", "-999");
                hashMap.put("sub_title", "-999");
                if (this.c.getMiniProgramInfo() != null) {
                    hashMap.put("image_url", this.c.getMiniProgramInfo().imageUrl != null ? this.c.getMiniProgramInfo().imageUrl : "-999");
                } else {
                    hashMap.put("image_url", "");
                }
                hashMap.put("template_type", Integer.valueOf(this.c.getTemplateType()));
            } else {
                hashMap.put("main_title", this.c.getTitle());
                hashMap.put("sub_title", this.c.getContent());
                hashMap.put("image_url", this.c.getImgUrl());
            }
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            d.a(weakReference.get(), "b_e7rrs", "c_sxr976a", hashMap);
        }
    }

    private String a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907b7ab906f944ca96599e4af717fdf5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907b7ab906f944ca96599e4af717fdf5") : b.a.WEIXIN_CIRCLE == aVar ? "pyq" : b.a.WEIXIN_FRIEDN == aVar ? MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX : "";
    }

    private String b(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ee0531fc783d16f9b473d78d8d5cb1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ee0531fc783d16f9b473d78d8d5cb1") : b.a.WEIXIN_CIRCLE == aVar ? "朋友圈" : b.a.WEIXIN_FRIEDN == aVar ? "微信好友" : "";
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25cbe9079ed145e624405413b793865", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25cbe9079ed145e624405413b793865") : !TextUtils.isEmpty(this.c.getPassword()) ? "分享口令" : a() ? "小程序" : (!TextUtils.isEmpty(this.c.getUrl()) || this.c.hasShortUrl()) ? DiagnoseLog.H5 : !TextUtils.isEmpty(this.c.getImgUrl()) ? "图片" : "";
    }
}
