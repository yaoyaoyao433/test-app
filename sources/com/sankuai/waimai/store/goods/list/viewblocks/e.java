package com.sankuai.waimai.store.goods.list.viewblocks;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.goods.list.base.d implements com.sankuai.waimai.store.goods.subscribe.c {
    public static ChangeQuickRedirect c;
    public boolean d;

    public static /* synthetic */ void a(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "4084d2b43f228c0edae2a07a43ef6386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "4084d2b43f228c0edae2a07a43ef6386");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a d = eVar.a.d();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", d.d());
        com.sankuai.waimai.store.manager.judas.b.b(eVar.a.b(), "b_waimai_sg_kh3hl2ta_mv").b(hashMap).a(AppUtil.generatePageInfoKey(eVar.mContext)).a();
    }

    public e(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dfa0d8dfd4e204b874dc78b26c328d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dfa0d8dfd4e204b874dc78b26c328d5");
            return;
        }
        this.d = false;
        com.sankuai.waimai.store.goods.subscribe.a.a().a(this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ac88868d71b052fb4a744a6e463110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ac88868d71b052fb4a744a6e463110");
        } else {
            com.sankuai.waimai.store.goods.subscribe.a.a().b(this);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a284faeaacb4265da4fa1d9253fb0b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a284faeaacb4265da4fa1d9253fb0b8");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a d = this.a.d();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", d.d());
        hashMap.put("button_code", Integer.valueOf(i));
        com.sankuai.waimai.store.manager.judas.b.a(this.a.b(), "b_waimai_sg_ch6yut46_mc").b(hashMap).a(AppUtil.generatePageInfoKey(this.mContext)).a();
    }

    @Override // com.sankuai.waimai.store.goods.subscribe.c
    public final void a(long j, String str, long j2, long j3, int i) {
        this.d = true;
    }
}
