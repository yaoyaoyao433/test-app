package com.sankuai.meituan.mapsdk.mapcore.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.StandardCharsets;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements com.sankuai.meituan.mapfoundation.starship.d {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
        if (r2 == (-1)) goto L49;
     */
    @Override // com.sankuai.meituan.mapfoundation.starship.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.meituan.mapfoundation.starship.b a(com.sankuai.meituan.mapfoundation.starship.d.a r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.mapcore.net.d.a(com.sankuai.meituan.mapfoundation.starship.d$a):com.sankuai.meituan.mapfoundation.starship.b");
    }

    private int a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "179026f69925f20a1af50130596b9606", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "179026f69925f20a1af50130596b9606")).intValue();
        }
        if (map == null || map.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(map.get(str));
        }
        return sb.toString().getBytes(StandardCharsets.UTF_8).length;
    }
}
