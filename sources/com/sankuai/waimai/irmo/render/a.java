package com.sankuai.waimai.irmo.render;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface a {
    void a(@NonNull EnumC0973a enumC0973a, @Nullable Map<String, Object> map);

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.render.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0973a {
        effect_start,
        effect_cancel,
        effect_finished,
        effect_failed,
        effect_stop;
        
        public static ChangeQuickRedirect a;

        EnumC0973a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5826a4b3e9b97444816aa881eadcf6e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5826a4b3e9b97444816aa881eadcf6e5");
            }
        }

        public static EnumC0973a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c2b34b969af99dcdfb010eef025d4e6", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0973a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c2b34b969af99dcdfb010eef025d4e6") : (EnumC0973a) Enum.valueOf(EnumC0973a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0973a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d3a30cade0b20ee9e6ac0c64f458ed9", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0973a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d3a30cade0b20ee9e6ac0c64f458ed9") : (EnumC0973a[]) values().clone();
        }
    }
}
