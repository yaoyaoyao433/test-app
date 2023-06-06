package com.dianping.live.live.livefloat;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import com.alipay.sdk.app.PayTask;
import com.dianping.live.live.mrn.MLivePusherView;
import com.dianping.live.live.mrn.d;
import com.dianping.live.live.mrn.h;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.util.j;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.recce.props.gens.AutoFocus;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean d = false;
    b b;
    MLiveFloatPlayerService c;
    private WindowManager e;
    private MLiveFloatPlayerModel f;

    public a(@NonNull MLiveFloatPlayerService mLiveFloatPlayerService, @NonNull MLiveFloatPlayerModel mLiveFloatPlayerModel) {
        Object[] objArr = {mLiveFloatPlayerService, mLiveFloatPlayerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd59e506a01461cbae02438dfbaee10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd59e506a01461cbae02438dfbaee10");
            return;
        }
        this.c = mLiveFloatPlayerService;
        this.f = mLiveFloatPlayerModel;
    }

    public final void a(Context context) {
        boolean z;
        boolean z2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9df313a4b9c4ea9d3c36465807452e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9df313a4b9c4ea9d3c36465807452e");
            return;
        }
        WindowManager b = b(context);
        if (this.b == null) {
            this.b = new b(context, this);
            int a2 = j.a(context);
            int b2 = j.b(context);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else if (Build.VERSION.SDK_INT <= 24 && Build.VERSION.SDK_INT >= 19) {
                layoutParams.type = 2005;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.format = 1;
            layoutParams.flags = 16777384;
            layoutParams.gravity = 8388659;
            layoutParams.width = b.d;
            layoutParams.height = b.e;
            layoutParams.x = a2 - j.a(context, 105.0f);
            layoutParams.y = b2 - j.a(context, 242.0f);
            this.b.setParams(layoutParams);
            this.b.a(this.f, layoutParams);
            try {
                b.addView(this.b, layoutParams);
                final b bVar = this.b;
                MLiveFloatPlayerModel mLiveFloatPlayerModel = this.f;
                Object[] objArr2 = {mLiveFloatPlayerModel};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c59ae14c08cd97ade5180d356d75eee8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c59ae14c08cd97ade5180d356d75eee8");
                } else {
                    bVar.b = mLiveFloatPlayerModel.d;
                    Object[] objArr3 = {mLiveFloatPlayerModel};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "613fc41ae270fff3b4ace49ba11088d9", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "613fc41ae270fff3b4ace49ba11088d9")).booleanValue();
                    } else {
                        HashMap hashMap = mLiveFloatPlayerModel.b;
                        z = (hashMap == null || hashMap.get(RaptorUploaderImpl.SRC) == null || hashMap.get("playType") == null) ? false : true;
                    }
                    bVar.n = z;
                    Object[] objArr4 = {mLiveFloatPlayerModel};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "dfe25eddb48548100b1dfd4188c1953e", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "dfe25eddb48548100b1dfd4188c1953e")).booleanValue();
                    } else {
                        HashMap hashMap2 = mLiveFloatPlayerModel.c;
                        bVar.x = hashMap2;
                        z2 = (hashMap2 == null || hashMap2.get(RaptorUploaderImpl.SRC) == null) ? false : true;
                    }
                    bVar.u = z2;
                    if (bVar.n || bVar.u) {
                        Object[] objArr5 = {mLiveFloatPlayerModel};
                        ChangeQuickRedirect changeQuickRedirect5 = b.a;
                        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "41a2eac34f7b0c1aeb0732d0ab344c40", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "41a2eac34f7b0c1aeb0732d0ab344c40");
                        } else {
                            HashMap hashMap3 = mLiveFloatPlayerModel.b;
                            if (hashMap3 != null && hashMap3.get(RaptorUploaderImpl.SRC) != null && hashMap3.get("playType") != null) {
                                if (hashMap3.get("liveId") != null) {
                                    bVar.r = hashMap3.get("liveId").toString();
                                }
                                if (hashMap3.get("sessionId") != null) {
                                    bVar.s = hashMap3.get("sessionId").toString();
                                }
                                if (hashMap3.get("roomId") != null) {
                                    bVar.t = hashMap3.get("roomId").toString();
                                }
                                bVar.p = hashMap3.get(RaptorUploaderImpl.SRC).toString();
                                bVar.q = Double.valueOf(hashMap3.get("playType").toString()).intValue();
                                if (bVar.f == null) {
                                    if (mLiveFloatPlayerModel.c.get(RaptorUploaderImpl.SRC) != null && !TextUtils.isEmpty(mLiveFloatPlayerModel.c.get(RaptorUploaderImpl.SRC).toString())) {
                                        bVar.f = new d(bVar.getContext());
                                    }
                                    bVar.f = com.dianping.live.playerManager.a.a(bVar.getContext()).a(bVar.getContext(), bVar.p);
                                }
                                if (bVar.g == null) {
                                    bVar.g = new com.sankuai.meituan.mtlive.player.library.d();
                                }
                                if (hashMap3.get(JsBridgeResult.ARG_KEY_LOCATION_MODE) != null) {
                                    bVar.l.a(bVar.g, hashMap3.get(JsBridgeResult.ARG_KEY_LOCATION_MODE).toString());
                                }
                                if (hashMap3.get("muted") != null) {
                                    bVar.l.a(bVar.f, Boolean.parseBoolean(hashMap3.get("muted").toString()));
                                }
                                if (hashMap3.get(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION) != null) {
                                    bVar.l.a(bVar.f, hashMap3.get(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION).toString());
                                }
                                if (hashMap3.get("objectFit") != null) {
                                    bVar.l.b(bVar.f, hashMap3.get("objectFit").toString());
                                }
                                if (hashMap3.get("minCache") != null) {
                                    bVar.l.a(bVar.g, Double.valueOf(hashMap3.get("minCache").toString()).intValue());
                                }
                                if (hashMap3.get("maxCache") != null) {
                                    bVar.l.b(bVar.g, Double.valueOf(hashMap3.get("maxCache").toString()).intValue());
                                }
                                if (hashMap3.get("enableAEC") != null) {
                                    bVar.l.a(bVar.g, Boolean.parseBoolean(hashMap3.get("enableAEC").toString()));
                                }
                                bVar.o = false;
                                if (hashMap3.get("autoplay") != null) {
                                    bVar.o = Boolean.parseBoolean(hashMap3.get("autoplay").toString());
                                }
                                if (bVar.h == null) {
                                    bVar.h = new com.sankuai.meituan.mtlive.player.library.b() { // from class: com.dianping.live.live.livefloat.b.3
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.meituan.mtlive.player.library.b
                                        public final void a(int i, Bundle bundle) {
                                            Object[] objArr6 = {Integer.valueOf(i), bundle};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "78a4a7c345ed14a97cdae656896b8ded", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "78a4a7c345ed14a97cdae656896b8ded");
                                                return;
                                            }
                                            if (i == 2001 || i == 2002) {
                                                Log.e("MLive_Logan: Float ", "拉流成功");
                                            } else if (i == 2103) {
                                                Log.e("MLive_Logan: Float ", "网络断连, 已启动自动重连");
                                            } else if (i == -2301) {
                                                Log.e("MLive_Logan: Float ", "网络断连，且经多次重连抢救无效，更多重试请自行重启播放");
                                                bVar.ab = true;
                                                if (bVar.W) {
                                                    new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.livefloat.b.3.1
                                                        public static ChangeQuickRedirect a;

                                                        {
                                                            AnonymousClass3.this = this;
                                                        }

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Object[] objArr7 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a04281c150bb9830444ceadfe85a2164", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a04281c150bb9830444ceadfe85a2164");
                                                            } else if (bVar.W && bVar.ab) {
                                                                com.dianping.live.live.utils.j.a("MLive_Logan: Player RECONNECT 准备自动重启拉流");
                                                                b.j(bVar);
                                                                bVar.b();
                                                                bVar.ab = false;
                                                            }
                                                        }
                                                    }, PayTask.j);
                                                }
                                            } else if (i == 2004) {
                                                Log.e("MLive_Logan: Float ", "视频播放开始");
                                                bVar.ac.setVisibility(4);
                                            } else if (i == 2006) {
                                                Log.e("MLive_Logan: Float ", "视频播放结束");
                                            } else if (i == 2009) {
                                                Log.e("MLive_Logan: Float ", "获取视频流分辨率成功");
                                                Object obj = bundle.get("EVT_PARAM1");
                                                int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                                                Object obj2 = bundle.get("EVT_PARAM2");
                                                int intValue2 = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                                                if (intValue != 0 && intValue2 != 0 && (intValue * 9) / 16 >= intValue2) {
                                                    bVar.f.a(1);
                                                }
                                            } else if (i == 2003) {
                                                Log.e("MLive_Logan: Float ", "渲染首个视频数据包（IDR）");
                                                bVar.ac.setVisibility(4);
                                            } else if (i == 2104) {
                                                Log.e("MLive_Logan: Float ", "视频流不太稳定，可能是观看者当前网速不充裕");
                                                bVar.ac.setText("网络状态不佳");
                                                bVar.ac.setVisibility(0);
                                            }
                                            com.dianping.live.live.utils.j.a("MLive_Logan: Float Player Code " + i);
                                            b.a(bVar, i);
                                            b bVar2 = bVar;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(i);
                                            bVar2.a(sb.toString());
                                        }

                                        @Override // com.sankuai.meituan.mtlive.player.library.b
                                        public final void a(Bundle bundle) {
                                            Object[] objArr6 = {bundle};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5fe40d1df9281a69de03861294ea0cac", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5fe40d1df9281a69de03861294ea0cac");
                                                return;
                                            }
                                            Log.e("MLive_Logan: Float ", "onNetStatus: " + bundle);
                                        }
                                    };
                                }
                                bVar.b();
                            }
                        }
                        Object[] objArr6 = {mLiveFloatPlayerModel};
                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "566cc1397866b9b2358f6a3dbd861dce", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "566cc1397866b9b2358f6a3dbd861dce");
                        } else {
                            HashMap hashMap4 = mLiveFloatPlayerModel.c;
                            if (hashMap4 != null && hashMap4.get(RaptorUploaderImpl.SRC) != null) {
                                if (bVar.i == null) {
                                    bVar.i = h.a(bVar.getContext().getApplicationContext());
                                }
                                if (bVar.j == null) {
                                    bVar.j = com.sankuai.meituan.mtlive.pusher.library.h.a(141374);
                                }
                                bVar.w = hashMap4.get(RaptorUploaderImpl.SRC).toString();
                                if (hashMap4.get("adjustBitrate") != null) {
                                    bVar.m.setAdjustBitrate(Boolean.parseBoolean(hashMap4.get("adjustBitrate").toString()));
                                }
                                if (hashMap4.get(JsBridgeResult.ARG_KEY_LOCATION_MODE) != null) {
                                    bVar.m.a(bVar.i, bVar.j, hashMap4.get(JsBridgeResult.ARG_KEY_LOCATION_MODE).toString());
                                }
                                if (hashMap4.get("muted") != null) {
                                    bVar.m.a(bVar.i, Boolean.parseBoolean(hashMap4.get("muted").toString()));
                                }
                                if (hashMap4.get("enableCamera") != null) {
                                    bVar.m.a(bVar.i, Boolean.parseBoolean(hashMap4.get("enableCamera").toString()), (MLivePusherView) null);
                                }
                                if (hashMap4.get(AutoFocus.LOWER_CASE_NAME) != null) {
                                    bVar.m.a(bVar.j, Boolean.parseBoolean(hashMap4.get(AutoFocus.LOWER_CASE_NAME).toString()));
                                }
                                if (hashMap4.get(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION) != null) {
                                    bVar.m.a(bVar.j, bVar.i, hashMap4.get(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION).toString());
                                }
                                if (hashMap4.get("zoom") != null) {
                                    bVar.m.b(bVar.i, Boolean.parseBoolean(hashMap4.get("zoom").toString()));
                                }
                                if (hashMap4.get("minBitrate") != null) {
                                    bVar.m.a(bVar.j, Double.valueOf(hashMap4.get("minBitrate").toString()).intValue());
                                }
                                if (hashMap4.get("maxBitrate") != null) {
                                    bVar.m.b(bVar.j, Double.valueOf(hashMap4.get("maxBitrate").toString()).intValue());
                                }
                                if (hashMap4.get("audioQuality") != null) {
                                    bVar.m.a(bVar.j, hashMap4.get("audioQuality").toString());
                                }
                                if (hashMap4.get("waitingImage") != null) {
                                    bVar.m.b(bVar.j, hashMap4.get("waitingImage").toString());
                                }
                                if (hashMap4.get("pauseTime") != null) {
                                    bVar.m.c(bVar.j, Double.valueOf(hashMap4.get("pauseTime").toString()).intValue());
                                }
                                if (hashMap4.get("pauseFps") != null) {
                                    bVar.m.d(bVar.j, Double.valueOf(hashMap4.get("pauseFps").toString()).intValue());
                                }
                                if (hashMap4.get("backgroundMute") != null) {
                                    bVar.m.b(bVar.j, Boolean.parseBoolean(hashMap4.get("backgroundMute").toString()));
                                }
                                if (hashMap4.get("mirror") != null) {
                                    bVar.m.c(bVar.i, Boolean.parseBoolean(hashMap4.get("mirror").toString()));
                                }
                                if (hashMap4.get("enableMic") != null) {
                                    bVar.m.d(bVar.i, Boolean.parseBoolean(hashMap4.get("enableMic").toString()));
                                }
                                if (hashMap4.get("beauty") != null) {
                                    bVar.m.a(bVar.i, Double.valueOf(hashMap4.get("beauty").toString()).intValue());
                                }
                                if (hashMap4.get("whiteness") != null) {
                                    bVar.m.b(bVar.i, Double.valueOf(hashMap4.get("whiteness").toString()).intValue());
                                }
                                if (hashMap4.get("enableNearestIP") != null) {
                                    bVar.m.c(bVar.j, Boolean.parseBoolean(hashMap4.get("enableNearestIP").toString()));
                                }
                                if (hashMap4.get("bitrate") != null) {
                                    bVar.m.e(bVar.j, Double.valueOf(hashMap4.get("bitrate").toString()).intValue());
                                }
                                if (hashMap4.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS) != null) {
                                    bVar.m.f(bVar.j, Double.valueOf(hashMap4.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS).toString()).intValue());
                                }
                                if (hashMap4.get("enableAEC") != null) {
                                    bVar.m.d(bVar.j, Boolean.parseBoolean(hashMap4.get("enableAEC").toString()));
                                }
                                bVar.v = false;
                                if (hashMap4.get("autopush") != null) {
                                    bVar.v = Boolean.parseBoolean(hashMap4.get("autopush").toString());
                                }
                                if (bVar.k == null) {
                                    bVar.k = new com.sankuai.meituan.mtlive.pusher.library.c() { // from class: com.dianping.live.live.livefloat.b.4
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.meituan.mtlive.pusher.library.c
                                        public final void a(int i, Bundle bundle) {
                                            Object[] objArr7 = {Integer.valueOf(i), bundle};
                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "71344fd8014c4612d71905027d209245", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "71344fd8014c4612d71905027d209245");
                                                return;
                                            }
                                            if (i == 1002) {
                                                Log.e("MLive_Logan", "推流成功");
                                            } else if (i == 1003) {
                                                Log.e("MLive_Logan", "打开摄像头成功");
                                            } else if (i == -1301) {
                                                Log.e("MLive_Logan", "打开摄像头失败");
                                            } else if (i == -1302) {
                                                Log.e("MLive_Logan", "打开麦克风失败");
                                            } else if (i == -1307) {
                                                Log.e("MLive_Logan", "网络断连，且经多次重连抢救无效，更多重试请自行重启推流");
                                                bVar.aa = true;
                                            } else if (i == 1102) {
                                                Log.e("MLive_Logan", "网络断连, 已启动自动重连");
                                            } else if (i == 1101) {
                                                Log.e("MLive_Logan", "上行网速不够用");
                                                bVar.ac.setText("网络状态不佳");
                                                bVar.ac.setVisibility(0);
                                            }
                                            com.dianping.live.live.utils.j.a("MLive_Logan: Float Pusher Code " + i);
                                            bVar.m.a(b.class, i);
                                            b bVar2 = bVar;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(i);
                                            bVar2.a(sb.toString());
                                        }

                                        @Override // com.sankuai.meituan.mtlive.pusher.library.c
                                        public final void a(Bundle bundle) {
                                            Object[] objArr7 = {bundle};
                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1e6442b1cd498d5db9d151fe3e4ad95f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1e6442b1cd498d5db9d151fe3e4ad95f");
                                                return;
                                            }
                                            Log.e("MLive_Logan", "onNetStatus: " + bundle);
                                            com.dianping.live.live.utils.j.a("MLive_Logan: Float Pusher NetStatus " + bVar.m.a(bundle));
                                            bVar.af.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_FPS, Integer.valueOf(bundle.getInt("VIDEO_FPS")));
                                            bVar.af.put(Constants.CPU, bundle.getString("CPU_USAGE") == null ? "" : bundle.getString("CPU_USAGE"));
                                            Map map = bVar.af;
                                            map.put(APKStructure.Res_Type, bundle.getInt("VIDEO_WIDTH") + "*" + bundle.getInt("VIDEO_HEIGHT"));
                                            bVar.af.put("spd", Integer.valueOf(bundle.getInt("NET_SPEED")));
                                            bVar.af.put("ara", Integer.valueOf(bundle.getInt("AUDIO_BITRATE")));
                                            bVar.af.put("vra", Integer.valueOf(bundle.getInt("VIDEO_BITRATE")));
                                            bVar.af.put("gop", Integer.valueOf(bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP)));
                                            Map map2 = bVar.af;
                                            map2.put("que", bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE));
                                            Map map3 = bVar.af;
                                            map3.put("drp", bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP));
                                            bVar.a("1999");
                                        }
                                    };
                                }
                                bVar.c();
                            }
                        }
                    }
                }
                d = true;
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ac89e99221a76e450c28ca9f09ac0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ac89e99221a76e450c28ca9f09ac0f");
            return;
        }
        b(context, z);
        this.c.stopSelf();
    }

    public final void b(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c15f1b641fcd20922f781cdb81e2588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c15f1b641fcd20922f781cdb81e2588");
        } else if (this.b == null || this.b.getParent() == null) {
        } else {
            this.b.a(z);
            this.b.a();
            b(context).removeView(this.b);
            this.b = null;
            d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowManager b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71816728d9f02b4d478c14392946202d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WindowManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71816728d9f02b4d478c14392946202d");
        }
        if (this.e == null) {
            this.e = (WindowManager) context.getSystemService("window");
        }
        return this.e;
    }
}
