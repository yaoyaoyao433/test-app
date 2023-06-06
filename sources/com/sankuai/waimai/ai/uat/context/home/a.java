package com.sankuai.waimai.ai.uat.context.home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.ai.uat.context.a {
    public static ChangeQuickRedirect f;

    @Override // com.sankuai.waimai.ai.uat.context.a
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a5ece7735200b4178fca864fd8fd2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a5ece7735200b4178fca864fd8fd2a");
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2044208974) {
            if (hashCode == 910634771 && str.equals("POI_CLICK_KEY")) {
                c = 0;
            }
        } else if (str.equals("UPDATE_RANK_TRACE_ID_KEY")) {
            c = 1;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "def78e21b57626f55c70c9d88ca90f15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "def78e21b57626f55c70c9d88ca90f15");
                    return;
                } else if (obj instanceof String) {
                    C0685a.a().c = (String) obj;
                    C0685a a = C0685a.a();
                    long currentTimeMillis = System.currentTimeMillis();
                    Object[] objArr3 = {new Long(currentTimeMillis)};
                    ChangeQuickRedirect changeQuickRedirect3 = C0685a.a;
                    if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "0b98878f101b30f2dcdd5ffdd7805af9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "0b98878f101b30f2dcdd5ffdd7805af9");
                        return;
                    } else {
                        a.d = currentTimeMillis;
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                Object[] objArr4 = {obj};
                ChangeQuickRedirect changeQuickRedirect4 = f;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "028d92b01298724966645911730e06aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "028d92b01298724966645911730e06aa");
                    return;
                } else if (obj instanceof String) {
                    C0685a.a().b = (String) obj;
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ai.uat.context.home.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0685a {
        public static ChangeQuickRedirect a;
        private static volatile C0685a e;
        public String b;
        public String c;
        public long d;

        public static C0685a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6c44d60dfbef63fe43a71cb4a9efe17", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0685a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6c44d60dfbef63fe43a71cb4a9efe17");
            }
            if (e == null) {
                synchronized (C0685a.class) {
                    if (e == null) {
                        e = new C0685a();
                    }
                }
            }
            return e;
        }
    }
}
