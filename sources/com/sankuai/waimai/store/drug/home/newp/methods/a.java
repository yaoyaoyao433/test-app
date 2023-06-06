package com.sankuai.waimai.store.drug.home.newp.methods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mach.event.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.im.entrance.mach.b b;

    public a(com.sankuai.waimai.store.im.entrance.mach.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c98fd45018f901be90136c82a7bdc477", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c98fd45018f901be90136c82a7bdc477");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "930b78752fb63f4c3a6bf3d18cd74c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "930b78752fb63f4c3a6bf3d18cd74c3f");
        } else if (this.b != null) {
            if ("click_drug_im_entrance".equals(str)) {
                this.b.a(0, 0L, "");
            } else if ("query_drug_im_msg_number".equals(str)) {
                this.b.b();
            }
        }
    }
}
