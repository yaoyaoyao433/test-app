package com.sankuai.waimai.irmo.render.engine.gyro;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.layers.GyroEffectParams;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.engine.g;
import com.sankuai.waimai.irmo.render.engine.gyro.a;
import com.sankuai.waimai.irmo.render.f;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.view.IrmoGyroView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.irmo.render.engine.c implements a.InterfaceC0975a {
    public static ChangeQuickRedirect a;
    public boolean b;
    @NonNull
    private final List<IrmoGyroView> c;
    @Nullable
    private b d;
    private long e;

    public c(com.sankuai.waimai.irmo.render.a aVar, i iVar, f fVar) {
        super(aVar, iVar, fVar);
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75729e733859eeb3d6f40ea59ec2d72a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75729e733859eeb3d6f40ea59ec2d72a");
            return;
        }
        this.b = com.sankuai.waimai.irmo.utils.b.a().a(1002, fVar.g);
        this.c = new ArrayList();
        if (this.b) {
            return;
        }
        this.d = new b();
        b bVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2581157db4598655d7cd6ad8394813a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2581157db4598655d7cd6ad8394813a5");
            return;
        }
        bVar.b = Privacy.createSensorManager(com.meituan.android.singleton.b.a, "irmo");
        if (bVar.b != null) {
            bVar.c = bVar.b.getDefaultSensor(4);
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54135e19b360179c77bc4cffc17a3f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54135e19b360179c77bc4cffc17a3f5");
        } else if (this.d != null) {
            this.d.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void a(g gVar) {
        ?? r1;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac9795382ee2d367a38f03cad50fd6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac9795382ee2d367a38f03cad50fd6a");
            return;
        }
        if (this.d != null) {
            this.d.a(this);
        }
        if (gVar != null) {
            r1 = 1;
            for (IrmoGyroView irmoGyroView : this.c) {
                if (irmoGyroView != null) {
                    gVar.a(irmoGyroView.e, irmoGyroView.f);
                    r1 = (r1 == true ? 1 : 0) & (irmoGyroView.f ? 1 : 0);
                }
            }
        } else {
            r1 = 1;
        }
        if (this.k != null) {
            i iVar = this.k;
            int i = r1 != 0 ? 0 : IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM;
            Object[] objArr2 = {1002, Byte.valueOf((byte) r1), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "f53e2fae45474ba186df2ab4dba1b86a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "f53e2fae45474ba186df2ab4dba1b86a");
                return;
            }
            String str = iVar.b;
            String str2 = iVar.c;
            String str3 = iVar.d;
            Object[] objArr3 = {1002, Byte.valueOf((byte) r1), str, str2, str3, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.mach.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e07d23d3078ed623b30f7b7b8788b244", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e07d23d3078ed623b30f7b7b8788b244");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("EffectRenderSuccess", Integer.valueOf(r1 == 0 ? 0 : 1));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("effectType", String.valueOf(1002));
            hashMap2.put("moduleID", str);
            hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, str2);
            hashMap2.put("url", str3);
            hashMap2.put("errorType", String.valueOf(i));
            com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85f10672def64e02a50ee1ace5d55d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85f10672def64e02a50ee1ace5d55d82");
        } else if (this.d != null) {
            this.d.a();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ea785e2aa30ecfb6b81a3957628fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ea785e2aa30ecfb6b81a3957628fdc");
        } else if (this.d != null) {
            this.d.a(this);
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c, com.sankuai.waimai.irmo.render.engine.a
    public final void a(@NonNull IrmoLayerInfo irmoLayerInfo, View view) {
        Object[] objArr = {irmoLayerInfo, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f11bca09917bdb07f67f0ae837a93a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f11bca09917bdb07f67f0ae837a93a");
            return;
        }
        super.a(irmoLayerInfo, view);
        IrmoGyroView irmoGyroView = new IrmoGyroView(com.meituan.android.singleton.b.a);
        irmoGyroView.setCameraDistance(irmoGyroView.getResources().getDisplayMetrics().density * 16000.0f);
        Object[] objArr2 = {irmoLayerInfo};
        ChangeQuickRedirect changeQuickRedirect2 = IrmoGyroView.a;
        if (PatchProxy.isSupport(objArr2, irmoGyroView, changeQuickRedirect2, false, "f387fc6d5675ad20d5c728e2a503b58e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, irmoGyroView, changeQuickRedirect2, false, "f387fc6d5675ad20d5c728e2a503b58e");
        } else {
            irmoGyroView.e = irmoLayerInfo;
            irmoGyroView.d = new IrmoGyroView.a(irmoLayerInfo);
            if (irmoLayerInfo.effectParams instanceof GyroEffectParams) {
                GyroEffectParams gyroEffectParams = (GyroEffectParams) irmoLayerInfo.effectParams;
                irmoGyroView.b = gyroEffectParams.ui < 0.0f ? 16 : ((int) gyroEffectParams.ui) * 1000;
                irmoGyroView.c = gyroEffectParams.effectActionGroup;
            }
        }
        this.c.add(irmoGyroView);
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @MainThread
    public final void a() {
        RequestCreator a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa63efedee0c81464428dbeb5ff134a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa63efedee0c81464428dbeb5ff134a");
            return;
        }
        for (IrmoGyroView irmoGyroView : this.c) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = IrmoGyroView.a;
            if (PatchProxy.isSupport(objArr2, irmoGyroView, changeQuickRedirect2, false, "c9448ec4288ceb279bfc558f44f92421", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, irmoGyroView, changeQuickRedirect2, false, "c9448ec4288ceb279bfc558f44f92421");
            } else if (irmoGyroView.d == null || !irmoGyroView.d.a || TextUtils.isEmpty(irmoGyroView.d.e)) {
                irmoGyroView.f = false;
            } else {
                Context context = com.meituan.android.singleton.b.a;
                if (irmoGyroView.d.b) {
                    a2 = Picasso.g(context).a(Uri.parse(irmoGyroView.d.c));
                } else {
                    a2 = Picasso.g(context).a(irmoGyroView.d.d);
                }
                if (!"png".equalsIgnoreCase(irmoGyroView.d.e)) {
                    if (CommonConstant.File.GIF.equalsIgnoreCase(irmoGyroView.d.e)) {
                        a2.u = true;
                    }
                } else {
                    a2.t = true;
                }
                a2.a(irmoGyroView);
                irmoGyroView.f = true;
            }
        }
        this.e = SystemClock.elapsedRealtime();
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @NonNull
    public final List<View> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a19944112e4ed37f4a0d12c3c0fc8aa", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a19944112e4ed37f4a0d12c3c0fc8aa") : new ArrayList(this.c);
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca21a3e69ca9e2d64965aa57037a7de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca21a3e69ca9e2d64965aa57037a7de");
        } else if (this.d != null) {
            this.d.a(this);
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a03f8c172fa310ef28773e749fb299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a03f8c172fa310ef28773e749fb299");
        } else if (this.d != null) {
            this.d.a();
            j();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8c4dbfa7ee3ed737ebde5682967ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8c4dbfa7ee3ed737ebde5682967ddf");
            return;
        }
        if (this.d != null) {
            this.d.a();
            j();
        }
        if (this.e != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
            if (this.k != null) {
                i iVar = this.k;
                Object[] objArr2 = {1002, new Long(elapsedRealtime)};
                ChangeQuickRedirect changeQuickRedirect2 = i.a;
                if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "e344729437d86e92afe38367d0beba32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "e344729437d86e92afe38367d0beba32");
                    return;
                }
                String str = iVar.b;
                String str2 = iVar.c;
                String str3 = iVar.d;
                Object[] objArr3 = {1002, new Long(elapsedRealtime), str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.mach.c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4a3d1175508a11b0c206378c1dbc290d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4a3d1175508a11b0c206378c1dbc290d");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("EffectDisplayTime", Long.valueOf(elapsedRealtime));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("effectType", String.valueOf(1002));
                hashMap2.put("templateId", str);
                hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, str2);
                hashMap2.put("url", str3);
                com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.gyro.a.InterfaceC0975a
    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6848976601681bba5d19f701c0af2454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6848976601681bba5d19f701c0af2454");
            return;
        }
        for (IrmoGyroView irmoGyroView : this.c) {
            irmoGyroView.a(f, f2);
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1941931110734da3e726da126f8edc74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1941931110734da3e726da126f8edc74");
        } else if (this.d != null) {
            this.d.b();
        }
    }
}
