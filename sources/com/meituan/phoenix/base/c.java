package com.meituan.phoenix.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements com.meituan.phoenix.base_interface.a {
    public static ChangeQuickRedirect a;
    private static final List b = new ArrayList<Integer>() { // from class: com.meituan.phoenix.base.c.1
        {
            add(-510);
            add(-551);
            add(-552);
            add(-553);
            add(-554);
            add(-555);
            add(-608);
            add(-503);
            add(-500);
            add(-501);
            add(500);
            add(Integer.valueOf((int) TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE));
            add(Integer.valueOf((int) TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_SUCCESS));
        }
    };

    @Override // com.meituan.phoenix.base_interface.a
    public final boolean a(int i, List<String> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640b5c9e62d25722013ab912b1ff5b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640b5c9e62d25722013ab912b1ff5b5f")).booleanValue();
        }
        boolean contains = b.contains(Integer.valueOf(i));
        if (contains || list == null || list.isEmpty()) {
            return contains;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return list.contains(sb.toString());
    }
}
