package com.sankuai.waimai.business.ugc.machpro.live;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.live.c;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPLivePlayerComponent extends MPComponent<FrameLayout> implements c.a {
    public static ChangeQuickRedirect a;
    private c b;
    private c.b c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868a17d7fa5db8b1cd1141592ad2a6c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868a17d7fa5db8b1cd1141592ad2a6c2");
        }
        this.b = new c(this.mMachContext.getContext());
        this.c = new c.b();
        return this.b;
    }

    public MPLivePlayerComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131ae5c86327a32c0c4d0c9d1d1b35f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131ae5c86327a32c0c4d0c9d1d1b35f1");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1649bdf2d5e6af95692f54d0bd9813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1649bdf2d5e6af95692f54d0bd9813");
            return;
        }
        super.onAttachToParent();
        if (this.c.g) {
            play();
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a766f81f16753a5a4c394c2a5ff0a86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a766f81f16753a5a4c394c2a5ff0a86f");
            return;
        }
        super.onDestroy();
        stop();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r14.equals(com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager.PARAM_LIVE_ID) != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateAttribute(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.machpro.live.MPLivePlayerComponent.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r13.equals("bindnetstatus") != false) goto L14;
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.ugc.machpro.live.MPLivePlayerComponent.a
            java.lang.String r11 = "87ed2cc7e9d6e3aabe6ba043b503999c"
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
                case -1214146946: goto L69;
                case -493598457: goto L5e;
                case -380753116: goto L54;
                case 860524583: goto L4a;
                case 1364811826: goto L41;
                case 1851001391: goto L36;
                case 1878334578: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L74
        L2b:
            java.lang.String r0 = "playFail"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L74
            r0 = 3
            goto L75
        L36:
            java.lang.String r0 = "playSuccess"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L74
            r0 = 2
            goto L75
        L41:
            java.lang.String r2 = "bindnetstatus"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L74
            goto L75
        L4a:
            java.lang.String r0 = "clicked"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L74
            r0 = 5
            goto L75
        L54:
            java.lang.String r0 = "bindstatechange"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L74
            r0 = 0
            goto L75
        L5e:
            java.lang.String r0 = "playEnd"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L74
            r0 = 4
            goto L75
        L69:
            java.lang.String r0 = "goodsChanged"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L74
            r0 = 6
            goto L75
        L74:
            r0 = -1
        L75:
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L99;
                case 2: goto L93;
                case 3: goto L8d;
                case 4: goto L87;
                case 5: goto L82;
                case 6: goto L7c;
                default: goto L78;
            }
        L78:
            super.addEventListener(r13)
            return
        L7c:
            java.lang.String r13 = "goodsChanged"
            r12.h = r13
            return
        L82:
            java.lang.String r13 = "clicked"
            r12.g = r13
            return
        L87:
            java.lang.String r13 = "playEnd"
            r12.f = r13
            return
        L8d:
            java.lang.String r13 = "playFail"
            r12.e = r13
            return
        L93:
            java.lang.String r13 = "playSuccess"
            r12.d = r13
            return
        L99:
            return
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.machpro.live.MPLivePlayerComponent.addEventListener(java.lang.String):void");
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced98656259b14b9472a6ce9a0dfe232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced98656259b14b9472a6ce9a0dfe232");
        } else {
            a(this.d);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c52ac92d883fa6a9e1b7f9d6f36cdf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c52ac92d883fa6a9e1b7f9d6f36cdf3");
            return;
        }
        a.c("MPLivePlayerComponent", "onPlayFail, code: " + i, new Object[0]);
        MachMap machMap = new MachMap();
        machMap.put("code", Integer.valueOf(i));
        a(this.e, machMap);
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7be3bfd2cf63e326d49b96d8547be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7be3bfd2cf63e326d49b96d8547be5");
        } else {
            a(this.f);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce62cb64fff541504bbc9e978a47dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce62cb64fff541504bbc9e978a47dfe");
        } else {
            a(this.g);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.c.a
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b75274c3d0ac63c1f1bfa26aa46e7391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b75274c3d0ac63c1f1bfa26aa46e7391");
            return;
        }
        a.c("MPLivePlayerComponent", "onGoodsChanged, type: " + i + ", goodsId:" + j, new Object[0]);
        MachMap machMap = new MachMap();
        machMap.put("type", Integer.valueOf(i));
        machMap.put("goodsId", Long.valueOf(j));
        a(this.h, machMap);
    }

    @JSMethod(methodName = "play")
    @Keep
    public void play() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda8c7f670eb445b25ee61be5511c6c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda8c7f670eb445b25ee61be5511c6c7");
        } else if (this.b != null) {
            this.b.a(this.c, this);
        }
    }

    @JSMethod(methodName = "rePlay")
    @Keep
    public void rePlay() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8bc4fa4aabc8d9e05238692db9ada1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8bc4fa4aabc8d9e05238692db9ada1");
        } else if (this.b != null) {
            this.b.a(this.mMachContext.getContext());
        }
    }

    @JSMethod(methodName = "pause")
    @Keep
    public void pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97964db0deda25316f404195caf63c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97964db0deda25316f404195caf63c2");
        } else if (this.b != null) {
            this.b.b();
        }
    }

    @JSMethod(methodName = "resume")
    @Keep
    public void resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0825a17eb3b062671e9f8f096c26aaea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0825a17eb3b062671e9f8f096c26aaea");
        } else if (this.b != null) {
            this.b.c();
        }
    }

    @JSMethod(methodName = "stop")
    @Keep
    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98eda73b6148ae242b4056a62b7ffda7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98eda73b6148ae242b4056a62b7ffda7");
        } else if (this.b != null) {
            this.b.a(this.c);
        }
    }

    @JSMethod(methodName = "mute")
    @Keep
    public void mute(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc80c1d7c14f577ccda3a7d01fefd601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc80c1d7c14f577ccda3a7d01fefd601");
        } else if (this.b != null) {
            this.b.a(z);
        }
    }

    @JSMethod(methodName = "shareAchieve")
    @Keep
    public void shareAchieve() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733cbfa0b3dc64990b8f3b89159ad9fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733cbfa0b3dc64990b8f3b89159ad9fa");
        } else if (this.b != null) {
            this.b.b(this.c, this);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "281028c1ec1a9e0a0a7825923998249e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "281028c1ec1a9e0a0a7825923998249e");
        } else {
            a(str, (MachMap) null);
        }
    }

    private void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad7e2ae8c11efb2c387603da2036731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad7e2ae8c11efb2c387603da2036731");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MachArray machArray = new MachArray();
            if (machMap != null) {
                machArray.add(machMap);
            }
            dispatchEvent(str, machArray);
        }
    }
}
