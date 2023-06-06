package com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.PoiCloseNotification;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072a60eff87fbacb127cb61918e017d1", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072a60eff87fbacb127cb61918e017d1") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "871b2e997d66b7817c58823d9dafa313", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "871b2e997d66b7817c58823d9dafa313") : new b(m());
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66ad5526315aae8a3dc2ba45f152dca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66ad5526315aae8a3dc2ba45f152dca");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e73691dfdd8edcc291f3276d2a02d724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e73691dfdd8edcc291f3276d2a02d724");
        } else {
            super.s();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4bdda9d70b3bc54a20bcb4f6afca4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4bdda9d70b3bc54a20bcb4f6afca4b");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "59937bca500deca2adf3ef38e1d8bee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "59937bca500deca2adf3ef38e1d8bee2");
            return;
        }
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.d;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d8559760b60f29aea4def7c18ef4a838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d8559760b60f29aea4def7c18ef4a838");
            return;
        }
        if (cVar.a != null) {
            Object[] objArr4 = {cVar};
            ChangeQuickRedirect changeQuickRedirect4 = b.d;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "49bcaf708c09fdd6e8cac5aea51396e4", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "49bcaf708c09fdd6e8cac5aea51396e4")).booleanValue();
            } else {
                z = cVar != null && cVar.c == 1;
            }
            if (z && !TextUtils.isEmpty(cVar.a.b)) {
                bVar.a(cVar);
                return;
            }
        }
        PoiCloseNotification poiCloseNotification = cVar.b;
        boolean z2 = poiCloseNotification != null && poiCloseNotification.isVisible() && poiCloseNotification.getRemainTime() >= 0;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b.d;
        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "b928009b635375b0fdc55d6b5b43accf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "b928009b635375b0fdc55d6b5b43accf");
        } else if (bVar.h != null) {
            bVar.h.cancel();
            bVar.h = null;
        }
        if (z2) {
            bVar.g.setVisibility(0);
            if (poiCloseNotification.getRemainTime() == 0) {
                bVar.f.setText("");
                bVar.e.setText(R.string.wm_order_confirm_close_txt);
                return;
            }
            bVar.e.setText(R.string.wm_cross_order_confirm_time_to_close_txt);
            bVar.f.setVisibility(0);
            bVar.f.setText(String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(poiCloseNotification.getRemainTime() / 60), Integer.valueOf(poiCloseNotification.getRemainTime() % 60)));
            bVar.h = new com.sankuai.waimai.platform.utils.time.a(1000 * poiCloseNotification.getRemainTime(), 1000L) { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.time.a
                public final void a(long j) {
                    Object[] objArr6 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "43a42c0f141c7e58f1db673568151d7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "43a42c0f141c7e58f1db673568151d7a");
                        return;
                    }
                    long j2 = j / 1000;
                    b.this.f.setVisibility(0);
                    b.this.f.setText(String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
                }

                @Override // com.sankuai.waimai.platform.utils.time.a
                public final void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f15dc80c138cb84f0a65869024bcc023", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f15dc80c138cb84f0a65869024bcc023");
                        return;
                    }
                    b.this.f.setText("");
                    b.this.e.setText(R.string.wm_order_confirm_close_txt);
                }
            }.b();
        } else if (cVar.a != null && !TextUtils.isEmpty(cVar.a.b)) {
            bVar.b(cVar);
        } else {
            bVar.g.setVisibility(8);
        }
    }
}
