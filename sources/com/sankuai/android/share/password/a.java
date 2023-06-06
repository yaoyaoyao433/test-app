package com.sankuai.android.share.password;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.android.nom.lyingkit.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareExtraInfo;
import com.sankuai.android.share.common.util.d;
import com.sankuai.android.share.keymodule.shareChannel.password.bean.IndexCarpetData;
import com.sankuai.android.share.keymodule.shareChannel.password.request.PasswordRetrofitService;
import com.sankuai.android.share.util.c;
import com.sankuai.android.share.util.e;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.PicassoGifDrawable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements DialogInterface.OnShowListener, View.OnClickListener {
    public static ChangeQuickRedirect a;
    public IndexCarpetData.Data b;
    public Dialog c;
    public View d;
    public TextView e;
    public String f;
    public Bitmap g;
    public String h;
    public Drawable i;
    public Drawable j;
    public String k;
    public String l;
    public Drawable m;
    public String n;
    public PicassoDrawable o;
    private final WeakReference<Activity> p;
    private CountDownTimer q;
    private String r;
    private String s;
    private InterfaceC0544a t;
    private final Object u;
    private Random v;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.share.password.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0544a {
        void a();
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "fbe92477c33dcecf6f154a0ac77a682c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "fbe92477c33dcecf6f154a0ac77a682c");
            return;
        }
        c.a("开始获取口令");
        d.a(context, "pt-90802aef6feca32e", new d.a() { // from class: com.sankuai.android.share.password.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.android.share.common.util.d.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea065d327b702b26b1d50d326c3db6aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea065d327b702b26b1d50d326c3db6aa");
                } else {
                    a.this.r = str;
                }
            }

            @Override // com.sankuai.android.share.common.util.d.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3da1e1c6c187cabb879bada46b49c1c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3da1e1c6c187cabb879bada46b49c1c");
                } else {
                    a.this.s = str;
                }
            }

            @Override // com.sankuai.android.share.common.util.d.a
            public final void a(int i, Exception exc) {
                Object[] objArr2 = {Integer.valueOf(i), exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7453d9e26054995876b91dd60cbeea53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7453d9e26054995876b91dd60cbeea53");
                    return;
                }
                int i2 = -999;
                switch (i) {
                    case 1:
                        i2 = RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT;
                        break;
                    case 2:
                        i2 = RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
                        break;
                    case 4:
                        i2 = 10006;
                        break;
                    case 5:
                        i2 = 10001;
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", Integer.valueOf(i2));
                Statistics.getChannel().writeModelView(a.this.h, "b_group_tnkfml7y_mv", hashMap, "c_sxr976a");
                if (a.this.b()) {
                    a.this.a("clipboard-fail");
                }
            }

            @Override // com.sankuai.android.share.common.util.d.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0fda32b5c48a3a2b3d63c1ccc0066ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0fda32b5c48a3a2b3d63c1ccc0066ba");
                } else if (a.this.b()) {
                    a.this.a("clipboard-success");
                }
            }

            @Override // com.sankuai.android.share.common.util.d.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55415c95b8f1c3a31fa7fcd92a033095", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55415c95b8f1c3a31fa7fcd92a033095");
                    return;
                }
                a.c(a.this);
                c.a("unlockWindow");
            }
        });
    }

    public static /* synthetic */ void c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "14938e346653bdcb40e787bd397a6b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "14938e346653bdcb40e787bd397a6b5d");
            return;
        }
        synchronized (aVar.u) {
            aVar.u.notifyAll();
        }
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6707d81de261b86e83cf129df23f6645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6707d81de261b86e83cf129df23f6645");
            return;
        }
        this.u = new Object();
        this.v = new Random();
        this.p = new WeakReference<>(activity);
    }

    public final void a(InterfaceC0544a interfaceC0544a) {
        this.t = interfaceC0544a;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9b89cabbdbba2816e7bbf1fc19c5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9b89cabbdbba2816e7bbf1fc19c5c3")).booleanValue();
        }
        if (b()) {
            a("shouldShowPasswordDialog");
        }
        Activity e = e();
        if (e != null) {
            b.a(e);
        }
        Statistics.getChannel().writeModelView(AppUtil.generatePageInfoKey(e), "b_group_s6aeg9an_mv", (Map<String, Object>) null, "c_sxr976a");
        LyingkitZone lyingkitZone = new LyingkitZone("share", "5.23.49", null, "1");
        lyingkitZone.a(new ShareExtraInfo("share", "share"));
        Object a2 = b.a(lyingkitZone, LyingkitKernel_share.SHARE_PASSWORDSERVICE_GETALERTINFO, this);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }

    public final boolean a(LyingkitTraceBody lyingkitTraceBody) {
        String str;
        final Activity e;
        String group;
        Object[] objArr = {lyingkitTraceBody};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9496ed59883b4cd205a3122b6758e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9496ed59883b4cd205a3122b6758e3")).booleanValue();
        }
        if (b()) {
            a("isShowPasswordDialog");
        }
        final Activity e2 = e();
        if (e2 == null || Looper.myLooper() == Looper.getMainLooper()) {
            a(lyingkitTraceBody, "1", "获取口令弹窗内容失败---error: context=null");
            return false;
        } else if (e2.isFinishing() || e2.isDestroyed()) {
            return false;
        } else {
            this.h = AppUtil.generatePageInfoKey(e2);
            c.a("开始分系统处理口令解析" + Build.VERSION.SDK_INT);
            if (Build.VERSION.SDK_INT >= 24) {
                c.a("Android N 以上系统，开始走异步");
                e2.getWindow().getDecorView().post(new Runnable() { // from class: com.sankuai.android.share.password.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba822583e86ca797389b62e039ecce18", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba822583e86ca797389b62e039ecce18");
                        } else {
                            a.a(a.this, e2);
                        }
                    }
                });
            } else {
                c.a("Android M 以下系统，开始走异步");
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.android.share.password.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fc8722ae7da9a54a51238d3c73a4a04", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fc8722ae7da9a54a51238d3c73a4a04");
                        } else {
                            a.a(a.this, e2);
                        }
                    }
                });
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9a87598e52f829fd307e5ff0660da2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9a87598e52f829fd307e5ff0660da2c");
            } else {
                synchronized (this.u) {
                    try {
                        this.u.wait();
                    } catch (Exception unused) {
                    }
                }
            }
            this.b = null;
            this.q = null;
            if (!TextUtils.isEmpty(this.r)) {
                String str2 = this.r;
                Object[] objArr3 = {str2, "💰(.*?)💰"};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fd87609b38788d4584a0342aefdc95d", RobustBitConfig.DEFAULT_VALUE)) {
                    group = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fd87609b38788d4584a0342aefdc95d");
                } else {
                    Matcher matcher = Pattern.compile("💰(.*?)💰").matcher(str2);
                    group = matcher.find() ? matcher.group(1) : "";
                }
                this.f = group;
                if (TextUtils.isEmpty(this.f)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", Integer.valueOf((int) RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_EVENT));
                    Statistics.getChannel().writeModelView(this.h, "b_group_tnkfml7y_mv", hashMap, "c_sxr976a");
                }
            }
            if (!TextUtils.isEmpty(this.f) && !TextUtils.equals(this.s, "com.meituan.share.channel.password")) {
                a("password-success");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("pwd", this.f);
                if (Statistics.isInitialized()) {
                    Statistics.getChannel("group").writeModelView(this.h, "b_group_nhahffst_mv", hashMap2, "c_group_9tox18yt");
                }
                Object[] objArr4 = {e2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "80c1776e86fc6c24065ec47309335ebb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "80c1776e86fc6c24065ec47309335ebb");
                } else {
                    d.a(e2, "pt-90802aef6feca32e");
                }
                if (com.sankuai.android.share.constant.a.a() == 2) {
                    c.a("口令解析请求test环境");
                    str = "http://mf.travel.test.meituan.com/platform/c2/" + this.f;
                } else {
                    str = "https://i.meituan.com/platform/c2/" + this.f;
                }
                try {
                    com.sankuai.android.share.keymodule.shareChannel.password.request.a a2 = com.sankuai.android.share.keymodule.shareChannel.password.request.a.a(e2);
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.android.share.keymodule.shareChannel.password.request.a.a;
                    Response<IndexCarpetData> a3 = (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "2eb8caf141e9248af9c7e387ca8d2fff", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "2eb8caf141e9248af9c7e387ca8d2fff") : ((PasswordRetrofitService) a2.b.a(PasswordRetrofitService.class)).getIndexCarpetData(str)).a();
                    if (a3 != null && a3.f() && a3.e != null) {
                        c.a("responseed true");
                        if (a3.e.code == 0 && a3.e.data != null) {
                            IndexCarpetData.Data data = a3.e.data;
                            if (data != null) {
                                this.b = data;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8c9cdca8faead64c461ddbd3cda22979", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8c9cdca8faead64c461ddbd3cda22979");
                                } else if (this.b != null && (e = e()) != null) {
                                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                                    try {
                                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.android.share.password.a.3
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr7 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0435545f77fe606b25b348342ff143d0", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0435545f77fe606b25b348342ff143d0");
                                                } else {
                                                    Picasso.g(e).d(a.this.b.image).a(new e(e, com.sankuai.android.share.common.util.b.a(e, 10.0f), 0, e.a.TOP)).a(new PicassoDrawableTarget() { // from class: com.sankuai.android.share.password.a.3.1
                                                        public static ChangeQuickRedirect a;

                                                        @Override // com.squareup.picasso.PicassoDrawableTarget
                                                        public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                                                            Object[] objArr8 = {picassoDrawable, loadedFrom};
                                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "10973a37128c05a6ff9d512f4b7935a3", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "10973a37128c05a6ff9d512f4b7935a3");
                                                                return;
                                                            }
                                                            super.onResourceReady(picassoDrawable, loadedFrom);
                                                            if (picassoDrawable instanceof PicassoBitmapDrawable) {
                                                                a.this.g = ((PicassoBitmapDrawable) picassoDrawable).b();
                                                            } else if (picassoDrawable instanceof PicassoGifDrawable) {
                                                                a.this.o = picassoDrawable;
                                                            }
                                                            countDownLatch.countDown();
                                                        }

                                                        @Override // com.squareup.picasso.PicassoDrawableTarget
                                                        public final void onLoadFailed(Exception exc, Drawable drawable) {
                                                            Object[] objArr8 = {exc, drawable};
                                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "00c301afa842625cde254c75aa921c85", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "00c301afa842625cde254c75aa921c85");
                                                                return;
                                                            }
                                                            super.onLoadFailed(exc, drawable);
                                                            a.this.g = null;
                                                            a.this.o = null;
                                                            countDownLatch.countDown();
                                                        }
                                                    });
                                                }
                                            }
                                        });
                                        countDownLatch.await(PayTask.j, TimeUnit.MILLISECONDS);
                                    } catch (Exception unused2) {
                                        this.g = null;
                                        this.o = null;
                                    }
                                }
                                c.a("获取口令弹窗内容成功---title ：" + data.title + " ---nickName ：" + data.nickName + "--- headerImage ：" + data.userAvatar);
                                a(lyingkitTraceBody, "0", "获取口令弹窗内容成功---title ：" + data.title + " ---nickName ：" + data.nickName + "--- headerImage ：" + data.userAvatar);
                                return true;
                            }
                        } else if (a3.e.code == 6000) {
                            new com.sankuai.meituan.android.ui.widget.a(e2, e2.getString(R.string.share_password_overtime), -1).a(true).a();
                            a(lyingkitTraceBody, "1", "口令已过期");
                        }
                    }
                } catch (Exception e3) {
                    a(lyingkitTraceBody, "1", "获取口令弹窗内容失败---error: context=null");
                    c.a("获取口令弹窗内容失败" + e3.toString());
                }
            } else {
                if (b()) {
                    a("password-fail");
                }
                a(lyingkitTraceBody, "0", "口令为空---");
                c.a("口令为空---");
            }
            return false;
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358431aad42f40a4be2f29a9a4997209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358431aad42f40a4be2f29a9a4997209");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("PasswordDialogMgr", str);
        Babel.log(new Log.Builder("").tag("share-babel-tag").generalChannelStatus(true).optional(hashMap).build());
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f850bd2cc00a6d7ab20e02eb3591c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f850bd2cc00a6d7ab20e02eb3591c1")).booleanValue() : this.v.nextInt(10000) < 10;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7c71e4608d812e133947c4d001d230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7c71e4608d812e133947c4d001d230");
        } else {
            b.a(new LyingkitZone("share", "5.23.49", null, "1"), LyingkitKernel_share.SHARE_PASSWORDSERVICE_SHOW, this);
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [com.sankuai.android.share.password.a$5] */
    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48c98f760d963df39347f0f6bb5fec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48c98f760d963df39347f0f6bb5fec7");
            return;
        }
        if (this.c != null) {
            this.c.setCancelable(false);
        }
        Activity e = e();
        if (e == null) {
            return;
        }
        this.q = new CountDownTimer(3999L, 1000L, e) { // from class: com.sankuai.android.share.password.a.5
            public static ChangeQuickRedirect a;
            public final /* synthetic */ Activity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3999L, 1000L);
                this.b = e;
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76589ef7de86897aedb8c6971457aaff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76589ef7de86897aedb8c6971457aaff");
                } else if (j >= 0) {
                    if (a.this.e != null) {
                        a.this.e.setText(this.b.getResources().getString(R.string.share_password_time, Integer.valueOf((int) (j / 1000))));
                    }
                } else {
                    a.this.d();
                }
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc666160ae32696f6218ef7c144808f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc666160ae32696f6218ef7c144808f0");
                } else if (a.this.b != null) {
                    a.this.a(a.this.b.url, false);
                }
            }
        }.start();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8036725c2d37ed2c0e03a4c1ff51d234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8036725c2d37ed2c0e03a4c1ff51d234");
            return;
        }
        Activity e = e();
        if (e != null && !e.isDestroyed() && this.c != null && this.c.isShowing()) {
            this.c.dismiss();
        }
        if (this.q != null) {
            this.q.cancel();
            this.q = null;
        }
        if (this.t != null) {
            this.t.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (r2.equals("https") == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.share.password.a.a(java.lang.String, boolean):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e162b122d2e8a07680a405212e686ce", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e162b122d2e8a07680a405212e686ce");
        } else if (view == null) {
        } else {
            if (view.getId() == R.id.cancel) {
                if (Statistics.isInitialized()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pwd", this.f);
                    hashMap.put("button_name", "关闭");
                    a(hashMap);
                    Statistics.getChannel("group").writeModelClick(this.h, "b_group_n3zqg267_mc", hashMap, "c_sxr976a");
                }
                d();
            } else if (view.getId() != R.id.btn || this.b == null) {
            } else {
                a(this.b.url, true);
            }
        }
    }

    public Activity e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e39dfe40140d799ea9d0804c624869a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e39dfe40140d799ea9d0804c624869a");
        }
        if (this.p == null) {
            return null;
        }
        return this.p.get();
    }

    public void a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f74f1fbb2e7f8ef32a5a3bfd6b4c7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f74f1fbb2e7f8ef32a5a3bfd6b4c7c");
            return;
        }
        String a2 = com.meituan.android.base.share.c.a(com.meituan.android.base.share.c.a(Uri.parse(this.b.url).buildUpon().build()));
        map.put("share_id", a2);
        map.put("channel", com.sankuai.android.share.util.d.c(com.meituan.android.base.share.c.b(a2)));
        map.put("title", this.b.title);
    }

    public void a(LyingkitTraceBody lyingkitTraceBody, String str, String str2) {
        Object[] objArr = {lyingkitTraceBody, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd30dfbf3f748800b909ce7a584249c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd30dfbf3f748800b909ce7a584249c");
        } else if (lyingkitTraceBody != null) {
            lyingkitTraceBody.g = str;
            lyingkitTraceBody.h = str2;
        }
    }
}
