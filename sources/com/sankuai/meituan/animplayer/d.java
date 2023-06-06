package com.sankuai.meituan.animplayer;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final Context b;
    String c;
    String d;
    String e;
    int f;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e481827c6894acc9b3aa8d34fd02cc73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e481827c6894acc9b3aa8d34fd02cc73");
            return;
        }
        this.f = 0;
        this.b = context.getApplicationContext();
        this.c = com.sankuai.meituan.mtliveqos.utils.d.a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.sankuai.meituan.mtliveqos.statistic.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca64a70a29d951159b39fc6f7df139af", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca64a70a29d951159b39fc6f7df139af");
        }
        com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
        bVar.d = c.f.ANIM_PLAYER;
        bVar.e = c.g.ANIM_PLAYER;
        bVar.p = System.currentTimeMillis();
        bVar.i = this.d;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5466f9593b1dffac52be4b25b67bef7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5466f9593b1dffac52be4b25b67bef7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_ANIM_RES_ID", this.e);
        hashMap.put("MTLIVE_ANIM_PLAYER_PAGE", this.c);
        return hashMap;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c817ec427809953e2d68242fe493b0c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c817ec427809953e2d68242fe493b0c7");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_ANIM_PLAY_FAILED_COUNT", Float.valueOf(1.0f));
        Map<String, String> b = b();
        b.put("MTLIVE_ANIM_ERROR_TYPE", str);
        b.put("MTLIVE_ANIM_ERROR_DESC", str2);
        com.sankuai.meituan.mtliveqos.a.a(this.b, a(), hashMap, b);
    }

    public final void a(float f, float f2, float f3, int[] iArr) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "953b7ed058353a9bead1d924c9e702bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "953b7ed058353a9bead1d924c9e702bc");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_ANIM_VIDEO_COMPLETE", Float.valueOf(iArr != null ? 1.0f : 0.0f));
        hashMap.put("MTLIVE_ANIM_DECODING_FPS", Float.valueOf(f));
        hashMap.put("MTLIVE_ANIM_DRAW_FPS", Float.valueOf(f2));
        if (iArr != null) {
            hashMap.put("MTLIVE_ANIM_SAMPLING_DURATION", Float.valueOf(f3));
        }
        Map<String, String> b = b();
        if (iArr != null) {
            b.put("MTLIVE_ANIM_SAMPLING_DATA", Arrays.toString(iArr));
        }
        com.sankuai.meituan.mtliveqos.a.a(this.b, a(), hashMap, b);
    }
}
