package com.sankuai.waimai.ugc.creator.ability.videofilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final List<com.sankuai.waimai.ugc.creator.entity.inner.c> b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dce665e67e555c0098cb9cf2448c185", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dce665e67e555c0098cb9cf2448c185");
            return;
        }
        this.b = new ArrayList();
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("R0", "原片", "", 0.0f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A3", "可口", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A3-lut.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A14", "蜜桃", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A14-lut.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A6", "浓郁", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/dp_lut_e.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A4", "闪亮", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A4-lut.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A15", "白皙", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A9-lut.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A8", "轻柔", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/f-P7-Dfilter18.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A11", "仲夏", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A11-lut.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A12", "假日", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A12-lut.png", 0.8f));
        this.b.add(new com.sankuai.waimai.ugc.creator.entity.inner.c("A13", "纯净", "https://s3plus.meituan.net/v1/mss_79a48a0ea5284286a2b609be3d94267e/ugc-config/ugc/picture/filter/A13-lut.png", 0.8f));
    }
}
