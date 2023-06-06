package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.dianping.shield.AgentConfigParser;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.meituan.android.httpdns.business.DefaultDnsListener;
import com.meituan.android.httpdns.j;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.launcher.config.WaimaiLauncherSP;
import com.sankuai.waimai.launcher.model.AppInfo;
import com.sankuai.waimai.launcher.util.constants.a;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.squareup.picasso.MtPicassoRequestListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends AbsInit implements com.sankuai.waimai.foundation.location.v2.listener.c {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private Application c;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "ImageLoaderInit";
    }

    public static /* synthetic */ void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7b977ff3b0fd977eed0b70006c9465a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7b977ff3b0fd977eed0b70006c9465a");
        } else if (com.sankuai.meituan.takeoutnew.a.f) {
            PrintStream printStream = System.out;
            printStream.println("ImageLoaderInit: " + str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494720cd38b10c14293ac8cb26353629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494720cd38b10c14293ac8cb26353629");
            return;
        }
        this.c = application;
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25185dfb2d94a871eefc7e5b3d6b923f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25185dfb2d94a871eefc7e5b3d6b923f");
        } else {
            com.meituan.android.httpdns.i.a(11);
            com.meituan.android.httpdns.i.a(application, String.valueOf(AppInfo.getCityID()));
            com.sankuai.waimai.foundation.location.v2.g.a().a(this, tag());
        }
        Object[] objArr3 = {application};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "92e058076f82d9185e98c8b7d82905ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "92e058076f82d9185e98c8b7d82905ce");
        } else {
            Object[] objArr4 = {application};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.mtimageloader.loader.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "05ede58ffb65f4d5c796d07f2abed922", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "05ede58ffb65f4d5c796d07f2abed922");
            } else {
                com.sankuai.meituan.mtimageloader.config.a.a(application);
            }
            com.sankuai.meituan.mtimageloader.config.a.b((int) R.id.glide_tag_key);
            com.sankuai.meituan.mtimageloader.config.a.c(720);
            com.sankuai.meituan.mtimageloader.config.a.a(5);
            com.sankuai.meituan.mtimageloader.config.a.a(com.sankuai.waimai.launcher.util.image.c.b);
            com.sankuai.meituan.mtimageloader.config.a.a(new com.sankuai.waimai.picasso_loader.b(new com.sankuai.waimai.picasso_loader.a() { // from class: com.sankuai.waimai.launcher.init.mainly.l.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.picasso_loader.a
                public final void a(String str, int i, Throwable th) {
                    String str2;
                    String stringBuffer;
                    Object[] objArr5 = {str, Integer.valueOf(i), th};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9fc08647d817aa9570937a64ef55cd88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9fc08647d817aa9570937a64ef55cd88");
                        return;
                    }
                    Object[] objArr6 = {str, Integer.valueOf(i), th};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.common.util.b.a;
                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "ae679643c1a386cb5c0968f5a1101746", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "ae679643c1a386cb5c0968f5a1101746");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("pic_url", str);
                            jSONObject.put("error_type", i);
                            if (th != null) {
                                Object[] objArr7 = {th};
                                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.common.util.b.a;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "521222fda2b4e5a778f6457e2d33f165", RobustBitConfig.DEFAULT_VALUE)) {
                                    stringBuffer = (String) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "521222fda2b4e5a778f6457e2d33f165");
                                } else {
                                    StringWriter stringWriter = new StringWriter();
                                    th.printStackTrace(new PrintWriter(stringWriter));
                                    stringBuffer = stringWriter.getBuffer().toString();
                                }
                                jSONObject.put(CrashHianalyticsData.STACK_TRACE, stringBuffer);
                            }
                            str2 = jSONObject.toString();
                        } catch (JSONException unused) {
                            str2 = null;
                        }
                        Object[] objArr8 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.page.common.util.b.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "97d9e11a6c052800510195115a8813ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "97d9e11a6c052800510195115a8813ed");
                        } else {
                            com.sankuai.waimai.platform.capacity.log.c.a().a(i == 1 ? IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM : IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, "waimai_picture_native_error", SystemClock.elapsedRealtime());
                        }
                        Object[] objArr9 = {str, Integer.valueOf(i), str2};
                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.page.common.util.b.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "55ab4a6bd73d790f50e27c663de266d2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "55ab4a6bd73d790f50e27c663de266d2");
                        } else {
                            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.page.common.log.a().a("image_library_loaded_failed").b(str + " : " + i).b(true).c(str).d(str2).b());
                        }
                        Object[] objArr10 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.page.common.util.b.a;
                        if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "6dd713e7e4c6e04f35b9d8770c454159", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "6dd713e7e4c6e04f35b9d8770c454159");
                        } else {
                            com.sankuai.waimai.platform.capacity.log.i.a(new com.sankuai.waimai.business.page.common.log.a().a("image_library_loaded_failed").d(str2).c(str).b());
                        }
                    }
                    com.sankuai.waimai.foundation.utils.log.a.a("ImageFailed", str, th);
                }
            }));
            com.sankuai.meituan.mtimageloader.config.a.a(new com.sankuai.waimai.launcher.util.image.e());
            com.bumptech.glide.i.a(false);
            final b bVar = new b(application);
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.l.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2370fc814fc63a7186c00352a291c302", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2370fc814fc63a7186c00352a291c302");
                    } else {
                        bVar.a();
                    }
                }
            });
            Picasso.a((com.squareup.picasso.load.data.c) bVar);
            Picasso.a(new MtPicassoRequestListener() { // from class: com.sankuai.waimai.launcher.init.mainly.l.3
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.MtPicassoRequestListener
                public final void a(Object obj, Object obj2, View view, boolean z, boolean z2) {
                    CharSequence charSequence;
                    Object[] objArr5 = {obj, obj2, view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "801beafd72d051fb929bec967d0f1696", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "801beafd72d051fb929bec967d0f1696");
                    } else if (com.sankuai.meituan.takeoutnew.a.f && (obj instanceof PicassoBitmapDrawable) && (view instanceof ImageView) && obj2 != null && obj2.toString().startsWith("http")) {
                        Bitmap b2 = ((PicassoBitmapDrawable) obj).b();
                        String obj3 = obj2.toString();
                        com.sankuai.waimai.launcher.util.image.c.a(obj3, b2, view, AgentConfigParser.PICASSO_PREFIX);
                        if (view == null || obj3 == null) {
                            return;
                        }
                        if (view.getContentDescription() != null) {
                            charSequence = view.getContentDescription();
                        } else {
                            charSequence = obj3;
                        }
                        view.setContentDescription(charSequence);
                    }
                }
            });
            com.sankuai.meituan.mtimageloader.config.a.b(true);
            Picasso.a(WaimaiLauncherSP.k());
            if (com.sankuai.meituan.takeoutnew.a.f) {
                com.sankuai.waimai.launcher.util.image.a.a();
            }
        }
        Object[] objArr5 = {application};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0274e06a17b4fe2b9f16213194b77275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0274e06a17b4fe2b9f16213194b77275");
        } else if (com.sankuai.meituan.takeoutnew.a.f) {
            com.sankuai.waimai.launcher.util.image.c.b = com.sankuai.waimai.platform.utils.d.b(application, "image_monitor", false);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175629829ff51c9e28333ceecb8300fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175629829ff51c9e28333ceecb8300fb");
        } else if (wmAddress == null || wmAddress.getMeitaunCity() == null || TextUtils.isEmpty(wmAddress.getMeitaunCity().getCityCode())) {
        } else {
            com.meituan.android.httpdns.i.a(this.c, wmAddress.getMeitaunCity().getCityCode());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements com.squareup.picasso.load.data.c {
        public static ChangeQuickRedirect a;
        private Context b;
        private volatile a c;

        public b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa15d55e8b257b688b223a92fb2168fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa15d55e8b257b688b223a92fb2168fe");
            } else {
                this.b = context;
            }
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b42975cc123698e2b9e218c062aab58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b42975cc123698e2b9e218c062aab58");
            } else if (this.c == null) {
                synchronized (this) {
                    if (this.c == null) {
                        this.c = new a(this.b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.squareup.picasso.load.data.b
        public com.squareup.picasso.load.data.a<InputStream> a(com.squareup.picasso.model.d dVar, int i, int i2) {
            Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1abce4f47e39f970dd396d2c6ccc355e", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.squareup.picasso.load.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1abce4f47e39f970dd396d2c6ccc355e");
            }
            a();
            return this.c.a(dVar, i, i2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.squareup.picasso.integration.okhttp.b {
        public static ChangeQuickRedirect a;
        private Context b;

        public a(Context context) {
            super(null);
            com.meituan.android.httpdns.c cVar;
            List<String> copyOnWriteArrayList;
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1622c1a676afa50a986227969b6668", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1622c1a676afa50a986227969b6668");
                return;
            }
            this.b = context;
            com.squareup.okhttp.v vVar = new com.squareup.okhttp.v();
            OkHttp2Wrapper.addInterceptorToClient(vVar);
            com.squareup.okhttp.v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
            final ThreadLocal threadLocal = new ThreadLocal();
            j.a aVar = new j.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dffb8f4f422b786a402c5d2cfb997972", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (com.meituan.android.httpdns.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dffb8f4f422b786a402c5d2cfb997972");
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                copyOnWriteArrayList2.add("img.meituan.net");
                copyOnWriteArrayList2.add("p0.meituan.net");
                copyOnWriteArrayList2.add("p1.meituan.net");
                cVar = new com.meituan.android.httpdns.b(copyOnWriteArrayList2) { // from class: com.sankuai.waimai.launcher.init.mainly.l.a.5
                    public static ChangeQuickRedirect b;

                    @Override // com.meituan.android.httpdns.b, com.meituan.android.httpdns.c
                    public final synchronized boolean a(String str) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81a7ee452417f79db2ba12066ea48385", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81a7ee452417f79db2ba12066ea48385")).booleanValue();
                        }
                        return super.a(str);
                    }
                };
            }
            aVar.d = cVar;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            aVar.b = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc1ad3b5ef60f1492588975aeaca504f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.httpdns.r) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc1ad3b5ef60f1492588975aeaca504f") : new com.meituan.android.httpdns.r() { // from class: com.sankuai.waimai.launcher.init.mainly.l.a.4
                public static ChangeQuickRedirect b;

                @Override // com.meituan.android.httpdns.r
                public final void a(String str) {
                    Object[] objArr4 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = b;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f3add53ca002b0bd58d61f40ba66a9d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f3add53ca002b0bd58d61f40ba66a9d5");
                    } else {
                        l.a(str);
                    }
                }
            };
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a64b91a41ad7d8478dddcbf85d77cb10", RobustBitConfig.DEFAULT_VALUE)) {
                copyOnWriteArrayList = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a64b91a41ad7d8478dddcbf85d77cb10");
            } else {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList.add("img.meituan.net");
                copyOnWriteArrayList.add("p0.meituan.net");
                copyOnWriteArrayList.add("p1.meituan.net");
            }
            aVar.c = copyOnWriteArrayList;
            aVar.e = new DefaultDnsListener() { // from class: com.sankuai.waimai.launcher.init.mainly.l.a.1
                public static ChangeQuickRedirect e;

                @Override // com.meituan.android.httpdns.business.DefaultDnsListener, com.meituan.android.httpdns.IDnsListener
                public final void a(com.meituan.android.httpdns.d dVar) {
                    Map hashMap;
                    Object[] objArr5 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect5 = e;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d1a557c8ebe6a5e84fa9ae7103070ec7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d1a557c8ebe6a5e84fa9ae7103070ec7");
                        return;
                    }
                    super.a(dVar);
                    ThreadLocal threadLocal2 = threadLocal;
                    a aVar2 = a.this;
                    String str = dVar.d;
                    List<InetAddress> list = dVar.e;
                    int i = dVar.f;
                    long j = dVar.g;
                    Object[] objArr6 = {str, list, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect6 = a.a;
                    if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "2262f43e17862a2e27c3fbb1d97fe3d6", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "2262f43e17862a2e27c3fbb1d97fe3d6");
                    } else if (com.meituan.android.httpdns.h.a().a(str)) {
                        hashMap = new HashMap(3, 1.0f);
                        hashMap.put("source", String.valueOf(i));
                        hashMap.put("httpDnsTime", String.valueOf(j));
                        StringBuilder sb = new StringBuilder();
                        if (list != null) {
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                if (i2 != list.size() - 1) {
                                    sb.append(list.get(i2).getHostAddress());
                                    sb.append(CommonConstant.Symbol.COMMA);
                                } else {
                                    sb.append(list.get(i2).getHostAddress());
                                }
                            }
                        }
                        hashMap.put(NetLogConstants.Details.IP_LIST, sb.toString());
                    } else {
                        hashMap = null;
                    }
                    threadLocal2.set(hashMap);
                }
            };
            final com.meituan.android.httpdns.j a3 = aVar.a(context);
            a2.s = new com.squareup.okhttp.o() { // from class: com.sankuai.waimai.launcher.init.mainly.l.a.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.okhttp.o
                public final List<InetAddress> lookup(String str) throws UnknownHostException {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a2a10d4c5c836c796fa50f35d2f550e6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a2a10d4c5c836c796fa50f35d2f550e6") : a3.b(str);
                }
            };
            a2.m = new com.sankuai.waimai.platform.net.interceptor.okhttp.j();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.launcher.util.constants.a.a;
            int intValue = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "dc93cc5b0007d9da12b270e7e292a0e9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "dc93cc5b0007d9da12b270e7e292a0e9")).intValue() : com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) a.EnumC0995a.IMAGE_LOADER_TIMEOUT, 10);
            if (intValue > 0) {
                long j = intValue;
                a2.a(j, TimeUnit.SECONDS);
                a2.b(j, TimeUnit.SECONDS);
            }
            ABStrategy strategy = ABTestManager.getInstance().getStrategy("image_loader_optimize", null);
            if (strategy != null && strategy.expName != null) {
                if (strategy.expName.contains("host") && strategy.getParams() != null && !strategy.getParams().isEmpty()) {
                    a2.g.add(new com.sankuai.waimai.launcher.util.image.b(strategy.getParams()));
                }
                if (strategy.expName.contains("pool")) {
                    int a4 = com.sankuai.waimai.foundation.utils.r.a(strategy.getParamWithKey("idle_count"), -1);
                    int a5 = com.sankuai.waimai.foundation.utils.r.a(strategy.getParamWithKey("keep_duration"), -1);
                    if (a4 > 0 && a5 > 0) {
                        a2.r = new com.squareup.okhttp.k(a4, a5, TimeUnit.SECONDS);
                    }
                }
            }
            a2.g.add(new com.sankuai.waimai.launcher.util.image.d(threadLocal));
            com.meituan.phoenix.b.a("wm_native_image_config").a("wm_native_image_config").c().a(new com.sankuai.waimai.platform.net.phoenix.monitor.a()).a(new com.meituan.phoenix_okhttp.c(a2));
            Picasso g = Picasso.g(context);
            g.h = a2;
            g.i = new Picasso.ExtraHandler() { // from class: com.sankuai.waimai.launcher.init.mainly.l.a.3
            };
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.picasso.integration.okhttp.b, com.squareup.picasso.load.data.b
        public final com.squareup.picasso.load.data.a<InputStream> a(final com.squareup.picasso.model.d dVar, int i, int i2) {
            com.squareup.okhttp.v vVar;
            Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42197562cebb1681428be7345a616615", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.squareup.picasso.load.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42197562cebb1681428be7345a616615");
            }
            Object obj = dVar.c;
            final Picasso g = Picasso.g(this.b);
            if (obj != null && (obj instanceof com.squareup.okhttp.v)) {
                vVar = (com.squareup.okhttp.v) obj;
            } else {
                vVar = (com.squareup.okhttp.v) g.h;
            }
            return new com.squareup.picasso.integration.okhttp.a(vVar, dVar) { // from class: com.sankuai.waimai.launcher.init.mainly.l.a.6
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.integration.okhttp.a, com.squareup.picasso.load.data.a
                /* renamed from: d */
                public final InputStream c() throws Exception {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0acd651fd5e7b0aab854dd054fa77a44", RobustBitConfig.DEFAULT_VALUE)) {
                        return (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0acd651fd5e7b0aab854dd054fa77a44");
                    }
                    if (dVar == null || !Picasso.c(dVar.a())) {
                        return super.c();
                    }
                    return null;
                }
            };
        }
    }
}
