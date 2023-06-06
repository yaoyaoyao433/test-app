package com.sankuai.waimai.ad;

import android.graphics.Rect;
import android.util.Pair;
import com.meituan.android.cube.pga.common.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public EnumC0675b a;
        public com.sankuai.waimai.mach.node.a b;
        public int c;
        public int d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public static final String a = new String("waimai");
        public String b;
        public String c;
        public String d;
        public Map<String, Object> e;
        public Rect f;
        public boolean g = true;
        public com.sankuai.waimai.mach.b h;
        public com.meituan.android.cube.pga.common.a<a, Map<String, Object>> i;
        public com.meituan.android.cube.pga.common.a<Pair<com.sankuai.waimai.mach.node.a, RocksServerModel>, Boolean> j;
        public com.meituan.android.cube.pga.common.b<Boolean> k;
        public g<Boolean> l;
        public String m;
        public int n;
        public int o;
        public com.meituan.android.cube.pga.common.a<com.sankuai.waimai.mach.node.a, List<String>> p;
    }

    c at_();

    com.meituan.android.cube.pga.common.b<Integer> au_();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ad.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0675b {
        INITIAL,
        ATTACH_RENDER_NODE,
        TRIGGER_EXPOSE,
        TRIGGER_CLICK;
        
        public static ChangeQuickRedirect a;

        EnumC0675b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a12b9eb749df038cb04096f3620e6cd6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a12b9eb749df038cb04096f3620e6cd6");
            }
        }

        public static EnumC0675b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c9e347f4fae9aad758870a0605a95fa", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0675b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c9e347f4fae9aad758870a0605a95fa") : (EnumC0675b) Enum.valueOf(EnumC0675b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0675b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26613bd9798828a4d4ccabd37aeec37d", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0675b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26613bd9798828a4d4ccabd37aeec37d") : (EnumC0675b[]) values().clone();
        }
    }
}
