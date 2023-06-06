package com.sankuai.waimai.platform.machpro.video;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.d;
import com.meituan.android.mtplayer.video.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.tencent.connect.share.QzonePublish;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPVideoComponent extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    private MTVideoPlayerView b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private h p;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2e99bb358e5ba32be26ff3821f6c14", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2e99bb358e5ba32be26ff3821f6c14");
        }
        Context context = this.mMachContext.getContext();
        this.b = new MTVideoPlayerView(context);
        if (context instanceof a) {
            a aVar = (a) context;
            this.p = aVar.b();
            if (this.p != null) {
                this.b.setMultiPlayerManager(this.p);
            }
            this.b.setPlayerType(aVar.d());
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cf262711131f24ab779ef769c9980a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cf262711131f24ab779ef769c9980a1");
        } else {
            this.b.setPlayStateCallback(new d() { // from class: com.sankuai.waimai.platform.machpro.video.MPVideoComponent.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mtplayer.video.callback.d
                public final void a(int i, com.meituan.android.mtplayer.video.error.a aVar2) {
                    Object[] objArr3 = {Integer.valueOf(i), aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c090ca13ebda3feac705327c9096b286", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c090ca13ebda3feac705327c9096b286");
                        return;
                    }
                    switch (i) {
                        case -1:
                            MPVideoComponent.this.a(MPVideoComponent.this.g, aVar2);
                            return;
                        case 0:
                            return;
                        case 1:
                            MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.h);
                            return;
                        case 2:
                            if (TextUtils.isEmpty(MPVideoComponent.this.d)) {
                                return;
                            }
                            MachMap machMap = new MachMap();
                            machMap.put("videoUrlString", MPVideoComponent.this.c);
                            machMap.put(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, Integer.valueOf(MPVideoComponent.this.b.getDuration()));
                            MachArray machArray = new MachArray();
                            machArray.add(machMap);
                            MPVideoComponent.this.dispatchEvent(MPVideoComponent.this.d, machArray);
                            return;
                        case 3:
                            MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.j);
                            if (MPVideoComponent.this.o) {
                                MPVideoComponent.a(MPVideoComponent.this, false);
                                MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.m);
                            }
                            if (MPVideoComponent.this.n) {
                                MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.l);
                            }
                            MPVideoComponent.this.n = false;
                            return;
                        case 4:
                            MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.e);
                            return;
                        case 5:
                        case 6:
                            MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.k);
                            MPVideoComponent.this.n = true;
                            return;
                        case 7:
                            MPVideoComponent.a(MPVideoComponent.this, MPVideoComponent.this.i);
                            return;
                        default:
                            return;
                    }
                }

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i, int i2, int i3) {
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4d088aec740de24dff77fb23c4d1329", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4d088aec740de24dff77fb23c4d1329");
                    } else if (TextUtils.isEmpty(MPVideoComponent.this.f)) {
                    } else {
                        MachMap machMap = new MachMap();
                        machMap.put("currentPlayTime", Integer.valueOf(i));
                        machMap.put(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, Integer.valueOf(i2));
                        machMap.put("videoUrlString", MPVideoComponent.this.c);
                        MachArray machArray = new MachArray();
                        machArray.add(machMap);
                        MPVideoComponent.this.dispatchEvent(MPVideoComponent.this.f, machArray);
                    }
                }
            });
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static /* synthetic */ void a(MPVideoComponent mPVideoComponent, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPVideoComponent, changeQuickRedirect, false, "22da52e23caf65878192cf94da02f49d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPVideoComponent, changeQuickRedirect, false, "22da52e23caf65878192cf94da02f49d");
        } else {
            mPVideoComponent.a(str, (com.meituan.android.mtplayer.video.error.a) null);
        }
    }

    public static /* synthetic */ boolean a(MPVideoComponent mPVideoComponent, boolean z) {
        mPVideoComponent.o = false;
        return false;
    }

    public MPVideoComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7edf88f07d82fc13c47f0c90da30c6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7edf88f07d82fc13c47f0c90da30c6c");
            return;
        }
        this.o = true;
        if (mPContext.getContext() instanceof a) {
            this.p = ((a) mPContext.getContext()).b();
            if (this.p != null) {
                this.b.setMultiPlayerManager(this.p);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r14.equals("displayMode") != false) goto L13;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.platform.machpro.video.MPVideoComponent.a
            java.lang.String r12 = "387039fd21d5b795a396e27a2b159159"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L25
            return
        L25:
            r1 = -1
            int r2 = r14.hashCode()
            switch(r2) {
                case -934531685: goto L58;
                case -810883302: goto L4d;
                case 3363353: goto L42;
                case 1151378164: goto L37;
                case 1714132357: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L63
        L2e:
            java.lang.String r2 = "displayMode"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L63
            goto L64
        L37:
            java.lang.String r0 = "videoUrl"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 0
            goto L64
        L42:
            java.lang.String r0 = "mute"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 4
            goto L64
        L4d:
            java.lang.String r0 = "volume"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 3
            goto L64
        L58:
            java.lang.String r0 = "repeat"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = -1
        L64:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L90;
                case 2: goto L81;
                case 3: goto L77;
                case 4: goto L6b;
                default: goto L67;
            }
        L67:
            super.updateAttribute(r14, r15)
            goto Laf
        L6b:
            boolean r14 = com.sankuai.waimai.machpro.util.b.d(r15)
            r14 = r14 ^ r10
            com.meituan.android.mtplayer.video.MTVideoPlayerView r15 = r13.b
            float r14 = (float) r14
            r15.a(r14, r14)
            return
        L77:
            float r14 = com.sankuai.waimai.machpro.util.b.b(r15)
            com.meituan.android.mtplayer.video.MTVideoPlayerView r15 = r13.b
            r15.a(r14, r14)
            return
        L81:
            int r14 = com.sankuai.waimai.machpro.util.b.c(r15)
            if (r14 < 0) goto Laf
            r15 = 7
            if (r14 > r15) goto Laf
            com.meituan.android.mtplayer.video.MTVideoPlayerView r15 = r13.b
            r15.setDisplayMode(r14)
            return
        L90:
            com.meituan.android.mtplayer.video.MTVideoPlayerView r14 = r13.b
            boolean r15 = com.sankuai.waimai.machpro.util.b.d(r15)
            r14.setLooping(r15)
            return
        L9a:
            java.lang.String r14 = ""
            java.lang.String r14 = com.sankuai.waimai.machpro.util.b.a(r15, r14)
            r13.c = r14
            com.meituan.android.mtplayer.video.MTVideoPlayerView r14 = r13.b
            com.meituan.android.mtplayer.video.VideoPlayerParam r15 = new com.meituan.android.mtplayer.video.VideoPlayerParam
            java.lang.String r0 = r13.c
            r15.<init>(r0)
            r14.setDataSource(r15)
            return
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.video.MPVideoComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r13.equals("videoPaused") != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.machpro.video.MPVideoComponent.a
            java.lang.String r11 = "4abe2dca57b62d5a061e8d230a348da7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L22
            return
        L22:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -2108740717: goto L8f;
                case -1641913779: goto L84;
                case -1546427944: goto L79;
                case -1267953720: goto L6e;
                case -1086137328: goto L63;
                case -694621751: goto L58;
                case -640720077: goto L4d;
                case 189494337: goto L42;
                case 939594121: goto L38;
                case 1375507533: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto L9b
        L2c:
            java.lang.String r0 = "videoFirstFrameRendered"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 9
            goto L9c
        L38:
            java.lang.String r2 = "videoPaused"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L9b
            goto L9c
        L42:
            java.lang.String r0 = "videoLoading"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 7
            goto L9c
        L4d:
            java.lang.String r0 = "videoPlaying"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 6
            goto L9c
        L58:
            java.lang.String r0 = "videoPreparing"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 4
            goto L9c
        L63:
            java.lang.String r0 = "videoCompleted"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 5
            goto L9c
        L6e:
            java.lang.String r0 = "videoProgress"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 2
            goto L9c
        L79:
            java.lang.String r0 = "videoPrepared"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 0
            goto L9c
        L84:
            java.lang.String r0 = "videoError"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 3
            goto L9c
        L8f:
            java.lang.String r0 = "videoLoadFinished"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L9b
            r0 = 8
            goto L9c
        L9b:
            r0 = -1
        L9c:
            switch(r0) {
                case 0: goto Lc1;
                case 1: goto Lbb;
                case 2: goto Lb8;
                case 3: goto Lb5;
                case 4: goto Lb2;
                case 5: goto Laf;
                case 6: goto Lac;
                case 7: goto La9;
                case 8: goto La6;
                case 9: goto La3;
                default: goto L9f;
            }
        L9f:
            super.addEventListener(r13)
            return
        La3:
            r12.m = r13
            return
        La6:
            r12.l = r13
            return
        La9:
            r12.k = r13
            return
        Lac:
            r12.j = r13
            return
        Laf:
            r12.i = r13
            return
        Lb2:
            r12.h = r13
            return
        Lb5:
            r12.g = r13
            return
        Lb8:
            r12.f = r13
            return
        Lbb:
            java.lang.String r13 = "videoPaused"
            r12.e = r13
            return
        Lc1:
            java.lang.String r13 = "videoPrepared"
            r12.d = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.video.MPVideoComponent.addEventListener(java.lang.String):void");
    }

    @JSMethod(methodName = "videoStart")
    @Keep
    public void videoStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821cd71dbab0cc5861fccd3f6140caff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821cd71dbab0cc5861fccd3f6140caff");
        } else if (TextUtils.isEmpty(this.c) || this.b == null || this.b.e()) {
        } else {
            this.b.c();
        }
    }

    @JSMethod(methodName = "videoPrepare")
    @Keep
    public void videoPrepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b90b0cc82d543b184062a6a11df5c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b90b0cc82d543b184062a6a11df5c51");
        } else if (this.b == null || this.b.e()) {
        } else {
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(this.c);
            Context context = this.mMachContext.getContext();
            if (context != null) {
                videoPlayerParam.a(context, "MachProVideoCache");
            }
            this.b.setDataSource(videoPlayerParam);
            this.b.c();
        }
    }

    @JSMethod(methodName = "videoPause")
    @Keep
    public void videoPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2095ea7386b91e7972a2cf486f31b2ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2095ea7386b91e7972a2cf486f31b2ce");
        } else if (this.b == null || !this.b.e()) {
        } else {
            this.b.d();
        }
    }

    @JSMethod(methodName = "videoRelease")
    @Keep
    public void videoRelease() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e551dea483fa4a33897fd4152b93dc78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e551dea483fa4a33897fd4152b93dc78");
        } else if (this.b != null) {
            this.b.g();
        }
    }

    @JSMethod(methodName = "videoReset")
    @Keep
    public void videoReset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2438dd8438fb43374a14577361a2c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2438dd8438fb43374a14577361a2c8a");
        } else if (this.b != null) {
            this.b.f();
        }
    }

    @JSMethod(methodName = "seekTo")
    @Keep
    public void seekTo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8575257c73e886e190b41a577b92a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8575257c73e886e190b41a577b92a81");
        } else if (this.b == null || i < 0) {
        } else {
            this.b.a(i);
        }
    }

    @JSMethod(methodName = "setVolume")
    @Keep
    public void setVolume(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d307c50ff5b5b85f625e3301120b744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d307c50ff5b5b85f625e3301120b744");
        } else if (this.b != null) {
            float f = (float) d;
            this.b.a(f, f);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ad97ed77576557ce15a28b6b41b6cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ad97ed77576557ce15a28b6b41b6cf");
            return;
        }
        super.onDestroy();
        if (this.b != null && this.b.e()) {
            this.b.d();
        }
        this.b.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.meituan.android.mtplayer.video.error.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4f7aeba4f6f9ba5bfeaafc2076a4a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4f7aeba4f6f9ba5bfeaafc2076a4a9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MachArray machArray = new MachArray();
            MachMap machMap = new MachMap();
            machMap.put("videoUrlString", this.c);
            if (aVar != null) {
                machMap.put("errorMsg", "__what" + aVar.a + "_extra" + aVar.b);
            }
            machArray.add(machMap);
            dispatchEvent(str, machArray);
        }
    }
}
