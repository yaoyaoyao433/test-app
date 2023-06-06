package com.sankuai.android.share.keymodule.shareChannel.qq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.bean.QQCallbackBean;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.util.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.mapsdk.internal.y;
import com.tencent.tauth.Tencent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "qqShareService")
/* loaded from: classes3.dex */
public class b extends com.sankuai.android.share.keymodule.b {
    public static ChangeQuickRedirect a;
    protected Tencent b;
    private Context c;
    private LyingkitTraceBody d;

    @NomApiInterface(alias = "qq")
    public void share(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, final ShareBaseBean shareBaseBean, final c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618ac4bb4f826484315fdff6a3e4ff22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618ac4bb4f826484315fdff6a3e4ff22");
            return;
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "QQ 调用 QQ 分享 Service 接口成功");
        if (context == null) {
            return;
        }
        this.c = context;
        if (Build.VERSION.SDK_INT < 30) {
            this.b = Tencent.createInstance(com.sankuai.android.share.common.util.c.b(context.getApplicationContext()), context.getApplicationContext());
        } else {
            String b = com.sankuai.android.share.common.util.c.b(context.getApplicationContext());
            Context applicationContext = context.getApplicationContext();
            this.b = Tencent.createInstance(b, applicationContext, context.getPackageName() + ".ShareFileProvider");
        }
        this.d = lyingkitTraceBody;
        if (aVar == b.a.QQ) {
            a(lyingkitTraceBody, shareBaseBean, cVar);
            return;
        }
        Object[] objArr2 = {lyingkitTraceBody, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2de9972461faa05b497aba70bd119c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2de9972461faa05b497aba70bd119c1d");
        } else if (shareBaseBean == null || this.c == null || !(this.c instanceof Activity)) {
            if (cVar != null) {
                cVar.a(b.a.QZONE, c.a.FAILED);
            }
            d.a(this.c, b.a.QZONE, shareBaseBean, a.EnumC0540a.Data);
        } else {
            final Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(shareBaseBean.getImgUrl()) && shareBaseBean.isLocalImage()) {
                bundle.putInt("req_type", 3);
                a(shareBaseBean, cVar, bundle, shareBaseBean.getImgUrl());
            } else if (!TextUtils.isEmpty(shareBaseBean.getImgUrl()) && shareBaseBean.isImageShare()) {
                Picasso.g(this.c).d(shareBaseBean.getImgUrl()).a(100, 100).a(new Target() { // from class: com.sankuai.android.share.keymodule.shareChannel.qq.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr3 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2d3add920ffc67ac3b270fb95b80f48", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2d3add920ffc67ac3b270fb95b80f48");
                            return;
                        }
                        String a2 = com.sankuai.android.share.common.util.b.a(b.this.c, bitmap);
                        bundle.putInt("req_type", 3);
                        b.this.a(shareBaseBean, cVar, bundle, a2);
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                        Object[] objArr3 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33d571afb11fc9eddfd9adb1702837e8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33d571afb11fc9eddfd9adb1702837e8");
                            return;
                        }
                        String a2 = com.sankuai.android.share.common.util.b.a(b.this.c, com.sankuai.waimai.launcher.util.image.a.a(b.this.c.getResources(), (int) R.drawable.share_default_image));
                        bundle.putInt("req_type", 3);
                        b.this.a(shareBaseBean, cVar, bundle, a2);
                    }
                });
            } else {
                bundle.putInt("req_type", 1);
                if (!TextUtils.isEmpty(shareBaseBean.getTitle(b.a.QZONE)) && shareBaseBean.getTitle().length() > 200) {
                    bundle.putString("title", shareBaseBean.getTitle(b.a.QZONE).substring(0, 200));
                } else {
                    bundle.putString("title", shareBaseBean.getTitle(b.a.QZONE));
                }
                if (!TextUtils.isEmpty(shareBaseBean.getContent()) && shareBaseBean.getContent().length() > 600) {
                    bundle.putString("summary", shareBaseBean.getContent().substring(0, 600));
                } else {
                    bundle.putString("summary", shareBaseBean.getContent());
                }
                bundle.putString("targetUrl", shareBaseBean.getUrl());
                a(shareBaseBean, cVar, bundle, shareBaseBean.getImgUrl());
            }
        }
    }

    private void a(LyingkitTraceBody lyingkitTraceBody, final ShareBaseBean shareBaseBean, final c cVar) {
        Object[] objArr = {lyingkitTraceBody, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de794a6bffa0faf3ef1a4ab38c11da38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de794a6bffa0faf3ef1a4ab38c11da38");
        } else if (shareBaseBean == null || this.c == null) {
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "QQ 分享传入数据类型异常-null");
            if (cVar != null) {
                cVar.a(b.a.QQ, c.a.FAILED);
            }
            d.a(this.c, b.a.QQ, shareBaseBean, a.EnumC0540a.Uninstalled);
        } else if (!TextUtils.isEmpty(shareBaseBean.getImgUrl()) && shareBaseBean.isLocalImage()) {
            a(shareBaseBean.getImgUrl(), cVar, shareBaseBean);
        } else if (!TextUtils.isEmpty(shareBaseBean.getUrl()) && !shareBaseBean.isImageShare()) {
            if (this.c instanceof Activity) {
                if (TextUtils.isEmpty(shareBaseBean.getImgUrl())) {
                    a(shareBaseBean, "", cVar);
                } else {
                    Picasso.g(this.c).d(shareBaseBean.getImgUrl()).a(100, 100).a(new Target() { // from class: com.sankuai.android.share.keymodule.shareChannel.qq.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.squareup.picasso.Target
                        public final void onPrepareLoad(Drawable drawable) {
                        }

                        @Override // com.squareup.picasso.Target
                        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                            Object[] objArr2 = {bitmap, loadedFrom};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a99a886150a2471aa2496fcfe9940cc5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a99a886150a2471aa2496fcfe9940cc5");
                            } else {
                                b.this.a(shareBaseBean, com.sankuai.android.share.common.util.b.a(b.this.c, bitmap), cVar);
                            }
                        }

                        @Override // com.squareup.picasso.Target
                        public final void onBitmapFailed(Drawable drawable) {
                            Object[] objArr2 = {drawable};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ff8b861f5c2fd8b2e44e690f71696ac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ff8b861f5c2fd8b2e44e690f71696ac");
                            } else {
                                b.this.a(shareBaseBean, com.sankuai.android.share.common.util.b.a(b.this.c, com.sankuai.waimai.launcher.util.image.a.a(b.this.c.getResources(), (int) R.drawable.share_default_image)), cVar);
                            }
                        }
                    });
                }
            }
        } else if (!TextUtils.isEmpty(shareBaseBean.getImgUrl())) {
            Picasso.g(this.c).d(shareBaseBean.getImgUrl()).a(100, 100).a(new Target() { // from class: com.sankuai.android.share.keymodule.shareChannel.qq.b.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ce2ec11131c41d09e48c5349eac2c78", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ce2ec11131c41d09e48c5349eac2c78");
                    } else {
                        b.this.a(com.sankuai.android.share.common.util.b.a(b.this.c, bitmap), cVar, shareBaseBean);
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcacec4cd47aa22fcbbbd2d4d39e54b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcacec4cd47aa22fcbbbd2d4d39e54b0");
                    } else {
                        b.this.a(com.sankuai.android.share.common.util.b.a(b.this.c, com.sankuai.waimai.launcher.util.image.a.a(b.this.c.getResources(), (int) R.drawable.share_default_image)), cVar, shareBaseBean);
                    }
                }
            });
        } else {
            String str = "";
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            Iterator<ResolveInfo> it = this.c.getPackageManager().queryIntentActivities(intent, 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (TextUtils.equals("com.tencent.mobileqq", next.activityInfo.packageName)) {
                    str = next.activityInfo.name;
                    break;
                }
            }
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.SUBJECT", shareBaseBean.getTitle(b.a.QQ));
            intent2.setClassName("com.tencent.mobileqq", str);
            intent2.setFlags(y.a);
            intent2.putExtra("android.intent.extra.TEXT", shareBaseBean.getContent());
            if (a(this.c, intent2)) {
                if (cVar != null) {
                    cVar.a(b.a.QQ, c.a.COMPLETE);
                }
                a(shareBaseBean, b.a.QQ, "success", "-999");
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "QQ 分享成功");
                d.a(this.c, b.a.QQ, shareBaseBean);
                return;
            }
            if (cVar != null) {
                cVar.a(b.a.QQ, c.a.FAILED);
            }
            a(shareBaseBean, b.a.QQ, "fail", "-999");
            com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "QQ分享唤起失败-title:" + shareBaseBean.getTitle() + "  content:" + shareBaseBean.getContent() + " URLString:" + shareBaseBean.getUrl() + " imageURLString:" + shareBaseBean.getImgUrl());
            d.a(this.c, b.a.QQ, shareBaseBean, a.EnumC0540a.Unknown);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ShareBaseBean shareBaseBean, c cVar, Bundle bundle, String str) {
        Object[] objArr = {shareBaseBean, cVar, bundle, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e900e95d7c2626be9c3261c1f8523d5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e900e95d7c2626be9c3261c1f8523d5d");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(shareBaseBean.getImgUrl())) {
            arrayList.add("http://p1.meituan.net/mmc/__32063339__5800600.png");
        } else {
            arrayList.add(str);
        }
        bundle.putStringArrayList("imageUrl", arrayList);
        if (!TextUtils.isEmpty(shareBaseBean.getImgUrl()) && (shareBaseBean.isLocalImage() || shareBaseBean.isImageShare())) {
            a aVar = new a(this.d, cVar, this.c, b.a.QZONE, shareBaseBean);
            UIListenerManager.getInstance().setListnerWithAction("shareToQzone", aVar);
            this.b.publishToQzone((Activity) this.c, bundle, aVar);
        } else {
            this.b.shareToQzone((Activity) this.c, bundle, new a(this.d, cVar, this.c, b.a.QZONE, shareBaseBean));
        }
        d.a(this.c, b.a.QZONE, shareBaseBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ShareBaseBean shareBaseBean, String str, c cVar) {
        Object[] objArr = {shareBaseBean, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a7ad9c521cb22c4f1dd881cadf5fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a7ad9c521cb22c4f1dd881cadf5fd5");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("req_type", 1);
        if (!TextUtils.isEmpty(shareBaseBean.getTitle(b.a.QQ)) && shareBaseBean.getTitle().length() > 128) {
            bundle.putString("title", shareBaseBean.getTitle(b.a.QQ).substring(0, 128));
        } else {
            bundle.putString("title", shareBaseBean.getTitle(b.a.QQ));
        }
        if (!TextUtils.isEmpty(shareBaseBean.getContent()) && shareBaseBean.getContent().length() > 512) {
            bundle.putString("summary", shareBaseBean.getContent().substring(0, 512));
        } else {
            bundle.putString("summary", shareBaseBean.getContent());
        }
        bundle.putString("targetUrl", shareBaseBean.getUrl());
        bundle.putString("imageUrl", str);
        this.b.shareToQQ((Activity) this.c, bundle, new a(this.d, cVar, this.c, b.a.QQ, shareBaseBean));
        d.a(this.c, b.a.QQ, shareBaseBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, c cVar, ShareBaseBean shareBaseBean) {
        Object[] objArr = {str, cVar, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a91565ba5d1aaee29a5bcc3d83aed3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a91565ba5d1aaee29a5bcc3d83aed3d");
        } else if (TextUtils.isEmpty(str) || shareBaseBean == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("req_type", 5);
            bundle.putString("imageLocalUrl", str);
            this.b.shareToQQ((Activity) this.c, bundle, new a(this.d, cVar, this.c, b.a.QQ, shareBaseBean));
            d.a(this.c, b.a.QQ, shareBaseBean);
        }
    }

    private boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e00fc723d9a1d16854a02dfa00a9c09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e00fc723d9a1d16854a02dfa00a9c09")).booleanValue();
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
        return true;
    }

    private String a(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad18b39dca687f2d1f0ee0a606d1fb8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad18b39dca687f2d1f0ee0a606d1fb8") : (!TextUtils.isEmpty(shareBaseBean.getUrl()) || shareBaseBean.hasShortUrl()) ? DiagnoseLog.H5 : !TextUtils.isEmpty(shareBaseBean.getImgUrl()) ? "图片" : "";
    }

    @NomApiInterface(alias = "shareCallBack")
    private void shareCallBack(LyingkitTraceBody lyingkitTraceBody, QQCallbackBean qQCallbackBean) {
        Object[] objArr = {lyingkitTraceBody, qQCallbackBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d97f71627b968105940fde236773415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d97f71627b968105940fde236773415");
        } else if (qQCallbackBean == null) {
        } else {
            if (qQCallbackBean.shareStatus == c.a.COMPLETE) {
                if (this.c != null) {
                    com.sankuai.android.share.a.a(this.c, (int) R.string.share_success);
                }
                if (qQCallbackBean.shareListener != null) {
                    qQCallbackBean.shareListener.a(qQCallbackBean.type, c.a.COMPLETE);
                }
                a(qQCallbackBean.data, qQCallbackBean.type, "success", "-999");
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "QQ 分享成功");
            } else if (qQCallbackBean.shareStatus == c.a.FAILED) {
                if (qQCallbackBean.uiError != null && this.c != null) {
                    com.sankuai.android.share.a.a(this.c, qQCallbackBean.uiError.errorMessage);
                }
                if (qQCallbackBean.shareListener != null) {
                    qQCallbackBean.shareListener.a(qQCallbackBean.type, c.a.FAILED);
                }
                a(qQCallbackBean.data, qQCallbackBean.type, "fail", "-999");
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "QQ 分享失败---errorCode：" + qQCallbackBean.uiError.errorCode + "error:" + qQCallbackBean.uiError.errorMessage);
            } else if (qQCallbackBean.shareStatus == c.a.CANCEL) {
                if (qQCallbackBean.shareListener != null) {
                    qQCallbackBean.shareListener.a(qQCallbackBean.type, c.a.CANCEL);
                }
                a(qQCallbackBean.data, qQCallbackBean.type, "fail", "2");
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "QQ 分享取消");
            }
        }
    }

    private void a(ShareBaseBean shareBaseBean, b.a aVar, String str, String str2) {
        Object[] objArr = {shareBaseBean, aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2433eb9d78986c8853f9335e5626a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2433eb9d78986c8853f9335e5626a6");
        } else if (TextUtils.isEmpty(str) || !Statistics.isInitialized()) {
        } else {
            HashMap hashMap = new HashMap();
            if (aVar == b.a.QQ) {
                hashMap.put("title", "qq");
                hashMap.put("title_name", "QQ好友");
            } else if (aVar == b.a.QZONE) {
                hashMap.put("title", "qqzone");
                hashMap.put("title_name", "QQ空间");
            } else {
                hashMap.put("title", "");
                hashMap.put("title_name", "");
            }
            hashMap.put("result", str);
            if (shareBaseBean != null) {
                hashMap.put("bg_name", TextUtils.isEmpty(shareBaseBean.getBg()) ? "" : shareBaseBean.getBg());
                hashMap.put("bu_name", TextUtils.isEmpty(shareBaseBean.getBu()) ? "" : shareBaseBean.getBu());
                hashMap.put("cid", shareBaseBean.getCid());
                hashMap.put("type", a(shareBaseBean));
            } else {
                hashMap.put("bg_name", "");
                hashMap.put("bu_name", "");
                hashMap.put("cid", "");
                hashMap.put("type", "");
            }
            hashMap.put("main_title", shareBaseBean != null ? shareBaseBean.getTitle() : "");
            hashMap.put("sub_title", shareBaseBean != null ? shareBaseBean.getContent() : "");
            hashMap.put("image_url", shareBaseBean != null ? shareBaseBean.getImgUrl() : "");
            hashMap.put("wxapp", "");
            hashMap.put("pagenm", com.meituan.android.base.share.b.a());
            hashMap.put("sort", str2);
            hashMap.put("appshare", shareBaseBean != null ? shareBaseBean.getAppshare() : "");
            d.a(this.c, "b_e7rrs", "c_sxr976a", hashMap);
        }
    }
}
